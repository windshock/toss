package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzrj implements zzcf {
    private static final byte[] zza = {0};
    private final zzcf zzb;
    private final zzvt zzc;
    private final byte[] zzd;

    public static zzcf zza(zznc zzncVar) throws GeneralSecurityException {
        byte[] bArrArray;
        zzot zzotVarZza = zzncVar.zza(zzbr.zza());
        zzcf zzcfVar = (zzcf) zzox.zza().zza((zzux) ((zzaja) zzux.zza().zza(zzotVarZza.zzf()).zza(zzotVarZza.zzd()).zza(zzotVarZza.zza()).zzf()), zzcf.class);
        zzvt zzvtVarZzc = zzotVarZza.zzc();
        int i2 = zzrm.zza[zzvtVarZzc.ordinal()];
        if (i2 == 1) {
            bArrArray = new byte[0];
        } else if (i2 == 2 || i2 == 3) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(zzncVar.zza().intValue()).array();
        } else {
            if (i2 != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(zzncVar.zza().intValue()).array();
        }
        return new zzrj(zzcfVar, zzvtVarZzc, bArrArray);
    }

    private zzrj(zzcf zzcfVar, zzvt zzvtVar, byte[] bArr) {
        this.zzb = zzcfVar;
        this.zzc = zzvtVar;
        this.zzd = bArr;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzcf
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 10) {
            throw new GeneralSecurityException("tag too short");
        }
        if (this.zzc.equals(zzvt.LEGACY)) {
            bArr2 = zzwi.zza(bArr2, zza);
        }
        byte[] bArr3 = new byte[0];
        if (!this.zzc.equals(zzvt.RAW)) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
            bArr3 = bArrCopyOf;
        }
        if (!Arrays.equals(this.zzd, bArr3)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        this.zzb.zza(bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzcf
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        if (this.zzc.equals(zzvt.LEGACY)) {
            bArr = zzwi.zza(bArr, zza);
        }
        return zzwi.zza(this.zzd, this.zzb.zza(bArr));
    }
}
