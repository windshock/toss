package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzba<K, V> extends zzav<Map.Entry<K, V>> {
    private final transient zzau<K, V> zza;
    private final transient Object[] zzb;
    private final transient int zzc = 0;
    private final transient int zzd;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzal
    final int zza(Object[] objArr, int i2) {
        return zzc().zza(objArr, i2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzal
    final boolean zze() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzav
    final zzaq<Map.Entry<K, V>> zzg() {
        return new zzaz(this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzal
    /* renamed from: zzd */
    public final zzbd<Map.Entry<K, V>> iterator() {
        return (zzbd) zzc().iterator();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzav, com.google.android.gms.internal.p000firebaseauthapi.zzal, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    zzba(zzau<K, V> zzauVar, Object[] objArr, int i2, int i3) {
        this.zza = zzauVar;
        this.zzb = objArr;
        this.zzd = i3;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzal, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.zza.get(key));
    }
}
