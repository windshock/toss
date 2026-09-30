package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NumberConverter26 extends wasLastName {
    final deserializeDecimalCollection IAuthTabCallback;

    public NumberConverter26(deserializeDecimalCollection deserializedecimalcollection) {
        this.IAuthTabCallback = deserializedecimalcollection;
    }

    @Override // o.wasLastName
    public void IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallbackWithResult = bigDecimalOrDouble.onExtraCallbackWithResult();
        jsonReaderDoublePrecision.IAuthTabCallback(deserializeurinullablecollectionOnExtraCallbackWithResult);
        try {
            this.IAuthTabCallback.run();
            if (deserializeurinullablecollectionOnExtraCallbackWithResult.isDisposed()) {
                return;
            }
            jsonReaderDoublePrecision.onExtraCallback();
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            if (!deserializeurinullablecollectionOnExtraCallbackWithResult.isDisposed()) {
                jsonReaderDoublePrecision.onExtraCallbackWithResult(th);
            } else {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
        }
    }
}
