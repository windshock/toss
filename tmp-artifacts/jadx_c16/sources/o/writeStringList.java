package o;

import im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeDoubleHomeListRowKt$;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import o.setFailCode;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class writeStringList {
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    public static final writeStringList IAuthTabCallback = new writeStringList();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(-100306752, false, new ComposableSingletons$HomeDoubleHomeListRowKt$.ExternalSyntheticLambda0());

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 95;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 41;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 35;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onNavigationEvent;
        int i5 = i2 + 121;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    static {
        int i = IAuthTabCallbackStub + 3;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 29;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i5 = onExtraCallbackWithResult + 13;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-100306752, i, -1, "im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeDoubleHomeListRowKt.lambda$-100306752.<anonymous> (HomeDoubleHomeListRow.kt:203)");
                int i6 = onExtraCallback + 83;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            }
            getExtensionRegistry.IAuthTabCallback(new setFailCode("double-preview", (ExecutorHelper) null, getThis.Companion.onNavigationEvent(), CollectionsKt.emptyList(), getExtensionRegistry.IAuthTabCallback(), new setFailCode.onNavigationEvent("left", (ExecutorHelper) null, getExtensionRegistry.onNavigationEvent("예금", "1,234,567원")), new setFailCode.onNavigationEvent("right", (ExecutorHelper) null, getExtensionRegistry.onNavigationEvent("투자", "7,654,321원")), 12.0f), getExtensionRegistry.onExtraCallback(), getExtensionRegistry.onExtraCallback(), getExtensionRegistry.onExtraCallback(), getExtensionRegistry.onExtraCallback(), (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 28080, 32);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallbackWithResult + 97;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }
}
