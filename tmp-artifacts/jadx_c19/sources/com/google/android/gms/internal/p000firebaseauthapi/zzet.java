package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzfa;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzet extends zzda {
    private final zzfa zza;
    private final zzxt zzb;
    private final zzxr zzc;

    @Nullable
    private final Integer zzd;

    public static zza zzb() {
        return new zza();
    }

    public static final class zza {

        @Nullable
        private zzfa zza;

        @Nullable
        private zzxt zzb;

        @Nullable
        private Integer zzc;

        public final zza zza(@Nullable Integer num) {
            this.zzc = num;
            return this;
        }

        public final zza zza(zzxt zzxtVar) {
            this.zzb = zzxtVar;
            return this;
        }

        public final zza zza(zzfa zzfaVar) {
            this.zza = zzfaVar;
            return this;
        }

        public final zzet zza() throws GeneralSecurityException {
            zzxr zzxrVarZza;
            zzfa zzfaVar = this.zza;
            if (zzfaVar == null || this.zzb == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (zzfaVar.zzb() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.zza.zza() && this.zzc != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zzd() == zzfa.zzb.zzc) {
                zzxrVarZza = zzxr.zza(new byte[0]);
            } else if (this.zza.zzd() == zzfa.zzb.zzb) {
                zzxrVarZza = zzxr.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
            } else if (this.zza.zzd() == zzfa.zzb.zza) {
                zzxrVarZza = zzxr.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + String.valueOf(this.zza.zzd()));
            }
            return new zzet(this.zza, this.zzb, zzxrVarZza, this.zzc);
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }
    }

    public final zzfa zzc() {
        return this.zza;
    }

    public final zzxr zzd() {
        return this.zzc;
    }

    public final zzxt zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzbu
    @Nullable
    public final Integer zza() {
        return this.zzd;
    }

    private zzet(zzfa zzfaVar, zzxt zzxtVar, zzxr zzxrVar, @Nullable Integer num) {
        this.zza = zzfaVar;
        this.zzb = zzxtVar;
        this.zzc = zzxrVar;
        this.zzd = num;
    }
}
