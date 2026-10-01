package org.bouncycastle.pqc.crypto.gmss.util;

import org.bouncycastle.crypto.Digest;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class WinternitzOTSVerify {
    private int mdsize;
    private Digest messDigestOTS;
    private int w;

    public WinternitzOTSVerify(Digest digest, int i) {
        this.w = i;
        this.messDigestOTS = digest;
        this.mdsize = digest.getDigestSize();
    }

    private void hashSignatureBlock(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i2 <= 0) {
            System.arraycopy(bArr, i, bArr2, i3, this.mdsize);
            return;
        }
        this.messDigestOTS.update(bArr, i, this.mdsize);
        while (true) {
            this.messDigestOTS.doFinal(bArr2, i3);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                this.messDigestOTS.update(bArr2, i3, this.mdsize);
            }
        }
    }

    public byte[] Verify(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.mdsize;
        byte[] bArr3 = new byte[i5];
        int i6 = 0;
        this.messDigestOTS.update(bArr, 0, bArr.length);
        this.messDigestOTS.doFinal(bArr3, 0);
        int i7 = this.mdsize;
        int i8 = this.w;
        int i9 = ((i7 << 3) + (i8 - 1)) / i8;
        int log = getLog((i9 << i8) + 1);
        int i10 = this.w;
        int i11 = this.mdsize;
        int i12 = i11 * ((((log + i10) - 1) / i10) + i9);
        if (i12 != bArr2.length) {
            return null;
        }
        byte[] bArr4 = new byte[i12];
        int i13 = 8;
        if (8 % i10 == 0) {
            int i14 = 8 / i10;
            int i15 = (1 << i10) - 1;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i5) {
                int i19 = i16;
                int i20 = i17;
                int i21 = 0;
                while (i21 < i14) {
                    int i22 = bArr3[i18] & i15;
                    int i23 = i20 * this.mdsize;
                    int i24 = i18;
                    hashSignatureBlock(bArr2, i23, i15 - i22, bArr4, i23);
                    bArr3[i24] = (byte) (bArr3[i24] >>> this.w);
                    i20++;
                    i21++;
                    i19 += i22;
                    i18 = i24;
                    i14 = i14;
                }
                i18++;
                i16 = i19;
                i17 = i20;
            }
            int i25 = i17;
            int i26 = (i9 << this.w) - i16;
            int i27 = 0;
            while (i27 < log) {
                int i28 = i25 * this.mdsize;
                hashSignatureBlock(bArr2, i28, i15 - (i26 & i15), bArr4, i28);
                int i29 = this.w;
                i26 >>>= i29;
                i25++;
                i27 += i29;
            }
            i4 = 0;
            i = i12;
        } else {
            long j = 0;
            if (i10 < 8) {
                int i30 = i11 / i10;
                int i31 = (1 << i10) - 1;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                while (i35 < i30) {
                    int i36 = i32;
                    int i37 = i6;
                    long j2 = 0;
                    while (i37 < this.w) {
                        j2 ^= (bArr3[i36] & 255) << (i37 << 3);
                        i36++;
                        i37++;
                        log = log;
                    }
                    int i38 = log;
                    int i39 = i33;
                    int i40 = i34;
                    int i41 = 0;
                    while (i41 < i13) {
                        int i42 = (int) (j2 & i31);
                        int i43 = i40 * this.mdsize;
                        hashSignatureBlock(bArr2, i43, i31 - i42, bArr4, i43);
                        j2 >>>= this.w;
                        i40++;
                        i41++;
                        i39 += i42;
                        i31 = i31;
                        i30 = i30;
                        i35 = i35;
                        i13 = i13;
                    }
                    i35++;
                    i33 = i39;
                    i34 = i40;
                    i32 = i36;
                    log = i38;
                    i30 = i30;
                    i6 = 0;
                }
                int i44 = i31;
                int i45 = log;
                int i46 = this.mdsize % this.w;
                for (int i47 = 0; i47 < i46; i47++) {
                    j ^= (bArr3[i32] & 255) << (i47 << 3);
                    i32++;
                }
                int i48 = i33;
                int i49 = i34;
                int i50 = 0;
                while (i50 < (i46 << 3)) {
                    int i51 = (int) (j & i44);
                    int i52 = i49 * this.mdsize;
                    hashSignatureBlock(bArr2, i52, i44 - i51, bArr4, i52);
                    int i53 = this.w;
                    j >>>= i53;
                    i49++;
                    i50 += i53;
                    i48 += i51;
                }
                int i54 = (i9 << this.w) - i48;
                int i55 = 0;
                while (i55 < i45) {
                    int i56 = i49 * this.mdsize;
                    hashSignatureBlock(bArr2, i56, i44 - (i54 & i44), bArr4, i56);
                    int i57 = this.w;
                    i54 >>>= i57;
                    i49++;
                    i55 += i57;
                }
            } else {
                if (i10 < 57) {
                    int i58 = (i11 << 3) - i10;
                    int i59 = (1 << i10) - 1;
                    byte[] bArr5 = new byte[i11];
                    int i60 = 0;
                    int i61 = 0;
                    int i62 = 0;
                    while (i60 <= i58) {
                        int i63 = this.w + i60;
                        int i64 = i60 >>> 3;
                        long j3 = 0;
                        int i65 = 0;
                        while (true) {
                            i3 = i58;
                            if (i64 >= ((i63 + 7) >>> 3)) {
                                break;
                            }
                            j3 ^= (bArr3[i64] & 255) << (i65 << 3);
                            i65++;
                            i64++;
                            i12 = i12;
                            i58 = i3;
                            log = log;
                        }
                        int i66 = log;
                        int i67 = i12;
                        long j4 = i59;
                        long j5 = (j3 >>> (i60 % 8)) & j4;
                        int i68 = i9;
                        i62 = (int) (i62 + j5);
                        int i69 = this.mdsize;
                        System.arraycopy(bArr2, i61 * i69, bArr5, 0, i69);
                        for (long j6 = j5; j6 < j4; j6++) {
                            this.messDigestOTS.update(bArr5, 0, i11);
                            this.messDigestOTS.doFinal(bArr5, 0);
                        }
                        int i70 = this.mdsize;
                        System.arraycopy(bArr5, 0, bArr4, i61 * i70, i70);
                        i61++;
                        i9 = i68;
                        i60 = i63;
                        i12 = i67;
                        i58 = i3;
                        log = i66;
                    }
                    int i71 = log;
                    i = i12;
                    int i72 = i9;
                    int i73 = i60 >>> 3;
                    if (i73 < this.mdsize) {
                        int i74 = 0;
                        while (true) {
                            i2 = this.mdsize;
                            if (i73 >= i2) {
                                break;
                            }
                            j ^= (bArr3[i73] & 255) << (i74 << 3);
                            i74++;
                            i73++;
                        }
                        long j7 = i59;
                        long j8 = (j >>> (i60 % 8)) & j7;
                        i62 = (int) (i62 + j8);
                        System.arraycopy(bArr2, i61 * i2, bArr5, 0, i2);
                        while (j8 < j7) {
                            this.messDigestOTS.update(bArr5, 0, i11);
                            this.messDigestOTS.doFinal(bArr5, 0);
                            j8++;
                        }
                        int i75 = this.mdsize;
                        System.arraycopy(bArr5, 0, bArr4, i61 * i75, i75);
                        i61++;
                    }
                    int i76 = (i72 << this.w) - i62;
                    int i77 = 0;
                    while (i77 < i71) {
                        int i78 = this.mdsize;
                        System.arraycopy(bArr2, i61 * i78, bArr5, 0, i78);
                        for (long j9 = i76 & i59; j9 < i59; j9++) {
                            this.messDigestOTS.update(bArr5, 0, i11);
                            this.messDigestOTS.doFinal(bArr5, 0);
                        }
                        int i79 = this.mdsize;
                        System.arraycopy(bArr5, 0, bArr4, i61 * i79, i79);
                        int i80 = this.w;
                        i76 >>>= i80;
                        i61++;
                        i77 += i80;
                    }
                }
                i4 = 0;
            }
            i = i12;
            i4 = 0;
        }
        this.messDigestOTS.update(bArr4, i4, i);
        byte[] bArr6 = new byte[this.mdsize];
        this.messDigestOTS.doFinal(bArr6, i4);
        return bArr6;
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

    public int getSignatureLength() {
        int digestSize = this.messDigestOTS.getDigestSize();
        int i = this.w;
        int i2 = ((digestSize << 3) + (i - 1)) / i;
        int log = getLog((i2 << i) + 1);
        return digestSize * (i2 + (((log + r3) - 1) / this.w));
    }
}
