package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzzc implements zzadm<zzaha> {
    private final /* synthetic */ zzadm zza;
    private final /* synthetic */ zzzd zzb;

    zzzc(zzzd zzzdVar, zzadm zzadmVar) {
        this.zza = zzadmVar;
        this.zzb = zzzdVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzadj
    public final void zza(@Nullable String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzaha zzahaVar) {
        zzaha zzahaVar2 = zzahaVar;
        if (!TextUtils.isEmpty(zzahaVar2.zze())) {
            this.zzb.zza.zza(new Status(17025), PhoneAuthCredential.zzb(zzahaVar2.zzc(), zzahaVar2.zze()));
            return;
        }
        zzafm zzafmVar = new zzafm(zzahaVar2.zzd(), zzahaVar2.zzb(), Long.valueOf(zzahaVar2.zza()), "Bearer");
        zzyl zzylVar = this.zzb.zzb;
        boolean zZzf = zzahaVar2.zzf();
        zzylVar.zza(zzafmVar, null, "phone", Boolean.valueOf(zZzf), null, this.zzb.zza, this.zza);
    }
}
