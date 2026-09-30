package im.toss.features.home.core.ui.compose.dst;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.shouldThrowOut;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeSendInfoKt$$ExternalSyntheticLambda5 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            shouldThrowOut.onWarmupCompleted(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = shouldThrowOut.onWarmupCompleted(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = onExtraCallback + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }
}
