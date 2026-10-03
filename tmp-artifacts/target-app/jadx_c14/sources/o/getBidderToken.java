package o;

import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface getBidderToken {
    @getIv8(onExtraCallback = "v3/accounts/open-banking/transition-accounts/transit")
    @gf
    writeRaw<BaseApiResponse<Boolean>> IAuthTabCallback();

    @getIv8(onExtraCallback = "v3/accounts/joint/info")
    @getUserCertOnMemory
    @gf
    writeRaw<withAdExperience> IAuthTabCallback(@getCurCert(onExtraCallbackWithResult = "accountId") @NotNull String str);

    @getIv8(onExtraCallback = "v3/accounts/bank/register-with-withdrawal-agreement/by-toss-cert")
    @gf
    writeRaw<onMediaDownloaded> IAuthTabCallback(@getUserCertList @NotNull NativeAdScrollView nativeAdScrollView);

    @getIv8(onExtraCallback = "v3/accounts/joint/members/delete")
    @gf
    JsonReaderUnknownNumberParsing<SimpleDraweeView> onExtraCallback(@getUserCertList @NotNull RewardedVideoAdExtendedListener rewardedVideoAdExtendedListener);

    @getIv8(onExtraCallback = "v3/accounts/joint/event/delete")
    @getUserCertOnMemory
    @gf
    writeRaw<SimpleDraweeView> onExtraCallback(@getCurCert(onExtraCallbackWithResult = "eventId") long j);

    @getIv8(onExtraCallback = "v3/account/primary/update")
    @gf
    writeRaw<AdOptionsViewApi> onExtraCallback(@getUserCertList @NotNull AdComponentViewApiProvider adComponentViewApiProvider);

    @getIv8(onExtraCallback = "v3/accounts/bank/prepare/withdraw-agreement")
    @gf
    writeRaw<setButtonColor> onExtraCallback(@getUserCertList @NotNull setAutoplay setautoplay);

    @getIv8(onExtraCallback = "v3/accounts/joint/link")
    @getUserCertOnMemory
    @gf
    writeRaw<BaseApiResponse<String>> onExtraCallbackWithResult(@getCurCert(onExtraCallbackWithResult = "accountId") @Nullable Long l, @getCurCert(onExtraCallbackWithResult = "accountDetail") boolean z);

    @getIv8(onExtraCallback = "v3/accounts/joint/event/plan/create")
    @gf
    writeRaw<S2SRewardedInterstitialAdExtendedListener> onExtraCallbackWithResult(@getUserCertList @NotNull RewardedVideoAdRewardedVideoLoadAdConfig rewardedVideoAdRewardedVideoLoadAdConfig);

    @getIv8(onExtraCallback = "v3/accounts/open-banking/transition-accounts")
    @gf
    writeRaw<getTitleTextSize> onNavigationEvent();

    @getIv8(onExtraCallback = "v3/accounts/joint/members/add")
    @gf
    JsonReaderUnknownNumberParsing<SimpleDraweeView> onWarmupCompleted(@getUserCertList @NotNull RewardedVideoAdExtendedListener rewardedVideoAdExtendedListener);

    @getIv8(onExtraCallback = "v3/accounts/joint/event/plan/delete")
    @getUserCertOnMemory
    @gf
    writeRaw<SimpleDraweeView> onWarmupCompleted(@getCurCert(onExtraCallbackWithResult = "planId") long j);

    @getIv8(onExtraCallback = "v3/accounts/joint/event/plan/list")
    @getUserCertOnMemory
    @gf
    writeRaw<RewardedVideoAdListener> onWarmupCompleted(@getCurCert(onExtraCallbackWithResult = "accountId") @NotNull String str);

    static /* synthetic */ writeRaw onWarmupCompleted(getBidderToken getbiddertoken, Long l, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getJointShareLink");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return getbiddertoken.onExtraCallbackWithResult(l, z);
    }
}
