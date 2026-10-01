package im.toss.features.home_v2.feature.consumption_card_recommendation;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionCardRecommendationSchemeActivity$$ExternalSyntheticLambda0 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ ConsumptionCardRecommendationSchemeActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ConsumptionCardRecommendationSchemeActivity consumptionCardRecommendationSchemeActivity = this.f$0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (i3 != 0) {
            return ConsumptionCardRecommendationSchemeActivity.onExtraCallbackWithResult(consumptionCardRecommendationSchemeActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        ConsumptionCardRecommendationSchemeActivity.onExtraCallbackWithResult(consumptionCardRecommendationSchemeActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }
}
