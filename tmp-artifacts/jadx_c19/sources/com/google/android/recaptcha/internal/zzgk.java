package com.google.android.recaptcha.internal;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzgk {
    static int zza(byte[] bArr, int i2, zzgj zzgjVar) throws zzje {
        int iZzi = zzi(bArr, i2, zzgjVar);
        int i3 = zzgjVar.zza;
        if (i3 < 0) {
            throw zzje.zzf();
        }
        if (i3 > bArr.length - iZzi) {
            throw zzje.zzj();
        }
        if (i3 == 0) {
            zzgjVar.zzc = zzgw.zzb;
            return iZzi;
        }
        zzgjVar.zzc = zzgw.zzm(bArr, iZzi, i3);
        return iZzi + i3;
    }

    static int zzb(byte[] bArr, int i2) {
        byte b = bArr[i2];
        return ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 1] & 255) << 8) | (b & 255) | ((bArr[i2 + 2] & 255) << 16);
    }

    static int zzc(zzkr zzkrVar, byte[] bArr, int i2, int i3, int i4, zzgj zzgjVar) throws IOException {
        Object objZze = zzkrVar.zze();
        int iZzm = zzm(objZze, zzkrVar, bArr, i2, i3, i4, zzgjVar);
        zzkrVar.zzf(objZze);
        zzgjVar.zzc = objZze;
        return iZzm;
    }

    static int zzd(zzkr zzkrVar, byte[] bArr, int i2, int i3, zzgj zzgjVar) throws IOException {
        Object objZze = zzkrVar.zze();
        int iZzn = zzn(objZze, zzkrVar, bArr, i2, i3, zzgjVar);
        zzkrVar.zzf(objZze);
        zzgjVar.zzc = objZze;
        return iZzn;
    }

    static int zze(zzkr zzkrVar, int i2, byte[] bArr, int i3, int i4, zzjb zzjbVar, zzgj zzgjVar) throws IOException {
        int iZzd = zzd(zzkrVar, bArr, i3, i4, zzgjVar);
        zzjbVar.add(zzgjVar.zzc);
        while (iZzd < i4) {
            int iZzi = zzi(bArr, iZzd, zzgjVar);
            if (i2 != zzgjVar.zza) {
                break;
            }
            iZzd = zzd(zzkrVar, bArr, iZzi, i4, zzgjVar);
            zzjbVar.add(zzgjVar.zzc);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i2, zzjb zzjbVar, zzgj zzgjVar) throws IOException {
        zziu zziuVar = (zziu) zzjbVar;
        int iZzi = zzi(bArr, i2, zzgjVar);
        int i3 = zzgjVar.zza + iZzi;
        while (iZzi < i3) {
            iZzi = zzi(bArr, iZzi, zzgjVar);
            zziuVar.zzg(zzgjVar.zza);
        }
        if (iZzi == i3) {
            return iZzi;
        }
        throw zzje.zzj();
    }

    static int zzg(byte[] bArr, int i2, zzgj zzgjVar) throws zzje {
        int iZzi = zzi(bArr, i2, zzgjVar);
        int i3 = zzgjVar.zza;
        if (i3 < 0) {
            throw zzje.zzf();
        }
        if (i3 == 0) {
            zzgjVar.zzc = "";
            return iZzi;
        }
        zzgjVar.zzc = new String(bArr, iZzi, i3, zzjc.zzb);
        return iZzi + i3;
    }

    static int zzh(int i2, byte[] bArr, int i3, int i4, zzlm zzlmVar, zzgj zzgjVar) throws zzje {
        if ((i2 >>> 3) == 0) {
            throw zzje.zzc();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int iZzl = zzl(bArr, i3, zzgjVar);
            zzlmVar.zzj(i2, Long.valueOf(zzgjVar.zzb));
            return iZzl;
        }
        if (i5 == 1) {
            zzlmVar.zzj(i2, Long.valueOf(zzp(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int iZzi = zzi(bArr, i3, zzgjVar);
            int i6 = zzgjVar.zza;
            if (i6 < 0) {
                throw zzje.zzf();
            }
            if (i6 > bArr.length - iZzi) {
                throw zzje.zzj();
            }
            if (i6 == 0) {
                zzlmVar.zzj(i2, zzgw.zzb);
            } else {
                zzlmVar.zzj(i2, zzgw.zzm(bArr, iZzi, i6));
            }
            return iZzi + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw zzje.zzc();
            }
            zzlmVar.zzj(i2, Integer.valueOf(zzb(bArr, i3)));
            return i3 + 4;
        }
        int i7 = (i2 & (-8)) | 4;
        zzlm zzlmVarZzf = zzlm.zzf();
        int i8 = 0;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            int iZzi2 = zzi(bArr, i3, zzgjVar);
            int i9 = zzgjVar.zza;
            i8 = i9;
            if (i9 == i7) {
                i3 = iZzi2;
                break;
            }
            int iZzh = zzh(i8, bArr, iZzi2, i4, zzlmVarZzf, zzgjVar);
            i8 = i9;
            i3 = iZzh;
        }
        if (i3 > i4 || i8 != i7) {
            throw zzje.zzg();
        }
        zzlmVar.zzj(i2, zzlmVarZzf);
        return i3;
    }

    static int zzi(byte[] bArr, int i2, zzgj zzgjVar) {
        int i3 = i2 + 1;
        byte b = bArr[i2];
        if (b < 0) {
            return zzj(b, bArr, i3, zzgjVar);
        }
        zzgjVar.zza = b;
        return i3;
    }

    static int zzj(int i2, byte[] bArr, int i3, zzgj zzgjVar) {
        byte b = bArr[i3];
        int i4 = i3 + 1;
        int i5 = i2 & 127;
        if (b >= 0) {
            zzgjVar.zza = i5 | (b << 7);
            return i4;
        }
        int i6 = i5 | ((b & Byte.MAX_VALUE) << 7);
        int i7 = i3 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzgjVar.zza = i6 | (b2 << 14);
            return i7;
        }
        int i8 = i6 | ((b2 & Byte.MAX_VALUE) << 14);
        int i9 = i3 + 3;
        byte b3 = bArr[i7];
        if (b3 >= 0) {
            zzgjVar.zza = i8 | (b3 << 21);
            return i9;
        }
        int i10 = i8 | ((b3 & Byte.MAX_VALUE) << 21);
        int i11 = i3 + 4;
        byte b4 = bArr[i9];
        if (b4 >= 0) {
            zzgjVar.zza = i10 | (b4 << 28);
            return i11;
        }
        while (true) {
            int i12 = i11 + 1;
            if (bArr[i11] >= 0) {
                zzgjVar.zza = i10 | ((b4 & Byte.MAX_VALUE) << 28);
                return i12;
            }
            i11 = i12;
        }
    }

    static int zzk(int i2, byte[] bArr, int i3, int i4, zzjb zzjbVar, zzgj zzgjVar) {
        zziu zziuVar = (zziu) zzjbVar;
        int iZzi = zzi(bArr, i3, zzgjVar);
        zziuVar.zzg(zzgjVar.zza);
        while (iZzi < i4) {
            int iZzi2 = zzi(bArr, iZzi, zzgjVar);
            if (i2 != zzgjVar.zza) {
                break;
            }
            iZzi = zzi(bArr, iZzi2, zzgjVar);
            zziuVar.zzg(zzgjVar.zza);
        }
        return iZzi;
    }

    static int zzl(byte[] bArr, int i2, zzgj zzgjVar) {
        long j = bArr[i2];
        int i3 = i2 + 1;
        if (j >= 0) {
            zzgjVar.zzb = j;
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
        zzgjVar.zzb = j2;
        return i4;
    }

    static int zzm(Object obj, zzkr zzkrVar, byte[] bArr, int i2, int i3, int i4, zzgj zzgjVar) throws IOException {
        int iZzc = ((zzkh) zzkrVar).zzc(obj, bArr, i2, i3, i4, zzgjVar);
        zzgjVar.zzc = obj;
        return iZzc;
    }

    static int zzn(Object obj, zzkr zzkrVar, byte[] bArr, int i2, int i3, zzgj zzgjVar) throws IOException {
        int iZzj = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iZzj = zzj(i4, bArr, iZzj, zzgjVar);
            i4 = zzgjVar.zza;
        }
        int i5 = iZzj;
        if (i4 < 0 || i4 > i3 - i5) {
            throw zzje.zzj();
        }
        int i6 = i4 + i5;
        zzkrVar.zzi(obj, bArr, i5, i6, zzgjVar);
        zzgjVar.zzc = obj;
        return i6;
    }

    static long zzp(byte[] bArr, int i2) {
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    static int zzo(int i2, byte[] bArr, int i3, int i4, zzgj zzgjVar) throws zzje {
        if ((i2 >>> 3) == 0) {
            throw zzje.zzc();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            return zzl(bArr, i3, zzgjVar);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return zzi(bArr, i3, zzgjVar) + zzgjVar.zza;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            throw zzje.zzc();
        }
        int i6 = (i2 & (-8)) | 4;
        int i7 = 0;
        while (i3 < i4) {
            i3 = zzi(bArr, i3, zzgjVar);
            i7 = zzgjVar.zza;
            if (i7 == i6) {
                break;
            }
            i3 = zzo(i7, bArr, i3, i4, zzgjVar);
        }
        if (i3 > i4 || i7 != i6) {
            throw zzje.zzg();
        }
        return i3;
    }
}
