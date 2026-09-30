package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
abstract class zzamb<T, B> {
    zzamb() {
    }

    abstract int zza(T t);

    abstract B zza();

    abstract T zza(T t, T t2);

    abstract void zza(B b, int i2, int i3);

    abstract void zza(B b, int i2, long j);

    abstract void zza(B b, int i2, zzahm zzahmVar);

    abstract void zza(B b, int i2, T t);

    abstract void zza(T t, zzanb zzanbVar) throws IOException;

    abstract boolean zza(zzald zzaldVar);

    abstract int zzb(T t);

    abstract void zzb(B b, int i2, long j);

    abstract void zzb(T t, zzanb zzanbVar) throws IOException;

    abstract void zzb(Object obj, B b);

    abstract B zzc(Object obj);

    abstract void zzc(Object obj, T t);

    abstract T zzd(Object obj);

    abstract T zze(B b);

    abstract void zzf(Object obj);

    final boolean zza(B b, zzald zzaldVar) throws IOException {
        int iZzd = zzaldVar.zzd();
        int i2 = iZzd >>> 3;
        int i3 = iZzd & 7;
        if (i3 == 0) {
            zzb(b, i2, zzaldVar.zzl());
            return true;
        }
        if (i3 == 1) {
            zza((zzamb<T, B>) b, i2, zzaldVar.zzk());
            return true;
        }
        if (i3 == 2) {
            zza((zzamb<T, B>) b, i2, zzaldVar.zzp());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw zzajj.zza();
            }
            zza((zzamb<T, B>) b, i2, zzaldVar.zzf());
            return true;
        }
        B bZza = zza();
        while (zzaldVar.zzc() != Integer.MAX_VALUE && zza((zzamb<T, B>) bZza, zzaldVar)) {
        }
        if ((4 | (i2 << 3)) != zzaldVar.zzd()) {
            throw zzajj.zzb();
        }
        zza((zzamb<T, B>) b, i2, (int) zze(bZza));
        return true;
    }
}
