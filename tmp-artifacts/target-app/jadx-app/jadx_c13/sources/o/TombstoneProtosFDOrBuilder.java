package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosFDOrBuilder<T> extends setPc<T, T> {
    final MapConverter onExtraCallbackWithResult;

    public TombstoneProtosFDOrBuilder(serializeRaw<T> serializeraw, MapConverter mapConverter) {
        super(serializeraw);
        this.onExtraCallbackWithResult = mapConverter;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        onNavigationEvent onnavigationevent = new onNavigationEvent(writequoted);
        writequoted.IAuthTabCallback(onnavigationevent);
        onnavigationevent.onWarmupCompleted(this.onExtraCallbackWithResult.onExtraCallback(new onExtraCallbackWithResult(onnavigationevent)));
    }

    static final class onNavigationEvent<T> extends AtomicReference<deserializeUriNullableCollection> implements writeQuoted<T>, deserializeUriNullableCollection {
        private static final long serialVersionUID = 8094547886072529208L;
        final writeQuoted<? super T> downstream;
        final AtomicReference<deserializeUriNullableCollection> upstream = new AtomicReference<>();

        onNavigationEvent(writeQuoted<? super T> writequoted) {
            this.downstream = writequoted;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.setOnce(this.upstream, deserializeurinullablecollection);
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            this.downstream.onExtraCallback(t);
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            this.downstream.onExtraCallbackWithResult(th);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            this.downstream.onExtraCallback();
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeNumber.dispose(this.upstream);
            deserializeNumber.dispose(this);
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return deserializeNumber.isDisposed(get());
        }

        void onWarmupCompleted(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.setOnce(this, deserializeurinullablecollection);
        }
    }

    final class onExtraCallbackWithResult implements Runnable {
        private final onNavigationEvent<T> onNavigationEvent;

        onExtraCallbackWithResult(onNavigationEvent<T> onnavigationevent) {
            this.onNavigationEvent = onnavigationevent;
        }

        @Override // java.lang.Runnable
        public void run() {
            TombstoneProtosFDOrBuilder.this.onWarmupCompleted.subscribe(this.onNavigationEvent);
        }
    }
}
