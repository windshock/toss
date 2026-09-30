package im.toss.features.applock.impl.manager;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;
import o.getProxy;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AppLockCheckerImpl$$ExternalSyntheticLambda5 implements deserializeFloat {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getProxy.onWarmupCompleted(this.f$0, obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
