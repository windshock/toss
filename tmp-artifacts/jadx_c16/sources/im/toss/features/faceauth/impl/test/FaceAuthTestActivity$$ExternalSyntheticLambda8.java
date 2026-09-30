package im.toss.features.faceauth.impl.test;

import com.google.android.gms.internal.ads.zzgc;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.queryPathByLocalId;
import o.w5a;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FaceAuthTestActivity$$ExternalSyntheticLambda8 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ queryPathByLocalId f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ FaceAuthTestActivity$$ExternalSyntheticLambda8(String str, queryPathByLocalId querypathbylocalid, String str2) {
        this.f$0 = str;
        this.f$1 = querypathbylocalid;
        this.f$2 = str2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, this.f$2, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        Unit unit = (Unit) FaceAuthTestActivity.onExtraCallbackWithResult(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, zzgc.onExtraCallbackWithResult(), 1993141690, -1993141689, iOnExtraCallbackWithResult);
        int i4 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
