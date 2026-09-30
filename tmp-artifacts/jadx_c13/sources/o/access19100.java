package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access19100<T> extends access18900<T, T> {
    final deserializeDecimalCollection IAuthTabCallback;

    public access19100(writeAscii<T> writeascii, deserializeDecimalCollection deserializedecimalcollection) {
        super(writeascii);
        this.IAuthTabCallback = deserializedecimalcollection;
    }

    @Override // o.advance
    public void onNavigationEvent(ensureCapacity<? super T> ensurecapacity) {
        this.onExtraCallback.onExtraCallback(new onExtraCallbackWithResult(ensurecapacity, this.IAuthTabCallback));
    }

    static final class onExtraCallbackWithResult<T> extends AtomicInteger implements ensureCapacity<T>, deserializeUriNullableCollection {
        private static final long serialVersionUID = 4109457741734051389L;
        final ensureCapacity<? super T> downstream;
        final deserializeDecimalCollection onFinally;
        deserializeUriNullableCollection upstream;

        onExtraCallbackWithResult(ensureCapacity<? super T> ensurecapacity, deserializeDecimalCollection deserializedecimalcollection) {
            this.downstream = ensurecapacity;
            this.onFinally = deserializedecimalcollection;
        }

        @Override // o.ensureCapacity
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.upstream, deserializeurinullablecollection)) {
                this.upstream = deserializeurinullablecollection;
                this.downstream.IAuthTabCallback(this);
            }
        }

        @Override // o.ensureCapacity
        public void onNavigationEvent(T t) {
            this.downstream.onNavigationEvent(t);
            onExtraCallbackWithResult();
        }

        @Override // o.ensureCapacity
        public void onExtraCallbackWithResult(Throwable th) {
            this.downstream.onExtraCallbackWithResult(th);
            onExtraCallbackWithResult();
        }

        @Override // o.ensureCapacity
        public void onExtraCallback() {
            this.downstream.onExtraCallback();
            onExtraCallbackWithResult();
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.upstream.dispose();
            onExtraCallbackWithResult();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        void onExtraCallbackWithResult() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    NumberConverter.onWarmupCompleted(th);
                    RxJavaPlugins.onExtraCallbackWithResult(th);
                }
            }
        }
    }
}
