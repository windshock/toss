package o;

import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.teens.RecommendedEnglishName;
import viva.republica.toss.network.model.teens.TeensCardDesignStockResponse;
import viva.republica.toss.network.model.teens.TeensCardEventApplyResponse;
import viva.republica.toss.network.model.teens.TeensCardTaxDeductionHistory;
import viva.republica.toss.network.model.teens.TeensCardTemporalAllowanceResponse;
import viva.republica.toss.network.model.teens.TeensCardTermsCheckResponse;
import viva.republica.toss.network.model.teens.TeensCardTransportationUnderMaintenanceResponse;
import viva.republica.toss.network.model.teens.TeensTransportationTradeUidReq;
import viva.republica.toss.network.model.teens.TeensTransportationTradeUidResponse;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface InterstitialAdExtendedListener {
    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/uss-card/config/cards/transactions")
    @gf
    Object IAuthTabCallback(@getKey4(onNavigationEvent = "fromDate") @NotNull String str, @getKey4(onNavigationEvent = "toDate") @NotNull String str2, @NotNull access13800<? super BaseApiResponse<ReactActivity>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/uss-card/transportation-cards/under-maintenance")
    Object IAuthTabCallback(@getKey4(onNavigationEvent = "type") @NotNull ReactPackageHelpergetNativeModuleIteratorinlinedIterable1 reactPackageHelpergetNativeModuleIteratorinlinedIterable1, @NotNull access13800<? super BaseApiResponse<TeensCardTransportationUnderMaintenanceResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/uss-card/cards/terms/check-and-withdraw")
    Object IAuthTabCallback(@NotNull access13800<? super BaseApiResponse<TeensCardTermsCheckResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/uss-card/tmoney/transportation-cards/charging-guidance-deposit")
    @gf
    writeRaw<BaseApiResponse<Object>> IAuthTabCallback();

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:DELETE"})
    @getIv8(onExtraCallback = "v3/uss-card/cards/{cardId}")
    @gf
    writeRaw<BaseApiResponse<Object>> IAuthTabCallback(@getIvD(onNavigationEvent = "cardId") long j);

    @getIv8(onExtraCallback = "v3/uss-card/cards/{cardId}/certify/first-half-password")
    @gf
    writeRaw<BaseApiResponse<Object>> IAuthTabCallback(@getIvD(onNavigationEvent = "cardId") long j, @getUserCertList @NotNull DoNotStripAny doNotStripAny);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:PUT"})
    @getIv8(onExtraCallback = "v3/uss-card/config/cards/{cardId}/card-password")
    @gf
    writeRaw<BaseApiResponse<Object>> IAuthTabCallback(@getIvD(onNavigationEvent = "cardId") long j, @getUserCertList @NotNull createNativeModules createnativemodules);

    @getIv8(onExtraCallback = "v3/uss-card/transportation-cards/transactions")
    @gf
    writeRaw<BaseApiResponse<Object>> IAuthTabCallback(@getUserCertList @NotNull ReactInstanceManagerExternalSyntheticLambda3 reactInstanceManagerExternalSyntheticLambda3);

    @getIv8(onExtraCallback = "v3/uss-card/tmoney/correct-balance/not-refunded-notification/reservation")
    @gf
    writeRaw<BaseApiResponse<Object>> IAuthTabCallback(@getUserCertList @NotNull ReactNativeHost reactNativeHost);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:DELETE"})
    @getIv8(onExtraCallback = "v3/uss-card/config/cards/{cardId}/report/lost")
    @gf
    writeRaw<BaseApiResponse<Object>> IAuthTabCallbackDefault(@getIvD(onNavigationEvent = "cardId") long j);

    @getIv8(onExtraCallback = "v3/uss-card/cards/cards/guess-english-name")
    @gf
    writeRaw<BaseApiResponse<RecommendedEnglishName>> IAuthTabCallbackStub();

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/uss-card/cards/stocks")
    Object onExtraCallback(@NotNull access13800<? super BaseApiResponse<TeensCardDesignStockResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/uss-card/cards/season2/intro/onelink")
    @gf
    writeRaw<BaseApiResponse<allowsFacebookLiteAuth>> onExtraCallback();

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/uss-card/tmoney/workdays-calculation")
    @gf
    writeRaw<BaseApiResponse<ReactInstanceManagerExternalSyntheticLambda2>> onExtraCallback(@getKey4(onNavigationEvent = "offsetInDays") int i);

    @getIv8(onExtraCallback = "v3/uss-card/config/cards/{cardId}/report/lost")
    @gf
    writeRaw<BaseApiResponse<Object>> onExtraCallback(@getIvD(onNavigationEvent = "cardId") long j);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/uss-card/tmoney/pay/transactions")
    @gf
    writeRaw<BaseApiResponse<ReactInstanceManager1>> onExtraCallback(@getUserCertList @NotNull ReactNativeHost reactNativeHost);

    @getIv8(onExtraCallback = "v3/uss-card/cards/neon-green/accept-referral")
    Object onExtraCallbackWithResult(@getKey4(onNavigationEvent = "referralKey") @NotNull String str, @NotNull access13800<? super BaseApiResponse<TeensCardEventApplyResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/uss-card/config/cards/deduction")
    Object onExtraCallbackWithResult(@NotNull access13800<? super BaseApiResponse<TeensCardTaxDeductionHistory>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/uss-card/tmoney/users")
    @gf
    writeRaw<BaseApiResponse<ReactInstanceManagerBuilderCompanion>> onExtraCallbackWithResult();

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:PUT"})
    @getIv8(onExtraCallback = "v3/uss-card/config/cards/{cardId}/pause")
    @gf
    writeRaw<BaseApiResponse<Object>> onExtraCallbackWithResult(@getIvD(onNavigationEvent = "cardId") long j);

    @getIv8(onExtraCallback = "v3/uss-card/cards/{cardId}/certify/password")
    @gf
    writeRaw<BaseApiResponse<Object>> onExtraCallbackWithResult(@getIvD(onNavigationEvent = "cardId") long j, @getUserCertList @NotNull UnknownCppException unknownCppException);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:PUT"})
    @getIv8(onExtraCallback = "v3/uss-card/config/cards/{cardId}/resume")
    @gf
    writeRaw<BaseApiResponse<Object>> onExtraCallbackWithResult(@getIvD(onNavigationEvent = "cardId") long j, @getUserCertList @NotNull createNativeModules createnativemodules);

    @getIv8(onExtraCallback = "v3/uss-card/transportation-cards/transaction-logs")
    @gf
    writeRaw<BaseApiResponse<Object>> onExtraCallbackWithResult(@getUserCertList @NotNull ReactInstanceManager reactInstanceManager);

    @getIv8(onExtraCallback = "v3/uss-card/cards/verify/password")
    @gf
    writeRaw<BaseApiResponse<Object>> onExtraCallbackWithResult(@getUserCertList @NotNull createNativeModules createnativemodules);

    @getIv8(onExtraCallback = "/api/v3/uss-card/cards/issuance")
    @gf
    writeRaw<BaseApiResponse<allowsWebViewAuth>> onExtraCallbackWithResult(@getUserCertList @NotNull createViewManagers createviewmanagers);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/uss-card/cards")
    @gf
    writeRaw<BaseApiResponse<DebugCorePackageExternalSyntheticLambda1>> onNavigationEvent();

    @getIv8(onExtraCallback = "v3/uss-card/cards/{cardId}/register")
    @gf
    writeRaw<BaseApiResponse<Object>> onNavigationEvent(@getIvD(onNavigationEvent = "cardId") long j);

    @getIv8(onExtraCallback = "v3/uss-card/cards/{cardId}/certify/cvc")
    @gf
    writeRaw<BaseApiResponse<Object>> onNavigationEvent(@getIvD(onNavigationEvent = "cardId") long j, @getUserCertList @NotNull allowsCustomTabAuth allowscustomtabauth);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:PUT"})
    @getIv8(onExtraCallback = "v3/uss-card/cards/{cardId}/shipping-address")
    @gf
    writeRaw<BaseApiResponse<Object>> onNavigationEvent(@getIvD(onNavigationEvent = "cardId") long j, @getUserCertList @NotNull allowsGetTokenAuth allowsgettokenauth);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/uss-card/config/cards/issuance/fee")
    @gf
    writeRaw<BaseApiResponse<getLoggingValue>> onNavigationEvent(@getKey4(onNavigationEvent = "nextCardDesign") @Nullable String str);

    @getIv8(onExtraCallback = "v3/uss-card/tmoney/transportation-cards/charging-error")
    @gf
    writeRaw<BaseApiResponse<Object>> onNavigationEvent(@getUserCertList @NotNull ReactInstanceManager2ExternalSyntheticLambda0 reactInstanceManager2ExternalSyntheticLambda0);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/uss-card/cards/temporal-allowance")
    Object onWarmupCompleted(@NotNull access13800<? super BaseApiResponse<TeensCardTemporalAllowanceResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/uss-card/tmoney/correct-balance/not-refunded/intelli/deactivate")
    @gf
    writeRaw<BaseApiResponse<Object>> onWarmupCompleted();

    @getIv8(onExtraCallback = "v3/uss-card/cards/cards/{cardId}/close")
    @gf
    writeRaw<BaseApiResponse<Object>> onWarmupCompleted(@getIvD(onNavigationEvent = "cardId") long j);

    @getIv8(onExtraCallback = "v3/uss-card/cards/mis-shipping/fee")
    @gf
    writeRaw<BaseApiResponse<getLoggingValue>> onWarmupCompleted(@getUserCertList @NotNull ReactFragmentBuilder reactFragmentBuilder);

    @getIv8(onExtraCallback = "v3/uss-card/cards")
    @gf
    writeRaw<BaseApiResponse<allowsKatanaAuth>> onWarmupCompleted(@getUserCertList @NotNull getReactModuleInfoProvider getreactmoduleinfoprovider);

    @getIv8(onExtraCallback = "v3/uss-card/transportation-cards/trade-uids")
    writeRaw<BaseApiResponse<TeensTransportationTradeUidResponse>> onWarmupCompleted(@getUserCertList @NotNull TeensTransportationTradeUidReq teensTransportationTradeUidReq);
}
