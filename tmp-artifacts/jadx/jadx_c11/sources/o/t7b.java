package o;

import o.setCallToAction;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class t7b {
    private static final float IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static final setCallToAction.onExtraCallbackWithResult asInterface;
    public static final t7b onExtraCallback = new t7b();
    private static final float onExtraCallbackWithResult;
    private static final setCallToAction.onExtraCallbackWithResult onNavigationEvent;
    private static int onTransact = 1;
    private static final float onWarmupCompleted;

    private t7b() {
    }

    public final long IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 125;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1545938339, i, -1, "im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Defaults.<get-containerColor> (TdsBottomCtaV1Defaults.kt:19)");
            int i4 = asBinder + 35;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        long jOnWarmupCompleted = lc.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = IAuthTabCallbackStub + 125;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return jOnWarmupCompleted;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 93;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 51 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = asBinder + 103;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-107875, i, -1, "im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Defaults.<get-accessoryTextColor> (TdsBottomCtaV1Defaults.kt:24)");
                if (i6 != 0) {
                    throw null;
                }
            }
        } else if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextTertiary, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = IAuthTabCallbackStub + 3;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i8 == 0) {
                int i9 = 55 / 0;
            }
        }
        return jOnExtraCallback;
    }

    public final setCallToAction.onExtraCallbackWithResult onWarmupCompleted() {
        setCallToAction.onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = asBinder + 17;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 != 0) {
            onextracallbackwithresult = onNavigationEvent;
            int i4 = 53 / 0;
        } else {
            onextracallbackwithresult = onNavigationEvent;
        }
        int i5 = i3 + 3;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return onextracallbackwithresult;
    }

    static {
        setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Primary;
        onNavigationEvent = new setCallToAction.onExtraCallbackWithResult(onwarmupcompleted, setCallToAction.onExtraCallback.Fill, null, null, 12, null);
        asInterface = new setCallToAction.onExtraCallbackWithResult(onwarmupcompleted, setCallToAction.onExtraCallback.Weak, null, null, 12, null);
        IAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
        onExtraCallbackWithResult = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f);
        onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f);
        int i = IAuthTabCallbackDefault + 95;
        onTransact = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final setCallToAction.onExtraCallbackWithResult onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        float f = IAuthTabCallback;
        int i5 = i3 + 3;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        float f = onExtraCallbackWithResult;
        int i5 = i3 + 15;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        float f = onWarmupCompleted;
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        return f;
    }
}
