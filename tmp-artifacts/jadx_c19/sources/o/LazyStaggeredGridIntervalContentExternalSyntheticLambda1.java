package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import o.LazySaveableStateHolderKtExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class LazyStaggeredGridIntervalContentExternalSyntheticLambda1 extends LazyLayoutKtExternalSyntheticLambda2<Long> implements LazySaveableStateHolderKtExternalSyntheticLambda1.IAuthTabCallbackDefault, RandomAccess, LazyLayoutPagerKtExternalSyntheticLambda0 {
    private static final LazyStaggeredGridIntervalContentExternalSyntheticLambda1 onNavigationEvent = new LazyStaggeredGridIntervalContentExternalSyntheticLambda1(new long[0], 0, false);
    private int IAuthTabCallback;
    private long[] onWarmupCompleted;

    LazyStaggeredGridIntervalContentExternalSyntheticLambda1() {
        this(new long[10], 0, true);
    }

    private LazyStaggeredGridIntervalContentExternalSyntheticLambda1(long[] jArr, int i2, boolean z) {
        super(z);
        this.onWarmupCompleted = jArr;
        this.IAuthTabCallback = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void removeRange(int i2, int i3) {
        IAuthTabCallback();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.onWarmupCompleted;
        System.arraycopy(jArr, i3, jArr, i2, this.IAuthTabCallback - i3);
        this.IAuthTabCallback -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyStaggeredGridIntervalContentExternalSyntheticLambda1)) {
            return super.equals(obj);
        }
        LazyStaggeredGridIntervalContentExternalSyntheticLambda1 lazyStaggeredGridIntervalContentExternalSyntheticLambda1 = (LazyStaggeredGridIntervalContentExternalSyntheticLambda1) obj;
        if (this.IAuthTabCallback != lazyStaggeredGridIntervalContentExternalSyntheticLambda1.IAuthTabCallback) {
            return false;
        }
        long[] jArr = lazyStaggeredGridIntervalContentExternalSyntheticLambda1.onWarmupCompleted;
        for (int i2 = 0; i2 < this.IAuthTabCallback; i2++) {
            if (this.onWarmupCompleted[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        int iIAuthTabCallback = 1;
        for (int i2 = 0; i2 < this.IAuthTabCallback; i2++) {
            iIAuthTabCallback = (iIAuthTabCallback * 31) + LazySaveableStateHolderKtExternalSyntheticLambda1.IAuthTabCallback(this.onWarmupCompleted[i2]);
        }
        return iIAuthTabCallback;
    }

    @Override // o.LazySaveableStateHolderKtExternalSyntheticLambda1.IAuthTabCallbackDefault, o.LazySaveableStateHolderKtExternalSyntheticLambda1.asBinder
    /* renamed from: onExtraCallbackWithResult */
    public LazySaveableStateHolderKtExternalSyntheticLambda1.IAuthTabCallbackDefault onNavigationEvent(int i2) {
        if (i2 < this.IAuthTabCallback) {
            throw new IllegalArgumentException();
        }
        return new LazyStaggeredGridIntervalContentExternalSyntheticLambda1(Arrays.copyOf(this.onWarmupCompleted, i2), this.IAuthTabCallback, true);
    }

    @Override // java.util.List
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public Long get(int i2) {
        return Long.valueOf(onWarmupCompleted(i2));
    }

    public long onWarmupCompleted(int i2) {
        IAuthTabCallbackStub(i2);
        return this.onWarmupCompleted[i2];
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.onWarmupCompleted[i2] == jLongValue) {
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
        return this.IAuthTabCallback;
    }

    @Override // java.util.List
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public Long set(int i2, Long l) {
        return Long.valueOf(onWarmupCompleted(i2, l.longValue()));
    }

    public long onWarmupCompleted(int i2, long j) {
        IAuthTabCallback();
        IAuthTabCallbackStub(i2);
        long[] jArr = this.onWarmupCompleted;
        long j2 = jArr[i2];
        jArr[i2] = j;
        return j2;
    }

    @Override // java.util.List, java.util.Collection
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l) {
        onWarmupCompleted(l.longValue());
        return true;
    }

    @Override // java.util.List
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void add(int i2, Long l) {
        IAuthTabCallback(i2, l.longValue());
    }

    public void onWarmupCompleted(long j) {
        IAuthTabCallback();
        int i2 = this.IAuthTabCallback;
        long[] jArr = this.onWarmupCompleted;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.onWarmupCompleted = jArr2;
        }
        long[] jArr3 = this.onWarmupCompleted;
        int i3 = this.IAuthTabCallback;
        this.IAuthTabCallback = i3 + 1;
        jArr3[i3] = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void IAuthTabCallback(int i2, long j) {
        int i3;
        IAuthTabCallback();
        if (i2 < 0 || i2 > (i3 = this.IAuthTabCallback)) {
            throw new IndexOutOfBoundsException(onTransact(i2));
        }
        long[] jArr = this.onWarmupCompleted;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[((i3 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.onWarmupCompleted, i2, jArr2, i2 + 1, this.IAuthTabCallback - i2);
            this.onWarmupCompleted = jArr2;
        }
        this.onWarmupCompleted[i2] = j;
        this.IAuthTabCallback++;
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Long> collection) {
        IAuthTabCallback();
        LazySaveableStateHolderKtExternalSyntheticLambda1.onNavigationEvent(collection);
        if (!(collection instanceof LazyStaggeredGridIntervalContentExternalSyntheticLambda1)) {
            return super.addAll(collection);
        }
        LazyStaggeredGridIntervalContentExternalSyntheticLambda1 lazyStaggeredGridIntervalContentExternalSyntheticLambda1 = (LazyStaggeredGridIntervalContentExternalSyntheticLambda1) collection;
        int i2 = lazyStaggeredGridIntervalContentExternalSyntheticLambda1.IAuthTabCallback;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.IAuthTabCallback;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        long[] jArr = this.onWarmupCompleted;
        if (i4 > jArr.length) {
            this.onWarmupCompleted = Arrays.copyOf(jArr, i4);
        }
        System.arraycopy(lazyStaggeredGridIntervalContentExternalSyntheticLambda1.onWarmupCompleted, 0, this.onWarmupCompleted, this.IAuthTabCallback, lazyStaggeredGridIntervalContentExternalSyntheticLambda1.IAuthTabCallback);
        this.IAuthTabCallback = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public Long remove(int i2) {
        IAuthTabCallback();
        IAuthTabCallbackStub(i2);
        long[] jArr = this.onWarmupCompleted;
        long j = jArr[i2];
        if (i2 < this.IAuthTabCallback - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (r3 - i2) - 1);
        }
        this.IAuthTabCallback--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    private void IAuthTabCallbackStub(int i2) {
        if (i2 < 0 || i2 >= this.IAuthTabCallback) {
            throw new IndexOutOfBoundsException(onTransact(i2));
        }
    }

    private String onTransact(int i2) {
        return "Index:" + i2 + ", Size:" + this.IAuthTabCallback;
    }
}
