package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import o.LazySaveableStateHolderKtExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class NearestRangeKeyIndexMapExternalSyntheticLambda0 extends LazyLayoutKtExternalSyntheticLambda2<Integer> implements LazySaveableStateHolderKtExternalSyntheticLambda1.IAuthTabCallbackStub, RandomAccess, LazyLayoutPagerKtExternalSyntheticLambda0 {
    private static final NearestRangeKeyIndexMapExternalSyntheticLambda0 onExtraCallback = new NearestRangeKeyIndexMapExternalSyntheticLambda0(new int[0], 0, false);
    private int[] IAuthTabCallback;
    private int onNavigationEvent;

    NearestRangeKeyIndexMapExternalSyntheticLambda0() {
        this(new int[10], 0, true);
    }

    private NearestRangeKeyIndexMapExternalSyntheticLambda0(int[] iArr, int i2, boolean z) {
        super(z);
        this.IAuthTabCallback = iArr;
        this.onNavigationEvent = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void removeRange(int i2, int i3) {
        IAuthTabCallback();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.IAuthTabCallback;
        System.arraycopy(iArr, i3, iArr, i2, this.onNavigationEvent - i3);
        this.onNavigationEvent -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearestRangeKeyIndexMapExternalSyntheticLambda0)) {
            return super.equals(obj);
        }
        NearestRangeKeyIndexMapExternalSyntheticLambda0 nearestRangeKeyIndexMapExternalSyntheticLambda0 = (NearestRangeKeyIndexMapExternalSyntheticLambda0) obj;
        if (this.onNavigationEvent != nearestRangeKeyIndexMapExternalSyntheticLambda0.onNavigationEvent) {
            return false;
        }
        int[] iArr = nearestRangeKeyIndexMapExternalSyntheticLambda0.IAuthTabCallback;
        for (int i2 = 0; i2 < this.onNavigationEvent; i2++) {
            if (this.IAuthTabCallback[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.onNavigationEvent; i3++) {
            i2 = (i2 * 31) + this.IAuthTabCallback[i3];
        }
        return i2;
    }

    @Override // o.LazySaveableStateHolderKtExternalSyntheticLambda1.IAuthTabCallbackStub, o.LazySaveableStateHolderKtExternalSyntheticLambda1.asBinder
    /* renamed from: IAuthTabCallback */
    public LazySaveableStateHolderKtExternalSyntheticLambda1.IAuthTabCallbackStub onNavigationEvent(int i2) {
        if (i2 < this.onNavigationEvent) {
            throw new IllegalArgumentException();
        }
        return new NearestRangeKeyIndexMapExternalSyntheticLambda0(Arrays.copyOf(this.IAuthTabCallback, i2), this.onNavigationEvent, true);
    }

    @Override // java.util.List
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public Integer get(int i2) {
        return Integer.valueOf(onWarmupCompleted(i2));
    }

    public int onWarmupCompleted(int i2) {
        asBinder(i2);
        return this.IAuthTabCallback[i2];
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.IAuthTabCallback[i2] == iIntValue) {
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
    public Integer set(int i2, Integer num) {
        return Integer.valueOf(IAuthTabCallback(i2, num.intValue()));
    }

    public int IAuthTabCallback(int i2, int i3) {
        IAuthTabCallback();
        asBinder(i2);
        int[] iArr = this.IAuthTabCallback;
        int i4 = iArr[i2];
        iArr[i2] = i3;
        return i4;
    }

    @Override // java.util.List, java.util.Collection
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        onExtraCallbackWithResult(num.intValue());
        return true;
    }

    @Override // java.util.List
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void add(int i2, Integer num) {
        onWarmupCompleted(i2, num.intValue());
    }

    public void onExtraCallbackWithResult(int i2) {
        IAuthTabCallback();
        int i3 = this.onNavigationEvent;
        int[] iArr = this.IAuthTabCallback;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.IAuthTabCallback = iArr2;
        }
        int[] iArr3 = this.IAuthTabCallback;
        int i4 = this.onNavigationEvent;
        this.onNavigationEvent = i4 + 1;
        iArr3[i4] = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void onWarmupCompleted(int i2, int i3) {
        int i4;
        IAuthTabCallback();
        if (i2 < 0 || i2 > (i4 = this.onNavigationEvent)) {
            throw new IndexOutOfBoundsException(IAuthTabCallbackDefault(i2));
        }
        int[] iArr = this.IAuthTabCallback;
        if (i4 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i4 - i2);
        } else {
            int[] iArr2 = new int[((i4 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.IAuthTabCallback, i2, iArr2, i2 + 1, this.onNavigationEvent - i2);
            this.IAuthTabCallback = iArr2;
        }
        this.IAuthTabCallback[i2] = i3;
        this.onNavigationEvent++;
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Integer> collection) {
        IAuthTabCallback();
        LazySaveableStateHolderKtExternalSyntheticLambda1.onNavigationEvent(collection);
        if (!(collection instanceof NearestRangeKeyIndexMapExternalSyntheticLambda0)) {
            return super.addAll(collection);
        }
        NearestRangeKeyIndexMapExternalSyntheticLambda0 nearestRangeKeyIndexMapExternalSyntheticLambda0 = (NearestRangeKeyIndexMapExternalSyntheticLambda0) collection;
        int i2 = nearestRangeKeyIndexMapExternalSyntheticLambda0.onNavigationEvent;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.onNavigationEvent;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArr = this.IAuthTabCallback;
        if (i4 > iArr.length) {
            this.IAuthTabCallback = Arrays.copyOf(iArr, i4);
        }
        System.arraycopy(nearestRangeKeyIndexMapExternalSyntheticLambda0.IAuthTabCallback, 0, this.IAuthTabCallback, this.onNavigationEvent, nearestRangeKeyIndexMapExternalSyntheticLambda0.onNavigationEvent);
        this.onNavigationEvent = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    /* renamed from: onTransact, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i2) {
        IAuthTabCallback();
        asBinder(i2);
        int[] iArr = this.IAuthTabCallback;
        int i3 = iArr[i2];
        if (i2 < this.onNavigationEvent - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.onNavigationEvent--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    private void asBinder(int i2) {
        if (i2 < 0 || i2 >= this.onNavigationEvent) {
            throw new IndexOutOfBoundsException(IAuthTabCallbackDefault(i2));
        }
    }

    private String IAuthTabCallbackDefault(int i2) {
        return "Index:" + i2 + ", Size:" + this.onNavigationEvent;
    }
}
