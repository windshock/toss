package o;

import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.AccountBalanceRequest;
import viva.republica.toss.network.model.transfer.AccountBalanceResponse;
import viva.republica.toss.network.model.transfer.CompleteTossBankWebTransferReq;
import viva.republica.toss.network.model.transfer.DepositTargetCommandRequest;
import viva.republica.toss.network.model.transfer.DepositTargetRecommendRequest;
import viva.republica.toss.network.model.transfer.DepositTargetRecommendResponse;
import viva.republica.toss.network.model.transfer.DepositTargetTabListRequest;
import viva.republica.toss.network.model.transfer.DepositTargetTabListResponse;
import viva.republica.toss.network.model.transfer.DetectFraudRequest;
import viva.republica.toss.network.model.transfer.DetectFraudResponse;
import viva.republica.toss.network.model.transfer.GetNavigationReq;
import viva.republica.toss.network.model.transfer.GetNavigationResp;
import viva.republica.toss.network.model.transfer.GetTransferAccountHolderReq;
import viva.republica.toss.network.model.transfer.InitSessionKeyRequest;
import viva.republica.toss.network.model.transfer.InitSessionKeyResponse;
import viva.republica.toss.network.model.transfer.MoveToTossPayMoneyRequest;
import viva.republica.toss.network.model.transfer.MyAccountInfoDto;
import viva.republica.toss.network.model.transfer.MyAccountInfoRequest;
import viva.republica.toss.network.model.transfer.NotifyTransferReadyRequest;
import viva.republica.toss.network.model.transfer.NotifyTransferResultReq;
import viva.republica.toss.network.model.transfer.PreCheckForSendRequest;
import viva.republica.toss.network.model.transfer.PredictedBanks;
import viva.republica.toss.network.model.transfer.PrepareTransferV2Req;
import viva.republica.toss.network.model.transfer.ResolveTermIdsRequest;
import viva.republica.toss.network.model.transfer.ResolveTermIdsResponse;
import viva.republica.toss.network.model.transfer.SaveMemoRequest;
import viva.republica.toss.network.model.transfer.SendPreAction;
import viva.republica.toss.network.model.transfer.SimpleDetectFraudRequest;
import viva.republica.toss.network.model.transfer.SimpleDetectFraudResponse;
import viva.republica.toss.network.model.transfer.TransferAccountHolder;
import viva.republica.toss.network.model.transfer.TransferInfoV2;
import viva.republica.toss.network.model.transfer.TransferInputLimitRequest;
import viva.republica.toss.network.model.transfer.TransferInputLimitResponse;
import viva.republica.toss.network.model.transfer.TransferMydataOnboardingRequest;
import viva.republica.toss.network.model.transfer.TransferMydataOnboardingResponse;
import viva.republica.toss.network.model.transfer.TransferOccupyingLimitBottomSheetResponse;
import viva.republica.toss.network.model.transfer.TransferReserveKeyInfoResponse;
import viva.republica.toss.network.model.transfer.TransferSendRequest;
import viva.republica.toss.network.model.transfer.TransferSendResponse;
import viva.republica.toss.network.model.transfer.TransferShareCancelRequest;
import viva.republica.toss.network.model.transfer.WithdrawAccountListRequest;
import viva.republica.toss.network.model.transfer.WithdrawAdditionalAgreementAcceptRequest;
import viva.republica.toss.network.model.transfer.WithdrawAdditionalAgreementRejectRequest;
import viva.republica.toss.network.model.transfer.WithdrawAgreementPrepareRequest;
import viva.republica.toss.network.model.transfer.WithdrawAgreementPrepareResponseV2;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam;
import viva.republica.toss.tosspaymoney.model.MoveToTossPayMoneyInfo;
import viva.republica.toss.tosspaymoney.model.TossMoneyInfo;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface onSeekEngaged {
    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/transfer/prepaid-account/empty-bottom-sheet")
    Object IAuthTabCallback(@getKey4(onNavigationEvent = "purpose") @NotNull String str, @getKey4(onNavigationEvent = "amount") @Nullable Long l, @NotNull access13800<? super BaseApiResponse<TransferOccupyingLimitBottomSheetResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/predict-banks")
    @getUserCertOnMemory
    Object IAuthTabCallback(@getCurCert(onExtraCallbackWithResult = "accountNo") @NotNull String str, @NotNull access13800<? super BaseApiResponse<PredictedBanks>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/transfer/my-main-toss-account")
    Object IAuthTabCallback(@NotNull access13800<? super BaseApiResponse<MyAccountInfoDto>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/periodic-transfers/get-account-holder")
    @gf
    Object IAuthTabCallback(@getUserCertList @NotNull willDispatchViewUpdateslambda4 willdispatchviewupdateslambda4, @NotNull access13800<? super BaseApiResponse<userDrivenScrollEndedlambda2lambda1>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/balances/refresh")
    Object IAuthTabCallback(@getUserCertList @NotNull AccountBalanceRequest accountBalanceRequest, @NotNull access13800<? super BaseApiResponse<AccountBalanceResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/deposit-target/recommendation/delete")
    Object IAuthTabCallback(@getUserCertList @NotNull DepositTargetCommandRequest depositTargetCommandRequest, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/navigate")
    Object IAuthTabCallback(@getUserCertList @NotNull GetNavigationReq getNavigationReq, @NotNull access13800<? super BaseApiResponse<GetNavigationResp>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/tosspay-money/migrate")
    Object IAuthTabCallback(@getUserCertList @NotNull MoveToTossPayMoneyRequest moveToTossPayMoneyRequest, @NotNull access13800<? super BaseApiResponse<MoveToTossPayMoneyInfo>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/transfer/my-account")
    Object IAuthTabCallback(@getUserCertList @NotNull MyAccountInfoRequest myAccountInfoRequest, @NotNull access13800<? super BaseApiResponse<MyAccountInfoDto>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/send/notify-transfer-result")
    Object IAuthTabCallback(@getUserCertList @NotNull NotifyTransferResultReq notifyTransferResultReq, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3.1/transfer/send/pre-check")
    Object IAuthTabCallback(@getUserCertList @NotNull PreCheckForSendRequest preCheckForSendRequest, @NotNull access13800<? super BaseApiResponse<SendPreAction>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/deposit-target/recommendation/share")
    @getUserCertOnMemory
    Object onExtraCallback(@getCurCert(onExtraCallbackWithResult = "sessionKey") @Nullable String str, @NotNull access13800<? super BaseApiResponse<DepositTargetRecommendResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/transfer/tosspay-money/migration-status")
    Object onExtraCallback(@NotNull access13800<? super BaseApiResponse<TossMoneyInfo>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/balances/inquiry")
    Object onExtraCallback(@getUserCertList @NotNull AccountBalanceRequest accountBalanceRequest, @NotNull access13800<? super BaseApiResponse<AccountBalanceResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/toss-bank-web-transfer/complete")
    Object onExtraCallback(@getUserCertList @NotNull CompleteTossBankWebTransferReq completeTossBankWebTransferReq, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/deposit-target/favorite/delete")
    Object onExtraCallback(@getUserCertList @NotNull DepositTargetCommandRequest depositTargetCommandRequest, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/mydata-onboarding-status")
    Object onExtraCallback(@getUserCertList @NotNull TransferMydataOnboardingRequest transferMydataOnboardingRequest, @NotNull access13800<? super BaseApiResponse<TransferMydataOnboardingResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/my-withdrawable-accounts")
    Object onExtraCallback(@getUserCertList @NotNull WithdrawAccountListRequest withdrawAccountListRequest, @NotNull access13800<? super BaseApiResponse<MyAccountInfoDto>> access13800Var);

    @getIv8(onExtraCallback = "v3/withdraw-agreement/prepare-v2")
    Object onExtraCallback(@getUserCertList @NotNull WithdrawAgreementPrepareRequest withdrawAgreementPrepareRequest, @NotNull access13800<? super BaseApiResponse<WithdrawAgreementPrepareResponseV2>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/phone-transfers/check-phone-transfer-available")
    @getUserCertOnMemory
    @gf
    Object onExtraCallbackWithResult(@getCurCert(onExtraCallbackWithResult = "receiverPhoneNumber") @NotNull String str, @NotNull access13800<? super BaseApiResponse<onHostPause>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/deposit-target/recommendation")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull DepositTargetRecommendRequest depositTargetRecommendRequest, @NotNull access13800<? super BaseApiResponse<DepositTargetRecommendResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/notify-transfer-ready")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull NotifyTransferReadyRequest notifyTransferReadyRequest, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/withdraw-agreement/resolve-term-ids")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull ResolveTermIdsRequest resolveTermIdsRequest, @NotNull access13800<? super BaseApiResponse<ResolveTermIdsResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/send/simple-detect-fraud")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull SimpleDetectFraudRequest simpleDetectFraudRequest, @NotNull access13800<? super BaseApiResponse<SimpleDetectFraudResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/share/cancel")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull TransferShareCancelRequest transferShareCancelRequest, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/delayed-transfers/register")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull PeriodicTransferPostParam periodicTransferPostParam, @NotNull access13800<? super BaseApiResponse<PeriodicTransferModel>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/transfer/reserve/{reserveKey}")
    Object onNavigationEvent(@getIvD(onNavigationEvent = "reserveKey") @NotNull String str, @NotNull access13800<? super BaseApiResponse<TransferReserveKeyInfoResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/deposit-target/favorite/add")
    Object onNavigationEvent(@getUserCertList @NotNull DepositTargetCommandRequest depositTargetCommandRequest, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/get-account-holder")
    Object onNavigationEvent(@getUserCertList @NotNull GetTransferAccountHolderReq getTransferAccountHolderReq, @NotNull access13800<? super BaseApiResponse<TransferAccountHolder>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/session/init")
    Object onNavigationEvent(@getUserCertList @NotNull InitSessionKeyRequest initSessionKeyRequest, @NotNull access13800<? super BaseApiResponse<InitSessionKeyResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/deposit-target/tabs")
    Object onWarmupCompleted(@getUserCertList @NotNull DepositTargetTabListRequest depositTargetTabListRequest, @NotNull access13800<? super BaseApiResponse<DepositTargetTabListResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/send/detect-fraud")
    Object onWarmupCompleted(@getUserCertList @NotNull DetectFraudRequest detectFraudRequest, @NotNull access13800<? super BaseApiResponse<DetectFraudResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/send/prepare")
    Object onWarmupCompleted(@getUserCertList @NotNull PrepareTransferV2Req prepareTransferV2Req, @NotNull access13800<? super BaseApiResponse<TransferInfoV2>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/memo")
    Object onWarmupCompleted(@getUserCertList @NotNull SaveMemoRequest saveMemoRequest, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/input-limit")
    Object onWarmupCompleted(@getUserCertList @NotNull TransferInputLimitRequest transferInputLimitRequest, @NotNull access13800<? super BaseApiResponse<TransferInputLimitResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/transfer/send")
    Object onWarmupCompleted(@getUserCertList @NotNull TransferSendRequest transferSendRequest, @NotNull access13800<? super BaseApiResponse<TransferSendResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/withdraw-agreement/additional-agreement/accept")
    Object onWarmupCompleted(@getUserCertList @NotNull WithdrawAdditionalAgreementAcceptRequest withdrawAdditionalAgreementAcceptRequest, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/withdraw-agreement/additional-agreement/reject")
    Object onWarmupCompleted(@getUserCertList @NotNull WithdrawAdditionalAgreementRejectRequest withdrawAdditionalAgreementRejectRequest, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);
}
