package com.iap.android.mppclient.container;

import android.net.http.SslCertificate;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface ContainerWebView {
    boolean canGoBack();

    boolean canGoBackOrForward(int i2);

    boolean canGoForward();

    void clearHistory();

    void clearSslPreferences();

    SslCertificate getCertificate();

    String getOriginalUrl();

    String getTitle();

    String getUrl();

    void goBack();

    void goBackOrForward(int i2);

    void goForward();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void loadUrl(String str, Map<String, String> map);

    boolean pageDown(boolean z);

    boolean pageUp(boolean z);

    void postUrl(String str, byte[] bArr);

    void reload();

    void stopLoading();
}
