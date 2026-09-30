package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzct {
    private static final zzct zza = new zzct();

    static zzct zza() {
        return zza;
    }

    public static zzct zza(@Nullable zzct zzctVar) throws GeneralSecurityException {
        if (zzctVar != null) {
            return zzctVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }

    private zzct() {
    }
}
