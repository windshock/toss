package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzait {
    private static final zzair<?> zza = new zzaiq();
    private static final zzair<?> zzb = zzc();

    static zzair<?> zza() {
        zzair<?> zzairVar = zzb;
        if (zzairVar != null) {
            return zzairVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzair<?> zzb() {
        return zza;
    }

    private static zzair<?> zzc() {
        try {
            return (zzair) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
