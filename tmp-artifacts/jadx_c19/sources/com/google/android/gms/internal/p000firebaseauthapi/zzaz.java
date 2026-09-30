package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzaz extends zzaq<Map.Entry<Object, Object>> {
    private final /* synthetic */ zzba zza;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzd;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzal
    public final boolean zze() {
        return true;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzz.zza(i2, this.zza.zzd);
        int i3 = i2 * 2;
        Object obj = this.zza.zzb[i3];
        Objects.requireNonNull(obj);
        Object obj2 = this.zza.zzb[i3 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    zzaz(zzba zzbaVar) {
        this.zza = zzbaVar;
    }
}
