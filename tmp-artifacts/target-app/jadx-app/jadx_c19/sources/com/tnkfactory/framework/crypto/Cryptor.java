package com.tnkfactory.framework.crypto;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface Cryptor {
    int decrypt(int i2);

    void decrypt(byte[] bArr, int i2, int i3);

    int encrypt(int i2);

    void encrypt(byte[] bArr, int i2, int i3);

    Cryptor init();
}
