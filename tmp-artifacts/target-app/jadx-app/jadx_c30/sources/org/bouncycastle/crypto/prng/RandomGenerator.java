package org.bouncycastle.crypto.prng;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface RandomGenerator {
    void addSeedMaterial(long j);

    void addSeedMaterial(byte[] bArr);

    void nextBytes(byte[] bArr);

    void nextBytes(byte[] bArr, int i, int i2);
}
