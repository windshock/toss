package com.initech.pkix.cmp.client;

import java.security.PublicKey;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface PKICMPAdapter {
    int getProofOfPossessionMode();

    byte[] getProofOfPossessionSignature(byte[] bArr);

    PublicKey getPublicKey();

    void onCreatedCertificateR(byte[] bArr);
}
