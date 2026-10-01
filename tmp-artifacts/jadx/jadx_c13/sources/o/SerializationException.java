package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
import o.MapConverter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class SerializationException<T> extends ObjectConverter2<T, T> {
    final TimeUnit IAuthTabCallback;
    final long onExtraCallback;
    final MapConverter onWarmupCompleted;

    public SerializationException(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, long j, TimeUnit timeUnit, MapConverter mapConverter) {
        super(jsonReaderUnknownNumberParsing);
        this.onExtraCallback = j;
        this.IAuthTabCallback = timeUnit;
        this.onWarmupCompleted = mapConverter;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onExtraCallbackWithResult(new getTagBytes(ycxexternalsyntheticlambda0), this.onExtraCallback, this.IAuthTabCallback, this.onWarmupCompleted.onExtraCallbackWithResult()));
    }

    static final class onExtraCallbackWithResult<T> extends AtomicLong implements JsonReaderReadObject<T>, ycxExternalSyntheticLambda1 {
        private static final long serialVersionUID = -9102637559663639004L;
        boolean done;
        final ycxExternalSyntheticLambda0<? super T> downstream;
        volatile long index;
        final long timeout;
        deserializeUriNullableCollection timer;
        final TimeUnit unit;
        ycxExternalSyntheticLambda1 upstream;
        final MapConverter.onNavigationEvent worker;

        onExtraCallbackWithResult(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, long j, TimeUnit timeUnit, MapConverter.onNavigationEvent onnavigationevent) {
            this.downstream = ycxexternalsyntheticlambda0;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = onnavigationevent;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.validate(this.upstream, ycxexternalsyntheticlambda1)) {
                this.upstream = ycxexternalsyntheticlambda1;
                this.downstream.onExtraCallback(this);
                ycxexternalsyntheticlambda1.request(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            if (this.done) {
                return;
            }
            long j = this.index + 1;
            this.index = j;
            deserializeUriNullableCollection deserializeurinullablecollection = this.timer;
            if (deserializeurinullablecollection != null) {
                deserializeurinullablecollection.dispose();
            }
            onExtraCallback onextracallback = new onExtraCallback(t, j, this);
            this.timer = onextracallback;
            onextracallback.onExtraCallback(this.worker.onNavigationEvent(onextracallback, this.timeout, this.unit));
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
                return;
            }
            this.done = true;
            deserializeUriNullableCollection deserializeurinullablecollection = this.timer;
            if (deserializeurinullablecollection != null) {
                deserializeurinullablecollection.dispose();
            }
            this.downstream.onWarmupCompleted(th);
            this.worker.dispose();
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            if (this.done) {
                return;
            }
            this.done = true;
            deserializeUriNullableCollection deserializeurinullablecollection = this.timer;
            if (deserializeurinullablecollection != null) {
                deserializeurinullablecollection.dispose();
            }
            onExtraCallback onextracallback = (onExtraCallback) deserializeurinullablecollection;
            if (onextracallback != null) {
                onextracallback.onNavigationEvent();
            }
            this.downstream.onExtraCallbackWithResult();
            this.worker.dispose();
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            if (setLogs.validate(j)) {
                TombstoneProtosLogBufferBuilder.onWarmupCompleted(this, j);
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            this.upstream.cancel();
            this.worker.dispose();
        }

        void IAuthTabCallback(long j, T t, onExtraCallback<T> onextracallback) {
            if (j == this.index) {
                if (get() != 0) {
                    this.downstream.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
                    TombstoneProtosLogBufferBuilder.onExtraCallbackWithResult(this, 1L);
                    onextracallback.dispose();
                } else {
                    cancel();
                    this.downstream.onWarmupCompleted((Throwable) new NetConverter4("Could not deliver value due to lack of requests"));
                }
            }
        }
    }

    static final class onExtraCallback<T> extends AtomicReference<deserializeUriNullableCollection> implements Runnable, deserializeUriNullableCollection {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final AtomicBoolean once = new AtomicBoolean();
        final onExtraCallbackWithResult<T> parent;
        final T value;

        onExtraCallback(T t, long j, onExtraCallbackWithResult<T> onextracallbackwithresult) {
            this.value = t;
            this.idx = j;
            this.parent = onextracallbackwithresult;
        }

        @Override // java.lang.Runnable
        public void run() {
            onNavigationEvent();
        }

        void onNavigationEvent() {
            if (this.once.compareAndSet(false, true)) {
                this.parent.IAuthTabCallback(this.idx, this.value, this);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeNumber.dispose(this);
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return get() == deserializeNumber.DISPOSED;
        }

        public void onExtraCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.replace(this, deserializeurinullablecollection);
        }
    }
}
