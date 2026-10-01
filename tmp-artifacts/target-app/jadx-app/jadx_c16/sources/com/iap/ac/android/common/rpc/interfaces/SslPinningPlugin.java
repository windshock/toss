package com.iap.ac.android.common.rpc.interfaces;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface SslPinningPlugin {
    void verifyConnection(HttpsURLConnection httpsURLConnection) throws SSLException;
}
