package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzic;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzwg implements zzbh {
    private static final zzic.zza zza = zzic.zza.zzb;
    private final zzhn zzb;
    private final byte[] zzc;

    public static zzbh zza(zzek zzekVar) throws GeneralSecurityException {
        if (zzekVar.zzc().zzb() != 12) {
            throw new GeneralSecurityException("Expected IV Size 12, got " + zzekVar.zzc().zzb());
        }
        if (zzekVar.zzc().zzd() == 16) {
            return new zzwg(zzekVar.zze().zza(zzbr.zza()), zzekVar.zzd());
        }
        throw new GeneralSecurityException("Expected tag Size 16, got " + zzekVar.zzc().zzd());
    }

    private zzwg(byte[] bArr, zzxr zzxrVar) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzb = new zzhn(bArr, true);
        this.zzc = zzxrVar.zzb();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzbh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzc;
        if (bArr3.length == 0) {
            return this.zzb.zza(Arrays.copyOf(bArr, 12), bArr, bArr2);
        }
        if (!zzpg.zza(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, this.zzc.length, bArr.length);
        return this.zzb.zza(Arrays.copyOf(bArrCopyOfRange, 12), bArrCopyOfRange, bArr2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzbh
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZza = zzov.zza(12);
        byte[] bArr3 = this.zzc;
        if (bArr3.length == 0) {
            return this.zzb.zzb(bArrZza, bArr, bArr2);
        }
        return zzwi.zza(bArr3, this.zzb.zzb(bArrZza, bArr, bArr2));
    }
}
