package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzcv {
    public static zzci zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzvd zzvdVarZza = zzvd.zza(bArr, zzaip.zza());
            zznv zznvVarZza = zznv.zza();
            zzos zzosVarZza = zzos.zza(zzvdVarZza);
            return !zznvVarZza.zzb(zzosVarZza) ? new zzne(zzosVarZza) : zznvVarZza.zza((zznv) zzosVarZza);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] zza(zzci zzciVar) throws GeneralSecurityException {
        if (zzciVar instanceof zzne) {
            return ((zzne) zzciVar).zzb().zza().zzj();
        }
        return ((zzos) zznv.zza().zza((zznv) zzciVar, zzos.class)).zza().zzj();
    }
}
