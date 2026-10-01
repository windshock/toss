package im.toss.ads_sdk.playable;

import android.webkit.WebView;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda18 implements Runnable {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ WebView f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ NativeAdsPlayableAdActivity$$ExternalSyntheticLambda18(WebView webView, String str) {
        this.f$0 = webView;
        this.f$1 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        WebView webView = this.f$0;
        if (i3 == 0) {
            NativeAdsPlayableAdActivity.onNavigationEvent(webView, this.f$1);
            return;
        }
        NativeAdsPlayableAdActivity.onNavigationEvent(webView, this.f$1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
