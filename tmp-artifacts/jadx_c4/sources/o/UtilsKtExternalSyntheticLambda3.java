package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class UtilsKtExternalSyntheticLambda3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UtilsKtExternalSyntheticLambda3[] $VALUES;
    private static int IAuthTabCallback = 1;
    public static final UtilsKtExternalSyntheticLambda3 deviceIDAndGA = new UtilsKtExternalSyntheticLambda3("deviceIDAndGA", 0);
    public static final UtilsKtExternalSyntheticLambda3 deviceIDOnly = new UtilsKtExternalSyntheticLambda3("deviceIDOnly", 1);
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    private static final /* synthetic */ UtilsKtExternalSyntheticLambda3[] $values() {
        UtilsKtExternalSyntheticLambda3[] utilsKtExternalSyntheticLambda3Arr;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 83;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            UtilsKtExternalSyntheticLambda3 utilsKtExternalSyntheticLambda3 = deviceIDAndGA;
            UtilsKtExternalSyntheticLambda3 utilsKtExternalSyntheticLambda32 = deviceIDOnly;
            utilsKtExternalSyntheticLambda3Arr = new UtilsKtExternalSyntheticLambda3[3];
            utilsKtExternalSyntheticLambda3Arr[1] = utilsKtExternalSyntheticLambda3;
            utilsKtExternalSyntheticLambda3Arr[1] = utilsKtExternalSyntheticLambda32;
        } else {
            utilsKtExternalSyntheticLambda3Arr = new UtilsKtExternalSyntheticLambda3[]{deviceIDAndGA, deviceIDOnly};
        }
        int i4 = i2 + 123;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return utilsKtExternalSyntheticLambda3Arr;
    }

    public static EnumEntries<UtilsKtExternalSyntheticLambda3> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        EnumEntries<UtilsKtExternalSyntheticLambda3> enumEntries = $ENTRIES;
        int i4 = i3 + 11;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static UtilsKtExternalSyntheticLambda3 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        UtilsKtExternalSyntheticLambda3 utilsKtExternalSyntheticLambda3 = (UtilsKtExternalSyntheticLambda3) Enum.valueOf(UtilsKtExternalSyntheticLambda3.class, str);
        int i4 = onNavigationEvent + 35;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return utilsKtExternalSyntheticLambda3;
    }

    public static UtilsKtExternalSyntheticLambda3[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        UtilsKtExternalSyntheticLambda3[] utilsKtExternalSyntheticLambda3Arr = (UtilsKtExternalSyntheticLambda3[]) $VALUES.clone();
        int i4 = onNavigationEvent + 15;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return utilsKtExternalSyntheticLambda3Arr;
    }

    private UtilsKtExternalSyntheticLambda3(String str, int i) {
    }

    static {
        UtilsKtExternalSyntheticLambda3[] utilsKtExternalSyntheticLambda3Arr$values = $values();
        $VALUES = utilsKtExternalSyntheticLambda3Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(utilsKtExternalSyntheticLambda3Arr$values);
        int i = onWarmupCompleted + 47;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
