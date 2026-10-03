package o;

import im.toss.network.model.BaseApiResponse;
import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.loan.AutomobileInputAdvantages;
import viva.republica.toss.network.model.loan.BizRefinancePreScreenRequest;
import viva.republica.toss.network.model.loan.BizRefinancePreScreenRetryRequest;
import viva.republica.toss.network.model.loan.BusinessRefinanceAccountsRequest;
import viva.republica.toss.network.model.loan.BusinessRefinanceAccountsResponse;
import viva.republica.toss.network.model.loan.ExternalAutomobileNumber;
import viva.republica.toss.network.model.loan.GroupedAppliedLoan;
import viva.republica.toss.network.model.loan.LoanBenefitAlarmAgreement;
import viva.republica.toss.network.model.loan.LoanComparisonBenefitAlarmResult;
import viva.republica.toss.network.model.loan.LoanComparisonDetailResponse;
import viva.republica.toss.network.model.loan.LoanComparisonFunnelType;
import viva.republica.toss.network.model.loan.LoanComparisonFunnelTypeRequest;
import viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionRequest;
import viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionResponse;
import viva.republica.toss.network.model.loan.LoanComparisonLoading;
import viva.republica.toss.network.model.loan.LoanComparisonLoadingConfig;
import viva.republica.toss.network.model.loan.LoanComparisonPreScreeningProduct;
import viva.republica.toss.network.model.loan.LoanComparisonResultOverlay;
import viva.republica.toss.network.model.loan.LoanDisclaimer;
import viva.republica.toss.network.model.loan.LoanHomeExtensive;
import viva.republica.toss.network.model.loan.LoanHomeInventoryInformation;
import viva.republica.toss.network.model.loan.LoanHomeServices;
import viva.republica.toss.network.model.loan.LoanIntroData;
import viva.republica.toss.network.model.loan.LoanIntroSuccessRateRequest;
import viva.republica.toss.network.model.loan.LoanIntroSuccessRateResponse;
import viva.republica.toss.network.model.loan.LoanPreScreenResultSummary;
import viva.republica.toss.network.model.loan.LoanRefinancingAvailableStatus;
import viva.republica.toss.network.model.loan.LoanRefinancingIntro;
import viva.republica.toss.network.model.loan.LoanRefinancingProductDetailResponse;
import viva.republica.toss.network.model.loan.LoanRefinancingScheduled;
import viva.republica.toss.network.model.loan.LoanRefinancingStatus;
import viva.republica.toss.network.model.loan.PreScreenResultAvailableFilterListResponse;
import viva.republica.toss.network.model.loan.PreviousPreScreenDataRequest;
import viva.republica.toss.network.model.loan.RefinancingAccountStateResponse;
import viva.republica.toss.network.model.loan.RefinancingInquiryResponse;
import viva.republica.toss.network.model.loan.RefinancingScheduleResponse;
import viva.republica.toss.network.model.loan.RefinancingStatusResponse;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface mediationData {
    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/business-refinance/pre-screen/requests/{loanReqNo}")
    Object IAuthTabCallback(@getIvD(onNavigationEvent = "loanReqNo") @NotNull String str, @NotNull access13800<? super BaseApiResponse<LoanRefinancingProductDetailResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/credit-loan/pre-screen/scrape/retry")
    @gf
    Object IAuthTabCallback(@getUserCertList @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/automobile-info/input-advantages")
    Object IAuthTabCallback(@NotNull access13800<? super BaseApiResponse<AutomobileInputAdvantages>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/business-refinance/accounts")
    Object IAuthTabCallback(@getUserCertList @NotNull BusinessRefinanceAccountsRequest businessRefinanceAccountsRequest, @NotNull access13800<? super BaseApiResponse<BusinessRefinanceAccountsResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/all/loan/status/list")
    @gf
    writeRaw<BaseApiResponse<PriorityThreadFactoryExternalSyntheticLambda0>> IAuthTabCallback();

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/credit-loan/funnel/types/all-certification")
    Object IAuthTabCallbackDefault(@NotNull access13800<? super BaseApiResponse<LoanComparisonFunnelType>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/status")
    @gf
    Object IAuthTabCallbackStub(@NotNull access13800<? super BaseApiResponse<ImagePipelineExperimentsBuilderExternalSyntheticLambda9>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/refinancing/status")
    Object IAuthTabCallbackStubProxy(@NotNull access13800<? super BaseApiResponse<LoanRefinancingStatus>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/refinancing/schedule-pre-screen/check-scheduled")
    Object IAuthTabCallback_Parcel(@NotNull access13800<? super BaseApiResponse<LoanRefinancingScheduled>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/loan-services")
    Object ICustomTabsCallback(@NotNull access13800<? super BaseApiResponse<LoanHomeServices>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/tps/create-features")
    Object ICustomTabsCallbackDefault(@NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/refinancing/alarms/schedule")
    Object ICustomTabsCallbackStub(@NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/kodata/inquiry")
    Object ICustomTabsCallbackStubProxy(@NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/loan-home/new")
    Object access000(@NotNull access13800<? super BaseApiResponse<LoanHomeExtensive>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/refinancing/intro")
    Object access100(@NotNull access13800<? super BaseApiResponse<LoanRefinancingIntro>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/home/overview/applied-loans")
    Object asBinder(@NotNull access13800<? super BaseApiResponse<List<GroupedAppliedLoan>>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/refinancing/loan-accounts")
    Object asInterface(@NotNull access13800<? super BaseApiResponse<RefinancingAccountStateResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/pre-screen-result/overlay")
    Object extraCallback(@NotNull access13800<? super BaseApiResponse<LoanComparisonResultOverlay>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/pre-screen-result/summary")
    Object extraCallbackWithResult(@NotNull access13800<? super BaseApiResponse<LoanPreScreenResultSummary>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/intro/info")
    Object getInterfaceDescriptor(@NotNull access13800<? super BaseApiResponse<LoanIntroData>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/loan-benefit-alarm/terms/is-agreed")
    Object onActivityLayout(@NotNull access13800<? super BaseApiResponse<LoanBenefitAlarmAgreement>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/refinancing/service-available")
    Object onActivityResized(@NotNull access13800<? super BaseApiResponse<LoanRefinancingAvailableStatus>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/refinancing/pre-screen/result/{groupId}")
    Object onExtraCallback(@getIvD(onNavigationEvent = "groupId") long j, @NotNull access13800<? super BaseApiResponse<RefinancingInquiryResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/loan-home/inventory")
    Object onExtraCallback(@getKey4(onNavigationEvent = "adId") @NotNull String str, @NotNull access13800<? super BaseApiResponse<LoanHomeInventoryInformation>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/credit-loan/pre-screen/business")
    @gf
    Object onExtraCallback(@getUserCertList @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/automobile-info/pre-screen")
    @gf
    Object onExtraCallback(@getUserCertList @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda28 imagePipelineExperimentsBuilderExternalSyntheticLambda28, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/refinancing/pre-screen/retry")
    @gf
    Object onExtraCallback(@getUserCertList @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda31 imagePipelineExperimentsBuilderExternalSyntheticLambda31, @NotNull access13800<? super BaseApiResponse<RefinancingStatusResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/automobile-info/load")
    @gf
    Object onExtraCallback(@getUserCertList @NotNull ImagePipelineExternalSyntheticLambda3 imagePipelineExternalSyntheticLambda3, @NotNull access13800<? super BaseApiResponse<ImagePipelineExternalSyntheticLambda1>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/automobile-number/from-external")
    Object onExtraCallback(@NotNull access13800<? super BaseApiResponse<ExternalAutomobileNumber>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/credit-loan/funnel/types")
    Object onExtraCallback(@getUserCertList @NotNull LoanComparisonFunnelTypeRequest loanComparisonFunnelTypeRequest, @NotNull access13800<? super BaseApiResponse<LoanComparisonFunnelType>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/intro/approve-ratio")
    Object onExtraCallback(@getUserCertList @NotNull LoanIntroSuccessRateRequest loanIntroSuccessRateRequest, @NotNull access13800<? super BaseApiResponse<LoanIntroSuccessRateResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/credit/apply/loan")
    @gf
    writeRaw<BaseApiResponse<ImagePipelineExperimentsBuilderExternalSyntheticLambda1>> onExtraCallback(@getUserCertList @NotNull LoanComparisonPreScreeningProduct loanComparisonPreScreeningProduct);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/business-refinance/pre-screen/result/{groupId}")
    Object onExtraCallbackWithResult(@getIvD(onNavigationEvent = "groupId") @NotNull String str, @NotNull access13800<? super BaseApiResponse<RefinancingInquiryResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/credit-loan/pre-screen/scrape")
    @gf
    Object onExtraCallbackWithResult(@getUserCertList @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/refinancing/pre-screen/retry-all-accounts")
    @gf
    Object onExtraCallbackWithResult(@getUserCertList @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda31 imagePipelineExperimentsBuilderExternalSyntheticLambda31, @NotNull access13800<? super BaseApiResponse<RefinancingStatusResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/refinancing/loan-accounts/check-refinancing")
    @gf
    Object onExtraCallbackWithResult(@getUserCertList @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda34 imagePipelineExperimentsBuilderExternalSyntheticLambda34, @NotNull access13800<? super BaseApiResponse<Unit>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/business-refinance/service-available")
    Object onExtraCallbackWithResult(@NotNull access13800<? super BaseApiResponse<LoanRefinancingAvailableStatus>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/business-refinance/pre-screen")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull BizRefinancePreScreenRequest bizRefinancePreScreenRequest, @NotNull access13800<? super BaseApiResponse<RefinancingStatusResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/credit/loan/product/detail")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull LoanComparisonPreScreeningProduct loanComparisonPreScreeningProduct, @NotNull access13800<? super BaseApiResponse<LoanComparisonDetailResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/all/apply/loan/requests")
    @gf
    writeRaw<BaseApiResponse<List<RotationOptionsRotationAngle>>> onExtraCallbackWithResult();

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/pre/screen/clean/data")
    @gf
    writeRaw<BaseApiResponse<Object>> onExtraCallbackWithResult(@getUserCertList @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda10 imagePipelineExperimentsBuilderExternalSyntheticLambda10);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/apply/loan/request/status/check")
    @gf
    writeRaw<BaseApiResponse<ImagePipelineExperimentsBuilderExternalSyntheticLambda2>> onExtraCallbackWithResult(@getUserCertList @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda13 imagePipelineExperimentsBuilderExternalSyntheticLambda13);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/second-apply-reward/activate")
    Object onMessageChannelReady(@NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/auth/request")
    @gf
    Object onMinimized(@NotNull access13800<? super BaseApiResponse<ProducerSequenceFactoryExternalSyntheticLambda1>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/refinancing/pre-screen/requests/{loanReqNo}")
    Object onNavigationEvent(@getIvD(onNavigationEvent = "loanReqNo") @NotNull String str, @NotNull access13800<? super BaseApiResponse<LoanRefinancingProductDetailResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/credit-loan/pre-screen/business/retry")
    @gf
    Object onNavigationEvent(@getUserCertList @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/screening/request/results/{type}")
    @gf
    Object onNavigationEvent(@getIvD(onNavigationEvent = "type") @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda17 imagePipelineExperimentsBuilderExternalSyntheticLambda17, @getUserCertList @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda29 imagePipelineExperimentsBuilderExternalSyntheticLambda29, @NotNull access13800<? super BaseApiResponse<ProducerSequenceFactoryExternalSyntheticLambda15>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/refinancing/pre-screen")
    @gf
    Object onNavigationEvent(@getUserCertList @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda31 imagePipelineExperimentsBuilderExternalSyntheticLambda31, @NotNull access13800<? super BaseApiResponse<RefinancingStatusResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/auth/verify-rrn")
    @gf
    Object onNavigationEvent(@getUserCertList @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda7 imagePipelineExperimentsBuilderExternalSyntheticLambda7, @NotNull access13800<? super BaseApiResponse<ImagePipelineExperimentsBuilderExternalSyntheticLambda35>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/loan-benefit-alarm/intro")
    Object onNavigationEvent(@NotNull access13800<? super BaseApiResponse<LoanDisclaimer>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/intro/select")
    Object onNavigationEvent(@getUserCertList @NotNull LoanComparisonIntroTypeSelectionRequest loanComparisonIntroTypeSelectionRequest, @NotNull access13800<? super BaseApiResponse<LoanComparisonIntroTypeSelectionResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/previous-data/pre-screen")
    Object onNavigationEvent(@getUserCertList @NotNull PreviousPreScreenDataRequest previousPreScreenDataRequest, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/pre/screen/clean/data/retry")
    @gf
    writeRaw<BaseApiResponse<Object>> onNavigationEvent(@getUserCertList @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda10 imagePipelineExperimentsBuilderExternalSyntheticLambda10);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/funnel-internalization/loan/application/result")
    @gf
    writeRaw<BaseApiResponse<ImagePipelineExperimentsBuilderExternalSyntheticLambda6>> onNavigationEvent(@getUserCertList @NotNull LoanComparisonPreScreeningProduct loanComparisonPreScreeningProduct);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/loan-benefit-alarm/activate")
    Object onPostMessage(@NotNull access13800<? super BaseApiResponse<LoanComparisonBenefitAlarmResult>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/pre-screen-result/available-filter")
    Object onTransact(@NotNull access13800<? super BaseApiResponse<PreScreenResultAvailableFilterListResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/find-loan/popup-mission/loan-benefit-alarm/reward")
    Object onUnminimized(@NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/disclaimer")
    Object onWarmupCompleted(@getKey4(onNavigationEvent = "screenType") @NotNull String str, @NotNull access13800<? super BaseApiResponse<LoanDisclaimer>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/midnight-reservation/pre-screen")
    @gf
    Object onWarmupCompleted(@getUserCertList @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda28 imagePipelineExperimentsBuilderExternalSyntheticLambda28, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/refinancing/schedule-pre-screen")
    @gf
    Object onWarmupCompleted(@getUserCertList @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda31 imagePipelineExperimentsBuilderExternalSyntheticLambda31, @NotNull access13800<? super BaseApiResponse<RefinancingScheduleResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/automobile-info/scrape")
    @gf
    Object onWarmupCompleted(@getUserCertList @NotNull ImagePipelineExternalSyntheticLambda3 imagePipelineExternalSyntheticLambda3, @NotNull access13800<? super BaseApiResponse<DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda4>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/business-refinance/status")
    Object onWarmupCompleted(@NotNull access13800<? super BaseApiResponse<LoanRefinancingStatus>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/business-refinance/pre-screen/retry")
    Object onWarmupCompleted(@getUserCertList @NotNull BizRefinancePreScreenRetryRequest bizRefinancePreScreenRetryRequest, @NotNull access13800<? super BaseApiResponse<RefinancingStatusResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/cancel/apply/loan")
    @gf
    writeRaw<BaseApiResponse<Boolean>> onWarmupCompleted(@getUserCertList @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda13 imagePipelineExperimentsBuilderExternalSyntheticLambda13);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/reset/all/request/{type}")
    @gf
    writeRaw<BaseApiResponse<Object>> onWarmupCompleted(@getIvD(onNavigationEvent = "type") @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda17 imagePipelineExperimentsBuilderExternalSyntheticLambda17);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/find-loan/funnel-internalization/failure/guide")
    @gf
    writeRaw<BaseApiResponse<DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0>> onWarmupCompleted(@getUserCertList @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda24 imagePipelineExperimentsBuilderExternalSyntheticLambda24);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/pre-screen/loading")
    Object readTypedObject(@NotNull access13800<? super BaseApiResponse<LoanComparisonLoading>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/find-loan/pre-screen/loading/config")
    Object writeTypedObject(@NotNull access13800<? super BaseApiResponse<LoanComparisonLoadingConfig>> access13800Var);

    static /* synthetic */ Object onExtraCallbackWithResult(mediationData mediationdata, ImagePipelineExperimentsBuilderExternalSyntheticLambda17 imagePipelineExperimentsBuilderExternalSyntheticLambda17, ImagePipelineExperimentsBuilderExternalSyntheticLambda29 imagePipelineExperimentsBuilderExternalSyntheticLambda29, access13800 access13800Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPreScreeningResultItems");
        }
        if ((i & 2) != 0) {
            imagePipelineExperimentsBuilderExternalSyntheticLambda29 = new ImagePipelineExperimentsBuilderExternalSyntheticLambda29(null);
        }
        return mediationdata.onNavigationEvent(imagePipelineExperimentsBuilderExternalSyntheticLambda17, imagePipelineExperimentsBuilderExternalSyntheticLambda29, access13800Var);
    }
}
