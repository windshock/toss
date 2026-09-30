package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzea extends zzdc {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final zzb zzd;

    public final int zzb() {
        return this.zzb;
    }

    public static final class zza {

        @Nullable
        private Integer zza;

        @Nullable
        private Integer zzb;

        @Nullable
        private Integer zzc;
        private zzb zzd;

        public final zza zza(int i2) throws GeneralSecurityException {
            if (i2 != 12 && i2 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i2)));
            }
            this.zzb = Integer.valueOf(i2);
            return this;
        }

        public final zza zzb(int i2) throws GeneralSecurityException {
            if (i2 != 16 && i2 != 24 && i2 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i2)));
            }
            this.zza = Integer.valueOf(i2);
            return this;
        }

        public final zza zzc(int i2) throws GeneralSecurityException {
            this.zzc = 16;
            return this;
        }

        public final zza zza(zzb zzbVar) {
            this.zzd = zzbVar;
            return this;
        }

        public final zzea zza() throws GeneralSecurityException {
            Integer num = this.zza;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.zzd == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.zzc == null) {
                throw new GeneralSecurityException("Tag size is not set");
            }
            return new zzea(num.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd);
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = zzb.zzc;
        }
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzc;
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

    public final int hashCode() {
        int i2 = this.zza;
        int i3 = this.zzb;
        int i4 = this.zzc;
        return Objects.hash(zzea.class, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), this.zzd);
    }

    public static zza zze() {
        return new zza();
    }

    public final zzb zzf() {
        return this.zzd;
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.zzd) + ", " + this.zzb + "-byte IV, " + this.zzc + "-byte tag, and " + this.zza + "-byte key)";
    }

    private zzea(int i2, int i3, int i4, zzb zzbVar) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = zzbVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzea)) {
            return false;
        }
        zzea zzeaVar = (zzea) obj;
        return zzeaVar.zza == this.zza && zzeaVar.zzb == this.zzb && zzeaVar.zzc == this.zzc && zzeaVar.zzd == this.zzd;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzci
    public final boolean zza() {
        return this.zzd != zzb.zzc;
    }
}
