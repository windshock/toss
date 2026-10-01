package com.bytedance.sdk.openadsdk.wwx;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jw {
    private static void zb(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcK3T9VuiQW0IVXpPg==", "SesgmhW5Q8aWS8RenhiwPHLgOZARumjEhVnkXIoU", 18);
            ul.ycx("WebViewSettings", "removeJavascriptInterfacesSafe error", th);
        }
    }

    private static void ycx(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcK3T9VuiQW0IVXpPg==", "WuIhmhSRbMOJS+dRjQiXIU/mIoAXiXrCkm3STpgEsi0=", 29);
            ul.ycx("WebViewSettings", "allowMediaPlayWithoutUserGesture error", th);
        }
    }

    public static void ycx(WebView webView) {
        if (webView != null) {
            zb(webView);
            WebSettings settings = webView.getSettings();
            ycx(settings);
            if (settings == null) {
                return;
            }
            try {
                settings.setJavaScriptEnabled(true);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcK3T9VuiQW0IVXpPg==", "SOs5", 48);
                ul.ycx("WebViewSettings", "setJavaScriptEnabled error", th);
            }
            try {
                settings.setSupportZoom(false);
            } catch (Throwable th2) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcK3T9VuiQW0IVXpPg==", "SOs5", 54);
                ul.ycx("WebViewSettings", "setSupportZoom error", th2);
            }
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setDomStorageEnabled(true);
            settings.setAllowFileAccess(false);
            settings.setBlockNetworkImage(false);
            settings.setDisplayZoomControls(false);
            int i2 = Build.VERSION.SDK_INT;
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
            settings.setSavePassword(false);
            try {
                if (i2 < 28) {
                    webView.setLayerType(0, null);
                } else {
                    webView.setLayerType(2, null);
                }
            } catch (Throwable th3) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(th3, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcK3T9VuiQW0IVXpPg==", "SOs5", 78);
                ul.ycx("WebViewSettings", "setLayerType error", th3);
            }
            webView.getSettings().setMixedContentMode(0);
        }
    }
}
