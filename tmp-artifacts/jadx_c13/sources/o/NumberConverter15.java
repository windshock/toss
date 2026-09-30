package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NumberConverter15 extends wasLastName {
    final JsonReaderErrorInfo onExtraCallback;
    final JsonReaderErrorInfo onWarmupCompleted;

    public NumberConverter15(JsonReaderErrorInfo jsonReaderErrorInfo, JsonReaderErrorInfo jsonReaderErrorInfo2) {
        this.onExtraCallback = jsonReaderErrorInfo;
        this.onWarmupCompleted = jsonReaderErrorInfo2;
    }

    @Override // o.wasLastName
    public void IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        this.onExtraCallback.onExtraCallbackWithResult(new onExtraCallbackWithResult(jsonReaderDoublePrecision, this.onWarmupCompleted));
    }

    static final class onExtraCallbackWithResult extends AtomicReference<deserializeUriNullableCollection> implements JsonReaderDoublePrecision, deserializeUriNullableCollection {
        private static final long serialVersionUID = -4101678820158072998L;
        final JsonReaderDoublePrecision actualObserver;
        final JsonReaderErrorInfo next;

        onExtraCallbackWithResult(JsonReaderDoublePrecision jsonReaderDoublePrecision, JsonReaderErrorInfo jsonReaderErrorInfo) {
            this.actualObserver = jsonReaderDoublePrecision;
            this.next = jsonReaderErrorInfo;
        }

        @Override // o.JsonReaderDoublePrecision
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.setOnce(this, deserializeurinullablecollection)) {
                this.actualObserver.IAuthTabCallback(this);
            }
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallbackWithResult(Throwable th) {
            this.actualObserver.onExtraCallbackWithResult(th);
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallback() {
            this.next.onExtraCallbackWithResult(new onWarmupCompleted(this, this.actualObserver));
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeNumber.dispose(this);
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return deserializeNumber.isDisposed(get());
        }
    }

    static final class onWarmupCompleted implements JsonReaderDoublePrecision {
        final AtomicReference<deserializeUriNullableCollection> onExtraCallbackWithResult;
        final JsonReaderDoublePrecision onWarmupCompleted;

        onWarmupCompleted(AtomicReference<deserializeUriNullableCollection> atomicReference, JsonReaderDoublePrecision jsonReaderDoublePrecision) {
            this.onExtraCallbackWithResult = atomicReference;
            this.onWarmupCompleted = jsonReaderDoublePrecision;
        }

        @Override // o.JsonReaderDoublePrecision
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.replace(this.onExtraCallbackWithResult, deserializeurinullablecollection);
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallback() {
            this.onWarmupCompleted.onExtraCallback();
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallbackWithResult(Throwable th) {
            this.onWarmupCompleted.onExtraCallbackWithResult(th);
        }
    }
}
