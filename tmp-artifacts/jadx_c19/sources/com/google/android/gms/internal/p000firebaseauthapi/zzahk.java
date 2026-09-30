package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzahk extends zzahg<Boolean> implements zzajg<Boolean>, zzakw, RandomAccess {
    private static final zzahk zza = new zzahk(new boolean[0], 0, false);
    private boolean[] zzb;
    private int zzc;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahg, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            iZza = (iZza * 31) + zzajc.zza(this.zzb[i2]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.zzb[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzajg
    public final /* synthetic */ zzajg<Boolean> zza(int i2) {
        if (i2 < this.zzc) {
            throw new IllegalArgumentException();
        }
        return new zzahk(Arrays.copyOf(this.zzb, i2), this.zzc, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzc(i2);
        return Boolean.valueOf(this.zzb[i2]);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahg, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        zza();
        zzc(i2);
        boolean[] zArr = this.zzb;
        boolean z = zArr[i2];
        if (i2 < this.zzc - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (r2 - i2) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahg, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzc(i2);
        boolean[] zArr = this.zzb;
        boolean z = zArr[i2];
        zArr[i2] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    private final String zzb(int i2) {
        return "Index:" + i2 + ", Size:" + this.zzc;
    }

    zzahk() {
        this(new boolean[10], 0, true);
    }

    private zzahk(boolean[] zArr, int i2, boolean z) {
        super(z);
        this.zzb = zArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahg, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i2 < 0 || i2 > (i3 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzb(i2));
        }
        boolean[] zArr = this.zzb;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[((i3 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.zzb, i2, zArr2, i2 + 1, this.zzc - i2);
            this.zzb = zArr2;
        }
        this.zzb[i2] = zBooleanValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    public final void zza(boolean z) {
        zza();
        int i2 = this.zzc;
        boolean[] zArr = this.zzb;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.zzb = zArr2;
        }
        boolean[] zArr3 = this.zzb;
        int i3 = this.zzc;
        this.zzc = i3 + 1;
        zArr3[i3] = z;
    }

    private final void zzc(int i2) {
        if (i2 < 0 || i2 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzb(i2));
        }
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        zza();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i3, zArr, i2, this.zzc - i3);
        this.zzc -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahg, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        zza();
        zzajc.zza(collection);
        if (!(collection instanceof zzahk)) {
            return super.addAll(collection);
        }
        zzahk zzahkVar = (zzahk) collection;
        int i2 = zzahkVar.zzc;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.zzc;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArr = this.zzb;
        if (i4 > zArr.length) {
            this.zzb = Arrays.copyOf(zArr, i4);
        }
        System.arraycopy(zzahkVar.zzb, 0, this.zzb, this.zzc, zzahkVar.zzc);
        this.zzc = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahg, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzahk)) {
            return super.equals(obj);
        }
        zzahk zzahkVar = (zzahk) obj;
        if (this.zzc != zzahkVar.zzc) {
            return false;
        }
        boolean[] zArr = zzahkVar.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (this.zzb[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }
}
