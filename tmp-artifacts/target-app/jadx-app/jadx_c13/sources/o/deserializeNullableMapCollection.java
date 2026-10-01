package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class deserializeNullableMapCollection<T> extends JsonReaderUnknownNumberParsing<T> {
    final JsonReaderErrorInfo onExtraCallbackWithResult;

    public deserializeNullableMapCollection(JsonReaderErrorInfo jsonReaderErrorInfo) {
        this.onExtraCallbackWithResult = jsonReaderErrorInfo;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(new NumberConverter16(ycxexternalsyntheticlambda0));
    }
}
