package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzao;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzym implements zzadm<zzagy> {
    private final /* synthetic */ zzacf zza;
    private final /* synthetic */ zzyl zzb;

    zzym(zzyl zzylVar, zzacf zzacfVar) {
        this.zza = zzacfVar;
        this.zzb = zzylVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzadj
    public final void zza(@Nullable String str) {
        this.zza.zza(zzao.zza(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzagy zzagyVar) {
        zzagy zzagyVar2 = zzagyVar;
        if (zzagyVar2.zzf()) {
            this.zza.zza(new zzyi(zzagyVar2.zzc(), zzagyVar2.zze(), null));
        } else {
            this.zzb.zza(new zzafm(zzagyVar2.zzd(), zzagyVar2.zzb(), Long.valueOf(zzagyVar2.zza()), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
        }
    }
}
