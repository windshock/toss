package im.toss.appsintoss.iap;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.ACPayResult;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class InAppPurchaseHistoryActivity$$ExternalSyntheticLambda0 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ InAppPurchaseHistoryActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        Unit unit = (Unit) InAppPurchaseHistoryActivity.onExtraCallbackWithResult(new Object[]{this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, 999975058, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -999975058, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted());
        int i3 = IAuthTabCallback + 45;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
