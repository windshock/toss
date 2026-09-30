package im.toss.compose.v0;

import android.os.Process;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.getMinFrame;
import o.removeAnimatorListener;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0 implements getBacktraceNote {
    public static int IAuthTabCallback = 0;
    public static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        removeAnimatorListener removeanimatorlistener = (removeAnimatorListener) obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (i3 != 0) {
            return getMinFrame.onExtraCallbackWithResult(removeanimatorlistener, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        getMinFrame.onExtraCallbackWithResult(removeanimatorlistener, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }

    public static int onExtraCallback() {
        int i = IAuthTabCallback;
        int i2 = i % 6753027;
        IAuthTabCallback = i + 1;
        if (i2 != 0) {
            return onExtraCallback;
        }
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        onExtraCallback = startUptimeMillis;
        return startUptimeMillis;
    }
}
