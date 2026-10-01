package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzic;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzxm implements zzrv {
    private static final zzic.zza zza = zzic.zza.zzb;
    private final ThreadLocal<Mac> zzb;
    private final String zzc;
    private final Key zzd;
    private final int zze;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzxm(String str, Key key) throws GeneralSecurityException {
        char c;
        zzxl zzxlVar = new zzxl(this);
        this.zzb = zzxlVar;
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzc = str;
        this.zzd = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1823053428:
                if (!str.equals("HMACSHA1")) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    c = 1;
                    break;
                }
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    c = 2;
                    break;
                }
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    c = 3;
                    break;
                }
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    c = 4;
                    break;
                }
                break;
        }
        if (c == 0) {
            this.zze = 20;
        } else if (c == 1) {
            this.zze = 28;
        } else if (c == 2) {
            this.zze = 32;
        } else if (c == 3) {
            this.zze = 48;
        } else {
            if (c != 4) {
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
            }
            this.zze = 64;
        }
        zzxlVar.get();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzrv
    public final byte[] zza(byte[] bArr, int i2) throws IllegalStateException, GeneralSecurityException {
        if (i2 > this.zze) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.zzb.get().update(bArr);
        return Arrays.copyOf(this.zzb.get().doFinal(), i2);
    }
}
