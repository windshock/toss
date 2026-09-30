package com.google.firebase.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class FirebaseAuthWeakPasswordException extends FirebaseAuthInvalidCredentialsException {
    private final String zza;

    public final String getReason() {
        return this.zza;
    }

    public FirebaseAuthWeakPasswordException(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        super(str, str2);
        this.zza = str3;
    }
}
