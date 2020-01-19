/*
 * Copyright (c) 2015 Microsoft. All rights reserved.
 */

package com.skype.android.event;

/**
 * Shared EventBus instance for the entire application.
 */
public class EventBusInstance {

	private static final EventBus eventBus = new EventBus();

	private EventBusInstance() {
	}

	public static EventBus get() {
		return eventBus;
	}
}
