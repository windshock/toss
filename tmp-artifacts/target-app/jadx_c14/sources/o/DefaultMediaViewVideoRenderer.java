package o;

import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueFinCertPrepareRequest;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueFinCertPrepareResp;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueFinCertResultRequest;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueFinCertResultResp;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueTossCertPrepareRequest;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueTossCertResp;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueTossCertResultRequest;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueTossCertStatusResp;
import viva.republica.toss.network.model.checkcard.RecommendedEnglishNameResponse;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface DefaultMediaViewVideoRenderer {
    @getIv8(onExtraCallback = "v3/card-sales/apply/funnel/{funnelId}/verify-password")
    @gf
    writeRaw<BaseApiResponse<setPrimaryTextColor>> IAuthTabCallback(@getIvD(onNavigationEvent = "funnelId") @NotNull String str, @getUserCertList @NotNull getFBLoginASID getfbloginasid);

    @getIv8(onExtraCallback = "v3/card-sales/apply/sms-auth/verify")
    @gf
    writeRaw<BaseApiResponse<NativeComponentTagApi>> IAuthTabCallback(@getUserCertList @NotNull NativeBannerAdViewApi nativeBannerAdViewApi);

    @getIv8(onExtraCallback = "v3/card-sales/apply/funnel/{funnelId}/submit")
    @gf
    Object onExtraCallback(@getIvD(onNavigationEvent = "funnelId") @NotNull String str, @getUserCertList @NotNull failAtMillis failatmillis, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/card-sales/apply/sign/prepare-fincert-signature")
    Object onExtraCallback(@getUserCertList @NotNull CardIssueFinCertPrepareRequest cardIssueFinCertPrepareRequest, @NotNull access13800<? super BaseApiResponse<CardIssueFinCertPrepareResp>> access13800Var);

    @getIv8(onExtraCallback = "v3/card-sales/apply/sign/result")
    Object onExtraCallback(@getUserCertList @NotNull CardIssueTossCertResultRequest cardIssueTossCertResultRequest, @NotNull access13800<? super BaseApiResponse<CardIssueTossCertStatusResp>> access13800Var);

    @getIv8(onExtraCallback = "v3/card-sales/apply/polling")
    @getUserCertOnMemory
    @gf
    writeRaw<BaseApiResponse<Boolean>> onExtraCallback(@getCurCert(onExtraCallbackWithResult = "targetJobId") @NotNull String str);

    @getIv8(onExtraCallback = "v3/card-sales/apply/sign/fincert-result")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull CardIssueFinCertResultRequest cardIssueFinCertResultRequest, @NotNull access13800<? super BaseApiResponse<CardIssueFinCertResultResp>> access13800Var);

    @getIv8(onExtraCallback = "v3/card-sales/apply/funnel/{funnelId}/cancel/{sessionId}")
    @gf
    writeRaw<BaseApiResponse<Boolean>> onExtraCallbackWithResult(@getIvD(onNavigationEvent = "funnelId") @NotNull String str, @getIvD(onNavigationEvent = "sessionId") @Nullable String str2);

    @getIv8(onExtraCallback = "v3/card-sales/apply/funnel/{funnelId}")
    @gf
    writeRaw<BaseApiResponse<NativeAdViewAttributesApi>> onExtraCallbackWithResult(@getIvD(onNavigationEvent = "funnelId") @NotNull String str, @getUserCertList @NotNull failAtMillis failatmillis);

    @getIv8(onExtraCallback = "v3/card-sales/apply/sign/prepare-toss-signature")
    Object onNavigationEvent(@getUserCertList @NotNull CardIssueTossCertPrepareRequest cardIssueTossCertPrepareRequest, @NotNull access13800<? super BaseApiResponse<CardIssueTossCertResp>> access13800Var);

    @getIv8(onExtraCallback = "v3/card-sales/apply/issue/english-name")
    @gf
    writeRaw<BaseApiResponse<RecommendedEnglishNameResponse>> onNavigationEvent();

    @getIv8(onExtraCallback = "v3/card-sales/apply/funnel/{funnelId}/save")
    @gf
    writeRaw<BaseApiResponse<Object>> onNavigationEvent(@getIvD(onNavigationEvent = "funnelId") @NotNull String str, @getUserCertList @NotNull NativeBannerAdApi nativeBannerAdApi);

    @getIv8(onExtraCallback = "v3/card-sales/apply/sms-auth/send")
    @gf
    writeRaw<BaseApiResponse<setNativeOption>> onNavigationEvent(@getUserCertList @NotNull setSecondaryTextColor setsecondarytextcolor);

    @getIv8(onExtraCallback = "v3/card-sales/apply/funnel/{funnelId}/submit-result")
    @gf
    Object onWarmupCompleted(@getIvD(onNavigationEvent = "funnelId") @NotNull String str, @getUserCertList @NotNull failAtMillis failatmillis, @NotNull access13800<? super BaseApiResponse<RewardedInterstitialAdApi>> access13800Var);
}
