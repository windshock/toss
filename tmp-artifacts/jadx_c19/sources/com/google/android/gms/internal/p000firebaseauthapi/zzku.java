package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzku {
    public static zzwq zza(zztx zztxVar) throws GeneralSecurityException {
        int i2 = zzkt.zzb[zztxVar.ordinal()];
        if (i2 == 1) {
            return zzwq.NIST_P256;
        }
        if (i2 == 2) {
            return zzwq.NIST_P384;
        }
        if (i2 == 3) {
            return zzwq.NIST_P521;
        }
        throw new GeneralSecurityException("unknown curve type: " + String.valueOf(zztxVar));
    }

    public static zzwp zza(zztj zztjVar) throws GeneralSecurityException {
        int i2 = zzkt.zzc[zztjVar.ordinal()];
        if (i2 == 1) {
            return zzwp.UNCOMPRESSED;
        }
        if (i2 == 2) {
            return zzwp.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        if (i2 == 3) {
            return zzwp.COMPRESSED;
        }
        throw new GeneralSecurityException("unknown point format: " + String.valueOf(zztjVar));
    }

    public static String zza(zzuc zzucVar) throws NoSuchAlgorithmException {
        int i2 = zzkt.zza[zzucVar.ordinal()];
        if (i2 == 1) {
            return "HmacSha1";
        }
        if (i2 == 2) {
            return "HmacSha224";
        }
        if (i2 == 3) {
            return "HmacSha256";
        }
        if (i2 == 4) {
            return "HmacSha384";
        }
        if (i2 == 5) {
            return "HmacSha512";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + String.valueOf(zzucVar));
    }

    public static void zza(zztp zztpVar) throws GeneralSecurityException {
        zzwn.zza(zza(zztpVar.zzf().zzd()));
        zza(zztpVar.zzf().zze());
        if (zztpVar.zza() == zztj.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        zzcu.zza(zztpVar.zzb().zzd());
    }
}
