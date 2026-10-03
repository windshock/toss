package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactPackageHelpergetNativeModuleIteratorinlinedIterable1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ReactPackageHelpergetNativeModuleIteratorinlinedIterable1[] $VALUES;
    private static int IAuthTabCallback = 1;
    public static final ReactPackageHelpergetNativeModuleIteratorinlinedIterable1 KORAIL = new ReactPackageHelpergetNativeModuleIteratorinlinedIterable1("KORAIL", 0, "코레일");
    public static final ReactPackageHelpergetNativeModuleIteratorinlinedIterable1 TMONEY = new ReactPackageHelpergetNativeModuleIteratorinlinedIterable1("TMONEY", 1, "티머니");
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String displayName;

    private static final /* synthetic */ ReactPackageHelpergetNativeModuleIteratorinlinedIterable1[] $values() {
        ReactPackageHelpergetNativeModuleIteratorinlinedIterable1[] reactPackageHelpergetNativeModuleIteratorinlinedIterable1Arr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 81;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            reactPackageHelpergetNativeModuleIteratorinlinedIterable1Arr = new ReactPackageHelpergetNativeModuleIteratorinlinedIterable1[]{TMONEY, KORAIL};
        } else {
            reactPackageHelpergetNativeModuleIteratorinlinedIterable1Arr = new ReactPackageHelpergetNativeModuleIteratorinlinedIterable1[]{KORAIL, TMONEY};
        }
        int i4 = i2 + 35;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return reactPackageHelpergetNativeModuleIteratorinlinedIterable1Arr;
        }
        throw null;
    }

    public static EnumEntries<ReactPackageHelpergetNativeModuleIteratorinlinedIterable1> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        EnumEntries<ReactPackageHelpergetNativeModuleIteratorinlinedIterable1> enumEntries = $ENTRIES;
        int i4 = i3 + 37;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return enumEntries;
        }
        obj.hashCode();
        throw null;
    }

    public static ReactPackageHelpergetNativeModuleIteratorinlinedIterable1 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ReactPackageHelpergetNativeModuleIteratorinlinedIterable1 reactPackageHelpergetNativeModuleIteratorinlinedIterable1 = (ReactPackageHelpergetNativeModuleIteratorinlinedIterable1) Enum.valueOf(ReactPackageHelpergetNativeModuleIteratorinlinedIterable1.class, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 7;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return reactPackageHelpergetNativeModuleIteratorinlinedIterable1;
        }
        throw null;
    }

    public static ReactPackageHelpergetNativeModuleIteratorinlinedIterable1[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ReactPackageHelpergetNativeModuleIteratorinlinedIterable1[] reactPackageHelpergetNativeModuleIteratorinlinedIterable1Arr = (ReactPackageHelpergetNativeModuleIteratorinlinedIterable1[]) $VALUES.clone();
        int i4 = onNavigationEvent + 39;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return reactPackageHelpergetNativeModuleIteratorinlinedIterable1Arr;
    }

    private ReactPackageHelpergetNativeModuleIteratorinlinedIterable1(String str, int i, String str2) {
        this.displayName = str2;
    }

    public final String getDisplayName() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.displayName;
        int i5 = i3 + 71;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return str;
    }

    static {
        ReactPackageHelpergetNativeModuleIteratorinlinedIterable1[] reactPackageHelpergetNativeModuleIteratorinlinedIterable1Arr$values = $values();
        $VALUES = reactPackageHelpergetNativeModuleIteratorinlinedIterable1Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(reactPackageHelpergetNativeModuleIteratorinlinedIterable1Arr$values);
        int i = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
