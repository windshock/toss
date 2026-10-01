package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p000firebaseauthapi.zzafm;
import com.google.firebase.auth.internal.zzl;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class FirebaseAuth$zzb implements zzl {
    private final /* synthetic */ FirebaseAuth zza;

    FirebaseAuth$zzb(FirebaseAuth firebaseAuth) {
        this.zza = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzl
    public final void zza(zzafm zzafmVar, FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(zzafmVar);
        Preconditions.checkNotNull(firebaseUser);
        firebaseUser.zza(zzafmVar);
        this.zza.zza(firebaseUser, zzafmVar, true);
    }
}
