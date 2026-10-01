package com.google.android.gms.internal.p000firebaseauthapi;

import java.math.BigInteger;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzxu {
    private final BigInteger zza;

    public static zzxu zza(BigInteger bigInteger, zzct zzctVar) {
        if (zzctVar != null) {
            return new zzxu(bigInteger);
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public final BigInteger zza(zzct zzctVar) {
        if (zzctVar == null) {
            throw new NullPointerException("SecretKeyAccess required");
        }
        return this.zza;
    }

    private zzxu(BigInteger bigInteger) {
        this.zza = bigInteger;
    }
}
