package im.toss.features.alltab.feature.total_service.feature.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.addOnCapsuleReadyListener;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceListRowKt$$ExternalSyntheticLambda39 implements Function2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            addOnCapsuleReadyListener.onWarmupCompleted(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = addOnCapsuleReadyListener.onWarmupCompleted(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = onWarmupCompleted + 89;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 36 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
