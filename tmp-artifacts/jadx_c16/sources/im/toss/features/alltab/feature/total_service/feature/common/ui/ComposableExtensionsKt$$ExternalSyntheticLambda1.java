package im.toss.features.alltab.feature.total_service.feature.common.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.enableTranslucentStatusBar;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ComposableExtensionsKt$$ExternalSyntheticLambda1 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ Function2 f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ ComposableExtensionsKt$$ExternalSyntheticLambda1(float f, Function2 function2, int i, int i2) {
        this.f$0 = f;
        this.f$1 = function2;
        this.f$2 = i;
        this.f$3 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = enableTranslucentStatusBar.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
