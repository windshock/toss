package com.initech.provider.crypto.spec;

import java.security.spec.AlgorithmParameterSpec;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class KCDSAGenParameterSpec implements AlgorithmParameterSpec {
    private String hashAlg;
    private int pSize;
    private int qSize;

    public KCDSAGenParameterSpec(int i, int i2) {
        this.pSize = 2048;
        this.qSize = 256;
        this.hashAlg = "SHA256";
        if (i < 1024 || i > 2048 || i2 < 160 || i2 > 256) {
            throw new IllegalArgumentException("Illegal length of P or Q");
        }
        this.pSize = i;
        this.qSize = i2;
        if ((i - 1024) % 256 != 0) {
            throw new IllegalArgumentException("Illegal length of P size");
        }
        if ((i2 - 160) % 32 != 0) {
            throw new IllegalArgumentException("Illegal length of Q size");
        }
    }

    public KCDSAGenParameterSpec(int i, int i2, String str) {
        this.pSize = 2048;
        this.qSize = 256;
        this.hashAlg = "SHA256";
        if (i < 1024 || i > 2048 || i2 < 160 || i2 > 256) {
            throw new IllegalArgumentException("Illegal length of P or Q");
        }
        this.pSize = i;
        this.qSize = i2;
        if ((i - 1024) % 256 != 0) {
            throw new IllegalArgumentException("Illegal length of P size");
        }
        if ((i2 - 160) % 32 != 0) {
            throw new IllegalArgumentException("Illegal length of Q size");
        }
        this.hashAlg = str;
    }

    public int getPsize() {
        return this.pSize;
    }

    public int getQsize() {
        return this.qSize;
    }

    public String getHashAlg() {
        return this.hashAlg;
    }
}
