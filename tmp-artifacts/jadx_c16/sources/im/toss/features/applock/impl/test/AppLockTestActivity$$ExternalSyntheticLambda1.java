package im.toss.features.applock.impl.test;

import kotlin.jvm.functions.Function1;
import o.ACPayResult;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AppLockTestActivity$$ExternalSyntheticLambda1 implements deserializeFloat {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, obj};
        if (i3 == 0) {
            int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
            AppLockTestActivity.onExtraCallback(ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), objArr, 660406227, iOnWarmupCompleted, -660406224, ACPayResult.onWarmupCompleted());
        } else {
            int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
            AppLockTestActivity.onExtraCallback(ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), objArr, 660406227, iOnWarmupCompleted2, -660406224, ACPayResult.onWarmupCompleted());
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }
}
