package com.swmansion.rnscreens;

import kotlin.enums.EnumEntries;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ScreenFragment$ScreenLifecycleEvent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ScreenFragment$ScreenLifecycleEvent[] $VALUES;
    public static final ScreenFragment$ScreenLifecycleEvent DID_APPEAR = new ScreenFragment$ScreenLifecycleEvent("DID_APPEAR", 0);
    public static final ScreenFragment$ScreenLifecycleEvent WILL_APPEAR = new ScreenFragment$ScreenLifecycleEvent("WILL_APPEAR", 1);
    public static final ScreenFragment$ScreenLifecycleEvent DID_DISAPPEAR = new ScreenFragment$ScreenLifecycleEvent("DID_DISAPPEAR", 2);
    public static final ScreenFragment$ScreenLifecycleEvent WILL_DISAPPEAR = new ScreenFragment$ScreenLifecycleEvent("WILL_DISAPPEAR", 3);

    private static final /* synthetic */ ScreenFragment$ScreenLifecycleEvent[] $values() {
        return new ScreenFragment$ScreenLifecycleEvent[]{DID_APPEAR, WILL_APPEAR, DID_DISAPPEAR, WILL_DISAPPEAR};
    }

    public static EnumEntries<ScreenFragment$ScreenLifecycleEvent> getEntries() {
        return $ENTRIES;
    }

    public static ScreenFragment$ScreenLifecycleEvent valueOf(String str) {
        return (ScreenFragment$ScreenLifecycleEvent) Enum.valueOf(ScreenFragment$ScreenLifecycleEvent.class, str);
    }

    public static ScreenFragment$ScreenLifecycleEvent[] values() {
        return (ScreenFragment$ScreenLifecycleEvent[]) $VALUES.clone();
    }

    private ScreenFragment$ScreenLifecycleEvent(String str, int i) {
    }

    static {
        ScreenFragment$ScreenLifecycleEvent[] screenFragment$ScreenLifecycleEventArr$values = $values();
        $VALUES = screenFragment$ScreenLifecycleEventArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(screenFragment$ScreenLifecycleEventArr$values);
    }
}
