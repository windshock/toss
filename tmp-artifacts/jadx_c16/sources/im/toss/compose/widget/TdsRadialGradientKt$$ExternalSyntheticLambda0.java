package im.toss.compose.widget;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.setImageAssetsFolder;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TdsRadialGradientKt$$ExternalSyntheticLambda0 implements Function2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            setImageAssetsFolder.onExtraCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = setImageAssetsFolder.onExtraCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = onWarmupCompleted + 49;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }
}
