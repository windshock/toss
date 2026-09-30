package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1nSDK4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AFj1nSDK4[] $VALUES;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final AFj1nSDK4 V1 = new AFj1nSDK4("V1", 0);
    public static final AFj1nSDK4 V2 = new AFj1nSDK4("V2", 1);
    public static final AFj1nSDK4 V3 = new AFj1nSDK4("V3", 2);
    public static final AFj1nSDK4 UNDEFINED = new AFj1nSDK4("UNDEFINED", 3);

    private static final /* synthetic */ AFj1nSDK4[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        AFj1nSDK4[] aFj1nSDK4Arr = {V1, V2, V3, UNDEFINED};
        int i5 = i3 + 111;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return aFj1nSDK4Arr;
    }

    public static EnumEntries<AFj1nSDK4> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 37;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<AFj1nSDK4> enumEntries = $ENTRIES;
        int i5 = i2 + 89;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static AFj1nSDK4 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AFj1nSDK4 aFj1nSDK4 = (AFj1nSDK4) Enum.valueOf(AFj1nSDK4.class, str);
        int i4 = onExtraCallback + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return aFj1nSDK4;
    }

    public static AFj1nSDK4[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        AFj1nSDK4[] aFj1nSDK4Arr = (AFj1nSDK4[]) $VALUES.clone();
        int i3 = onNavigationEvent + 37;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return aFj1nSDK4Arr;
        }
        obj.hashCode();
        throw null;
    }

    private AFj1nSDK4(String str, int i) {
    }

    static {
        AFj1nSDK4[] aFj1nSDK4Arr$values = $values();
        $VALUES = aFj1nSDK4Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(aFj1nSDK4Arr$values);
        int i = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public final boolean isV3Log() {
        int i = 2 % 2;
        if (this != V3) {
            return false;
        }
        int i2 = onExtraCallback;
        int i3 = i2 + 97;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 53;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }
}
