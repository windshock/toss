package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.OkHttpClientBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class OkHttpClientBuilder {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Unit onNavigationEvent(pingIntervalMillis pingintervalmillis, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(pingintervalmillis, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 101;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit onWarmupCompleted(pingIntervalMillis pingintervalmillis, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(pingintervalmillis, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 37;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 75 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull final pingIntervalMillis pingintervalmillis, @NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 67;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(pingintervalmillis, "");
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-154989917);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(pingintervalmillis) : cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(pingintervalmillis) ? 4 : 2) | i;
            int i7 = onNavigationEvent + 99;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 3;
            }
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i9 = onNavigationEvent + 55;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 15 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 32 : 16;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            int i11 = onWarmupCompleted + 31;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-154989917, i2, -1, "im.toss.tds.view.compat.component.state.AutoLogComposableState (AutoLogComposableState.kt:33)");
            }
            setPostviewFormatSelector.onExtraCallback(new accessgetCameraFactoryp[]{((accessisMonitoringp) setThreadList.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[0], GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -444290187, 444290201, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).onExtraCallback(pingintervalmillis.IAuthTabCallback().onExtraCallbackWithResult()), ((accessisMonitoringp) setThreadList.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[0], GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1913699679, -1913699676, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).onExtraCallback(new MonitorCrashHeaderParams((Set) pingintervalmillis.onExtraCallback().onExtraCallbackWithResult(), true))}, function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | (i2 & 112));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = onNavigationEvent + 105;
                onWarmupCompleted = i13 % 128;
                if (i13 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.view.compat.component.state.AutoLogComposableStateKt$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2, Object obj3) {
                    int i14 = 2 % 2;
                    int i15 = onNavigationEvent + 15;
                    onExtraCallbackWithResult = i15 % 128;
                    int i16 = i15 % 2;
                    Unit unitOnNavigationEvent = OkHttpClientBuilder.onNavigationEvent(pingintervalmillis, function2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i17 = onNavigationEvent + 103;
                    onExtraCallbackWithResult = i17 % 128;
                    if (i17 % 2 != 0) {
                        return unitOnNavigationEvent;
                    }
                    throw null;
                }
            });
        }
    }
}
