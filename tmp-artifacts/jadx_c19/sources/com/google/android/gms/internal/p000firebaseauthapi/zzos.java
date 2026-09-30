package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzos implements zzow {
    private final zzxr zza;
    private final zzvd zzb;

    public static zzos zza(zzvd zzvdVar) throws GeneralSecurityException {
        return new zzos(zzvdVar, zzpg.zza(zzvdVar.zzf()));
    }

    public static zzos zzb(zzvd zzvdVar) {
        return new zzos(zzvdVar, zzpg.zzb(zzvdVar.zzf()));
    }

    public final zzvd zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzow
    public final zzxr zzb() {
        return this.zza;
    }

    private zzos(zzvd zzvdVar, zzxr zzxrVar) {
        this.zzb = zzvdVar;
        this.zza = zzxrVar;
    }
}
