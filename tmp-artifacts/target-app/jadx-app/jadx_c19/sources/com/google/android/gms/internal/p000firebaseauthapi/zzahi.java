package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzahi {
    static double zza(byte[] bArr, int i2) {
        return Double.longBitsToDouble(zzd(bArr, i2));
    }

    static float zzb(byte[] bArr, int i2) {
        return Float.intBitsToFloat(zzc(bArr, i2));
    }

    static int zza(byte[] bArr, int i2, zzahl zzahlVar) throws zzajj {
        int iZzc = zzc(bArr, i2, zzahlVar);
        int i3 = zzahlVar.zza;
        if (i3 < 0) {
            throw zzajj.zzf();
        }
        if (i3 > bArr.length - iZzc) {
            throw zzajj.zzi();
        }
        if (i3 == 0) {
            zzahlVar.zzc = zzahm.zza;
            return iZzc;
        }
        zzahlVar.zzc = zzahm.zza(bArr, iZzc, i3);
        return iZzc + i3;
    }

    static int zzc(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    static int zza(zzalc zzalcVar, byte[] bArr, int i2, int i3, int i4, zzahl zzahlVar) throws IOException {
        Object objZza = zzalcVar.zza();
        int iZza = zza(objZza, zzalcVar, bArr, i2, i3, i4, zzahlVar);
        zzalcVar.zzc(objZza);
        zzahlVar.zzc = objZza;
        return iZza;
    }

    static int zza(zzalc zzalcVar, byte[] bArr, int i2, int i3, zzahl zzahlVar) throws IOException {
        Object objZza = zzalcVar.zza();
        int iZza = zza(objZza, zzalcVar, bArr, i2, i3, zzahlVar);
        zzalcVar.zzc(objZza);
        zzahlVar.zzc = objZza;
        return iZza;
    }

    static int zza(zzalc<?> zzalcVar, int i2, byte[] bArr, int i3, int i4, zzajg<?> zzajgVar, zzahl zzahlVar) throws IOException {
        int iZza = zza(zzalcVar, bArr, i3, i4, zzahlVar);
        zzajgVar.add(zzahlVar.zzc);
        while (iZza < i4) {
            int iZzc = zzc(bArr, iZza, zzahlVar);
            if (i2 != zzahlVar.zza) {
                break;
            }
            iZza = zza(zzalcVar, bArr, iZzc, i4, zzahlVar);
            zzajgVar.add(zzahlVar.zzc);
        }
        return iZza;
    }

    static int zza(byte[] bArr, int i2, zzajg<?> zzajgVar, zzahl zzahlVar) throws IOException {
        zzajd zzajdVar = (zzajd) zzajgVar;
        int iZzc = zzc(bArr, i2, zzahlVar);
        int i3 = zzahlVar.zza + iZzc;
        while (iZzc < i3) {
            iZzc = zzc(bArr, iZzc, zzahlVar);
            zzajdVar.zzc(zzahlVar.zza);
        }
        if (iZzc == i3) {
            return iZzc;
        }
        throw zzajj.zzi();
    }

    static int zzb(byte[] bArr, int i2, zzahl zzahlVar) throws zzajj {
        int iZzc = zzc(bArr, i2, zzahlVar);
        int i3 = zzahlVar.zza;
        if (i3 < 0) {
            throw zzajj.zzf();
        }
        if (i3 == 0) {
            zzahlVar.zzc = "";
            return iZzc;
        }
        zzahlVar.zzc = zzaml.zzb(bArr, iZzc, i3);
        return iZzc + i3;
    }

    static int zza(int i2, byte[] bArr, int i3, int i4, zzame zzameVar, zzahl zzahlVar) throws zzajj {
        if ((i2 >>> 3) == 0) {
            throw zzajj.zzc();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int iZzd = zzd(bArr, i3, zzahlVar);
            zzameVar.zza(i2, Long.valueOf(zzahlVar.zzb));
            return iZzd;
        }
        if (i5 == 1) {
            zzameVar.zza(i2, Long.valueOf(zzd(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int iZzc = zzc(bArr, i3, zzahlVar);
            int i6 = zzahlVar.zza;
            if (i6 < 0) {
                throw zzajj.zzf();
            }
            if (i6 > bArr.length - iZzc) {
                throw zzajj.zzi();
            }
            if (i6 == 0) {
                zzameVar.zza(i2, zzahm.zza);
            } else {
                zzameVar.zza(i2, zzahm.zza(bArr, iZzc, i6));
            }
            return iZzc + i6;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                zzameVar.zza(i2, Integer.valueOf(zzc(bArr, i3)));
                return i3 + 4;
            }
            throw zzajj.zzc();
        }
        zzame zzameVarZzd = zzame.zzd();
        int i7 = (i2 & (-8)) | 4;
        int i8 = 0;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            int iZzc2 = zzc(bArr, i3, zzahlVar);
            int i9 = zzahlVar.zza;
            i8 = i9;
            if (i9 == i7) {
                i3 = iZzc2;
                break;
            }
            int iZza = zza(i8, bArr, iZzc2, i4, zzameVarZzd, zzahlVar);
            i8 = i9;
            i3 = iZza;
        }
        if (i3 > i4 || i8 != i7) {
            throw zzajj.zzg();
        }
        zzameVar.zza(i2, zzameVarZzd);
        return i3;
    }

    static int zzc(byte[] bArr, int i2, zzahl zzahlVar) {
        int i3 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzahlVar.zza = b;
            return i3;
        }
        return zza(b, bArr, i3, zzahlVar);
    }

    static int zza(int i2, byte[] bArr, int i3, zzahl zzahlVar) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b = bArr[i3];
        if (b >= 0) {
            zzahlVar.zza = i4 | (b << 7);
            return i5;
        }
        int i6 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i7 = i3 + 2;
        byte b2 = bArr[i5];
        if (b2 >= 0) {
            zzahlVar.zza = i6 | (b2 << 14);
            return i7;
        }
        int i8 = i6 | ((b2 & Byte.MAX_VALUE) << 14);
        int i9 = i3 + 3;
        byte b3 = bArr[i7];
        if (b3 >= 0) {
            zzahlVar.zza = i8 | (b3 << 21);
            return i9;
        }
        int i10 = i8 | ((b3 & Byte.MAX_VALUE) << 21);
        int i11 = i3 + 4;
        byte b4 = bArr[i9];
        if (b4 >= 0) {
            zzahlVar.zza = i10 | (b4 << 28);
            return i11;
        }
        while (true) {
            int i12 = i11 + 1;
            if (bArr[i11] >= 0) {
                zzahlVar.zza = i10 | ((b4 & Byte.MAX_VALUE) << 28);
                return i12;
            }
            i11 = i12;
        }
    }

    static int zza(int i2, byte[] bArr, int i3, int i4, zzajg<?> zzajgVar, zzahl zzahlVar) {
        zzajd zzajdVar = (zzajd) zzajgVar;
        int iZzc = zzc(bArr, i3, zzahlVar);
        zzajdVar.zzc(zzahlVar.zza);
        while (iZzc < i4) {
            int iZzc2 = zzc(bArr, iZzc, zzahlVar);
            if (i2 != zzahlVar.zza) {
                break;
            }
            iZzc = zzc(bArr, iZzc2, zzahlVar);
            zzajdVar.zzc(zzahlVar.zza);
        }
        return iZzc;
    }

    static int zzd(byte[] bArr, int i2, zzahl zzahlVar) {
        int i3 = i2 + 1;
        long j = bArr[i2];
        if (j >= 0) {
            zzahlVar.zzb = j;
            return i3;
        }
        int i4 = i2 + 2;
        byte b = bArr[i3];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i5 = 7;
        while (b < 0) {
            b = bArr[i4];
            i5 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i5;
            i4++;
        }
        zzahlVar.zzb = j2;
        return i4;
    }

    static int zza(Object obj, zzalc zzalcVar, byte[] bArr, int i2, int i3, int i4, zzahl zzahlVar) throws IOException {
        int iZza = ((zzako) zzalcVar).zza((zzako) obj, bArr, i2, i3, i4, zzahlVar);
        zzahlVar.zzc = obj;
        return iZza;
    }

    static int zza(Object obj, zzalc zzalcVar, byte[] bArr, int i2, int i3, zzahl zzahlVar) throws IOException {
        int iZza = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iZza = zza(i4, bArr, iZza, zzahlVar);
            i4 = zzahlVar.zza;
        }
        int i5 = iZza;
        if (i4 < 0 || i4 > i3 - i5) {
            throw zzajj.zzi();
        }
        int i6 = i4 + i5;
        zzalcVar.zza(obj, bArr, i5, i6, zzahlVar);
        zzahlVar.zzc = obj;
        return i6;
    }

    static int zza(int i2, byte[] bArr, int i3, int i4, zzahl zzahlVar) throws zzajj {
        if ((i2 >>> 3) == 0) {
            throw zzajj.zzc();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            return zzd(bArr, i3, zzahlVar);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return zzc(bArr, i3, zzahlVar) + zzahlVar.zza;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            throw zzajj.zzc();
        }
        int i6 = (i2 & (-8)) | 4;
        int i7 = 0;
        while (i3 < i4) {
            i3 = zzc(bArr, i3, zzahlVar);
            i7 = zzahlVar.zza;
            if (i7 == i6) {
                break;
            }
            i3 = zza(i7, bArr, i3, i4, zzahlVar);
        }
        if (i3 > i4 || i7 != i6) {
            throw zzajj.zzg();
        }
        return i3;
    }

    static long zzd(byte[] bArr, int i2) {
        return (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48) | ((bArr[i2 + 7] & 255) << 56);
    }
}
