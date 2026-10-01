package o;

import com.facebook.react.uimanager.LayoutShadowNode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaPEtEbZoUEaIc2Hj0StO1oIbkWQ {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 IAuthTabCallback(@Nullable r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted onwarmupcompleted, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnExtraCallbackWithResult;
        long jOnWarmupCompleted;
        long jOnExtraCallback;
        boolean z;
        float fIAuthTabCallback;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted onnavigationevent = (i2 & 1) != 0 ? new r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), null) : onwarmupcompleted;
        if ((i2 & 2) != 0) {
            int i6 = onWarmupCompleted + 101;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            deviceQuirksExternalSyntheticLambda0OnExtraCallbackWithResult = x6.onExtraCallbackWithResult(x6.IAuthTabCallback, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        } else {
            deviceQuirksExternalSyntheticLambda0OnExtraCallbackWithResult = deviceQuirksExternalSyntheticLambda0;
        }
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda12 = (i2 & 4) != 0 ? null : virtualCameraControlExternalSyntheticLambda1;
        Function0<Unit> function02 = (i2 & 8) != 0 ? null : function0;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(118356738, i, -1, "im.toss.tds.compose.component.compound.toast.v1.rememberTdsToastV1State (TdsToastV1State.kt:108)");
        }
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
        SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback = r8lambdagFq9ZjkYMu6QWJyE7oyeb6idSPU.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted2.onExtraCallback()) {
            objOnMinimized = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            int i10 = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
        }
        findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized;
        boolean z2 = onnavigationevent instanceof r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted.onNavigationEvent;
        if (z2) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2071693031);
            jOnWarmupCompleted = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onWarmupCompleted(eExternalSyntheticLambda0.ToastBottomFill, cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            if (!Intrinsics.areEqual(onnavigationevent, r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted.IAuthTabCallback.onExtraCallback)) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2071689593);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                throw new NoWhenBranchMatchedException();
            }
            int i12 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2071695911);
            jOnWarmupCompleted = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onWarmupCompleted(eExternalSyntheticLambda0.ToastTopFill, cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        getHumanReadableName gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        GraphicDeviceInfo graphicDeviceInfoIAuthTabCallbackStub = isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub();
        if (z2) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2071703239);
            jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onWarmupCompleted(eExternalSyntheticLambda0.ToastText, cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            if (!Intrinsics.areEqual(onnavigationevent, r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted.IAuthTabCallback.onExtraCallback)) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2071699861);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                throw new NoWhenBranchMatchedException();
            }
            int i14 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i14 % 128;
            if (i14 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2071705927);
                jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 110);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2071705927);
                jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
        }
        getHumanReadableName gethumanreadablenameOnNavigationEvent = getHumanReadableName.onNavigationEvent(gethumanreadablename, jOnExtraCallback, 0L, graphicDeviceInfoIAuthTabCallbackStub, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null);
        boolean z3 = (((i & 14) ^ 6) > 4 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onnavigationevent)) || (i & 6) == 4;
        if (((i & 7168) ^ 3072) > 2048) {
            int i15 = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i15 % 128;
            int i16 = i15 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function02)) {
                z = (i & 3072) == 2048;
            }
        }
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(!(z | z3)) || objOnMinimized2 == onwarmupcompleted2.onExtraCallback()) {
            if (virtualCameraControlExternalSyntheticLambda12 != null) {
                fIAuthTabCallback = virtualCameraControlExternalSyntheticLambda12.IAuthTabCallback();
            } else {
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(z2 ? 10 : 6);
            }
            objOnMinimized2 = new r8lambda9NdP4TiRoMPFFes8JZ4B12HMQ(r8lambdanm9dm2eewl4vrptnjmesfjqky4, surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback, findresandmsg, onnavigationevent, gethumanreadablenameOnNavigationEvent, jOnWarmupCompleted, function02, deviceQuirksExternalSyntheticLambda0OnExtraCallbackWithResult, fIAuthTabCallback, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        r8lambda9NdP4TiRoMPFFes8JZ4B12HMQ r8lambda9ndp4tirompffes8jz4b12hmq = (r8lambda9NdP4TiRoMPFFes8JZ4B12HMQ) objOnMinimized2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i17 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i17 % 128;
            int i18 = i17 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return r8lambda9ndp4tirompffes8jz4b12hmq;
    }
}
