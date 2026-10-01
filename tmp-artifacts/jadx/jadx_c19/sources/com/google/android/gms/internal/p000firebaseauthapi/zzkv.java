package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzkv implements zzla {
    private final int zza;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzla
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzla
    public final int zzb() {
        return 12;
    }

    zzkv(int i2) throws InvalidAlgorithmParameterException {
        if (i2 != 16 && i2 != 32) {
            throw new InvalidAlgorithmParameterException("Unsupported key length: " + i2);
        }
        this.zza = i2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzla
    public final byte[] zzc() throws GeneralSecurityException {
        int i2 = this.zza;
        if (i2 == 16) {
            return zzlq.zzi;
        }
        if (i2 == 32) {
            return zzlq.zzj;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzla
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length != this.zza) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: " + bArr.length);
        }
        return new zzhn(bArr, false).zza(bArr2, bArr3, bArr4);
    }
}
