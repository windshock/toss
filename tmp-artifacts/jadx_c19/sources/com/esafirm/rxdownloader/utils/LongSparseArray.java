package com.esafirm.rxdownloader.utils;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class LongSparseArray<E> implements Cloneable {
    private static final Object onExtraCallbackWithResult = new Object();
    private int IAuthTabCallback;
    private boolean onExtraCallback;
    private long[] onNavigationEvent;
    private Object[] onWarmupCompleted;

    public LongSparseArray() {
        this(10);
    }

    public LongSparseArray(int i2) {
        this.onExtraCallback = false;
        if (i2 == 0) {
            this.onNavigationEvent = ContainerHelpers.onExtraCallback;
            this.onWarmupCompleted = ContainerHelpers.onWarmupCompleted;
        } else {
            int iOnWarmupCompleted = ContainerHelpers.onWarmupCompleted(i2);
            this.onNavigationEvent = new long[iOnWarmupCompleted];
            this.onWarmupCompleted = new Object[iOnWarmupCompleted];
        }
        this.IAuthTabCallback = 0;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public LongSparseArray<E> clone() {
        try {
            LongSparseArray<E> longSparseArray = (LongSparseArray) super.clone();
            try {
                longSparseArray.onNavigationEvent = (long[]) this.onNavigationEvent.clone();
                longSparseArray.onWarmupCompleted = (Object[]) this.onWarmupCompleted.clone();
                return longSparseArray;
            } catch (CloneNotSupportedException unused) {
                return longSparseArray;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    public E onWarmupCompleted(long j) {
        return IAuthTabCallback(j, null);
    }

    public E IAuthTabCallback(long j, E e) {
        E e2;
        int iOnNavigationEvent = ContainerHelpers.onNavigationEvent(this.onNavigationEvent, this.IAuthTabCallback, j);
        return (iOnNavigationEvent < 0 || (e2 = (E) this.onWarmupCompleted[iOnNavigationEvent]) == onExtraCallbackWithResult) ? e : e2;
    }

    public void IAuthTabCallback(long j) {
        int iOnNavigationEvent = ContainerHelpers.onNavigationEvent(this.onNavigationEvent, this.IAuthTabCallback, j);
        if (iOnNavigationEvent >= 0) {
            Object[] objArr = this.onWarmupCompleted;
            Object obj = objArr[iOnNavigationEvent];
            Object obj2 = onExtraCallbackWithResult;
            if (obj != obj2) {
                objArr[iOnNavigationEvent] = obj2;
                this.onExtraCallback = true;
            }
        }
    }

    public void onExtraCallback(long j) {
        IAuthTabCallback(j);
    }

    private void onNavigationEvent() {
        int i2 = this.IAuthTabCallback;
        long[] jArr = this.onNavigationEvent;
        Object[] objArr = this.onWarmupCompleted;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != onExtraCallbackWithResult) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.onExtraCallback = false;
        this.IAuthTabCallback = i3;
    }

    public void onExtraCallback(long j, E e) {
        int iOnNavigationEvent = ContainerHelpers.onNavigationEvent(this.onNavigationEvent, this.IAuthTabCallback, j);
        if (iOnNavigationEvent >= 0) {
            this.onWarmupCompleted[iOnNavigationEvent] = e;
            return;
        }
        int i2 = ~iOnNavigationEvent;
        int i3 = this.IAuthTabCallback;
        if (i2 < i3) {
            Object[] objArr = this.onWarmupCompleted;
            if (objArr[i2] == onExtraCallbackWithResult) {
                this.onNavigationEvent[i2] = j;
                objArr[i2] = e;
                return;
            }
        }
        if (this.onExtraCallback && i3 >= this.onNavigationEvent.length) {
            onNavigationEvent();
            i2 = ~ContainerHelpers.onNavigationEvent(this.onNavigationEvent, this.IAuthTabCallback, j);
        }
        int i4 = this.IAuthTabCallback;
        if (i4 >= this.onNavigationEvent.length) {
            int iOnWarmupCompleted = ContainerHelpers.onWarmupCompleted(i4 + 1);
            long[] jArr = new long[iOnWarmupCompleted];
            Object[] objArr2 = new Object[iOnWarmupCompleted];
            long[] jArr2 = this.onNavigationEvent;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.onWarmupCompleted;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.onNavigationEvent = jArr;
            this.onWarmupCompleted = objArr2;
        }
        int i5 = this.IAuthTabCallback - i2;
        if (i5 != 0) {
            long[] jArr3 = this.onNavigationEvent;
            int i6 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i6, i5);
            Object[] objArr4 = this.onWarmupCompleted;
            System.arraycopy(objArr4, i2, objArr4, i6, this.IAuthTabCallback - i2);
        }
        this.onNavigationEvent[i2] = j;
        this.onWarmupCompleted[i2] = e;
        this.IAuthTabCallback++;
    }

    public int onWarmupCompleted() {
        if (this.onExtraCallback) {
            onNavigationEvent();
        }
        return this.IAuthTabCallback;
    }

    public long onWarmupCompleted(int i2) {
        if (this.onExtraCallback) {
            onNavigationEvent();
        }
        return this.onNavigationEvent[i2];
    }

    public E onNavigationEvent(int i2) {
        if (this.onExtraCallback) {
            onNavigationEvent();
        }
        return (E) this.onWarmupCompleted[i2];
    }

    public String toString() {
        if (onWarmupCompleted() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.IAuthTabCallback * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.IAuthTabCallback; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(onWarmupCompleted(i2));
            sb.append('=');
            E eOnNavigationEvent = onNavigationEvent(i2);
            if (eOnNavigationEvent != this) {
                sb.append(eOnNavigationEvent);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
