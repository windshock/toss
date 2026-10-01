package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
final class AFg1oSDK {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AFg1oSDK[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String inspectorName;
    public static final AFg1oSDK Item = new AFg1oSDK("Item", 0, "dragAndDropItem");
    public static final AFg1oSDK Handle = new AFg1oSDK("Handle", 1, "dragAndDropHandle");
    public static final AFg1oSDK Region = new AFg1oSDK("Region", 2, "dragAndDropRegion");
    public static final AFg1oSDK DropTarget = new AFg1oSDK("DropTarget", 3, "dragAndDropDropTarget");
    public static final AFg1oSDK Exclusion = new AFg1oSDK("Exclusion", 4, "dragAndDropCollisionExclusion");

    private static final /* synthetic */ AFg1oSDK[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        AFg1oSDK[] aFg1oSDKArr = {Item, Handle, Region, DropTarget, Exclusion};
        int i5 = i3 + 41;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return aFg1oSDKArr;
    }

    public static EnumEntries<AFg1oSDK> getEntries() {
        EnumEntries<AFg1oSDK> enumEntries;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            enumEntries = $ENTRIES;
            int i4 = 52 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i3 + 99;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AFg1oSDK valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        AFg1oSDK aFg1oSDK = (AFg1oSDK) Enum.valueOf(AFg1oSDK.class, str);
        int i4 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return aFg1oSDK;
    }

    public static AFg1oSDK[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AFg1oSDK[] aFg1oSDKArr = $VALUES;
        if (i3 == 0) {
            return (AFg1oSDK[]) aFg1oSDKArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AFg1oSDK(String str, int i, String str2) {
        this.inspectorName = str2;
    }

    public final String getInspectorName() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 113;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.inspectorName;
        int i4 = i2 + 51;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    static {
        AFg1oSDK[] aFg1oSDKArr$values = $values();
        $VALUES = aFg1oSDKArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(aFg1oSDKArr$values);
        int i = onNavigationEvent + 123;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 34 / 0;
        }
    }
}
