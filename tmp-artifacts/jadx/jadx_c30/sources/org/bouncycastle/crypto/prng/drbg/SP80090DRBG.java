package org.bouncycastle.crypto.prng.drbg;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface SP80090DRBG {
    int generate(byte[] bArr, byte[] bArr2, boolean z);

    int getBlockSize();

    void reseed(byte[] bArr);
}
