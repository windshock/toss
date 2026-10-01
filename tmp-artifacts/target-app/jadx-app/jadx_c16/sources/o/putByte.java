package o;

import im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeFullTooltipKt$;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.JSAPICallRecord;
import o.hasJSAPIError;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class putByte {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final putByte IAuthTabCallback = new putByte();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-176424189, false, new ComposableSingletons$HomeFullTooltipKt$.ExternalSyntheticLambda0());
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(1632122094, false, new ComposableSingletons$HomeFullTooltipKt$.ExternalSyntheticLambda1());

    public static /* synthetic */ Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 71;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 89;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 113;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 69;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallback;
        int i5 = i2 + 37;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallbackWithResult;
        int i5 = i3 + 53;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    static {
        int i = IAuthTabCallbackStub + 41;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onWarmupCompleted + 107;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onWarmupCompleted + 105;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-176424189, i, -1, "im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeFullTooltipKt.lambda$-176424189.<anonymous> (HomeFullTooltip.kt:69)");
            }
            getNodeExtensionMap.IAuthTabCallback(new JSAPICallRecord("preview-tooltip", (ExecutorHelper) null, getThis.Companion.onNavigationEvent(), CollectionsKt.emptyList(), new hasJSAPIError(asyncInterceptJsapi.IAuthTabCallback("툴팁 텍스트입니다", false, 1, (Object) null), (String) null, hasJSAPIError.onExtraCallback.LEFT, (fillData) null), JSAPICallRecord.IAuthTabCallback.LEFT, JSAPICallRecord.onNavigationEvent.DOWN), (Function1) null, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 4);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = onNavigationEvent + 77;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 41;
        onNavigationEvent = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 2) != 2, i & 1)) {
            int i4 = onWarmupCompleted + 105;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onWarmupCompleted + 77;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1632122094, i, -1, "im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeFullTooltipKt.lambda$1632122094.<anonymous> (HomeFullTooltip.kt:93)");
                    int i7 = 70 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1632122094, i, -1, "im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeFullTooltipKt.lambda$1632122094.<anonymous> (HomeFullTooltip.kt:93)");
                }
            }
            getNodeExtensionMap.IAuthTabCallback(new JSAPICallRecord("preview-tooltip-center", (ExecutorHelper) null, getThis.Companion.onNavigationEvent(), CollectionsKt.emptyList(), new hasJSAPIError(asyncInterceptJsapi.IAuthTabCallback("가운데 정렬 툴팁", false, 1, (Object) null), "가운데 정렬 툴팁", hasJSAPIError.onExtraCallback.CENTER, (fillData) null), JSAPICallRecord.IAuthTabCallback.CENTER, JSAPICallRecord.onNavigationEvent.UP), (Function1) null, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 4);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i8 = onWarmupCompleted + 103;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }
}
