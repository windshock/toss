package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class access1302 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ access1302[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final access1302 SHARED = new access1302("SHARED", 0);
    public static final access1302 PERSONAL = new access1302("PERSONAL", 1);

    private static final /* synthetic */ access1302[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return new access1302[]{SHARED, PERSONAL};
        }
        access1302 access1302Var = SHARED;
        access1302 access1302Var2 = PERSONAL;
        access1302[] access1302VarArr = new access1302[2];
        access1302VarArr[1] = access1302Var;
        access1302VarArr[1] = access1302Var2;
        return access1302VarArr;
    }

    public static EnumEntries<access1302> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<access1302> enumEntries = $ENTRIES;
        int i5 = i3 + 55;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static access1302 valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        access1302 access1302Var = (access1302) Enum.valueOf(access1302.class, str);
        if (i3 == 0) {
            return access1302Var;
        }
        throw null;
    }

    public static access1302[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        access1302[] access1302VarArr = (access1302[]) $VALUES.clone();
        int i4 = onExtraCallback + 121;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return access1302VarArr;
    }

    static {
        access1302[] access1302VarArr$values = $values();
        $VALUES = access1302VarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(access1302VarArr$values);
        int i = onWarmupCompleted + 31;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private access1302(String str, int i) {
    }
}
