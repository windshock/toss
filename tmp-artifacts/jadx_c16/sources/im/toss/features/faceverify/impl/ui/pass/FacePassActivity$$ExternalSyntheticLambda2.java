package im.toss.features.faceverify.impl.ui.pass;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FacePassActivity$$ExternalSyntheticLambda2 implements Function0 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ FacePassActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ FacePassActivity$$ExternalSyntheticLambda2(FacePassActivity facePassActivity, String str) {
        this.f$0 = facePassActivity;
        this.f$1 = str;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            FacePassActivity.onNavigationEvent(this.f$0, this.f$1);
            throw null;
        }
        Unit unitOnNavigationEvent = FacePassActivity.onNavigationEvent(this.f$0, this.f$1);
        int i3 = onWarmupCompleted + 109;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }
}
