package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class dv15 {
    private static final dv15 onExtraCallbackWithResult = onExtraCallback().IAuthTabCallback();
    private final boolean onExtraCallback;

    public static onExtraCallback onExtraCallback() {
        return new onExtraCallback();
    }

    public static final class onExtraCallback {
        private boolean IAuthTabCallback;

        private onExtraCallback() {
        }

        public dv15 IAuthTabCallback() {
            return new dv15(this);
        }
    }

    public boolean onWarmupCompleted() {
        return this.onExtraCallback;
    }

    public <T> void onNavigationEvent(dv13<T> dv13Var, jc3 jc3Var, T t) {
        dv13Var.onWarmupCompleted(jc3Var, t, onExtraCallbackWithResult);
    }

    private dv15(onExtraCallback onextracallback) {
        this.onExtraCallback = onextracallback.IAuthTabCallback;
    }
}
