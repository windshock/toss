package im.toss.core.webkit.bridge;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.GeckoHubImp;
import o.SetDetectableSize;
import o.surfaceDestroyed;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AbsFetchContactsHandler$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ boolean f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) surfaceDestroyed.onNavigationEvent(2062858362, -2062858358, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{Boolean.valueOf(this.f$0), (SetDetectableSize) obj}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        }
        Boolean boolValueOf = Boolean.valueOf(this.f$0);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
