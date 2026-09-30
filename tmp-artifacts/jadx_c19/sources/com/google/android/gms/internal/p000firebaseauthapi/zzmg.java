package com.google.android.gms.internal.p000firebaseauthapi;

import java.math.BigInteger;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzmg {
    static final zzmg zza;
    BigInteger zzb;
    BigInteger zzc;
    BigInteger zzd;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        zza = new zzmg(bigInteger, bigInteger, BigInteger.ZERO);
    }

    zzmg(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zzb = bigInteger;
        this.zzc = bigInteger2;
        this.zzd = bigInteger3;
    }

    final boolean zza() {
        return this.zzd.equals(BigInteger.ZERO);
    }
}
