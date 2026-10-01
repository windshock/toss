package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzao;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzyo implements zzadm<zzaen> {
    private final /* synthetic */ zzacf zza;
    private final /* synthetic */ zzyl zzb;

    zzyo(zzyl zzylVar, zzacf zzacfVar) {
        this.zza = zzacfVar;
        this.zzb = zzylVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzadj
    public final void zza(@Nullable String str) {
        this.zza.zza(zzao.zza(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzaen zzaenVar) {
        zzaen zzaenVar2 = zzaenVar;
        if (zzaenVar2.zzf()) {
            this.zza.zza(new zzyi(zzaenVar2.zzc(), zzaenVar2.zze(), null));
            return;
        }
        zzafm zzafmVar = new zzafm(zzaenVar2.zzd(), zzaenVar2.zzb(), Long.valueOf(zzaenVar2.zza()), "Bearer");
        zzyl zzylVar = this.zzb;
        boolean zZzg = zzaenVar2.zzg();
        zzylVar.zza(zzafmVar, null, null, Boolean.valueOf(zZzg), null, this.zza, this);
    }
}
