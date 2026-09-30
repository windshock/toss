package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zziq extends zziu {
    private final int zza;
    private final zzb zzb;

    public final int zzb() {
        return this.zza;
    }

    public static final class zza {

        @Nullable
        private Integer zza;
        private zzb zzb;

        public final zza zza(int i2) throws GeneralSecurityException {
            if (i2 != 32 && i2 != 48 && i2 != 64) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i2)));
            }
            this.zza = Integer.valueOf(i2);
            return this;
        }

        public final zza zza(zzb zzbVar) {
            this.zzb = zzbVar;
            return this;
        }

        public final zziq zza() throws GeneralSecurityException {
            Integer num = this.zza;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            return new zziq(num.intValue(), this.zzb);
        }

        private zza() {
            this.zza = null;
            this.zzb = zzb.zzc;
        }
    }

    public final int hashCode() {
        int i2 = this.zza;
        return Objects.hash(zziq.class, Integer.valueOf(i2), this.zzb);
    }

    public static zza zzc() {
        return new zza();
    }

    public static final class zzb {
        public static final zzb zza = new zzb("TINK");
        public static final zzb zzb = new zzb("CRUNCHY");
        public static final zzb zzc = new zzb("NO_PREFIX");
        private final String zzd;

        public final String toString() {
            return this.zzd;
        }

        private zzb(String str) {
            this.zzd = str;
        }
    }

    public final zzb zzd() {
        return this.zzb;
    }

    public final String toString() {
        return "AesSiv Parameters (variant: " + String.valueOf(this.zzb) + ", " + this.zza + "-byte key)";
    }

    private zziq(int i2, zzb zzbVar) {
        this.zza = i2;
        this.zzb = zzbVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zziq)) {
            return false;
        }
        zziq zziqVar = (zziq) obj;
        return zziqVar.zza == this.zza && zziqVar.zzb == this.zzb;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzci
    public final boolean zza() {
        return this.zzb != zzb.zzc;
    }
}
