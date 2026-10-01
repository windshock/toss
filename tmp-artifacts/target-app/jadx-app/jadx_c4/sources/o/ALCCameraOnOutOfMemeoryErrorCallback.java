package o;

import android.webkit.ClientCertRequest;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface ALCCameraOnOutOfMemeoryErrorCallback {
    void onExtraCallbackWithResult(@NotNull WebView webView, @NotNull WebResourceRequest webResourceRequest, @NotNull WebResourceResponse webResourceResponse);

    void onNavigationEvent(@NotNull WebView webView, @NotNull String str);

    boolean onNavigationEvent(@NotNull WebView webView, @NotNull ClientCertRequest clientCertRequest);
}
