package im.toss.features.account_terminator.ui.devtool;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateDevToolActivity$$ExternalSyntheticLambda24 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ AccountTerminateDevToolActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            AccountTerminateDevToolActivity.onExtraCallbackWithResult(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = AccountTerminateDevToolActivity.onExtraCallbackWithResult(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 79 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
