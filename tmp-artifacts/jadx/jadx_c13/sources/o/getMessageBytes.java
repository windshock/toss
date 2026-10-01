package o;

import io.reactivex.plugins.RxJavaPlugins;
import o.ensureLogsIsMutable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getMessageBytes<T> extends setTimestampBytes<T> implements ensureLogsIsMutable.onExtraCallbackWithResult<Object> {
    volatile boolean IAuthTabCallback;
    boolean onExtraCallbackWithResult;
    final setTimestampBytes<T> onNavigationEvent;
    ensureLogsIsMutable<Object> onWarmupCompleted;

    getMessageBytes(setTimestampBytes<T> settimestampbytes) {
        this.onNavigationEvent = settimestampbytes;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onNavigationEvent.subscribe(writequoted);
    }

    @Override // o.writeQuoted
    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        if (!this.IAuthTabCallback) {
            synchronized (this) {
                boolean z = true;
                if (!this.IAuthTabCallback) {
                    if (this.onExtraCallbackWithResult) {
                        ensureLogsIsMutable<Object> ensurelogsismutable = this.onWarmupCompleted;
                        if (ensurelogsismutable == null) {
                            ensurelogsismutable = new ensureLogsIsMutable<>(4);
                            this.onWarmupCompleted = ensurelogsismutable;
                        }
                        ensurelogsismutable.onNavigationEvent(access26200.disposable(deserializeurinullablecollection));
                        return;
                    }
                    this.onExtraCallbackWithResult = true;
                    z = false;
                }
                if (!z) {
                    this.onNavigationEvent.IAuthTabCallback(deserializeurinullablecollection);
                    onExtraCallbackWithResult();
                    return;
                }
            }
        }
        deserializeurinullablecollection.dispose();
    }

    @Override // o.writeQuoted
    public void onExtraCallback(T t) {
        if (this.IAuthTabCallback) {
            return;
        }
        synchronized (this) {
            if (this.IAuthTabCallback) {
                return;
            }
            if (this.onExtraCallbackWithResult) {
                ensureLogsIsMutable<Object> ensurelogsismutable = this.onWarmupCompleted;
                if (ensurelogsismutable == null) {
                    ensurelogsismutable = new ensureLogsIsMutable<>(4);
                    this.onWarmupCompleted = ensurelogsismutable;
                }
                ensurelogsismutable.onNavigationEvent(access26200.next(t));
                return;
            }
            this.onExtraCallbackWithResult = true;
            this.onNavigationEvent.onExtraCallback((setTimestampBytes<T>) t);
            onExtraCallbackWithResult();
        }
    }

    @Override // o.writeQuoted
    public void onExtraCallbackWithResult(Throwable th) {
        if (this.IAuthTabCallback) {
            RxJavaPlugins.onExtraCallbackWithResult(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.IAuthTabCallback) {
                this.IAuthTabCallback = true;
                if (this.onExtraCallbackWithResult) {
                    ensureLogsIsMutable<Object> ensurelogsismutable = this.onWarmupCompleted;
                    if (ensurelogsismutable == null) {
                        ensurelogsismutable = new ensureLogsIsMutable<>(4);
                        this.onWarmupCompleted = ensurelogsismutable;
                    }
                    ensurelogsismutable.onExtraCallbackWithResult((ensureLogsIsMutable<Object>) access26200.error(th));
                    return;
                }
                this.onExtraCallbackWithResult = true;
                z = false;
            }
            if (z) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            } else {
                this.onNavigationEvent.onExtraCallbackWithResult(th);
            }
        }
    }

    @Override // o.writeQuoted
    public void onExtraCallback() {
        if (this.IAuthTabCallback) {
            return;
        }
        synchronized (this) {
            if (this.IAuthTabCallback) {
                return;
            }
            this.IAuthTabCallback = true;
            if (this.onExtraCallbackWithResult) {
                ensureLogsIsMutable<Object> ensurelogsismutable = this.onWarmupCompleted;
                if (ensurelogsismutable == null) {
                    ensurelogsismutable = new ensureLogsIsMutable<>(4);
                    this.onWarmupCompleted = ensurelogsismutable;
                }
                ensurelogsismutable.onNavigationEvent(access26200.complete());
                return;
            }
            this.onExtraCallbackWithResult = true;
            this.onNavigationEvent.onExtraCallback();
        }
    }

    void onExtraCallbackWithResult() {
        ensureLogsIsMutable<Object> ensurelogsismutable;
        while (true) {
            synchronized (this) {
                ensurelogsismutable = this.onWarmupCompleted;
                if (ensurelogsismutable == null) {
                    this.onExtraCallbackWithResult = false;
                    return;
                }
                this.onWarmupCompleted = null;
            }
            ensurelogsismutable.onExtraCallbackWithResult((ensureLogsIsMutable.onExtraCallbackWithResult<? super Object>) this);
        }
    }

    @Override // o.ensureLogsIsMutable.onExtraCallbackWithResult, o.deserializeLongCollection
    public boolean test(Object obj) {
        return access26200.acceptFull(obj, this.onNavigationEvent);
    }
}
