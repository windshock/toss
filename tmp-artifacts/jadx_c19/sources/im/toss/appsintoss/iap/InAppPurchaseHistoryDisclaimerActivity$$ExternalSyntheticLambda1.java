package im.toss.appsintoss.iap;

import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDisclaimerActivity$$ExternalSyntheticLambda1 implements getBacktraceNote {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ InAppPurchaseHistoryDisclaimerActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        InAppPurchaseHistoryDisclaimerActivity inAppPurchaseHistoryDisclaimerActivity = this.f$0;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) obj;
        if (i4 == 0) {
            return InAppPurchaseHistoryDisclaimerActivity.onExtraCallback(inAppPurchaseHistoryDisclaimerActivity, deviceQuirksExternalSyntheticLambda0, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        InAppPurchaseHistoryDisclaimerActivity.onExtraCallback(inAppPurchaseHistoryDisclaimerActivity, deviceQuirksExternalSyntheticLambda0, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        throw null;
    }
}
