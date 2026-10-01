package com.iap.android.mppclient.container.presenter;

import android.webkit.SslErrorHandler;
import com.iap.android.mppclient.container.provider.interf.ISslErrorHandler;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ACSslErrorHandler implements ISslErrorHandler {
    private SslErrorHandler handler;

    public ACSslErrorHandler(SslErrorHandler sslErrorHandler) {
        this.handler = sslErrorHandler;
    }

    @Override // com.iap.android.mppclient.container.provider.interf.ISslErrorHandler
    public void proceed() {
        SslErrorHandler sslErrorHandler = this.handler;
        if (sslErrorHandler != null) {
            sslErrorHandler.proceed();
        }
    }

    @Override // com.iap.android.mppclient.container.provider.interf.ISslErrorHandler
    public void cancel() {
        SslErrorHandler sslErrorHandler = this.handler;
        if (sslErrorHandler != null) {
            sslErrorHandler.cancel();
        }
    }
}
