package im.toss.extensions;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import o.PermissionUtil;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class WebViewsKt$$ExternalSyntheticLambda0 implements ValueCallback {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ WebView f$1;

    public /* synthetic */ WebViewsKt$$ExternalSyntheticLambda0(boolean z, WebView webView) {
        this.f$0 = z;
        this.f$1 = webView;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 51;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        PermissionUtil.onExtraCallback(new Object[]{Boolean.valueOf(this.f$0), this.f$1, (String) obj}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1027726292, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1027726292);
        int i5 = IAuthTabCallback + 51;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
