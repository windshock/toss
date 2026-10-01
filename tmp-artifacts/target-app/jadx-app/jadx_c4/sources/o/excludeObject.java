package o;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class excludeObject implements matchNames<Object> {
    private final Object IAuthTabCallback = new Object();
    private final excludeType onExtraCallback;
    private volatile Object onNavigationEvent;

    public excludeObject(excludeType excludetype) {
        this.onExtraCallback = excludetype;
    }

    @Override // o.matchNames
    public Object generatedComponent() {
        if (this.onNavigationEvent == null) {
            synchronized (this.IAuthTabCallback) {
                if (this.onNavigationEvent == null) {
                    this.onNavigationEvent = this.onExtraCallback.onExtraCallback();
                }
            }
        }
        return this.onNavigationEvent;
    }
}
