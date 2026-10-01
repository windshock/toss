package o;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface setStrokeColor {
    void IAuthTabCallback(@NotNull RewardedAd rewardedAd);

    default void IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
    }

    void onExtraCallback(@NotNull InterstitialAd interstitialAd);

    void onExtraCallback(@NotNull NativeAdsError nativeAdsError);

    void onNavigationEvent(@NotNull AdError adError, @NotNull NativeAdsDto nativeAdsDto);

    void onNavigationEvent(@NotNull NativeAdsDto nativeAdsDto);
}
