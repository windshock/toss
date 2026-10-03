package o;

import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.verify.guest.GuestAddCertifyRequest;
import viva.republica.toss.network.model.verify.guest.GuestUnderFourteenGuardianAgreementCountResponse;
import viva.republica.toss.network.model.verify.guest.GuestUnderFourteenGuardianSmsResponse;
import viva.republica.toss.network.model.verify.guest.GuestUnderFourteenSessionRequest;
import viva.republica.toss.network.model.verify.guest.GuestUnderFourteenSignUpFailReasonRequest;
import viva.republica.toss.network.model.verify.guest.GuestUnderFourteenUnblockOneLinkResponse;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface shouldAllowBackgroundPlayback {
    @getIv8(onExtraCallback = "v3/verify/guest/session/legal-representative/sign-up-agreement/sms")
    Object IAuthTabCallback(@getUserCertList @NotNull GuestUnderFourteenSessionRequest guestUnderFourteenSessionRequest, @NotNull access13800<? super BaseApiResponse<GuestUnderFourteenGuardianSmsResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/session/legal-representative-consent/remaining-time")
    @gf
    writeRaw<BaseApiResponse<getJavaScriptContext>> IAuthTabCallback(@getUserCertList @NotNull lambdadestroy1 lambdadestroy1Var);

    @getIv8(onExtraCallback = "v3/verify/guest/session/add/legal-representative-consent")
    @gf
    writeRaw<BaseApiResponse<Boolean>> IAuthTabCallback(@getUserCertList @NotNull GuestAddCertifyRequest guestAddCertifyRequest);

    @getIv8(onExtraCallback = "v3/verify/guest/session/legal-representative/family-relations/verification")
    @gf
    writeRaw<BaseApiResponse<Object>> onExtraCallback(@getUserCertList @NotNull initializeBridge initializebridge);

    @getIv8(onExtraCallback = "v3/verify/guest/session/legal-representative/sign-up-request/unblock-onelink")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull GuestUnderFourteenSessionRequest guestUnderFourteenSessionRequest, @NotNull access13800<? super BaseApiResponse<GuestUnderFourteenUnblockOneLinkResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/sign-up-fail-reasons")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull GuestUnderFourteenSignUpFailReasonRequest guestUnderFourteenSignUpFailReasonRequest, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/session/expiration")
    @gf
    writeRaw<BaseApiResponse<lambdaonNativeException4>> onExtraCallbackWithResult(@getUserCertList @NotNull lambdadestroy1 lambdadestroy1Var);

    @getIv8(onExtraCallback = "v3/verify/guest/session/under-fourteen/funnel")
    @gf
    writeRaw<BaseApiResponse<jniRegisterSegment>> onNavigationEvent(@getUserCertList @NotNull decrementPendingJSCalls decrementpendingjscalls);

    @getIv8(onExtraCallback = "v3/verify/guest/session/legal-representative/family-relations/certificate/issuance/status")
    @gf
    writeRaw<BaseApiResponse<jniCallJSCallback>> onNavigationEvent(@getUserCertList @NotNull lambdadestroy1 lambdadestroy1Var);

    @getIv8(onExtraCallback = "v3/verify/guest/session/add/legal-representative-certify")
    @gf
    writeRaw<BaseApiResponse<Boolean>> onNavigationEvent(@getUserCertList @NotNull GuestAddCertifyRequest guestAddCertifyRequest);

    @getIv8(onExtraCallback = "v3/verify/guest/session/under-fourteen/remaining-sign-up-agreement-count")
    Object onWarmupCompleted(@getUserCertList @NotNull GuestUnderFourteenSessionRequest guestUnderFourteenSessionRequest, @NotNull access13800<? super BaseApiResponse<GuestUnderFourteenGuardianAgreementCountResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/family/notification/guardian/minor-sign-up-introduction-sms")
    @gf
    writeRaw<BaseApiResponse<Object>> onWarmupCompleted(@getUserCertList @NotNull NestmonNativeException nestmonNativeException);

    @getIv8(onExtraCallback = "v3/verify/guest/session/legal-representative/token")
    @gf
    writeRaw<BaseApiResponse<String>> onWarmupCompleted(@getUserCertList @NotNull jniLoadScriptFromFile jniloadscriptfromfile);

    @getIv8(onExtraCallback = "v3/verify/guest/session/legal-representative/send-sign-up-agreement-link")
    @gf
    writeRaw<BaseApiResponse<getTurboModuleRegistry>> onWarmupCompleted(@getUserCertList @NotNull jniSetSourceURL jnisetsourceurl);

    @getIv8(onExtraCallback = "v3/verify/guest/session/legal-representative/family-relations")
    @gf
    writeRaw<BaseApiResponse<lambdadestroy2>> onWarmupCompleted(@getUserCertList @NotNull lambdadestroy1 lambdadestroy1Var);
}
