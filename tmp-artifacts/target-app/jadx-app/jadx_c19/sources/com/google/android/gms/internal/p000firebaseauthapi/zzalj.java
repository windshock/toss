package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzalj implements Iterator<Map.Entry<Object, Object>> {
    private int zza;
    private Iterator<Map.Entry<Object, Object>> zzb;
    private final /* synthetic */ zzalh zzc;

    @Override // java.util.Iterator
    public final /* synthetic */ Map.Entry<Object, Object> next() {
        if (zza().hasNext()) {
            return zza().next();
        }
        List list = this.zzc.zzb;
        int i2 = this.zza - 1;
        this.zza = i2;
        return (Map.Entry) list.get(i2);
    }

    private final Iterator<Map.Entry<Object, Object>> zza() {
        if (this.zzb == null) {
            this.zzb = this.zzc.zzf.entrySet().iterator();
        }
        return this.zzb;
    }

    private zzalj(zzalh zzalhVar) {
        this.zzc = zzalhVar;
        this.zza = zzalhVar.zzb.size();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.zza;
        return (i2 > 0 && i2 <= this.zzc.zzb.size()) || zza().hasNext();
    }
}
