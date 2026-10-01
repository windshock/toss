package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.zzafm;
import com.google.firebase.auth.internal.zzl;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzaa implements com.google.firebase.auth.internal.zzau, zzl {
    private final /* synthetic */ FirebaseAuth zza;

    zzaa(FirebaseAuth firebaseAuth) {
        this.zza = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzl
    public final void zza(zzafm zzafmVar, FirebaseUser firebaseUser) {
        this.zza.zza(firebaseUser, zzafmVar, true, true);
    }

    @Override // com.google.firebase.auth.internal.zzau
    public final void zza(Status status) {
        int statusCode = status.getStatusCode();
        if (statusCode == 17011 || statusCode == 17021 || statusCode == 17005) {
            this.zza.signOut();
        }
    }
}
