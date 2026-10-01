package com.google.firebase.auth;

import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class FirebaseAuthUserCollisionException extends FirebaseAuthException {
    private AuthCredential zza;
    private String zzb;
    private String zzc;

    public final AuthCredential getUpdatedCredential() {
        return this.zza;
    }

    public final FirebaseAuthUserCollisionException zza(@NonNull AuthCredential authCredential) {
        this.zza = authCredential;
        return this;
    }

    public final FirebaseAuthUserCollisionException zza(@NonNull String str) {
        this.zzb = str;
        return this;
    }

    public final FirebaseAuthUserCollisionException zzb(@NonNull String str) {
        this.zzc = str;
        return this;
    }

    public final String getEmail() {
        return this.zzb;
    }

    public FirebaseAuthUserCollisionException(@NonNull String str, @NonNull String str2) {
        super(str, str2);
    }
}
