package org.bouncycastle.crypto;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface AsymmetricCipherKeyPairGenerator {
    AsymmetricCipherKeyPair generateKeyPair();

    void init(KeyGenerationParameters keyGenerationParameters);
}
