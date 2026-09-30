package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzbc<K> extends zzav<K> {
    private final transient zzau<K, ?> zza;
    private final transient zzaq<K> zzb;

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
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzav, com.google.android.gms.internal.p000firebaseauthapi.zzal
    public final zzaq<K> zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzal
    /* renamed from: zzd */
    public final zzbd<K> iterator() {
        return (zzbd) zzc().iterator();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzav, com.google.android.gms.internal.p000firebaseauthapi.zzal, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    zzbc(zzau<K, ?> zzauVar, zzaq<K> zzaqVar) {
        this.zza = zzauVar;
        this.zzb = zzaqVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzal, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.get(obj) != null;
    }
}
