package o;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getOptimalPreviewSize {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static final boolean IAuthTabCallback(@NotNull WebView webView) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        if (webView.canGoBack() || webView.canGoBackOrForward(-1) || webView.copyBackForwardList().getCurrentIndex() > 0) {
            return true;
        }
        int i4 = onExtraCallback + 77;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return false;
    }

    public static final boolean onNavigationEvent(@NotNull WebView webView) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        if (webView.canGoBack()) {
            int i2 = onNavigationEvent + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            webView.goBack();
            return true;
        }
        if (!webView.canGoBackOrForward(-1)) {
            if (webView.copyBackForwardList().getCurrentIndex() <= 0) {
                return false;
            }
            webView.evaluateJavascript("history.back()", new ValueCallback() { // from class: im.toss.core.webkit.WebViewExtKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = IAuthTabCallback;
                    int i6 = i5 + 55;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = i5 + 51;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 56 / 0;
                    }
                }
            });
            return true;
        }
        int i4 = onExtraCallback + 105;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        webView.goBackOrForward(-1);
        return true;
    }
}
