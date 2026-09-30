package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import o.LazySaveableStateHolderKtExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class LazySaveableStateHolderExternalSyntheticLambda1 extends LazyLayoutKtExternalSyntheticLambda2<Float> implements LazySaveableStateHolderKtExternalSyntheticLambda1.asInterface, RandomAccess, LazyLayoutPagerKtExternalSyntheticLambda0 {
    private static final LazySaveableStateHolderExternalSyntheticLambda1 onExtraCallbackWithResult = new LazySaveableStateHolderExternalSyntheticLambda1(new float[0], 0, false);
    private float[] IAuthTabCallback;
    private int onExtraCallback;

    LazySaveableStateHolderExternalSyntheticLambda1() {
        this(new float[10], 0, true);
    }

    private LazySaveableStateHolderExternalSyntheticLambda1(float[] fArr, int i2, boolean z) {
        super(z);
        this.IAuthTabCallback = fArr;
        this.onExtraCallback = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void removeRange(int i2, int i3) {
        IAuthTabCallback();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.IAuthTabCallback;
        System.arraycopy(fArr, i3, fArr, i2, this.onExtraCallback - i3);
        this.onExtraCallback -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazySaveableStateHolderExternalSyntheticLambda1)) {
            return super.equals(obj);
        }
        LazySaveableStateHolderExternalSyntheticLambda1 lazySaveableStateHolderExternalSyntheticLambda1 = (LazySaveableStateHolderExternalSyntheticLambda1) obj;
        if (this.onExtraCallback != lazySaveableStateHolderExternalSyntheticLambda1.onExtraCallback) {
            return false;
        }
        float[] fArr = lazySaveableStateHolderExternalSyntheticLambda1.IAuthTabCallback;
        for (int i2 = 0; i2 < this.onExtraCallback; i2++) {
            if (Float.floatToIntBits(this.IAuthTabCallback[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i2 = 0; i2 < this.onExtraCallback; i2++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.IAuthTabCallback[i2]);
        }
        return iFloatToIntBits;
    }

    @Override // o.LazySaveableStateHolderKtExternalSyntheticLambda1.asInterface, o.LazySaveableStateHolderKtExternalSyntheticLambda1.asBinder
    /* renamed from: onExtraCallback */
    public LazySaveableStateHolderKtExternalSyntheticLambda1.asInterface onNavigationEvent(int i2) {
        if (i2 < this.onExtraCallback) {
            throw new IllegalArgumentException();
        }
        return new LazySaveableStateHolderExternalSyntheticLambda1(Arrays.copyOf(this.IAuthTabCallback, i2), this.onExtraCallback, true);
    }

    @Override // java.util.List
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public Float get(int i2) {
        return Float.valueOf(onWarmupCompleted(i2));
    }

    public float onWarmupCompleted(int i2) {
        asBinder(i2);
        return this.IAuthTabCallback[i2];
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.IAuthTabCallback[i2] == fFloatValue) {
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
        return this.onExtraCallback;
    }

    @Override // java.util.List
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public Float set(int i2, Float f) {
        return Float.valueOf(onExtraCallback(i2, f.floatValue()));
    }

    public float onExtraCallback(int i2, float f) {
        IAuthTabCallback();
        asBinder(i2);
        float[] fArr = this.IAuthTabCallback;
        float f2 = fArr[i2];
        fArr[i2] = f;
        return f2;
    }

    @Override // java.util.List, java.util.Collection
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f) {
        onNavigationEvent(f.floatValue());
        return true;
    }

    @Override // java.util.List
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void add(int i2, Float f) {
        onWarmupCompleted(i2, f.floatValue());
    }

    public void onNavigationEvent(float f) {
        IAuthTabCallback();
        int i2 = this.onExtraCallback;
        float[] fArr = this.IAuthTabCallback;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.IAuthTabCallback = fArr2;
        }
        float[] fArr3 = this.IAuthTabCallback;
        int i3 = this.onExtraCallback;
        this.onExtraCallback = i3 + 1;
        fArr3[i3] = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void onWarmupCompleted(int i2, float f) {
        int i3;
        IAuthTabCallback();
        if (i2 < 0 || i2 > (i3 = this.onExtraCallback)) {
            throw new IndexOutOfBoundsException(IAuthTabCallbackDefault(i2));
        }
        float[] fArr = this.IAuthTabCallback;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[((i3 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.IAuthTabCallback, i2, fArr2, i2 + 1, this.onExtraCallback - i2);
            this.IAuthTabCallback = fArr2;
        }
        this.IAuthTabCallback[i2] = f;
        this.onExtraCallback++;
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Float> collection) {
        IAuthTabCallback();
        LazySaveableStateHolderKtExternalSyntheticLambda1.onNavigationEvent(collection);
        if (!(collection instanceof LazySaveableStateHolderExternalSyntheticLambda1)) {
            return super.addAll(collection);
        }
        LazySaveableStateHolderExternalSyntheticLambda1 lazySaveableStateHolderExternalSyntheticLambda1 = (LazySaveableStateHolderExternalSyntheticLambda1) collection;
        int i2 = lazySaveableStateHolderExternalSyntheticLambda1.onExtraCallback;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.onExtraCallback;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        float[] fArr = this.IAuthTabCallback;
        if (i4 > fArr.length) {
            this.IAuthTabCallback = Arrays.copyOf(fArr, i4);
        }
        System.arraycopy(lazySaveableStateHolderExternalSyntheticLambda1.IAuthTabCallback, 0, this.IAuthTabCallback, this.onExtraCallback, lazySaveableStateHolderExternalSyntheticLambda1.onExtraCallback);
        this.onExtraCallback = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public Float remove(int i2) {
        IAuthTabCallback();
        asBinder(i2);
        float[] fArr = this.IAuthTabCallback;
        float f = fArr[i2];
        if (i2 < this.onExtraCallback - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (r2 - i2) - 1);
        }
        this.onExtraCallback--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    private void asBinder(int i2) {
        if (i2 < 0 || i2 >= this.onExtraCallback) {
            throw new IndexOutOfBoundsException(IAuthTabCallbackDefault(i2));
        }
    }

    private String IAuthTabCallbackDefault(int i2) {
        return "Index:" + i2 + ", Size:" + this.onExtraCallback;
    }
}
