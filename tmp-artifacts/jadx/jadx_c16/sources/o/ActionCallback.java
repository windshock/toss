package o;

import im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeTextKt$;
import im.toss.features.payment.ui.autopay.R;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ActionCallback {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public static final ActionCallback onNavigationEvent = new ActionCallback();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(424126591, false, new ComposableSingletons$HomeTextKt$.ExternalSyntheticLambda0());
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-636817039, false, new ComposableSingletons$HomeTextKt$.ExternalSyntheticLambda1());

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 85;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 35;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallback + 11;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = IAuthTabCallback;
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        return function2;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallbackWithResult;
        int i5 = i3 + 57;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    static {
        int i = IAuthTabCallbackDefault + 119;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onWarmupCompleted + 65;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 5 / 4;
            }
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(424126591, i, -1, "im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeTextKt.lambda$424126591.<anonymous> (HomeText.kt:74)");
            }
            Object obj = null;
            doMethodInvoke.onNavigationEvent(R.onWarmupCompleted(), new Object[]{new onChannelCreated("preview-center", (ExecutorHelper) null, getThis.Companion.onNavigationEvent(), CollectionsKt.emptyList(), new buildBaseLogContent("", asyncInterceptJsapi.IAuthTabCallback("가운데 정렬 텍스트", false, 1, (Object) null), "", (String) null, 15, ErrIdErrCodeResource.REGULAR, ImmutableMap.CENTER, "adaptive-grey-900", 0, (fillData) null), 8.0d, 24.0d, 24.0d, 8.0d, (fillData) null), null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 432, 8}, R.onWarmupCompleted(), 606453944, R.onWarmupCompleted(), R.onWarmupCompleted(), -606453943);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 7;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onWarmupCompleted + 113;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onWarmupCompleted + 107;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallback + 95;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-636817039, i, -1, "im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeTextKt.lambda$-636817039.<anonymous> (HomeText.kt:108)");
                    int i8 = 28 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-636817039, i, -1, "im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeTextKt.lambda$-636817039.<anonymous> (HomeText.kt:108)");
                }
            }
            doMethodInvoke.onNavigationEvent(R.onWarmupCompleted(), new Object[]{new onChannelCreated("preview-left", (ExecutorHelper) null, getThis.Companion.onNavigationEvent(), CollectionsKt.emptyList(), new buildBaseLogContent("", asyncInterceptJsapi.IAuthTabCallback("왼쪽 정렬 텍스트", false, 1, (Object) null), "", (String) null, 15, ErrIdErrCodeResource.SEMIBOLD, ImmutableMap.LEFT, "adaptive-grey-900", 0, (fillData) null), 8.0d, 24.0d, 24.0d, 8.0d, (fillData) null), null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 432, 8}, R.onWarmupCompleted(), 606453944, R.onWarmupCompleted(), R.onWarmupCompleted(), -606453943);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onExtraCallback + 55;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }
}
