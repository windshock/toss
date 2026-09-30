package im.toss.features.main.ui;

import kotlin.enums.EnumEntries;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
final class MainActivity$onNavigationEvent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MainActivity$onNavigationEvent[] $VALUES;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final MainActivity$onNavigationEvent UPDATE = new MainActivity$onNavigationEvent("UPDATE", 0);
    public static final MainActivity$onNavigationEvent SKIP_UPDATE = new MainActivity$onNavigationEvent("SKIP_UPDATE", 1);
    public static final MainActivity$onNavigationEvent DISMISS = new MainActivity$onNavigationEvent("DISMISS", 2);
    public static final MainActivity$onNavigationEvent NOT_SHOWN = new MainActivity$onNavigationEvent("NOT_SHOWN", 3);

    private static final /* synthetic */ MainActivity$onNavigationEvent[] $values() {
        MainActivity$onNavigationEvent[] mainActivity$onNavigationEventArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 9;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            MainActivity$onNavigationEvent mainActivity$onNavigationEvent = UPDATE;
            MainActivity$onNavigationEvent mainActivity$onNavigationEvent2 = SKIP_UPDATE;
            MainActivity$onNavigationEvent mainActivity$onNavigationEvent3 = DISMISS;
            MainActivity$onNavigationEvent mainActivity$onNavigationEvent4 = NOT_SHOWN;
            mainActivity$onNavigationEventArr = new MainActivity$onNavigationEvent[2];
            mainActivity$onNavigationEventArr[1] = mainActivity$onNavigationEvent;
            mainActivity$onNavigationEventArr[1] = mainActivity$onNavigationEvent2;
            mainActivity$onNavigationEventArr[4] = mainActivity$onNavigationEvent3;
            mainActivity$onNavigationEventArr[2] = mainActivity$onNavigationEvent4;
        } else {
            mainActivity$onNavigationEventArr = new MainActivity$onNavigationEvent[]{UPDATE, SKIP_UPDATE, DISMISS, NOT_SHOWN};
        }
        int i4 = i2 + 39;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return mainActivity$onNavigationEventArr;
    }

    public static EnumEntries<MainActivity$onNavigationEvent> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        EnumEntries<MainActivity$onNavigationEvent> enumEntries = $ENTRIES;
        int i5 = i3 + 105;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
        return enumEntries;
    }

    public static MainActivity$onNavigationEvent valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        MainActivity$onNavigationEvent mainActivity$onNavigationEvent = (MainActivity$onNavigationEvent) Enum.valueOf(MainActivity$onNavigationEvent.class, str);
        int i4 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return mainActivity$onNavigationEvent;
    }

    public static MainActivity$onNavigationEvent[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MainActivity$onNavigationEvent[] mainActivity$onNavigationEventArr = (MainActivity$onNavigationEvent[]) $VALUES.clone();
        int i3 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return mainActivity$onNavigationEventArr;
    }

    private MainActivity$onNavigationEvent(String str, int i) {
    }

    static {
        MainActivity$onNavigationEvent[] mainActivity$onNavigationEventArr$values = $values();
        $VALUES = mainActivity$onNavigationEventArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(mainActivity$onNavigationEventArr$values);
        int i = onNavigationEvent + 71;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
