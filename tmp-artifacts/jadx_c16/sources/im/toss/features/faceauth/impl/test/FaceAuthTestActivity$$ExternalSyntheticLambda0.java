package im.toss.features.faceauth.impl.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FaceAuthTestActivity$$ExternalSyntheticLambda0 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ FaceAuthTestActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = FaceAuthTestActivity.IAuthTabCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = IAuthTabCallback + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
