package com.initech.cryptox;

import java.security.Provider;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class NullCipher extends Cipher {
    private static NullCipherSpi spi = new NullCipherSpi();
    private static Provider provider = null;
    private static String transformation = "";

    public NullCipher() {
        super(spi, provider, transformation);
    }
}
