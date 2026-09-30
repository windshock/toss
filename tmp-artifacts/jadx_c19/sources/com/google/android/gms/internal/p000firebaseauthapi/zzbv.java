package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbv {

    @Nullable
    private final zzvd zza = null;

    @Nullable
    private final zzci zzb;

    public static zzbv zza(zzci zzciVar) throws GeneralSecurityException {
        return new zzbv(zzciVar);
    }

    final zzvd zza() throws GeneralSecurityException {
        zzci zzciVar = this.zzb;
        return zzciVar instanceof zzne ? ((zzne) zzciVar).zzb().zza() : ((zzos) zznv.zza().zza((zznv) this.zzb, zzos.class)).zza();
    }

    private zzbv(zzci zzciVar) {
        this.zzb = zzciVar;
    }
}
