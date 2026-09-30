package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFg1eSDK {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AFg1eSDK[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final AFg1eSDK Hidden = new AFg1eSDK("Hidden", 0);
    public static final AFg1eSDK Expanded = new AFg1eSDK("Expanded", 1);

    private static final /* synthetic */ AFg1eSDK[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return new AFg1eSDK[]{Hidden, Expanded};
        }
        AFg1eSDK aFg1eSDK = Hidden;
        AFg1eSDK aFg1eSDK2 = Expanded;
        AFg1eSDK[] aFg1eSDKArr = new AFg1eSDK[2];
        aFg1eSDKArr[1] = aFg1eSDK;
        aFg1eSDKArr[1] = aFg1eSDK2;
        return aFg1eSDKArr;
    }

    public static EnumEntries<AFg1eSDK> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<AFg1eSDK> enumEntries = $ENTRIES;
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        return enumEntries;
    }

    public static AFg1eSDK valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AFg1eSDK aFg1eSDK = (AFg1eSDK) Enum.valueOf(AFg1eSDK.class, str);
        int i4 = onNavigationEvent + 67;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return aFg1eSDK;
    }

    public static AFg1eSDK[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        AFg1eSDK[] aFg1eSDKArr = (AFg1eSDK[]) $VALUES.clone();
        int i3 = onNavigationEvent + 55;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return aFg1eSDKArr;
    }

    private AFg1eSDK(String str, int i) {
    }

    static {
        AFg1eSDK[] aFg1eSDKArr$values = $values();
        $VALUES = aFg1eSDKArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(aFg1eSDKArr$values);
        int i = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
