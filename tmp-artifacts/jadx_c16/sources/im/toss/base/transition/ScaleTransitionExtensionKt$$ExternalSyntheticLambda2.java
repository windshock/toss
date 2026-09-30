package im.toss.base.transition;

import android.app.Activity;
import com.google.android.gms.internal.ads.zzgsa;
import o.onStopped;
import o.startWork;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ScaleTransitionExtensionKt$$ExternalSyntheticLambda2 implements Runnable {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ startWork f$0;
    public final /* synthetic */ Activity f$1;

    public /* synthetic */ ScaleTransitionExtensionKt$$ExternalSyntheticLambda2(startWork startwork, Activity activity) {
        this.f$0 = startwork;
        this.f$1 = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onStopped.onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), new Object[]{this.f$0, this.f$1}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -2131545950, zzgsa.onWarmupCompleted(), 2131545950);
        int i4 = onWarmupCompleted + 47;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
