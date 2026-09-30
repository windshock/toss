package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzws implements zzbh {
    private final zzxk zza;
    private final zzcf zzb;
    private final int zzc;
    private final byte[] zzd;

    public static zzbh zza(zzdf zzdfVar) throws GeneralSecurityException {
        return new zzws(new zzwa(zzdfVar.zze().zza(zzbr.zza()), zzdfVar.zzc().zzd()), new zzxo(new zzxm("HMAC" + String.valueOf(zzdfVar.zzc().zzg()), new SecretKeySpec(zzdfVar.zzf().zza(zzbr.zza()), "HMAC")), zzdfVar.zzc().zze()), zzdfVar.zzc().zze(), zzdfVar.zzd().zzb());
    }

    private zzws(zzxk zzxkVar, zzcf zzcfVar, int i2, byte[] bArr) {
        this.zza = zzxkVar;
        this.zzb = zzcfVar;
        this.zzc = i2;
        this.zzd = bArr;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzbh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i2 = this.zzc;
        byte[] bArr3 = this.zzd;
        if (length < i2 + bArr3.length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzpg.zza(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, this.zzd.length, bArr.length - this.zzc);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.zzc, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.zzb.zza(bArrCopyOfRange2, zzwi.zza(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.zza.zza(bArrCopyOfRange);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzbh
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZzb = this.zza.zzb(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return zzwi.zza(this.zzd, bArrZzb, this.zzb.zza(zzwi.zza(bArr2, bArrZzb, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }
}
