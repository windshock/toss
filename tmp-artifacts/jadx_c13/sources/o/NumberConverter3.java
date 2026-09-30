package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NumberConverter3 extends wasLastName {
    final MapConverter IAuthTabCallback;
    final JsonReaderErrorInfo onNavigationEvent;

    public NumberConverter3(JsonReaderErrorInfo jsonReaderErrorInfo, MapConverter mapConverter) {
        this.onNavigationEvent = jsonReaderErrorInfo;
        this.IAuthTabCallback = mapConverter;
    }

    @Override // o.wasLastName
    public void IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        this.onNavigationEvent.onExtraCallbackWithResult(new onNavigationEvent(jsonReaderDoublePrecision, this.IAuthTabCallback));
    }

    static final class onNavigationEvent extends AtomicReference<deserializeUriNullableCollection> implements JsonReaderDoublePrecision, deserializeUriNullableCollection, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final JsonReaderDoublePrecision downstream;
        Throwable error;
        final MapConverter scheduler;

        onNavigationEvent(JsonReaderDoublePrecision jsonReaderDoublePrecision, MapConverter mapConverter) {
            this.downstream = jsonReaderDoublePrecision;
            this.scheduler = mapConverter;
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeNumber.dispose(this);
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return deserializeNumber.isDisposed(get());
        }

        @Override // o.JsonReaderDoublePrecision
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.setOnce(this, deserializeurinullablecollection)) {
                this.downstream.IAuthTabCallback(this);
            }
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallbackWithResult(Throwable th) {
            this.error = th;
            deserializeNumber.replace(this, this.scheduler.onExtraCallback(this));
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallback() {
            deserializeNumber.replace(this, this.scheduler.onExtraCallback(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.error;
            if (th != null) {
                this.error = null;
                this.downstream.onExtraCallbackWithResult(th);
            } else {
                this.downstream.onExtraCallback();
            }
        }
    }
}
