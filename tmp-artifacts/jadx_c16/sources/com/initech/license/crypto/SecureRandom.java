package com.initech.license.crypto;

import java.util.Random;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class SecureRandom extends Random {
    private static final long serialVersionUID = -1398267524918933644L;
    private SecureRandom a;
    private byte[] b;

    public SecureRandom() {
        this(null);
    }

    public SecureRandom(byte[] bArr) {
        super(0L);
        this.b = bArr;
    }

    private void a() {
        if (this.a != null) {
            return;
        }
        SecureRandom secureRandomA = a.a();
        this.a = secureRandomA;
        byte[] bArr = this.b;
        if (bArr == null) {
            return;
        }
        secureRandomA.setSeed(bArr);
        int i = 0;
        while (true) {
            byte[] bArr2 = this.b;
            if (i >= bArr2.length) {
                return;
            }
            bArr2[i] = 0;
            i++;
        }
    }

    public static byte[] getSeed(int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) StrongSeedGenerator.genSeed();
        }
        return bArr;
    }

    @Override // java.util.Random
    protected final int next(int i) {
        byte[] bArr = new byte[4];
        nextBytes(bArr);
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            i2 = (i2 << 8) | (bArr[i3] & 255);
        }
        return ((-1) >>> (32 - i)) & i2;
    }

    @Override // java.util.Random
    public void nextBytes(byte[] bArr) {
        a();
        this.a.nextBytes(bArr);
    }

    @Override // java.util.Random
    public void setSeed(long j) {
        if (j != 0) {
            a();
            this.a.setSeed(j);
        }
    }

    public void setSeed(byte[] bArr) {
        a();
        this.a.setSeed(bArr);
    }
}
