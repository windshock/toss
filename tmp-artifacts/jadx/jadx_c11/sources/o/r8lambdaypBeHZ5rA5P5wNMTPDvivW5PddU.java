package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public static final r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU IDLE = new r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU("IDLE", 0);
    public static final r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU BOOTING = new r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU("BOOTING", 1);
    public static final r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU READY = new r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU("READY", 2);
    public static final r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU TEARING_DOWN = new r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU("TEARING_DOWN", 3);
    public static final r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU BOOT_FAILED = new r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU("BOOT_FAILED", 4);
    public static final r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU TEARDOWN_FAILED = new r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU("TEARDOWN_FAILED", 5);

    private static final /* synthetic */ r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU[] r8lambdaypbehz5ra5p5wnmtpdvivw5pdduArr = {IDLE, BOOTING, READY, TEARING_DOWN, BOOT_FAILED, TEARDOWN_FAILED};
        int i5 = i3 + 21;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
        return r8lambdaypbehz5ra5p5wnmtpdvivw5pdduArr;
    }

    public static EnumEntries<r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 63;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU> enumEntries = $ENTRIES;
        int i5 = i2 + 59;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU r8lambdaypbehz5ra5p5wnmtpdvivw5pddu = (r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU) Enum.valueOf(r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU.class, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallback + 115;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
        return r8lambdaypbehz5ra5p5wnmtpdvivw5pddu;
    }

    public static r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU[] r8lambdaypbehz5ra5p5wnmtpdvivw5pdduArr = (r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return r8lambdaypbehz5ra5p5wnmtpdvivw5pdduArr;
    }

    private r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU(String str, int i) {
    }

    static {
        r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU[] r8lambdaypbehz5ra5p5wnmtpdvivw5pdduArr$values = $values();
        $VALUES = r8lambdaypbehz5ra5p5wnmtpdvivw5pdduArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(r8lambdaypbehz5ra5p5wnmtpdvivw5pdduArr$values);
        int i = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
