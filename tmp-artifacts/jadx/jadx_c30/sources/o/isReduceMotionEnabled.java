package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class isReduceMotionEnabled {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ isReduceMotionEnabled[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final isReduceMotionEnabled RESIDENCE_REGISTRATION_CARD = new isReduceMotionEnabled("RESIDENCE_REGISTRATION_CARD", 0);
    public static final isReduceMotionEnabled FOREIGNER_REGISTRATION_CARD = new isReduceMotionEnabled("FOREIGNER_REGISTRATION_CARD", 1);
    public static final isReduceMotionEnabled DRIVER_LICENSE = new isReduceMotionEnabled("DRIVER_LICENSE", 2);
    public static final isReduceMotionEnabled KCB_CERTIFICATION_API = new isReduceMotionEnabled("KCB_CERTIFICATION_API", 3);

    private static final /* synthetic */ isReduceMotionEnabled[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        isReduceMotionEnabled[] isreducemotionenabledArr = {RESIDENCE_REGISTRATION_CARD, FOREIGNER_REGISTRATION_CARD, DRIVER_LICENSE, KCB_CERTIFICATION_API};
        int i5 = i2 + 67;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return isreducemotionenabledArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<isReduceMotionEnabled> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 63;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        EnumEntries<isReduceMotionEnabled> enumEntries = $ENTRIES;
        int i4 = i2 + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static isReduceMotionEnabled valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        isReduceMotionEnabled isreducemotionenabled = (isReduceMotionEnabled) Enum.valueOf(isReduceMotionEnabled.class, str);
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        return isreducemotionenabled;
    }

    public static isReduceMotionEnabled[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        isReduceMotionEnabled[] isreducemotionenabledArr = $VALUES;
        if (i3 == 0) {
            return (isReduceMotionEnabled[]) isreducemotionenabledArr.clone();
        }
        int i4 = 52 / 0;
        return (isReduceMotionEnabled[]) isreducemotionenabledArr.clone();
    }

    private isReduceMotionEnabled(String str, int i) {
    }

    static {
        isReduceMotionEnabled[] isreducemotionenabledArr$values = $values();
        $VALUES = isreducemotionenabledArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(isreducemotionenabledArr$values);
        int i = onExtraCallback + 29;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 33 / 0;
        }
    }
}
