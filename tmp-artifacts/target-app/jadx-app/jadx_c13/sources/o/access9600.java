package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access9600<T> extends writeRaw<T> {
    final deserializeIp<T> IAuthTabCallback;
    final deserializeDecimalCollection onNavigationEvent;

    public access9600(deserializeIp<T> deserializeip, deserializeDecimalCollection deserializedecimalcollection) {
        this.IAuthTabCallback = deserializeip;
        this.onNavigationEvent = deserializedecimalcollection;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        this.IAuthTabCallback.IAuthTabCallback(new onExtraCallback(deserializeipnullablecollection, this.onNavigationEvent));
    }

    static final class onExtraCallback<T> extends AtomicInteger implements deserializeIpNullableCollection<T>, deserializeUriNullableCollection {
        private static final long serialVersionUID = 4109457741734051389L;
        final deserializeIpNullableCollection<? super T> downstream;
        final deserializeDecimalCollection onFinally;
        deserializeUriNullableCollection upstream;

        onExtraCallback(deserializeIpNullableCollection<? super T> deserializeipnullablecollection, deserializeDecimalCollection deserializedecimalcollection) {
            this.downstream = deserializeipnullablecollection;
            this.onFinally = deserializedecimalcollection;
        }

        @Override // o.deserializeIpNullableCollection
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.upstream, deserializeurinullablecollection)) {
                this.upstream = deserializeurinullablecollection;
                this.downstream.IAuthTabCallback(this);
            }
        }

        @Override // o.deserializeIpNullableCollection
        public void onNavigationEvent(T t) {
            this.downstream.onNavigationEvent(t);
            IAuthTabCallback();
        }

        @Override // o.deserializeIpNullableCollection
        public void onExtraCallbackWithResult(Throwable th) {
            this.downstream.onExtraCallbackWithResult(th);
            IAuthTabCallback();
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.upstream.dispose();
            IAuthTabCallback();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        void IAuthTabCallback() {
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
