package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getTagBytes<T> implements JsonReaderReadObject<T>, ycxExternalSyntheticLambda1 {
    final ycxExternalSyntheticLambda0<? super T> IAuthTabCallback;
    ycxExternalSyntheticLambda1 IAuthTabCallbackDefault;
    final boolean onExtraCallback;
    boolean onExtraCallbackWithResult;
    ensureLogsIsMutable<Object> onNavigationEvent;
    volatile boolean onWarmupCompleted;

    public getTagBytes(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this(ycxexternalsyntheticlambda0, false);
    }

    public getTagBytes(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, boolean z) {
        this.IAuthTabCallback = ycxexternalsyntheticlambda0;
        this.onExtraCallback = z;
    }

    @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
    public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        if (setLogs.validate(this.IAuthTabCallbackDefault, ycxexternalsyntheticlambda1)) {
            this.IAuthTabCallbackDefault = ycxexternalsyntheticlambda1;
            this.IAuthTabCallback.onExtraCallback(this);
        }
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onWarmupCompleted(T t) {
        if (this.onWarmupCompleted) {
            return;
        }
        if (t == null) {
            this.IAuthTabCallbackDefault.cancel();
            onWarmupCompleted((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.onWarmupCompleted) {
                return;
            }
            if (this.onExtraCallbackWithResult) {
                ensureLogsIsMutable<Object> ensurelogsismutable = this.onNavigationEvent;
                if (ensurelogsismutable == null) {
                    ensurelogsismutable = new ensureLogsIsMutable<>(4);
                    this.onNavigationEvent = ensurelogsismutable;
                }
                ensurelogsismutable.onNavigationEvent(access26200.next(t));
                return;
            }
            this.onExtraCallbackWithResult = true;
            this.IAuthTabCallback.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
            onNavigationEvent();
        }
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onWarmupCompleted(Throwable th) {
        if (this.onWarmupCompleted) {
            RxJavaPlugins.onExtraCallbackWithResult(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.onWarmupCompleted) {
                if (this.onExtraCallbackWithResult) {
                    this.onWarmupCompleted = true;
                    ensureLogsIsMutable<Object> ensurelogsismutable = this.onNavigationEvent;
                    if (ensurelogsismutable == null) {
                        ensurelogsismutable = new ensureLogsIsMutable<>(4);
                        this.onNavigationEvent = ensurelogsismutable;
                    }
                    Object objError = access26200.error(th);
                    if (this.onExtraCallback) {
                        ensurelogsismutable.onNavigationEvent(objError);
                    } else {
                        ensurelogsismutable.onExtraCallbackWithResult((ensureLogsIsMutable<Object>) objError);
                    }
                    return;
                }
                this.onWarmupCompleted = true;
                this.onExtraCallbackWithResult = true;
                z = false;
            }
            if (z) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            } else {
                this.IAuthTabCallback.onWarmupCompleted(th);
            }
        }
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onExtraCallbackWithResult() {
        if (this.onWarmupCompleted) {
            return;
        }
        synchronized (this) {
            if (this.onWarmupCompleted) {
                return;
            }
            if (this.onExtraCallbackWithResult) {
                ensureLogsIsMutable<Object> ensurelogsismutable = this.onNavigationEvent;
                if (ensurelogsismutable == null) {
                    ensurelogsismutable = new ensureLogsIsMutable<>(4);
                    this.onNavigationEvent = ensurelogsismutable;
                }
                ensurelogsismutable.onNavigationEvent(access26200.complete());
                return;
            }
            this.onWarmupCompleted = true;
            this.onExtraCallbackWithResult = true;
            this.IAuthTabCallback.onExtraCallbackWithResult();
        }
    }

    void onNavigationEvent() {
        ensureLogsIsMutable<Object> ensurelogsismutable;
        do {
            synchronized (this) {
                ensurelogsismutable = this.onNavigationEvent;
                if (ensurelogsismutable == null) {
                    this.onExtraCallbackWithResult = false;
                    return;
                }
                this.onNavigationEvent = null;
            }
        } while (!ensurelogsismutable.IAuthTabCallback(this.IAuthTabCallback));
    }

    @Override // o.ycxExternalSyntheticLambda1
    public void request(long j) {
        this.IAuthTabCallbackDefault.request(j);
    }

    @Override // o.ycxExternalSyntheticLambda1
    public void cancel() {
        this.IAuthTabCallbackDefault.cancel();
    }
}
