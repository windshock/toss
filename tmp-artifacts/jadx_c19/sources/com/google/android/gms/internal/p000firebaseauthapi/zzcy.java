package com.google.android.gms.internal.p000firebaseauthapi;

import com.alibaba.griver.base.common.utils.HexStringUtil;
import com.google.android.gms.internal.p000firebaseauthapi.zzux;
import com.google.android.gms.internal.p000firebaseauthapi.zzvh;
import com.google.android.gms.internal.p000firebaseauthapi.zzvi;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzcy {
    private static final Charset zza = Charset.forName(HexStringUtil.DEFAULT_CHARSET_NAME);

    public static zzvi zza(zzvh zzvhVar) {
        zzvi.zza zzaVarZza = zzvi.zza().zza(zzvhVar.zzb());
        for (zzvh.zza zzaVar : zzvhVar.zze()) {
            zzaVarZza.zza((zzvi.zzb) ((zzaja) zzvi.zzb.zzb().zza(zzaVar.zzb().zzf()).zza(zzaVar.zzc()).zza(zzaVar.zzf()).zza(zzaVar.zza()).zzf()));
        }
        return (zzvi) ((zzaja) zzaVarZza.zzf());
    }

    public static void zzb(zzvh zzvhVar) throws GeneralSecurityException {
        int iZzb = zzvhVar.zzb();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzvh.zza zzaVar : zzvhVar.zze()) {
            if (zzaVar.zzc() == zzvb.ENABLED) {
                if (!zzaVar.zzg()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzaVar.zza())));
                }
                if (zzaVar.zzf() == zzvt.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzaVar.zza())));
                }
                if (zzaVar.zzc() == zzvb.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzaVar.zza())));
                }
                if (zzaVar.zza() == iZzb) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                if (zzaVar.zzb().zzb() != zzux.zzb.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i2++;
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
