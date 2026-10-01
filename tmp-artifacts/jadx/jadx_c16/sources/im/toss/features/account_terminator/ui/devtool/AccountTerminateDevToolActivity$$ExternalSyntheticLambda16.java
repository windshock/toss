package im.toss.features.account_terminator.ui.devtool;

import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.specToLayoutParam;
import o.w5a;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateDevToolActivity$$ExternalSyntheticLambda16 implements getBacktraceNote {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ specToLayoutParam f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        specToLayoutParam spectolayoutparam = this.f$0;
        w5a w5aVar = (w5a) obj;
        if (i3 == 0) {
            return AccountTerminateDevToolActivity.IAuthTabCallback(spectolayoutparam, w5aVar, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        AccountTerminateDevToolActivity.IAuthTabCallback(spectolayoutparam, w5aVar, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
