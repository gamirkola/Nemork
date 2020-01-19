/* =============================================================================
 *                      GENERATED FILE - DO NOT MODIFY
 * =============================================================================
 * Copyright (c) 2016 Microsoft. All rights reserved.
 * 
 */
package com.skype;
import android.support.v4.util.SparseArrayCompat;
import java.util.Set;
import java.util.HashSet;
import java.lang.ref.ReferenceQueue;
import com.skype.NativeStringConvert;

import com.skype.Term;

public class TermImpl extends MetatagImpl implements Term {
	public TermImpl() {
		this(SkypeFactory.getInstance() );
	}

	public TermImpl(ObjectInterfaceFactory factory) {
		super(factory,factory.createTerm());
	}

	public TermImpl(int key, Term.CONDITION cond, long value) {
		this(SkypeFactory.getInstance() , key, cond, value);
	}

	public TermImpl(ObjectInterfaceFactory factory, int key, Term.CONDITION cond, long value) {
		super(factory,factory.createTerm(key, cond, value));
	}

	public TermImpl(int key, Term.CONDITION cond, byte[] value) {
		this(SkypeFactory.getInstance() , key, cond, value);
	}

	public TermImpl(ObjectInterfaceFactory factory, int key, Term.CONDITION cond, byte[] value) {
		super(factory,factory.createTerm(key, cond, value));
	}

	public TermImpl(int key, Term.CONDITION cond, String value) {
		this(SkypeFactory.getInstance() , key, cond, value);
	}

	public TermImpl(ObjectInterfaceFactory factory, int key, Term.CONDITION cond, String value) {
		super(factory,factory.createTerm(key, cond, value));
	}

	static class TermWeakRef extends NativeWeakRef<ShutdownDestructible> {
		private ObjectInterfaceFactory factory;
		TermWeakRef(ObjectInterfaceFactory factory, ShutdownDestructible ref, ReferenceQueue<ShutdownDestructible> queue, long nativeObject) {
			super(ref, queue, nativeObject);
			this.factory = factory;
		}
		public void destroyNativeObject() {
			factory.destroyTerm(nativeObject);
		}
	}

	public NativeWeakRef<ShutdownDestructible> createNativeWeakRef(ObjectInterfaceFactory factory, ReferenceQueue<ShutdownDestructible> queue) {
		return new TermWeakRef(factory, this, queue, m_nativeObject);
	}

}

