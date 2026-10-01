package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getExpressInteractionListener {
    private final int IAuthTabCallback;
    private final String onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final String onWarmupCompleted;

    public static IAuthTabCallback onExtraCallback() {
        return new IAuthTabCallback();
    }

    private getExpressInteractionListener(IAuthTabCallback iAuthTabCallback) {
        this.onNavigationEvent = iAuthTabCallback.onExtraCallback;
        this.onWarmupCompleted = iAuthTabCallback.IAuthTabCallback != null ? iAuthTabCallback.IAuthTabCallback : System.getProperty("line.separator");
        this.onExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult;
        this.IAuthTabCallback = iAuthTabCallback.onWarmupCompleted;
    }

    public boolean onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public String onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public String IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public int onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    public static final class IAuthTabCallback {
        private String IAuthTabCallback;
        private boolean onExtraCallback;
        private String onExtraCallbackWithResult;
        private int onWarmupCompleted;

        public getExpressInteractionListener onNavigationEvent() {
            return new getExpressInteractionListener(this);
        }

        public IAuthTabCallback onWarmupCompleted(boolean z) {
            this.onExtraCallback = z;
            return this;
        }

        public IAuthTabCallback onWarmupCompleted(String str) {
            pmi10.onExtraCallbackWithResult("newLineCharacters", str);
            this.IAuthTabCallback = str;
            return this;
        }

        public IAuthTabCallback IAuthTabCallback(String str) {
            pmi10.onExtraCallbackWithResult("indentCharacters", str);
            this.onExtraCallbackWithResult = str;
            return this;
        }

        public IAuthTabCallback onExtraCallbackWithResult(int i) {
            this.onWarmupCompleted = i;
            return this;
        }

        private IAuthTabCallback() {
            this.IAuthTabCallback = System.getProperty("line.separator");
            this.onExtraCallbackWithResult = "  ";
        }
    }
}
