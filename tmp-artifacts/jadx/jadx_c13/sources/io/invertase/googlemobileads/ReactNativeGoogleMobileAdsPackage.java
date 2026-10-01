package io.invertase.googlemobileads;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.onTransact;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ReactNativeGoogleMobileAdsPackage extends onTransact {
    public List<ViewManager<?, ?>> createViewManagers(@NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        return CollectionsKt__CollectionsKt.listOf((Object[]) new BaseViewManager[]{new ReactNativeGoogleMobileAdsBannerAdViewManager(), new ReactNativeGoogleMobileAdsNativeAdViewManager(reactApplicationContext), new ReactNativeGoogleMobileAdsMediaViewManager(reactApplicationContext)});
    }

    public NativeModule getModule(@NotNull String str, @NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        switch (str.hashCode()) {
            case -1537499885:
                if (str.equals(ReactNativeGoogleMobileAdsRewardedModule.NAME)) {
                    return new ReactNativeGoogleMobileAdsRewardedModule(reactApplicationContext);
                }
                return null;
            case -1403759859:
                if (str.equals("RNGoogleMobileAdsConsentModule")) {
                    return new ReactNativeGoogleMobileAdsConsentModule(reactApplicationContext);
                }
                return null;
            case -1205003041:
                if (str.equals(ReactNativeGoogleMobileAdsRewardedInterstitialModule.NAME)) {
                    return new ReactNativeGoogleMobileAdsRewardedInterstitialModule(reactApplicationContext);
                }
                return null;
            case -1135042404:
                if (str.equals("RNGoogleMobileAdsNativeModule")) {
                    return new ReactNativeGoogleMobileAdsNativeModule(reactApplicationContext);
                }
                return null;
            case -437253871:
                if (str.equals("RNAppModule")) {
                    return new ReactNativeAppModule(reactApplicationContext);
                }
                return null;
            case 471412837:
                if (str.equals(ReactNativeGoogleMobileAdsModule.NAME)) {
                    return new ReactNativeGoogleMobileAdsModule(reactApplicationContext);
                }
                return null;
            case 522077489:
                if (str.equals(ReactNativeGoogleMobileAdsInterstitialModule.NAME)) {
                    return new ReactNativeGoogleMobileAdsInterstitialModule(reactApplicationContext);
                }
                return null;
            case 555103806:
                if (str.equals(ReactNativeGoogleMobileAdsAppOpenModule.NAME)) {
                    return new ReactNativeGoogleMobileAdsAppOpenModule(reactApplicationContext);
                }
                return null;
            default:
                return null;
        }
    }

    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: io.invertase.googlemobileads.ReactNativeGoogleMobileAdsPackage$$ExternalSyntheticLambda0
            public final Map getReactModuleInfos() {
                return ReactNativeGoogleMobileAdsPackage.IAuthTabCallback();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map IAuthTabCallback() {
        HashMap map = new HashMap();
        map.put("RNAppModule", new ReactModuleInfo("RNAppModule", "RNAppModule", false, false, false, false));
        map.put(ReactNativeGoogleMobileAdsModule.NAME, new ReactModuleInfo(ReactNativeGoogleMobileAdsModule.NAME, ReactNativeGoogleMobileAdsModule.NAME, false, false, false, false));
        map.put("RNGoogleMobileAdsConsentModule", new ReactModuleInfo("RNGoogleMobileAdsConsentModule", "RNGoogleMobileAdsConsentModule", false, false, false, false));
        map.put(ReactNativeGoogleMobileAdsAppOpenModule.NAME, new ReactModuleInfo(ReactNativeGoogleMobileAdsAppOpenModule.NAME, ReactNativeGoogleMobileAdsAppOpenModule.NAME, false, false, false, false));
        map.put(ReactNativeGoogleMobileAdsInterstitialModule.NAME, new ReactModuleInfo(ReactNativeGoogleMobileAdsInterstitialModule.NAME, ReactNativeGoogleMobileAdsInterstitialModule.NAME, false, false, false, false));
        map.put(ReactNativeGoogleMobileAdsRewardedModule.NAME, new ReactModuleInfo(ReactNativeGoogleMobileAdsRewardedModule.NAME, ReactNativeGoogleMobileAdsRewardedModule.NAME, false, false, false, false));
        map.put(ReactNativeGoogleMobileAdsRewardedInterstitialModule.NAME, new ReactModuleInfo(ReactNativeGoogleMobileAdsRewardedInterstitialModule.NAME, ReactNativeGoogleMobileAdsRewardedInterstitialModule.NAME, false, false, false, false));
        map.put("RNGoogleMobileAdsNativeModule", new ReactModuleInfo("RNGoogleMobileAdsNativeModule", "RNGoogleMobileAdsNativeModule", false, false, false, true));
        return map;
    }
}
