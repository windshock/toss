package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NumberConverter28 extends wasLastName {
    final JsonReaderErrorInfo[] IAuthTabCallback;

    public NumberConverter28(JsonReaderErrorInfo[] jsonReaderErrorInfoArr) {
        this.IAuthTabCallback = jsonReaderErrorInfoArr;
    }

    @Override // o.wasLastName
    public void IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        deserializeUriCollection deserializeuricollection = new deserializeUriCollection();
        onExtraCallback onextracallback = new onExtraCallback(jsonReaderDoublePrecision, new AtomicBoolean(), deserializeuricollection, this.IAuthTabCallback.length + 1);
        jsonReaderDoublePrecision.IAuthTabCallback(deserializeuricollection);
        for (JsonReaderErrorInfo jsonReaderErrorInfo : this.IAuthTabCallback) {
            if (deserializeuricollection.isDisposed()) {
                return;
            }
            if (jsonReaderErrorInfo == null) {
                deserializeuricollection.dispose();
                onextracallback.onExtraCallbackWithResult(new NullPointerException("A completable source is null"));
                return;
            }
            jsonReaderErrorInfo.onExtraCallbackWithResult(onextracallback);
        }
        onextracallback.onExtraCallback();
    }

    static final class onExtraCallback extends AtomicInteger implements JsonReaderDoublePrecision {
        private static final long serialVersionUID = -8360547806504310570L;
        final JsonReaderDoublePrecision downstream;
        final AtomicBoolean once;
        final deserializeUriCollection set;

        onExtraCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision, AtomicBoolean atomicBoolean, deserializeUriCollection deserializeuricollection, int i) {
            this.downstream = jsonReaderDoublePrecision;
            this.once = atomicBoolean;
            this.set = deserializeuricollection;
            lazySet(i);
        }

        @Override // o.JsonReaderDoublePrecision
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            this.set.onNavigationEvent(deserializeurinullablecollection);
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallbackWithResult(Throwable th) {
            this.set.dispose();
            if (this.once.compareAndSet(false, true)) {
                this.downstream.onExtraCallbackWithResult(th);
            } else {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallback() {
            if (decrementAndGet() == 0 && this.once.compareAndSet(false, true)) {
                this.downstream.onExtraCallback();
            }
        }
    }
}
