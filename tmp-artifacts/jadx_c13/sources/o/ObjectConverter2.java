package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
abstract class ObjectConverter2<T, R> extends JsonReaderUnknownNumberParsing<R> {
    protected final JsonReaderUnknownNumberParsing<T> onExtraCallbackWithResult;

    ObjectConverter2(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing) {
        this.onExtraCallbackWithResult = (JsonReaderUnknownNumberParsing) floatExponent.onExtraCallbackWithResult(jsonReaderUnknownNumberParsing, "source is null");
    }
}
