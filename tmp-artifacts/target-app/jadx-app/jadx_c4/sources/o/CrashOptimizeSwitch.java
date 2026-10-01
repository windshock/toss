package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CrashOptimizeSwitch {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CrashOptimizeSwitch[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final CrashOptimizeSwitch CREDIT_HOME = new CrashOptimizeSwitch("CREDIT_HOME", 0);
    public static final CrashOptimizeSwitch CREDIT_QUIZ = new CrashOptimizeSwitch("CREDIT_QUIZ", 1);
    public static final CrashOptimizeSwitch SCORE_RAISE_HOME = new CrashOptimizeSwitch("SCORE_RAISE_HOME", 2);
    public static final CrashOptimizeSwitch SCORE_REPORT = new CrashOptimizeSwitch("SCORE_REPORT", 3);
    public static final CrashOptimizeSwitch CLICK_NICE_SCORE = new CrashOptimizeSwitch("CLICK_NICE_SCORE", 4);
    public static final CrashOptimizeSwitch NICE_CREDIT_PLUS = new CrashOptimizeSwitch("NICE_CREDIT_PLUS", 5);
    public static final CrashOptimizeSwitch NICE_CREDIT_PLUS_GIFT = new CrashOptimizeSwitch("NICE_CREDIT_PLUS_GIFT", 6);

    private static final /* synthetic */ CrashOptimizeSwitch[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        CrashOptimizeSwitch[] crashOptimizeSwitchArr = {CREDIT_HOME, CREDIT_QUIZ, SCORE_RAISE_HOME, SCORE_REPORT, CLICK_NICE_SCORE, NICE_CREDIT_PLUS, NICE_CREDIT_PLUS_GIFT};
        int i5 = i3 + 111;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return crashOptimizeSwitchArr;
    }

    public static EnumEntries<CrashOptimizeSwitch> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<CrashOptimizeSwitch> enumEntries = $ENTRIES;
        int i5 = i3 + 47;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static CrashOptimizeSwitch valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        CrashOptimizeSwitch crashOptimizeSwitch = (CrashOptimizeSwitch) Enum.valueOf(CrashOptimizeSwitch.class, str);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return crashOptimizeSwitch;
        }
        obj.hashCode();
        throw null;
    }

    public static CrashOptimizeSwitch[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        CrashOptimizeSwitch[] crashOptimizeSwitchArr = (CrashOptimizeSwitch[]) $VALUES.clone();
        int i3 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 47 / 0;
        }
        return crashOptimizeSwitchArr;
    }

    private CrashOptimizeSwitch(String str, int i) {
    }

    static {
        CrashOptimizeSwitch[] crashOptimizeSwitchArr$values = $values();
        $VALUES = crashOptimizeSwitchArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(crashOptimizeSwitchArr$values);
        int i = onNavigationEvent + 51;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}
