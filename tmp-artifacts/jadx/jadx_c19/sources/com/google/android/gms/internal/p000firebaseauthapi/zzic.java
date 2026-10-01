package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzic {
    private static final Logger zza = Logger.getLogger(zzic.class.getName());
    private static final AtomicBoolean zzb = new AtomicBoolean(false);

    static Boolean zza() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            zza.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class zza {
        public static final zza zza;
        public static final zza zzb;
        private static final /* synthetic */ zza[] zzc;

        /* JADX WARN: Multi-variable type inference failed */
        static {
            zzie zzieVar = new zzie("ALGORITHM_NOT_FIPS");
            zza = zzieVar;
            zzif zzifVar = new zzif("ALGORITHM_REQUIRES_BORINGCRYPTO");
            zzb = zzifVar;
            zzc = new zza[]{zzieVar, zzifVar};
        }

        public abstract boolean zza();

        private zza(String str, int i2) {
        }

        public static zza[] values() {
            return (zza[]) zzc.clone();
        }
    }

    private zzic() {
    }

    public static boolean zzb() {
        return zzb.get();
    }
}
