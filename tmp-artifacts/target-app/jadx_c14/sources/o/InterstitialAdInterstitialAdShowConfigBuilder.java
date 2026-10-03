package o;

import im.toss.network.model.BaseApiResponse;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface InterstitialAdInterstitialAdShowConfigBuilder {
    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/plcc/config/notices")
    @gf
    writeRaw<BaseApiResponse<List<RemoveImageTransformMetaDataProducer>>> IAuthTabCallback();

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/plcc/issue/summary")
    @gf
    writeRaw<BaseApiResponse<BitmapUtil>> IAuthTabCallback(@getKey4(onNavigationEvent = "cardId") long j, @getKey4(onNavigationEvent = "baseMonth") @NotNull String str);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/plcc/config")
    @gf
    writeRaw<BaseApiResponse<shouldUseHardwareBitmapConfig>> onExtraCallbackWithResult();

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/plcc/approve/monthly-transactions/{baseMonth}")
    @gf
    writeRaw<BaseApiResponse<RepeatedPostprocessorRunner>> onExtraCallbackWithResult(@getIvD(onNavigationEvent = "baseMonth") @NotNull String str);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/plcc/benefit/performance")
    Object onNavigationEvent(@getKey4(onNavigationEvent = "baseMonth") @NotNull String str, @NotNull access13800<? super BaseApiResponse<PlccBenefitInfoResp>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/plcc/expected-bill-amount")
    @gf
    writeRaw<BaseApiResponse<createImageTranscoder>> onNavigationEvent();

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/plcc/bills/list")
    @gf
    writeRaw<BaseApiResponse<List<NativeJpegTranscoderFactory>>> onNavigationEvent(@getKey4(onNavigationEvent = "includePlccDue") boolean z);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/plcc/audit/issue-setting")
    @gf
    writeRaw<BaseApiResponse<DelayProducerExternalSyntheticLambda0>> onWarmupCompleted();

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/plcc/bills/{baseMonth}")
    @gf
    writeRaw<BaseApiResponse<createImageTranscoder>> onWarmupCompleted(@getIvD(onNavigationEvent = "baseMonth") @NotNull String str);

    static /* synthetic */ writeRaw IAuthTabCallback(InterstitialAdInterstitialAdShowConfigBuilder interstitialAdInterstitialAdShowConfigBuilder, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPlccBillsList");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return interstitialAdInterstitialAdShowConfigBuilder.onNavigationEvent(z);
    }
}
