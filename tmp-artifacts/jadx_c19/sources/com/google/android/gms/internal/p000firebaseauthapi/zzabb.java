package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzl;
import com.google.firebase.auth.internal.zzz;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzabb extends zzacw<AuthResult, zzl> {
    private final zzyf zzy;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzadh
    public final String zza() {
        return "reauthenticateWithEmailLinkWithData";
    }

    public zzabb(EmailAuthCredential emailAuthCredential, @Nullable String str) {
        super(2);
        Preconditions.checkNotNull(emailAuthCredential, "credential cannot be null or empty");
        this.zzy = new zzyf(emailAuthCredential, str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacw
    public final void zzb() {
        zzaf zzafVarZza = zzaag.zza(this.zzc, this.zzk);
        if (this.zzd.getUid().equalsIgnoreCase(zzafVarZza.getUid())) {
            ((zzl) this.zze).zza(this.zzj, zzafVarZza);
            zzb(new zzz(zzafVarZza));
        } else {
            zza(new Status(17024));
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy, this.zzb);
    }
}
