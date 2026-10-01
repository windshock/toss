package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzalr implements Iterator<Map.Entry<Object, Object>> {
    private int zza;
    private boolean zzb;
    private Iterator<Map.Entry<Object, Object>> zzc;
    private final /* synthetic */ zzalh zzd;

    @Override // java.util.Iterator
    public final /* synthetic */ Map.Entry<Object, Object> next() {
        this.zzb = true;
        int i2 = this.zza + 1;
        this.zza = i2;
        return i2 < this.zzd.zzb.size() ? (Map.Entry) this.zzd.zzb.get(this.zza) : zza().next();
    }

    private final Iterator<Map.Entry<Object, Object>> zza() {
        if (this.zzc == null) {
            this.zzc = this.zzd.zzc.entrySet().iterator();
        }
        return this.zzc;
    }

    private zzalr(zzalh zzalhVar) {
        this.zzd = zzalhVar;
        this.zza = -1;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzb) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzb = false;
        this.zzd.zzg();
        if (this.zza < this.zzd.zzb.size()) {
            zzalh zzalhVar = this.zzd;
            int i2 = this.zza;
            this.zza = i2 - 1;
            zzalhVar.zzc(i2);
            return;
        }
        zza().remove();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza + 1 < this.zzd.zzb.size() || (!this.zzd.zzc.isEmpty() && zza().hasNext());
    }
}
