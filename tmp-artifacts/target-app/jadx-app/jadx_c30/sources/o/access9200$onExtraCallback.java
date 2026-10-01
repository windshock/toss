package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class access9200$onExtraCallback<T> extends AtomicBoolean implements writeQuoted<T>, deserializeUriNullableCollection {
    private static final long serialVersionUID = 1015244841293359600L;
    final writeQuoted<? super T> downstream;
    final MapConverter scheduler;
    deserializeUriNullableCollection upstream;

    access9200$onExtraCallback(writeQuoted<? super T> writequoted, MapConverter mapConverter) {
        this.downstream = writequoted;
        this.scheduler = mapConverter;
    }

    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        if (deserializeNumber.validate(this.upstream, deserializeurinullablecollection)) {
            this.upstream = deserializeurinullablecollection;
            this.downstream.IAuthTabCallback(this);
        }
    }

    public void onExtraCallback(T t) {
        if (get()) {
            return;
        }
        this.downstream.onExtraCallback(t);
    }

    public void onExtraCallbackWithResult(Throwable th) {
        if (get()) {
            RxJavaPlugins.onExtraCallbackWithResult(th);
        } else {
            this.downstream.onExtraCallbackWithResult(th);
        }
    }

    public void onExtraCallback() {
        if (get()) {
            return;
        }
        this.downstream.onExtraCallback();
    }

    public void dispose() {
        if (compareAndSet(false, true)) {
            this.scheduler.onExtraCallback(new onNavigationEvent());
        }
    }

    public boolean isDisposed() {
        return get();
    }

    final class onNavigationEvent implements Runnable {
        onNavigationEvent() {
        }

        @Override // java.lang.Runnable
        public void run() {
            access9200$onExtraCallback.this.upstream.dispose();
        }
    }
}
