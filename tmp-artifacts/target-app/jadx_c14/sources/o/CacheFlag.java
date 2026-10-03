package o;

import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface CacheFlag {
    @getIv8(onExtraCallback = "v3/card-approval/subscriptions/get")
    @gf
    writeRaw<BaseApiResponse<InitSettingsBuilder>> IAuthTabCallback();

    @getIv8(onExtraCallback = "v3/card-approval/subscriptions/save")
    @gf
    writeRaw<BaseApiResponse<BuildConfigApi>> IAuthTabCallback(@getUserCertList @Nullable BidderTokenProviderApi bidderTokenProviderApi);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/card-approval/disclaimer")
    @gf
    writeRaw<BaseApiResponse<String>> onExtraCallback();

    @getIv8(onExtraCallback = "v3/card-approval/subscriptions/get/cardVendor")
    @gf
    writeRaw<BaseApiResponse<getVersionOverride>> onExtraCallback(@getUserCertList @Nullable onAdLoadInvoked onadloadinvoked);

    @getIv8(onExtraCallback = "v3/card-approval/subscriptions/reservation")
    @gf
    writeRaw<BaseApiResponse<launchUrl>> onExtraCallback(@getUserCertList @Nullable setVersionOverride setversionoverride);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/card-approval/terms/standard")
    @gf
    writeRaw<BaseApiResponse<getVersionName>> onNavigationEvent();

    @getIv8(onExtraCallback = "v3/card-approval/subscriptions/get/unsubscribe-info")
    @gf
    writeRaw<BaseApiResponse<MediaViewApi>> onWarmupCompleted(@getUserCertList @NotNull InterstitialAdApi interstitialAdApi);
}
