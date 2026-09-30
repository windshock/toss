package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzfo;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzfl extends zzda {
    private final zzfo zza;
    private final zzxt zzb;
    private final zzxr zzc;

    @Nullable
    private final Integer zzd;

    public static zzfl zza(zzfo.zza zzaVar, zzxt zzxtVar, @Nullable Integer num) throws GeneralSecurityException {
        zzxr zzxrVarZza;
        zzfo.zza zzaVar2 = zzfo.zza.zzc;
        if (zzaVar != zzaVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + String.valueOf(zzaVar) + " the value of idRequirement must be non-null");
        }
        if (zzaVar == zzaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzxtVar.zza() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzxtVar.zza());
        }
        zzfo zzfoVarZza = zzfo.zza(zzaVar);
        if (zzfoVarZza.zzb() == zzaVar2) {
            zzxrVarZza = zzxr.zza(new byte[0]);
        } else if (zzfoVarZza.zzb() == zzfo.zza.zzb) {
            zzxrVarZza = zzxr.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (zzfoVarZza.zzb() != zzfo.zza.zza) {
                throw new IllegalStateException("Unknown Variant: " + String.valueOf(zzfoVarZza.zzb()));
            }
            zzxrVarZza = zzxr.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new zzfl(zzfoVarZza, zzxtVar, zzxrVarZza, num);
    }

    public final zzfo zzb() {
        return this.zza;
    }

    public final zzxr zzc() {
        return this.zzc;
    }

    public final zzxt zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzbu
    @Nullable
    public final Integer zza() {
        return this.zzd;
    }

    private zzfl(zzfo zzfoVar, zzxt zzxtVar, zzxr zzxrVar, @Nullable Integer num) {
        this.zza = zzfoVar;
        this.zzb = zzxtVar;
        this.zzc = zzxrVar;
        this.zzd = num;
    }
}
