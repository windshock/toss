package im.toss.core.webkit.bridge.accessarybutton;

import o.TimerCallBack;
import o.TimerCounter;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class AccessoryButtonConfigurationHelper$$ExternalSyntheticLambda7 implements Runnable {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ TimerCallBack f$0;

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 123;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        TimerCounter.onNavigationEvent(this.f$0);
        if (i4 == 0) {
            int i5 = 96 / 0;
        }
    }
}
