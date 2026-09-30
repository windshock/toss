package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzqm extends zzqs {
    private final int zza;
    private final int zzb;
    private final zzc zzc;
    private final zzb zzd;

    public final int zzb() {
        return this.zzb;
    }

    public static final class zza {

        @Nullable
        private Integer zza;

        @Nullable
        private Integer zzb;
        private zzb zzc;
        private zzc zzd;

        public final zza zza(zzb zzbVar) {
            this.zzc = zzbVar;
            return this;
        }

        public final zza zza(int i2) throws GeneralSecurityException {
            this.zza = Integer.valueOf(i2);
            return this;
        }

        public final zza zzb(int i2) throws GeneralSecurityException {
            this.zzb = Integer.valueOf(i2);
            return this;
        }

        public final zza zza(zzc zzcVar) {
            this.zzd = zzcVar;
            return this;
        }

        public final zzqm zza() throws GeneralSecurityException {
            Integer num = this.zza;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.zzc == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.zzd == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.zza));
            }
            Integer num2 = this.zzb;
            int iIntValue = num2.intValue();
            zzb zzbVar = this.zzc;
            if (iIntValue < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
            }
            if (zzbVar == zzb.zza) {
                if (iIntValue > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
                }
            } else if (zzbVar == zzb.zzb) {
                if (iIntValue > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
                }
            } else if (zzbVar == zzb.zzc) {
                if (iIntValue > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
                }
            } else if (zzbVar == zzb.zzd) {
                if (iIntValue > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
                }
            } else {
                if (zzbVar != zzb.zze) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (iIntValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
                }
            }
            return new zzqm(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc);
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = zzc.zzd;
        }
    }

    public final int zzc() {
        return this.zza;
    }

    private final int zzg() {
        zzc zzcVar = this.zzc;
        if (zzcVar == zzc.zzd) {
            return this.zzb;
        }
        if (zzcVar == zzc.zza || zzcVar == zzc.zzb || zzcVar == zzc.zzc) {
            int i2 = this.zzb;
            return i2 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public static final class zzc {
        public static final zzc zza = new zzc("TINK");
        public static final zzc zzb = new zzc("CRUNCHY");
        public static final zzc zzc = new zzc("LEGACY");
        public static final zzc zzd = new zzc("NO_PREFIX");
        private final String zze;

        public final String toString() {
            return this.zze;
        }

        private zzc(String str) {
            this.zze = str;
        }
    }

    public static final class zzb {
        public static final zzb zza = new zzb("SHA1");
        public static final zzb zzb = new zzb("SHA224");
        public static final zzb zzc = new zzb("SHA256");
        public static final zzb zzd = new zzb("SHA384");
        public static final zzb zze = new zzb("SHA512");
        private final String zzf;

        public final String toString() {
            return this.zzf;
        }

        private zzb(String str) {
            this.zzf = str;
        }
    }

    public final int hashCode() {
        int i2 = this.zza;
        int i3 = this.zzb;
        return Objects.hash(zzqm.class, Integer.valueOf(i2), Integer.valueOf(i3), this.zzc, this.zzd);
    }

    public static zza zzd() {
        return new zza();
    }

    public final zzb zze() {
        return this.zzd;
    }

    public final zzc zzf() {
        return this.zzc;
    }

    public final String toString() {
        return "HMAC Parameters (variant: " + String.valueOf(this.zzc) + ", hashType: " + String.valueOf(this.zzd) + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    private zzqm(int i2, int i3, zzc zzcVar, zzb zzbVar) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = zzcVar;
        this.zzd = zzbVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqm)) {
            return false;
        }
        zzqm zzqmVar = (zzqm) obj;
        return zzqmVar.zza == this.zza && zzqmVar.zzg() == zzg() && zzqmVar.zzc == this.zzc && zzqmVar.zzd == this.zzd;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzci
    public final boolean zza() {
        return this.zzc != zzc.zzd;
    }
}
