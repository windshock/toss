package o;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class hasSignalInfo<T> extends getSelinuxLabelBytes<T> implements ListIterator<T>, KMutableListIterator {
    private final getThreadsOrThrow<T> IAuthTabCallback;
    private int onExtraCallback;
    private int onNavigationEvent;
    private putThreads<? extends T> onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hasSignalInfo(@NotNull getThreadsOrThrow<T> getthreadsorthrow, int i) {
        super(i, getthreadsorthrow.size());
        Intrinsics.checkNotNullParameter(getthreadsorthrow, "");
        this.IAuthTabCallback = getthreadsorthrow;
        this.onNavigationEvent = getthreadsorthrow.onNavigationEvent();
        this.onExtraCallback = -1;
        asInterface();
    }

    @Override // java.util.ListIterator
    public T previous() {
        onExtraCallbackWithResult();
        onWarmupCompleted();
        this.onExtraCallback = onExtraCallback() - 1;
        putThreads<? extends T> putthreads = this.onWarmupCompleted;
        if (putthreads == null) {
            Object[] objArrOnExtraCallback = this.IAuthTabCallback.onExtraCallback();
            onNavigationEvent(onExtraCallback() - 1);
            return (T) objArrOnExtraCallback[onExtraCallback()];
        }
        if (onExtraCallback() > putthreads.IAuthTabCallback()) {
            Object[] objArrOnExtraCallback2 = this.IAuthTabCallback.onExtraCallback();
            onNavigationEvent(onExtraCallback() - 1);
            return (T) objArrOnExtraCallback2[onExtraCallback() - putthreads.IAuthTabCallback()];
        }
        onNavigationEvent(onExtraCallback() - 1);
        return putthreads.previous();
    }

    @Override // o.getSelinuxLabelBytes, java.util.ListIterator, java.util.Iterator
    public T next() {
        onExtraCallbackWithResult();
        onNavigationEvent();
        this.onExtraCallback = onExtraCallback();
        putThreads<? extends T> putthreads = this.onWarmupCompleted;
        if (putthreads == null) {
            Object[] objArrOnExtraCallback = this.IAuthTabCallback.onExtraCallback();
            int iOnExtraCallback = onExtraCallback();
            onNavigationEvent(iOnExtraCallback + 1);
            return (T) objArrOnExtraCallback[iOnExtraCallback];
        }
        if (putthreads.hasNext()) {
            onNavigationEvent(onExtraCallback() + 1);
            return putthreads.next();
        }
        Object[] objArrOnExtraCallback2 = this.IAuthTabCallback.onExtraCallback();
        int iOnExtraCallback2 = onExtraCallback();
        onNavigationEvent(iOnExtraCallback2 + 1);
        return (T) objArrOnExtraCallback2[iOnExtraCallback2 - putthreads.IAuthTabCallback()];
    }

    private final void IAuthTabCallbackStub() {
        onWarmupCompleted(this.IAuthTabCallback.size());
        this.onNavigationEvent = this.IAuthTabCallback.onNavigationEvent();
        this.onExtraCallback = -1;
        asInterface();
    }

    private final void asInterface() {
        Object[] objArrOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult();
        if (objArrOnExtraCallbackWithResult == null) {
            this.onWarmupCompleted = null;
            return;
        }
        int iIAuthTabCallback = removeThreads.IAuthTabCallback(this.IAuthTabCallback.size());
        int iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(onExtraCallback(), iIAuthTabCallback);
        int iOnWarmupCompleted = (this.IAuthTabCallback.onWarmupCompleted() / 5) + 1;
        putThreads<? extends T> putthreads = this.onWarmupCompleted;
        if (putthreads == null) {
            this.onWarmupCompleted = new putThreads<>(objArrOnExtraCallbackWithResult, iCoerceAtMost, iIAuthTabCallback, iOnWarmupCompleted);
        } else {
            Intrinsics.checkNotNull(putthreads);
            putthreads.IAuthTabCallback(objArrOnExtraCallbackWithResult, iCoerceAtMost, iIAuthTabCallback, iOnWarmupCompleted);
        }
    }

    @Override // o.getSelinuxLabelBytes, java.util.ListIterator
    public void add(T t) {
        onExtraCallbackWithResult();
        this.IAuthTabCallback.add(onExtraCallback(), t);
        onNavigationEvent(onExtraCallback() + 1);
        IAuthTabCallbackStub();
    }

    @Override // o.getSelinuxLabelBytes, java.util.ListIterator, java.util.Iterator
    public void remove() {
        onExtraCallbackWithResult();
        asBinder();
        this.IAuthTabCallback.remove(this.onExtraCallback);
        if (this.onExtraCallback < onExtraCallback()) {
            onNavigationEvent(this.onExtraCallback);
        }
        IAuthTabCallbackStub();
    }

    @Override // o.getSelinuxLabelBytes, java.util.ListIterator
    public void set(T t) {
        onExtraCallbackWithResult();
        asBinder();
        this.IAuthTabCallback.set(this.onExtraCallback, t);
        this.onNavigationEvent = this.IAuthTabCallback.onNavigationEvent();
        asInterface();
    }

    private final void onExtraCallbackWithResult() {
        if (this.onNavigationEvent != this.IAuthTabCallback.onNavigationEvent()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void asBinder() {
        if (this.onExtraCallback == -1) {
            throw new IllegalStateException();
        }
    }
}
