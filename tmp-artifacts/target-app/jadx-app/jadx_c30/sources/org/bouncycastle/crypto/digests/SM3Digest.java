package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class SM3Digest extends GeneralDigest {
    private static final int BLOCK_SIZE = 16;
    private static final int DIGEST_LENGTH = 32;
    private static final int[] T = new int[64];
    private int[] V;
    private int[] W;
    private int[] inwords;
    private int xOff;

    static {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                break;
            }
            T[i2] = (2043430169 >>> (32 - i2)) | (2043430169 << i2);
            i2++;
        }
        for (i = 16; i < 64; i++) {
            int i3 = i % 32;
            T[i] = (2055708042 << i3) | (2055708042 >>> (32 - i3));
        }
    }

    public SM3Digest() {
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        reset();
    }

    public SM3Digest(SM3Digest sM3Digest) {
        super(sM3Digest);
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        copyIn(sM3Digest);
    }

    private int FF0(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int FF1(int i, int i2, int i3) {
        return (i & (i2 | i3)) | (i2 & i3);
    }

    private int GG0(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int GG1(int i, int i2, int i3) {
        return (i & i2) | (i3 & (~i));
    }

    private int P0(int i) {
        return ((i >>> 15) | (i << 17)) ^ (((i << 9) | (i >>> 23)) ^ i);
    }

    private int P1(int i) {
        return ((i >>> 9) | (i << 23)) ^ (((i << 15) | (i >>> 17)) ^ i);
    }

    private void copyIn(SM3Digest sM3Digest) {
        int[] iArr = sM3Digest.V;
        int[] iArr2 = this.V;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = sM3Digest.inwords;
        int[] iArr4 = this.inwords;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.xOff = sM3Digest.xOff;
    }

    public Memoable copy() {
        return new SM3Digest(this);
    }

    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.V, bArr, i);
        reset();
        return 32;
    }

    public String getAlgorithmName() {
        return "SM3";
    }

    public int getDigestSize() {
        return 32;
    }

    protected void processBlock() {
        int i;
        int i2 = 0;
        while (true) {
            i = 16;
            if (i2 >= 16) {
                break;
            }
            this.W[i2] = this.inwords[i2];
            i2++;
        }
        for (int i3 = 16; i3 < 68; i3++) {
            int[] iArr = this.W;
            int i4 = iArr[i3 - 3];
            int i5 = iArr[i3 - 13];
            iArr[i3] = (((i5 << 7) | (i5 >>> 25)) ^ P1(((i4 << 15) | (i4 >>> 17)) ^ (iArr[i3 - 16] ^ iArr[i3 - 9]))) ^ this.W[i3 - 6];
        }
        int[] iArr2 = this.V;
        int i6 = iArr2[0];
        int i7 = iArr2[1];
        int i8 = iArr2[2];
        int i9 = iArr2[3];
        int iP0 = iArr2[4];
        int i10 = iArr2[5];
        int i11 = iArr2[6];
        int i12 = iArr2[7];
        int i13 = 0;
        int i14 = i11;
        while (i13 < i) {
            int i15 = (i6 << 12) | (i6 >>> 20);
            int i16 = i15 + iP0 + T[i13];
            int i17 = (i16 << 7) | (i16 >>> 25);
            int[] iArr3 = this.W;
            int i18 = iArr3[i13];
            int i19 = iArr3[i13 + 4];
            i13++;
            int iFF0 = FF0(i6, i7, i8) + i9 + (i17 ^ i15) + (i18 ^ i19);
            i9 = i8;
            i8 = (i7 << 9) | (i7 >>> 23);
            i7 = i6;
            i6 = iFF0;
            i = 16;
            int i20 = iP0;
            iP0 = P0(GG0(iP0, i10, i14) + i12 + i17 + i18);
            i12 = i14;
            i14 = (i10 << 19) | (i10 >>> 13);
            i10 = i20;
        }
        int i21 = i12;
        int i22 = i14;
        int i23 = i6;
        int i24 = 16;
        while (i24 < 64) {
            int i25 = (i23 << 12) | (i23 >>> 20);
            int i26 = i25 + iP0 + T[i24];
            int i27 = (i26 << 7) | (i26 >>> 25);
            int[] iArr4 = this.W;
            int i28 = iArr4[i24];
            int i29 = iArr4[i24 + 4];
            int iFF1 = FF1(i23, i7, i8);
            int iP02 = P0(GG1(iP0, i10, i22) + i21 + i27 + i28);
            i24++;
            int i30 = (i7 << 9) | (i7 >>> 23);
            i21 = i22;
            i22 = (i10 << 19) | (i10 >>> 13);
            i10 = iP0;
            iP0 = iP02;
            i7 = i23;
            i23 = iFF1 + i9 + (i27 ^ i25) + (i28 ^ i29);
            i9 = i8;
            i8 = i30;
        }
        int[] iArr5 = this.V;
        iArr5[0] = i23 ^ iArr5[0];
        iArr5[1] = iArr5[1] ^ i7;
        iArr5[2] = iArr5[2] ^ i8;
        iArr5[3] = iArr5[3] ^ i9;
        iArr5[4] = iArr5[4] ^ iP0;
        iArr5[5] = iArr5[5] ^ i10;
        iArr5[6] = i22 ^ iArr5[6];
        iArr5[7] = i21 ^ iArr5[7];
        this.xOff = 0;
    }

    protected void processLength(long j) {
        int i = this.xOff;
        if (i > 14) {
            this.inwords[i] = 0;
            this.xOff = i + 1;
            processBlock();
        }
        while (true) {
            int i2 = this.xOff;
            if (i2 >= 14) {
                int[] iArr = this.inwords;
                iArr[i2] = (int) (j >>> 32);
                this.xOff = i2 + 2;
                iArr[i2 + 1] = (int) j;
                return;
            }
            this.inwords[i2] = 0;
            this.xOff = i2 + 1;
        }
    }

    protected void processWord(byte[] bArr, int i) {
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        int[] iArr = this.inwords;
        int i2 = this.xOff;
        iArr[i2] = (b4 & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
        int i3 = i2 + 1;
        this.xOff = i3;
        if (i3 >= 16) {
            processBlock();
        }
    }

    public void reset() {
        super.reset();
        int[] iArr = this.V;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.xOff = 0;
    }

    public void reset(Memoable memoable) {
        SM3Digest sM3Digest = (SM3Digest) memoable;
        super.copyIn(sM3Digest);
        copyIn(sM3Digest);
    }
}
