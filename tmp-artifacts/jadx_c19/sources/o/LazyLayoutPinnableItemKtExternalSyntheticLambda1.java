package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import o.LazySaveableStateHolderKtExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class LazyLayoutPinnableItemKtExternalSyntheticLambda1 extends LazyLayoutKtExternalSyntheticLambda2<Double> implements LazySaveableStateHolderKtExternalSyntheticLambda1.IAuthTabCallback, RandomAccess, LazyLayoutPagerKtExternalSyntheticLambda0 {
    private static final LazyLayoutPinnableItemKtExternalSyntheticLambda1 IAuthTabCallback = new LazyLayoutPinnableItemKtExternalSyntheticLambda1(new double[0], 0, false);
    private int onNavigationEvent;
    private double[] onWarmupCompleted;

    LazyLayoutPinnableItemKtExternalSyntheticLambda1() {
        this(new double[10], 0, true);
    }

    private LazyLayoutPinnableItemKtExternalSyntheticLambda1(double[] dArr, int i2, boolean z) {
        super(z);
        this.onWarmupCompleted = dArr;
        this.onNavigationEvent = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void removeRange(int i2, int i3) {
        IAuthTabCallback();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.onWarmupCompleted;
        System.arraycopy(dArr, i3, dArr, i2, this.onNavigationEvent - i3);
        this.onNavigationEvent -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutPinnableItemKtExternalSyntheticLambda1)) {
            return super.equals(obj);
        }
        LazyLayoutPinnableItemKtExternalSyntheticLambda1 lazyLayoutPinnableItemKtExternalSyntheticLambda1 = (LazyLayoutPinnableItemKtExternalSyntheticLambda1) obj;
        if (this.onNavigationEvent != lazyLayoutPinnableItemKtExternalSyntheticLambda1.onNavigationEvent) {
            return false;
        }
        double[] dArr = lazyLayoutPinnableItemKtExternalSyntheticLambda1.onWarmupCompleted;
        for (int i2 = 0; i2 < this.onNavigationEvent; i2++) {
            if (Double.doubleToLongBits(this.onWarmupCompleted[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        int iIAuthTabCallback = 1;
        for (int i2 = 0; i2 < this.onNavigationEvent; i2++) {
            iIAuthTabCallback = (iIAuthTabCallback * 31) + LazySaveableStateHolderKtExternalSyntheticLambda1.IAuthTabCallback(Double.doubleToLongBits(this.onWarmupCompleted[i2]));
        }
        return iIAuthTabCallback;
    }

    @Override // o.LazySaveableStateHolderKtExternalSyntheticLambda1.IAuthTabCallback, o.LazySaveableStateHolderKtExternalSyntheticLambda1.asBinder
    /* renamed from: onExtraCallback */
    public LazySaveableStateHolderKtExternalSyntheticLambda1.IAuthTabCallback onNavigationEvent(int i2) {
        if (i2 < this.onNavigationEvent) {
            throw new IllegalArgumentException();
        }
        return new LazyLayoutPinnableItemKtExternalSyntheticLambda1(Arrays.copyOf(this.onWarmupCompleted, i2), this.onNavigationEvent, true);
    }

    @Override // java.util.List
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public Double get(int i2) {
        return Double.valueOf(onExtraCallbackWithResult(i2));
    }

    public double onExtraCallbackWithResult(int i2) {
        onTransact(i2);
        return this.onWarmupCompleted[i2];
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.onWarmupCompleted[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.onNavigationEvent;
    }

    @Override // java.util.List
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public Double set(int i2, Double d) {
        return Double.valueOf(onWarmupCompleted(i2, d.doubleValue()));
    }

    public double onWarmupCompleted(int i2, double d) {
        IAuthTabCallback();
        onTransact(i2);
        double[] dArr = this.onWarmupCompleted;
        double d2 = dArr[i2];
        dArr[i2] = d;
        return d2;
    }

    @Override // java.util.List, java.util.Collection
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d) {
        IAuthTabCallback(d.doubleValue());
        return true;
    }

    @Override // java.util.List
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public void add(int i2, Double d) {
        onExtraCallback(i2, d.doubleValue());
    }

    public void IAuthTabCallback(double d) {
        IAuthTabCallback();
        int i2 = this.onNavigationEvent;
        double[] dArr = this.onWarmupCompleted;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.onWarmupCompleted = dArr2;
        }
        double[] dArr3 = this.onWarmupCompleted;
        int i3 = this.onNavigationEvent;
        this.onNavigationEvent = i3 + 1;
        dArr3[i3] = d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void onExtraCallback(int i2, double d) {
        int i3;
        IAuthTabCallback();
        if (i2 < 0 || i2 > (i3 = this.onNavigationEvent)) {
            throw new IndexOutOfBoundsException(IAuthTabCallbackDefault(i2));
        }
        double[] dArr = this.onWarmupCompleted;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[((i3 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.onWarmupCompleted, i2, dArr2, i2 + 1, this.onNavigationEvent - i2);
            this.onWarmupCompleted = dArr2;
        }
        this.onWarmupCompleted[i2] = d;
        this.onNavigationEvent++;
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Double> collection) {
        IAuthTabCallback();
        LazySaveableStateHolderKtExternalSyntheticLambda1.onNavigationEvent(collection);
        if (!(collection instanceof LazyLayoutPinnableItemKtExternalSyntheticLambda1)) {
            return super.addAll(collection);
        }
        LazyLayoutPinnableItemKtExternalSyntheticLambda1 lazyLayoutPinnableItemKtExternalSyntheticLambda1 = (LazyLayoutPinnableItemKtExternalSyntheticLambda1) collection;
        int i2 = lazyLayoutPinnableItemKtExternalSyntheticLambda1.onNavigationEvent;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.onNavigationEvent;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        double[] dArr = this.onWarmupCompleted;
        if (i4 > dArr.length) {
            this.onWarmupCompleted = Arrays.copyOf(dArr, i4);
        }
        System.arraycopy(lazyLayoutPinnableItemKtExternalSyntheticLambda1.onWarmupCompleted, 0, this.onWarmupCompleted, this.onNavigationEvent, lazyLayoutPinnableItemKtExternalSyntheticLambda1.onNavigationEvent);
        this.onNavigationEvent = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public Double remove(int i2) {
        IAuthTabCallback();
        onTransact(i2);
        double[] dArr = this.onWarmupCompleted;
        double d = dArr[i2];
        if (i2 < this.onNavigationEvent - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (r3 - i2) - 1);
        }
        this.onNavigationEvent--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    private void onTransact(int i2) {
        if (i2 < 0 || i2 >= this.onNavigationEvent) {
            throw new IndexOutOfBoundsException(IAuthTabCallbackDefault(i2));
        }
    }

    private String IAuthTabCallbackDefault(int i2) {
        return "Index:" + i2 + ", Size:" + this.onNavigationEvent;
    }
}
