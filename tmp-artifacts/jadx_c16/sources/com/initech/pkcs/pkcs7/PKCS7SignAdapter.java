package com.initech.pkcs.pkcs7;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface PKCS7SignAdapter {
    byte[] getCertificateR();

    byte[] getSignature(byte[] bArr);
}
