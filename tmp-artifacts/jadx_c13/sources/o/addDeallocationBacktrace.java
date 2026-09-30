package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class addDeallocationBacktrace<T> extends wasLastName {
    final deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> onExtraCallback;
    final deserializeIp<T> onExtraCallbackWithResult;

    public addDeallocationBacktrace(deserializeIp<T> deserializeip, deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> deserializeintnullablecollection) {
        this.onExtraCallbackWithResult = deserializeip;
        this.onExtraCallback = deserializeintnullablecollection;
    }

    @Override // o.wasLastName
    public void IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(jsonReaderDoublePrecision, this.onExtraCallback);
        jsonReaderDoublePrecision.IAuthTabCallback(onwarmupcompleted);
        this.onExtraCallbackWithResult.IAuthTabCallback(onwarmupcompleted);
    }

    static final class onWarmupCompleted<T> extends AtomicReference<deserializeUriNullableCollection> implements deserializeIpNullableCollection<T>, JsonReaderDoublePrecision, deserializeUriNullableCollection {
        private static final long serialVersionUID = -2177128922851101253L;
        final JsonReaderDoublePrecision downstream;
        final deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> mapper;

        onWarmupCompleted(JsonReaderDoublePrecision jsonReaderDoublePrecision, deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> deserializeintnullablecollection) {
            this.downstream = jsonReaderDoublePrecision;
            this.mapper = deserializeintnullablecollection;
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeNumber.dispose(this);
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return deserializeNumber.isDisposed(get());
        }

        @Override // o.deserializeIpNullableCollection
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.replace(this, deserializeurinullablecollection);
        }

        @Override // o.deserializeIpNullableCollection
        public void onNavigationEvent(T t) {
            try {
                JsonReaderErrorInfo jsonReaderErrorInfo = (JsonReaderErrorInfo) floatExponent.onExtraCallbackWithResult(this.mapper.apply(t), "The mapper returned a null CompletableSource");
                if (isDisposed()) {
                    return;
                }
                jsonReaderErrorInfo.onExtraCallbackWithResult(this);
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                onExtraCallbackWithResult(th);
            }
        }

        @Override // o.deserializeIpNullableCollection
        public void onExtraCallbackWithResult(Throwable th) {
            this.downstream.onExtraCallbackWithResult(th);
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallback() {
            this.downstream.onExtraCallback();
        }
    }
}
