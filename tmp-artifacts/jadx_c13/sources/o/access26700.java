package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access26700<T> {
    int IAuthTabCallback;
    final float onExtraCallback;
    T[] onExtraCallbackWithResult;
    int onNavigationEvent;
    int onWarmupCompleted;

    static int onWarmupCompleted(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    public access26700() {
        this(16, 0.75f);
    }

    public access26700(int i) {
        this(i, 0.75f);
    }

    public access26700(int i, float f) {
        this.onExtraCallback = f;
        int iOnWarmupCompleted = access26400.onWarmupCompleted(i);
        this.onWarmupCompleted = iOnWarmupCompleted - 1;
        this.onNavigationEvent = (int) (f * iOnWarmupCompleted);
        this.onExtraCallbackWithResult = (T[]) new Object[iOnWarmupCompleted];
    }

    public boolean IAuthTabCallback(T t) {
        T t2;
        T[] tArr = this.onExtraCallbackWithResult;
        int i = this.onWarmupCompleted;
        int iOnWarmupCompleted = onWarmupCompleted(t.hashCode()) & i;
        T t3 = tArr[iOnWarmupCompleted];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                iOnWarmupCompleted = (iOnWarmupCompleted + 1) & i;
                t2 = tArr[iOnWarmupCompleted];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[iOnWarmupCompleted] = t;
        int i2 = this.IAuthTabCallback + 1;
        this.IAuthTabCallback = i2;
        if (i2 >= this.onNavigationEvent) {
            onExtraCallbackWithResult();
        }
        return true;
    }

    public boolean onExtraCallbackWithResult(T t) {
        T t2;
        T[] tArr = this.onExtraCallbackWithResult;
        int i = this.onWarmupCompleted;
        int iOnWarmupCompleted = onWarmupCompleted(t.hashCode()) & i;
        T t3 = tArr[iOnWarmupCompleted];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return onWarmupCompleted(iOnWarmupCompleted, tArr, i);
        }
        do {
            iOnWarmupCompleted = (iOnWarmupCompleted + 1) & i;
            t2 = tArr[iOnWarmupCompleted];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return onWarmupCompleted(iOnWarmupCompleted, tArr, i);
    }

    boolean onWarmupCompleted(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.IAuthTabCallback--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int iOnWarmupCompleted = onWarmupCompleted(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= iOnWarmupCompleted || iOnWarmupCompleted > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else if (i < iOnWarmupCompleted || iOnWarmupCompleted <= i3) {
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    void onExtraCallbackWithResult() {
        T t;
        T[] tArr = this.onExtraCallbackWithResult;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (T[]) new Object[i];
        for (int i3 = this.IAuthTabCallback; i3 != 0; i3--) {
            do {
                length--;
                t = tArr[length];
            } while (t == null);
            int iOnWarmupCompleted = onWarmupCompleted(t.hashCode()) & i2;
            if (tArr2[iOnWarmupCompleted] != null) {
                do {
                    iOnWarmupCompleted = (iOnWarmupCompleted + 1) & i2;
                } while (tArr2[iOnWarmupCompleted] != null);
            }
            tArr2[iOnWarmupCompleted] = tArr[length];
        }
        this.onWarmupCompleted = i2;
        this.onNavigationEvent = (int) (i * this.onExtraCallback);
        this.onExtraCallbackWithResult = tArr2;
    }

    public Object[] onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public int onNavigationEvent() {
        return this.IAuthTabCallback;
    }
}
