package o;

import android.graphics.Bitmap;
import android.webkit.WebView;
import im.toss.core.widget.TdsWebSmoothProgressBarV1View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class setFaceBox extends setTopGuideSpacing {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private TdsWebSmoothProgressBarV1View onWarmupCompleted;

    public final void onExtraCallback(@Nullable TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 5;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        this.onWarmupCompleted = tdsWebSmoothProgressBarV1View;
        int i5 = i2 + 23;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.setTopGuideSpacing, android.webkit.WebViewClient
    public void onPageStarted(@NotNull WebView webView, @NotNull String str, @Nullable Bitmap bitmap) {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 101;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(str, "");
        super.onPageStarted(webView, str, bitmap);
        TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View = this.onWarmupCompleted;
        if (tdsWebSmoothProgressBarV1View != null) {
            int i5 = onExtraCallback + 75;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                tdsWebSmoothProgressBarV1View.onWarmupCompleted();
                i = 1;
            } else {
                tdsWebSmoothProgressBarV1View.onWarmupCompleted();
                i = 0;
            }
            tdsWebSmoothProgressBarV1View.setProgress(i);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@NotNull WebView webView, @NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            super.onPageFinished(webView, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(str, "");
        super.onPageFinished(webView, str);
        TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View = this.onWarmupCompleted;
        if (tdsWebSmoothProgressBarV1View != null) {
            tdsWebSmoothProgressBarV1View.onExtraCallback();
            int i3 = IAuthTabCallback + 59;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 % 4;
            }
        }
    }
}
