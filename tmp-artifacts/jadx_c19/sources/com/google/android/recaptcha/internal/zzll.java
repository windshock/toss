package com.google.android.recaptcha.internal;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
abstract class zzll {
    zzll() {
    }

    abstract int zza(Object obj);

    abstract int zzb(Object obj);

    abstract Object zzc(Object obj);

    abstract Object zzd(Object obj);

    abstract Object zze(Object obj, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract void zzh(Object obj, int i2, int i3);

    abstract void zzi(Object obj, int i2, long j);

    abstract void zzj(Object obj, int i2, Object obj2);

    abstract void zzk(Object obj, int i2, zzgw zzgwVar);

    abstract void zzl(Object obj, int i2, long j);

    abstract void zzm(Object obj);

    abstract void zzn(Object obj, Object obj2);

    abstract void zzo(Object obj, Object obj2);

    abstract void zzp(Object obj, zzmd zzmdVar) throws IOException;

    abstract void zzq(Object obj, zzmd zzmdVar) throws IOException;

    abstract boolean zzs(zzkq zzkqVar);

    final boolean zzr(Object obj, zzkq zzkqVar) throws IOException {
        int iZzd = zzkqVar.zzd();
        int i2 = iZzd >>> 3;
        int i3 = iZzd & 7;
        if (i3 == 0) {
            zzl(obj, i2, zzkqVar.zzl());
            return true;
        }
        if (i3 == 1) {
            zzi(obj, i2, zzkqVar.zzk());
            return true;
        }
        if (i3 == 2) {
            zzk(obj, i2, zzkqVar.zzp());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw zzje.zza();
            }
            zzh(obj, i2, zzkqVar.zzf());
            return true;
        }
        Object objZzf = zzf();
        while (zzkqVar.zzc() != Integer.MAX_VALUE && zzr(objZzf, zzkqVar)) {
        }
        if ((4 | (i2 << 3)) != zzkqVar.zzd()) {
            throw zzje.zzb();
        }
        zzg(objZzf);
        zzj(obj, i2, objZzf);
        return true;
    }
}
