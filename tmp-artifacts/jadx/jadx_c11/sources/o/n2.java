package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class n2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n2[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final n2 ServiceBundleLoadFailed = new n2("ServiceBundleLoadFailed", 0);
    public static final n2 SharedBundleLoadFailed = new n2("SharedBundleLoadFailed", 1);
    public static final n2 ReactHostStartFailed = new n2("ReactHostStartFailed", 2);

    private static final /* synthetic */ n2[] $values() {
        n2[] n2VarArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            n2 n2Var = ServiceBundleLoadFailed;
            n2 n2Var2 = SharedBundleLoadFailed;
            n2 n2Var3 = ReactHostStartFailed;
            n2VarArr = new n2[3];
            n2VarArr[1] = n2Var;
            n2VarArr[0] = n2Var2;
            n2VarArr[5] = n2Var3;
        } else {
            n2VarArr = new n2[]{ServiceBundleLoadFailed, SharedBundleLoadFailed, ReactHostStartFailed};
        }
        int i4 = i3 + 3;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return n2VarArr;
    }

    public static EnumEntries<n2> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 103;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<n2> enumEntries = $ENTRIES;
        int i5 = i2 + 23;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static n2 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        n2 n2Var = (n2) Enum.valueOf(n2.class, str);
        if (i3 != 0) {
            return n2Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static n2[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        n2[] n2VarArr = (n2[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return n2VarArr;
    }

    private n2(String str, int i) {
    }

    static {
        n2[] n2VarArr$values = $values();
        $VALUES = n2VarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(n2VarArr$values);
        int i = onWarmupCompleted + 67;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
