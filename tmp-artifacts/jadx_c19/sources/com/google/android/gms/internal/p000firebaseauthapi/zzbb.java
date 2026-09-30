package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzbb extends zzaq<Object> {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzal
    final boolean zze() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzz.zza(i2, this.zzc);
        Object obj = this.zza[(i2 * 2) + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    zzbb(Object[] objArr, int i2, int i3) {
        this.zza = objArr;
        this.zzb = i2;
        this.zzc = i3;
    }
}
