package im.toss.features.home.core.ui.compose.dst;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.setupExceptionHandler;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeTdsListFooterKt$$ExternalSyntheticLambda3 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.f$0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (i3 != 0) {
            return setupExceptionHandler.onNavigationEvent(i4, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        setupExceptionHandler.onNavigationEvent(i4, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }
}
