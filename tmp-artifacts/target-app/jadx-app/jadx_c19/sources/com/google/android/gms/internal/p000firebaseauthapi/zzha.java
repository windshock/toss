package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzhd;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzha extends zzda {
    private final zzhd zza;
    private final zzxt zzb;
    private final zzxr zzc;

    @Nullable
    private final Integer zzd;

    public static zzha zza(zzhd.zza zzaVar, zzxt zzxtVar, @Nullable Integer num) throws GeneralSecurityException {
        zzxr zzxrVarZza;
        zzhd.zza zzaVar2 = zzhd.zza.zzc;
        if (zzaVar != zzaVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + String.valueOf(zzaVar) + " the value of idRequirement must be non-null");
        }
        if (zzaVar == zzaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzxtVar.zza() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzxtVar.zza());
        }
        zzhd zzhdVarZza = zzhd.zza(zzaVar);
        if (zzhdVarZza.zzb() == zzaVar2) {
            zzxrVarZza = zzxr.zza(new byte[0]);
        } else if (zzhdVarZza.zzb() == zzhd.zza.zzb) {
            zzxrVarZza = zzxr.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (zzhdVarZza.zzb() != zzhd.zza.zza) {
                throw new IllegalStateException("Unknown Variant: " + String.valueOf(zzhdVarZza.zzb()));
            }
            zzxrVarZza = zzxr.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new zzha(zzhdVarZza, zzxtVar, zzxrVarZza, num);
    }

    public final zzhd zzb() {
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

    private zzha(zzhd zzhdVar, zzxt zzxtVar, zzxr zzxrVar, @Nullable Integer num) {
        this.zza = zzhdVar;
        this.zzb = zzxtVar;
        this.zzc = zzxrVar;
        this.zzd = num;
    }
}
