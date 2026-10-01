package com.initech.pkcs.pkcs7;

import java.security.cert.X509Certificate;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class PKCS7ManageCert implements PKCS7TrustManager {
    @Override // com.initech.pkcs.pkcs7.PKCS7TrustManager
    public boolean checkCertificate(X509Certificate x509Certificate) {
        return true;
    }
}
