package com.google.android.gms.internal.play_billing;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzcu$zzb<V> implements Runnable {
    final zzcu<V> zza;
    final zzdk<? extends V> zzb;

    zzcu$zzb(zzcu zzcuVar, zzdk zzdkVar) {
        this.zza = zzcuVar;
        this.zzb = zzdkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((zzcv) this.zza).valueField != this) {
            return;
        }
        if (zzcv.zzq(this.zza, this, zzcu.zza(this.zzb))) {
            zzcu.zzf(this.zza, false);
        }
    }
}
