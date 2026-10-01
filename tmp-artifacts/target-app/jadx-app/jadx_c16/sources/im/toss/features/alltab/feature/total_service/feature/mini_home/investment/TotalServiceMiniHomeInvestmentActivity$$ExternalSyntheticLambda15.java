package im.toss.features.alltab.feature.total_service.feature.mini_home.investment;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceMiniHomeInvestmentActivity$$ExternalSyntheticLambda15 implements Function2 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ TotalServiceMiniHomeInvestmentActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TotalServiceMiniHomeInvestmentActivity totalServiceMiniHomeInvestmentActivity = this.f$0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (i3 == 0) {
            return TotalServiceMiniHomeInvestmentActivity.onNavigationEvent(totalServiceMiniHomeInvestmentActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        TotalServiceMiniHomeInvestmentActivity.onNavigationEvent(totalServiceMiniHomeInvestmentActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
