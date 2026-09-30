package im.toss.features.account_terminator.ui.devtool;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.getSupportedHighSpeedResolutionsFor;
import o.w5a;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateDevToolActivity$$ExternalSyntheticLambda8 implements getBacktraceNote {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        Object obj4 = null;
        if (i2 % 2 == 0) {
            AccountTerminateDevToolActivity.onExtraCallbackWithResult(this.f$0, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = AccountTerminateDevToolActivity.onExtraCallbackWithResult(this.f$0, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i3 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj4.hashCode();
        throw null;
    }
}
