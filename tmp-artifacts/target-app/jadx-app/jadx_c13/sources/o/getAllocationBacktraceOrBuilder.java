package o;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getAllocationBacktraceOrBuilder<T> implements parseNegativeInt<T> {
    static final int onExtraCallback = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object onTransact = new Object();
    final int IAuthTabCallback;
    int IAuthTabCallbackDefault;
    long asBinder;
    final int asInterface;
    AtomicReferenceArray<Object> onExtraCallbackWithResult;
    AtomicReferenceArray<Object> onWarmupCompleted;
    final AtomicLong IAuthTabCallbackStub = new AtomicLong();
    final AtomicLong onNavigationEvent = new AtomicLong();

    private static int onExtraCallbackWithResult(int i) {
        return i;
    }

    public getAllocationBacktraceOrBuilder(int i) {
        int iOnWarmupCompleted = access26400.onWarmupCompleted(Math.max(8, i));
        int i2 = iOnWarmupCompleted - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iOnWarmupCompleted + 1);
        this.onWarmupCompleted = atomicReferenceArray;
        this.asInterface = i2;
        IAuthTabCallback(iOnWarmupCompleted);
        this.onExtraCallbackWithResult = atomicReferenceArray;
        this.IAuthTabCallback = i2;
        this.asBinder = iOnWarmupCompleted - 2;
        onNavigationEvent(0L);
    }

    @Override // o.parsePositiveDecimal
    public boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.onWarmupCompleted;
        long jIAuthTabCallback = IAuthTabCallback();
        int i = this.asInterface;
        int iOnNavigationEvent = onNavigationEvent(jIAuthTabCallback, i);
        if (jIAuthTabCallback < this.asBinder) {
            return onExtraCallback(atomicReferenceArray, t, jIAuthTabCallback, iOnNavigationEvent);
        }
        long j = this.IAuthTabCallbackDefault + jIAuthTabCallback;
        if (onExtraCallbackWithResult(atomicReferenceArray, onNavigationEvent(j, i)) == null) {
            this.asBinder = j - 1;
            return onExtraCallback(atomicReferenceArray, t, jIAuthTabCallback, iOnNavigationEvent);
        }
        if (onExtraCallbackWithResult(atomicReferenceArray, onNavigationEvent(1 + jIAuthTabCallback, i)) == null) {
            return onExtraCallback(atomicReferenceArray, t, jIAuthTabCallback, iOnNavigationEvent);
        }
        IAuthTabCallback(atomicReferenceArray, jIAuthTabCallback, iOnNavigationEvent, t, i);
        return true;
    }

    private boolean onExtraCallback(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        onWarmupCompleted(atomicReferenceArray, i, t);
        onNavigationEvent(j + 1);
        return true;
    }

    private void IAuthTabCallback(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.onWarmupCompleted = atomicReferenceArray2;
        this.asBinder = (j2 + j) - 1;
        onWarmupCompleted(atomicReferenceArray2, i, t);
        IAuthTabCallback(atomicReferenceArray, atomicReferenceArray2);
        onWarmupCompleted(atomicReferenceArray, i, onTransact);
        onNavigationEvent(j + 1);
    }

    private void IAuthTabCallback(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        onWarmupCompleted(atomicReferenceArray, onExtraCallbackWithResult(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private AtomicReferenceArray<Object> onNavigationEvent(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) onExtraCallbackWithResult(atomicReferenceArray, iOnExtraCallbackWithResult);
        onWarmupCompleted(atomicReferenceArray, iOnExtraCallbackWithResult, null);
        return atomicReferenceArray2;
    }

    @Override // o.parseNegativeInt, o.parsePositiveDecimal
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.onExtraCallbackWithResult;
        long jOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i = this.IAuthTabCallback;
        int iOnNavigationEvent = onNavigationEvent(jOnExtraCallbackWithResult, i);
        T t = (T) onExtraCallbackWithResult(atomicReferenceArray, iOnNavigationEvent);
        boolean z = t == onTransact;
        if (t == null || z) {
            if (z) {
                return IAuthTabCallback(onNavigationEvent(atomicReferenceArray, i + 1), jOnExtraCallbackWithResult, i);
            }
            return null;
        }
        onWarmupCompleted(atomicReferenceArray, iOnNavigationEvent, null);
        onExtraCallback(jOnExtraCallbackWithResult + 1);
        return t;
    }

    private T IAuthTabCallback(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.onExtraCallbackWithResult = atomicReferenceArray;
        int iOnNavigationEvent = onNavigationEvent(j, i);
        T t = (T) onExtraCallbackWithResult(atomicReferenceArray, iOnNavigationEvent);
        if (t != null) {
            onWarmupCompleted(atomicReferenceArray, iOnNavigationEvent, null);
            onExtraCallback(j + 1);
        }
        return t;
    }

    @Override // o.parsePositiveDecimal
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // o.parsePositiveDecimal
    public boolean isEmpty() {
        return onWarmupCompleted() == onExtraCallback();
    }

    private void IAuthTabCallback(int i) {
        this.IAuthTabCallbackDefault = Math.min(i / 4, onExtraCallback);
    }

    private long onWarmupCompleted() {
        return this.IAuthTabCallbackStub.get();
    }

    private long onExtraCallback() {
        return this.onNavigationEvent.get();
    }

    private long IAuthTabCallback() {
        return this.IAuthTabCallbackStub.get();
    }

    private long onExtraCallbackWithResult() {
        return this.onNavigationEvent.get();
    }

    private void onNavigationEvent(long j) {
        this.IAuthTabCallbackStub.lazySet(j);
    }

    private void onExtraCallback(long j) {
        this.onNavigationEvent.lazySet(j);
    }

    private static int onNavigationEvent(long j, int i) {
        return onExtraCallbackWithResult(((int) j) & i);
    }

    private static void onWarmupCompleted(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    private static <E> Object onExtraCallbackWithResult(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    public boolean IAuthTabCallback(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.onWarmupCompleted;
        long jOnWarmupCompleted = onWarmupCompleted();
        int i = this.asInterface;
        long j = 2 + jOnWarmupCompleted;
        if (onExtraCallbackWithResult(atomicReferenceArray, onNavigationEvent(j, i)) == null) {
            int iOnNavigationEvent = onNavigationEvent(jOnWarmupCompleted, i);
            onWarmupCompleted(atomicReferenceArray, iOnNavigationEvent + 1, t2);
            onWarmupCompleted(atomicReferenceArray, iOnNavigationEvent, t);
            onNavigationEvent(j);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.onWarmupCompleted = atomicReferenceArray2;
        int iOnNavigationEvent2 = onNavigationEvent(jOnWarmupCompleted, i);
        onWarmupCompleted(atomicReferenceArray2, iOnNavigationEvent2 + 1, t2);
        onWarmupCompleted(atomicReferenceArray2, iOnNavigationEvent2, t);
        IAuthTabCallback(atomicReferenceArray, atomicReferenceArray2);
        onWarmupCompleted(atomicReferenceArray, iOnNavigationEvent2, onTransact);
        onNavigationEvent(j);
        return true;
    }
}
