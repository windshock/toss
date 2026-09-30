package o;

import dagger.Lazy;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class clearValues<T> implements createAnimators<T>, Lazy<T> {
    private static final Object IAuthTabCallback = new Object();
    private volatile createAnimators<T> onExtraCallbackWithResult;
    private volatile Object onWarmupCompleted = IAuthTabCallback;

    private clearValues(createAnimators<T> createanimators) {
        this.onExtraCallbackWithResult = createanimators;
    }

    @Override // dagger.Lazy
    public T get() {
        T t = (T) this.onWarmupCompleted;
        return t == IAuthTabCallback ? (T) IAuthTabCallback() : t;
    }

    private Object IAuthTabCallback() {
        Object obj;
        synchronized (this) {
            obj = this.onWarmupCompleted;
            if (obj == IAuthTabCallback) {
                obj = this.onExtraCallbackWithResult.get();
                this.onWarmupCompleted = onExtraCallback(this.onWarmupCompleted, obj);
                this.onExtraCallbackWithResult = null;
            }
        }
        return obj;
    }

    private static Object onExtraCallback(Object obj, Object obj2) {
        if (obj == IAuthTabCallback || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public static <T> createAnimators<T> onExtraCallbackWithResult(createAnimators<T> createanimators) {
        return createanimators instanceof clearValues ? createanimators : new clearValues(createanimators);
    }

    public static <T> Lazy<T> onExtraCallback(createAnimators<T> createanimators) {
        if (createanimators instanceof Lazy) {
            return (Lazy) createanimators;
        }
        return new clearValues((createAnimators) createAnimator.onWarmupCompleted(createanimators));
    }
}
