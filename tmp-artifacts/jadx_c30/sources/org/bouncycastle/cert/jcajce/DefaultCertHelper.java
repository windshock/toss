package org.bouncycastle.cert.jcajce;

import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class DefaultCertHelper extends CertHelper {
    DefaultCertHelper() {
    }

    @Override // org.bouncycastle.cert.jcajce.CertHelper
    protected CertificateFactory createCertificateFactory(String str) throws CertificateException {
        return CertificateFactory.getInstance(str);
    }
}
