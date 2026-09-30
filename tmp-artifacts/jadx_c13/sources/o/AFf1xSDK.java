package o;

import kotlin.enums.EnumEntries;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFf1xSDK {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AFf1xSDK[] $VALUES;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final AFf1xSDK Tabs = new AFf1xSDK("Tabs", 0);
    public static final AFf1xSDK Indicator = new AFf1xSDK("Indicator", 1);

    private static final /* synthetic */ AFf1xSDK[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AFf1xSDK aFf1xSDK = Tabs;
        if (i3 == 0) {
            return new AFf1xSDK[]{aFf1xSDK, Indicator};
        }
        AFf1xSDK aFf1xSDK2 = Indicator;
        AFf1xSDK[] aFf1xSDKArr = new AFf1xSDK[4];
        aFf1xSDKArr[1] = aFf1xSDK;
        aFf1xSDKArr[1] = aFf1xSDK2;
        return aFf1xSDKArr;
    }

    public static EnumEntries<AFf1xSDK> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 11;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        EnumEntries<AFf1xSDK> enumEntries = $ENTRIES;
        int i4 = i2 + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static AFf1xSDK valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AFf1xSDK aFf1xSDK = (AFf1xSDK) Enum.valueOf(AFf1xSDK.class, str);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 45;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return aFf1xSDK;
    }

    public static AFf1xSDK[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        AFf1xSDK[] aFf1xSDKArr = $VALUES;
        if (i3 != 0) {
            return (AFf1xSDK[]) aFf1xSDKArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AFf1xSDK(String str, int i) {
    }

    static {
        AFf1xSDK[] aFf1xSDKArr$values = $values();
        $VALUES = aFf1xSDKArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(aFf1xSDKArr$values);
        int i = onNavigationEvent + 95;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 0 / 0;
        }
    }
}
