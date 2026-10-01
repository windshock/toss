package im.toss.features.faceverify.impl.ui.pass;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FacePassActivity$$ExternalSyntheticLambda4 implements Function0 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ FacePassActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        FacePassActivity facePassActivity = this.f$0;
        if (i3 != 0) {
            return FacePassActivity.onNavigationEvent(facePassActivity);
        }
        FacePassActivity.onNavigationEvent(facePassActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
