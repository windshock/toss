package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzay<E> extends zzaq<E> {
    static final zzaq<Object> zza = new zzay(new Object[0], 0);
    private final transient Object[] zzb;
    private final transient int zzc;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaq, com.google.android.gms.internal.p000firebaseauthapi.zzal
    final int zza(Object[] objArr, int i2) {
        System.arraycopy(this.zzb, 0, objArr, i2, this.zzc);
        return i2 + this.zzc;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzal
    final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzal
    final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzal
    final int zza() {
        return this.zzc;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // java.util.List
    public final E get(int i2) {
        zzz.zza(i2, this.zzc);
        E e = (E) this.zzb[i2];
        Objects.requireNonNull(e);
        return e;
    }

    zzay(Object[] objArr, int i2) {
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzal
    final Object[] zzf() {
        return this.zzb;
    }
}
