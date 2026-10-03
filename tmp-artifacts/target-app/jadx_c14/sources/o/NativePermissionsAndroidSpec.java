package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativePermissionsAndroidSpec {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NativePermissionsAndroidSpec[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final NativePermissionsAndroidSpec FILL_PRIMARY = new NativePermissionsAndroidSpec("FILL_PRIMARY", 0);
    public static final NativePermissionsAndroidSpec FILL_DARK = new NativePermissionsAndroidSpec("FILL_DARK", 1);
    public static final NativePermissionsAndroidSpec WEAK_PRIMARY = new NativePermissionsAndroidSpec("WEAK_PRIMARY", 2);
    public static final NativePermissionsAndroidSpec WEAK_DARK = new NativePermissionsAndroidSpec("WEAK_DARK", 3);
    public static final NativePermissionsAndroidSpec NONE = new NativePermissionsAndroidSpec("NONE", 4);

    private static final /* synthetic */ NativePermissionsAndroidSpec[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 95;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        NativePermissionsAndroidSpec[] nativePermissionsAndroidSpecArr = {FILL_PRIMARY, FILL_DARK, WEAK_PRIMARY, WEAK_DARK, NONE};
        int i5 = i2 + 3;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return nativePermissionsAndroidSpecArr;
    }

    public static EnumEntries<NativePermissionsAndroidSpec> getEntries() {
        EnumEntries<NativePermissionsAndroidSpec> enumEntries;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 15;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            enumEntries = $ENTRIES;
            int i4 = 59 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i2 + 55;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static NativePermissionsAndroidSpec valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        NativePermissionsAndroidSpec nativePermissionsAndroidSpec = (NativePermissionsAndroidSpec) Enum.valueOf(NativePermissionsAndroidSpec.class, str);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return nativePermissionsAndroidSpec;
    }

    public static NativePermissionsAndroidSpec[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        NativePermissionsAndroidSpec[] nativePermissionsAndroidSpecArr = $VALUES;
        if (i3 == 0) {
            return (NativePermissionsAndroidSpec[]) nativePermissionsAndroidSpecArr.clone();
        }
        int i4 = 34 / 0;
        return (NativePermissionsAndroidSpec[]) nativePermissionsAndroidSpecArr.clone();
    }

    private NativePermissionsAndroidSpec(String str, int i) {
    }

    static {
        NativePermissionsAndroidSpec[] nativePermissionsAndroidSpecArr$values = $values();
        $VALUES = nativePermissionsAndroidSpecArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(nativePermissionsAndroidSpecArr$values);
        int i = onWarmupCompleted + 123;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 27 / 0;
        }
    }
}
