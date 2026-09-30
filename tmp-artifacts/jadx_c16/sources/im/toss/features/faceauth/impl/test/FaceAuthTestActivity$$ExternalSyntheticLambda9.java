package im.toss.features.faceauth.impl.test;

import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.w5a;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FaceAuthTestActivity$$ExternalSyntheticLambda9 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ boolean f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.f$0;
        w5a w5aVar = (w5a) obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (i3 != 0) {
            return FaceAuthTestActivity.onExtraCallback(z, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        FaceAuthTestActivity.onExtraCallback(z, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
