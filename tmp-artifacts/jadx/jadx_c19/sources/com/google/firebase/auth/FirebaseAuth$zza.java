package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p000firebaseauthapi.zzafm;
import com.google.firebase.auth.internal.zzl;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class FirebaseAuth$zza implements com.google.firebase.auth.internal.zzau, zzl {
    private final /* synthetic */ FirebaseAuth zza;

    FirebaseAuth$zza(FirebaseAuth firebaseAuth) {
        this.zza = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzl
    public final void zza(zzafm zzafmVar, FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(zzafmVar);
        Preconditions.checkNotNull(firebaseUser);
        firebaseUser.zza(zzafmVar);
        this.zza.zza(firebaseUser, zzafmVar, true, true);
    }

    @Override // com.google.firebase.auth.internal.zzau
    public final void zza(Status status) {
        if (status.getStatusCode() == 17011 || status.getStatusCode() == 17021 || status.getStatusCode() == 17005 || status.getStatusCode() == 17091) {
            this.zza.signOut();
        }
    }
}
