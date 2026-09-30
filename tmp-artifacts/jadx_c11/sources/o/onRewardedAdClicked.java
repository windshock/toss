package o;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onRewardedAdClicked implements n4 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @Inject
    public onRewardedAdClicked() {
    }

    @Override // o.n4
    public n3 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        n3 n3VarOnWarmupCompleted = n3.Companion.onWarmupCompleted();
        int i4 = onNavigationEvent + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return n3VarOnWarmupCompleted;
    }
}
