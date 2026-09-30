package im.toss.features.home.feature.consumption_category_edit;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionCategoryEditActivity$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ ConsumptionCategoryEditActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ConsumptionCategoryEditActivity consumptionCategoryEditActivity = this.f$0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
        if (i3 == 0) {
            return ConsumptionCategoryEditActivity.onExtraCallbackWithResult(consumptionCategoryEditActivity, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj2).intValue());
        }
        ConsumptionCategoryEditActivity.onExtraCallbackWithResult(consumptionCategoryEditActivity, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj2).intValue());
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
