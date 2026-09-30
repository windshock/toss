package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WorkDatabase {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WorkDatabase[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    public static final WorkDatabase DUAL = new WorkDatabase("DUAL", 0);
    public static final WorkDatabase FOREGROUND_ONLY = new WorkDatabase("FOREGROUND_ONLY", 1);
    public static final WorkDatabase BACKGROUND_ONLY = new WorkDatabase("BACKGROUND_ONLY", 2);
    public static final WorkDatabase PLACE = new WorkDatabase("PLACE", 3);

    private static final /* synthetic */ WorkDatabase[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 81;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        WorkDatabase[] workDatabaseArr = {DUAL, FOREGROUND_ONLY, BACKGROUND_ONLY, PLACE};
        int i5 = i2 + 13;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return workDatabaseArr;
    }

    public static EnumEntries<WorkDatabase> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<WorkDatabase> enumEntries = $ENTRIES;
        int i5 = i2 + 117;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static WorkDatabase valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        WorkDatabase workDatabase = (WorkDatabase) Enum.valueOf(WorkDatabase.class, str);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 5;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return workDatabase;
    }

    public static WorkDatabase[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        WorkDatabase[] workDatabaseArr = (WorkDatabase[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 105;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return workDatabaseArr;
    }

    private WorkDatabase(String str, int i) {
    }

    static {
        WorkDatabase[] workDatabaseArr$values = $values();
        $VALUES = workDatabaseArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(workDatabaseArr$values);
        int i = IAuthTabCallback + 123;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
