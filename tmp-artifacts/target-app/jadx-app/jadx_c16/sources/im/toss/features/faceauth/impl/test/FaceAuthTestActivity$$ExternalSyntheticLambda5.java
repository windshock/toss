package im.toss.features.faceauth.impl.test;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FaceAuthTestActivity$$ExternalSyntheticLambda5 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return FaceAuthTestActivity.IAuthTabCallback();
        }
        FaceAuthTestActivity.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
