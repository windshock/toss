package im.toss.securities.core.exposure;

import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.ForwardingCameraControl;
import o.accessgetCameraFactoryp;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.getSupportedHighSpeedResolutionsFor;
import o.p0a;
import o.pExternalSyntheticLambda1;
import o.pExternalSyntheticLambda2;
import o.setPostviewFormatSelector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RegisterScreenTrackerKt {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    private static final Unit IAuthTabCallback(pExternalSyntheticLambda1 pexternalsyntheticlambda1, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, boolean z, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            onExtraCallback(pexternalsyntheticlambda1, cameraPresenceProviderExternalSyntheticLambda6, z, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            onExtraCallback(pexternalsyntheticlambda1, cameraPresenceProviderExternalSyntheticLambda6, z, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 8 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(pExternalSyntheticLambda1 pexternalsyntheticlambda1, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, boolean z, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(pexternalsyntheticlambda1, cameraPresenceProviderExternalSyntheticLambda6, z, function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(pExternalSyntheticLambda1 pexternalsyntheticlambda1, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, boolean z, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(pexternalsyntheticlambda1, cameraPresenceProviderExternalSyntheticLambda6, z, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 34 / 0;
        }
        return unitIAuthTabCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(pExternalSyntheticLambda1 pexternalsyntheticlambda1, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, boolean z, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(!((i & 3) == 2), i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-223746367, i, -1, "im.toss.securities.core.exposure.RegisterScreenTracker.<anonymous> (RegisterScreenTracker.kt:22)");
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(pexternalsyntheticlambda1);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                int i3 = onNavigationEvent + 105;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = Boolean.valueOf(!pexternalsyntheticlambda1.onExtraCallback());
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    int i5 = onExtraCallbackWithResult + 27;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 4 % 5;
                    }
                }
                if (((Boolean) objOnMinimized).booleanValue()) {
                    int i7 = onNavigationEvent + 103;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(161366139);
                    p0a.IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6, z, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(161464161);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull final pExternalSyntheticLambda1 pexternalsyntheticlambda1, @Nullable final CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6, final boolean z, @NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(pexternalsyntheticlambda1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(937112065);
        if ((i & 6) != 0) {
            int i7 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 3;
            }
            i3 = i;
        } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(pexternalsyntheticlambda1)) {
            int i9 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2 != 0 ? 2 : 4;
            i3 = i10 | i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            int i12 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i12 % 128;
            i3 = i12 % 2 != 0 ? i3 | 99 : i3 | 48;
        } else if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6)) {
                int i13 = onExtraCallbackWithResult + 75;
                onNavigationEvent = i13 % 128;
                i4 = i13 % 2 != 0 ? 111 : 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            int i15 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 85 / 0;
                i5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 2048 : 1024;
            } else if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
            }
            i3 |= i5;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) != 1170, i3 & 1)) {
            if (i11 != 0) {
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                cameraPresenceProviderExternalSyntheticLambda6 = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            }
            if (i14 != 0) {
                int i17 = onExtraCallbackWithResult + 59;
                onNavigationEvent = i17 % 128;
                int i18 = i17 % 2;
                z = true;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i19 = onExtraCallbackWithResult + 45;
                onNavigationEvent = i19 % 128;
                int i20 = i19 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(937112065, i3, -1, "im.toss.securities.core.exposure.RegisterScreenTracker (RegisterScreenTracker.kt:17)");
            }
            setPostviewFormatSelector.onNavigationEvent(pExternalSyntheticLambda2.onExtraCallback().onExtraCallback(pexternalsyntheticlambda1), ForwardingCameraControl.onExtraCallback(-223746367, true, new Function2() { // from class: im.toss.securities.core.exposure.RegisterScreenTrackerKt$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    Unit unitIAuthTabCallback;
                    int i21 = 2 % 2;
                    int i22 = onNavigationEvent + 69;
                    onExtraCallback = i22 % 128;
                    if (i22 % 2 != 0) {
                        unitIAuthTabCallback = RegisterScreenTrackerKt.IAuthTabCallback(pexternalsyntheticlambda1, cameraPresenceProviderExternalSyntheticLambda6, z, function2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i23 = 61 / 0;
                    } else {
                        unitIAuthTabCallback = RegisterScreenTrackerKt.IAuthTabCallback(pexternalsyntheticlambda1, cameraPresenceProviderExternalSyntheticLambda6, z, function2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    int i24 = onExtraCallback + 89;
                    onNavigationEvent = i24 % 128;
                    if (i24 % 2 != 0) {
                        return unitIAuthTabCallback;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            int i21 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i21 % 128;
            int i22 = i21 % 2;
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        final CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda62 = cameraPresenceProviderExternalSyntheticLambda6;
        final boolean z2 = z;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.securities.core.exposure.RegisterScreenTrackerKt$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) {
                    int i23 = 2 % 2;
                    int i24 = onNavigationEvent + 23;
                    onExtraCallbackWithResult = i24 % 128;
                    int i25 = i24 % 2;
                    Unit unitOnExtraCallback = RegisterScreenTrackerKt.onExtraCallback(pexternalsyntheticlambda1, cameraPresenceProviderExternalSyntheticLambda62, z2, function2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i26 = onNavigationEvent + 119;
                    onExtraCallbackWithResult = i26 % 128;
                    if (i26 % 2 == 0) {
                        int i27 = 12 / 0;
                    }
                    return unitOnExtraCallback;
                }
            });
        }
    }
}
