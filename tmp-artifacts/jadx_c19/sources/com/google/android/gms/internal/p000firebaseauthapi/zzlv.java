package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzlv {
    private final zzbh zza;
    private final zzbq zzb;

    public zzlv(zzbh zzbhVar) {
        this.zza = zzbhVar;
        this.zzb = null;
    }

    public zzlv(zzbq zzbqVar) {
        this.zza = null;
        this.zzb = zzbqVar;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzbh zzbhVar = this.zza;
        if (zzbhVar != null) {
            return zzbhVar.zza(bArr, bArr2);
        }
        return this.zzb.zza(bArr, bArr2);
    }
}
