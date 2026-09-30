package com.initech.pkcs.pkcs7;

import com.initech.asn1.useful.IssuerAndSerialNumber;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface PKCS7KeyManager {
    X509Certificate getCertificate(IssuerAndSerialNumber issuerAndSerialNumber);

    PrivateKey getPrivateKey(IssuerAndSerialNumber issuerAndSerialNumber);
}
