package o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class setOwnerBytes$onNavigationEvent<T> extends AtomicInteger implements writeQuoted<T>, deserializeUriNullableCollection {
    private static final long serialVersionUID = 802743776666017014L;
    volatile boolean active;
    final writeQuoted<? super T> downstream;
    final setTimestampBytes<Object> signaller;
    final serializeRaw<T> source;
    final AtomicInteger wip = new AtomicInteger();
    final getLogsOrBuilder error = new getLogsOrBuilder();
    final setOwnerBytes$onNavigationEvent<T>.IAuthTabCallback inner = new IAuthTabCallback();
    final AtomicReference<deserializeUriNullableCollection> upstream = new AtomicReference<>();

    setOwnerBytes$onNavigationEvent(writeQuoted<? super T> writequoted, setTimestampBytes<Object> settimestampbytes, serializeRaw<T> serializeraw) {
        this.downstream = writequoted;
        this.signaller = settimestampbytes;
        this.source = serializeraw;
    }

    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        deserializeNumber.setOnce(this.upstream, deserializeurinullablecollection);
    }

    public void onExtraCallback(T t) {
        TombstoneProtosLogMessage.onNavigationEvent(this.downstream, t, this, this.error);
    }

    public void onExtraCallbackWithResult(Throwable th) {
        deserializeNumber.dispose(this.inner);
        TombstoneProtosLogMessage.onExtraCallbackWithResult(this.downstream, th, this, this.error);
    }

    public void onExtraCallback() {
        deserializeNumber.replace(this.upstream, (deserializeUriNullableCollection) null);
        this.active = false;
        this.signaller.onExtraCallback(0);
    }

    public boolean isDisposed() {
        return deserializeNumber.isDisposed(this.upstream.get());
    }

    public void dispose() {
        deserializeNumber.dispose(this.upstream);
        deserializeNumber.dispose(this.inner);
    }

    void IAuthTabCallback() {
        onExtraCallbackWithResult();
    }

    void IAuthTabCallback(Throwable th) {
        deserializeNumber.dispose(this.upstream);
        TombstoneProtosLogMessage.onExtraCallbackWithResult(this.downstream, th, this, this.error);
    }

    void onWarmupCompleted() {
        deserializeNumber.dispose(this.upstream);
        TombstoneProtosLogMessage.onExtraCallback(this.downstream, this, this.error);
    }

    void onExtraCallbackWithResult() {
        if (this.wip.getAndIncrement() == 0) {
            while (!isDisposed()) {
                if (!this.active) {
                    this.active = true;
                    this.source.subscribe(this);
                }
                if (this.wip.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    final class IAuthTabCallback extends AtomicReference<deserializeUriNullableCollection> implements writeQuoted<Object> {
        private static final long serialVersionUID = 3254781284376480842L;

        IAuthTabCallback() {
        }

        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.setOnce(this, deserializeurinullablecollection);
        }

        public void onExtraCallback(Object obj) {
            setOwnerBytes$onNavigationEvent.this.IAuthTabCallback();
        }

        public void onExtraCallbackWithResult(Throwable th) {
            setOwnerBytes$onNavigationEvent.this.IAuthTabCallback(th);
        }

        public void onExtraCallback() {
            setOwnerBytes$onNavigationEvent.this.onWarmupCompleted();
        }
    }
}
