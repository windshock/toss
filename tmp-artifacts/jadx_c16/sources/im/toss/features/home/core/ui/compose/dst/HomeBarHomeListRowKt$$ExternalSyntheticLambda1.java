package im.toss.features.home.core.ui.compose.dst;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.setExtensionCreator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeBarHomeListRowKt$$ExternalSyntheticLambda1 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            setExtensionCreator.IAuthTabCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            throw null;
        }
        Unit unitIAuthTabCallback = setExtensionCreator.IAuthTabCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = onNavigationEvent + 59;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }
}
