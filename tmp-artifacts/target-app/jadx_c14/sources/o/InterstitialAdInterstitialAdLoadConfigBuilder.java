package o;

import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.pedometer.DailySyncReq;
import viva.republica.toss.network.model.pedometer.DailySyncRes;
import viva.republica.toss.network.model.pedometer.HalfHourlySyncReq;
import viva.republica.toss.network.model.pedometer.PedometerInfo;
import viva.republica.toss.network.model.pedometer.PreviousStepReq;
import viva.republica.toss.network.model.pedometer.TodayStepRes;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface InterstitialAdInterstitialAdLoadConfigBuilder {
    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/step/version-info")
    @getUserCertOnMemory
    Object onExtraCallback(@getCurCert(onExtraCallbackWithResult = "referrer") @Nullable String str, @getCurCert(onExtraCallbackWithResult = "fromWidget") @NotNull String str2, @NotNull access13800<? super BaseApiResponse<PedometerInfo>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/step-v3/step/sync/half-hourly")
    Object onExtraCallback(@getUserCertList @NotNull HalfHourlySyncReq halfHourlySyncReq, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/step-v3/step/today")
    Object onExtraCallbackWithResult(@NotNull access13800<? super BaseApiResponse<TodayStepRes>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/step/sync")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull DailySyncReq dailySyncReq, @NotNull access13800<? super BaseApiResponse<DailySyncRes>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/step/sync/silent")
    Object onNavigationEvent(@getUserCertList @NotNull PreviousStepReq previousStepReq, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/step/pedometer-status")
    Object onWarmupCompleted(@getKey4(onNavigationEvent = "enable") boolean z, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    static /* synthetic */ Object onNavigationEvent(InterstitialAdInterstitialAdLoadConfigBuilder interstitialAdInterstitialAdLoadConfigBuilder, String str, String str2, access13800 access13800Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPedometerInfo");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = "N";
        }
        return interstitialAdInterstitialAdLoadConfigBuilder.onExtraCallback(str, str2, access13800Var);
    }
}
