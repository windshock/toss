package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzha extends zzhc {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    /* synthetic */ zzha(InputStream inputStream, int i2, zzgz zzgzVar) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzI(int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int iMin = Math.min(i2, 4096);
            byte[] bArr = new byte[iMin];
            int i3 = 0;
            while (i3 < iMin) {
                int i4 = this.zze.read(bArr, i3, iMin - i3);
                if (i4 == -1) {
                    throw zzje.zzj();
                }
                this.zzk += i4;
                i3 += i4;
            }
            i2 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzJ() {
        int i2 = this.zzg + this.zzh;
        this.zzg = i2;
        int i3 = this.zzk + i2;
        int i4 = this.zzl;
        if (i3 <= i4) {
            this.zzh = 0;
            return;
        }
        int i5 = i3 - i4;
        this.zzh = i5;
        this.zzg = i2 - i5;
    }

    private final void zzK(int i2) throws IOException {
        if (zzL(i2)) {
            return;
        }
        if (i2 <= (Integer.MAX_VALUE - this.zzk) - this.zzi) {
            throw zzje.zzj();
        }
        throw zzje.zzi();
    }

    private final boolean zzL(int i2) throws IOException {
        int i3 = this.zzi;
        int i4 = this.zzg;
        if (i3 + i2 <= i4) {
            throw new IllegalStateException("refillBuffer() called when " + i2 + " bytes were already available in buffer");
        }
        int i5 = this.zzk;
        if (i2 > (Integer.MAX_VALUE - i5) - i3 || i5 + i3 + i2 > this.zzl) {
            return false;
        }
        if (i3 > 0) {
            if (i4 > i3) {
                byte[] bArr = this.zzf;
                System.arraycopy(bArr, i3, bArr, 0, i4 - i3);
            }
            i5 = this.zzk + i3;
            this.zzk = i5;
            i4 = this.zzg - i3;
            this.zzg = i4;
            this.zzi = 0;
        }
        try {
            int i6 = this.zze.read(this.zzf, i4, Math.min(4096 - i4, (Integer.MAX_VALUE - i5) - i4));
            if (i6 == 0 || i6 < -1 || i6 > 4096) {
                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + i6 + "\nThe InputStream implementation is buggy.");
            }
            if (i6 <= 0) {
                return false;
            }
            this.zzg += i6;
            zzJ();
            if (this.zzg >= i2) {
                return true;
            }
            return zzL(i2);
        } catch (zzje e) {
            e.zzk();
            throw e;
        }
    }

    private final byte[] zzM(int i2, boolean z) throws IOException {
        byte[] bArrZzN = zzN(i2);
        if (bArrZzN != null) {
            return bArrZzN;
        }
        int i3 = this.zzi;
        int i4 = this.zzg;
        int i5 = i4 - i3;
        this.zzk += i4;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzI = zzI(i2 - i5);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.zzf, i3, bArr, 0, i5);
        for (byte[] bArr2 : listZzI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return bArr;
    }

    private final byte[] zzN(int i2) throws IOException {
        if (i2 == 0) {
            return zzjc.zzd;
        }
        if (i2 < 0) {
            throw zzje.zzf();
        }
        int i3 = this.zzk;
        int i4 = this.zzi;
        int i5 = i3 + i4 + i2;
        if ((-2147483647) + i5 > 0) {
            throw zzje.zzi();
        }
        int i6 = this.zzl;
        if (i5 > i6) {
            zzB((i6 - i3) - i4);
            throw zzje.zzj();
        }
        int i7 = this.zzg - i4;
        int i8 = i2 - i7;
        if (i8 >= 4096) {
            try {
                if (i8 > this.zze.available()) {
                    return null;
                }
            } catch (zzje e) {
                e.zzk();
                throw e;
            }
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i7);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i7 < i2) {
            try {
                int i9 = this.zze.read(bArr, i7, i2 - i7);
                if (i9 == -1) {
                    throw zzje.zzj();
                }
                this.zzk += i9;
                i7 += i9;
            } catch (zzje e2) {
                e2.zzk();
                throw e2;
            }
        }
        return bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final void zzA(int i2) {
        this.zzl = i2;
        zzJ();
    }

    public final void zzB(int i2) throws IOException {
        int i3 = this.zzg;
        int i4 = this.zzi;
        int i5 = i3 - i4;
        if (i2 <= i5 && i2 >= 0) {
            this.zzi = i4 + i2;
            return;
        }
        if (i2 < 0) {
            throw zzje.zzf();
        }
        int i6 = this.zzk;
        int i7 = i6 + i4;
        int i8 = this.zzl;
        if (i7 + i2 > i8) {
            zzB((i8 - i6) - i4);
            throw zzje.zzj();
        }
        this.zzk = i7;
        this.zzg = 0;
        this.zzi = 0;
        while (i5 < i2) {
            try {
                long j = i2 - i5;
                try {
                    long jSkip = this.zze.skip(j);
                    if (jSkip >= 0 && jSkip <= j) {
                        if (jSkip == 0) {
                            break;
                        } else {
                            i5 += (int) jSkip;
                        }
                    } else {
                        throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                } catch (zzje e) {
                    e.zzk();
                    throw e;
                }
            } finally {
                this.zzk += i5;
                zzJ();
            }
        }
        if (i5 >= i2) {
            return;
        }
        int i9 = this.zzg;
        int i10 = i9 - this.zzi;
        this.zzi = i9;
        zzK(1);
        while (true) {
            int i11 = i2 - i10;
            int i12 = this.zzg;
            if (i11 <= i12) {
                this.zzi = i11;
                return;
            } else {
                i10 += i12;
                this.zzi = i12;
                zzK(1);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final boolean zzC() throws IOException {
        return this.zzi == this.zzg && !zzL(1);
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final boolean zzD() throws IOException {
        return zzr() != 0;
    }

    public final byte zza() throws IOException {
        if (this.zzi == this.zzg) {
            zzK(1);
        }
        byte[] bArr = this.zzf;
        int i2 = this.zzi;
        this.zzi = i2 + 1;
        return bArr[i2];
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final double zzb() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final float zzc() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final int zzd() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final int zze(int i2) throws zzje {
        if (i2 < 0) {
            throw zzje.zzf();
        }
        int i3 = this.zzk;
        int i4 = this.zzi;
        int i5 = this.zzl;
        int i6 = i2 + i3 + i4;
        if (i6 > i5) {
            throw zzje.zzj();
        }
        this.zzl = i6;
        zzJ();
        return i5;
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final int zzf() throws IOException {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final int zzg() throws IOException {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final int zzh() throws IOException {
        return zzj();
    }

    public final int zzi() throws IOException {
        int i2 = this.zzi;
        if (this.zzg - i2 < 4) {
            zzK(4);
            i2 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i2 + 4;
        byte b = bArr[i2];
        return ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 1] & 255) << 8) | (b & 255) | ((bArr[i2 + 2] & 255) << 16);
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final int zzk() throws IOException {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final int zzl() throws IOException {
        return zzhc.zzF(zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final int zzm() throws IOException {
        if (zzC()) {
            this.zzj = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzj = iZzj;
        if ((iZzj >>> 3) != 0) {
            return iZzj;
        }
        throw zzje.zzc();
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final int zzn() throws IOException {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final long zzo() throws IOException {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final long zzp() throws IOException {
        return zzr();
    }

    public final long zzq() throws IOException {
        int i2 = this.zzi;
        if (this.zzg - i2 < 8) {
            zzK(8);
            i2 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i2 + 8;
        return ((bArr[i2 + 6] & 255) << 48) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 7] & 255) << 56);
    }

    final long zzs() throws IOException {
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i2;
            if ((zza() & 128) == 0) {
                return j;
            }
        }
        throw zzje.zze();
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final long zzt() throws IOException {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final long zzu() throws IOException {
        return zzhc.zzG(zzr());
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final long zzv() throws IOException {
        return zzr();
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final zzgw zzw() throws IOException {
        int iZzj = zzj();
        int i2 = this.zzg;
        int i3 = this.zzi;
        if (iZzj <= i2 - i3 && iZzj > 0) {
            zzgw zzgwVarZzm = zzgw.zzm(this.zzf, i3, iZzj);
            this.zzi += iZzj;
            return zzgwVarZzm;
        }
        if (iZzj == 0) {
            return zzgw.zzb;
        }
        byte[] bArrZzN = zzN(iZzj);
        if (bArrZzN != null) {
            return zzgw.zzm(bArrZzN, 0, bArrZzN.length);
        }
        int i4 = this.zzi;
        int i5 = this.zzg;
        int i6 = i5 - i4;
        this.zzk += i5;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzI = zzI(iZzj - i6);
        byte[] bArr = new byte[iZzj];
        System.arraycopy(this.zzf, i4, bArr, 0, i6);
        for (byte[] bArr2 : listZzI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i6, length);
            i6 += length;
        }
        return new zzgt(bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final String zzx() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i2 = this.zzg;
            int i3 = this.zzi;
            if (iZzj <= i2 - i3) {
                String str = new String(this.zzf, i3, iZzj, zzjc.zzb);
                this.zzi += iZzj;
                return str;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj > this.zzg) {
            return new String(zzM(iZzj, false), zzjc.zzb);
        }
        zzK(iZzj);
        String str2 = new String(this.zzf, this.zzi, iZzj, zzjc.zzb);
        this.zzi += iZzj;
        return str2;
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final String zzy() throws IOException {
        byte[] bArrZzM;
        int iZzj = zzj();
        int i2 = this.zzi;
        int i3 = this.zzg;
        if (iZzj <= i3 - i2 && iZzj > 0) {
            bArrZzM = this.zzf;
            this.zzi = i2 + iZzj;
        } else {
            if (iZzj == 0) {
                return "";
            }
            i2 = 0;
            if (iZzj <= i3) {
                zzK(iZzj);
                bArrZzM = this.zzf;
                this.zzi = iZzj;
            } else {
                bArrZzM = zzM(iZzj, false);
            }
        }
        return zzma.zzd(bArrZzM, i2, iZzj);
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final void zzz(int i2) throws zzje {
        if (this.zzj != i2) {
            throw zzje.zzb();
        }
    }

    public final int zzj() throws IOException {
        int i2;
        int i3 = this.zzi;
        int i4 = this.zzg;
        if (i4 != i3) {
            byte[] bArr = this.zzf;
            int i5 = i3 + 1;
            byte b = bArr[i3];
            if (b >= 0) {
                this.zzi = i5;
                return b;
            }
            if (i4 - i5 >= 9) {
                int i6 = i3 + 2;
                int i7 = (bArr[i5] << 7) ^ b;
                if (i7 < 0) {
                    i2 = i7 ^ (-128);
                } else {
                    int i8 = i3 + 3;
                    int i9 = (bArr[i6] << 14) ^ i7;
                    if (i9 >= 0) {
                        i2 = i9 ^ 16256;
                    } else {
                        int i10 = i3 + 4;
                        int i11 = i9 ^ (bArr[i8] << 21);
                        if (i11 < 0) {
                            i2 = (-2080896) ^ i11;
                        } else {
                            i8 = i3 + 5;
                            byte b2 = bArr[i10];
                            int i12 = (i11 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i10 = i3 + 6;
                                if (bArr[i8] < 0) {
                                    i8 = i3 + 7;
                                    if (bArr[i10] < 0) {
                                        i10 = i3 + 8;
                                        if (bArr[i8] < 0) {
                                            i8 = i3 + 9;
                                            if (bArr[i10] < 0) {
                                                if (bArr[i8] >= 0) {
                                                    i6 = i3 + 10;
                                                    i2 = i12;
                                                }
                                            }
                                        }
                                    }
                                }
                                i2 = i12;
                            }
                            i2 = i12;
                        }
                        i6 = i10;
                    }
                    i6 = i8;
                }
                this.zzi = i6;
                return i2;
            }
        }
        return (int) zzs();
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final boolean zzE(int i2) throws IOException {
        int iZzm;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i4 < 10) {
                    if (zza() < 0) {
                        i4++;
                    }
                }
                throw zzje.zze();
            }
            while (i4 < 10) {
                byte[] bArr = this.zzf;
                int i5 = this.zzi;
                this.zzi = i5 + 1;
                if (bArr[i5] < 0) {
                    i4++;
                }
            }
            throw zzje.zze();
            return true;
        }
        if (i3 == 1) {
            zzB(8);
            return true;
        }
        if (i3 == 2) {
            zzB(zzj());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw zzje.zza();
            }
            zzB(4);
            return true;
        }
        do {
            iZzm = zzm();
            if (iZzm == 0) {
                break;
            }
        } while (zzE(iZzm));
        zzz(((i2 >>> 3) << 3) | 4);
        return true;
    }

    public final long zzr() throws IOException {
        long j;
        long j2;
        long j3;
        int i2 = this.zzi;
        int i3 = this.zzg;
        if (i3 != i2) {
            byte[] bArr = this.zzf;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzi = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    j = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        j3 = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            long j4 = (-2080896) ^ i10;
                            i5 = i9;
                            j = j4;
                        } else {
                            i7 = i2 + 5;
                            long j5 = (bArr[i9] << 28) ^ i10;
                            if (j5 >= 0) {
                                j3 = 266354560 ^ j5;
                            } else {
                                i5 = i2 + 6;
                                long j6 = (bArr[i7] << 35) ^ j5;
                                if (j6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    int i11 = i2 + 7;
                                    long j7 = j6 ^ (bArr[i5] << 42);
                                    if (j7 >= 0) {
                                        j = 4363953127296L ^ j7;
                                    } else {
                                        i5 = i2 + 8;
                                        j6 = j7 ^ (bArr[i11] << 49);
                                        if (j6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i11 = i2 + 9;
                                            long j8 = (j6 ^ (bArr[i5] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                i5 = i2 + 10;
                                                if (bArr[i11] >= 0) {
                                                    j = j8;
                                                }
                                            } else {
                                                j = j8;
                                            }
                                        }
                                    }
                                    i5 = i11;
                                }
                                j = j6 ^ j2;
                            }
                        }
                    }
                    j = j3;
                    i5 = i7;
                }
                this.zzi = i5;
                return j;
            }
        }
        return zzs();
    }
}
