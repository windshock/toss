package o;

import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.verify.PasswordPolicyResponse;
import viva.republica.toss.network.model.verify.guest.GlobalCrossRegionSignUpRequest;
import viva.republica.toss.network.model.verify.guest.GlobalCrossRegionSignUpWithResetPasswordRequest;
import viva.republica.toss.network.model.verify.guest.GlobalSignInRequest;
import viva.republica.toss.network.model.verify.guest.GlobalSignUpRequest;
import viva.republica.toss.network.model.verify.guest.SignInResponse;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface onVolumeChanged {
    @getIv8(onExtraCallback = "v3/verify/guest/cross-region-onboarding/sign-up")
    writeRaw<BaseApiResponse<SignInResponse>> IAuthTabCallback(@getUserCertList @NotNull GlobalCrossRegionSignUpRequest globalCrossRegionSignUpRequest);

    @getIv8(onExtraCallback = "v3/verify/guest/cross-region-onboarding/sign-up-with-reset-password")
    writeRaw<BaseApiResponse<SignInResponse>> IAuthTabCallback(@getUserCertList @NotNull GlobalCrossRegionSignUpWithResetPasswordRequest globalCrossRegionSignUpWithResetPasswordRequest);

    @getIv8(onExtraCallback = "v3/verify/guest/onboarding/sign-in/verify-password")
    writeRaw<BaseApiResponse<Object>> IAuthTabCallback(@getUserCertList @NotNull GlobalSignInRequest globalSignInRequest);

    @getIv8(onExtraCallback = "v3/verify/guest/onboarding/sign-in-with-reset-password")
    writeRaw<BaseApiResponse<SignInResponse>> onExtraCallback(@getUserCertList @NotNull GlobalSignInRequest globalSignInRequest);

    @getIv8(onExtraCallback = "v3/verify/guest/onboarding/password-policy")
    @getUserCertOnMemory
    writeRaw<BaseApiResponse<PasswordPolicyResponse>> onExtraCallbackWithResult(@getCurCert(onExtraCallbackWithResult = "onboardingEventId") long j);

    @getIv8(onExtraCallback = "v3/verify/guest/onboarding/sign-up")
    writeRaw<BaseApiResponse<SignInResponse>> onExtraCallbackWithResult(@getUserCertList @NotNull GlobalSignUpRequest globalSignUpRequest);

    @getIv8(onExtraCallback = "v3/verify/guest/onboarding/sign-in")
    writeRaw<BaseApiResponse<SignInResponse>> onNavigationEvent(@getUserCertList @NotNull GlobalSignInRequest globalSignInRequest);
}
