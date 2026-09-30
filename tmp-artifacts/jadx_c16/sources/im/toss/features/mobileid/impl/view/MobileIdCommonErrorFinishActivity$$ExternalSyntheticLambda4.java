package im.toss.features.mobileid.impl.view;

import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.enableLoopMonitor;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdCommonErrorFinishActivity$$ExternalSyntheticLambda4 implements getBacktraceNote {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ MobileIdCommonErrorFinishActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (enableLoopMonitor) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
        if (i3 != 0) {
            return (Unit) MobileIdCommonErrorFinishActivity.onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 781887030, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -781887029, objArr, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        }
        throw null;
    }
}
