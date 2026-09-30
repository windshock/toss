package org.bouncycastle.jce.exception;

import java.security.cert.CertificateEncodingException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ExtCertificateEncodingException extends CertificateEncodingException implements ExtException {
    private Throwable cause;

    public ExtCertificateEncodingException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
