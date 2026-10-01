package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzfo extends zzdc {
    private final zza zza;

    public final int hashCode() {
        return Objects.hash(zzfo.class, this.zza);
    }

    public final zza zzb() {
        return this.zza;
    }

    public static zzfo zza(zza zzaVar) {
        return new zzfo(zzaVar);
    }

    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("CRUNCHY");
        public static final zza zzc = new zza("NO_PREFIX");
        private final String zzd;

        public final String toString() {
            return this.zzd;
        }

        private zza(String str) {
            this.zzd = str;
        }
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + String.valueOf(this.zza) + ")";
    }

    private zzfo(zza zzaVar) {
        this.zza = zzaVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzfo) && ((zzfo) obj).zza == this.zza;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzci
    public final boolean zza() {
        return this.zza != zza.zzc;
    }
}
