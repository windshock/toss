package im.toss.features.account_terminator.ui.devtool;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.getWidthSpec;
import o.w5a;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateDevToolActivity$$ExternalSyntheticLambda21 implements getBacktraceNote {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ getWidthSpec f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            AccountTerminateDevToolActivity.IAuthTabCallback(this.f$0, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            throw null;
        }
        Unit unitIAuthTabCallback = AccountTerminateDevToolActivity.IAuthTabCallback(this.f$0, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i3 = onNavigationEvent + 39;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 66 / 0;
        }
        return unitIAuthTabCallback;
    }
}
