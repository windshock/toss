package org.bouncycastle.crypto.engines;

import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class VMPCKSA3Engine extends VMPCEngine {
    @Override // org.bouncycastle.crypto.engines.VMPCEngine, org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "VMPC-KSA3";
    }

    @Override // org.bouncycastle.crypto.engines.VMPCEngine
    protected void initKey(byte[] bArr, byte[] bArr2) {
        this.s = (byte) 0;
        this.P = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.P[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            byte[] bArr3 = this.P;
            byte b = this.s;
            int i3 = i2 & GF2Field.MASK;
            byte b2 = bArr3[i3];
            byte b3 = bArr3[(b + b2 + bArr[i2 % bArr.length]) & GF2Field.MASK];
            this.s = b3;
            int i4 = b3 & 255;
            bArr3[i3] = bArr3[i4];
            bArr3[i4] = b2;
        }
        for (int i5 = 0; i5 < 768; i5++) {
            byte[] bArr4 = this.P;
            byte b4 = this.s;
            int i6 = i5 & GF2Field.MASK;
            byte b5 = bArr4[i6];
            byte b6 = bArr4[(b4 + b5 + bArr2[i5 % bArr2.length]) & GF2Field.MASK];
            this.s = b6;
            int i7 = b6 & 255;
            bArr4[i6] = bArr4[i7];
            bArr4[i7] = b5;
        }
        for (int i8 = 0; i8 < 768; i8++) {
            byte[] bArr5 = this.P;
            byte b7 = this.s;
            int i9 = i8 & GF2Field.MASK;
            byte b8 = bArr5[i9];
            byte b9 = bArr5[(b7 + b8 + bArr[i8 % bArr.length]) & GF2Field.MASK];
            this.s = b9;
            int i10 = b9 & 255;
            bArr5[i9] = bArr5[i10];
            bArr5[i10] = b8;
        }
        this.n = (byte) 0;
    }
}
