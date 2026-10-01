package im.toss.features.applock.impl.manager;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;
import o.getProxy;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AppLockCheckerImpl$$ExternalSyntheticLambda3 implements deserializeFloat {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            getProxy.onNavigationEvent(this.f$0, obj);
            int i3 = 45 / 0;
        } else {
            getProxy.onNavigationEvent(this.f$0, obj);
        }
        int i4 = onWarmupCompleted + 63;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
