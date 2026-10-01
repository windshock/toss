package im.toss.core.webkit;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import o.roundedRect;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossWebViewClient$$ExternalSyntheticLambda0 implements ValueCallback {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ WebView f$0;
    public final /* synthetic */ roundedRect f$1;

    public /* synthetic */ TossWebViewClient$$ExternalSyntheticLambda0(WebView webView, roundedRect roundedrect) {
        this.f$0 = webView;
        this.f$1 = roundedrect;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        roundedRect.IAuthTabCallback(this.f$0, this.f$1, (String) obj);
        int i4 = onNavigationEvent + 59;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
