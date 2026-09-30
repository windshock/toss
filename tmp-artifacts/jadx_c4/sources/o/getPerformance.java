package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getPerformance {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getPerformance[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    public static final getPerformance QUIZ = new getPerformance("QUIZ", 0);
    public static final getPerformance MISSION = new getPerformance("MISSION", 1);

    private static final /* synthetic */ getPerformance[] $values() {
        getPerformance[] getperformanceArr;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 75;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            getperformanceArr = new getPerformance[]{MISSION, QUIZ};
        } else {
            getperformanceArr = new getPerformance[]{QUIZ, MISSION};
        }
        int i4 = i2 + 9;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return getperformanceArr;
    }

    public static EnumEntries<getPerformance> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<getPerformance> enumEntries = $ENTRIES;
        int i5 = i2 + 17;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static getPerformance valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        getPerformance getperformance = (getPerformance) Enum.valueOf(getPerformance.class, str);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 25;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return getperformance;
        }
        throw null;
    }

    public static getPerformance[] values() {
        getPerformance[] getperformanceArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            getperformanceArr = (getPerformance[]) $VALUES.clone();
            int i3 = 78 / 0;
        } else {
            getperformanceArr = (getPerformance[]) $VALUES.clone();
        }
        int i4 = onWarmupCompleted + 97;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return getperformanceArr;
    }

    private getPerformance(String str, int i) {
    }

    static {
        getPerformance[] getperformanceArr$values = $values();
        $VALUES = getperformanceArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getperformanceArr$values);
        int i = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
