package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFe1jSDK3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AFe1jSDK3[] $VALUES;
    public static final AFe1jSDK3 DeviceIdAndGa = new AFe1jSDK3("DeviceIdAndGa", 0);
    public static final AFe1jSDK3 DeviceIdOnly = new AFe1jSDK3("DeviceIdOnly", 1);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;

    private static final /* synthetic */ AFe1jSDK3[] $values() {
        AFe1jSDK3[] aFe1jSDK3Arr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            AFe1jSDK3 aFe1jSDK3 = DeviceIdAndGa;
            AFe1jSDK3 aFe1jSDK32 = DeviceIdOnly;
            aFe1jSDK3Arr = new AFe1jSDK3[4];
            aFe1jSDK3Arr[1] = aFe1jSDK3;
            aFe1jSDK3Arr[0] = aFe1jSDK32;
        } else {
            aFe1jSDK3Arr = new AFe1jSDK3[]{DeviceIdAndGa, DeviceIdOnly};
        }
        int i4 = i3 + 79;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
        return aFe1jSDK3Arr;
    }

    public static EnumEntries<AFe1jSDK3> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 89;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<AFe1jSDK3> enumEntries = $ENTRIES;
        int i5 = i2 + 43;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static AFe1jSDK3 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        AFe1jSDK3 aFe1jSDK3 = (AFe1jSDK3) Enum.valueOf(AFe1jSDK3.class, str);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 81;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return aFe1jSDK3;
        }
        throw null;
    }

    public static AFe1jSDK3[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AFe1jSDK3[] aFe1jSDK3Arr = (AFe1jSDK3[]) $VALUES.clone();
        int i4 = onExtraCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return aFe1jSDK3Arr;
    }

    private AFe1jSDK3(String str, int i) {
    }

    static {
        AFe1jSDK3[] aFe1jSDK3Arr$values = $values();
        $VALUES = aFe1jSDK3Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(aFe1jSDK3Arr$values);
        int i = IAuthTabCallback + 79;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
