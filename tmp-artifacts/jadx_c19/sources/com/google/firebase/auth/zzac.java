package com.google.firebase.auth;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.zzbo;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzac extends zzbo<AuthResult> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ FirebaseUser zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ FirebaseAuth zzf;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.firebase.auth.FirebaseAuth$zza, com.google.firebase.auth.internal.zzcc] */
    @Override // com.google.firebase.auth.internal.zzbo
    public final Task<AuthResult> zza(@Nullable String str) {
        TextUtils.isEmpty(str);
        return this.zzb ? FirebaseAuth.zzc(this.zzf).zzb(FirebaseAuth.zza(this.zzf), (FirebaseUser) Preconditions.checkNotNull(this.zzc), this.zza, this.zzd, this.zze, str, new FirebaseAuth$zza(this.zzf)) : FirebaseAuth.zzc(this.zzf).zzb(FirebaseAuth.zza(this.zzf), this.zza, this.zzd, this.zze, str, new FirebaseAuth$zzb(this.zzf));
    }

    zzac(FirebaseAuth firebaseAuth, String str, boolean z, FirebaseUser firebaseUser, String str2, String str3) {
        this.zza = str;
        this.zzb = z;
        this.zzc = firebaseUser;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = firebaseAuth;
    }
}
