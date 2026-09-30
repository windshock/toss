package com.initech.pkcs.pkcs7;

import java.security.cert.X509Certificate;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface PKCS7TrustManager {
    boolean checkCertificate(X509Certificate x509Certificate);
}
