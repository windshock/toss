package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzlw implements zzli {
    private final zzxr zza;
    private final zzxr zzb;

    static zzlw zza(byte[] bArr) throws GeneralSecurityException {
        return new zzlw(bArr, zzxp.zza(bArr));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzli
    public final zzxr zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzli
    public final zzxr zzb() {
        return this.zzb;
    }

    private zzlw(byte[] bArr, byte[] bArr2) {
        this.zza = zzxr.zza(bArr);
        this.zzb = zzxr.zza(bArr2);
    }
}
