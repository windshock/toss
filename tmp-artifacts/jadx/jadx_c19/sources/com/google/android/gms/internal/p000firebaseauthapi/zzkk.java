package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzjx;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzkk extends zzkr {
    private final zzjx zza;
    private final zzxr zzb;
    private final zzxr zzc;

    @Nullable
    private final Integer zzd;

    public final zzjx zzb() {
        return this.zza;
    }

    public static zzkk zza(zzjx zzjxVar, zzxr zzxrVar, @Nullable Integer num) throws GeneralSecurityException {
        EllipticCurve curve;
        zzxr zzxrVarZza;
        zzjx.zzf zzfVarZzf = zzjxVar.zzf();
        zzjx.zzf zzfVar = zzjx.zzf.zzc;
        if (!zzfVarZzf.equals(zzfVar) && num == null) {
            throw new GeneralSecurityException("'idRequirement' must be non-null for " + String.valueOf(zzfVarZzf) + " variant.");
        }
        if (zzfVarZzf.equals(zzfVar) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
        zzjx.zzd zzdVarZze = zzjxVar.zze();
        int iZza = zzxrVar.zza();
        String str = "Encoded public key byte length for " + String.valueOf(zzdVarZze) + " must be %d, not " + iZza;
        zzjx.zzd zzdVar = zzjx.zzd.zza;
        if (zzdVarZze == zzdVar) {
            if (iZza != 65) {
                throw new GeneralSecurityException(String.format(str, 65));
            }
        } else if (zzdVarZze == zzjx.zzd.zzb) {
            if (iZza != 97) {
                throw new GeneralSecurityException(String.format(str, 97));
            }
        } else if (zzdVarZze == zzjx.zzd.zzc) {
            if (iZza != 133) {
                throw new GeneralSecurityException(String.format(str, 133));
            }
        } else {
            if (zzdVarZze != zzjx.zzd.zzd) {
                throw new GeneralSecurityException("Unable to validate public key length for " + String.valueOf(zzdVarZze));
            }
            if (iZza != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        if (zzdVarZze == zzdVar || zzdVarZze == zzjx.zzd.zzb || zzdVarZze == zzjx.zzd.zzc) {
            if (zzdVarZze == zzdVar) {
                curve = zzmd.zza.getCurve();
            } else if (zzdVarZze == zzjx.zzd.zzb) {
                curve = zzmd.zzb.getCurve();
            } else {
                if (zzdVarZze != zzjx.zzd.zzc) {
                    throw new IllegalArgumentException("Unable to determine NIST curve type for " + String.valueOf(zzdVarZze));
                }
                curve = zzmd.zzc.getCurve();
            }
            zzmd.zza(zzwn.zza(curve, zzwp.UNCOMPRESSED, zzxrVar.zzb()), curve);
        }
        zzjx.zzf zzfVarZzf2 = zzjxVar.zzf();
        if (zzfVarZzf2 == zzfVar) {
            zzxrVarZza = zzxr.zza(new byte[0]);
        } else {
            if (num == null) {
                throw new IllegalStateException("idRequirement must be non-null for HpkeParameters.Variant " + String.valueOf(zzfVarZzf2));
            }
            if (zzfVarZzf2 == zzjx.zzf.zzb) {
                zzxrVarZza = zzxr.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
            } else {
                if (zzfVarZzf2 != zzjx.zzf.zza) {
                    throw new IllegalStateException("Unknown HpkeParameters.Variant: " + String.valueOf(zzfVarZzf2));
                }
                zzxrVarZza = zzxr.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            }
        }
        return new zzkk(zzjxVar, zzxrVar, zzxrVarZza, num);
    }

    public final zzxr zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzbu
    @Nullable
    public final Integer zza() {
        return this.zzd;
    }

    private zzkk(zzjx zzjxVar, zzxr zzxrVar, zzxr zzxrVar2, @Nullable Integer num) {
        this.zza = zzjxVar;
        this.zzb = zzxrVar;
        this.zzc = zzxrVar2;
        this.zzd = num;
    }
}
