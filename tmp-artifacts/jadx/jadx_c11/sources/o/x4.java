package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
final class x4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x4[] $VALUES;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final x4 Items = new x4("Items", 0);
    public static final x4 Indicator = new x4("Indicator", 1);

    private static final /* synthetic */ x4[] $values() {
        x4[] x4VarArr;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 29;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            x4 x4Var = Items;
            x4 x4Var2 = Indicator;
            x4VarArr = new x4[3];
            x4VarArr[1] = x4Var;
            x4VarArr[0] = x4Var2;
        } else {
            x4VarArr = new x4[]{Items, Indicator};
        }
        int i4 = i2 + 59;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return x4VarArr;
    }

    public static EnumEntries<x4> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 59;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EnumEntries<x4> enumEntries = $ENTRIES;
        int i4 = i2 + 79;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static x4 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        x4 x4Var = (x4) Enum.valueOf(x4.class, str);
        if (i3 != 0) {
            return x4Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static x4[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        x4[] x4VarArr = (x4[]) $VALUES.clone();
        int i3 = onNavigationEvent + 79;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return x4VarArr;
        }
        obj.hashCode();
        throw null;
    }

    private x4(String str, int i) {
    }

    static {
        x4[] x4VarArr$values = $values();
        $VALUES = x4VarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(x4VarArr$values);
        int i = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
