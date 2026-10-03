package o;

import im.toss.features.verify.kakao.KakaoAuthenticateResponse;
import im.toss.features.verify.kftcpassword.model.network.request.GuestAddBankAccountVerifyRequest;
import im.toss.features.verify.kftcpassword.model.network.request.GuestGaNoSessionKeyRequest;
import im.toss.features.verify.kftcpassword.model.network.request.GuestRegisterVerifyKftcPasswordRequest;
import im.toss.features.verify.kftcpassword.model.network.response.GaNoSessionKeyResponse;
import im.toss.features.verify.kftcpassword.model.network.response.RegisterVerifyKftcPasswordResponse;
import im.toss.features.verify.login.PasskeyAuthenticateRequest;
import im.toss.features.verify.login.PasskeyAuthenticateResponse;
import im.toss.features.verify.login.PasskeyAuthenticationChallengeRequest;
import im.toss.features.verify.login.PasskeyAuthenticationChallengeResponse;
import im.toss.features.verify.oneclicklogin.model.network.request.AvailableLoginTokenRequest;
import im.toss.features.verify.oneclicklogin.model.network.request.ExpireLoginTokenRequest;
import im.toss.features.verify.oneclicklogin.model.network.request.FindLoginTokenRequest;
import im.toss.features.verify.oneclicklogin.model.network.request.GuestSessionIdRequest;
import im.toss.features.verify.oneclicklogin.model.network.request.LoginTokenVerifyRequest;
import im.toss.features.verify.oneclicklogin.model.network.request.SmsPossessionResendRequest;
import im.toss.features.verify.oneclicklogin.model.network.request.SmsPossessionSendRequest;
import im.toss.features.verify.oneclicklogin.model.network.request.SmsPossessionVerifyRequest;
import im.toss.features.verify.oneclicklogin.model.network.request.ValidateLoginTokenRequest;
import im.toss.features.verify.oneclicklogin.model.network.request.VerifiedLoginTokenInfoRequest;
import im.toss.features.verify.oneclicklogin.model.network.response.LoginTokenVerifyResponse;
import im.toss.features.verify.oneclicklogin.model.network.response.SmsPossessionSendResponse;
import im.toss.features.verify.oneclicklogin.model.network.response.SmsPossessionVerifyResponse;
import im.toss.features.verify.oneclicklogin.model.network.response.UserInfoFromVerifiedLoginTokenResponse;
import im.toss.features.verify.request.RequesterInfoRequest;
import im.toss.features.verify.response.PassportStatusResponse;
import im.toss.features.verify.response.PublicKeyResponse;
import im.toss.features.verify.response.VerifyIdResponse;
import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.verify.BankAccountHolderResponse;
import viva.republica.toss.network.model.verify.OverseasKoreanPassportRegisterInfoRequest;
import viva.republica.toss.network.model.verify.PrepareSessionRequest;
import viva.republica.toss.network.model.verify.PrepareSessionResponse;
import viva.republica.toss.network.model.verify.VerifyTokenResponse;
import viva.republica.toss.network.model.verify.guest.GuestAddCertifyRequest;
import viva.republica.toss.network.model.verify.guest.GuestAddPossessionRequest;
import viva.republica.toss.network.model.verify.guest.GuestIdRequest;
import viva.republica.toss.network.model.verify.guest.SignInRequest;
import viva.republica.toss.network.model.verify.guest.SignInResponse;
import viva.republica.toss.network.model.verify.guest.SignReadyResponse;
import viva.republica.toss.network.model.verify.guest.SignUpRequest;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface setVolume {
    @getIv8(onExtraCallback = "v3/verify/guest/certify/login-token/verify/phones")
    Object IAuthTabCallback(@getUserCertList @NotNull LoginTokenVerifyRequest loginTokenVerifyRequest, @NotNull access13800<? super BaseApiResponse<LoginTokenVerifyResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/certify/login-token/info")
    Object IAuthTabCallback(@getUserCertList @NotNull VerifiedLoginTokenInfoRequest verifiedLoginTokenInfoRequest, @NotNull access13800<? super BaseApiResponse<UserInfoFromVerifiedLoginTokenResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/verify/overseas-korean/passport/status")
    @getUserCertOnMemory
    Object IAuthTabCallback(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getCurCert(onExtraCallbackWithResult = "verifyId") long j, @NotNull access13800<? super BaseApiResponse<PassportStatusResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/key-pair/generate")
    Object IAuthTabCallback(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getUserCertList @NotNull RequesterInfoRequest requesterInfoRequest, @NotNull access13800<? super BaseApiResponse<PublicKeyResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/verify/overseas-korean/passport/ocr")
    @gf
    Object IAuthTabCallback(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getUserCertList @NotNull setGlobalVariable setglobalvariable, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/certify/telco/sms/send-with-jumin-no")
    @gf
    Object IAuthTabCallback(@getUserCertList @NotNull AUTextSizeGearGetter aUTextSizeGearGetter, @NotNull access13800<? super BaseApiResponse<AUViewGroupInterface>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/certify/telco/sms/resend")
    @gf
    Object IAuthTabCallback(@getUserCertList @NotNull refreshViewWhenChangeMode refreshviewwhenchangemode, @NotNull access13800<? super BaseApiResponse<AUViewGroupInterface>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/verify/bankaccount/deposit/verify")
    @gf
    writeRaw<BaseApiResponse<BridgeReactContext>> IAuthTabCallback(@getUserCertList @NotNull getJSCallInvokerHolder getjscallinvokerholder);

    @getIv8(onExtraCallback = "v3/verify/guest/session/sign-in/reset-pwd")
    writeRaw<BaseApiResponse<SignInResponse>> IAuthTabCallback(@getUserCertList @NotNull SignInRequest signInRequest);

    @getIv8(onExtraCallback = "v3/verify/guest/session/add/kftc-account-password")
    Object onExtraCallback(@getUserCertList @NotNull GuestAddBankAccountVerifyRequest guestAddBankAccountVerifyRequest, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/ga-no-session-key/issue")
    Object onExtraCallback(@getUserCertList @NotNull GuestGaNoSessionKeyRequest guestGaNoSessionKeyRequest, @NotNull access13800<? super BaseApiResponse<GaNoSessionKeyResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/pass-key/authenticate")
    Object onExtraCallback(@getUserCertList @NotNull PasskeyAuthenticateRequest passkeyAuthenticateRequest, @NotNull access13800<? super BaseApiResponse<PasskeyAuthenticateResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/login-token/expire/by-token")
    Object onExtraCallback(@getUserCertList @NotNull ExpireLoginTokenRequest expireLoginTokenRequest, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/phone/sms-possession/verify")
    Object onExtraCallback(@getUserCertList @NotNull SmsPossessionVerifyRequest smsPossessionVerifyRequest, @NotNull access13800<? super BaseApiResponse<SmsPossessionVerifyResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/verify/session/add/real-name-verify")
    @getUserCertOnMemory
    Object onExtraCallback(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getCurCert(onExtraCallbackWithResult = "verifyId") long j, @getCurCert(onExtraCallbackWithResult = "sessionId") long j2, @getCurCert(onExtraCallbackWithResult = "verifyType") @NotNull String str2, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/verify/overseas-korean/passport/nfc")
    @gf
    Object onExtraCallback(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getUserCertList @NotNull setGlobalVariable setglobalvariable, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/verify/overseas-korean/passport/register-info")
    Object onExtraCallback(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getUserCertList @NotNull OverseasKoreanPassportRegisterInfoRequest overseasKoreanPassportRegisterInfoRequest, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/certify/telco/sms/verify")
    @gf
    Object onExtraCallback(@getUserCertList @NotNull getIconfontBundle geticonfontbundle, @NotNull access13800<? super BaseApiResponse<IconfontInterface>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/verify/uss-cards/first-half-password")
    @gf
    writeRaw<BaseApiResponse<Object>> onExtraCallback(@getUserCertList @NotNull runJSBundle runjsbundle);

    @getIv8(onExtraCallback = "v3/verify/guest/session/add/possession")
    @gf
    writeRaw<BaseApiResponse<Boolean>> onExtraCallback(@getUserCertList @NotNull GuestAddPossessionRequest guestAddPossessionRequest);

    @getIv8(onExtraCallback = "v3/verify/guest/session/sign-up")
    writeRaw<BaseApiResponse<SignInResponse>> onExtraCallback(@getUserCertList @NotNull SignUpRequest signUpRequest);

    @getIv8(onExtraCallback = "v3/verify/guest/pass-key/authenticate/challenge")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull PasskeyAuthenticationChallengeRequest passkeyAuthenticationChallengeRequest, @NotNull access13800<? super BaseApiResponse<PasskeyAuthenticationChallengeResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/find/login-token")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull FindLoginTokenRequest findLoginTokenRequest, @NotNull access13800<? super BaseApiResponse<String>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/phone/sms-possession/send")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull SmsPossessionSendRequest smsPossessionSendRequest, @NotNull access13800<? super BaseApiResponse<SmsPossessionSendResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/verify/session/verify/token")
    @getUserCertOnMemory
    Object onExtraCallbackWithResult(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getCurCert(onExtraCallbackWithResult = "sessionId") long j, @NotNull access13800<? super BaseApiResponse<VerifyTokenResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/verify/overseas-korean/passport/check-info")
    @gf
    Object onExtraCallbackWithResult(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getUserCertList @NotNull setGlobalVariable setglobalvariable, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/verify/session/prepare")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull PrepareSessionRequest prepareSessionRequest, @NotNull access13800<? super BaseApiResponse<PrepareSessionResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/common/policy/possession-method")
    @getUserCertOnMemory
    @gf
    writeRaw<BaseApiResponse<jniLoadScriptFromAssets>> onExtraCallbackWithResult(@getCurCert(onExtraCallbackWithResult = "usimCount") int i, @getCurCert(onExtraCallbackWithResult = "networkType") @NotNull String str, @getCurCert(onExtraCallbackWithResult = "requesterCode") @NotNull String str2);

    @getIv8(onExtraCallback = "v3/verify/guest/verify/phone/sim/verify")
    @gf
    writeRaw<BaseApiResponse<updateWidth>> onExtraCallbackWithResult(@getUserCertList @NotNull r8lambdaB8sg4u3acBcQ1pHLgIU_Ys5BFko r8lambdab8sg4u3acbcq1phlgiu_ys5bfko);

    @getIv8(onExtraCallback = "v3/verify/guest/verify/bankaccount/deposit/send")
    @gf
    writeRaw<BaseApiResponse<getFabricUIManager>> onExtraCallbackWithResult(@getUserCertList @NotNull raiseCatalystInstanceMissingException raisecatalystinstancemissingexception);

    @getIv8(onExtraCallback = "v3/verify/guest/verify/phone/ars-possession/prepare")
    @gf
    writeRaw<BaseApiResponse<isViewAllVisible>> onExtraCallbackWithResult(@getUserCertList @NotNull setLoadingText setloadingtext);

    @getIv8(onExtraCallback = "v3/verify/guest/session/add/certify-v2")
    @gf
    writeRaw<BaseApiResponse<Boolean>> onExtraCallbackWithResult(@getUserCertList @NotNull GuestAddCertifyRequest guestAddCertifyRequest);

    @getIv8(onExtraCallback = "v3/verify/guest/session/sign-in")
    writeRaw<BaseApiResponse<SignInResponse>> onExtraCallbackWithResult(@getUserCertList @NotNull SignInRequest signInRequest);

    @getIv8(onExtraCallback = "v3/verify/guest/verify/kftc-account-password")
    Object onNavigationEvent(@getUserCertList @NotNull GuestRegisterVerifyKftcPasswordRequest guestRegisterVerifyKftcPasswordRequest, @NotNull access13800<? super BaseApiResponse<RegisterVerifyKftcPasswordResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/login-token/available")
    Object onNavigationEvent(@getUserCertList @NotNull AvailableLoginTokenRequest availableLoginTokenRequest, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/login-token/validate")
    Object onNavigationEvent(@getUserCertList @NotNull ValidateLoginTokenRequest validateLoginTokenRequest, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/verify/guest/pass-key/expire")
    @getUserCertOnMemory
    Object onNavigationEvent(@getCurCert(onExtraCallbackWithResult = "credentialId") @NotNull String str, @getCurCert(onExtraCallbackWithResult = "reason") @NotNull String str2, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/session/sign-ready")
    Object onNavigationEvent(@getUserCertList @NotNull GuestIdRequest guestIdRequest, @NotNull access13800<? super BaseApiResponse<SignReadyResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/verify/bankaccount/holder/owner")
    @gf
    writeRaw<BaseApiResponse<BankAccountHolderResponse>> onNavigationEvent(@getUserCertList @NotNull getCatalystInstance getcatalystinstance);

    @getIv8(onExtraCallback = "v3/verify/guest/verify/phone/ars-possession/verify")
    @gf
    writeRaw<BaseApiResponse<canOverrideExistingModule>> onNavigationEvent(@getUserCertList @NotNull r8lambdaB8sg4u3acBcQ1pHLgIU_Ys5BFko r8lambdab8sg4u3acbcq1phlgiu_ys5bfko);

    @getIv8(onExtraCallback = "v3/verify/guest/session/sign-in/pre-check")
    writeRaw<BaseApiResponse<Object>> onNavigationEvent(@getUserCertList @NotNull SignInRequest signInRequest);

    @getIv8(onExtraCallback = "v3/verify/guest/kakao/authenticate")
    @getUserCertOnMemory
    Object onWarmupCompleted(@getCurCert(onExtraCallbackWithResult = "guestSessionId") long j, @getCurCert(onExtraCallbackWithResult = "accessToken") @NotNull String str, @NotNull access13800<? super BaseApiResponse<KakaoAuthenticateResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/login-token/consent")
    Object onWarmupCompleted(@getUserCertList @NotNull GuestSessionIdRequest guestSessionIdRequest, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/phone/sms-possession/resend")
    Object onWarmupCompleted(@getUserCertList @NotNull SmsPossessionResendRequest smsPossessionResendRequest, @NotNull access13800<? super BaseApiResponse<SmsPossessionSendResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/verify/overseas-korean/passport/identity-verify")
    @getUserCertOnMemory
    Object onWarmupCompleted(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getCurCert(onExtraCallbackWithResult = "verifyId") long j, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/verify/overseas-korean/prepare")
    Object onWarmupCompleted(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getUserCertList @NotNull RequesterInfoRequest requesterInfoRequest, @NotNull access13800<? super BaseApiResponse<VerifyIdResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/verify/overseas-korean/passport/selfie")
    @gf
    Object onWarmupCompleted(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getUserCertList @NotNull setGlobalVariable setglobalvariable, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3.1/verify/guest/session/init")
    @gf
    Object onWarmupCompleted(@getUserCertList @NotNull getRuntimeExecutor getruntimeexecutor, @NotNull access13800<? super BaseApiResponse<handleException>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/guest/session/add/bank-deposit")
    @gf
    writeRaw<BaseApiResponse<Boolean>> onWarmupCompleted(@getUserCertList @NotNull incrementPendingJSCalls incrementpendingjscalls);

    @getIv8(onExtraCallback = "v3/verify/guest/verify/phone/ars-possession/call")
    @gf
    writeRaw<BaseApiResponse<Boolean>> onWarmupCompleted(@getUserCertList @NotNull r8lambdaB8sg4u3acBcQ1pHLgIU_Ys5BFko r8lambdab8sg4u3acbcq1phlgiu_ys5bfko);

    @getIv8(onExtraCallback = "v3/verify/guest/verify/phone/sim/prepare")
    @gf
    writeRaw<BaseApiResponse<getTextViews>> onWarmupCompleted(@getUserCertList @NotNull r8lambdaWVGSymTjDrUPQFbk5NU9tE6X74E r8lambdawvgsymtjdrupqfbk5nu9te6x74e);

    @getIv8(onExtraCallback = "v3/verify/guest/verify/uss-cards")
    @gf
    writeRaw<BaseApiResponse<getJSModule>> onWarmupCompleted(@getUserCertList @NotNull setFabricUIManager setfabricuimanager);

    @getIv8(onExtraCallback = "v3/verify/guest/verify/uss-cards/cvc")
    @gf
    writeRaw<BaseApiResponse<Object>> onWarmupCompleted(@getUserCertList @NotNull setTurboModuleRegistry setturbomoduleregistry);

    @getIv8(onExtraCallback = "v3/verify/guest/session/add/ext-certify")
    @gf
    writeRaw<BaseApiResponse<Boolean>> onWarmupCompleted(@getUserCertList @NotNull GuestAddCertifyRequest guestAddCertifyRequest);

    static /* synthetic */ Object onExtraCallbackWithResult(setVolume setvolume, String str, RequesterInfoRequest requesterInfoRequest, access13800 access13800Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareOverseasSession");
        }
        if ((i & 1) != 0) {
            str = "SV-TCG";
        }
        return setvolume.onWarmupCompleted(str, requesterInfoRequest, (access13800<? super BaseApiResponse<VerifyIdResponse>>) access13800Var);
    }

    static /* synthetic */ Object onExtraCallback(setVolume setvolume, String str, long j, access13800 access13800Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkVerifyPassportStatus");
        }
        if ((i & 1) != 0) {
            str = "SV-TCG";
        }
        return setvolume.IAuthTabCallback(str, j, (access13800<? super BaseApiResponse<PassportStatusResponse>>) access13800Var);
    }

    static /* synthetic */ Object onNavigationEvent(setVolume setvolume, String str, OverseasKoreanPassportRegisterInfoRequest overseasKoreanPassportRegisterInfoRequest, access13800 access13800Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerPassportInfo");
        }
        if ((i & 1) != 0) {
            str = "SV-TCG";
        }
        return setvolume.onExtraCallback(str, overseasKoreanPassportRegisterInfoRequest, (access13800<? super BaseApiResponse<Object>>) access13800Var);
    }

    static /* synthetic */ Object onExtraCallback(setVolume setvolume, String str, setGlobalVariable setglobalvariable, access13800 access13800Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkPassportInfo");
        }
        if ((i & 1) != 0) {
            str = "SV-TCG";
        }
        return setvolume.onExtraCallbackWithResult(str, setglobalvariable, (access13800<? super BaseApiResponse<Object>>) access13800Var);
    }

    static /* synthetic */ Object IAuthTabCallback(setVolume setvolume, String str, setGlobalVariable setglobalvariable, access13800 access13800Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendOcrPassportResult");
        }
        if ((i & 1) != 0) {
            str = "SV-TCG";
        }
        return setvolume.IAuthTabCallback(str, setglobalvariable, (access13800<? super BaseApiResponse<Object>>) access13800Var);
    }

    static /* synthetic */ Object onNavigationEvent(setVolume setvolume, String str, setGlobalVariable setglobalvariable, access13800 access13800Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendNfcPassportResult");
        }
        if ((i & 1) != 0) {
            str = "SV-TCG";
        }
        return setvolume.onExtraCallback(str, setglobalvariable, (access13800<? super BaseApiResponse<Object>>) access13800Var);
    }

    static /* synthetic */ Object onExtraCallbackWithResult(setVolume setvolume, String str, setGlobalVariable setglobalvariable, access13800 access13800Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendSelfiePassportResult");
        }
        if ((i & 1) != 0) {
            str = "SV-TCG";
        }
        return setvolume.onWarmupCompleted(str, setglobalvariable, (access13800<? super BaseApiResponse<Object>>) access13800Var);
    }

    static /* synthetic */ Object onWarmupCompleted(setVolume setvolume, String str, long j, access13800 access13800Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: identityVerify");
        }
        if ((i & 1) != 0) {
            str = "SV-TCG";
        }
        return setvolume.onWarmupCompleted(str, j, (access13800<? super BaseApiResponse<Object>>) access13800Var);
    }

    static /* synthetic */ Object onWarmupCompleted(setVolume setvolume, String str, RequesterInfoRequest requesterInfoRequest, access13800 access13800Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateKeyPair");
        }
        if ((i & 1) != 0) {
            str = "SV-TCG";
        }
        return setvolume.IAuthTabCallback(str, requesterInfoRequest, (access13800<? super BaseApiResponse<PublicKeyResponse>>) access13800Var);
    }

    static /* synthetic */ Object onNavigationEvent(setVolume setvolume, String str, long j, long j2, String str2, access13800 access13800Var, int i, Object obj) {
        if (obj == null) {
            return setvolume.onExtraCallback((i & 1) != 0 ? "SV-TCG" : str, j, j2, str2, access13800Var);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRealNameVerify");
    }

    static /* synthetic */ Object IAuthTabCallback(setVolume setvolume, String str, long j, access13800 access13800Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVerifyToken");
        }
        if ((i & 1) != 0) {
            str = "SV-TCG";
        }
        return setvolume.onExtraCallbackWithResult(str, j, (access13800<? super BaseApiResponse<VerifyTokenResponse>>) access13800Var);
    }
}
