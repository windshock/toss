package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setAdViewTracker {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ setAdViewTracker[] $VALUES;
    public static final onNavigationEvent Companion;
    public static final setAdViewTracker Completed = new setAdViewTracker("Completed", 0, "completed");
    public static final setAdViewTracker Failed = new setAdViewTracker("Failed", 1, "failed");
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String value;

    private static final /* synthetic */ setAdViewTracker[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        setAdViewTracker setadviewtracker = Completed;
        if (i3 != 0) {
            return new setAdViewTracker[]{setadviewtracker, Failed};
        }
        setAdViewTracker setadviewtracker2 = Failed;
        setAdViewTracker[] setadviewtrackerArr = new setAdViewTracker[5];
        setadviewtrackerArr[1] = setadviewtracker;
        setadviewtrackerArr[1] = setadviewtracker2;
        return setadviewtrackerArr;
    }

    public static EnumEntries<setAdViewTracker> getEntries() {
        EnumEntries<setAdViewTracker> enumEntries;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            enumEntries = $ENTRIES;
            int i4 = 23 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i3 + 101;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
        return enumEntries;
    }

    public static setAdViewTracker valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setAdViewTracker setadviewtracker = (setAdViewTracker) Enum.valueOf(setAdViewTracker.class, str);
        int i4 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return setadviewtracker;
        }
        throw null;
    }

    public static setAdViewTracker[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setAdViewTracker[] setadviewtrackerArr = (setAdViewTracker[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return setadviewtrackerArr;
    }

    private setAdViewTracker(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.value;
        }
        throw null;
    }

    static {
        setAdViewTracker[] setadviewtrackerArr$values = $values();
        $VALUES = setadviewtrackerArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(setadviewtrackerArr$values);
        Companion = new onNavigationEvent(null);
        int i = IAuthTabCallback + 105;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
