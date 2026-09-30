package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzqi extends zzoi<zzcf, zzue> {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzoi
    public final /* synthetic */ zzcf zza(zzakk zzakkVar) throws GeneralSecurityException {
        zzue zzueVar = (zzue) zzakkVar;
        zzuc zzucVarZzb = zzueVar.zze().zzb();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzueVar.zzf().zzg(), "HMAC");
        int iZza = zzueVar.zze().zza();
        int i2 = zzqk.zza[zzucVarZzb.ordinal()];
        if (i2 == 1) {
            return new zzxo(new zzxm("HMACSHA1", secretKeySpec), iZza);
        }
        if (i2 == 2) {
            return new zzxo(new zzxm("HMACSHA224", secretKeySpec), iZza);
        }
        if (i2 == 3) {
            return new zzxo(new zzxm("HMACSHA256", secretKeySpec), iZza);
        }
        if (i2 == 4) {
            return new zzxo(new zzxm("HMACSHA384", secretKeySpec), iZza);
        }
        if (i2 == 5) {
            return new zzxo(new zzxm("HMACSHA512", secretKeySpec), iZza);
        }
        throw new GeneralSecurityException("unknown hash");
    }

    zzqi(Class cls) {
        super(cls);
    }
}
