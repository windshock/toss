package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzpp;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzpi extends zzqp {
    private final zzpp zza;
    private final zzxt zzb;
    private final zzxr zzc;

    @Nullable
    private final Integer zzd;

    public static zza zzb() {
        return new zza();
    }

    public static final class zza {

        @Nullable
        private zzpp zza;

        @Nullable
        private zzxt zzb;

        @Nullable
        private Integer zzc;

        public final zza zza(zzxt zzxtVar) throws GeneralSecurityException {
            this.zzb = zzxtVar;
            return this;
        }

        public final zza zza(@Nullable Integer num) {
            this.zzc = num;
            return this;
        }

        public final zza zza(zzpp zzppVar) {
            this.zza = zzppVar;
            return this;
        }

        public final zzpi zza() throws GeneralSecurityException {
            zzxr zzxrVarZza;
            zzpp zzppVar = this.zza;
            if (zzppVar == null || this.zzb == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (zzppVar.zzc() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.zza.zza() && this.zzc != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zze() == zzpp.zzb.zzd) {
                zzxrVarZza = zzxr.zza(new byte[0]);
            } else if (this.zza.zze() == zzpp.zzb.zzc || this.zza.zze() == zzpp.zzb.zzb) {
                zzxrVarZza = zzxr.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
            } else if (this.zza.zze() == zzpp.zzb.zza) {
                zzxrVarZza = zzxr.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + String.valueOf(this.zza.zze()));
            }
            return new zzpi(this.zza, this.zzb, zzxrVarZza, this.zzc);
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzqp
    public final /* synthetic */ zzqs zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzqp
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

    private zzpi(zzpp zzppVar, zzxt zzxtVar, zzxr zzxrVar, @Nullable Integer num) {
        this.zza = zzppVar;
        this.zzb = zzxtVar;
        this.zzc = zzxrVar;
        this.zzd = num;
    }
}
