package io.invertase.googlemobileads;

import android.app.Activity;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ReactNativeGoogleMobileAdsInterstitialModule extends ReactNativeGoogleMobileAdsFullScreenAdModule<AdManagerInterstitialAd> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RNGoogleMobileAdsInterstitialModule";

    public ReactNativeGoogleMobileAdsInterstitialModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, NAME);
    }

    @Override // io.invertase.googlemobileads.ReactNativeGoogleMobileAdsFullScreenAdModule
    public String getAdEventName() {
        return "google_mobile_ads_interstitial_event";
    }

    @ReactMethod
    public final void interstitialLoad(int i, @NotNull String str, @NotNull ReadableMap readableMap) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(readableMap, "");
        load(i, str, readableMap);
    }

    @ReactMethod
    public final void interstitialShow(int i, @NotNull String str, @NotNull ReadableMap readableMap, @NotNull Promise promise) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(readableMap, "");
        Intrinsics.checkNotNullParameter(promise, "");
        show(i, str, readableMap, promise);
    }

    @Override // io.invertase.googlemobileads.ReactNativeGoogleMobileAdsFullScreenAdModule
    public void loadAd(@NotNull Activity activity, @NotNull String str, @NotNull AdManagerAdRequest adManagerAdRequest, @NotNull final AdLoadCallback<AdManagerInterstitialAd> adLoadCallback) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(adManagerAdRequest, "");
        Intrinsics.checkNotNullParameter(adLoadCallback, "");
        AdManagerInterstitialAd.load(activity, str, adManagerAdRequest, new AdManagerInterstitialAdLoadCallback() { // from class: io.invertase.googlemobileads.ReactNativeGoogleMobileAdsInterstitialModule.loadAd.1
            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(AdManagerInterstitialAd adManagerInterstitialAd) {
                Intrinsics.checkNotNullParameter(adManagerInterstitialAd, "");
                adLoadCallback.onAdLoaded(adManagerInterstitialAd);
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                Intrinsics.checkNotNullParameter(loadAdError, "");
                adLoadCallback.onAdFailedToLoad(loadAdError);
            }
        });
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
