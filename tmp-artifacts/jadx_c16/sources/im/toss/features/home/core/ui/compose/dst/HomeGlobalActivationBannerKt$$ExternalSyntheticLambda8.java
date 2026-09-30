package im.toss.features.home.core.ui.compose.dst;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getExtensionByPoint;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeGlobalActivationBannerKt$$ExternalSyntheticLambda8 implements Function2 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = getExtensionByPoint.onNavigationEvent(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onWarmupCompleted + 49;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
