package org.bouncycastle.crypto;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface RawAgreement {
    void calculateAgreement(CipherParameters cipherParameters, byte[] bArr, int i);

    int getAgreementSize();

    void init(CipherParameters cipherParameters);
}
