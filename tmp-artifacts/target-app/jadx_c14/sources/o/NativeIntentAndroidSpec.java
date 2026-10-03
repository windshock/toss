package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeIntentAndroidSpec {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NativeIntentAndroidSpec[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final NativeIntentAndroidSpec OWNER = new NativeIntentAndroidSpec("OWNER", 0);
    public static final NativeIntentAndroidSpec INVITEE = new NativeIntentAndroidSpec("INVITEE", 1);

    private static final /* synthetic */ NativeIntentAndroidSpec[] $values() {
        NativeIntentAndroidSpec[] nativeIntentAndroidSpecArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            NativeIntentAndroidSpec nativeIntentAndroidSpec = OWNER;
            NativeIntentAndroidSpec nativeIntentAndroidSpec2 = INVITEE;
            nativeIntentAndroidSpecArr = new NativeIntentAndroidSpec[2];
            nativeIntentAndroidSpecArr[0] = nativeIntentAndroidSpec;
            nativeIntentAndroidSpecArr[0] = nativeIntentAndroidSpec2;
        } else {
            nativeIntentAndroidSpecArr = new NativeIntentAndroidSpec[]{OWNER, INVITEE};
        }
        int i4 = i3 + 43;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return nativeIntentAndroidSpecArr;
    }

    public static EnumEntries<NativeIntentAndroidSpec> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        EnumEntries<NativeIntentAndroidSpec> enumEntries = $ENTRIES;
        int i4 = i3 + 51;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return enumEntries;
        }
        obj.hashCode();
        throw null;
    }

    public static NativeIntentAndroidSpec valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        NativeIntentAndroidSpec nativeIntentAndroidSpec = (NativeIntentAndroidSpec) Enum.valueOf(NativeIntentAndroidSpec.class, str);
        int i4 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return nativeIntentAndroidSpec;
    }

    public static NativeIntentAndroidSpec[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        NativeIntentAndroidSpec[] nativeIntentAndroidSpecArr = $VALUES;
        if (i3 != 0) {
            return (NativeIntentAndroidSpec[]) nativeIntentAndroidSpecArr.clone();
        }
        int i4 = 69 / 0;
        return (NativeIntentAndroidSpec[]) nativeIntentAndroidSpecArr.clone();
    }

    private NativeIntentAndroidSpec(String str, int i) {
    }

    static {
        NativeIntentAndroidSpec[] nativeIntentAndroidSpecArr$values = $values();
        $VALUES = nativeIntentAndroidSpecArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(nativeIntentAndroidSpecArr$values);
        int i = onWarmupCompleted + 37;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
