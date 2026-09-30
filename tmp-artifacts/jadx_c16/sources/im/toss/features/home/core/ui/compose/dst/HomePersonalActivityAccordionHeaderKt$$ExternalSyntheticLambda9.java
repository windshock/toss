package im.toss.features.home.core.ui.compose.dst;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.Extension;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomePersonalActivityAccordionHeaderKt$$ExternalSyntheticLambda9 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj, Object obj2) {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnWarmupCompleted = Extension.onWarmupCompleted(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i3 = 67 / 0;
        } else {
            unitOnWarmupCompleted = Extension.onWarmupCompleted(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        int i4 = IAuthTabCallback + 35;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
