package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class SPHINCSPlusPublicKeyParameters extends SPHINCSPlusKeyParameters {
    private final PK pk;

    SPHINCSPlusPublicKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, PK pk) {
        super(false, sPHINCSPlusParameters);
        this.pk = pk;
    }

    public SPHINCSPlusPublicKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, byte[] bArr) {
        super(false, sPHINCSPlusParameters);
        int i = sPHINCSPlusParameters.getEngine().N;
        int i2 = i << 1;
        if (bArr.length != i2) {
            throw new IllegalArgumentException("public key encoding does not match parameters");
        }
        this.pk = new PK(Arrays.copyOfRange(bArr, 0, i), Arrays.copyOfRange(bArr, i, i2));
    }

    public byte[] getEncoded() {
        PK pk = this.pk;
        return Arrays.concatenate(pk.seed, pk.root);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.pk.root);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.pk.seed);
    }
}
