package org.bouncycastle.crypto;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface SignerWithRecovery extends Signer {
    byte[] getRecoveredMessage();

    boolean hasFullMessage();

    void updateWithRecoveredMessage(byte[] bArr) throws InvalidCipherTextException;
}
