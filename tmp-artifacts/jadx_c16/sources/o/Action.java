package o;

import im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeTdsListFooterKt$;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.setHasWhiteScreen;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class Action {
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    public static final Action onExtraCallback = new Action();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-1321157896, false, new ComposableSingletons$HomeTdsListFooterKt$.ExternalSyntheticLambda0());
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(255871922, false, new ComposableSingletons$HomeTdsListFooterKt$.ExternalSyntheticLambda1());

    public static /* synthetic */ Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 15;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 56 / 0;
        }
        int i6 = IAuthTabCallback + 15;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 9;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 65;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 5;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            function2 = onWarmupCompleted;
            int i4 = 17 / 0;
        } else {
            function2 = onWarmupCompleted;
        }
        int i5 = i2 + 7;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 37 / 0;
        }
        return function2;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 105;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallbackWithResult;
        int i4 = i2 + 105;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return function2;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = IAuthTabCallbackStub + 107;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 77;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i5 = onNavigationEvent + 41;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1321157896, i, -1, "im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeTdsListFooterKt.lambda$-1321157896.<anonymous> (HomeTdsListFooter.kt:96)");
            }
            setupExceptionHandler.IAuthTabCallback(new IBigDataConsumerReadyCallback("preview", getThis.Companion.onNavigationEvent(), CollectionsKt.emptyList(), (ExecutorHelper) null, "자산 편집", (iterator) null, (setHasWhiteScreen.IAuthTabCallback) null, false, (fillData) null), (Function1) null, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 4);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onNavigationEvent + 33;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 113;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 90 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = IAuthTabCallback + 21;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = IAuthTabCallback + 31;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(255871922, i, -1, "im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeTdsListFooterKt.lambda$255871922.<anonymous> (HomeTdsListFooter.kt:117)");
            }
            setupExceptionHandler.IAuthTabCallback(new IBigDataConsumerReadyCallback("preview-border", getThis.Companion.onNavigationEvent(), CollectionsKt.emptyList(), (ExecutorHelper) null, "더보기", (iterator) null, (setHasWhiteScreen.IAuthTabCallback) null, true, (fillData) null), (Function1) null, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 4);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = IAuthTabCallback + 47;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = onNavigationEvent + 71;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 3 % 5;
            }
        }
        return Unit.INSTANCE;
    }
}
