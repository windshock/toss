package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzakc<K, V> {
    static <K, V> int zza(zzakf<K, V> zzakfVar, K k, V v) {
        return zzais.zza(zzakfVar.zza, 1, k) + zzais.zza(zzakfVar.zzc, 2, v);
    }

    static <K, V> void zza(zzaii zzaiiVar, zzakf<K, V> zzakfVar, K k, V v) throws IOException {
        zzais.zza(zzaiiVar, zzakfVar.zza, 1, k);
        zzais.zza(zzaiiVar, zzakfVar.zzc, 2, v);
    }
}
