package org.bouncycastle.pqc.crypto.gmss.util;

import org.bouncycastle.crypto.Digest;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class WinternitzOTSignature {
    private int checksumsize;
    private GMSSRandom gmssRandom;
    private int keysize;
    private int mdsize;
    private Digest messDigestOTS;
    private int messagesize;
    private byte[][] privateKeyOTS;
    private int w;

    public WinternitzOTSignature(byte[] bArr, Digest digest, int i) {
        this.w = i;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        int i2 = (((r3 << 3) + i) - 1) / i;
        this.messagesize = i2;
        this.checksumsize = getLog((i2 << i) + 1);
        int i3 = this.messagesize + (((r3 + i) - 1) / i);
        this.keysize = i3;
        this.privateKeyOTS = new byte[i3][];
        int i4 = this.mdsize;
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, 0, bArr2, 0, i4);
        for (int i5 = 0; i5 < this.keysize; i5++) {
            this.privateKeyOTS[i5] = this.gmssRandom.nextSeed(bArr2);
        }
    }

    private void hashPrivateKeyBlock(int i, int i2, byte[] bArr, int i3) {
        if (i2 <= 0) {
            System.arraycopy(this.privateKeyOTS[i], 0, bArr, i3, this.mdsize);
            return;
        }
        this.messDigestOTS.update(this.privateKeyOTS[i], 0, this.mdsize);
        while (true) {
            this.messDigestOTS.doFinal(bArr, i3);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                this.messDigestOTS.update(bArr, i3, this.mdsize);
            }
        }
    }

    public int getLog(int i) {
        int i2 = 1;
        int i3 = 2;
        while (i3 < i) {
            i3 <<= 1;
            i2++;
        }
        return i2;
    }

    public byte[][] getPrivateKey() {
        return this.privateKeyOTS;
    }

    public byte[] getPublicKey() {
        int i = this.keysize * this.mdsize;
        byte[] bArr = new byte[i];
        int i2 = this.w;
        int i3 = 0;
        for (int i4 = 0; i4 < this.keysize; i4++) {
            hashPrivateKeyBlock(i4, (1 << i2) - 1, bArr, i3);
            i3 += this.mdsize;
        }
        this.messDigestOTS.update(bArr, 0, i);
        byte[] bArr2 = new byte[this.mdsize];
        this.messDigestOTS.doFinal(bArr2, 0);
        return bArr2;
    }

    public byte[] getSignature(byte[] bArr) {
        int i;
        int i2 = this.keysize;
        int i3 = this.mdsize;
        byte[] bArr2 = new byte[i2 * i3];
        byte[] bArr3 = new byte[i3];
        int i4 = 0;
        this.messDigestOTS.update(bArr, 0, bArr.length);
        this.messDigestOTS.doFinal(bArr3, 0);
        int i5 = this.w;
        int i6 = 8;
        if (8 % i5 == 0) {
            int i7 = 8 / i5;
            int i8 = (1 << i5) - 1;
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                for (int i12 = 0; i12 < i7; i12++) {
                    int i13 = bArr3[i11] & i8;
                    i9 += i13;
                    hashPrivateKeyBlock(i10, i13, bArr2, this.mdsize * i10);
                    bArr3[i11] = (byte) (bArr3[i11] >>> this.w);
                    i10++;
                }
            }
            int i14 = (this.messagesize << this.w) - i9;
            while (i4 < this.checksumsize) {
                hashPrivateKeyBlock(i10, i14 & i8, bArr2, this.mdsize * i10);
                int i15 = this.w;
                i14 >>>= i15;
                i10++;
                i4 += i15;
            }
        } else if (i5 < 8) {
            int i16 = this.mdsize / i5;
            int i17 = (1 << i5) - 1;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i18 < i16) {
                long j = 0;
                for (int i22 = 0; i22 < this.w; i22++) {
                    j ^= (bArr3[i19] & 255) << (i22 << 3);
                    i19++;
                }
                int i23 = 0;
                long j2 = j;
                while (i23 < i6) {
                    int i24 = ((int) j2) & i17;
                    i20 += i24;
                    hashPrivateKeyBlock(i21, i24, bArr2, this.mdsize * i21);
                    j2 >>>= this.w;
                    i21++;
                    i23++;
                    i6 = 8;
                }
                i18++;
                i6 = 8;
            }
            int i25 = this.mdsize % this.w;
            long j3 = 0;
            for (int i26 = 0; i26 < i25; i26++) {
                j3 ^= (bArr3[i19] & 255) << (i26 << 3);
                i19++;
            }
            int i27 = 0;
            while (i27 < (i25 << 3)) {
                int i28 = ((int) j3) & i17;
                i20 += i28;
                hashPrivateKeyBlock(i21, i28, bArr2, this.mdsize * i21);
                int i29 = this.w;
                j3 >>>= i29;
                i21++;
                i27 += i29;
            }
            int i30 = (this.messagesize << this.w) - i20;
            while (i4 < this.checksumsize) {
                hashPrivateKeyBlock(i21, i30 & i17, bArr2, this.mdsize * i21);
                int i31 = this.w;
                i30 >>>= i31;
                i21++;
                i4 += i31;
            }
        } else if (i5 < 57) {
            int i32 = this.mdsize;
            int i33 = (1 << i5) - 1;
            byte[] bArr4 = new byte[i32];
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            while (i34 <= (i32 << 3) - i5) {
                int i37 = this.w + i34;
                int i38 = 0;
                long j4 = 0;
                for (int i39 = i34 >>> 3; i39 < ((i37 + 7) >>> 3); i39++) {
                    j4 ^= (bArr3[i39] & 255) << (i38 << 3);
                    i38++;
                }
                long j5 = i33 & (j4 >>> (i34 % 8));
                i36 = (int) (i36 + j5);
                System.arraycopy(this.privateKeyOTS[i35], 0, bArr4, 0, this.mdsize);
                while (j5 > 0) {
                    this.messDigestOTS.update(bArr4, 0, i32);
                    this.messDigestOTS.doFinal(bArr4, 0);
                    j5--;
                }
                int i40 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr2, i35 * i40, i40);
                i35++;
                i34 = i37;
            }
            int i41 = i34 >>> 3;
            if (i41 < this.mdsize) {
                int i42 = 0;
                long j6 = 0;
                while (true) {
                    i = this.mdsize;
                    if (i41 >= i) {
                        break;
                    }
                    j6 ^= (bArr3[i41] & 255) << (i42 << 3);
                    i42++;
                    i41++;
                }
                long j7 = (j6 >>> (i34 % 8)) & i33;
                i36 = (int) (i36 + j7);
                System.arraycopy(this.privateKeyOTS[i35], 0, bArr4, 0, i);
                while (j7 > 0) {
                    this.messDigestOTS.update(bArr4, 0, i32);
                    this.messDigestOTS.doFinal(bArr4, 0);
                    j7--;
                }
                int i43 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr2, i35 * i43, i43);
                i35++;
            }
            int i44 = (this.messagesize << this.w) - i36;
            int i45 = 0;
            while (i45 < this.checksumsize) {
                System.arraycopy(this.privateKeyOTS[i35], 0, bArr4, 0, this.mdsize);
                for (long j8 = i44 & i33; j8 > 0; j8--) {
                    this.messDigestOTS.update(bArr4, 0, i32);
                    this.messDigestOTS.doFinal(bArr4, 0);
                }
                int i46 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr2, i35 * i46, i46);
                int i47 = this.w;
                i44 >>>= i47;
                i35++;
                i45 += i47;
            }
        }
        return bArr2;
    }
}
