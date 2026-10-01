package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.NoSuchElementException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
abstract class zzak<E> extends zzbg<E> {
    private final int zza;
    private int zzb;

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzb;
    }

    protected abstract E zza(int i2);

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzb - 1;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.zzb;
        this.zzb = i2 + 1;
        return zza(i2);
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.zzb - 1;
        this.zzb = i2;
        return zza(i2);
    }

    protected zzak(int i2, int i3) {
        zzz.zzb(i3, i2);
        this.zza = i2;
        this.zzb = i3;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.zzb < this.zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzb > 0;
    }
}
