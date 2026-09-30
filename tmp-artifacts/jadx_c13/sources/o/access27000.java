package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class access27000<T> extends access27300<T> {
    volatile boolean onExtraCallback;
    final access27300<T> onExtraCallbackWithResult;
    boolean onNavigationEvent;
    ensureLogsIsMutable<Object> onWarmupCompleted;

    access27000(access27300<T> access27300Var) {
        this.onExtraCallbackWithResult = access27300Var;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.onExtraCallbackWithResult.subscribe(ycxexternalsyntheticlambda0);
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        if (!this.onExtraCallback) {
            synchronized (this) {
                boolean z = true;
                if (!this.onExtraCallback) {
                    if (this.onNavigationEvent) {
                        ensureLogsIsMutable<Object> ensurelogsismutable = this.onWarmupCompleted;
                        if (ensurelogsismutable == null) {
                            ensurelogsismutable = new ensureLogsIsMutable<>(4);
                            this.onWarmupCompleted = ensurelogsismutable;
                        }
                        ensurelogsismutable.onNavigationEvent(access26200.subscription(ycxexternalsyntheticlambda1));
                        return;
                    }
                    this.onNavigationEvent = true;
                    z = false;
                }
                if (!z) {
                    this.onExtraCallbackWithResult.onExtraCallback(ycxexternalsyntheticlambda1);
                    ICustomTabsCallback();
                    return;
                }
            }
        }
        ycxexternalsyntheticlambda1.cancel();
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onWarmupCompleted(T t) {
        if (this.onExtraCallback) {
            return;
        }
        synchronized (this) {
            if (this.onExtraCallback) {
                return;
            }
            if (this.onNavigationEvent) {
                ensureLogsIsMutable<Object> ensurelogsismutable = this.onWarmupCompleted;
                if (ensurelogsismutable == null) {
                    ensurelogsismutable = new ensureLogsIsMutable<>(4);
                    this.onWarmupCompleted = ensurelogsismutable;
                }
                ensurelogsismutable.onNavigationEvent(access26200.next(t));
                return;
            }
            this.onNavigationEvent = true;
            this.onExtraCallbackWithResult.onWarmupCompleted((access27300<T>) t);
            ICustomTabsCallback();
        }
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onWarmupCompleted(Throwable th) {
        if (this.onExtraCallback) {
            RxJavaPlugins.onExtraCallbackWithResult(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.onExtraCallback) {
                this.onExtraCallback = true;
                if (this.onNavigationEvent) {
                    ensureLogsIsMutable<Object> ensurelogsismutable = this.onWarmupCompleted;
                    if (ensurelogsismutable == null) {
                        ensurelogsismutable = new ensureLogsIsMutable<>(4);
                        this.onWarmupCompleted = ensurelogsismutable;
                    }
                    ensurelogsismutable.onExtraCallbackWithResult((ensureLogsIsMutable<Object>) access26200.error(th));
                    return;
                }
                this.onNavigationEvent = true;
                z = false;
            }
            if (z) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            } else {
                this.onExtraCallbackWithResult.onWarmupCompleted(th);
            }
        }
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onExtraCallbackWithResult() {
        if (this.onExtraCallback) {
            return;
        }
        synchronized (this) {
            if (this.onExtraCallback) {
                return;
            }
            this.onExtraCallback = true;
            if (this.onNavigationEvent) {
                ensureLogsIsMutable<Object> ensurelogsismutable = this.onWarmupCompleted;
                if (ensurelogsismutable == null) {
                    ensurelogsismutable = new ensureLogsIsMutable<>(4);
                    this.onWarmupCompleted = ensurelogsismutable;
                }
                ensurelogsismutable.onNavigationEvent(access26200.complete());
                return;
            }
            this.onNavigationEvent = true;
            this.onExtraCallbackWithResult.onExtraCallbackWithResult();
        }
    }

    void ICustomTabsCallback() {
        ensureLogsIsMutable<Object> ensurelogsismutable;
        while (true) {
            synchronized (this) {
                ensurelogsismutable = this.onWarmupCompleted;
                if (ensurelogsismutable == null) {
                    this.onNavigationEvent = false;
                    return;
                }
                this.onWarmupCompleted = null;
            }
            ensurelogsismutable.IAuthTabCallback(this.onExtraCallbackWithResult);
        }
    }
}
