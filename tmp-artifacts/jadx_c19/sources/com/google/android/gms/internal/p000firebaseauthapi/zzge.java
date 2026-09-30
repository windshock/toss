package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzge extends zzdc {
    private final String zza;

    public final int hashCode() {
        return Objects.hash(zzge.class, this.zza);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzci
    public final boolean zza() {
        return false;
    }

    public static zzge zza(String str) throws GeneralSecurityException {
        return new zzge(str);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.zza + ")";
    }

    private zzge(String str) {
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzge) {
            return ((zzge) obj).zza.equals(this.zza);
        }
        return false;
    }
}
