package im.toss.features.account_terminator.ui.devtool;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.getSupportedHighSpeedResolutionsFor;
import o.w5a;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateDevToolActivity$$ExternalSyntheticLambda12 implements getBacktraceNote {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = AccountTerminateDevToolActivity.IAuthTabCallback(this.f$0, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = onExtraCallback + 99;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
