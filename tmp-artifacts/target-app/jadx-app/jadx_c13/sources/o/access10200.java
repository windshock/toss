package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.MapConverter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access10200<T> extends setPc<T, T> {
    final TimeUnit IAuthTabCallback;
    final long onExtraCallback;
    final MapConverter onNavigationEvent;

    public access10200(serializeRaw<T> serializeraw, long j, TimeUnit timeUnit, MapConverter mapConverter) {
        super(serializeraw);
        this.onExtraCallback = j;
        this.IAuthTabCallback = timeUnit;
        this.onNavigationEvent = mapConverter;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onWarmupCompleted.subscribe(new onExtraCallback(new access26900(writequoted), this.onExtraCallback, this.IAuthTabCallback, this.onNavigationEvent.onExtraCallbackWithResult()));
    }

    static final class onExtraCallback<T> extends AtomicReference<deserializeUriNullableCollection> implements writeQuoted<T>, deserializeUriNullableCollection, Runnable {
        private static final long serialVersionUID = 786994795061867455L;
        boolean done;
        final writeQuoted<? super T> downstream;
        volatile boolean gate;
        final long timeout;
        final TimeUnit unit;
        deserializeUriNullableCollection upstream;
        final MapConverter.onNavigationEvent worker;

        onExtraCallback(writeQuoted<? super T> writequoted, long j, TimeUnit timeUnit, MapConverter.onNavigationEvent onnavigationevent) {
            this.downstream = writequoted;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = onnavigationevent;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.upstream, deserializeurinullablecollection)) {
                this.upstream = deserializeurinullablecollection;
                this.downstream.IAuthTabCallback(this);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            if (this.gate || this.done) {
                return;
            }
            this.gate = true;
            this.downstream.onExtraCallback(t);
            deserializeUriNullableCollection deserializeurinullablecollection = get();
            if (deserializeurinullablecollection != null) {
                deserializeurinullablecollection.dispose();
            }
            deserializeNumber.replace(this, this.worker.onNavigationEvent(this, this.timeout, this.unit));
        }

        @Override // java.lang.Runnable
        public void run() {
            this.gate = false;
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
                return;
            }
            this.done = true;
            this.downstream.onExtraCallbackWithResult(th);
            this.worker.dispose();
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onExtraCallback();
            this.worker.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.upstream.dispose();
            this.worker.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.worker.isDisposed();
        }
    }
}
