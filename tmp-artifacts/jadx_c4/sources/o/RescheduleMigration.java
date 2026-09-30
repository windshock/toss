package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RescheduleMigration {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RescheduleMigration[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final RescheduleMigration FOREGROUND = new RescheduleMigration("FOREGROUND", 0);
    public static final RescheduleMigration BACKGROUND = new RescheduleMigration("BACKGROUND", 1);

    private static final /* synthetic */ RescheduleMigration[] $values() {
        RescheduleMigration[] rescheduleMigrationArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 87;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            RescheduleMigration rescheduleMigration = FOREGROUND;
            RescheduleMigration rescheduleMigration2 = BACKGROUND;
            rescheduleMigrationArr = new RescheduleMigration[5];
            rescheduleMigrationArr[0] = rescheduleMigration;
            rescheduleMigrationArr[1] = rescheduleMigration2;
        } else {
            rescheduleMigrationArr = new RescheduleMigration[]{FOREGROUND, BACKGROUND};
        }
        int i4 = i2 + 95;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return rescheduleMigrationArr;
    }

    public static EnumEntries<RescheduleMigration> getEntries() {
        EnumEntries<RescheduleMigration> enumEntries;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 97;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            enumEntries = $ENTRIES;
            int i4 = 38 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i2 + 25;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
        return enumEntries;
    }

    public static RescheduleMigration valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        RescheduleMigration rescheduleMigration = (RescheduleMigration) Enum.valueOf(RescheduleMigration.class, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 31;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return rescheduleMigration;
        }
        obj.hashCode();
        throw null;
    }

    public static RescheduleMigration[] values() {
        RescheduleMigration[] rescheduleMigrationArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            rescheduleMigrationArr = (RescheduleMigration[]) $VALUES.clone();
            int i3 = 9 / 0;
        } else {
            rescheduleMigrationArr = (RescheduleMigration[]) $VALUES.clone();
        }
        int i4 = onExtraCallback + 55;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return rescheduleMigrationArr;
        }
        throw null;
    }

    private RescheduleMigration(String str, int i) {
    }

    static {
        RescheduleMigration[] rescheduleMigrationArr$values = $values();
        $VALUES = rescheduleMigrationArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(rescheduleMigrationArr$values);
        int i = onNavigationEvent + 7;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
