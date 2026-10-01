package io.invertase.googlemobileads;

import android.app.Activity;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ReactNativeGoogleMobileAdsRewardedModule extends ReactNativeGoogleMobileAdsFullScreenAdModule<RewardedAd> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RNGoogleMobileAdsRewardedModule";

    public ReactNativeGoogleMobileAdsRewardedModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, NAME);
    }

    @Override // io.invertase.googlemobileads.ReactNativeGoogleMobileAdsFullScreenAdModule
    public String getAdEventName() {
        return "google_mobile_ads_rewarded_event";
    }

    @ReactMethod
    public final void rewardedLoad(int i, @NotNull String str, @NotNull ReadableMap readableMap) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(readableMap, "");
        load(i, str, readableMap);
    }

    @ReactMethod
    public final void rewardedShow(int i, @NotNull String str, @NotNull ReadableMap readableMap, @NotNull Promise promise) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(readableMap, "");
        Intrinsics.checkNotNullParameter(promise, "");
        show(i, str, readableMap, promise);
    }

    @Override // io.invertase.googlemobileads.ReactNativeGoogleMobileAdsFullScreenAdModule
    public void loadAd(@NotNull Activity activity, @NotNull String str, @NotNull AdManagerAdRequest adManagerAdRequest, @NotNull final AdLoadCallback<RewardedAd> adLoadCallback) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(adManagerAdRequest, "");
        Intrinsics.checkNotNullParameter(adLoadCallback, "");
        RewardedAd.load(activity, str, adManagerAdRequest, new RewardedAdLoadCallback() { // from class: io.invertase.googlemobileads.ReactNativeGoogleMobileAdsRewardedModule.loadAd.1
            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(RewardedAd rewardedAd) {
                Intrinsics.checkNotNullParameter(rewardedAd, "");
                adLoadCallback.onAdLoaded(rewardedAd);
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
