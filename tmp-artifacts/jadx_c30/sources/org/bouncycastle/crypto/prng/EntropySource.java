package org.bouncycastle.crypto.prng;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface EntropySource {
    int entropySize();

    byte[] getEntropy();

    boolean isPredictionResistant();
}
