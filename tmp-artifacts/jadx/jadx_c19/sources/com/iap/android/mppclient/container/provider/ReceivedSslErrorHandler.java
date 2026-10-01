package com.iap.android.mppclient.container.provider;

import android.net.http.SslError;
import com.iap.android.mppclient.container.ContainerWebView;
import com.iap.android.mppclient.container.provider.interf.ISslErrorHandler;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface ReceivedSslErrorHandler {
    void onReceivedSslError(ContainerWebView containerWebView, ISslErrorHandler iSslErrorHandler, SslError sslError);
}
