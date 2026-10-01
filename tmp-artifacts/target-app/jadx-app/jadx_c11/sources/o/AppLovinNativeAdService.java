package o;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdService;
import o.SurfaceProcessorNodeOut;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinNativeAdService {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Unit onNavigationEvent(SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(surfaceProcessorNodeOut);
        int i4 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void onExtraCallback(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, @Nullable Integer num, @Nullable createCameraCaptureCallback createcameracapturecallback, float f, @Nullable Map<String, select> map, @Nullable bindChildren bindchildren, @Nullable use useVar, long j4, int i, boolean z, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable Function1<? super SurfaceProcessorNodeOut, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3, int i4) throws NoWhenBranchMatchedException {
        long jOnTransact;
        long j5;
        Integer num2;
        GraphicDeviceInfo graphicDeviceInfo2;
        Function1<? super SurfaceProcessorNodeOut, Unit> function12;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i4 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        getHumanReadableName gethumanreadablename2 = (i4 & 4) != 0 ? (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted()) : gethumanreadablename;
        Object obj = null;
        if ((i4 & 8) != 0) {
            int i6 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                setByteOrder.Companion.onTransact();
                obj.hashCode();
                throw null;
            }
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        if ((i4 & 16) != 0) {
            long jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
            int i7 = onExtraCallbackWithResult + 7;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            j5 = jOnNavigationEvent;
        } else {
            j5 = j2;
        }
        long jOnNavigationEvent2 = (i4 & 32) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j3;
        if ((i4 & 64) != 0) {
            int i9 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            num2 = null;
        } else {
            num2 = num;
        }
        createCameraCaptureCallback createcameracapturecallback2 = (i4 & 128) != 0 ? null : createcameracapturecallback;
        float fOnExtraCallback = (i4 & 256) != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f;
        Map<String, select> mapOnNavigationEvent = (i4 & 512) != 0 ? access8100.onNavigationEvent() : map;
        bindChildren bindchildren2 = (i4 & 1024) != 0 ? null : bindchildren;
        use useVar2 = (i4 & 2048) != 0 ? null : useVar;
        long jOnNavigationEvent3 = (i4 & 4096) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j4;
        int iOnWarmupCompleted = (i4 & 8192) != 0 ? AppLovinVastMediaViewf.Companion.onWarmupCompleted() : i;
        boolean z2 = (i4 & 16384) != 0 ? true : z;
        if ((32768 & i4) != 0) {
            int i11 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        if ((i4 & 65536) != 0) {
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.atom.paragraph.TdsParagraphV1Kt$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj2) {
                        int i12 = 2 % 2;
                        int i13 = onExtraCallbackWithResult + 75;
                        onNavigationEvent = i13 % 128;
                        int i14 = i13 % 2;
                        Unit unitOnNavigationEvent = AppLovinNativeAdService.onNavigationEvent((SurfaceProcessorNodeOut) obj2);
                        int i15 = onNavigationEvent + 25;
                        onExtraCallbackWithResult = i15 % 128;
                        int i16 = i15 % 2;
                        return unitOnNavigationEvent;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            function12 = (Function1) objOnMinimized;
        } else {
            function12 = function1;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(191794806, i2, i3, "im.toss.tds.compose.component.atom.paragraph.TdsParagraphV1 (TdsParagraphV1.kt:43)");
        }
        int i12 = i2 << 3;
        int i13 = i3 << 3;
        AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasprovider, quirksExternalSyntheticBackport02, gethumanreadablename2, jOnTransact, j5, jOnNavigationEvent2, null, num2, createcameracapturecallback2, fOnExtraCallback, mapOnNavigationEvent, bindchildren2, useVar2, jOnNavigationEvent3, iOnWarmupCompleted, z2, graphicDeviceInfo2, function12, cameraCaptureResultEmptyCameraCaptureResult, (524286 & i2) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), ((i2 >> 27) & 14) | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (3670016 & i13) | (i13 & 29360128), 64);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i14 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i15 == 0) {
                throw null;
            }
        }
    }
}
