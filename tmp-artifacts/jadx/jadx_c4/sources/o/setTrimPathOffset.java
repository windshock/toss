package o;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsError;
import o.scrollToItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface setTrimPathOffset {
    void IAuthTabCallback(@NotNull RewardedAd rewardedAd);

    void IAuthTabCallback(@NotNull NativeAdsDto nativeAdsDto);

    void onExtraCallback();

    void onExtraCallback(@NotNull InterstitialAd interstitialAd);

    void onExtraCallback(@NotNull NativeAdsError nativeAdsError);

    void onExtraCallbackWithResult(@NotNull InterstitialAd interstitialAd, @NotNull AdError adError);

    void onExtraCallbackWithResult(@NotNull NativeAdsDto.Reward reward);

    void onExtraCallbackWithResult(@NotNull NativeAdsDto nativeAdsDto);

    void onExtraCallbackWithResult(@NotNull scrollToItem.onWarmupCompleted onwarmupcompleted);

    void onNavigationEvent();

    void onNavigationEvent(@NotNull InterstitialAd interstitialAd);

    void onNavigationEvent(@Nullable NativeAdsDto nativeAdsDto);

    void onWarmupCompleted(@NotNull RewardedAd rewardedAd);

    void onWarmupCompleted(@NotNull RewardedAd rewardedAd, @NotNull AdError adError);
}
