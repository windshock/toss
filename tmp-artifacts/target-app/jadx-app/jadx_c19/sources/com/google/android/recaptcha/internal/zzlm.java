package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzlm {
    private static final zzlm zza = new zzlm(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzlm() {
        this(0, new int[8], new Object[8], true);
    }

    private zzlm(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzlm zzc() {
        return zza;
    }

    static zzlm zze(zzlm zzlmVar, zzlm zzlmVar2) {
        int i2 = zzlmVar.zzb + zzlmVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzlmVar.zzc, i2);
        System.arraycopy(zzlmVar2.zzc, 0, iArrCopyOf, zzlmVar.zzb, zzlmVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzlmVar.zzd, i2);
        System.arraycopy(zzlmVar2.zzd, 0, objArrCopyOf, zzlmVar.zzb, zzlmVar2.zzb);
        return new zzlm(i2, iArrCopyOf, objArrCopyOf, true);
    }

    static zzlm zzf() {
        return new zzlm(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i2) {
        int[] iArr = this.zzc;
        if (i2 > iArr.length) {
            int i3 = this.zzb;
            int i4 = i3 + (i3 / 2);
            if (i4 >= i2) {
                i2 = i4;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i2);
            this.zzd = Arrays.copyOf(this.zzd, i2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzlm)) {
            return false;
        }
        zzlm zzlmVar = (zzlm) obj;
        int i2 = this.zzb;
        if (i2 == zzlmVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzlmVar.zzc;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzlmVar.zzd;
                    int i4 = this.zzb;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (objArr[i5].equals(objArr2[i5])) {
                        }
                    }
                    return true;
                }
                if (iArr[i3] != iArr2[i3]) {
                    break;
                }
                i3++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzb;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        Object[] objArr = this.zzd;
        int i5 = this.zzb;
        for (int i6 = 0; i6 < i5; i6++) {
            iHashCode = (iHashCode * 31) + objArr[i6].hashCode();
        }
        return ((((i2 + 527) * 31) + i3) * 31) + iHashCode;
    }

    public final int zza() {
        int iZzz;
        int iZzy;
        int iZzy2;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i5 = this.zzc[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 == 1) {
                    iZzy2 = zzhh.zzy(i6 << 3) + 8;
                } else if (i7 == 2) {
                    int iZzd = ((zzgw) this.zzd[i4]).zzd();
                    iZzy2 = zzhh.zzy(i6 << 3) + zzhh.zzy(iZzd) + iZzd;
                } else if (i7 == 3) {
                    iZzz = ((zzlm) this.zzd[i4]).zza();
                    int iZzy3 = zzhh.zzy(i6 << 3);
                    iZzy = iZzy3 + iZzy3;
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(zzje.zza());
                    }
                    iZzy2 = zzhh.zzy(i6 << 3) + 4;
                }
                i3 += iZzy2;
            } else {
                iZzz = zzhh.zzz(((Long) this.zzd[i4]).longValue());
                iZzy = zzhh.zzy(i6 << 3);
            }
            iZzy2 = iZzz + iZzy;
            i3 += iZzy2;
        }
        this.zze = i3;
        return i3;
    }

    public final int zzb() {
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int iZzy = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int iZzd = ((zzgw) this.zzd[i3]).zzd();
            int iZzy2 = zzhh.zzy(iZzd);
            int iZzy3 = zzhh.zzy(16);
            int iZzy4 = zzhh.zzy(i4 >>> 3);
            int iZzy5 = zzhh.zzy(8);
            iZzy += iZzy5 + iZzy5 + iZzy3 + iZzy4 + zzhh.zzy(24) + iZzy2 + iZzd;
        }
        this.zze = iZzy;
        return iZzy;
    }

    final zzlm zzd(zzlm zzlmVar) {
        if (zzlmVar.equals(zza)) {
            return this;
        }
        zzg();
        int i2 = this.zzb + zzlmVar.zzb;
        zzm(i2);
        System.arraycopy(zzlmVar.zzc, 0, this.zzc, this.zzb, zzlmVar.zzb);
        System.arraycopy(zzlmVar.zzd, 0, this.zzd, this.zzb, zzlmVar.zzb);
        this.zzb = i2;
        return this;
    }

    final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zzi(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.zzb; i3++) {
            zzkg.zzb(sb, i2, String.valueOf(this.zzc[i3] >>> 3), this.zzd[i3]);
        }
    }

    final void zzj(int i2, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i3 = this.zzb;
        iArr[i3] = i2;
        this.zzd[i3] = obj;
        this.zzb = i3 + 1;
    }

    final void zzk(zzmd zzmdVar) throws IOException {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzmdVar.zzw(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    public final void zzl(zzmd zzmdVar) throws IOException {
        if (this.zzb != 0) {
            for (int i2 = 0; i2 < this.zzb; i2++) {
                int i3 = this.zzc[i2];
                Object obj = this.zzd[i2];
                int i4 = i3 & 7;
                int i5 = i3 >>> 3;
                if (i4 == 0) {
                    zzmdVar.zzt(i5, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zzmdVar.zzm(i5, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zzmdVar.zzd(i5, (zzgw) obj);
                } else if (i4 == 3) {
                    zzmdVar.zzF(i5);
                    ((zzlm) obj).zzl(zzmdVar);
                    zzmdVar.zzh(i5);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(zzje.zza());
                    }
                    zzmdVar.zzk(i5, ((Integer) obj).intValue());
                }
            }
        }
    }
}
