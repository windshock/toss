package im.toss.core.webkit.bridge;

import im.toss.core.webkit.TossCoreWebView;
import o.setTopGuideBackgroundColor;
import o.stopTimer;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccessibilityEventHandler$$ExternalSyntheticLambda0 implements Runnable {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ TossCoreWebView f$0;
    public final /* synthetic */ setTopGuideBackgroundColor f$1;

    public /* synthetic */ AccessibilityEventHandler$$ExternalSyntheticLambda0(TossCoreWebView tossCoreWebView, setTopGuideBackgroundColor settopguidebackgroundcolor) {
        this.f$0 = tossCoreWebView;
        this.f$1 = settopguidebackgroundcolor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            stopTimer.IAuthTabCallback(this.f$0, this.f$1);
            throw null;
        }
        stopTimer.IAuthTabCallback(this.f$0, this.f$1);
        int i3 = onWarmupCompleted + 101;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 52 / 0;
        }
    }
}
