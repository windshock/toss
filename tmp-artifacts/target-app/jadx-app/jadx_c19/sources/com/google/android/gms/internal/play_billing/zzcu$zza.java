package com.google.android.gms.internal.play_billing;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzcu$zza {
    static final zzcu$zza zza;
    static final zzcu$zza zzb;
    final boolean zzc;
    final Throwable zzd;

    static {
        if (zzcv.zzc) {
            zzb = null;
            zza = null;
        } else {
            zzb = new zzcu$zza(false, null);
            zza = new zzcu$zza(true, null);
        }
    }

    zzcu$zza(boolean z, Throwable th) {
        this.zzc = z;
        this.zzd = th;
    }
}
