package com.google.android.gms.internal.p000firebaseauthapi;

import java.lang.Enum;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzmi<E extends Enum<E>, O> {
    private Map<E, O> zza;
    private Map<O, E> zzb;

    public final zzmi<E, O> zza(E e, O o2) {
        this.zza.put(e, o2);
        this.zzb.put(o2, e);
        return this;
    }

    public final zzmf<E, O> zza() {
        return new zzmf<>(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb));
    }

    private zzmi() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }
}
