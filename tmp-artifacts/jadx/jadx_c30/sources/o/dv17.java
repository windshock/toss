package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class dv17 {
    private static final dv17 onWarmupCompleted = onExtraCallback().onExtraCallbackWithResult();
    private final boolean onExtraCallback;

    public static onNavigationEvent onExtraCallback() {
        return new onNavigationEvent();
    }

    public static final class onNavigationEvent {
        private boolean IAuthTabCallback;

        private onNavigationEvent() {
        }

        public boolean onWarmupCompleted() {
            return this.IAuthTabCallback;
        }

        public dv17 onExtraCallbackWithResult() {
            return new dv17(this);
        }
    }

    private dv17(onNavigationEvent onnavigationevent) {
        this.onExtraCallback = onnavigationevent.onWarmupCompleted();
    }
}
