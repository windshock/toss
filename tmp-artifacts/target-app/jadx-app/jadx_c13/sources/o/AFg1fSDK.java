package o;

import androidx.compose.runtime.saveable.RememberSaveableKt;
import im.toss.features.home.core.local.model.TransactionFilterLocal;
import kotlin.jvm.functions.Function0;
import o.AFg1fSDK;
import o.AFg1gSDK;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFg1fSDK {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ AFg1gSDK IAuthTabCallback(AFg1eSDK aFg1eSDK, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, toMetersPerSecond tometerspersecond, float f, float f2, findResAndMsg findresandmsg) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AFg1gSDK aFg1gSDKOnExtraCallback = onExtraCallback(aFg1eSDK, r8lambdanm9dm2eewl4vrptnjmesfjqky4, tometerspersecond, f, f2, findresandmsg);
        int i4 = onWarmupCompleted + 29;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return aFg1gSDKOnExtraCallback;
        }
        throw null;
    }

    public static final AFg1gSDK onWarmupCompleted(@Nullable r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, @Nullable AFg1eSDK aFg1eSDK, @Nullable toMetersPerSecond tometerspersecond, float f, float f2, @Nullable findResAndMsg findresandmsg, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky42;
        final AFg1eSDK aFg1eSDK2;
        final toMetersPerSecond tometerspersecond2;
        final float fIAuthTabCallback;
        final float fIAuthTabCallback2;
        final findResAndMsg findresandmsg2;
        boolean z;
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = onExtraCallback + 37;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            r8lambdanm9dm2eewl4vrptnjmesfjqky42 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
        } else {
            r8lambdanm9dm2eewl4vrptnjmesfjqky42 = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
        }
        if ((i2 & 2) != 0) {
            AFg1eSDK aFg1eSDK3 = AFg1eSDK.Hidden;
            int i6 = onExtraCallback + 7;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            aFg1eSDK2 = aFg1eSDK3;
        } else {
            aFg1eSDK2 = aFg1eSDK;
        }
        if ((i2 & 4) != 0) {
            tometerspersecond2 = (AppLovinAdClickListener) AFg1hSDKCompanion.onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), 910879685, TransactionFilterLocal.Companion.onNavigationEvent(), -910879685, new Object[]{AFg1hSDKCompanion.onNavigationEvent}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent());
        } else {
            tometerspersecond2 = tometerspersecond;
        }
        if ((i2 & 8) != 0) {
            int i8 = onExtraCallback + 123;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            fIAuthTabCallback = AFg1hSDKCompanion.onNavigationEvent.IAuthTabCallback();
        } else {
            fIAuthTabCallback = f;
        }
        if ((i2 & 16) != 0) {
            int i10 = onExtraCallback + 55;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(50.0f);
        } else {
            fIAuthTabCallback2 = f2;
        }
        if ((i2 & 32) != 0) {
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            findresandmsg2 = (findResAndMsg) objOnMinimized;
        } else {
            findresandmsg2 = findresandmsg;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i12 = onExtraCallback + 45;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1802627888, i, -1, "im.toss.tosssecurities.uikit.compound.topsheet.rememberTossSecTopSheetState (TossSecTopSheetState.kt:75)");
        }
        Object[] objArr = {r8lambdanm9dm2eewl4vrptnjmesfjqky42, tometerspersecond2, VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback), VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback2)};
        getCaptureIds<AFg1gSDK, AFg1eSDK> getcaptureidsOnExtraCallbackWithResult = AFg1gSDK.Companion.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky42, tometerspersecond2, fIAuthTabCallback, fIAuthTabCallback2, findresandmsg2);
        boolean z2 = (((i & 112) ^ 48) > 32 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(aFg1eSDK2.ordinal())) || (i & 48) == 32;
        boolean z3 = (((i & 14) ^ 6) > 4 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky42)) || (i & 6) == 4;
        boolean z4 = (((i & 896) ^ 384) > 256 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(tometerspersecond2)) || (i & 384) == 256;
        boolean z5 = (((i & 7168) ^ 3072) > 2048 && cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(fIAuthTabCallback)) || (i & 3072) == 2048;
        if (((57344 & i) ^ 24576) > 16384 && cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(fIAuthTabCallback2)) {
            z = true;
        } else if ((i & 24576) == 16384) {
            int i14 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
            onExtraCallback = i14 % 128;
            int i15 = i14 % 2;
            z = true;
        } else {
            z = false;
        }
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg2);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((z | z2 | z3 | z4 | z5 | zOnExtraCallback) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized2 = new Function0() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheetStateKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i16 = 2 % 2;
                    int i17 = onNavigationEvent + 89;
                    IAuthTabCallback = i17 % 128;
                    int i18 = i17 % 2;
                    AFg1gSDK aFg1gSDKIAuthTabCallback = AFg1fSDK.IAuthTabCallback(aFg1eSDK2, r8lambdanm9dm2eewl4vrptnjmesfjqky42, tometerspersecond2, fIAuthTabCallback, fIAuthTabCallback2, findresandmsg2);
                    int i19 = onNavigationEvent + 61;
                    IAuthTabCallback = i19 % 128;
                    int i20 = i19 % 2;
                    return aFg1gSDKIAuthTabCallback;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        AFg1gSDK aFg1gSDK = (AFg1gSDK) RememberSaveableKt.onWarmupCompleted(objArr, getcaptureidsOnExtraCallbackWithResult, (Function0) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return aFg1gSDK;
    }

    private static final AFg1gSDK onExtraCallback(AFg1eSDK aFg1eSDK, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, toMetersPerSecond tometerspersecond, float f, float f2, findResAndMsg findresandmsg) {
        int i = 2 % 2;
        AFg1gSDK aFg1gSDK = new AFg1gSDK(aFg1eSDK, r8lambdanm9dm2eewl4vrptnjmesfjqky4, tometerspersecond, f, f2, findresandmsg, null);
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return aFg1gSDK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
