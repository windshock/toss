package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.util.Pack;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class OldIESEngine extends IESEngine {
    public OldIESEngine(BasicAgreement basicAgreement, DerivationFunction derivationFunction, Mac mac) {
        super(basicAgreement, derivationFunction, mac);
    }

    public OldIESEngine(BasicAgreement basicAgreement, DerivationFunction derivationFunction, Mac mac, BufferedBlockCipher bufferedBlockCipher) {
        super(basicAgreement, derivationFunction, mac, bufferedBlockCipher);
    }

    @Override // org.bouncycastle.crypto.engines.IESEngine
    protected byte[] getLengthTag(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        if (bArr != null) {
            Pack.intToBigEndian(bArr.length << 3, bArr2, 0);
        }
        return bArr2;
    }
}
