package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthProvider;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzadb implements zzadd {
    private final /* synthetic */ Status zza;

    zzadb(zzacy zzacyVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzadd
    public final void zza(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Object... objArr) {
        onVerificationStateChangedCallbacks.onVerificationFailed(zzach.zza(this.zza));
    }
}
