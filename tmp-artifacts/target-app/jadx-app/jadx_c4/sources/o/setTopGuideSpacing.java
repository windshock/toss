package o;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class setTopGuideSpacing extends WebViewClient implements flipCamera {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private String onExtraCallbackWithResult;

    @Override // android.webkit.WebViewClient
    public void onPageStarted(@NotNull WebView webView, @NotNull String str, @Nullable Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            super.onPageStarted(webView, str, bitmap);
            this.onExtraCallbackWithResult = webView.getUrl();
            return;
        }
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(str, "");
        super.onPageStarted(webView, str, bitmap);
        this.onExtraCallbackWithResult = webView.getUrl();
        int i3 = 41 / 0;
    }

    @Override // o.flipCamera
    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }
}
