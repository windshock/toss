package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzaeg extends zzaft {
    private final String zza;
    private final String zzb;

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaft
    final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaft
    final String zzb() {
        return this.zza;
    }

    public final String toString() {
        return "RecaptchaEnforcementState{provider=" + this.zza + ", enforcementState=" + this.zzb + "}";
    }

    zzaeg(@Nullable String str, @Nullable String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaft)) {
            return false;
        }
        zzaft zzaftVar = (zzaft) obj;
        String str = this.zza;
        if (str == null) {
            if (zzaftVar.zzb() != null) {
                return false;
            }
        } else if (!str.equals(zzaftVar.zzb())) {
            return false;
        }
        String str2 = this.zzb;
        if (str2 == null) {
            if (zzaftVar.zza() != null) {
                return false;
            }
        } else if (!str2.equals(zzaftVar.zza())) {
            return false;
        }
        return true;
    }
}
