package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzl;
import com.google.firebase.auth.internal.zzz;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzaau extends zzacw<AuthResult, zzl> {
    private final PhoneAuthCredential zzy;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzadh
    public final String zza() {
        return "linkPhoneAuthCredential";
    }

    public zzaau(PhoneAuthCredential phoneAuthCredential) {
        super(2);
        this.zzy = (PhoneAuthCredential) Preconditions.checkNotNull(phoneAuthCredential, "credential cannot be null");
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
        zzaceVar.zza(new zzxy(this.zzd.zze(), this.zzy), this.zzb);
    }
}
