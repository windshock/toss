package o;

import im.toss.features.home.core.remote.request.DefaultHomeRequestBody;
import im.toss.network.model.BaseApiResponse;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.home.CheckConsumptionExcludedUseStoreReq;
import viva.republica.toss.network.model.home.ConsumptionCardRecommendBannerResp;
import viva.republica.toss.network.model.home.ConsumptionExcludedUseStoreResult;
import viva.republica.toss.network.model.home.RegularExpenseUpdateRequest;
import viva.republica.toss.network.model.home.SaveConsumptionExcludedReq;
import viva.republica.toss.network.model.home.SaveConsumptionExcludedUseStoreReq;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface FullScreenAd {
    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/home/consumption/transaction/custom/amount/save")
    @gf
    Object IAuthTabCallback(@getUserCertList @NotNull AndroidFlipperClient androidFlipperClient, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST", "ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/home/consumption/excluded/use-store/check")
    Object IAuthTabCallback(@getUserCertList @NotNull CheckConsumptionExcludedUseStoreReq checkConsumptionExcludedUseStoreReq, @NotNull access13800<? super BaseApiResponse<ConsumptionExcludedUseStoreResult>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/home/consumption/transactions/card-benefit-calculation-banner")
    writeRaw<BaseApiResponse<ConsumptionCardRecommendBannerResp>> IAuthTabCallback();

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST", "ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/home/consumption/transaction/cash/detail")
    @getUserCertOnMemory
    @gf
    writeRaw<fetchSegment> IAuthTabCallback(@getCurCert(onExtraCallbackWithResult = "id") long j);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST", "ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/home/consumption/card-code/{cardCode}/transactions")
    @gf
    writeRaw<setReloadAndProfileConfig> IAuthTabCallback(@getIvD(onNavigationEvent = "cardCode") @NotNull String str, @getKey4(onNavigationEvent = "yearMonth") @NotNull String str2);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST", "ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/home/consumption/transaction/cash/save")
    @gf
    writeRaw<BaseApiResponse<Object>> IAuthTabCallback(@getUserCertList @NotNull NativeSegmentFetcherSpec nativeSegmentFetcherSpec);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST", "ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/home/consumption/memo/save")
    @gf
    writeRaw<BaseApiResponse<Object>> IAuthTabCallback(@getUserCertList @NotNull getInstanceIfInitialized getinstanceifinitialized);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST", "ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/home/consumption/hidden/save")
    @gf
    writeRaw<BaseApiResponse<Object>> IAuthTabCallback(@getUserCertList @NotNull getPluginByClass getpluginbyclass);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:PUT", "ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/home/mydata-home/activation/open-banking")
    @gf
    writeRaw<BaseApiResponse<Object>> IAuthTabCallback(@getUserCertList @NotNull setHidden sethidden);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/home/s/accounts/tossmoney/upgrade-guidance")
    @gf
    Object onExtraCallback(@NotNull access13800<? super BaseApiResponse<dumpSampledTraceToFile>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST", "ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/home/consumption/analysis/transactions")
    @gf
    writeRaw<setReloadAndProfileConfig> onExtraCallback(@getKey4(onNavigationEvent = "yearMonth") @NotNull String str);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST", "ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/home/consumption/category/transactions")
    @gf
    writeRaw<setReloadAndProfileConfig> onExtraCallback(@getKey4(onNavigationEvent = "category") @NotNull String str, @getKey4(onNavigationEvent = "since") @NotNull String str2, @getKey4(onNavigationEvent = "until") @NotNull String str3);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST", "ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/home/accounts/loan/{referenceId}/overview")
    @gf
    writeRaw<setGlobalHookSettings> onExtraCallback(@getIvD(onNavigationEvent = "referenceId") @NotNull String str, @certFinalize @NotNull Map<String, String> map);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST", "ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/home/consumption/transactions")
    @gf
    writeRaw<setReloadAndProfileConfig> onExtraCallback(@getKey4(onNavigationEvent = "yearMonth") @NotNull String str, @getUserCertList @NotNull NativeTimingSpec nativeTimingSpec);

    @getIv8(onExtraCallback = "v3/home/mydata-home/mydata-account/balances")
    @gf
    writeRaw<BaseApiResponse<List<signEX>>> onExtraCallback(@getUserCertList @NotNull Signature signature);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST", "ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/home/userEvent")
    @gf
    writeRaw<BaseApiResponse<Object>> onExtraCallback(@NotNull toLocaleUpperCase tolocaleuppercase);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST", "ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/home/consumption/excluded/save")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull SaveConsumptionExcludedReq saveConsumptionExcludedReq, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST", "ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/home/consumption/plcc-card/{cardId}/transactions")
    @gf
    writeRaw<setReloadAndProfileConfig> onExtraCallbackWithResult(@getIvD(onNavigationEvent = "cardId") long j, @getKey4(onNavigationEvent = "yearMonth") @NotNull String str);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST", "ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/home/consumption/transaction/related")
    @gf
    writeRaw<getSkeleonSymbol12> onExtraCallbackWithResult(@getUserCertList @NotNull DefaultHomeRequestBody defaultHomeRequestBody);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST", "ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/home/consumption/categories")
    @gf
    writeRaw<setSendIdleEvents> onExtraCallbackWithResult(@getKey4(onNavigationEvent = "yearMonth") @NotNull String str);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/home/s/accounts/{referenceId}/transactions")
    @gf
    writeRaw<NativeLinkingManagerSpec> onExtraCallbackWithResult(@getIvD(onNavigationEvent = "referenceId") @NotNull String str, @getKey4(onNavigationEvent = "yearMonth") @NotNull String str2, @getKey4(onNavigationEvent = "noCache") boolean z);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/home/mydata-home/refresh")
    @getUserCertOnMemory
    @gf
    Object onNavigationEvent(@getCurCert(onExtraCallbackWithResult = "screen") @NotNull String str, @getCurCert(onExtraCallbackWithResult = "type") @NotNull String str2, @getCurCert(onExtraCallbackWithResult = "launchType") @NotNull String str3, @getCurCert(onExtraCallbackWithResult = "launchAppSchemeUrl") @Nullable String str4, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST", "ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/home/accounts")
    @gf
    Object onNavigationEvent(@NotNull access13800<? super BaseApiResponse<List<setTranslucent>>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/home/consumption/regular-expense/remove")
    @gf
    Object onNavigationEvent(@getUserCertList @NotNull RegularExpenseUpdateRequest regularExpenseUpdateRequest, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST", "ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/home/consumption/excluded/use-store/save")
    Object onNavigationEvent(@getUserCertList @NotNull SaveConsumptionExcludedUseStoreReq saveConsumptionExcludedUseStoreReq, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST", "ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/home/consumption/cash/transactions")
    @gf
    writeRaw<setReloadAndProfileConfig> onNavigationEvent(@getKey4(onNavigationEvent = "yearMonth") @NotNull String str);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET", "ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/home/consumption/info")
    @gf
    writeRaw<getReloadAndProfileConfig> onWarmupCompleted();

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST", "ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/home/consumption/transaction/cash/delete")
    @getUserCertOnMemory
    @gf
    writeRaw<BaseApiResponse<Boolean>> onWarmupCompleted(@getCurCert(onExtraCallbackWithResult = "id") long j);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST", "ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/home/consumption/transaction/detail")
    @gf
    writeRaw<DateTimeFormat> onWarmupCompleted(@getUserCertList @NotNull DefaultHomeRequestBody defaultHomeRequestBody);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST", "ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/home/consumption/transaction/cash/update")
    @gf
    writeRaw<getNameStyle> onWarmupCompleted(@getUserCertList @NotNull NativeSegmentFetcherSpec nativeSegmentFetcherSpec);

    static /* synthetic */ writeRaw onExtraCallbackWithResult(FullScreenAd fullScreenAd, setHidden sethidden, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: activationOpenBanking");
        }
        if ((i & 1) != 0) {
            sethidden = new setHidden(false, 1, null);
        }
        return fullScreenAd.IAuthTabCallback(sethidden);
    }
}
