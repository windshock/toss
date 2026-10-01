package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzaku {
    private static final zzaks zza = zzc();
    private static final zzaks zzb = new zzakv();

    static zzaks zza() {
        return zza;
    }

    static zzaks zzb() {
        return zzb;
    }

    private static zzaks zzc() {
        try {
            return (zzaks) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
