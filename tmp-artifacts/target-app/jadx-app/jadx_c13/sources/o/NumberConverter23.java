package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NumberConverter23 extends wasLastName {
    final Callable<?> onExtraCallbackWithResult;

    public NumberConverter23(Callable<?> callable) {
        this.onExtraCallbackWithResult = callable;
    }

    @Override // o.wasLastName
    public void IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallbackWithResult = bigDecimalOrDouble.onExtraCallbackWithResult();
        jsonReaderDoublePrecision.IAuthTabCallback(deserializeurinullablecollectionOnExtraCallbackWithResult);
        try {
            this.onExtraCallbackWithResult.call();
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
