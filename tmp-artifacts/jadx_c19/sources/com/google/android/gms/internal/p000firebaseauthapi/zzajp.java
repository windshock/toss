package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzajp<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zza;

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.zza.next();
        return next.getValue() instanceof zzajk ? new zzajn(next) : next;
    }

    public zzajp(Iterator<Map.Entry<K, Object>> it) {
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }
}
