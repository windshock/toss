package im.toss.features.home.feature.consumption_hidden.screen.list;

import kotlin.Unit;
import o.BizPermissionManager;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.RVGroup;
import o.getBacktraceNote;
import o.w5a;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionHiddenTransactionItemKt$$ExternalSyntheticLambda0 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ BizPermissionManager f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = RVGroup.onNavigationEvent(this.f$0, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        return unitOnNavigationEvent;
    }
}
