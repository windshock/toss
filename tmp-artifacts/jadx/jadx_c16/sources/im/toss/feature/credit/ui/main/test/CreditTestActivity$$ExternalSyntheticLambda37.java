package im.toss.feature.credit.ui.main.test;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.w5a;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda37 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditTestActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CreditTestActivity creditTestActivity = this.f$0;
        w5a w5aVar = (w5a) obj;
        if (i3 == 0) {
            return CreditTestActivity.onExtraCallback(creditTestActivity, w5aVar, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        Unit unitOnExtraCallback = CreditTestActivity.onExtraCallback(creditTestActivity, w5aVar, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = 17 / 0;
        return unitOnExtraCallback;
    }
}
