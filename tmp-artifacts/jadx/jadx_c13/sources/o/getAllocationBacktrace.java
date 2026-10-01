package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getAllocationBacktrace<T> implements parseNegativeInt<T> {
    private final AtomicReference<onNavigationEvent<T>> onNavigationEvent = new AtomicReference<>();
    private final AtomicReference<onNavigationEvent<T>> IAuthTabCallback = new AtomicReference<>();

    public getAllocationBacktrace() {
        onNavigationEvent<T> onnavigationevent = new onNavigationEvent<>();
        onExtraCallback(onnavigationevent);
        onNavigationEvent(onnavigationevent);
    }

    @Override // o.parsePositiveDecimal
    public boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        onNavigationEvent<T> onnavigationevent = new onNavigationEvent<>(t);
        onNavigationEvent(onnavigationevent).onExtraCallbackWithResult(onnavigationevent);
        return true;
    }

    @Override // o.parseNegativeInt, o.parsePositiveDecimal
    public T poll() {
        onNavigationEvent<T> onnavigationeventOnExtraCallbackWithResult;
        onNavigationEvent<T> onnavigationeventOnWarmupCompleted = onWarmupCompleted();
        onNavigationEvent<T> onnavigationeventOnExtraCallbackWithResult2 = onnavigationeventOnWarmupCompleted.onExtraCallbackWithResult();
        if (onnavigationeventOnExtraCallbackWithResult2 != null) {
            T tOnExtraCallback = onnavigationeventOnExtraCallbackWithResult2.onExtraCallback();
            onExtraCallback(onnavigationeventOnExtraCallbackWithResult2);
            return tOnExtraCallback;
        }
        if (onnavigationeventOnWarmupCompleted == onExtraCallback()) {
            return null;
        }
        do {
            onnavigationeventOnExtraCallbackWithResult = onnavigationeventOnWarmupCompleted.onExtraCallbackWithResult();
        } while (onnavigationeventOnExtraCallbackWithResult == null);
        T tOnExtraCallback2 = onnavigationeventOnExtraCallbackWithResult.onExtraCallback();
        onExtraCallback(onnavigationeventOnExtraCallbackWithResult);
        return tOnExtraCallback2;
    }

    @Override // o.parsePositiveDecimal
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    onNavigationEvent<T> onExtraCallback() {
        return this.onNavigationEvent.get();
    }

    onNavigationEvent<T> onNavigationEvent(onNavigationEvent<T> onnavigationevent) {
        return this.onNavigationEvent.getAndSet(onnavigationevent);
    }

    onNavigationEvent<T> IAuthTabCallback() {
        return this.IAuthTabCallback.get();
    }

    onNavigationEvent<T> onWarmupCompleted() {
        return this.IAuthTabCallback.get();
    }

    void onExtraCallback(onNavigationEvent<T> onnavigationevent) {
        this.IAuthTabCallback.lazySet(onnavigationevent);
    }

    @Override // o.parsePositiveDecimal
    public boolean isEmpty() {
        return IAuthTabCallback() == onExtraCallback();
    }

    static final class onNavigationEvent<E> extends AtomicReference<onNavigationEvent<E>> {
        private static final long serialVersionUID = 2404266111789071508L;
        private E value;

        onNavigationEvent() {
        }

        onNavigationEvent(E e) {
            onNavigationEvent(e);
        }

        public E onExtraCallback() {
            E eIAuthTabCallback = IAuthTabCallback();
            onNavigationEvent(null);
            return eIAuthTabCallback;
        }

        public E IAuthTabCallback() {
            return this.value;
        }

        public void onNavigationEvent(E e) {
            this.value = e;
        }

        public void onExtraCallbackWithResult(onNavigationEvent<E> onnavigationevent) {
            lazySet(onnavigationevent);
        }

        public onNavigationEvent<E> onExtraCallbackWithResult() {
            return get();
        }
    }
}
