package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class dv51<T> implements dv12<T> {
    private volatile dv12<T> IAuthTabCallback;
    private final Class<T> onExtraCallbackWithResult;
    private final dv18 onNavigationEvent;

    dv51(dv18 dv18Var, Class<T> cls) {
        this.onNavigationEvent = dv18Var;
        this.onExtraCallbackWithResult = cls;
    }

    @Override // o.dv13
    public void onWarmupCompleted(jc3 jc3Var, T t, dv15 dv15Var) {
        onExtraCallback().onWarmupCompleted(jc3Var, t, dv15Var);
    }

    @Override // o.dv13
    public Class<T> onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.dv16
    public T onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        return onExtraCallback().onNavigationEvent(htfycxVar, dv17Var);
    }

    private dv12<T> onExtraCallback() {
        if (this.IAuthTabCallback == null) {
            this.IAuthTabCallback = this.onNavigationEvent.onNavigationEvent(this.onExtraCallbackWithResult);
        }
        return this.IAuthTabCallback;
    }
}
