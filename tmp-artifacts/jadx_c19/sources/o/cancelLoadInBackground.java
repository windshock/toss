package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class cancelLoadInBackground<T> {
    private final T onNavigationEvent;
    private cancelLoadInBackground<T> onWarmupCompleted;

    public cancelLoadInBackground(T t, cancelLoadInBackground<T> cancelloadinbackground) {
        this.onNavigationEvent = t;
        this.onWarmupCompleted = cancelloadinbackground;
    }

    public void onWarmupCompleted(cancelLoadInBackground<T> cancelloadinbackground) {
        if (this.onWarmupCompleted != null) {
            throw new IllegalStateException();
        }
        this.onWarmupCompleted = cancelloadinbackground;
    }

    public cancelLoadInBackground<T> onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public T onNavigationEvent() {
        return this.onNavigationEvent;
    }
}
