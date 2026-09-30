package com.google.android.recaptcha.internal;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzhy extends zzgh implements RandomAccess, zzjb, zzkm {
    private static final zzhy zza = new zzhy(new double[0], 0, false);
    private double[] zzb;
    private int zzc;

    zzhy() {
        this(new double[10], 0, true);
    }

    private final String zzf(int i2) {
        return "Index:" + i2 + ", Size:" + this.zzc;
    }

    private final void zzg(int i2) {
        if (i2 < 0 || i2 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i2));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzgh, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        if (i2 < 0 || i2 > (i3 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i2));
        }
        int i4 = i2 + 1;
        double[] dArr = this.zzb;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i4, i3 - i2);
        } else {
            double[] dArr2 = new double[((i3 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.zzb, i2, dArr2, i4, this.zzc - i2);
            this.zzb = dArr2;
        }
        this.zzb[i2] = dDoubleValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzgh, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        if (!(collection instanceof zzhy)) {
            return super.addAll(collection);
        }
        zzhy zzhyVar = (zzhy) collection;
        int i2 = zzhyVar.zzc;
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
        System.arraycopy(zzhyVar.zzb, 0, this.zzb, this.zzc, zzhyVar.zzc);
        this.zzc = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.recaptcha.internal.zzgh, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhy)) {
            return super.equals(obj);
        }
        zzhy zzhyVar = (zzhy) obj;
        if (this.zzc != zzhyVar.zzc) {
            return false;
        }
        double[] dArr = zzhyVar.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (Double.doubleToLongBits(this.zzb[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzg(i2);
        return Double.valueOf(this.zzb[i2]);
    }

    @Override // com.google.android.recaptcha.internal.zzgh, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.zzb[i3]);
            i2 = (i2 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i2 = this.zzc;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.zzb[i3] == dDoubleValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzgh, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        zza();
        zzg(i2);
        double[] dArr = this.zzb;
        double d = dArr[i2];
        if (i2 < this.zzc - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (r3 - i2) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
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

    @Override // com.google.android.recaptcha.internal.zzgh, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        zzg(i2);
        double[] dArr = this.zzb;
        double d = dArr[i2];
        dArr[i2] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final /* synthetic */ zzjb zzd(int i2) {
        if (i2 >= this.zzc) {
            return new zzhy(Arrays.copyOf(this.zzb, i2), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(double d) {
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

    private zzhy(double[] dArr, int i2, boolean z) {
        super(z);
        this.zzb = dArr;
        this.zzc = i2;
    }

    @Override // com.google.android.recaptcha.internal.zzgh, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zze(((Double) obj).doubleValue());
        return true;
    }
}
