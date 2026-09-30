package im.toss.appsintoss.iap;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailActivity$$ExternalSyntheticLambda6 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ InAppPurchaseHistoryDetailActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity = this.f$0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
        if (i3 != 0) {
            return InAppPurchaseHistoryDetailActivity.onNavigationEvent(inAppPurchaseHistoryDetailActivity, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj2).intValue());
        }
        Unit unitOnNavigationEvent = InAppPurchaseHistoryDetailActivity.onNavigationEvent(inAppPurchaseHistoryDetailActivity, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj2).intValue());
        int i4 = 6 / 0;
        return unitOnNavigationEvent;
    }
}
