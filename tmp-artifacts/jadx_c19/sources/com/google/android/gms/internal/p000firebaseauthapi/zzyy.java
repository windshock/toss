package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzao;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzyy implements zzadm<zzaha> {
    private final /* synthetic */ zzacf zza;
    private final /* synthetic */ zzyl zzb;

    zzyy(zzyl zzylVar, zzacf zzacfVar) {
        this.zza = zzacfVar;
        this.zzb = zzylVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzadj
    public final void zza(@Nullable String str) {
        this.zza.zza(zzao.zza(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzaha zzahaVar) {
        zzaha zzahaVar2 = zzahaVar;
        zzafm zzafmVar = new zzafm(zzahaVar2.zzd(), zzahaVar2.zzb(), Long.valueOf(zzahaVar2.zza()), "Bearer");
        zzyl zzylVar = this.zzb;
        boolean zZzf = zzahaVar2.zzf();
        zzylVar.zza(zzafmVar, null, null, Boolean.valueOf(zZzf), null, this.zza, this);
    }
}
