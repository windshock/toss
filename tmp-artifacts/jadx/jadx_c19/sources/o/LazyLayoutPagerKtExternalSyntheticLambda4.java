package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class LazyLayoutPagerKtExternalSyntheticLambda4<E> extends LazyLayoutKtExternalSyntheticLambda2<E> implements RandomAccess {
    private static final LazyLayoutPagerKtExternalSyntheticLambda4<Object> IAuthTabCallback = new LazyLayoutPagerKtExternalSyntheticLambda4<>(new Object[0], 0, false);
    private E[] onExtraCallback;
    private int onExtraCallbackWithResult;

    public static <E> LazyLayoutPagerKtExternalSyntheticLambda4<E> onWarmupCompleted() {
        return (LazyLayoutPagerKtExternalSyntheticLambda4<E>) IAuthTabCallback;
    }

    LazyLayoutPagerKtExternalSyntheticLambda4() {
        this(new Object[10], 0, true);
    }

    private LazyLayoutPagerKtExternalSyntheticLambda4(E[] eArr, int i2, boolean z) {
        super(z);
        this.onExtraCallback = eArr;
        this.onExtraCallbackWithResult = i2;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public LazyLayoutPagerKtExternalSyntheticLambda4<E> onNavigationEvent(int i2) {
        if (i2 < this.onExtraCallbackWithResult) {
            throw new IllegalArgumentException();
        }
        return new LazyLayoutPagerKtExternalSyntheticLambda4<>(Arrays.copyOf(this.onExtraCallback, i2), this.onExtraCallbackWithResult, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean add(E e) {
        IAuthTabCallback();
        int i2 = this.onExtraCallbackWithResult;
        E[] eArr = this.onExtraCallback;
        if (i2 == eArr.length) {
            this.onExtraCallback = (E[]) Arrays.copyOf(eArr, ((i2 * 3) / 2) + 1);
        }
        E[] eArr2 = this.onExtraCallback;
        int i3 = this.onExtraCallbackWithResult;
        this.onExtraCallbackWithResult = i3 + 1;
        eArr2[i3] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void add(int i2, E e) {
        int i3;
        IAuthTabCallback();
        if (i2 < 0 || i2 > (i3 = this.onExtraCallbackWithResult)) {
            throw new IndexOutOfBoundsException(onWarmupCompleted(i2));
        }
        E[] eArr = this.onExtraCallback;
        if (i3 < eArr.length) {
            System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
        } else {
            E[] eArr2 = (E[]) onExtraCallback(((i3 * 3) / 2) + 1);
            System.arraycopy(this.onExtraCallback, 0, eArr2, 0, i2);
            System.arraycopy(this.onExtraCallback, i2, eArr2, i2 + 1, this.onExtraCallbackWithResult - i2);
            this.onExtraCallback = eArr2;
        }
        this.onExtraCallback[i2] = e;
        this.onExtraCallbackWithResult++;
        ((AbstractList) this).modCount++;
    }

    public E get(int i2) {
        onExtraCallbackWithResult(i2);
        return this.onExtraCallback[i2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public E remove(int i2) {
        IAuthTabCallback();
        onExtraCallbackWithResult(i2);
        E[] eArr = this.onExtraCallback;
        E e = eArr[i2];
        if (i2 < this.onExtraCallbackWithResult - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (r2 - i2) - 1);
        }
        this.onExtraCallbackWithResult--;
        ((AbstractList) this).modCount++;
        return e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public E set(int i2, E e) {
        IAuthTabCallback();
        onExtraCallbackWithResult(i2);
        E[] eArr = this.onExtraCallback;
        E e2 = eArr[i2];
        eArr[i2] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    public int size() {
        return this.onExtraCallbackWithResult;
    }

    private static <E> E[] onExtraCallback(int i2) {
        return (E[]) new Object[i2];
    }

    private void onExtraCallbackWithResult(int i2) {
        if (i2 < 0 || i2 >= this.onExtraCallbackWithResult) {
            throw new IndexOutOfBoundsException(onWarmupCompleted(i2));
        }
    }

    private String onWarmupCompleted(int i2) {
        return "Index:" + i2 + ", Size:" + this.onExtraCallbackWithResult;
    }
}
