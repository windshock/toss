package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
abstract class zzi<T> implements Iterator<T> {
    private int zza = zzh.zzb;

    @CheckForNull
    private T zzb;

    @CheckForNull
    protected abstract T zza();

    @CheckForNull
    protected final T zzb() {
        this.zza = zzh.zzc;
        return null;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.zza = zzh.zzb;
        T t = this.zzb;
        this.zzb = null;
        return t;
    }

    protected zzi() {
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.zza;
        int i3 = zzh.zzd;
        if (i2 == i3) {
            throw new IllegalStateException();
        }
        int i4 = i2 - 1;
        if (i4 == 0) {
            return true;
        }
        if (i4 == 2) {
            return false;
        }
        this.zza = i3;
        this.zzb = zza();
        if (this.zza == zzh.zzc) {
            return false;
        }
        this.zza = zzh.zza;
        return true;
    }
}
