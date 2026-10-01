package im.toss.features.faceauth.impl.test;

import com.google.android.gms.internal.ads.zzgc;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FaceAuthTestActivity$$ExternalSyntheticLambda10 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ FaceAuthTestActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        Unit unit = (Unit) FaceAuthTestActivity.onExtraCallbackWithResult(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, zzgc.onExtraCallbackWithResult(), 706247146, -706247143, iOnExtraCallbackWithResult);
        int i4 = onNavigationEvent + 61;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
