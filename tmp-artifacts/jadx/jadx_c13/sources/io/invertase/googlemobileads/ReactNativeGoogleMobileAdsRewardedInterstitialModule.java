package io.invertase.googlemobileads;

import android.app.Activity;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ReactNativeGoogleMobileAdsRewardedInterstitialModule extends ReactNativeGoogleMobileAdsFullScreenAdModule<RewardedInterstitialAd> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RNGoogleMobileAdsRewardedInterstitialModule";

    public ReactNativeGoogleMobileAdsRewardedInterstitialModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, NAME);
    }

    @Override // io.invertase.googlemobileads.ReactNativeGoogleMobileAdsFullScreenAdModule
    public String getAdEventName() {
        return "google_mobile_ads_rewarded_interstitial_event";
    }

    @ReactMethod
    public final void rewardedInterstitialLoad(int i, @NotNull String str, @NotNull ReadableMap readableMap) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(readableMap, "");
        load(i, str, readableMap);
    }

    @ReactMethod
    public final void rewardedInterstitialShow(int i, @NotNull String str, @NotNull ReadableMap readableMap, @NotNull Promise promise) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(readableMap, "");
        Intrinsics.checkNotNullParameter(promise, "");
        show(i, str, readableMap, promise);
    }

    @Override // io.invertase.googlemobileads.ReactNativeGoogleMobileAdsFullScreenAdModule
    public void loadAd(@NotNull Activity activity, @NotNull String str, @NotNull AdManagerAdRequest adManagerAdRequest, @NotNull final AdLoadCallback<RewardedInterstitialAd> adLoadCallback) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(adManagerAdRequest, "");
        Intrinsics.checkNotNullParameter(adLoadCallback, "");
        RewardedInterstitialAd.load(activity, str, adManagerAdRequest, new RewardedInterstitialAdLoadCallback() { // from class: io.invertase.googlemobileads.ReactNativeGoogleMobileAdsRewardedInterstitialModule.loadAd.1
            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd) {
                Intrinsics.checkNotNullParameter(rewardedInterstitialAd, "");
                adLoadCallback.onAdLoaded(rewardedInterstitialAd);
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
