package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class registerAllExtensions<T> extends ObjectConverter2<T, T> {
    public registerAllExtensions(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing) {
        super(jsonReaderUnknownNumberParsing);
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onExtraCallbackWithResult(ycxexternalsyntheticlambda0));
    }

    static final class onExtraCallbackWithResult<T> implements JsonReaderReadObject<T>, ycxExternalSyntheticLambda1 {
        ycxExternalSyntheticLambda1 onExtraCallback;
        final ycxExternalSyntheticLambda0<? super T> onNavigationEvent;

        onExtraCallbackWithResult(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
            this.onNavigationEvent = ycxexternalsyntheticlambda0;
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            this.onExtraCallback.request(j);
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            this.onExtraCallback.cancel();
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.validate(this.onExtraCallback, ycxexternalsyntheticlambda1)) {
                this.onExtraCallback = ycxexternalsyntheticlambda1;
                this.onNavigationEvent.onExtraCallback(this);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            this.onNavigationEvent.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            this.onNavigationEvent.onWarmupCompleted(th);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            this.onNavigationEvent.onExtraCallbackWithResult();
        }
    }
}
