package o;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class end<T> implements createAnimators<T> {
    private static final Object onExtraCallbackWithResult = new Object();
    private volatile Object onNavigationEvent = onExtraCallbackWithResult;
    private volatile createAnimators<T> onWarmupCompleted;

    private end(createAnimators<T> createanimators) {
        this.onWarmupCompleted = createanimators;
    }

    public T get() {
        T t = (T) this.onNavigationEvent;
        if (t != onExtraCallbackWithResult) {
            return t;
        }
        createAnimators<T> createanimators = this.onWarmupCompleted;
        if (createanimators == null) {
            return (T) this.onNavigationEvent;
        }
        T t2 = (T) createanimators.get();
        this.onNavigationEvent = t2;
        this.onWarmupCompleted = null;
        return t2;
    }

    public static <T> createAnimators<T> onExtraCallback(createAnimators<T> createanimators) {
        return ((createanimators instanceof end) || (createanimators instanceof clearValues)) ? createanimators : new end((createAnimators) createAnimator.onWarmupCompleted(createanimators));
    }
}
