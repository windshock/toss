package im.toss;

import im.toss.TossApplication;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossApplication$onPostInitMainProcess$1$1$$ExternalSyntheticLambda0 implements Runnable {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ TossApplication f$0;
    public final /* synthetic */ Set f$1;

    public /* synthetic */ TossApplication$onPostInitMainProcess$1$1$$ExternalSyntheticLambda0(TossApplication tossApplication, Set set) {
        this.f$0 = tossApplication;
        this.f$1 = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TossApplication tossApplication = this.f$0;
        if (i3 != 0) {
            TossApplication.requestPostMessageChannel.onNavigationEvent(tossApplication, this.f$1);
        } else {
            TossApplication.requestPostMessageChannel.onNavigationEvent(tossApplication, this.f$1);
            int i4 = 33 / 0;
        }
    }
}
