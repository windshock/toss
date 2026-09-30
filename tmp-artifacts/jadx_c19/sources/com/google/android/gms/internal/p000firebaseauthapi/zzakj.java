package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzakj {
    private static final zzakh zza = zzc();
    private static final zzakh zzb = new zzakg();

    static zzakh zza() {
        return zza;
    }

    static zzakh zzb() {
        return zzb;
    }

    private static zzakh zzc() {
        try {
            return (zzakh) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
