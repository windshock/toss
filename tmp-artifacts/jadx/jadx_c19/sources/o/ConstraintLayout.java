package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ConstraintLayout {

    public interface onWarmupCompleted<T> {
        T onWarmupCompleted();
    }

    public static <T> onWarmupCompleted<T> onWarmupCompleted(final onWarmupCompleted<T> onwarmupcompleted) {
        return new onWarmupCompleted<T>() { // from class: o.ConstraintLayout.4
            private volatile T IAuthTabCallback;

            @Override // o.ConstraintLayout.onWarmupCompleted
            public T onWarmupCompleted() {
                if (this.IAuthTabCallback == null) {
                    synchronized (this) {
                        if (this.IAuthTabCallback == null) {
                            this.IAuthTabCallback = (T) markHierarchyDirty.onExtraCallbackWithResult(onwarmupcompleted.onWarmupCompleted());
                        }
                    }
                }
                return this.IAuthTabCallback;
            }
        };
    }
}
