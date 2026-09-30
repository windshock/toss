package im.toss.appsintoss.iap;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailActivity$$ExternalSyntheticLambda0 implements getBacktraceNote {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ InAppPurchaseHistoryDetailActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = InAppPurchaseHistoryDetailActivity.onNavigationEvent(this.f$0, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = onExtraCallback + 57;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return unitOnNavigationEvent;
    }
}
