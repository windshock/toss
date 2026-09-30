package im.toss.features.faceauth.impl.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FaceAuthTestActivity$$ExternalSyntheticLambda11 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ FaceAuthTestActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = FaceAuthTestActivity.asBinder(this.f$0);
        int i4 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsBinder;
        }
        throw null;
    }
}
