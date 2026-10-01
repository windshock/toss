package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.internal.zzbi;
import com.google.firebase.auth.internal.zzl;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzaar extends zzacw<GetTokenResult, zzl> {
    private final String zzy;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzadh
    public final String zza() {
        return "getAccessToken";
    }

    public zzaar(String str) {
        super(1);
        Preconditions.checkNotEmpty(str, "refresh token cannot be null");
        this.zzy = str;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacw
    public final void zzb() {
        if (TextUtils.isEmpty(this.zzj.zzd())) {
            this.zzj.zzc(this.zzy);
        }
        ((zzl) this.zze).zza(this.zzj, this.zzd);
        zzb(zzbi.zza(this.zzj.zzc()));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zzb(this.zzy, this.zzb);
    }
}
