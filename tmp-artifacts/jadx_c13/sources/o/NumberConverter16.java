package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NumberConverter16<T> implements JsonReaderDoublePrecision, ycxExternalSyntheticLambda1 {
    final ycxExternalSyntheticLambda0<? super T> IAuthTabCallback;
    deserializeUriNullableCollection onNavigationEvent;

    @Override // o.ycxExternalSyntheticLambda1
    public void request(long j) {
    }

    public NumberConverter16(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.IAuthTabCallback = ycxexternalsyntheticlambda0;
    }

    @Override // o.JsonReaderDoublePrecision
    public void onExtraCallback() {
        this.IAuthTabCallback.onExtraCallbackWithResult();
    }

    @Override // o.JsonReaderDoublePrecision
    public void onExtraCallbackWithResult(Throwable th) {
        this.IAuthTabCallback.onWarmupCompleted(th);
    }

    @Override // o.JsonReaderDoublePrecision
    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        if (deserializeNumber.validate(this.onNavigationEvent, deserializeurinullablecollection)) {
            this.onNavigationEvent = deserializeurinullablecollection;
            this.IAuthTabCallback.onExtraCallback(this);
        }
    }

    @Override // o.ycxExternalSyntheticLambda1
    public void cancel() {
        this.onNavigationEvent.dispose();
    }
}
