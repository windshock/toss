package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PAGRewardFullExpressAdListenerProxy1 {

    public static class onExtraCallback<A extends Comparable<A>> {
        private final A IAuthTabCallback;

        private onExtraCallback(A a) {
            this.IAuthTabCallback = a;
        }

        public boolean onExtraCallback(A a, A a2) {
            return onWarmupCompleted(a, a2) || onWarmupCompleted(a2, a);
        }

        public boolean onNavigationEvent(A a, A a2) {
            return IAuthTabCallback(a, a2) || IAuthTabCallback(a2, a);
        }

        private boolean onWarmupCompleted(A a, A a2) {
            return onExtraCallbackWithResult(a) && onWarmupCompleted(a2);
        }

        private boolean IAuthTabCallback(A a, A a2) {
            return IAuthTabCallback(a) && onNavigationEvent(a2);
        }

        public boolean IAuthTabCallback(A a) {
            return this.IAuthTabCallback.compareTo(a) > 0;
        }

        public boolean onExtraCallbackWithResult(A a) {
            return this.IAuthTabCallback.compareTo(a) >= 0;
        }

        public boolean onNavigationEvent(A a) {
            return this.IAuthTabCallback.compareTo(a) < 0;
        }

        public boolean onWarmupCompleted(A a) {
            return this.IAuthTabCallback.compareTo(a) <= 0;
        }
    }

    public static <A extends Comparable<A>> onExtraCallback<A> IAuthTabCallback(A a) {
        return new onExtraCallback<>(a);
    }
}
