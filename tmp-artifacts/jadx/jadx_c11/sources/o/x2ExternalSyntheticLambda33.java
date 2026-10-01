package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x2ExternalSyntheticLambda33 implements resultIncoming {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final long IAuthTabCallback;
    private final long onExtraCallback;
    private final long onWarmupCompleted;

    public /* synthetic */ x2ExternalSyntheticLambda33(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    private x2ExternalSyntheticLambda33(long j, long j2, long j3) {
        this.onWarmupCompleted = j;
        this.onExtraCallback = j2;
        this.IAuthTabCallback = j3;
    }

    public final x2ExternalSyntheticLambda33 IAuthTabCallback(long j, long j2, long j3) {
        long j4;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (j == 16) {
            long j5 = this.onWarmupCompleted;
            int i4 = i3 + 7;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            j4 = j5;
        } else {
            j4 = j;
        }
        return new x2ExternalSyntheticLambda33(j4, j2 == 16 ? this.onExtraCallback : j2, j3 == 16 ? this.IAuthTabCallback : j3, null);
    }

    public CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> onNavigationEvent(boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1213937029);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1213937029, i, -1, "im.toss.tds.compose.component.compound.slider.TdsSliderV1Colors.thumbColor (TdsSliderV1.kt:92)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1213937029, i, -1, "im.toss.tds.compose.component.compound.slider.TdsSliderV1Colors.thumbColor (TdsSliderV1.kt:92)");
        }
        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(setByteOrder.onNavigationEvent(this.onWarmupCompleted), cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i4 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
    }

    public CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> onNavigationEvent(boolean z, boolean z2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1854425068);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1854425068, i, -1, "im.toss.tds.compose.component.compound.slider.TdsSliderV1Colors.tickColor (TdsSliderV1.kt:97)");
            int i3 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult = onExtraCallbackWithResult(z, z2, cameraCaptureResultEmptyCameraCaptureResult, i & 1022);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i5 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = 87 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            int i7 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 / 5;
            }
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult;
    }

    public CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> onExtraCallbackWithResult(boolean z, boolean z2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        long j;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-320260606);
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-320260606);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-320260606, i, -1, "im.toss.tds.compose.component.compound.slider.TdsSliderV1Colors.trackColor (TdsSliderV1.kt:102)");
        }
        if (z2) {
            int i4 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            j = this.onExtraCallback;
        } else {
            j = this.IAuthTabCallback;
            int i5 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(setByteOrder.onNavigationEvent(j), cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 75;
            onExtraCallbackWithResult = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!Intrinsics.areEqual(x2ExternalSyntheticLambda33.class, obj != null ? obj.getClass() : null)) {
            int i6 = onExtraCallbackWithResult + 93;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        x2ExternalSyntheticLambda33 x2externalsyntheticlambda33 = (x2ExternalSyntheticLambda33) obj;
        if (setByteOrder.onExtraCallbackWithResult(this.onWarmupCompleted, x2externalsyntheticlambda33.onWarmupCompleted)) {
            return setByteOrder.onExtraCallbackWithResult(this.onExtraCallback, x2externalsyntheticlambda33.onExtraCallback) && !(setByteOrder.onExtraCallbackWithResult(this.IAuthTabCallback, x2externalsyntheticlambda33.IAuthTabCallback) ^ true);
        }
        int i8 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iOnTransact;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            iOnTransact = (((setByteOrder.onTransact(this.onWarmupCompleted) * 52) << setByteOrder.onTransact(this.onExtraCallback)) << 112) - setByteOrder.onTransact(this.IAuthTabCallback);
        } else {
            iOnTransact = (((setByteOrder.onTransact(this.onWarmupCompleted) * 31) + setByteOrder.onTransact(this.onExtraCallback)) * 31) + setByteOrder.onTransact(this.IAuthTabCallback);
        }
        int i3 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return iOnTransact;
    }
}
