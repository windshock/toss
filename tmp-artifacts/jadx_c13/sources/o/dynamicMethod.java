package o;

import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class dynamicMethod<T> extends JsonReaderUnknownNumberParsing<T> {
    final MapConverter IAuthTabCallback;
    final TimeUnit IAuthTabCallbackDefault;
    final deserializeDoubleCollection<T> onExtraCallback;
    onExtraCallback onExtraCallbackWithResult;
    final long onNavigationEvent;
    final int onWarmupCompleted;

    public dynamicMethod(deserializeDoubleCollection<T> deserializedoublecollection) {
        this(deserializedoublecollection, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    public dynamicMethod(deserializeDoubleCollection<T> deserializedoublecollection, int i, long j, TimeUnit timeUnit, MapConverter mapConverter) {
        this.onExtraCallback = deserializedoublecollection;
        this.onWarmupCompleted = i;
        this.onNavigationEvent = j;
        this.IAuthTabCallbackDefault = timeUnit;
        this.IAuthTabCallback = mapConverter;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        onExtraCallback onextracallback;
        boolean z;
        deserializeUriNullableCollection deserializeurinullablecollection;
        synchronized (this) {
            onextracallback = this.onExtraCallbackWithResult;
            if (onextracallback == null) {
                onextracallback = new onExtraCallback(this);
                this.onExtraCallbackWithResult = onextracallback;
            }
            long j = onextracallback.subscriberCount;
            if (j == 0 && (deserializeurinullablecollection = onextracallback.timer) != null) {
                deserializeurinullablecollection.dispose();
            }
            long j2 = j + 1;
            onextracallback.subscriberCount = j2;
            if (onextracallback.connected || j2 != this.onWarmupCompleted) {
                z = false;
            } else {
                z = true;
                onextracallback.connected = true;
            }
        }
        this.onExtraCallback.onExtraCallback((JsonReaderReadObject) new IAuthTabCallback(ycxexternalsyntheticlambda0, this, onextracallback));
        if (z) {
            this.onExtraCallback.onExtraCallbackWithResult(onextracallback);
        }
    }

    void onWarmupCompleted(onExtraCallback onextracallback) {
        synchronized (this) {
            onExtraCallback onextracallback2 = this.onExtraCallbackWithResult;
            if (onextracallback2 == null || onextracallback2 != onextracallback) {
                return;
            }
            long j = onextracallback.subscriberCount - 1;
            onextracallback.subscriberCount = j;
            if (j == 0 && onextracallback.connected) {
                if (this.onNavigationEvent == 0) {
                    onNavigationEvent(onextracallback);
                    return;
                }
                deserializeShortArray deserializeshortarray = new deserializeShortArray();
                onextracallback.timer = deserializeshortarray;
                deserializeshortarray.IAuthTabCallback(this.IAuthTabCallback.onNavigationEvent(onextracallback, this.onNavigationEvent, this.IAuthTabCallbackDefault));
            }
        }
    }

    void onExtraCallbackWithResult(onExtraCallback onextracallback) {
        synchronized (this) {
            if (this.onExtraCallback instanceof parseDelimitedFrom) {
                onExtraCallback onextracallback2 = this.onExtraCallbackWithResult;
                if (onextracallback2 != null && onextracallback2 == onextracallback) {
                    this.onExtraCallbackWithResult = null;
                    onExtraCallback(onextracallback);
                }
                long j = onextracallback.subscriberCount - 1;
                onextracallback.subscriberCount = j;
                if (j == 0) {
                    IAuthTabCallback(onextracallback);
                }
            } else {
                onExtraCallback onextracallback3 = this.onExtraCallbackWithResult;
                if (onextracallback3 != null && onextracallback3 == onextracallback) {
                    onExtraCallback(onextracallback);
                    long j2 = onextracallback.subscriberCount - 1;
                    onextracallback.subscriberCount = j2;
                    if (j2 == 0) {
                        this.onExtraCallbackWithResult = null;
                        IAuthTabCallback(onextracallback);
                    }
                }
            }
        }
    }

    void onExtraCallback(onExtraCallback onextracallback) {
        deserializeUriNullableCollection deserializeurinullablecollection = onextracallback.timer;
        if (deserializeurinullablecollection != null) {
            deserializeurinullablecollection.dispose();
            onextracallback.timer = null;
        }
    }

    void IAuthTabCallback(onExtraCallback onextracallback) {
        deserializeDoubleCollection<T> deserializedoublecollection = this.onExtraCallback;
        if (deserializedoublecollection instanceof deserializeUriNullableCollection) {
            ((deserializeUriNullableCollection) deserializedoublecollection).dispose();
        } else if (deserializedoublecollection instanceof ResettableConnectable) {
            ((ResettableConnectable) deserializedoublecollection).onWarmupCompleted(onextracallback.get());
        }
    }

    void onNavigationEvent(onExtraCallback onextracallback) {
        synchronized (this) {
            if (onextracallback.subscriberCount == 0 && onextracallback == this.onExtraCallbackWithResult) {
                this.onExtraCallbackWithResult = null;
                deserializeUriNullableCollection deserializeurinullablecollection = onextracallback.get();
                deserializeNumber.dispose(onextracallback);
                deserializeDoubleCollection<T> deserializedoublecollection = this.onExtraCallback;
                if (deserializedoublecollection instanceof deserializeUriNullableCollection) {
                    ((deserializeUriNullableCollection) deserializedoublecollection).dispose();
                } else if (deserializedoublecollection instanceof ResettableConnectable) {
                    if (deserializeurinullablecollection == null) {
                        onextracallback.disconnectedEarly = true;
                    } else {
                        ((ResettableConnectable) deserializedoublecollection).onWarmupCompleted(deserializeurinullablecollection);
                    }
                }
            }
        }
    }

    static final class onExtraCallback extends AtomicReference<deserializeUriNullableCollection> implements Runnable, deserializeFloat<deserializeUriNullableCollection> {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        boolean disconnectedEarly;
        final dynamicMethod<?> parent;
        long subscriberCount;
        deserializeUriNullableCollection timer;

        onExtraCallback(dynamicMethod<?> dynamicmethod) {
            this.parent = dynamicmethod;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.parent.onNavigationEvent(this);
        }

        @Override // o.deserializeFloat
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public void accept(deserializeUriNullableCollection deserializeurinullablecollection) throws Exception {
            deserializeNumber.replace(this, deserializeurinullablecollection);
            synchronized (this.parent) {
                if (this.disconnectedEarly) {
                    ((ResettableConnectable) this.parent.onExtraCallback).onWarmupCompleted(deserializeurinullablecollection);
                }
            }
        }
    }

    static final class IAuthTabCallback<T> extends AtomicBoolean implements JsonReaderReadObject<T>, ycxExternalSyntheticLambda1 {
        private static final long serialVersionUID = -7419642935409022375L;
        final onExtraCallback connection;
        final ycxExternalSyntheticLambda0<? super T> downstream;
        final dynamicMethod<T> parent;
        ycxExternalSyntheticLambda1 upstream;

        IAuthTabCallback(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, dynamicMethod<T> dynamicmethod, onExtraCallback onextracallback) {
            this.downstream = ycxexternalsyntheticlambda0;
            this.parent = dynamicmethod;
            this.connection = onextracallback;
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            this.downstream.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            if (compareAndSet(false, true)) {
                this.parent.onExtraCallbackWithResult(this.connection);
                this.downstream.onWarmupCompleted(th);
            } else {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            if (compareAndSet(false, true)) {
                this.parent.onExtraCallbackWithResult(this.connection);
                this.downstream.onExtraCallbackWithResult();
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            this.upstream.request(j);
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            this.upstream.cancel();
            if (compareAndSet(false, true)) {
                this.parent.onWarmupCompleted(this.connection);
            }
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.validate(this.upstream, ycxexternalsyntheticlambda1)) {
                this.upstream = ycxexternalsyntheticlambda1;
                this.downstream.onExtraCallback(this);
            }
        }
    }
}
