package o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class access10400$IAuthTabCallback<T, U> extends AtomicInteger implements writeQuoted<T>, deserializeUriNullableCollection {
    private static final long serialVersionUID = 1418547743690811973L;
    final writeQuoted<? super T> downstream;
    final AtomicReference<deserializeUriNullableCollection> upstream = new AtomicReference<>();
    final access10400$IAuthTabCallback<T, U>.onExtraCallbackWithResult otherObserver = new onExtraCallbackWithResult();
    final getLogsOrBuilder error = new getLogsOrBuilder();

    access10400$IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.downstream = writequoted;
    }

    public void dispose() {
        deserializeNumber.dispose(this.upstream);
        deserializeNumber.dispose(this.otherObserver);
    }

    public boolean isDisposed() {
        return deserializeNumber.isDisposed(this.upstream.get());
    }

    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        deserializeNumber.setOnce(this.upstream, deserializeurinullablecollection);
    }

    public void onExtraCallback(T t) {
        TombstoneProtosLogMessage.onNavigationEvent(this.downstream, t, this, this.error);
    }

    public void onExtraCallbackWithResult(Throwable th) {
        deserializeNumber.dispose(this.otherObserver);
        TombstoneProtosLogMessage.onExtraCallbackWithResult(this.downstream, th, this, this.error);
    }

    public void onExtraCallback() {
        deserializeNumber.dispose(this.otherObserver);
        TombstoneProtosLogMessage.onExtraCallback(this.downstream, this, this.error);
    }

    void onWarmupCompleted(Throwable th) {
        deserializeNumber.dispose(this.upstream);
        TombstoneProtosLogMessage.onExtraCallbackWithResult(this.downstream, th, this, this.error);
    }

    void IAuthTabCallback() {
        deserializeNumber.dispose(this.upstream);
        TombstoneProtosLogMessage.onExtraCallback(this.downstream, this, this.error);
    }

    final class onExtraCallbackWithResult extends AtomicReference<deserializeUriNullableCollection> implements writeQuoted<U> {
        private static final long serialVersionUID = -8693423678067375039L;

        onExtraCallbackWithResult() {
        }

        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.setOnce(this, deserializeurinullablecollection);
        }

        public void onExtraCallback(U u) {
            deserializeNumber.dispose(this);
            access10400$IAuthTabCallback.this.IAuthTabCallback();
        }

        public void onExtraCallbackWithResult(Throwable th) {
            access10400$IAuthTabCallback.this.onWarmupCompleted(th);
        }

        public void onExtraCallback() {
            access10400$IAuthTabCallback.this.IAuthTabCallback();
        }
    }
}
