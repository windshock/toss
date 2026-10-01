package im.toss.features.faceauth.impl.test;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FaceAuthTestActivity$$ExternalSyntheticLambda3 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ FaceAuthTestActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        FaceAuthTestActivity faceAuthTestActivity = this.f$0;
        if (i3 == 0) {
            return FaceAuthTestActivity.onExtraCallbackWithResult(faceAuthTestActivity);
        }
        FaceAuthTestActivity.onExtraCallbackWithResult(faceAuthTestActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
