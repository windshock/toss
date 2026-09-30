package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isFistLaunch {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ isFistLaunch[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String logReferrer;
    private final String logType;
    public static final isFistLaunch RAISED = new isFistLaunch("RAISED", 0, "CREDIT_IMPROVE_RAISE", "credit_improve.raise");
    public static final isFistLaunch NOT_RAISED = new isFistLaunch("NOT_RAISED", 1, "CREDIT_IMPROVE_NOT_RAISE", "credit_improve.not_raise");
    public static final isFistLaunch COOLTIME = new isFistLaunch("COOLTIME", 2, "CREDIT_IMPROVE_COOLTIME", "credit_improve.cooltime");

    private static final /* synthetic */ isFistLaunch[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return new isFistLaunch[]{RAISED, NOT_RAISED, COOLTIME};
        }
        isFistLaunch isfistlaunch = RAISED;
        isFistLaunch isfistlaunch2 = NOT_RAISED;
        isFistLaunch isfistlaunch3 = COOLTIME;
        isFistLaunch[] isfistlaunchArr = new isFistLaunch[4];
        isfistlaunchArr[0] = isfistlaunch;
        isfistlaunchArr[0] = isfistlaunch2;
        isfistlaunchArr[2] = isfistlaunch3;
        return isfistlaunchArr;
    }

    public static EnumEntries<isFistLaunch> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<isFistLaunch> enumEntries = $ENTRIES;
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        return enumEntries;
    }

    public static isFistLaunch valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        isFistLaunch isfistlaunch = (isFistLaunch) Enum.valueOf(isFistLaunch.class, str);
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        return isfistlaunch;
    }

    public static isFistLaunch[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        isFistLaunch[] isfistlaunchArr = (isFistLaunch[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return isfistlaunchArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isFistLaunch(String str, int i, String str2, String str3) {
        this.logType = str2;
        this.logReferrer = str3;
    }

    public final String getLogType() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.logType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getLogReferrer() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 89;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.logReferrer;
        int i4 = i2 + 11;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    static {
        isFistLaunch[] isfistlaunchArr$values = $values();
        $VALUES = isfistlaunchArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(isfistlaunchArr$values);
        int i = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 2 / 0;
        }
    }
}
