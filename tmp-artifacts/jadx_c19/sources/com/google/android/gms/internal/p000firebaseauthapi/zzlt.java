package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzlt implements zzlg {
    private final zzkx zza;

    zzlt(zzkx zzkxVar) {
        this.zza = zzkxVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzlg
    public final byte[] zza(byte[] bArr, zzli zzliVar) throws GeneralSecurityException {
        byte[] bArrZza = zzxp.zza(zzliVar.zza().zzb(), bArr);
        byte[] bArrZza2 = zzwi.zza(bArr, zzliVar.zzb().zzb());
        byte[] bArrZza3 = zzlq.zza(zzlq.zzb);
        zzkx zzkxVar = this.zza;
        return zzkxVar.zza(null, bArrZza, "eae_prk", bArrZza2, "shared_secret", bArrZza3, zzkxVar.zza());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzlg
    public final byte[] zza() throws GeneralSecurityException {
        if (Arrays.equals(this.zza.zzb(), zzlq.zzf)) {
            return zzlq.zzb;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
