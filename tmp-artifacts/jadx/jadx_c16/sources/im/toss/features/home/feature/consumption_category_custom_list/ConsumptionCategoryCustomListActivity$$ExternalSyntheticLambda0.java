package im.toss.features.home.feature.consumption_category_custom_list;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionCategoryCustomListActivity$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ ConsumptionCategoryCustomListActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ConsumptionCategoryCustomListActivity consumptionCategoryCustomListActivity = this.f$0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (i3 != 0) {
            return ConsumptionCategoryCustomListActivity.onNavigationEvent(consumptionCategoryCustomListActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        ConsumptionCategoryCustomListActivity.onNavigationEvent(consumptionCategoryCustomListActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
