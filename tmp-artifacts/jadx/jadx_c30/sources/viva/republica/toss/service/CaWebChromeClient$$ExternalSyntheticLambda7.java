package viva.republica.toss.service;

import android.webkit.JsResult;
import android.webkit.WebView;
import o.ReadableType;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CaWebChromeClient$$ExternalSyntheticLambda7 implements Runnable {
    public final /* synthetic */ WebView f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ JsResult f$3;

    public /* synthetic */ CaWebChromeClient$$ExternalSyntheticLambda7(WebView webView, String str, String str2, JsResult jsResult) {
        this.f$0 = webView;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = jsResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReadableType.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3);
    }
}
