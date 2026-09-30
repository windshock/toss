package viva.republica.toss.service;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import o.RuntimeScheduler;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CaWebViewScraper$initModule$1$6$$ExternalSyntheticLambda0 implements ValueCallback {
    public final /* synthetic */ RuntimeScheduler f$0;
    public final /* synthetic */ WebView f$1;
    public final /* synthetic */ WebView f$2;

    public /* synthetic */ CaWebViewScraper$initModule$1$6$$ExternalSyntheticLambda0(RuntimeScheduler runtimeScheduler, WebView webView, WebView webView2) {
        this.f$0 = runtimeScheduler;
        this.f$1 = webView;
        this.f$2 = webView2;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        RuntimeScheduler.ICustomTabsCallbackStub.IAuthTabCallback(this.f$0, this.f$1, this.f$2, (String) obj);
    }
}
