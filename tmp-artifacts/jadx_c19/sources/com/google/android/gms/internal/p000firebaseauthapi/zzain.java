package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzain extends zzahg<Double> implements zzajg<Double>, zzakw, RandomAccess {
    private static final zzain zza = new zzain(new double[0], 0, false);
    private double[] zzb;
    private int zzc;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahg, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            iZza = (iZza * 31) + zzajc.zza(Double.doubleToLongBits(this.zzb[i2]));
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.zzb[i2] == dDoubleValue) {
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
    public final /* synthetic */ zzajg<Double> zza(int i2) {
        if (i2 < this.zzc) {
            throw new IllegalArgumentException();
        }
        return new zzain(Arrays.copyOf(this.zzb, i2), this.zzc, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzc(i2);
        return Double.valueOf(this.zzb[i2]);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahg, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        zza();
        zzc(i2);
        double[] dArr = this.zzb;
        double d = dArr[i2];
        if (i2 < this.zzc - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (r3 - i2) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahg, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        zzc(i2);
        double[] dArr = this.zzb;
        double d = dArr[i2];
        dArr[i2] = dDoubleValue;
        return Double.valueOf(d);
    }

    private final String zzb(int i2) {
        return "Index:" + i2 + ", Size:" + this.zzc;
    }

    zzain() {
        this(new double[10], 0, true);
    }

    private zzain(double[] dArr, int i2, boolean z) {
        super(z);
        this.zzb = dArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahg, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        if (i2 < 0 || i2 > (i3 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzb(i2));
        }
        double[] dArr = this.zzb;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[((i3 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.zzb, i2, dArr2, i2 + 1, this.zzc - i2);
            this.zzb = dArr2;
        }
        this.zzb[i2] = dDoubleValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    public final void zza(double d) {
        zza();
        int i2 = this.zzc;
        double[] dArr = this.zzb;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i3 = this.zzc;
        this.zzc = i3 + 1;
        dArr3[i3] = d;
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
        double[] dArr = this.zzb;
        System.arraycopy(dArr, i3, dArr, i2, this.zzc - i3);
        this.zzc -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahg, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        zza();
        zzajc.zza(collection);
        if (!(collection instanceof zzain)) {
            return super.addAll(collection);
        }
        zzain zzainVar = (zzain) collection;
        int i2 = zzainVar.zzc;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.zzc;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        double[] dArr = this.zzb;
        if (i4 > dArr.length) {
            this.zzb = Arrays.copyOf(dArr, i4);
        }
        System.arraycopy(zzainVar.zzb, 0, this.zzb, this.zzc, zzainVar.zzc);
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
        if (!(obj instanceof zzain)) {
            return super.equals(obj);
        }
        zzain zzainVar = (zzain) obj;
        if (this.zzc != zzainVar.zzc) {
            return false;
        }
        double[] dArr = zzainVar.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (Double.doubleToLongBits(this.zzb[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }
}
