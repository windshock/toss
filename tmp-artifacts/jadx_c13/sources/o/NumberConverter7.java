package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NumberConverter7 extends wasLastName {
    final JsonReaderErrorInfo onExtraCallback;
    final MapConverter onNavigationEvent;

    public NumberConverter7(JsonReaderErrorInfo jsonReaderErrorInfo, MapConverter mapConverter) {
        this.onExtraCallback = jsonReaderErrorInfo;
        this.onNavigationEvent = mapConverter;
    }

    @Override // o.wasLastName
    public void IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        onNavigationEvent onnavigationevent = new onNavigationEvent(jsonReaderDoublePrecision, this.onExtraCallback);
        jsonReaderDoublePrecision.IAuthTabCallback(onnavigationevent);
        onnavigationevent.task.IAuthTabCallback(this.onNavigationEvent.onExtraCallback(onnavigationevent));
    }

    static final class onNavigationEvent extends AtomicReference<deserializeUriNullableCollection> implements JsonReaderDoublePrecision, deserializeUriNullableCollection, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final JsonReaderDoublePrecision downstream;
        final JsonReaderErrorInfo source;
        final deserializeShortArray task = new deserializeShortArray();

        onNavigationEvent(JsonReaderDoublePrecision jsonReaderDoublePrecision, JsonReaderErrorInfo jsonReaderErrorInfo) {
            this.downstream = jsonReaderDoublePrecision;
            this.source = jsonReaderErrorInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.source.onExtraCallbackWithResult(this);
        }

        @Override // o.JsonReaderDoublePrecision
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.setOnce(this, deserializeurinullablecollection);
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallbackWithResult(Throwable th) {
            this.downstream.onExtraCallbackWithResult(th);
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallback() {
            this.downstream.onExtraCallback();
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeNumber.dispose(this);
            this.task.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return deserializeNumber.isDisposed(get());
        }
    }
}
