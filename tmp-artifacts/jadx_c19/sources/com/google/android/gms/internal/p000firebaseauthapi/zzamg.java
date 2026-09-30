package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzamg extends AbstractList<String> implements zzajq, RandomAccess {
    private final zzajq zza;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzajq
    public final zzajq a_() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        return (String) this.zza.get(i2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzajq
    public final Object zzb(int i2) {
        return this.zza.zzb(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new zzami(this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzajq
    public final List<?> zzb() {
        return this.zza.zzb();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i2) {
        return new zzamf(this, i2);
    }

    public zzamg(zzajq zzajqVar) {
        this.zza = zzajqVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzajq
    public final void zza(zzahm zzahmVar) {
        throw new UnsupportedOperationException();
    }
}
