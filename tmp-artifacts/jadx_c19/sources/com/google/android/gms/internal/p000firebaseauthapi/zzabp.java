package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzl;
import com.google.firebase.auth.internal.zzz;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzabp extends zzacw<AuthResult, zzl> {
    private final zzyf zzy;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzadh
    public final String zza() {
        return "sendSignInLinkToEmail";
    }

    public zzabp(EmailAuthCredential emailAuthCredential, @Nullable String str) {
        super(2);
        Preconditions.checkNotNull(emailAuthCredential, "credential cannot be null");
        this.zzy = new zzyf(emailAuthCredential, str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacw
    public final void zzb() {
        zzaf zzafVarZza = zzaag.zza(this.zzc, this.zzk);
        ((zzl) this.zze).zza(this.zzj, zzafVarZza);
        zzb(new zzz(zzafVarZza));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy, this.zzb);
    }
}
