package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzaia extends zzaib {
    private final byte[] zze;
    private final boolean zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    private final byte zzv() throws IOException {
        int i2 = this.zzi;
        if (i2 == this.zzg) {
            throw zzajj.zzi();
        }
        byte[] bArr = this.zze;
        this.zzi = i2 + 1;
        return bArr[i2];
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzw());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final int zzc() {
        return this.zzi - this.zzj;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final int zza(int i2) throws zzajj {
        if (i2 < 0) {
            throw zzajj.zzf();
        }
        int iZzc = i2 + zzc();
        if (iZzc < 0) {
            throw zzajj.zzg();
        }
        int i3 = this.zzl;
        if (iZzc > i3) {
            throw zzajj.zzi();
        }
        this.zzl = iZzc;
        zzaa();
        return i3;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final int zzd() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final int zze() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final int zzf() throws IOException {
        return zzx();
    }

    private final int zzw() throws IOException {
        int i2 = this.zzi;
        if (this.zzg - i2 < 4) {
            throw zzajj.zzi();
        }
        byte[] bArr = this.zze;
        this.zzi = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    private final int zzx() throws IOException {
        int i2;
        int i3 = this.zzi;
        int i4 = this.zzg;
        if (i4 != i3) {
            byte[] bArr = this.zze;
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
        return (int) zzm();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final int zzg() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final int zzh() throws IOException {
        return zzaib.zze(zzx());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final int zzi() throws IOException {
        if (zzt()) {
            this.zzk = 0;
            return 0;
        }
        int iZzx = zzx();
        this.zzk = iZzx;
        if ((iZzx >>> 3) != 0) {
            return iZzx;
        }
        throw zzajj.zzc();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final int zzj() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final long zzk() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final long zzl() throws IOException {
        return zzz();
    }

    private final long zzy() throws IOException {
        int i2 = this.zzi;
        if (this.zzg - i2 < 8) {
            throw zzajj.zzi();
        }
        byte[] bArr = this.zze;
        this.zzi = i2 + 8;
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    private final long zzz() throws IOException {
        long j;
        long j2;
        long j3;
        int i2 = this.zzi;
        int i3 = this.zzg;
        if (i3 != i2) {
            byte[] bArr = this.zze;
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
                        j = i8 ^ 16256;
                        i5 = i7;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            long j4 = (-2080896) ^ i10;
                            i5 = i9;
                            j = j4;
                        } else {
                            long j5 = i10;
                            i5 = i2 + 5;
                            long j6 = j5 ^ (bArr[i9] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                int i11 = i2 + 6;
                                long j7 = j6 ^ (bArr[i5] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i5 = i2 + 7;
                                    j6 = j7 ^ (bArr[i11] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i11 = i2 + 8;
                                        j7 = j6 ^ (bArr[i5] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i5 = i2 + 9;
                                            long j8 = (j7 ^ (bArr[i11] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                if (bArr[i5] >= 0) {
                                                    i5 = i2 + 10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j = j7 ^ j2;
                                i5 = i11;
                            }
                            j = j6 ^ j3;
                        }
                    }
                }
                this.zzi = i5;
                return j;
            }
        }
        return zzm();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    final long zzm() throws IOException {
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i2;
            if ((zzv() & 128) == 0) {
                return j;
            }
        }
        throw zzajj.zze();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final long zzn() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final long zzo() throws IOException {
        return zzaib.zza(zzz());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final long zzp() throws IOException {
        return zzz();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzahm zzq() throws IOException {
        byte[] bArrCopyOfRange;
        int iZzx = zzx();
        if (iZzx > 0) {
            int i2 = this.zzg;
            int i3 = this.zzi;
            if (iZzx <= i2 - i3) {
                zzahm zzahmVarZza = zzahm.zza(this.zze, i3, iZzx);
                this.zzi += iZzx;
                return zzahmVarZza;
            }
        }
        if (iZzx == 0) {
            return zzahm.zza;
        }
        if (iZzx > 0) {
            int i4 = this.zzg;
            int i5 = this.zzi;
            if (iZzx <= i4 - i5) {
                int i6 = iZzx + i5;
                this.zzi = i6;
                bArrCopyOfRange = Arrays.copyOfRange(this.zze, i5, i6);
            } else {
                if (iZzx > 0) {
                    throw zzajj.zzi();
                }
                if (iZzx == 0) {
                    bArrCopyOfRange = zzajc.zzb;
                } else {
                    throw zzajj.zzf();
                }
            }
        }
        return zzahm.zzb(bArrCopyOfRange);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final String zzr() throws IOException {
        int iZzx = zzx();
        if (iZzx > 0) {
            int i2 = this.zzg;
            int i3 = this.zzi;
            if (iZzx <= i2 - i3) {
                String str = new String(this.zze, i3, iZzx, zzajc.zza);
                this.zzi += iZzx;
                return str;
            }
        }
        if (iZzx == 0) {
            return "";
        }
        if (iZzx < 0) {
            throw zzajj.zzf();
        }
        throw zzajj.zzi();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final String zzs() throws IOException {
        int iZzx = zzx();
        if (iZzx > 0) {
            int i2 = this.zzg;
            int i3 = this.zzi;
            if (iZzx <= i2 - i3) {
                String strZzb = zzaml.zzb(this.zze, i3, iZzx);
                this.zzi += iZzx;
                return strZzb;
            }
        }
        if (iZzx == 0) {
            return "";
        }
        if (iZzx <= 0) {
            throw zzajj.zzf();
        }
        throw zzajj.zzi();
    }

    private zzaia(byte[] bArr, int i2, int i3, boolean z) {
        super();
        this.zzl = Integer.MAX_VALUE;
        this.zze = bArr;
        this.zzg = i3 + i2;
        this.zzi = i2;
        this.zzj = i2;
        this.zzf = z;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final void zzb(int i2) throws zzajj {
        if (this.zzk != i2) {
            throw zzajj.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final void zzc(int i2) {
        this.zzl = i2;
        zzaa();
    }

    private final void zzaa() {
        int i2 = this.zzg + this.zzh;
        this.zzg = i2;
        int i3 = i2 - this.zzj;
        int i4 = this.zzl;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.zzh = i5;
            this.zzg = i2 - i5;
            return;
        }
        this.zzh = 0;
    }

    private final void zzf(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.zzg;
            int i4 = this.zzi;
            if (i2 <= i3 - i4) {
                this.zzi = i4 + i2;
                return;
            }
        }
        if (i2 < 0) {
            throw zzajj.zzf();
        }
        throw zzajj.zzi();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final boolean zzt() throws IOException {
        return this.zzi == this.zzg;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final boolean zzu() throws IOException {
        return zzz() != 0;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final boolean zzd(int i2) throws IOException {
        int iZzi;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.zzg - this.zzi >= 10) {
                while (i4 < 10) {
                    byte[] bArr = this.zze;
                    int i5 = this.zzi;
                    this.zzi = i5 + 1;
                    if (bArr[i5] < 0) {
                        i4++;
                    }
                }
                throw zzajj.zze();
            }
            while (i4 < 10) {
                if (zzv() < 0) {
                    i4++;
                }
            }
            throw zzajj.zze();
            return true;
        }
        if (i3 == 1) {
            zzf(8);
            return true;
        }
        if (i3 == 2) {
            zzf(zzx());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 == 5) {
                zzf(4);
                return true;
            }
            throw zzajj.zza();
        }
        do {
            iZzi = zzi();
            if (iZzi == 0) {
                break;
            }
        } while (zzd(iZzi));
        zzb(((i2 >>> 3) << 3) | 4);
        return true;
    }
}
