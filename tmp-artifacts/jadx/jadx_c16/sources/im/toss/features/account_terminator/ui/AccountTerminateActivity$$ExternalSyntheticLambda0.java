package im.toss.features.account_terminator.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateActivity$$ExternalSyntheticLambda0 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AccountTerminateActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AccountTerminateActivity accountTerminateActivity = this.f$0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
        if (i3 == 0) {
            return AccountTerminateActivity.onWarmupCompleted(accountTerminateActivity, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj2).intValue());
        }
        Unit unitOnWarmupCompleted = AccountTerminateActivity.onWarmupCompleted(accountTerminateActivity, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj2).intValue());
        int i4 = 27 / 0;
        return unitOnWarmupCompleted;
    }
}
