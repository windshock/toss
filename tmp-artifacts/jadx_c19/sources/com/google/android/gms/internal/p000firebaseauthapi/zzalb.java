package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzalb<E> extends zzahg<E> implements RandomAccess {
    private static final zzalb<Object> zza = new zzalb<>(new Object[0], 0, false);
    private E[] zzb;
    private int zzc;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzajg
    public final /* synthetic */ zzajg zza(int i2) {
        if (i2 < this.zzc) {
            throw new IllegalArgumentException();
        }
        return new zzalb(Arrays.copyOf(this.zzb, i2), this.zzc, true);
    }

    public static <E> zzalb<E> zzd() {
        return (zzalb<E>) zza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i2) {
        zzc(i2);
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahg, java.util.AbstractList, java.util.List
    public final E remove(int i2) {
        zza();
        zzc(i2);
        E[] eArr = this.zzb;
        E e = eArr[i2];
        if (i2 < this.zzc - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (r2 - i2) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahg, java.util.AbstractList, java.util.List
    public final E set(int i2, E e) {
        zza();
        zzc(i2);
        E[] eArr = this.zzb;
        E e2 = eArr[i2];
        eArr[i2] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    private final String zzb(int i2) {
        return "Index:" + i2 + ", Size:" + this.zzc;
    }

    zzalb() {
        this(new Object[10], 0, true);
    }

    private zzalb(E[] eArr, int i2, boolean z) {
        super(z);
        this.zzb = eArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahg, java.util.AbstractList, java.util.List
    public final void add(int i2, E e) {
        int i3;
        zza();
        if (i2 < 0 || i2 > (i3 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzb(i2));
        }
        E[] eArr = this.zzb;
        if (i3 < eArr.length) {
            System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
        } else {
            E[] eArr2 = (E[]) new Object[((i3 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i2);
            System.arraycopy(this.zzb, i2, eArr2, i2 + 1, this.zzc - i2);
            this.zzb = eArr2;
        }
        this.zzb[i2] = e;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    private final void zzc(int i2) {
        if (i2 < 0 || i2 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzb(i2));
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahg, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        zza();
        int i2 = this.zzc;
        E[] eArr = this.zzb;
        if (i2 == eArr.length) {
            this.zzb = (E[]) Arrays.copyOf(eArr, ((i2 * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzb;
        int i3 = this.zzc;
        this.zzc = i3 + 1;
        eArr2[i3] = e;
        ((AbstractList) this).modCount++;
        return true;
    }
}
