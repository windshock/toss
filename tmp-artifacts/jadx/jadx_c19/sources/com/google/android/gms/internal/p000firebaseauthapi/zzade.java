package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzade implements Runnable {
    private final /* synthetic */ zzadd zza;
    private final /* synthetic */ zzacy zzb;

    zzade(zzacy zzacyVar, zzadd zzaddVar) {
        this.zza = zzaddVar;
        this.zzb = zzacyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb.zza.zzh) {
            if (!this.zzb.zza.zzh.isEmpty()) {
                this.zza.zza(this.zzb.zza.zzh.get(0), new Object[0]);
            }
        }
    }
}
