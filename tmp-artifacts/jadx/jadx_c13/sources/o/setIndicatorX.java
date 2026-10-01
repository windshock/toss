package o;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import o.setIndicatorHeight;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class setIndicatorX<T extends setIndicatorHeight & Comparable<? super T>> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater IAuthTabCallback = AtomicIntegerFieldUpdater.newUpdater(setIndicatorX.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    private T[] onWarmupCompleted;

    public final int onNavigationEvent() {
        return IAuthTabCallback.get(this);
    }

    private final void onExtraCallback(int i) {
        IAuthTabCallback.set(this, i);
    }

    public final boolean onWarmupCompleted() {
        return onNavigationEvent() == 0;
    }

    public final T onExtraCallbackWithResult() {
        T[] tArr = this.onWarmupCompleted;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T onExtraCallbackWithResult(int i) {
        T[] tArr = this.onWarmupCompleted;
        Intrinsics.checkNotNull(tArr);
        onExtraCallback(onNavigationEvent() - 1);
        if (i < onNavigationEvent()) {
            onExtraCallback(i, onNavigationEvent());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                Intrinsics.checkNotNull(t);
                T t2 = tArr[i2];
                Intrinsics.checkNotNull(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    onExtraCallback(i, i2);
                    onWarmupCompleted(i2);
                } else {
                    onNavigationEvent(i);
                }
            }
        }
        T t3 = tArr[onNavigationEvent()];
        Intrinsics.checkNotNull(t3);
        t3.onNavigationEvent(null);
        t3.onExtraCallbackWithResult(-1);
        tArr[onNavigationEvent()] = null;
        return t3;
    }

    public final void onExtraCallback(@NotNull T t) {
        t.onNavigationEvent(this);
        setIndicatorHeight[] setindicatorheightArrIAuthTabCallbackStub = IAuthTabCallbackStub();
        int iOnNavigationEvent = onNavigationEvent();
        onExtraCallback(iOnNavigationEvent + 1);
        setindicatorheightArrIAuthTabCallbackStub[iOnNavigationEvent] = t;
        t.onExtraCallbackWithResult(iOnNavigationEvent);
        onWarmupCompleted(iOnNavigationEvent);
    }

    private final void onWarmupCompleted(int i) {
        while (i > 0) {
            T[] tArr = this.onWarmupCompleted;
            Intrinsics.checkNotNull(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            Intrinsics.checkNotNull(t);
            T t2 = tArr[i];
            Intrinsics.checkNotNull(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            onExtraCallback(i, i2);
            i = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(int i) {
        while (true) {
            int i2 = i << 1;
            int i3 = i2 + 1;
            if (i3 >= onNavigationEvent()) {
                return;
            }
            T[] tArr = this.onWarmupCompleted;
            Intrinsics.checkNotNull(tArr);
            int i4 = i2 + 2;
            if (i4 < onNavigationEvent()) {
                T t = tArr[i4];
                Intrinsics.checkNotNull(t);
                T t2 = tArr[i3];
                Intrinsics.checkNotNull(t2);
                if (((Comparable) t).compareTo(t2) >= 0) {
                    i4 = i3;
                }
            }
            T t3 = tArr[i];
            Intrinsics.checkNotNull(t3);
            T t4 = tArr[i4];
            Intrinsics.checkNotNull(t4);
            if (((Comparable) t3).compareTo(t4) <= 0) {
                return;
            }
            onExtraCallback(i, i4);
            i = i4;
        }
    }

    private final T[] IAuthTabCallbackStub() {
        T[] tArr = this.onWarmupCompleted;
        if (tArr == null) {
            T[] tArr2 = (T[]) new setIndicatorHeight[4];
            this.onWarmupCompleted = tArr2;
            return tArr2;
        }
        if (onNavigationEvent() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, onNavigationEvent() << 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        T[] tArr3 = (T[]) ((setIndicatorHeight[]) objArrCopyOf);
        this.onWarmupCompleted = tArr3;
        return tArr3;
    }

    private final void onExtraCallback(int i, int i2) {
        T[] tArr = this.onWarmupCompleted;
        Intrinsics.checkNotNull(tArr);
        T t = tArr[i2];
        Intrinsics.checkNotNull(t);
        T t2 = tArr[i];
        Intrinsics.checkNotNull(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.onExtraCallbackWithResult(i);
        t2.onExtraCallbackWithResult(i2);
    }

    public final T IAuthTabCallback() {
        T t;
        synchronized (this) {
            t = (T) onExtraCallbackWithResult();
        }
        return t;
    }

    public final T onExtraCallback() {
        T t;
        synchronized (this) {
            t = onNavigationEvent() > 0 ? (T) onExtraCallbackWithResult(0) : null;
        }
        return t;
    }

    public final boolean onNavigationEvent(@NotNull T t) {
        boolean z;
        synchronized (this) {
            if (t.onExtraCallback() == null) {
                z = false;
            } else {
                onExtraCallbackWithResult(t.IAuthTabCallback());
                z = true;
            }
        }
        return z;
    }
}
