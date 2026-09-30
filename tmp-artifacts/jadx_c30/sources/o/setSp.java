package o;

import java.util.concurrent.Callable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class setSp {
    static <T> boolean onWarmupCompleted(Object obj, deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> deserializeintnullablecollection, JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) obj).call();
            JsonReaderErrorInfo jsonReaderErrorInfo = objCall != null ? (JsonReaderErrorInfo) floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection.apply(objCall), "The mapper returned a null CompletableSource") : null;
            if (jsonReaderErrorInfo == null) {
                deserializeShort.complete(jsonReaderDoublePrecision);
            } else {
                jsonReaderErrorInfo.onExtraCallbackWithResult(jsonReaderDoublePrecision);
            }
            return true;
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            deserializeShort.error(th, jsonReaderDoublePrecision);
            return true;
        }
    }
}
