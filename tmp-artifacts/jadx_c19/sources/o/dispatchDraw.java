package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class dispatchDraw {
    public abstract void onExtraCallback();

    abstract void onNavigationEvent(boolean z);

    public static dispatchDraw onWarmupCompleted() {
        return new IAuthTabCallback();
    }

    private dispatchDraw() {
    }

    static class IAuthTabCallback extends dispatchDraw {
        private volatile boolean onExtraCallbackWithResult;

        IAuthTabCallback() {
            super();
        }

        @Override // o.dispatchDraw
        public void onExtraCallback() {
            if (this.onExtraCallbackWithResult) {
                throw new IllegalStateException("Already released");
            }
        }

        @Override // o.dispatchDraw
        public void onNavigationEvent(boolean z) {
            this.onExtraCallbackWithResult = z;
        }
    }
}
