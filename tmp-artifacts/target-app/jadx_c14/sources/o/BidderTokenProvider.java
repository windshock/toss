package o;

import im.toss.network.model.BaseApiResponse;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.account.notification.AccountNotificationGetCiResp;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface BidderTokenProvider {
    @getIv8(onExtraCallback = "v3/account-notification/subscriptions/unsubscribe/bank/{bankCode}")
    @gf
    writeRaw<BaseApiResponse<onAttachedToView>> IAuthTabCallback(@getIvD(onNavigationEvent = "bankCode") int i);

    @getIv8(onExtraCallback = "v3/account-notification/infos/get")
    @gf
    writeRaw<BaseApiResponse<AdComponentFrameLayout>> onExtraCallback(@getUserCertList @NotNull AdComponentViewApi adComponentViewApi);

    @getIv8(onExtraCallback = "v3/account-notification/infos/check-ci")
    @gf
    writeRaw<BaseApiResponse<Boolean>> onExtraCallbackWithResult(@getUserCertList @NotNull onRewardServerSuccess onrewardserversuccess);

    @getIv8(onExtraCallback = "v3/account-notification/subscriptions/get")
    @gf
    writeRaw<BaseApiResponse<getAdComponentViewApi>> onNavigationEvent();

    @getIv8(onExtraCallback = "v3/account-notification/subscriptions/save")
    @gf
    writeRaw<BaseApiResponse<attachAdComponentViewApi>> onNavigationEvent(@getUserCertList @NotNull VideoAutoplayBehavior videoAutoplayBehavior);

    @getIv8(onExtraCallback = "v3/account-notification/subscriptions/validate/ci")
    @gf
    writeRaw<BaseApiResponse<Boolean>> onNavigationEvent(@getUserCertList @NotNull onRewardServerFailed onrewardserverfailed);

    @getIv8(onExtraCallback = "v3/account-notification/subscriptions/get/bank")
    @gf
    writeRaw<BaseApiResponse<List<VideoStartReason>>> onNavigationEvent(@getUserCertList @NotNull onRewardServerSuccess onrewardserversuccess);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/account-notification/infos/ci")
    @gf
    writeRaw<BaseApiResponse<AccountNotificationGetCiResp>> onWarmupCompleted();

    @getIv8(onExtraCallback = "v3/account-notification/subscriptions/reservation")
    @gf
    writeRaw<BaseApiResponse<Boolean>> onWarmupCompleted(@getUserCertList @NotNull AdComponentView adComponentView);
}
