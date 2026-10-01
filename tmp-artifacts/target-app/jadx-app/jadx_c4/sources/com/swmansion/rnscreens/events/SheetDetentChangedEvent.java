package com.swmansion.rnscreens.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SheetDetentChangedEvent extends Event<SheetDetentChangedEvent> {
    public static final Companion Companion = new Companion(null);
    public static final String EVENT_NAME = "topSheetDetentChanged";
    private final int index;
    private final boolean isStable;

    public short getCoalescingKey() {
        return (short) 0;
    }

    public SheetDetentChangedEvent(int i, int i2, int i3, boolean z) {
        super(i, i2);
        this.index = i3;
        this.isStable = z;
    }

    public final int getIndex() {
        return this.index;
    }

    public final boolean isStable() {
        return this.isStable;
    }

    public String getEventName() {
        return EVENT_NAME;
    }

    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("index", this.index);
        writableMapCreateMap.putBoolean("isStable", this.isStable);
        return writableMapCreateMap;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
