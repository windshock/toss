package o;

import im.toss.network.model.BaseApiResponse;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueSingleDigitArsRequest;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueSingleDigitArsResp;
import viva.republica.toss.network.model.cardsales.funnel.CheckOcrResultReq;
import viva.republica.toss.network.model.cardsales.funnel.UploadImageReq;
import viva.republica.toss.network.model.cardsales.recommend.CreditTargetBanner;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface ExtraHints {
    @getIv8(onExtraCallback = "v3/card-sales/ocr-authenticity/{funnelId}")
    Object onExtraCallback(@getIvD(onNavigationEvent = "funnelId") @NotNull String str, @getUserCertList @NotNull CheckOcrResultReq checkOcrResultReq, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/card-sales/auth/ars/call")
    Object onExtraCallback(@getUserCertList @NotNull CardIssueSingleDigitArsRequest cardIssueSingleDigitArsRequest, @NotNull access13800<? super BaseApiResponse<CardIssueSingleDigitArsResp>> access13800Var);

    @getIv8(onExtraCallback = "v3/card-sales/apply/upload-idcard-ocr-image")
    Object onExtraCallback(@getUserCertList @NotNull UploadImageReq uploadImageReq, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/card-sales/credit-banner-v2")
    writeRaw<BaseApiResponse<List<CreditTargetBanner>>> onNavigationEvent(@getKey4(onNavigationEvent = "lastViewedBannerId") @Nullable Integer num);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/card-sales/auth/ars/{arsRequestId}/report")
    Object onWarmupCompleted(@getIvD(onNavigationEvent = "arsRequestId") @NotNull String str, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/card-sales/apply/funnel/{funnelId}/verify/address/detail")
    @gf
    Object onWarmupCompleted(@getIvD(onNavigationEvent = "funnelId") @NotNull String str, @getUserCertList @NotNull warnAtMillis warnatmillis, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/card-sales/apply/check-real-name")
    @gf
    Object onWarmupCompleted(@getUserCertList @NotNull NativeAdViewTypeApi nativeAdViewTypeApi, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);
}
