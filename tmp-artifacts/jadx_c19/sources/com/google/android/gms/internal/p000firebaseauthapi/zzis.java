package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzis {
    public static final String zza = "type.googleapis.com/google.crypto.tink.AesSivKey";

    @Deprecated
    private static final zzvv zzb = zzvv.zzb();

    @Deprecated
    private static final zzvv zzc = zzvv.zzb();

    static {
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws Throwable {
        zzix.zzc();
        if (zzic.zzb()) {
            return;
        }
        zzin.zza(true);
    }
}
