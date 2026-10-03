package o;

import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.verify.guest.SignInResponse;
import viva.republica.toss.network.model.verify.guest.VisitorSignInRequest;
import viva.republica.toss.network.model.verify.guest.VisitorSignUpRequest;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface getNativeAdApi {
    @getIv8(onExtraCallback = "v3/visitor/guest/sign-in/reset-password")
    writeRaw<BaseApiResponse<SignInResponse>> onExtraCallback(@getUserCertList @NotNull VisitorSignInRequest visitorSignInRequest);

    @getIv8(onExtraCallback = "v3/visitor/guest/sign-in/validate-password")
    writeRaw<BaseApiResponse<Object>> onNavigationEvent(@getUserCertList @NotNull VisitorSignInRequest visitorSignInRequest);

    @getIv8(onExtraCallback = "v3/visitor/guest/sign-up")
    writeRaw<BaseApiResponse<SignInResponse>> onNavigationEvent(@getUserCertList @NotNull VisitorSignUpRequest visitorSignUpRequest);

    @getIv8(onExtraCallback = "v3/visitor/guest/sign-in")
    writeRaw<BaseApiResponse<SignInResponse>> onWarmupCompleted(@getUserCertList @NotNull VisitorSignInRequest visitorSignInRequest);
}
