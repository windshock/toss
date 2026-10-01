package o;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.initMiniApp;
import o.logAndOpenStore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class logAndOpenStore {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public static final void IAuthTabCallback(@NotNull Context context, @Nullable Long l) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        int i4 = onWarmupCompleted + 73;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, BrickModuleImplExternalSyntheticLambda2 brickModuleImplExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 113;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            onWarmupCompleted(getbacktracenote, brickModuleImplExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(getbacktracenote, brickModuleImplExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(initMiniApp.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(onwarmupcompleted);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(onwarmupcompleted);
        int i3 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(initMiniApp.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 5;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final BrickModuleImplExternalSyntheticLambda2 onExtraCallbackWithResult(@NotNull Context context, @NotNull final getBacktraceNote<? super BrickModuleImplExternalSyntheticLambda2, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        final BrickModuleImplExternalSyntheticLambda2 brickModuleImplExternalSyntheticLambda2 = new BrickModuleImplExternalSyntheticLambda2(context);
        brickModuleImplExternalSyntheticLambda2.onNavigationEvent((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallbackWithResult(882112716, true, new Function2() { // from class: im.toss.uikit.dsl.BottomSheetDslKt$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 119;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = logAndOpenStore.onExtraCallbackWithResult(getbacktracenote, brickModuleImplExternalSyntheticLambda2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i5 = onWarmupCompleted + 7;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }));
        int i2 = onExtraCallback + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return brickModuleImplExternalSyntheticLambda2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(getBacktraceNote getbacktracenote, BrickModuleImplExternalSyntheticLambda2 brickModuleImplExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 13;
        onWarmupCompleted = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 4) != 4, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(882112716, i, -1, "im.toss.uikit.dsl.composableBottomSheet.<anonymous> (BottomSheetDsl.kt:64)");
            }
            getbacktracenote.invoke(brickModuleImplExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i4 = onWarmupCompleted + 49;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }
}
