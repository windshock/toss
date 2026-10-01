package im.toss.features.leave.ui.visitor;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.MainResourcePackage3;
import o.getBacktraceNote;
import o.u3;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class VisitorRemainingBalanceBridgeContentKt$$ExternalSyntheticLambda2 implements getBacktraceNote {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Function0 f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        IAuthTabCallback = i2 % 128;
        Object obj4 = null;
        if (i2 % 2 != 0) {
            MainResourcePackage3.onNavigationEvent(this.f$0, (u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            throw null;
        }
        Unit unitOnNavigationEvent = MainResourcePackage3.onNavigationEvent(this.f$0, (u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i3 = IAuthTabCallback + 117;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        obj4.hashCode();
        throw null;
    }
}
