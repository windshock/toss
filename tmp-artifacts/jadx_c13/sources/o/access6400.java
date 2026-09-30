package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class access6400<T> implements Iterator<T>, KMappedMarker {
    private int onExtraCallback;
    private T onExtraCallbackWithResult;

    protected abstract void onNavigationEvent();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i = this.onExtraCallback;
        if (i == 0) {
            return onWarmupCompleted();
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.onExtraCallback;
        if (i == 1) {
            this.onExtraCallback = 0;
            return this.onExtraCallbackWithResult;
        }
        if (i == 2 || !onWarmupCompleted()) {
            throw new NoSuchElementException();
        }
        this.onExtraCallback = 0;
        return this.onExtraCallbackWithResult;
    }

    private final boolean onWarmupCompleted() {
        this.onExtraCallback = 3;
        onNavigationEvent();
        return this.onExtraCallback == 1;
    }

    public final void onExtraCallback(T t) {
        this.onExtraCallbackWithResult = t;
        this.onExtraCallback = 1;
    }

    public final void onExtraCallback() {
        this.onExtraCallback = 2;
    }
}
