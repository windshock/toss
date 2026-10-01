package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzame {
    private static final zzame zza = new zzame(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    public final int zza() {
        int iZze;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i5 = this.zzc[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                iZze = zzaii.zze(i6, ((Long) this.zzd[i4]).longValue());
            } else if (i7 == 1) {
                iZze = zzaii.zza(i6, ((Long) this.zzd[i4]).longValue());
            } else if (i7 == 2) {
                iZze = zzaii.zza(i6, (zzahm) this.zzd[i4]);
            } else if (i7 == 3) {
                iZze = (zzaii.zzg(i6) << 1) + ((zzame) this.zzd[i4]).zza();
            } else {
                if (i7 != 5) {
                    throw new IllegalStateException(zzajj.zza());
                }
                iZze = zzaii.zzb(i6, ((Integer) this.zzd[i4]).intValue());
            }
            i3 += iZze;
        }
        this.zze = i3;
        return i3;
    }

    public final int zzb() {
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int iZzb = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            iZzb += zzaii.zzb(this.zzc[i3] >>> 3, (zzahm) this.zzd[i3]);
        }
        this.zze = iZzb;
        return iZzb;
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

    public static zzame zzc() {
        return zza;
    }

    final zzame zza(zzame zzameVar) {
        if (zzameVar.equals(zza)) {
            return this;
        }
        zzf();
        int i2 = this.zzb + zzameVar.zzb;
        zza(i2);
        System.arraycopy(zzameVar.zzc, 0, this.zzc, this.zzb, zzameVar.zzb);
        System.arraycopy(zzameVar.zzd, 0, this.zzd, this.zzb, zzameVar.zzb);
        this.zzb = i2;
        return this;
    }

    static zzame zza(zzame zzameVar, zzame zzameVar2) {
        int i2 = zzameVar.zzb + zzameVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzameVar.zzc, i2);
        System.arraycopy(zzameVar2.zzc, 0, iArrCopyOf, zzameVar.zzb, zzameVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzameVar.zzd, i2);
        System.arraycopy(zzameVar2.zzd, 0, objArrCopyOf, zzameVar.zzb, zzameVar2.zzb);
        return new zzame(i2, iArrCopyOf, objArrCopyOf, true);
    }

    static zzame zzd() {
        return new zzame();
    }

    private zzame() {
        this(0, new int[8], new Object[8], true);
    }

    private zzame(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    private final void zza(int i2) {
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

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zza(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.zzb; i3++) {
            zzakp.zza(sb, i2, String.valueOf(this.zzc[i3] >>> 3), this.zzd[i3]);
        }
    }

    final void zza(int i2, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i3 = this.zzb;
        iArr[i3] = i2;
        this.zzd[i3] = obj;
        this.zzb = i3 + 1;
    }

    final void zza(zzanb zzanbVar) throws IOException {
        if (zzanbVar.zza() == zzana.zzb) {
            for (int i2 = this.zzb - 1; i2 >= 0; i2--) {
                zzanbVar.zza(this.zzc[i2] >>> 3, this.zzd[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < this.zzb; i3++) {
            zzanbVar.zza(this.zzc[i3] >>> 3, this.zzd[i3]);
        }
    }

    private static void zza(int i2, Object obj, zzanb zzanbVar) throws IOException {
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            zzanbVar.zzb(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 1) {
            zzanbVar.zza(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 2) {
            zzanbVar.zza(i3, (zzahm) obj);
            return;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                zzanbVar.zzb(i3, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzajj.zza());
        }
        if (zzanbVar.zza() == zzana.zza) {
            zzanbVar.zzb(i3);
            ((zzame) obj).zzb(zzanbVar);
            zzanbVar.zza(i3);
        } else {
            zzanbVar.zza(i3);
            ((zzame) obj).zzb(zzanbVar);
            zzanbVar.zzb(i3);
        }
    }

    public final void zzb(zzanb zzanbVar) throws IOException {
        if (this.zzb == 0) {
            return;
        }
        if (zzanbVar.zza() == zzana.zza) {
            for (int i2 = 0; i2 < this.zzb; i2++) {
                zza(this.zzc[i2], this.zzd[i2], zzanbVar);
            }
            return;
        }
        for (int i3 = this.zzb - 1; i3 >= 0; i3--) {
            zza(this.zzc[i3], this.zzd[i3], zzanbVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzame)) {
            return false;
        }
        zzame zzameVar = (zzame) obj;
        int i2 = this.zzb;
        if (i2 == zzameVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzameVar.zzc;
            int i3 = 0;
            while (true) {
                if (i3 < i2) {
                    if (iArr[i3] != iArr2[i3]) {
                        break;
                    }
                    i3++;
                } else {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzameVar.zzd;
                    int i4 = this.zzb;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (objArr[i5].equals(objArr2[i5])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
