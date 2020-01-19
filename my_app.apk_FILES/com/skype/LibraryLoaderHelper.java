/*
 * Copyright (c) 2014 Skype. All rights reserved.
 * Copyright 2014 The Chromium Authors. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be
 *found in the LICENSE file.
 */

package com.skype;

import android.content.Context;
import android.os.Build;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * The unpacks libraries from the apk and loads them.
 */
public class LibraryLoaderHelper {
	private final String TAG = "LibraryLoaderHelper";

	private final String LIB_DIR = "lib";
	private final Context context;
	private final String[] allLibraries;
	/**
	 * One-way switch becomes true if native libraries were unpacked
	 * from APK.
	 */
	private boolean sLibrariesWereUnpacked = false;

	/**
	 * Collection of all libraries that have been loaded.
	 */
	Map<String, Boolean>loadedLibraries;
	private final ExecutorService executorService;
	private Future<?> loadTask;

	public LibraryLoaderHelper(Context context, final String[] libraries) {
		this.context = context;
		this.allLibraries = libraries;
		loadedLibraries = new HashMap<String, Boolean>(libraries.length){{
			for (String library : allLibraries) {
				put(library, false);
			}
		}};
		executorService = Executors.newSingleThreadExecutor();
	}

	/**
	 * Loads native libraries and skip the library in system
	 * lib path. this method is not Thread safe.
	 *
	 */
	public void loadAllNativeLibraries() {
		if (this.loadTask==null) {
			this.loadTask = executorService.submit(new Runnable() {
				@Override
				public void run() {
					if (!unpackLibrariesOnce(context, allLibraries)) {
						return;
					}
					// Although tryLoadLibrary might be called multiple times,
					// libraries should only be unpacked once, this is guaranteed by
					// sLibrariesWereUnpacked.
					for (String eachLibrary : allLibraries) {
						if (!tryLoadLibrary(context, eachLibrary)) {
							return;
						} else {
							loadedLibraries.put(eachLibrary, true);
						}
					}
					synchronized (LibraryLoaderHelper.this) {
						LibraryLoaderHelper.this.notifyAll();
					}
				}
			});
		}
		return;
	}

	public boolean loadNativeLibrary(String library) {
		//If we don't know about this library return false
		if(!loadedLibraries.containsKey(library)) {
			return false;
		}else if(!tryLoadLibrary(context, library) && loadTask==null){ //if we haven't tried loading yet
			loadAllNativeLibraries();
		}
		//if we know about it and have already loaded it return true
		if(loadedLibraries.get(library)) {
			return true;
		}
		try {
			loadTask.get();
		} catch (InterruptedException e) {
			return false;
		} catch (ExecutionException e) {
			return false;
		}
		return loadedLibraries.get(library);
	}

	public void cleanup(String libraryName) {
		File libFile = getLibFile(context, libraryName);
		if (!libFile.exists()) {
			libFile.delete();
		}
	}

	boolean tryLoadLibrary(Context context, String library) {
		assert context != null;
		File libFile = getLibFile(context, library);
		if (!libFile.exists()) {
			return false;
		}
		try {
			System.load(libFile.getAbsolutePath());
			loadedLibraries.put(library, true);
			return true;
		} catch (UnsatisfiedLinkError e) {
			return false;
		}
	}

	/**
	 * Returns the directory for holding extracted native libraries.
	 * It may create the directory if it doesn't exist.
	 *
	 * @param context
	 * @return the directory file object
	 */
	public File getLibDir(Context context) {
		return context.getDir(LIB_DIR, Context.MODE_PRIVATE);
	}

	private File getLibFile(Context context, String library) {
		String libName = System.mapLibraryName(library);
		return new File(getLibDir(context), libName);
	}

