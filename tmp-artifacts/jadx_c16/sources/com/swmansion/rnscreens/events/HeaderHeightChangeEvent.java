package com.swmansion.rnscreens.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class HeaderHeightChangeEvent extends Event<HeaderHeightChangeEvent> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String EVENT_NAME = "topHeaderHeightChange";
    private final double headerHeightInDp;

    public HeaderHeightChangeEvent(int i, int i2, double d) {
        super(i, i2);
        this.headerHeightInDp = d;
    }

    public String getEventName() {
        return EVENT_NAME;
    }

    public short getCoalescingKey() {
        return (short) this.headerHeightInDp;
    }

    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("headerHeight", this.headerHeightInDp);
        return writableMapCreateMap;
    }
}
