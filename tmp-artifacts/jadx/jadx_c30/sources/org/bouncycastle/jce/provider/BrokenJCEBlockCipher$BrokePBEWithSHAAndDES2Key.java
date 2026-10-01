package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class BrokenJCEBlockCipher$BrokePBEWithSHAAndDES2Key extends BrokenJCEBlockCipher {
    public BrokenJCEBlockCipher$BrokePBEWithSHAAndDES2Key() {
        super(new CBCBlockCipher(new DESedeEngine()), 2, 1, 128, 64);
    }
}
