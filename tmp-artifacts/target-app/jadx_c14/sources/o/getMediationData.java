package o;

import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.auth.EDocTokenReq;
import viva.republica.toss.network.model.electronicdocument.auth.EDocTokenResp;
import viva.republica.toss.network.model.electronicdocument.univ.UnivExternalUrlReq;
import viva.republica.toss.network.model.electronicdocument.univ.UnivExternalUrlResp;
import viva.republica.toss.network.model.electronicdocument.univ.UnivListResp;
import viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletExternalUrlResp;
import viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPackageConfigResp;
import viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletTrxIdResp;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocDocCodesInfoReq;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocDocCodesInfoResp;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableListForPrintResp;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableListResp;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocListForPrintResp;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocListResp;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocOpenOnceLinkReq;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocOpenOnceLinkResp;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebReq;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebResp;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocPrintSchemeReq;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocPrintSchemeResp;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocResp;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocTrxIdReq;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocTrxIdResp;
import viva.republica.toss.network.model.electronicdocument.wallet.GetExistDocumentRequest;
import viva.republica.toss.network.model.electronicdocument.wallet.GetExistDocumentResponse;
import viva.republica.toss.network.model.electronicdocument.wallet.submit.DocumentWalletSubmitOrg;
import viva.republica.toss.network.model.electronicdocument.wallet.submit.DocumentWalletSubmitOrgsResp;
import viva.republica.toss.network.model.electronicdocument.wallet.submit.DocumentWalletSubmittedListResp;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface getMediationData {
    public static final onExtraCallback Companion = onExtraCallback.IAuthTabCallback;

    @getIv8(onExtraCallback = "v3/document-wallet/document/delete")
    @gf
    Object IAuthTabCallback(@getKey4(onNavigationEvent = "docId") long j, @NotNull access13800<? super SimpleDraweeView> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/document-wallet/document/list")
    Object IAuthTabCallback(@getKey4(onNavigationEvent = "page") @Nullable Integer num, @getKey4(onNavigationEvent = getAdExperienceType.QUERY_KEY) @Nullable Integer num2, @NotNull access13800<? super BaseApiResponse<EDocListResp>> access13800Var);

    @getIv8(onExtraCallback = "v3/document-wallet/auth/token/verify")
    Object IAuthTabCallback(@getUserCertList @NotNull EDocTokenReq eDocTokenReq, @NotNull access13800<? super BaseApiResponse<EDocTokenResp>> access13800Var);

    @getIv8(onExtraCallback = "v3/document-wallet/document/print/link")
    Object IAuthTabCallback(@getUserCertList @NotNull EDocOpenOnceLinkReq eDocOpenOnceLinkReq, @NotNull access13800<? super BaseApiResponse<EDocOpenOnceLinkResp>> access13800Var);

    @getIv8(onExtraCallback = "v3/document-wallet/document/print")
    Object IAuthTabCallback(@getUserCertList @NotNull EDocPrintSchemeReq eDocPrintSchemeReq, @NotNull access13800<? super BaseApiResponse<EDocPrintSchemeResp>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/document-wallet/issue/external-url/toss-cert/trx-id")
    @gf
    writeRaw<BaseApiResponse<DocumentWalletTrxIdResp>> IAuthTabCallback();

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/document-wallet/document/{docId}/open")
    @gf
    writeRaw<BaseApiResponse<NativeExceptionsManagerSpec>> IAuthTabCallback(@getIvD(onNavigationEvent = "docId") long j);

    @getIv8(onExtraCallback = "v3/document-wallet/submit/easy")
    @gf
    writeRaw<SimpleDraweeView> IAuthTabCallback(@getUserCertList @NotNull beginScroll beginscroll, @getKey4(onNavigationEvent = "trxId") @Nullable String str);

    @getIv8(onExtraCallback = "v3/document-wallet/issue/form")
    @gf
    writeRaw<BaseApiResponse<openDebugger>> IAuthTabCallback(@getUserCertList @NotNull setProfilingEnabled setprofilingenabled, @getKey4(onNavigationEvent = "trxId") @Nullable String str, @getKey4(onNavigationEvent = "version") int i);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/document-wallet/document/{docId}")
    Object onExtraCallback(@getIvD(onNavigationEvent = "docId") long j, @NotNull access13800<? super BaseApiResponse<EDocResp>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/document-wallet/issue-candidate/v2/documents")
    Object onExtraCallback(@NotNull access13800<? super BaseApiResponse<EDocIssuableListResp>> access13800Var);

    @getIv8(onExtraCallback = "v3/document-wallet/auth")
    Object onExtraCallback(@getUserCertList @NotNull EDocTokenReq eDocTokenReq, @NotNull access13800<? super BaseApiResponse<EDocTokenResp>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/document-wallet/wallet/register")
    @gf
    writeRaw<BaseApiResponse<emitTossBundleLoader_onSendEvent>> onExtraCallback();

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/document-wallet/submit/status")
    writeRaw<BaseApiResponse<DocumentWalletSubmittedListResp>> onExtraCallback(@getKey4(onNavigationEvent = "page") int i, @getKey4(onNavigationEvent = getAdExperienceType.QUERY_KEY) int i2);

    @getIv8(onExtraCallback = "v3/document-wallet/issue/additional/gov-office/building")
    @gf
    writeRaw<BaseApiResponse<NativeClipboardSpec>> onExtraCallback(@getKey4(onNavigationEvent = "docCode") long j, @getUserCertList @NotNull emitMiniAppModule_onSendEvent emitminiappmodule_onsendevent);

    @getIv8(onExtraCallback = "v3/document-wallet/wallet/change-info")
    @gf
    writeRaw<SimpleDraweeView> onExtraCallback(@getKey4(onNavigationEvent = "deviceId") @Nullable String str);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/document-wallet/wallet/term/v2")
    @gf
    writeRaw<BaseApiResponse<NativeFileReaderModuleSpec>> onExtraCallback(@getKey4(onNavigationEvent = "trxId") @Nullable String str, @getKey4(onNavigationEvent = "deviceId") @Nullable String str2);

    @getIv8(onExtraCallback = "v3/document-wallet/issue/external-url")
    @gf
    writeRaw<BaseApiResponse<DocumentWalletExternalUrlResp>> onExtraCallback(@getUserCertList @NotNull dismissRedbox dismissredbox, @getKey4(onNavigationEvent = "trxId") @NotNull String str);

    @getIv8(onExtraCallback = "v3/document-wallet/wallet/register")
    @gf
    writeRaw<SimpleDraweeView> onExtraCallback(@getUserCertList @NotNull invokeDefaultBackPressHandler invokedefaultbackpresshandler);

    @getIv8(onExtraCallback = "v3/document-wallet/issue/toss-cert/trx-id")
    @gf
    writeRaw<BaseApiResponse<DocumentWalletTrxIdResp>> onExtraCallback(@getUserCertList @NotNull setIsShakeToShowDevMenuEnabled setisshaketoshowdevmenuenabled, @getKey4(onNavigationEvent = "trxId") @Nullable String str, @getKey4(onNavigationEvent = "version") int i);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/document-wallet/document/print-list")
    Object onExtraCallbackWithResult(@getKey4(onNavigationEvent = "placeId") long j, @NotNull access13800<? super BaseApiResponse<EDocListForPrintResp>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/document-wallet/submit/terms/v2")
    @gf
    Object onExtraCallbackWithResult(@getKey4(onNavigationEvent = "orgId") @Nullable Long l, @NotNull access13800<? super BaseApiResponse<readAsDataURL>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/document-wallet/package/trx-id/{trxId}/config")
    Object onExtraCallbackWithResult(@getIvD(onNavigationEvent = "trxId") @Nullable String str, @NotNull access13800<? super BaseApiResponse<DocumentWalletPackageConfigResp>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/document-wallet/submit/terms/agreement/v2")
    @gf
    Object onExtraCallbackWithResult(@getUserCertList @NotNull reportSoftException reportsoftexception, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/document-wallet/issue/documents/exist")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull GetExistDocumentRequest getExistDocumentRequest, @NotNull access13800<? super BaseApiResponse<GetExistDocumentResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/document-wallet/wallet/terms/state/v2")
    @gf
    writeRaw<BaseApiResponse<readAsDataURL>> onExtraCallbackWithResult();

    @getIv8(onExtraCallback = "v3/document-wallet/submit/cancel")
    @gf
    writeRaw<SimpleDraweeView> onExtraCallbackWithResult(@getKey4(onNavigationEvent = "docId") long j, @getKey4(onNavigationEvent = "submitRequestId") long j2, @getKey4(onNavigationEvent = "organizationId") @Nullable Long l);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/document-wallet/document/{docId}/download/copy")
    @gf
    writeRaw<BaseApiResponse<String>> onExtraCallbackWithResult(@getIvD(onNavigationEvent = "docId") long j, @getKey4(onNavigationEvent = "pinNo") @Nullable String str);

    @getIv8(onExtraCallback = "v3/document-wallet/issue/additional/building")
    @gf
    writeRaw<BaseApiResponse<NativeClipboardSpec>> onExtraCallbackWithResult(@getKey4(onNavigationEvent = "docCode") long j, @getUserCertList @NotNull emitMiniAppModule_onSendEvent emitminiappmodule_onsendevent);

    @getIv8(onExtraCallback = "v3/document-wallet/issue/additional/tax-list")
    @gf
    writeRaw<BaseApiResponse<showAlert>> onExtraCallbackWithResult(@getKey4(onNavigationEvent = "docCode") long j, @getUserCertList @NotNull reloadWithReason reloadwithreason, @getKey4(onNavigationEvent = "version") int i);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/document-wallet/univ/university")
    Object onNavigationEvent(@getKey4(onNavigationEvent = "docCode") long j, @NotNull access13800<? super BaseApiResponse<UnivListResp>> access13800Var);

    @getIv8(onExtraCallback = "v3/document-wallet/wallet/discard")
    Object onNavigationEvent(@NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/document-wallet/issue/documents/meta")
    Object onNavigationEvent(@getUserCertList @NotNull EDocDocCodesInfoReq eDocDocCodesInfoReq, @NotNull access13800<? super BaseApiResponse<EDocDocCodesInfoResp>> access13800Var);

    @getIv8(onExtraCallback = "v3/document-wallet/document/web-share/password")
    Object onNavigationEvent(@getUserCertList @NotNull EDocPasswordForWebReq eDocPasswordForWebReq, @NotNull access13800<? super BaseApiResponse<EDocPasswordForWebResp>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/document-wallet/issue/crpyt/pub-key")
    @gf
    writeRaw<BaseApiResponse<String>> onNavigationEvent();

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/document-wallet/issue/external-url/status")
    @gf
    writeRaw<BaseApiResponse<onFastRefresh>> onNavigationEvent(@getKey4(onNavigationEvent = "requestId") long j, @getKey4(onNavigationEvent = "trxId") @NotNull String str);

    @getIv8(onExtraCallback = "v3/document-wallet/issue/additional/room-floor")
    @gf
    writeRaw<BaseApiResponse<sendOverSocket>> onNavigationEvent(@getKey4(onNavigationEvent = "docCode") long j, @getUserCertList @NotNull emitMiniAppModule_onSendEvent emitminiappmodule_onsendevent);

    @getIv8(onExtraCallback = "v3/document-wallet/issue/additional/gov-office")
    @gf
    writeRaw<BaseApiResponse<NativeClipboardSpec>> onNavigationEvent(@getKey4(onNavigationEvent = "docCode") long j, @getUserCertList @NotNull emitTossModule_onSendEvent emittossmodule_onsendevent);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/document-wallet/submit/organizations/cursor")
    writeRaw<BaseApiResponse<DocumentWalletSubmitOrgsResp>> onNavigationEvent(@getKey4(onNavigationEvent = "name") @Nullable String str, @getKey4(onNavigationEvent = "cursor") @Nullable Long l, @getKey4(onNavigationEvent = getAdExperienceType.QUERY_KEY) @Nullable Integer num);

    @getIv8(onExtraCallback = "v3/document-wallet/issue/status")
    @gf
    writeRaw<BaseApiResponse<NativeDeviceInfoSpec>> onNavigationEvent(@getUserCertList @NotNull NativeDeviceEventManagerSpec nativeDeviceEventManagerSpec, @getKey4(onNavigationEvent = "trxId") @Nullable String str, @getKey4(onNavigationEvent = "dropOut") boolean z);

    @getIv8(onExtraCallback = "v3/document-wallet/issue/apply")
    @gf
    writeRaw<BaseApiResponse<onFastRefresh>> onNavigationEvent(@getUserCertList @NotNull dismissRedbox dismissredbox, @getKey4(onNavigationEvent = "trxId") @Nullable String str);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/document-wallet/issue-candidate/print-documents")
    Object onWarmupCompleted(@getKey4(onNavigationEvent = "placeId") long j, @NotNull access13800<? super BaseApiResponse<EDocIssuableListForPrintResp>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/document-wallet/submit/organization")
    Object onWarmupCompleted(@getKey4(onNavigationEvent = "address") @NotNull String str, @NotNull access13800<? super BaseApiResponse<DocumentWalletSubmitOrg>> access13800Var);

    @getIv8(onExtraCallback = "v3/document-wallet/univ/issue/external-url")
    Object onWarmupCompleted(@getUserCertList @NotNull UnivExternalUrlReq univExternalUrlReq, @NotNull access13800<? super BaseApiResponse<UnivExternalUrlResp>> access13800Var);

    @getIv8(onExtraCallback = "v3/document-wallet/package/trx-id")
    Object onWarmupCompleted(@getUserCertList @NotNull EDocTrxIdReq eDocTrxIdReq, @getKey4(onNavigationEvent = "version") int i, @NotNull access13800<? super BaseApiResponse<EDocTrxIdResp>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/document-wallet/issue/additional/city")
    @gf
    writeRaw<BaseApiResponse<emitGraniteBrownfieldModule_onVisibilityChanged>> onWarmupCompleted();

    @getIv8(onExtraCallback = "v3/document-wallet/wallet/apply/qualification")
    @getUserCertOnMemory
    @gf
    writeRaw<BaseApiResponse<NativeDevLoadingViewSpec>> onWarmupCompleted(@getCurCert(onExtraCallbackWithResult = "trxId") @NotNull String str);

    @getIv8(onExtraCallback = "v3/document-wallet/wallet/term/v2")
    @gf
    writeRaw<SimpleDraweeView> onWarmupCompleted(@getUserCertList @NotNull reportFatalException reportfatalexception);

    static /* synthetic */ writeRaw onExtraCallback(getMediationData getmediationdata, setProfilingEnabled setprofilingenabled, String str, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIssueForm");
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            i = 4;
        }
        return getmediationdata.IAuthTabCallback(setprofilingenabled, str, i);
    }

    static /* synthetic */ writeRaw onExtraCallbackWithResult(getMediationData getmediationdata, NativeDeviceEventManagerSpec nativeDeviceEventManagerSpec, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIssueStatus");
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return getmediationdata.onNavigationEvent(nativeDeviceEventManagerSpec, str, z);
    }

    static /* synthetic */ writeRaw onExtraCallback(getMediationData getmediationdata, beginScroll beginscroll, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submit");
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return getmediationdata.IAuthTabCallback(beginscroll, str);
    }

    static /* synthetic */ writeRaw IAuthTabCallback(getMediationData getmediationdata, setIsShakeToShowDevMenuEnabled setisshaketoshowdevmenuenabled, String str, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTrxIdForIssue");
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            i = 4;
        }
        return getmediationdata.onExtraCallback(setisshaketoshowdevmenuenabled, str, i);
    }

    static /* synthetic */ writeRaw onWarmupCompleted(getMediationData getmediationdata, long j, reloadWithReason reloadwithreason, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTaxList");
        }
        if ((i2 & 4) != 0) {
            i = 4;
        }
        return getmediationdata.onExtraCallbackWithResult(j, reloadwithreason, i);
    }

    static /* synthetic */ Object onNavigationEvent(getMediationData getmediationdata, EDocTrxIdReq eDocTrxIdReq, int i, access13800 access13800Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTrxId");
        }
        if ((i2 & 2) != 0) {
            i = 4;
        }
        return getmediationdata.onWarmupCompleted(eDocTrxIdReq, i, access13800Var);
    }

    public static final class onExtraCallback {
        static final /* synthetic */ onExtraCallback IAuthTabCallback = new onExtraCallback();

        private onExtraCallback() {
        }
    }
}
