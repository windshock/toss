package im.toss.features.faceauth.impl.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FaceAuthTestActivity$$ExternalSyntheticLambda7 implements Function0 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ FaceAuthTestActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            FaceAuthTestActivity.onNavigationEvent(this.f$0);
            throw null;
        }
        Unit unitOnNavigationEvent = FaceAuthTestActivity.onNavigationEvent(this.f$0);
        int i3 = onNavigationEvent + 23;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }
}
