package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzqq {
    private static final String zza = "type.googleapis.com/google.crypto.tink.HmacKey";

    @Deprecated
    private static final zzvv zzb;

    @Deprecated
    private static final zzvv zzc;

    @Deprecated
    private static final zzvv zzd;

    static {
        zzvv zzvvVarZzb = zzvv.zzb();
        zzb = zzvvVarZzb;
        zzc = zzvvVarZzb;
        zzd = zzvvVarZzb;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws Throwable {
        zzqr.zzc();
        zzqa.zzc();
        zzqe.zza(true);
        if (zzic.zzb()) {
            return;
        }
        zzpm.zza(true);
    }
}
