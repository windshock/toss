package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzlq {
    private static final byte[] zzn;
    private static final byte[] zzo;
    private static final byte[] zzp;
    public static final byte[] zza = zza(1, 0);
    private static final byte[] zzm = zza(1, 2);
    public static final byte[] zzb = zza(2, 32);
    public static final byte[] zzc = zza(2, 16);
    public static final byte[] zzd = zza(2, 17);
    public static final byte[] zze = zza(2, 18);
    public static final byte[] zzf = zza(2, 1);
    public static final byte[] zzg = zza(2, 2);
    public static final byte[] zzh = zza(2, 3);
    public static final byte[] zzi = zza(2, 1);
    public static final byte[] zzj = zza(2, 2);
    public static final byte[] zzk = zza(2, 3);
    public static final byte[] zzl = new byte[0];

    public static int zza(zzum zzumVar) throws GeneralSecurityException {
        int i2 = zzlp.zza[zzumVar.ordinal()];
        if (i2 == 1) {
            return 32;
        }
        if (i2 == 2) {
            return 48;
        }
        if (i2 == 3) {
            return 66;
        }
        if (i2 == 4) {
            return 32;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static int zzb(zzum zzumVar) throws GeneralSecurityException {
        int i2 = zzlp.zza[zzumVar.ordinal()];
        if (i2 == 1) {
            return 65;
        }
        if (i2 == 2) {
            return 97;
        }
        if (i2 == 3) {
            return 133;
        }
        if (i2 == 4) {
            return 32;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    static zzwq zzc(zzum zzumVar) throws GeneralSecurityException {
        int i2 = zzlp.zza[zzumVar.ordinal()];
        if (i2 == 1) {
            return zzwq.NIST_P256;
        }
        if (i2 == 2) {
            return zzwq.NIST_P384;
        }
        if (i2 == 3) {
            return zzwq.NIST_P521;
        }
        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
    }

    static {
        Charset charset = zzpg.zza;
        zzn = "KEM".getBytes(charset);
        zzo = "HPKE".getBytes(charset);
        zzp = "HPKE-v1".getBytes(charset);
    }

    static void zza(zzus zzusVar) throws GeneralSecurityException {
        if (zzusVar.zzc() == zzum.KEM_UNKNOWN || zzusVar.zzc() == zzum.UNRECOGNIZED) {
            throw new GeneralSecurityException("Invalid KEM param: " + zzusVar.zzc().name());
        }
        if (zzusVar.zzb() == zzuk.KDF_UNKNOWN || zzusVar.zzb() == zzuk.UNRECOGNIZED) {
            throw new GeneralSecurityException("Invalid KDF param: " + zzusVar.zzb().name());
        }
        if (zzusVar.zza() == zzuj.zza || zzusVar.zza() == zzuj.zze) {
            throw new GeneralSecurityException("Invalid AEAD param: " + zzusVar.zza().name());
        }
    }

    static byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return zzwi.zza(zzo, bArr, bArr2, bArr3);
    }

    private static byte[] zza(int i2, int i3) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) (i3 >> (((i2 - i4) - 1) * 8));
        }
        return bArr;
    }

    static byte[] zza(byte[] bArr) throws GeneralSecurityException {
        return zzwi.zza(zzn, bArr);
    }

    static byte[] zza(String str, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzwi.zza(zzp, bArr2, str.getBytes(zzpg.zza), bArr);
    }

    static byte[] zza(String str, byte[] bArr, byte[] bArr2, int i2) throws GeneralSecurityException {
        return zzwi.zza(zza(2, i2), zzp, bArr2, str.getBytes(zzpg.zza), bArr);
    }
}
