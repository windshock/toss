package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class dv6<T> implements dv18 {
    private final dv54 IAuthTabCallback;
    private final dv6<?> onExtraCallbackWithResult;
    private final Class<T> onNavigationEvent;

    dv6(dv54 dv54Var, Class<T> cls) {
        this.onNavigationEvent = cls;
        this.onExtraCallbackWithResult = null;
        this.IAuthTabCallback = dv54Var;
    }

    private dv6(dv6<?> dv6Var, Class<T> cls) {
        this.onExtraCallbackWithResult = dv6Var;
        this.onNavigationEvent = cls;
        this.IAuthTabCallback = dv6Var.IAuthTabCallback;
    }

    public Class<T> IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.dv18
    public <U> dv12<U> onNavigationEvent(Class<U> cls) {
        if (onExtraCallbackWithResult(cls).booleanValue()) {
            return new dv51(this.IAuthTabCallback, cls);
        }
        return this.IAuthTabCallback.onWarmupCompleted(new dv6<>((dv6<?>) this, (Class) cls));
    }

    private <U> Boolean onExtraCallbackWithResult(Class<U> cls) {
        for (dv6 dv6Var = this; dv6Var != null; dv6Var = dv6Var.onExtraCallbackWithResult) {
            if (dv6Var.onNavigationEvent.equals(cls)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dv6 dv6Var = (dv6) obj;
        if (!this.onNavigationEvent.equals(dv6Var.onNavigationEvent)) {
            return false;
        }
        dv6<?> dv6Var2 = this.onExtraCallbackWithResult;
        if (dv6Var2 == null ? dv6Var.onExtraCallbackWithResult == null : dv6Var2.equals(dv6Var.onExtraCallbackWithResult)) {
            return this.IAuthTabCallback.equals(dv6Var.IAuthTabCallback);
        }
        return false;
    }

    public int hashCode() {
        dv6<?> dv6Var = this.onExtraCallbackWithResult;
        return ((((dv6Var != null ? dv6Var.hashCode() : 0) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onNavigationEvent.hashCode();
    }
}