	/**
	 * Unpack native libraries from the APK file. The method is supposed to
	 * be called only once. It deletes existing files in unpacked directory
	 * before unpacking.
	 *
	 * @param context
	 * @param libraries
	 * @return true when unpacking was successful, false when failed or called
	 * more than once.
	 */
	private boolean unpackLibrariesOnce(Context context, String[] libraries) {
		if (sLibrariesWereUnpacked) {
			return false;
		}
		sLibrariesWereUnpacked = true;

		File libDir = getLibDir(context);
		deleteDirectorySync(libDir);

		final String sourceDir = context.getApplicationInfo().sourceDir;
		ZipFile zipFile;
		try {
			zipFile = new ZipFile(new File(sourceDir), ZipFile.OPEN_READ);
		} catch (IOException e) {
			Log.e(TAG, "Failed to unpack native libraries", e);
			deleteDirectorySync(libDir);
			return false;
		}

		boolean success = true;
		for (String libName : libraries) {
			if (!extractLib(context, libDir, zipFile, libName)) {
				success = false;
				break;
			}
		}
		try {
			zipFile.close();
		} catch (IOException e) {
			Log.e(TAG, "Failed to close archive " + zipFile, e);
			deleteDirectorySync(libDir);
			return false;
		}
		return true;
	}

	private boolean extractLib(Context context, File libDir, ZipFile zipFile, String libName) {
		String jniNameInApk = "lib/" + Build.CPU_ABI2 + "/" + System.mapLibraryName(libName);

		final ZipEntry entry = zipFile.getEntry(jniNameInApk);
		if (entry == null) {
			Log.e(TAG, zipFile.getName() + " doesn't have file " + jniNameInApk);
			deleteDirectorySync(libDir);
			return false;
		}

		File outputFile = getLibFile(context, libName);
		Log.i(TAG, "Extracting native libraries into " + outputFile.getAbsolutePath());

		assert !outputFile.exists();

		try {
			if (!outputFile.createNewFile()) {
				throw new IOException("Could not create output file for " + outputFile);
			}

			copyToOutputStream(zipFile.getInputStream(entry), new FileOutputStream(outputFile));
		} catch (IOException e) {
			if (outputFile.exists()) {
				if (!outputFile.delete()) {
					Log.e(TAG, "Failed to delete " + outputFile.getAbsolutePath());
				}
			}
			return false;
		}
		// Change permission to rwxr-xr-x
		setFileReadableExecutableAndOwnerOnlyWritable(outputFile);
		return true;
	}

	private void setFileReadableExecutableAndOwnerOnlyWritable(File outputFile) {
		// Change permission to rwxr-xr-x
		outputFile.setReadable(true, false);
		outputFile.setExecutable(true, false);
		outputFile.setWritable(true);
	}

	private void copyToOutputStream(InputStream inputStream, FileOutputStream outputStream) throws IOException {
		try {
			int count = 0;
			byte[] buffer = new byte[16 * 1024];
			while ((count = inputStream.read(buffer)) > 0) {
				outputStream.write(buffer, 0, count);
			}
		} finally {
			try {
				if (inputStream != null) inputStream.close();
			} finally {
				if (outputStream != null) outputStream.close();
			}
		}
	}

	/**
	 * Delete old library files in the backup directory.
	 * The actual deletion is done in a background thread.
	 *
	 * @param context
	 */
	void deleteWorkaroundLibrariesAsynchronously(final Context context) {
		// Child process should not reach here.
		new Thread() {
			@Override public void run() {
				deleteWorkaroundLibrariesSynchronously(context);
			}
		}.start();
	}

	/**
	 * Delete the old libraries and directory.
	 *
	 * @param context
	 */
	public void deleteWorkaroundLibrariesSynchronously(Context context) {
		File libDir = getLibDir(context);
		deleteDirectorySync(libDir);
	}


	private void deleteDirectorySync(File dir) {
		try {
			File[] files = dir.listFiles();
			if (files != null) {
				for (File file : files) {
					String fileName = file.getName();
					if (!file.delete()) {
						Log.e(TAG, "Failed to remove " + file.getAbsolutePath());
					}
				}
			}
			if (!dir.delete()) {
				Log.w(TAG, "Failed to remove " + dir.getAbsolutePath());

			}
			return;
		} catch (Exception e) {
			Log.e(TAG, "Failed to remove old libs, ", e);
		}
	}
}
