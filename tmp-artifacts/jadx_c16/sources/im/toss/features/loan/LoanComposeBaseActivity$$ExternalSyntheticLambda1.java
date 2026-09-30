package im.toss.features.loan;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComposeBaseActivity$$ExternalSyntheticLambda1 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanComposeBaseActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        Unit unitOnExtraCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallback = LoanComposeBaseActivity.onExtraCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i3 = 56 / 0;
        } else {
            unitOnExtraCallback = LoanComposeBaseActivity.onExtraCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        int i4 = onWarmupCompleted + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }
}
