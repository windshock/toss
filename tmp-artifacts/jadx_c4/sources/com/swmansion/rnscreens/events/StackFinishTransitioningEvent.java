package com.swmansion.rnscreens.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class StackFinishTransitioningEvent extends Event<StackFinishTransitioningEvent> {
    public static final Companion Companion = new Companion(null);
    public static final String EVENT_NAME = "topFinishTransitioning";

    public short getCoalescingKey() {
        return (short) 0;
    }

    public StackFinishTransitioningEvent(int i, int i2) {
        super(i, i2);
    }

    public String getEventName() {
        return EVENT_NAME;
    }

    public WritableMap getEventData() {
        return Arguments.createMap();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
