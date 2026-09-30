package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class GOST3410PublicKeyParameters extends GOST3410KeyParameters {
    private BigInteger y;

    public GOST3410PublicKeyParameters(BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        super(false, gOST3410Parameters);
        this.y = bigInteger;
    }

    public BigInteger getY() {
        return this.y;
    }
}
