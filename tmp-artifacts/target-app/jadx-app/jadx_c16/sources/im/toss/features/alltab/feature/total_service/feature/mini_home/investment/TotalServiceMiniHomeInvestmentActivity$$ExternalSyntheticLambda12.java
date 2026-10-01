package im.toss.features.alltab.feature.total_service.feature.mini_home.investment;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.appAdjusted4ReusedOperator;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceMiniHomeInvestmentActivity$$ExternalSyntheticLambda12 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ TotalServiceMiniHomeInvestmentActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Unit unitOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallbackWithResult = TotalServiceMiniHomeInvestmentActivity.onExtraCallbackWithResult(this.f$0, (appAdjusted4ReusedOperator) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i3 = 95 / 0;
        } else {
            unitOnExtraCallbackWithResult = TotalServiceMiniHomeInvestmentActivity.onExtraCallbackWithResult(this.f$0, (appAdjusted4ReusedOperator) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        int i4 = IAuthTabCallback + 57;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
