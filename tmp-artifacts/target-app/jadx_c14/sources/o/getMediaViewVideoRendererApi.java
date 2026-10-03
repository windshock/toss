package o;

import im.toss.core.tracker.TossReferrerTemplate;
import im.toss.featurescommon.profile.library.model.Job;
import im.toss.network.model.BaseApiResponse;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.account.WithdrawalAccount;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerRequest;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferCalculateReq;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferCalculateResp;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferDeleteParam;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferDraftRequest;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferListResponse;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface getMediaViewVideoRendererApi {
    @getIv8(onExtraCallback = "v3/transfer/periodic-transfers/disable")
    @getUserCertOnMemory
    Object IAuthTabCallback(@getCurCert(onExtraCallbackWithResult = "uniqueId") @NotNull String str, @NotNull access13800<? super BaseApiResponse<PeriodicTransferModel>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/log-centre/schemas/event/simple-meta")
    Object IAuthTabCallback(@NotNull access13800<? super BaseApiResponse<Map<String, String>>> access13800Var);

    @getIv8(onExtraCallback = "v3/profile/job/list")
    writeRaw<BaseApiResponse<List<Job>>> IAuthTabCallback();

    @getIv8(onExtraCallback = "v3/withdraw-agreement/cancel/check-available")
    @gf
    writeRaw<BaseApiResponse<NativeAdScrollViewAdViewProvider>> IAuthTabCallback(@getUserCertList @NotNull NativeAdOptionsViewPosition nativeAdOptionsViewPosition);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/log-centre/schemas/simple-meta")
    Object IAuthTabCallbackDefault(@NotNull access13800<? super BaseApiResponse<Map<String, String>>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v4/asset/withdraw-agreement/openbanking-restriction")
    @gf
    Object IAuthTabCallbackStub(@NotNull access13800<? super BaseApiResponse<getButtonColor>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/log-centre/schemas/simple-meta/hash-code")
    Object IAuthTabCallback_Parcel(@NotNull access13800<? super BaseApiResponse<String>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/log-centre/masking-rules")
    Object asBinder(@NotNull access13800<? super BaseApiResponse<List<String>>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v4/transfer/periodic-transfers/list")
    Object asInterface(@NotNull access13800<? super BaseApiResponse<PeriodicTransferListResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v4/asset/bank-accounts/withdrawal-accounts")
    @gf
    Object getInterfaceDescriptor(@NotNull access13800<? super BaseApiResponse<List<WithdrawalAccount>>> access13800Var);

    @getIv8(onExtraCallback = "v4/asset/bank-accounts/convert-to-read-only/possible")
    @getUserCertOnMemory
    @gf
    Object onExtraCallback(@getCurCert(onExtraCallbackWithResult = "accountId") long j, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/periodic-transfers/enable")
    @getUserCertOnMemory
    Object onExtraCallback(@getCurCert(onExtraCallbackWithResult = "uniqueId") @NotNull String str, @NotNull access13800<? super BaseApiResponse<PeriodicTransferModel>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/log-centre/toss-referrer/templates")
    Object onExtraCallback(@NotNull access13800<? super BaseApiResponse<List<TossReferrerTemplate>>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/periodic-transfers/register")
    Object onExtraCallback(@getUserCertList @NotNull PeriodicTransferPostParam periodicTransferPostParam, @NotNull access13800<? super BaseApiResponse<PeriodicTransferModel>> access13800Var);

    @getIv8(onExtraCallback = "v4/asset/bank-accounts/convert-to-read-only")
    @getUserCertOnMemory
    @gf
    Object onExtraCallbackWithResult(@getCurCert(onExtraCallbackWithResult = "accountId") long j, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/log-centre/schemas/event/simple-meta/hash-code")
    Object onExtraCallbackWithResult(@NotNull access13800<? super BaseApiResponse<String>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/periodic-transfers/get-banner")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull PeriodicTransferBannerRequest periodicTransferBannerRequest, @NotNull access13800<? super BaseApiResponse<PeriodicTransferBannerResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/periodic-transfers/delete")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull PeriodicTransferDeleteParam periodicTransferDeleteParam, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/periodic-transfers/draft")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull PeriodicTransferDraftRequest periodicTransferDraftRequest, @NotNull access13800<? super BaseApiResponse<Unit>> access13800Var);

    @getIv8(onExtraCallback = "v3.1/verify/auth-token/create")
    @gf
    JsonReaderUnknownNumberParsing<turnOnDebugger> onExtraCallbackWithResult();

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/log-centre/referrer/excluded-act-types")
    Object onNavigationEvent(@NotNull access13800<? super BaseApiResponse<List<String>>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/periodic-transfers/calculate-next-transfer-date")
    Object onNavigationEvent(@getUserCertList @NotNull PeriodicTransferCalculateReq periodicTransferCalculateReq, @NotNull access13800<? super BaseApiResponse<PeriodicTransferCalculateResp>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/periodic-transfers/modify")
    Object onNavigationEvent(@getUserCertList @NotNull PeriodicTransferPostParam periodicTransferPostParam, @NotNull access13800<? super BaseApiResponse<PeriodicTransferModel>> access13800Var);

    @getIv8(onExtraCallback = "v3/profile/profile/date-of-sign-up/get")
    @gf
    writeRaw<BaseApiResponse<String>> onNavigationEvent();

    @getIv8(onExtraCallback = "v4/asset/bank-accounts/prepare-register")
    @getUserCertOnMemory
    @gf
    writeRaw<BaseApiResponse<setDescriptionTextColor>> onNavigationEvent(@getCurCert(onExtraCallbackWithResult = "accountNumber") @NotNull String str, @getCurCert(onExtraCallbackWithResult = "bankCode") @NotNull String str2, @getCurCert(onExtraCallbackWithResult = "method") @NotNull String str3);

    @getIv8(onExtraCallback = "v4/asset/bank-accounts/delete")
    @gf
    writeRaw<BaseApiResponse<Object>> onNavigationEvent(@getUserCertList @NotNull NativeAdViewAttributes nativeAdViewAttributes);

    @getIv8(onExtraCallback = "v3/withdraw-agreement/cancel/check-available/bulk")
    @gf
    writeRaw<BaseApiResponse<List<NativeAdScrollViewAdViewProvider>>> onNavigationEvent(@getUserCertList @NotNull NativeAdViewType nativeAdViewType);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/transfer/periodic-transfers/list")
    Object onTransact(@NotNull access13800<? super BaseApiResponse<List<PeriodicTransferModel>>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"ExcludeNword:true", "X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/security-api/appbridges")
    @gf
    Object onWarmupCompleted(@NotNull access13800<? super BaseApiResponse<List<ALCLiveness>>> access13800Var);
}
