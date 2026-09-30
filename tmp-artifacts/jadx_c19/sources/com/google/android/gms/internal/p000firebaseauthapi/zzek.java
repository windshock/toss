package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzer;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzek extends zzda {
    private final zzer zza;
    private final zzxt zzb;
    private final zzxr zzc;

    @Nullable
    private final Integer zzd;

    public static zza zzb() {
        return new zza();
    }

    public static final class zza {

        @Nullable
        private zzer zza;

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

        public final zza zza(zzer zzerVar) {
            this.zza = zzerVar;
            return this;
        }

        public final zzek zza() throws GeneralSecurityException {
            zzxr zzxrVarZza;
            zzer zzerVar = this.zza;
            if (zzerVar == null || this.zzb == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (zzerVar.zzc() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.zza.zza() && this.zzc != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zzf() == zzer.zzb.zzc) {
                zzxrVarZza = zzxr.zza(new byte[0]);
            } else if (this.zza.zzf() == zzer.zzb.zzb) {
                zzxrVarZza = zzxr.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
            } else if (this.zza.zzf() == zzer.zzb.zza) {
                zzxrVarZza = zzxr.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + String.valueOf(this.zza.zzf()));
            }
            return new zzek(this.zza, this.zzb, zzxrVarZza, this.zzc);
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }
    }

    public final zzer zzc() {
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

    private zzek(zzer zzerVar, zzxt zzxtVar, zzxr zzxrVar, @Nullable Integer num) {
        this.zza = zzerVar;
        this.zzb = zzxtVar;
        this.zzc = zzxrVar;
        this.zzd = num;
    }
}
