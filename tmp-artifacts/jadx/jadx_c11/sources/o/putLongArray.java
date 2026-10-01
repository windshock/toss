package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class putLongArray implements getSubtitle {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final long onExtraCallback;
    private final long onNavigationEvent;
    private final float onWarmupCompleted;

    public /* synthetic */ putLongArray(float f, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, j, j2);
    }

    private putLongArray(float f, long j, long j2) {
        this.onWarmupCompleted = f;
        this.onNavigationEvent = j;
        this.onExtraCallback = j2;
    }

    public static final /* synthetic */ float IAuthTabCallback(putLongArray putlongarray) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        float f = putlongarray.onWarmupCompleted;
        if (i3 == 0) {
            return f;
        }
        throw null;
    }

    public static final /* synthetic */ boolean IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6);
        }
        onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ long onExtraCallback(putLongArray putlongarray) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        long j = putlongarray.onExtraCallback;
        int i5 = i2 + 85;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return j;
    }

    public static final /* synthetic */ long onNavigationEvent(putLongArray putlongarray) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 65;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        long j = putlongarray.onNavigationEvent;
        int i5 = i2 + 79;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return j;
    }

    public static final class onNavigationEvent implements getOuterActionMenuPresenter {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<Boolean> IAuthTabCallback;

        onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
            this.IAuthTabCallback = cameraPresenceProviderExternalSyntheticLambda6;
        }

        public void onWarmupCompleted(setIso setiso) {
            long jOnNavigationEvent;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(setiso, "");
            rotate rotateVarIAuthTabCallback = new AppLovinAdClickListener(putLongArray.IAuthTabCallback(putLongArray.this), null).IAuthTabCallback(setiso.onTransact(), ExtensionsManagerExtensionsAvailability.Ltr, setiso);
            if (putLongArray.IAuthTabCallback(this.IAuthTabCallback)) {
                int i2 = onExtraCallbackWithResult + 79;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                jOnNavigationEvent = putLongArray.onExtraCallback(putLongArray.this);
            } else {
                jOnNavigationEvent = putLongArray.onNavigationEvent(putLongArray.this);
                int i4 = onExtraCallbackWithResult + 47;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
            setDescription.IAuthTabCallback(setiso, rotateVarIAuthTabCallback, jOnNavigationEvent, 0.0f, (hasMoreElements) null, (seek) null, 0, 60, (Object) null);
            setiso.onWarmupCompleted();
            int i6 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public getOuterActionMenuPresenter onExtraCallbackWithResult(@NotNull Camera2CapturePipelineTorchTaskExternalSyntheticLambda1 camera2CapturePipelineTorchTaskExternalSyntheticLambda1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(camera2CapturePipelineTorchTaskExternalSyntheticLambda1, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-821042639);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-821042639, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.badge.BadgeButtonIndication.rememberUpdatedInstance (TdsAgreementV4Badge.kt:36)");
        }
        int i5 = i & 14;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult = CaptureSessionExternalSyntheticLambda3.onExtraCallbackWithResult(camera2CapturePipelineTorchTaskExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i5);
        if ((i5 ^ 6) > 4) {
            int i6 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda1)) {
                z = (i & 6) == 4;
            }
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(!z) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        onNavigationEvent onnavigationevent = (onNavigationEvent) objOnMinimized;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i8 = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return onnavigationevent;
    }

    private static final boolean onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).booleanValue();
        int i4 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
