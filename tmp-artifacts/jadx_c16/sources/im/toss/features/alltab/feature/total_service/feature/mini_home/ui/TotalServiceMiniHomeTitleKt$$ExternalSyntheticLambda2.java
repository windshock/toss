package im.toss.features.alltab.feature.total_service.feature.mini_home.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.onButtonVisibilityChange;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceMiniHomeTitleKt$$ExternalSyntheticLambda2 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onButtonVisibilityChange.onNavigationEvent(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onButtonVisibilityChange.onNavigationEvent(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }
}
