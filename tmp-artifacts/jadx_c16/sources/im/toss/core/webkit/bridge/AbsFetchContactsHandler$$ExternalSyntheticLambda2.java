package im.toss.core.webkit.bridge;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.surfaceDestroyed;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AbsFetchContactsHandler$$ExternalSyntheticLambda2 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ String f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = surfaceDestroyed.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
        int i4 = onWarmupCompleted + 5;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
