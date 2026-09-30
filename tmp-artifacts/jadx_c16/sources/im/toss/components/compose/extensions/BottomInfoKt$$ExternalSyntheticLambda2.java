package im.toss.components.compose.extensions;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ComponentRegistryBuilderExternalSyntheticLambda1;
import o.ConstraintTrackingWorkerExternalSyntheticLambda0;
import o.QuirksExternalSyntheticBackport0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BottomInfoKt$$ExternalSyntheticLambda2 implements Function2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ ConstraintTrackingWorkerExternalSyntheticLambda0 f$0;
    public final /* synthetic */ QuirksExternalSyntheticBackport0 f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ BottomInfoKt$$ExternalSyntheticLambda2(ConstraintTrackingWorkerExternalSyntheticLambda0 constraintTrackingWorkerExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2) {
        this.f$0 = constraintTrackingWorkerExternalSyntheticLambda0;
        this.f$1 = quirksExternalSyntheticBackport0;
        this.f$2 = i;
        this.f$3 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = ComponentRegistryBuilderExternalSyntheticLambda1.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onWarmupCompleted + 71;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }
}
