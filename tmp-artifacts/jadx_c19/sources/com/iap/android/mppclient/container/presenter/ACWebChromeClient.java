package com.iap.android.mppclient.container.presenter;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.iap.android.mppclient.container.js.ACJSBridge;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ACWebChromeClient extends WebChromeClient {
    private static final String TAG = "ACWebChromeClient";
    private String bizCode;
    private ACContainerPresenter containerPresenter;
    private WebView mWebView;

    public ACWebChromeClient(WebView webView, ACContainerPresenter aCContainerPresenter, String str) {
        this.mWebView = webView;
        this.containerPresenter = aCContainerPresenter;
        this.bizCode = str;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i2) {
        super.onProgressChanged(webView, i2);
        ACContainerPresenter aCContainerPresenter = this.containerPresenter;
        if (aCContainerPresenter != null) {
            aCContainerPresenter.onProgressChanged(i2);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        ACContainerPresenter aCContainerPresenter = this.containerPresenter;
        if (aCContainerPresenter != null) {
            aCContainerPresenter.setTitle(str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || TextUtils.isEmpty(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (consoleMessage.message().startsWith("h5container.message: ")) {
            return ACJSBridge.getInstance(this.bizCode).handleMsgFromJs(consoleMessage.message(), this.mWebView, this.containerPresenter);
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
