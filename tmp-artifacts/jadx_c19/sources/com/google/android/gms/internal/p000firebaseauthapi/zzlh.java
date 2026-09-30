package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzlh {
    public static zzla zza(zzus zzusVar) throws GeneralSecurityException {
        if (zzusVar.zza() == zzuj.zzb) {
            return new zzkv(16);
        }
        if (zzusVar.zza() == zzuj.zzc) {
            return new zzkv(32);
        }
        if (zzusVar.zza() == zzuj.zzd) {
            return new zzky();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    public static zzld zzb(zzus zzusVar) {
        if (zzusVar.zzb() == zzuk.HKDF_SHA256) {
            return new zzkx("HmacSha256");
        }
        if (zzusVar.zzb() == zzuk.HKDF_SHA384) {
            return new zzkx("HmacSha384");
        }
        if (zzusVar.zzb() == zzuk.HKDF_SHA512) {
            return new zzkx("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }

    public static zzlg zzc(zzus zzusVar) throws GeneralSecurityException {
        if (zzusVar.zzc() == zzum.DHKEM_X25519_HKDF_SHA256) {
            return new zzlt(new zzkx("HmacSha256"));
        }
        if (zzusVar.zzc() == zzum.DHKEM_P256_HKDF_SHA256) {
            return zzls.zza(zzwq.NIST_P256);
        }
        if (zzusVar.zzc() == zzum.DHKEM_P384_HKDF_SHA384) {
            return zzls.zza(zzwq.NIST_P384);
        }
        if (zzusVar.zzc() == zzum.DHKEM_P521_HKDF_SHA512) {
            return zzls.zza(zzwq.NIST_P521);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }
}
