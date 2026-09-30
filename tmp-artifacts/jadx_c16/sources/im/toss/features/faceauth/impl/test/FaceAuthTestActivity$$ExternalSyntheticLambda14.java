package im.toss.features.faceauth.impl.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FaceAuthTestActivity$$ExternalSyntheticLambda14 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ FaceAuthTestActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ FaceAuthTestActivity$$ExternalSyntheticLambda14(FaceAuthTestActivity faceAuthTestActivity, String str) {
        this.f$0 = faceAuthTestActivity;
        this.f$1 = str;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            FaceAuthTestActivity.IAuthTabCallback(this.f$0, this.f$1);
            throw null;
        }
        Unit unitIAuthTabCallback = FaceAuthTestActivity.IAuthTabCallback(this.f$0, this.f$1);
        int i3 = onNavigationEvent + 119;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }
}
