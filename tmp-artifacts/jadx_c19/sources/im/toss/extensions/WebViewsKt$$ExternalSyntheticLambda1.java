package im.toss.extensions;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import o.PermissionUtil;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class WebViewsKt$$ExternalSyntheticLambda1 implements ValueCallback {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ WebView f$1;

    public /* synthetic */ WebViewsKt$$ExternalSyntheticLambda1(String str, WebView webView) {
        this.f$0 = str;
        this.f$1 = webView;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 65;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f$0;
        if (i4 == 0) {
            PermissionUtil.onExtraCallbackWithResult(str, this.f$1, (String) obj);
            return;
        }
        PermissionUtil.onExtraCallbackWithResult(str, this.f$1, (String) obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
