package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ReactPackageTurboModuleManagerDelegate {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ReactPackageTurboModuleManagerDelegate[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final ReactPackageTurboModuleManagerDelegate ENABLE = new ReactPackageTurboModuleManagerDelegate("ENABLE", 0);
    public static final ReactPackageTurboModuleManagerDelegate DISABLE = new ReactPackageTurboModuleManagerDelegate("DISABLE", 1);

    private static final /* synthetic */ ReactPackageTurboModuleManagerDelegate[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ReactPackageTurboModuleManagerDelegate reactPackageTurboModuleManagerDelegate = ENABLE;
        if (i3 == 0) {
            return new ReactPackageTurboModuleManagerDelegate[]{reactPackageTurboModuleManagerDelegate, DISABLE};
        }
        ReactPackageTurboModuleManagerDelegate reactPackageTurboModuleManagerDelegate2 = DISABLE;
        ReactPackageTurboModuleManagerDelegate[] reactPackageTurboModuleManagerDelegateArr = new ReactPackageTurboModuleManagerDelegate[5];
        reactPackageTurboModuleManagerDelegateArr[1] = reactPackageTurboModuleManagerDelegate;
        reactPackageTurboModuleManagerDelegateArr[1] = reactPackageTurboModuleManagerDelegate2;
        return reactPackageTurboModuleManagerDelegateArr;
    }

    public static EnumEntries<ReactPackageTurboModuleManagerDelegate> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        EnumEntries<ReactPackageTurboModuleManagerDelegate> enumEntries = $ENTRIES;
        int i5 = i3 + 87;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ReactPackageTurboModuleManagerDelegate valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ReactPackageTurboModuleManagerDelegate reactPackageTurboModuleManagerDelegate = (ReactPackageTurboModuleManagerDelegate) Enum.valueOf(ReactPackageTurboModuleManagerDelegate.class, str);
        int i4 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return reactPackageTurboModuleManagerDelegate;
    }

    public static ReactPackageTurboModuleManagerDelegate[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ReactPackageTurboModuleManagerDelegate[] reactPackageTurboModuleManagerDelegateArr = $VALUES;
        if (i3 != 0) {
            return (ReactPackageTurboModuleManagerDelegate[]) reactPackageTurboModuleManagerDelegateArr.clone();
        }
        throw null;
    }

    private ReactPackageTurboModuleManagerDelegate(String str, int i) {
    }

    static {
        ReactPackageTurboModuleManagerDelegate[] reactPackageTurboModuleManagerDelegateArr$values = $values();
        $VALUES = reactPackageTurboModuleManagerDelegateArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(reactPackageTurboModuleManagerDelegateArr$values);
        int i = onNavigationEvent + 117;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
