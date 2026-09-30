package o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class serializeNullableMap extends wasLastName {
    final TimeUnit onExtraCallback;
    final MapConverter onExtraCallbackWithResult;
    final long onWarmupCompleted;

    public serializeNullableMap(long j, TimeUnit timeUnit, MapConverter mapConverter) {
        this.onWarmupCompleted = j;
        this.onExtraCallback = timeUnit;
        this.onExtraCallbackWithResult = mapConverter;
    }

    @Override // o.wasLastName
    public void IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        onExtraCallback onextracallback = new onExtraCallback(jsonReaderDoublePrecision);
        jsonReaderDoublePrecision.IAuthTabCallback(onextracallback);
        onextracallback.onWarmupCompleted(this.onExtraCallbackWithResult.onNavigationEvent(onextracallback, this.onWarmupCompleted, this.onExtraCallback));
    }

    static final class onExtraCallback extends AtomicReference<deserializeUriNullableCollection> implements deserializeUriNullableCollection, Runnable {
        private static final long serialVersionUID = 3167244060586201109L;
        final JsonReaderDoublePrecision downstream;

        onExtraCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
            this.downstream = jsonReaderDoublePrecision;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.downstream.onExtraCallback();
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeNumber.dispose(this);
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return deserializeNumber.isDisposed(get());
        }

        void onWarmupCompleted(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.replace(this, deserializeurinullablecollection);
        }
    }
}
