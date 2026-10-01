package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access26900<T> implements writeQuoted<T>, deserializeUriNullableCollection {
    ensureLogsIsMutable<Object> IAuthTabCallback;
    deserializeUriNullableCollection asInterface;
    final boolean onExtraCallback;
    final writeQuoted<? super T> onExtraCallbackWithResult;
    volatile boolean onNavigationEvent;
    boolean onWarmupCompleted;

    public access26900(writeQuoted<? super T> writequoted) {
        this(writequoted, false);
    }

    public access26900(writeQuoted<? super T> writequoted, boolean z) {
        this.onExtraCallbackWithResult = writequoted;
        this.onExtraCallback = z;
    }

    @Override // o.writeQuoted
    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        if (deserializeNumber.validate(this.asInterface, deserializeurinullablecollection)) {
            this.asInterface = deserializeurinullablecollection;
            this.onExtraCallbackWithResult.IAuthTabCallback(this);
        }
    }

    @Override // o.deserializeUriNullableCollection
    public void dispose() {
        this.asInterface.dispose();
    }

    @Override // o.deserializeUriNullableCollection
    public boolean isDisposed() {
        return this.asInterface.isDisposed();
    }

    @Override // o.writeQuoted
    public void onExtraCallback(T t) {
        if (this.onNavigationEvent) {
            return;
        }
        if (t == null) {
            this.asInterface.dispose();
            onExtraCallbackWithResult(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.onNavigationEvent) {
                return;
            }
            if (this.onWarmupCompleted) {
                ensureLogsIsMutable<Object> ensurelogsismutable = this.IAuthTabCallback;
                if (ensurelogsismutable == null) {
                    ensurelogsismutable = new ensureLogsIsMutable<>(4);
                    this.IAuthTabCallback = ensurelogsismutable;
                }
                ensurelogsismutable.onNavigationEvent(access26200.next(t));
                return;
            }
            this.onWarmupCompleted = true;
            this.onExtraCallbackWithResult.onExtraCallback(t);
            onNavigationEvent();
        }
    }

    @Override // o.writeQuoted
    public void onExtraCallbackWithResult(Throwable th) {
        if (this.onNavigationEvent) {
            RxJavaPlugins.onExtraCallbackWithResult(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.onNavigationEvent) {
                if (this.onWarmupCompleted) {
                    this.onNavigationEvent = true;
                    ensureLogsIsMutable<Object> ensurelogsismutable = this.IAuthTabCallback;
                    if (ensurelogsismutable == null) {
                        ensurelogsismutable = new ensureLogsIsMutable<>(4);
                        this.IAuthTabCallback = ensurelogsismutable;
                    }
                    Object objError = access26200.error(th);
                    if (this.onExtraCallback) {
                        ensurelogsismutable.onNavigationEvent(objError);
                    } else {
                        ensurelogsismutable.onExtraCallbackWithResult((ensureLogsIsMutable<Object>) objError);
                    }
                    return;
                }
                this.onNavigationEvent = true;
                this.onWarmupCompleted = true;
                z = false;
            }
            if (z) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            } else {
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
            }
        }
    }

    @Override // o.writeQuoted
    public void onExtraCallback() {
        if (this.onNavigationEvent) {
            return;
        }
        synchronized (this) {
            if (this.onNavigationEvent) {
                return;
            }
            if (this.onWarmupCompleted) {
                ensureLogsIsMutable<Object> ensurelogsismutable = this.IAuthTabCallback;
                if (ensurelogsismutable == null) {
                    ensurelogsismutable = new ensureLogsIsMutable<>(4);
                    this.IAuthTabCallback = ensurelogsismutable;
                }
                ensurelogsismutable.onNavigationEvent(access26200.complete());
                return;
            }
            this.onNavigationEvent = true;
            this.onWarmupCompleted = true;
            this.onExtraCallbackWithResult.onExtraCallback();
        }
    }

    void onNavigationEvent() {
        ensureLogsIsMutable<Object> ensurelogsismutable;
        do {
            synchronized (this) {
                ensurelogsismutable = this.IAuthTabCallback;
                if (ensurelogsismutable == null) {
                    this.onWarmupCompleted = false;
                    return;
                }
                this.IAuthTabCallback = null;
            }
        } while (!ensurelogsismutable.onExtraCallback(this.onExtraCallbackWithResult));
    }
}
