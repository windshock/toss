package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class XmlConverter1<T> extends JsonReaderUnknownNumberParsing<T> {
    private final getByteBuffer<T> onNavigationEvent;

    public XmlConverter1(getByteBuffer<T> getbytebuffer) {
        this.onNavigationEvent = getbytebuffer;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.onNavigationEvent.subscribe(new onExtraCallbackWithResult(ycxexternalsyntheticlambda0));
    }

    static final class onExtraCallbackWithResult<T> implements writeQuoted<T>, ycxExternalSyntheticLambda1 {
        final ycxExternalSyntheticLambda0<? super T> IAuthTabCallback;
        deserializeUriNullableCollection onExtraCallbackWithResult;

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
        }

        onExtraCallbackWithResult(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
            this.IAuthTabCallback = ycxexternalsyntheticlambda0;
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            this.IAuthTabCallback.onExtraCallbackWithResult();
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            this.IAuthTabCallback.onWarmupCompleted(th);
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            this.IAuthTabCallback.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            this.onExtraCallbackWithResult = deserializeurinullablecollection;
            this.IAuthTabCallback.onExtraCallback(this);
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            this.onExtraCallbackWithResult.dispose();
        }
    }
}
