package com.google.firebase.auth;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.zzbo;
import com.google.firebase.auth.internal.zzcc;
import com.google.firebase.auth.internal.zzl;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzab extends zzbo<AuthResult> {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ FirebaseUser zzb;
    private final /* synthetic */ EmailAuthCredential zzc;
    private final /* synthetic */ FirebaseAuth zzd;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$zza, com.google.firebase.auth.internal.zzcc] */
    @Override // com.google.firebase.auth.internal.zzbo
    public final Task<AuthResult> zza(@Nullable String str) {
        TextUtils.isEmpty(str);
        return this.zza ? FirebaseAuth.zzc(this.zzd).zzb(FirebaseAuth.zza(this.zzd), (FirebaseUser) Preconditions.checkNotNull(this.zzb), this.zzc, str, (zzcc) new FirebaseAuth$zza(this.zzd)) : FirebaseAuth.zzc(this.zzd).zza(FirebaseAuth.zza(this.zzd), this.zzc, str, (zzl) new FirebaseAuth$zzb(this.zzd));
    }

    zzab(FirebaseAuth firebaseAuth, boolean z, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.zza = z;
        this.zzb = firebaseUser;
        this.zzc = emailAuthCredential;
        this.zzd = firebaseAuth;
    }
}
