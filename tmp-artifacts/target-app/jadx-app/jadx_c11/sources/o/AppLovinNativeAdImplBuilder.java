package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinNativeAdImplBuilder {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppLovinNativeAdImplBuilder[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final AppLovinNativeAdImplBuilder Default = new AppLovinNativeAdImplBuilder("Default", 0);
    public static final AppLovinNativeAdImplBuilder Pressed = new AppLovinNativeAdImplBuilder("Pressed", 1);
    public static final AppLovinNativeAdImplBuilder Loading = new AppLovinNativeAdImplBuilder("Loading", 2);
    public static final AppLovinNativeAdImplBuilder LoadingWhileDisabled = new AppLovinNativeAdImplBuilder("LoadingWhileDisabled", 3);
    public static final AppLovinNativeAdImplBuilder Disabled = new AppLovinNativeAdImplBuilder("Disabled", 4);

    private static final /* synthetic */ AppLovinNativeAdImplBuilder[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 109;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        AppLovinNativeAdImplBuilder[] appLovinNativeAdImplBuilderArr = {Default, Pressed, Loading, LoadingWhileDisabled, Disabled};
        int i5 = i2 + 117;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return appLovinNativeAdImplBuilderArr;
        }
        throw null;
    }

    public static EnumEntries<AppLovinNativeAdImplBuilder> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 99;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<AppLovinNativeAdImplBuilder> enumEntries = $ENTRIES;
        int i5 = i2 + 83;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static AppLovinNativeAdImplBuilder valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AppLovinNativeAdImplBuilder appLovinNativeAdImplBuilder = (AppLovinNativeAdImplBuilder) Enum.valueOf(AppLovinNativeAdImplBuilder.class, str);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 11;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return appLovinNativeAdImplBuilder;
    }

    public static AppLovinNativeAdImplBuilder[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AppLovinNativeAdImplBuilder[] appLovinNativeAdImplBuilderArr = (AppLovinNativeAdImplBuilder[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return appLovinNativeAdImplBuilderArr;
    }

    private AppLovinNativeAdImplBuilder(String str, int i) {
    }

    static {
        AppLovinNativeAdImplBuilder[] appLovinNativeAdImplBuilderArr$values = $values();
        $VALUES = appLovinNativeAdImplBuilderArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(appLovinNativeAdImplBuilderArr$values);
        int i = onWarmupCompleted + 73;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 9 / 0;
        }
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        if (this != Loading) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 107;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (this != LoadingWhileDisabled) {
                int i4 = i2 + 19;
                onNavigationEvent = i4 % 128;
                return i4 % 2 != 0;
            }
        }
        int i5 = IAuthTabCallback + 53;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final boolean isEnabled() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == LoadingWhileDisabled) {
            return false;
        }
        int i4 = i3 + 67;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return this != Disabled;
    }
}
