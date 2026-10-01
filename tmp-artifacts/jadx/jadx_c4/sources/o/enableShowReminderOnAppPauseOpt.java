package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableShowReminderOnAppPauseOpt {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ enableShowReminderOnAppPauseOpt[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String param;
    public static final enableShowReminderOnAppPauseOpt LOAN = new enableShowReminderOnAppPauseOpt("LOAN", 0, "loan");
    public static final enableShowReminderOnAppPauseOpt CREDIT_MAIN = new enableShowReminderOnAppPauseOpt("CREDIT_MAIN", 1, "credit_main");

    private static final /* synthetic */ enableShowReminderOnAppPauseOpt[] $values() {
        enableShowReminderOnAppPauseOpt[] enableshowreminderonapppauseoptArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            enableShowReminderOnAppPauseOpt enableshowreminderonapppauseopt = LOAN;
            enableShowReminderOnAppPauseOpt enableshowreminderonapppauseopt2 = CREDIT_MAIN;
            enableshowreminderonapppauseoptArr = new enableShowReminderOnAppPauseOpt[5];
            enableshowreminderonapppauseoptArr[1] = enableshowreminderonapppauseopt;
            enableshowreminderonapppauseoptArr[0] = enableshowreminderonapppauseopt2;
        } else {
            enableshowreminderonapppauseoptArr = new enableShowReminderOnAppPauseOpt[]{LOAN, CREDIT_MAIN};
        }
        int i4 = i3 + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return enableshowreminderonapppauseoptArr;
    }

    public static EnumEntries<enableShowReminderOnAppPauseOpt> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        EnumEntries<enableShowReminderOnAppPauseOpt> enumEntries = $ENTRIES;
        int i5 = i3 + 105;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static enableShowReminderOnAppPauseOpt valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        enableShowReminderOnAppPauseOpt enableshowreminderonapppauseopt = (enableShowReminderOnAppPauseOpt) Enum.valueOf(enableShowReminderOnAppPauseOpt.class, str);
        if (i3 == 0) {
            return enableshowreminderonapppauseopt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static enableShowReminderOnAppPauseOpt[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        enableShowReminderOnAppPauseOpt[] enableshowreminderonapppauseoptArr = (enableShowReminderOnAppPauseOpt[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 123;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return enableshowreminderonapppauseoptArr;
    }

    private enableShowReminderOnAppPauseOpt(String str, int i, String str2) {
        this.param = str2;
    }

    public final String getParam() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.param;
        int i5 = i2 + 31;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        enableShowReminderOnAppPauseOpt[] enableshowreminderonapppauseoptArr$values = $values();
        $VALUES = enableshowreminderonapppauseoptArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(enableshowreminderonapppauseoptArr$values);
        int i = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 10 / 0;
        }
    }
}
