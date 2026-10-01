package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class clearFunctionOffset$onExtraCallback<T> extends AtomicReference<deserializeUriNullableCollection> implements ensureCapacity<T>, JsonReaderDoublePrecision, deserializeUriNullableCollection {
    private static final long serialVersionUID = -2177128922851101253L;
    final JsonReaderDoublePrecision downstream;
    final deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> mapper;

    clearFunctionOffset$onExtraCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision, deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> deserializeintnullablecollection) {
        this.downstream = jsonReaderDoublePrecision;
        this.mapper = deserializeintnullablecollection;
    }

    public void dispose() {
        deserializeNumber.dispose(this);
    }

    public boolean isDisposed() {
        return deserializeNumber.isDisposed(get());
    }

    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        deserializeNumber.replace(this, deserializeurinullablecollection);
    }

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

    public void onExtraCallbackWithResult(Throwable th) {
        this.downstream.onExtraCallbackWithResult(th);
    }

    public void onExtraCallback() {
        this.downstream.onExtraCallback();
    }
}
