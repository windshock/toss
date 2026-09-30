package im.toss.features.faceauth.impl.test;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FaceAuthTestActivity$$ExternalSyntheticLambda6 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ FaceAuthTestActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        FaceAuthTestActivity faceAuthTestActivity = this.f$0;
        if (i3 == 0) {
            return FaceAuthTestActivity.IAuthTabCallbackDefault(faceAuthTestActivity);
        }
        FaceAuthTestActivity.IAuthTabCallbackDefault(faceAuthTestActivity);
        throw null;
    }
}
