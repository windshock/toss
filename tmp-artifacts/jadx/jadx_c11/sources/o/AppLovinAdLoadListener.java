package o;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinAdLoadListener {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    public static final AppLovinAdLoadListener onExtraCallbackWithResult = new AppLovinAdLoadListener();
    private static final float onExtraCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f);
    private static final float onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f);
    private static final float onNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.66f);

    private AppLovinAdLoadListener() {
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 119;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        float f = onExtraCallback;
        int i5 = i2 + 51;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 35;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        float f = onWarmupCompleted;
        int i5 = i2 + 77;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent;
        }
        throw null;
    }

    public final float onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = asBinder + 57;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-11141747, i, -1, "im.toss.tds.compose.foundation.token.TdsBorderWidthTokens.<get-XSmall> (TdsBorderWidthTokens.kt:23)");
            int i4 = asBinder + 111;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        float fOnWarmupCompleted = AppLovinAdDisplayListener.onWarmupCompleted(Challenge.IAuthTabCallback.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return fOnWarmupCompleted;
    }

    static {
        int i = IAuthTabCallbackStub + 71;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
