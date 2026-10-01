package org.bouncycastle.jce.provider;

import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class BrokenJCEBlockCipher$BrokePBEWithSHAAndDES3Key extends BrokenJCEBlockCipher {
    public BrokenJCEBlockCipher$BrokePBEWithSHAAndDES3Key() {
        super(new CBCBlockCipher(new DESedeEngine()), 2, 1, CertificateHolderAuthorization.CVCA, 64);
    }
}
