package o;

import im.toss.features.ocr.model.OcrMaintenanceResponse;
import im.toss.features.ocr.network.request.FakeIdCardRequest;
import im.toss.features.ocr.network.request.GetPolicesRequest;
import im.toss.features.ocr.network.request.OcrManualVerifyPrepareRequest;
import im.toss.features.ocr.network.request.SsaModelFileInfoRequest;
import im.toss.features.ocr.network.response.BlockedResponse;
import im.toss.features.ocr.network.response.OcrManualVerifyIdCardResponse;
import im.toss.features.ocr.network.response.OcrManualVerifyPrepareResponse;
import im.toss.features.ocr.network.response.PoliciesResponse;
import im.toss.features.ocr.network.response.SsaModelFileInfoResponse;
import im.toss.features.verify.UnifiedPassportPrepareResponse;
import im.toss.features.verify.kftcpassword.model.network.request.GaNoSessionKeyRequest;
import im.toss.features.verify.kftcpassword.model.network.request.RegisterVerifyKftcPasswordRequest;
import im.toss.features.verify.kftcpassword.model.network.response.GaNoSessionKeyResponse;
import im.toss.features.verify.kftcpassword.model.network.response.RegisterVerifyKftcPasswordResponse;
import im.toss.features.verify.login.PasskeyRegistrationChallengeResponse;
import im.toss.features.verify.login.PasskeyRegistrationRequest;
import im.toss.features.verify.login.model.GetUserPassKeyResponse;
import im.toss.features.verify.login.model.TossplorePolicyRequest;
import im.toss.features.verify.login.model.TossplorePolicyResponse;
import im.toss.features.verify.login.tossplore.TossploreContentResourceContainerResponse;
import im.toss.features.verify.login.tossplore.TossploreContentResourceRequest;
import im.toss.features.verify.model.PassportPolicy;
import im.toss.features.verify.oneclicklogin.model.network.request.AvailableLoginTokenRequest;
import im.toss.features.verify.oneclicklogin.model.network.request.ExpireLoginTokenRequest;
import im.toss.features.verify.oneclicklogin.model.network.request.LoginTokenConsentRequest;
import im.toss.features.verify.oneclicklogin.model.network.request.LoginTokenReasonRequest;
import im.toss.features.verify.oneclicklogin.model.network.request.SmsPossessionResendRequest;
import im.toss.features.verify.oneclicklogin.model.network.request.SmsPossessionSendRequest;
import im.toss.features.verify.oneclicklogin.model.network.request.SmsPossessionVerifyRequest;
import im.toss.features.verify.oneclicklogin.model.network.response.LoginTokenResponse;
import im.toss.features.verify.oneclicklogin.model.network.response.SmsPossessionSendResponse;
import im.toss.features.verify.oneclicklogin.model.network.response.SmsPossessionVerifyResponse;
import im.toss.features.verify.request.AddSelfieVerifyRequest;
import im.toss.features.verify.request.IdentifyTokenVerificationRequest;
import im.toss.features.verify.request.PrepareSelfieRequest;
import im.toss.features.verify.request.PrepareSelfieResponse;
import im.toss.features.verify.request.RequesterInfoRequest;
import im.toss.features.verify.response.AutoVerifyAvailableBankAccountResp;
import im.toss.features.verify.response.NfcKeyResponse;
import im.toss.features.verify.response.PassportStatusResponse;
import im.toss.features.verify.response.PublicKeyResponse;
import im.toss.features.verify.response.RealNameVerifyMethodResponse;
import im.toss.features.verify.response.SessionVerifyPolicyResponse;
import im.toss.features.verify.response.VerifyIdResponse;
import im.toss.network.model.BaseApiResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.BankAccountHolderRequestWithSessionInfo;
import viva.republica.toss.network.model.verify.BankAccountHolderResponse;
import viva.republica.toss.network.model.verify.GenerateSaltResponse;
import viva.republica.toss.network.model.verify.LocaleRequest;
import viva.republica.toss.network.model.verify.LocaleResponse;
import viva.republica.toss.network.model.verify.PasswordPolicyResponse;
import viva.republica.toss.network.model.verify.PrepareSessionRequest;
import viva.republica.toss.network.model.verify.PrepareSessionResponse;
import viva.republica.toss.network.model.verify.ResetPasswordRequest;
import viva.republica.toss.network.model.verify.ResetPasswordResponse;
import viva.republica.toss.network.model.verify.VerifyTokenResponse;
import viva.republica.toss.network.model.verify.global.GlobalResetPasswordRequest;
import viva.republica.toss.network.model.verify.global.GlobalResetPasswordResponse;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface shouldAutoplay {
    public static final onExtraCallback Companion = onExtraCallback.onExtraCallbackWithResult;

    @getIv8(onExtraCallback = "v3/verify/unblock/session/info")
    @getUserCertOnMemory
    @gf
    Object IAuthTabCallback(@getCurCert(onExtraCallbackWithResult = "sessionId") long j, @NotNull access13800<? super BaseApiResponse<loadScriptFromFile>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/verify/kftc-account-password/verify")
    Object IAuthTabCallback(@getUserCertList @NotNull RegisterVerifyKftcPasswordRequest registerVerifyKftcPasswordRequest, @NotNull access13800<? super BaseApiResponse<RegisterVerifyKftcPasswordResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/tossplore/policy")
    Object IAuthTabCallback(@getUserCertList @NotNull TossplorePolicyRequest tossplorePolicyRequest, @NotNull access13800<? super BaseApiResponse<TossplorePolicyResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/login-token/expire")
    Object IAuthTabCallback(@getUserCertList @NotNull LoginTokenReasonRequest loginTokenReasonRequest, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3.1/verify-id-card/id-card/maintenance")
    Object IAuthTabCallback(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Id-Card-Cluster") @Nullable String str, @getCurCert(onExtraCallbackWithResult = "sessionId") long j, @getCurCert(onExtraCallbackWithResult = "sessionType") @NotNull String str2, @NotNull access13800<? super BaseApiResponse<OcrMaintenanceResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3.1/verify-id-card/passport/policy")
    @getUserCertOnMemory
    Object IAuthTabCallback(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Id-Card-Cluster") @Nullable String str, @getCurCert(onExtraCallbackWithResult = "verifyId") long j, @NotNull access13800<? super BaseApiResponse<PassportPolicy>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/common/key-pair/generate")
    Object IAuthTabCallback(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getUserCertList @NotNull RequesterInfoRequest requesterInfoRequest, @NotNull access13800<? super BaseApiResponse<PublicKeyResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3.1/verify-id-card/id-card/result")
    @gf
    Object IAuthTabCallback(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Id-Card-Cluster") @Nullable String str, @getUserCertList @NotNull r8lambdaB8sg4u3acBcQ1pHLgIU_Ys5BFko r8lambdab8sg4u3acbcq1phlgiu_ys5bfko, @NotNull access13800<? super BaseApiResponse<getSourceURL>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/verify/passport/check-info")
    @gf
    Object IAuthTabCallback(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getUserCertList @NotNull setGlobalVariable setglobalvariable, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/unblock/certify/selfie/image/upload")
    @gf
    Object IAuthTabCallback(@getUserCertList @NotNull AUSegmentExternalSyntheticLambda9 aUSegmentExternalSyntheticLambda9, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/certify/telco/sms/send-with-jumin-no")
    @gf
    Object IAuthTabCallback(@getUserCertList @NotNull AUTextSizeGearGetter aUTextSizeGearGetter, @NotNull access13800<? super BaseApiResponse<AUViewGroupInterface>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/unblock/certify/selfie/prepare")
    @gf
    Object IAuthTabCallback(@getUserCertList @NotNull CatalystInstanceImplExternalSyntheticLambda1 catalystInstanceImplExternalSyntheticLambda1, @NotNull access13800<? super BaseApiResponse<CatalystInstanceImplExternalSyntheticLambda4>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/pass-key/register/challenge")
    Object IAuthTabCallback(@NotNull access13800<? super BaseApiResponse<PasskeyRegistrationChallengeResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/user/session/add/bank-account-verify")
    @gf
    Object IAuthTabCallback(@getUserCertList @NotNull upDateTheme updatetheme, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/user/session/method/possession")
    @getUserCertOnMemory
    @gf
    writeRaw<BaseApiResponse<getTabViews>> IAuthTabCallback(@getCurCert(onExtraCallbackWithResult = "sessionId") long j);

    @getIv8(onExtraCallback = "v3/verify/verify/phone/ars-possession/prepare")
    @gf
    writeRaw<BaseApiResponse<isViewAllVisible>> IAuthTabCallback(@getUserCertList @NotNull CatalystInstance catalystInstance);

    @getIv8(onExtraCallback = "v3/verify/verify/bankaccount/deposit/verify")
    @gf
    writeRaw<BaseApiResponse<BridgeReactContext>> IAuthTabCallback(@getUserCertList @NotNull getJSCallInvokerHolder getjscallinvokerholder);

    @getIv8(onExtraCallback = "v3/verify/verify/domain/check")
    @gf
    writeRaw<BaseApiResponse<getReactQueueConfiguration>> IAuthTabCallback(@getUserCertList @NotNull getRuntimeScheduler getruntimescheduler);

    @getIv8(onExtraCallback = "v3/verify/verify/phone/ars-possession/verify")
    @gf
    writeRaw<BaseApiResponse<canOverrideExistingModule>> IAuthTabCallback(@getUserCertList @NotNull r8lambdaB8sg4u3acBcQ1pHLgIU_Ys5BFko r8lambdab8sg4u3acbcq1phlgiu_ys5bfko);

    @getIv8(onExtraCallback = "v3/verify/verify/phone/sim/prepare")
    @gf
    writeRaw<BaseApiResponse<getTextViews>> IAuthTabCallback(@getUserCertList @NotNull r8lambdaWVGSymTjDrUPQFbk5NU9tE6X74E r8lambdawvgsymtjdrupqfbk5nu9te6x74e);

    @getIv8(onExtraCallback = "v3/verify/verify/bankaccount/deposit/send")
    @gf
    writeRaw<BaseApiResponse<getFabricUIManager>> IAuthTabCallback(@getUserCertList @NotNull raiseCatalystInstanceMissingException raisecatalystinstancemissingexception);

    @getIv8(onExtraCallback = "v3/verify/user/action/reset-password")
    @gf
    writeRaw<BaseApiResponse<ResetPasswordResponse>> IAuthTabCallback(@getUserCertList @NotNull ResetPasswordRequest resetPasswordRequest);

    @getIv8(onExtraCallback = "v3/verify/verify/passport/status")
    @getUserCertOnMemory
    Object IAuthTabCallbackDefault(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getCurCert(onExtraCallbackWithResult = "verifyId") long j, @NotNull access13800<? super BaseApiResponse<PassportStatusResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3.1/verify-id-card/passport/ocr")
    @gf
    Object IAuthTabCallbackDefault(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Id-Card-Cluster") @Nullable String str, @getUserCertList @NotNull setGlobalVariable setglobalvariable, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/user/session/verify/token")
    @getUserCertOnMemory
    writeRaw<BaseApiResponse<VerifyTokenResponse>> IAuthTabCallbackDefault(@getCurCert(onExtraCallbackWithResult = "sessionId") long j);

    @getIv8(onExtraCallback = "v3/verify/verify/passport/policy")
    @getUserCertOnMemory
    Object IAuthTabCallbackStub(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getCurCert(onExtraCallbackWithResult = "verifyId") long j, @NotNull access13800<? super BaseApiResponse<PassportPolicy>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/verify/id-card/verify")
    @gf
    Object IAuthTabCallbackStub(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getUserCertList @NotNull setGlobalVariable setglobalvariable, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/unblock/session/prepare")
    @gf
    Object IAuthTabCallbackStub(@NotNull access13800<? super BaseApiResponse<loadScriptFromBytes>> access13800Var);

    @getIv8(onExtraCallback = "v3.1/verify-id-card/id-card/run-ocr")
    @gf
    Object access100(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Id-Card-Cluster") @Nullable String str, @getUserCertList @NotNull setGlobalVariable setglobalvariable, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3.1/verify/selfie/verify")
    @getUserCertOnMemory
    Object asBinder(@getCurCert(onExtraCallbackWithResult = "verifyId") long j, @NotNull access13800<? super BaseApiResponse<Unit>> access13800Var);

    @getIv8(onExtraCallback = "v3.1/verify-id-card/id-card/verify")
    @gf
    Object asBinder(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Id-Card-Cluster") @Nullable String str, @getUserCertList @NotNull setGlobalVariable setglobalvariable, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/verify/id-card/run-ocr")
    @gf
    Object asInterface(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getUserCertList @NotNull setGlobalVariable setglobalvariable, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/unblock/certify/selfie/verify")
    @getUserCertOnMemory
    @gf
    writeRaw<BaseApiResponse<CatalystInstanceImplExternalSyntheticLambda3>> asInterface(@getCurCert(onExtraCallbackWithResult = "unifiedId") long j);

    @getIv8(onExtraCallback = "v3/verify/user/session/method/pk-cert")
    @getUserCertOnMemory
    @gf
    Object onExtraCallback(@getCurCert(onExtraCallbackWithResult = "sessionId") long j, @NotNull access13800<? super BaseApiResponse<r8lambdarbWbMnjDb0uSDqCopmoVnMLsAXM>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/user/session/reuse/agreement")
    @getUserCertOnMemory
    @gf
    Object onExtraCallback(@getCurCert(onExtraCallbackWithResult = "sessionId") long j, @getCurCert(onExtraCallbackWithResult = "agree") boolean z, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/ga-no-session-key/issue")
    Object onExtraCallback(@getUserCertList @NotNull GaNoSessionKeyRequest gaNoSessionKeyRequest, @NotNull access13800<? super BaseApiResponse<GaNoSessionKeyResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/pass-key/register")
    Object onExtraCallback(@getUserCertList @NotNull PasskeyRegistrationRequest passkeyRegistrationRequest, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/tossplore/resources")
    Object onExtraCallback(@getUserCertList @NotNull TossploreContentResourceRequest tossploreContentResourceRequest, @NotNull access13800<? super BaseApiResponse<TossploreContentResourceContainerResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/verify/phone/sms-possession/resend")
    Object onExtraCallback(@getUserCertList @NotNull SmsPossessionResendRequest smsPossessionResendRequest, @NotNull access13800<? super BaseApiResponse<SmsPossessionSendResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3.1/verify-id-card/common/key-pair/generate")
    @getUserCertOnMemory
    Object onExtraCallback(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Id-Card-Cluster") @Nullable String str, @getCurCert(onExtraCallbackWithResult = "sessionId") long j, @getCurCert(onExtraCallbackWithResult = "sessionType") @NotNull String str2, @NotNull access13800<? super BaseApiResponse<PublicKeyResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3.1/verify-id-card/passport/nfc/key")
    @getUserCertOnMemory
    Object onExtraCallback(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Id-Card-Cluster") @Nullable String str, @getCurCert(onExtraCallbackWithResult = "verifyId") long j, @NotNull access13800<? super BaseApiResponse<NfcKeyResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/manual-verify/id-card/prepare")
    Object onExtraCallback(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getUserCertList @NotNull OcrManualVerifyPrepareRequest ocrManualVerifyPrepareRequest, @NotNull access13800<? super BaseApiResponse<OcrManualVerifyPrepareResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/verify/id-card/prepare")
    Object onExtraCallback(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getUserCertList @NotNull RequesterInfoRequest requesterInfoRequest, @NotNull access13800<? super BaseApiResponse<VerifyIdResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/verify/id-card/maintenance")
    Object onExtraCallback(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @NotNull access13800<? super BaseApiResponse<OcrMaintenanceResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/verify/id-card/result")
    @gf
    Object onExtraCallback(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getUserCertList @NotNull r8lambdaB8sg4u3acBcQ1pHLgIU_Ys5BFko r8lambdab8sg4u3acbcq1phlgiu_ys5bfko, @NotNull access13800<? super BaseApiResponse<getSourceURL>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/verify/passport/nfc")
    @gf
    Object onExtraCallback(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getUserCertList @NotNull setGlobalVariable setglobalvariable, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/certify/login-token")
    Object onExtraCallback(@NotNull access13800<? super BaseApiResponse<LoginTokenResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/user/session/method/ext-real-name-verify")
    @getUserCertOnMemory
    @gf
    writeRaw<BaseApiResponse<RealNameVerifyMethodResponse>> onExtraCallback(@getCurCert(onExtraCallbackWithResult = "sessionId") long j);

    @getIv8(onExtraCallback = "v3/verify/verify/phone/sim/verify")
    @gf
    writeRaw<BaseApiResponse<updateWidth>> onExtraCallback(@getUserCertList @NotNull r8lambdaB8sg4u3acBcQ1pHLgIU_Ys5BFko r8lambdab8sg4u3acbcq1phlgiu_ys5bfko);

    @getIv8(onExtraCallback = "v3/verify/user/session/add/real-name-verify")
    @gf
    writeRaw<BaseApiResponse<Boolean>> onExtraCallback(@getUserCertList @NotNull setEventEmitterCallback seteventemittercallback);

    @getIv8(onExtraCallback = "v3/verify/user/session/prepare")
    writeRaw<BaseApiResponse<PrepareSessionResponse>> onExtraCallback(@getUserCertList @NotNull PrepareSessionRequest prepareSessionRequest);

    @getIv8(onExtraCallback = "v3/verify/user/session/add/pk-cert")
    @getUserCertOnMemory
    @gf
    Object onExtraCallbackWithResult(@getCurCert(onExtraCallbackWithResult = "sessionId") long j, @getCurCert(onExtraCallbackWithResult = "verifyType") @NotNull String str, @getCurCert(onExtraCallbackWithResult = "verifyId") long j2, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/unblock/certify/selfie/issue/key")
    @getUserCertOnMemory
    @gf
    Object onExtraCallbackWithResult(@getCurCert(onExtraCallbackWithResult = "unifiedId") long j, @NotNull access13800<? super BaseApiResponse<hasNativeModule>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/verify/fake-id-card/reset")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull FakeIdCardRequest fakeIdCardRequest, @NotNull access13800<? super BaseApiResponse<Unit>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/tossplore/policy")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull TossplorePolicyRequest tossplorePolicyRequest, @NotNull access13800<? super BaseApiResponse<TossplorePolicyResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/login-token/available")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull AvailableLoginTokenRequest availableLoginTokenRequest, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/verify/phone/sms-possession/send")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull SmsPossessionSendRequest smsPossessionSendRequest, @NotNull access13800<? super BaseApiResponse<SmsPossessionSendResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/verify/phone/sms-possession/verify")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull SmsPossessionVerifyRequest smsPossessionVerifyRequest, @NotNull access13800<? super BaseApiResponse<SmsPossessionVerifyResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3.1/verify/selfie/prepare")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull PrepareSelfieRequest prepareSelfieRequest, @NotNull access13800<? super BaseApiResponse<PrepareSelfieResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/customer-service/auth/complete")
    @getUserCertOnMemory
    @gf
    Object onExtraCallbackWithResult(@getCurCert(onExtraCallbackWithResult = "requestId") @NotNull String str, @getCurCert(onExtraCallbackWithResult = "sessionId") long j, @getCurCert(onExtraCallbackWithResult = "channelType") @NotNull String str2, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/verify/manual-verify/id-card/result/{manualVerifyId}")
    Object onExtraCallbackWithResult(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getIvD(onNavigationEvent = "manualVerifyId") long j, @NotNull access13800<? super BaseApiResponse<OcrManualVerifyIdCardResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/verify/passport/prepare")
    Object onExtraCallbackWithResult(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getUserCertList @NotNull RequesterInfoRequest requesterInfoRequest, @NotNull access13800<? super BaseApiResponse<VerifyIdResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3.1/verify-id-card/passport/nfc")
    @gf
    Object onExtraCallbackWithResult(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Id-Card-Cluster") @Nullable String str, @getUserCertList @NotNull setGlobalVariable setglobalvariable, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/verify/pass-key/get")
    Object onExtraCallbackWithResult(@NotNull access13800<? super BaseApiResponse<List<GetUserPassKeyResponse>>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/certify/telco/sms/verify")
    @gf
    Object onExtraCallbackWithResult(@getUserCertList @NotNull getIconfontBundle geticonfontbundle, @NotNull access13800<? super BaseApiResponse<IconfontInterface>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/verify/pk-cert/internal-signature/prepare")
    @gf
    Object onExtraCallbackWithResult(@getUserCertList @NotNull r8lambdah9c78p7la8pxUD4lh7m8wBSK64 r8lambdah9c78p7la8pxud4lh7m8wbsk64, @NotNull access13800<? super BaseApiResponse<adjustLinePosition>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/user/session/add/certify")
    @gf
    Object onExtraCallbackWithResult(@getUserCertList @NotNull r8lambdawU0YX04_Q0hjFeGR62KKqJd8WsE r8lambdawu0yx04_q0hjfegr62kkqjd8wse, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/login-token/get-locale")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull LocaleRequest localeRequest, @NotNull access13800<? super BaseApiResponse<LocaleResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/user/session/method/certify")
    @getUserCertOnMemory
    @gf
    writeRaw<BaseApiResponse<addTextRightView>> onExtraCallbackWithResult(@getCurCert(onExtraCallbackWithResult = "sessionId") long j);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/verify/verify/bankaccount/deposit/available-accounts")
    @getUserCertOnMemory
    writeRaw<BaseApiResponse<AutoVerifyAvailableBankAccountResp>> onExtraCallbackWithResult(@initCertList(onExtraCallbackWithResult = "X-Toss-Service-Referrer") @NotNull String str, @getCurCert(onExtraCallbackWithResult = "sessionId") @Nullable Long l);

    @getIv8(onExtraCallback = "v3/verify/user/session/add/uss-card")
    @gf
    writeRaw<BaseApiResponse<Boolean>> onExtraCallbackWithResult(@getUserCertList @NotNull getReactApplicationContextIfActiveOrWarn getreactapplicationcontextifactiveorwarn);

    @getIv8(onExtraCallback = "v3/verify/unblock/session/add/certify")
    @getUserCertOnMemory
    @gf
    Object onNavigationEvent(@getCurCert(onExtraCallbackWithResult = "sessionId") long j, @getCurCert(onExtraCallbackWithResult = "unifiedId") long j2, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/unblock/session/unblock")
    @getUserCertOnMemory
    @gf
    Object onNavigationEvent(@getCurCert(onExtraCallbackWithResult = "sessionId") long j, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/verify/fake-id-card/blocked")
    Object onNavigationEvent(@getUserCertList @NotNull FakeIdCardRequest fakeIdCardRequest, @NotNull access13800<? super BaseApiResponse<BlockedResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/ssa-model/latest")
    Object onNavigationEvent(@getUserCertList @NotNull SsaModelFileInfoRequest ssaModelFileInfoRequest, @NotNull access13800<? super BaseApiResponse<SsaModelFileInfoResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/login-token/consent")
    Object onNavigationEvent(@getUserCertList @NotNull LoginTokenConsentRequest loginTokenConsentRequest, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/verify/identify-token/verify")
    Object onNavigationEvent(@getUserCertList @NotNull IdentifyTokenVerificationRequest identifyTokenVerificationRequest, @NotNull access13800<? super BaseApiResponse<VerifyIdResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3.1/verify-id-card/id-card/prepare")
    @getUserCertOnMemory
    Object onNavigationEvent(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Id-Card-Cluster") @NotNull String str, @getCurCert(onExtraCallbackWithResult = "sessionId") long j, @getCurCert(onExtraCallbackWithResult = "sessionType") @NotNull String str2, @NotNull access13800<? super BaseApiResponse<VerifyIdResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3.1/verify-id-card/passport/status")
    @getUserCertOnMemory
    Object onNavigationEvent(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Id-Card-Cluster") @Nullable String str, @getCurCert(onExtraCallbackWithResult = "verifyId") long j, @NotNull access13800<? super BaseApiResponse<PassportStatusResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/verify/id-card/get-policies")
    Object onNavigationEvent(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getUserCertList @NotNull GetPolicesRequest getPolicesRequest, @NotNull access13800<? super BaseApiResponse<PoliciesResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/verify/pass-key/expire")
    @getUserCertOnMemory
    Object onNavigationEvent(@getCurCert(onExtraCallbackWithResult = "credentialId") @NotNull String str, @getCurCert(onExtraCallbackWithResult = "reason") @NotNull String str2, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/manual-verify/id-card/upload-image")
    @gf
    Object onNavigationEvent(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getUserCertList @NotNull castToJavaBean casttojavabean, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/verify/passport/ocr")
    @gf
    Object onNavigationEvent(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getUserCertList @NotNull setGlobalVariable setglobalvariable, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/verify/login-token/consent")
    Object onNavigationEvent(@NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/certify/telco/sms/resend")
    @gf
    Object onNavigationEvent(@getUserCertList @NotNull refreshViewWhenChangeMode refreshviewwhenchangemode, @NotNull access13800<? super BaseApiResponse<AUViewGroupInterface>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/customer-service/auth/prepare")
    @gf
    Object onNavigationEvent(@getUserCertList @NotNull setCurrentIndex setcurrentindex, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/user/session/method/real-name-verify")
    @getUserCertOnMemory
    @gf
    writeRaw<BaseApiResponse<RealNameVerifyMethodResponse>> onNavigationEvent(@getCurCert(onExtraCallbackWithResult = "sessionId") long j);

    @getIv8(onExtraCallback = "v3/verify/common/policy/password")
    @getUserCertOnMemory
    @gf
    writeRaw<BaseApiResponse<PasswordPolicyResponse>> onNavigationEvent(@getCurCert(onExtraCallbackWithResult = "guestId") @Nullable Long l, @getCurCert(onExtraCallbackWithResult = "verifyId") @Nullable Long l2);

    @getIv8(onExtraCallback = "v3/verify/verify/bankaccount/holder/owner")
    @gf
    writeRaw<BaseApiResponse<BankAccountHolderResponse>> onNavigationEvent(@getUserCertList @NotNull getCatalystInstance getcatalystinstance);

    @getIv8(onExtraCallback = "v3/verify/user/session/add/possession")
    @gf
    writeRaw<BaseApiResponse<Boolean>> onNavigationEvent(@getUserCertList @NotNull r8lambda4Oc4sno_nDNjTmEctIjSE6u7s r8lambda4oc4sno_ndnjtmectijse6u7s);

    @getIv8(onExtraCallback = "v3/verify/user/session/add/ext-real-name-verify")
    @gf
    writeRaw<BaseApiResponse<Boolean>> onNavigationEvent(@getUserCertList @NotNull setEventEmitterCallback seteventemittercallback);

    @getIv8(onExtraCallback = "v3/verify/verify/phone/ars-possession/prepare")
    @gf
    writeRaw<BaseApiResponse<isViewAllVisible>> onNavigationEvent(@getUserCertList @NotNull setLoadingText setloadingtext);

    @getIv8(onExtraCallback = "v3/verify/user/reset-password")
    writeRaw<BaseApiResponse<GlobalResetPasswordResponse>> onNavigationEvent(@getUserCertList @NotNull GlobalResetPasswordRequest globalResetPasswordRequest);

    @getIv8(onExtraCallback = "v3/verify/verify/mobile-id-card/verify")
    @gf
    Object onTransact(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getUserCertList @NotNull setGlobalVariable setglobalvariable, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/user/session/policy")
    @getUserCertOnMemory
    @gf
    writeRaw<BaseApiResponse<SessionVerifyPolicyResponse>> onTransact(@getCurCert(onExtraCallbackWithResult = "sessionId") long j);

    @getIv8(onExtraCallback = "v3/verify/verify/pk-cert/internal-signature/verify")
    @getUserCertOnMemory
    @gf
    Object onWarmupCompleted(@getCurCert(onExtraCallbackWithResult = "sessionId") long j, @NotNull access13800<? super BaseApiResponse<resetTabView>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/verify/fake-id-card/detected")
    Object onWarmupCompleted(@getUserCertList @NotNull FakeIdCardRequest fakeIdCardRequest, @NotNull access13800<? super BaseApiResponse<Unit>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/login-token/expire/by-token")
    Object onWarmupCompleted(@getUserCertList @NotNull ExpireLoginTokenRequest expireLoginTokenRequest, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/user/session/add/selfie")
    Object onWarmupCompleted(@getUserCertList @NotNull AddSelfieVerifyRequest addSelfieVerifyRequest, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3.1/verify-id-card/passport/prepare")
    @getUserCertOnMemory
    Object onWarmupCompleted(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Id-Card-Cluster") @Nullable String str, @getCurCert(onExtraCallbackWithResult = "sessionId") long j, @getCurCert(onExtraCallbackWithResult = "sessionType") @NotNull String str2, @NotNull access13800<? super BaseApiResponse<UnifiedPassportPrepareResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/verify/passport/nfc/key")
    @getUserCertOnMemory
    Object onWarmupCompleted(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getCurCert(onExtraCallbackWithResult = "verifyId") long j, @NotNull access13800<? super BaseApiResponse<NfcKeyResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/verify/mobile-id-card/prepare")
    @gf
    Object onWarmupCompleted(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getUserCertList @NotNull RequesterInfoRequest requesterInfoRequest, @NotNull access13800<? super BaseApiResponse<setTabSwitchListener>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/verify/id-card/check-info")
    @gf
    Object onWarmupCompleted(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Requester-Code") @NotNull String str, @getUserCertList @NotNull getNativeModule getnativemodule, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3.1/verify-id-card/passport/check-info")
    @gf
    Object onWarmupCompleted(@initCertList(onExtraCallbackWithResult = "X-Toss-Verify-Id-Card-Cluster") @Nullable String str, @getUserCertList @NotNull setGlobalVariable setglobalvariable, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/common/salt/generate")
    Object onWarmupCompleted(@NotNull access13800<? super BaseApiResponse<GenerateSaltResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/verify/unblock/certify/selfie/image/upload")
    @gf
    getSignPrikeyCCFBPHFilename<BaseApiResponse<Boolean>> onWarmupCompleted(@getUserCertList @NotNull AUSegmentExternalSyntheticLambda9 aUSegmentExternalSyntheticLambda9);

    @getIv8(onExtraCallback = "v3/verify/user/session/method/bank-account-verify")
    @getUserCertOnMemory
    @gf
    writeRaw<BaseApiResponse<PhotoBrowseView2>> onWarmupCompleted(@getCurCert(onExtraCallbackWithResult = "sessionId") long j);

    @getIv8(onExtraCallback = "v3/verify/verify/bankaccount/deposit/transactions")
    @getUserCertOnMemory
    @gf
    writeRaw<BaseApiResponse<getReactApplicationContext>> onWarmupCompleted(@getCurCert(onExtraCallbackWithResult = "verifyId") long j, @getCurCert(onExtraCallbackWithResult = "depositHandler") @NotNull NestmincrementPendingJSCalls nestmincrementPendingJSCalls, @getCurCert(onExtraCallbackWithResult = "sessionId") @Nullable Long l);

    @getIv8(onExtraCallback = "v3/verify/verify/phone/ars-possession/call")
    @gf
    writeRaw<BaseApiResponse<Boolean>> onWarmupCompleted(@getUserCertList @NotNull r8lambdaB8sg4u3acBcQ1pHLgIU_Ys5BFko r8lambdab8sg4u3acbcq1phlgiu_ys5bfko);

    @getIv8(onExtraCallback = "v3/verify/verify/bankaccount/holder/owner/session-info")
    writeRaw<BaseApiResponse<BankAccountHolderResponse>> onWarmupCompleted(@getUserCertList @NotNull BankAccountHolderRequestWithSessionInfo bankAccountHolderRequestWithSessionInfo);

    static /* synthetic */ writeRaw onWarmupCompleted(shouldAutoplay shouldautoplay, String str, Long l, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAutoVerifyPossibleBankAccounts");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            l = null;
        }
        return shouldautoplay.onExtraCallbackWithResult(str, l);
    }

    static /* synthetic */ Object onNavigationEvent(shouldAutoplay shouldautoplay, FakeIdCardRequest fakeIdCardRequest, access13800 access13800Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isBlockCheckIdCard");
        }
        if ((i & 1) != 0) {
            fakeIdCardRequest = new FakeIdCardRequest((String) null, 1, (DefaultConstructorMarker) null);
        }
        return shouldautoplay.onNavigationEvent(fakeIdCardRequest, (access13800<? super BaseApiResponse<BlockedResponse>>) access13800Var);
    }

    static /* synthetic */ Object onExtraCallbackWithResult(shouldAutoplay shouldautoplay, FakeIdCardRequest fakeIdCardRequest, access13800 access13800Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: detectedFakeIdCard");
        }
        if ((i & 1) != 0) {
            fakeIdCardRequest = new FakeIdCardRequest((String) null, 1, (DefaultConstructorMarker) null);
        }
        return shouldautoplay.onWarmupCompleted(fakeIdCardRequest, (access13800<? super BaseApiResponse<Unit>>) access13800Var);
    }

    static /* synthetic */ Object onExtraCallback(shouldAutoplay shouldautoplay, FakeIdCardRequest fakeIdCardRequest, access13800 access13800Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetFakeIdCardDetected");
        }
        if ((i & 1) != 0) {
            fakeIdCardRequest = new FakeIdCardRequest((String) null, 1, (DefaultConstructorMarker) null);
        }
        return shouldautoplay.onExtraCallbackWithResult(fakeIdCardRequest, (access13800<? super BaseApiResponse<Unit>>) access13800Var);
    }

    public static final class onExtraCallback {
        static final /* synthetic */ onExtraCallback onExtraCallbackWithResult = new onExtraCallback();

        private onExtraCallback() {
        }
    }
}
