package im.toss.features.alltab.feature.total_service.feature.common.ui;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.enableTranslucentStatusBar;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ComposableExtensionsKt$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Function2 f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Function2 function2 = this.f$0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
        if (i3 != 0) {
            return enableTranslucentStatusBar.onExtraCallbackWithResult(function2, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj2).intValue());
        }
        enableTranslucentStatusBar.onExtraCallbackWithResult(function2, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj2).intValue());
        throw null;
    }
}
