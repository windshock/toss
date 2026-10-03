package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class lambdadestroy0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ lambdadestroy0[] $VALUES;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final lambdadestroy0 SELF = new lambdadestroy0("SELF", 0);
    public static final lambdadestroy0 SPOUSE = new lambdadestroy0("SPOUSE", 1);
    public static final lambdadestroy0 CHILDREN = new lambdadestroy0("CHILDREN", 2);
    public static final lambdadestroy0 ETC = new lambdadestroy0("ETC", 3);

    private static final /* synthetic */ lambdadestroy0[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 49;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        lambdadestroy0[] lambdadestroy0VarArr = {SELF, SPOUSE, CHILDREN, ETC};
        int i5 = i2 + 19;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return lambdadestroy0VarArr;
        }
        throw null;
    }

    public static EnumEntries<lambdadestroy0> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 71;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<lambdadestroy0> enumEntries = $ENTRIES;
        int i5 = i2 + 77;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static lambdadestroy0 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        lambdadestroy0 lambdadestroy0Var = (lambdadestroy0) Enum.valueOf(lambdadestroy0.class, str);
        int i4 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return lambdadestroy0Var;
    }

    public static lambdadestroy0[] values() {
        lambdadestroy0[] lambdadestroy0VarArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            lambdadestroy0VarArr = (lambdadestroy0[]) $VALUES.clone();
            int i3 = 20 / 0;
        } else {
            lambdadestroy0VarArr = (lambdadestroy0[]) $VALUES.clone();
        }
        int i4 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return lambdadestroy0VarArr;
    }

    private lambdadestroy0(String str, int i) {
    }

    static {
        lambdadestroy0[] lambdadestroy0VarArr$values = $values();
        $VALUES = lambdadestroy0VarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(lambdadestroy0VarArr$values);
        int i = onWarmupCompleted + 95;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}
