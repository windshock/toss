package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzgy extends zzhc {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    /* synthetic */ zzgy(byte[] bArr, int i2, int i3, boolean z, zzgx zzgxVar) {
        super(null);
        this.zzj = Integer.MAX_VALUE;
        this.zze = bArr;
        this.zzf = 0;
        this.zzh = 0;
    }

    private final void zzI() {
        int i2 = this.zzf + this.zzg;
        this.zzf = i2;
        int i3 = this.zzj;
        if (i2 <= i3) {
            this.zzg = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zzg = i4;
        this.zzf = i2 - i4;
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final void zzA(int i2) {
        this.zzj = i2;
        zzI();
    }

    public final void zzB(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.zzf;
            int i4 = this.zzh;
            if (i2 <= i3 - i4) {
                this.zzh = i4 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw zzje.zzj();
        }
        throw zzje.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final boolean zzC() throws IOException {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final boolean zzD() throws IOException {
        return zzr() != 0;
    }

    public final byte zza() throws IOException {
        int i2 = this.zzh;
        if (i2 == this.zzf) {
            throw zzje.zzj();
        }
        byte[] bArr = this.zze;
        this.zzh = i2 + 1;
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
        return this.zzh;
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final int zze(int i2) throws zzje {
        if (i2 < 0) {
            throw zzje.zzf();
        }
        int i3 = i2 + this.zzh;
        if (i3 < 0) {
            throw zzje.zzg();
        }
        int i4 = this.zzj;
        if (i3 > i4) {
            throw zzje.zzj();
        }
        this.zzj = i3;
        zzI();
        return i4;
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
        int i2 = this.zzh;
        if (this.zzf - i2 < 4) {
            throw zzje.zzj();
        }
        byte[] bArr = this.zze;
        this.zzh = i2 + 4;
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
            this.zzi = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzi = iZzj;
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
        int i2 = this.zzh;
        if (this.zzf - i2 < 8) {
            throw zzje.zzj();
        }
        byte[] bArr = this.zze;
        this.zzh = i2 + 8;
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
        if (iZzj > 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (iZzj <= i2 - i3) {
                zzgw zzgwVarZzm = zzgw.zzm(this.zze, i3, iZzj);
                this.zzh += iZzj;
                return zzgwVarZzm;
            }
        }
        if (iZzj == 0) {
            return zzgw.zzb;
        }
        if (iZzj > 0) {
            int i4 = this.zzf;
            int i5 = this.zzh;
            if (iZzj <= i4 - i5) {
                int i6 = iZzj + i5;
                this.zzh = i6;
                return new zzgt(Arrays.copyOfRange(this.zze, i5, i6));
            }
        }
        if (iZzj <= 0) {
            throw zzje.zzf();
        }
        throw zzje.zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final String zzx() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (iZzj <= i2 - i3) {
                String str = new String(this.zze, i3, iZzj, zzjc.zzb);
                this.zzh += iZzj;
                return str;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj < 0) {
            throw zzje.zzf();
        }
        throw zzje.zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final String zzy() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (iZzj <= i2 - i3) {
                String strZzd = zzma.zzd(this.zze, i3, iZzj);
                this.zzh += iZzj;
                return strZzd;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj <= 0) {
            throw zzje.zzf();
        }
        throw zzje.zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzhc
    public final void zzz(int i2) throws zzje {
        if (this.zzi != i2) {
            throw zzje.zzb();
        }
    }

    public final int zzj() throws IOException {
        int i2;
        int i3 = this.zzh;
        int i4 = this.zzf;
        if (i4 != i3) {
            byte[] bArr = this.zze;
            int i5 = i3 + 1;
            byte b = bArr[i3];
            if (b >= 0) {
                this.zzh = i5;
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
                this.zzh = i6;
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
            if (this.zzf - this.zzh < 10) {
                while (i4 < 10) {
                    if (zza() < 0) {
                        i4++;
                    }
                }
                throw zzje.zze();
            }
            while (i4 < 10) {
                byte[] bArr = this.zze;
                int i5 = this.zzh;
                this.zzh = i5 + 1;
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
        int i2 = this.zzh;
        int i3 = this.zzf;
        if (i3 != i2) {
            byte[] bArr = this.zze;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzh = i4;
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
                this.zzh = i5;
                return j;
            }
        }
        return zzs();
    }
}
