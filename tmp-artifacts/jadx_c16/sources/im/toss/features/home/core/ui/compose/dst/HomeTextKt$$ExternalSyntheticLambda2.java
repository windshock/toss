package im.toss.features.home.core.ui.compose.dst;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.doMethodInvoke;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeTextKt$$ExternalSyntheticLambda2 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = doMethodInvoke.onExtraCallbackWithResult(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onNavigationEvent + 85;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
