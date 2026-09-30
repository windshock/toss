package com.google.accompanist.swiperefresh;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.ForwardingCameraControl;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.setTaggedAddrCtrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ComposableSingletons$SwipeRefreshKt {
    public static final ComposableSingletons$SwipeRefreshKt INSTANCE = new ComposableSingletons$SwipeRefreshKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static setTaggedAddrCtrl<SwipeRefreshState, VirtualCameraControlExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> f0lambda1 = ForwardingCameraControl.onExtraCallbackWithResult(-1555165631, false, new setTaggedAddrCtrl<SwipeRefreshState, VirtualCameraControlExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>() { // from class: com.google.accompanist.swiperefresh.ComposableSingletons$SwipeRefreshKt$lambda-1$1
        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m24invokeziNgDLE((SwipeRefreshState) obj, ((VirtualCameraControlExternalSyntheticLambda1) obj2).IAuthTabCallback(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Number) obj4).intValue());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-ziNgDLE, reason: not valid java name */
        public final void m24invokeziNgDLE(@NotNull SwipeRefreshState swipeRefreshState, float f, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            int i3;
            Intrinsics.checkNotNullParameter(swipeRefreshState, "");
            if ((i2 & 14) == 0) {
                i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(swipeRefreshState) ? 4 : 2);
            } else {
                i3 = i2;
            }
            if ((i2 & 112) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f) ? 32 : 16;
            }
            if ((i3 & 731) == 146 && cameraCaptureResultEmptyCameraCaptureResult.onMessageChannelReady()) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1555165631, i3, -1, "com.google.accompanist.swiperefresh.ComposableSingletons$SwipeRefreshKt.lambda-1.<anonymous> (SwipeRefresh.kt:234)");
            }
            SwipeRefreshIndicatorKt.m25SwipeRefreshIndicator_UAkqwU(swipeRefreshState, f, null, false, false, false, 0L, 0L, null, 0.0f, false, 0.0f, cameraCaptureResultEmptyCameraCaptureResult, i3 & 126, 0, 4092);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
    });

    /* renamed from: getLambda-1$swiperefresh_release, reason: not valid java name */
    public final setTaggedAddrCtrl<SwipeRefreshState, VirtualCameraControlExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> m23getLambda1$swiperefresh_release() {
        return f0lambda1;
    }
}
