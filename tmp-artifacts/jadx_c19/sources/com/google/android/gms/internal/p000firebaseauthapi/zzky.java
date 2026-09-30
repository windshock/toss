package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzky implements zzla {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzla
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzla
    public final int zzb() {
        return 12;
    }

    zzky() {
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzla
    public final byte[] zzc() {
        return zzlq.zzk;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzla
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length != 32) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
        return new zzhr(bArr).zza(bArr2, bArr3, bArr4);
    }
}
