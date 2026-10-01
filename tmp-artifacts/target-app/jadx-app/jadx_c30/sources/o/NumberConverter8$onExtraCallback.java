package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class NumberConverter8$onExtraCallback extends AtomicReference<deserializeUriNullableCollection> implements JsonReaderDoublePrecision, deserializeUriNullableCollection {
    private static final long serialVersionUID = 5018523762564524046L;
    final JsonReaderDoublePrecision downstream;
    final deserializeIntNullableCollection<? super Throwable, ? extends JsonReaderErrorInfo> errorMapper;
    boolean once;

    NumberConverter8$onExtraCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision, deserializeIntNullableCollection<? super Throwable, ? extends JsonReaderErrorInfo> deserializeintnullablecollection) {
        this.downstream = jsonReaderDoublePrecision;
        this.errorMapper = deserializeintnullablecollection;
    }

    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        deserializeNumber.replace(this, deserializeurinullablecollection);
    }

    public void onExtraCallback() {
        this.downstream.onExtraCallback();
    }

    public void onExtraCallbackWithResult(Throwable th) {
        if (this.once) {
            this.downstream.onExtraCallbackWithResult(th);
            return;
        }
        this.once = true;
        try {
            ((JsonReaderErrorInfo) floatExponent.onExtraCallbackWithResult(this.errorMapper.apply(th), "The errorMapper returned a null CompletableSource")).onExtraCallbackWithResult(this);
        } catch (Throwable th2) {
            NumberConverter.onWarmupCompleted(th2);
            this.downstream.onExtraCallbackWithResult(new deserializeDecimal(new Throwable[]{th, th2}));
        }
    }

    public boolean isDisposed() {
        return deserializeNumber.isDisposed(get());
    }

    public void dispose() {
        deserializeNumber.dispose(this);
    }
}
