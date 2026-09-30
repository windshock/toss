package com.swmansion.rnscreens.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class HeaderAttachedEvent extends Event<HeaderAttachedEvent> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String EVENT_NAME = "topAttached";

    public short getCoalescingKey() {
        return (short) 0;
    }

    public HeaderAttachedEvent(int i, int i2) {
        super(i, i2);
    }

    public String getEventName() {
        return EVENT_NAME;
    }

    public WritableMap getEventData() {
        return Arguments.createMap();
    }
}
