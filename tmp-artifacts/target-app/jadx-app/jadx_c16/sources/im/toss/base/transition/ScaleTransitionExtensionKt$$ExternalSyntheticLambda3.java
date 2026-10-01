package im.toss.base.transition;

import android.app.Activity;
import o.onStopped;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ScaleTransitionExtensionKt$$ExternalSyntheticLambda3 implements Runnable {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Activity f$0;

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onStopped.IAuthTabCallback(this.f$0);
        int i4 = onNavigationEvent + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
    }
}
