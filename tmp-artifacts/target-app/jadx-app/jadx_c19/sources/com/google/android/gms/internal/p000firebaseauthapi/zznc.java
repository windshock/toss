package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zznc extends zzbu {
    private final zzot zza;

    public final zzot zza(@Nullable zzct zzctVar) throws GeneralSecurityException {
        zza(this.zza, zzctVar);
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzbu
    @Nullable
    public final Integer zza() {
        return this.zza.zze();
    }

    public zznc(zzot zzotVar, @Nullable zzct zzctVar) throws GeneralSecurityException {
        zza(zzotVar, zzctVar);
        this.zza = zzotVar;
    }

    private static void zza(zzot zzotVar, @Nullable zzct zzctVar) throws GeneralSecurityException {
        int i2 = zznf.zza[zzotVar.zza().ordinal()];
        if (i2 == 1 || i2 == 2) {
            zzct.zza(zzctVar);
        }
    }
}
