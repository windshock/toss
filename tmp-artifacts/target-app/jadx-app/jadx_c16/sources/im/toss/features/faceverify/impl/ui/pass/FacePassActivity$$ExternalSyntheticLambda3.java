package im.toss.features.faceverify.impl.ui.pass;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FacePassActivity$$ExternalSyntheticLambda3 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ FacePassActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ FacePassActivity$$ExternalSyntheticLambda3(FacePassActivity facePassActivity, String str) {
        this.f$0 = facePassActivity;
        this.f$1 = str;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = FacePassActivity.IAuthTabCallback(this.f$0, this.f$1);
        int i4 = onWarmupCompleted + 113;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return unitIAuthTabCallback;
    }
}
