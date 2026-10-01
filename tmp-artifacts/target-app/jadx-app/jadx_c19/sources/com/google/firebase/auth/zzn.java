package com.google.firebase.auth;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.zzbo;
import com.google.firebase.auth.internal.zzcc;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzn extends zzbo<AuthResult> {
    private final /* synthetic */ FirebaseUser zza;
    private final /* synthetic */ EmailAuthCredential zzb;
    private final /* synthetic */ FirebaseAuth zzc;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$zza, com.google.firebase.auth.internal.zzcc] */
    @Override // com.google.firebase.auth.internal.zzbo
    public final Task<AuthResult> zza(@Nullable String str) {
        TextUtils.isEmpty(str);
        return FirebaseAuth.zzc(this.zzc).zza(FirebaseAuth.zza(this.zzc), this.zza, (AuthCredential) this.zzb, str, (zzcc) new FirebaseAuth$zza(this.zzc));
    }

    zzn(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.zza = firebaseUser;
        this.zzb = emailAuthCredential;
        this.zzc = firebaseAuth;
    }
}
