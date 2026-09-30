package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzajn<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzajk> zza;

    public final zzajk zza() {
        return this.zza.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.zza.getValue() == null) {
            return null;
        }
        return zzajk.zza();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzakk)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return this.zza.getValue().zza((zzakk) obj);
    }

    private zzajn(Map.Entry<K, zzajk> entry) {
        this.zza = entry;
    }
}
