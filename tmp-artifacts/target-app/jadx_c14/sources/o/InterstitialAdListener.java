package o;

import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.bank.TossBankIdCardValidationRequest;
import viva.republica.toss.network.model.bank.TossBankIdCardValidationResponse;
import viva.republica.toss.network.model.bank.TossBankUserToken;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface InterstitialAdListener {
    @getIv8(onExtraCallback = "idcard-backend/model-inference/idcard-ocr-with-validation")
    Object IAuthTabCallback(@getUserCertList @NotNull TossBankIdCardValidationRequest tossBankIdCardValidationRequest, @NotNull access13800<? super BaseApiResponse<TossBankIdCardValidationResponse>> access13800Var);

    @getIv8(onExtraCallback = "auth/v2/issue/user-token")
    @getUserCertOnMemory
    Object onExtraCallback(@getCurCert(onExtraCallbackWithResult = "authToken") @NotNull String str, @NotNull access13800<? super BaseApiResponse<TossBankUserToken>> access13800Var);

    @getIv8(onExtraCallback = "auth/issue/user-token")
    @getUserCertOnMemory
    Object onExtraCallbackWithResult(@getCurCert(onExtraCallbackWithResult = "authToken") @NotNull String str, @NotNull access13800<? super BaseApiResponse<TossBankUserToken>> access13800Var);

    @getIv8(onExtraCallback = "openbanking/external-accounts/get-collection-agreed")
    @gf
    Object onNavigationEvent(@getUserCertList @NotNull getDefStyleAttr getdefstyleattr, @NotNull access13800<? super BaseApiResponse<AdViewApi>> access13800Var);
}
