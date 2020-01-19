package com.skype;

import android.content.Context;
import com.skype.NativeStringConvert;
import com.skype.rt.Spl;

public class Utility {
	public static void initialize(Context context, String tempPath, String appDataPath) {
		initialize(context, null, tempPath, appDataPath);
	}

	/**
	 * We are using internal builds so we have to enable deadlockMonitor manually
	 **/
	public static native void enableDeadlockMonitor();

	public static void initialize(Context context, String skyLibVersion, String tempPath, String appDataPath) {
		try {
			System.loadLibrary("gnustl_shared");
		} catch (UnsatisfiedLinkError e) {}
		try {
			System.loadLibrary("skypert");
		} catch (UnsatisfiedLinkError e) {}
		if(skyLibVersion==null) {
			System.loadLibrary("SkyLib");
		} else {
			tryToLoadLibrary(context, "SkyLib-Version-" + skyLibVersion.replaceAll("\\.", "-"));
		}
		initializeManuallyLoadedLibrary(context, tempPath, appDataPath);
	}

	public static native void initMedia();

	private static void tryToLoadLibrary(Context context, String libraryName) {
		final LibraryLoaderHelper helper = new LibraryLoaderHelper(context, new String[] { libraryName });
		try {
			System.loadLibrary(libraryName);
			helper.cleanup(libraryName);
		} catch (UnsatisfiedLinkError e) {
			unpackAndLoadLibrary(helper, libraryName);
		}
	}

	private static void unpackAndLoadLibrary(final LibraryLoaderHelper helper, String libraryName) {
		if (!helper.loadNativeLibrary(libraryName)) {
			throw new RuntimeException("Cannot dynamically load " + libraryName);
		}
	}

	public static void initializeManuallyLoadedLibrary(Context context, String tempPath, String appDataPath) {
		Spl.setContext(context.getApplicationContext());
		initializeEnums();
		initRootTools(context, NativeStringConvert.ConvertToNativeBytes(tempPath), NativeStringConvert.ConvertToNativeBytes(appDataPath));
	}

	private static native void initializeEnums();
	private static native void initRootTools(Context context, byte[] tempPath, byte[] appDataPath);
};

