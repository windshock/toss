package im.toss.features.faceauth.impl.test;

import com.google.android.gms.internal.ads.zzgc;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FaceAuthTestActivity$$ExternalSyntheticLambda2 implements getBacktraceNote {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ FaceAuthTestActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        Unit unit = (Unit) FaceAuthTestActivity.onExtraCallbackWithResult(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, zzgc.onExtraCallbackWithResult(), -701272272, 701272278, iOnExtraCallbackWithResult);
        int i4 = IAuthTabCallback + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
