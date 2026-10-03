package o;

import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.cardsales.verify.VerifyDriverLicenseRequest;
import viva.republica.toss.network.model.cardsales.verify.VerifyIdCardResponse;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface initializeSelf {
    @getIv8(onExtraCallback = "v3/card-sales/verify/resident-card")
    @gf
    Object onWarmupCompleted(@getUserCertList @NotNull RetryManager retryManager, @NotNull access13800<? super BaseApiResponse<VerifyIdCardResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/card-sales/verify/driver-license")
    Object onWarmupCompleted(@getUserCertList @NotNull VerifyDriverLicenseRequest verifyDriverLicenseRequest, @NotNull access13800<? super BaseApiResponse<VerifyIdCardResponse>> access13800Var);
}
