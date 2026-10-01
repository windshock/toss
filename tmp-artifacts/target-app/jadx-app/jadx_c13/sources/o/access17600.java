package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access17600<T> extends ObjectConverter2<T, T> {
    final long onWarmupCompleted;

    public access17600(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, long j) {
        super(jsonReaderUnknownNumberParsing);
        this.onWarmupCompleted = j;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onExtraCallbackWithResult(ycxexternalsyntheticlambda0, this.onWarmupCompleted));
    }

    static final class onExtraCallbackWithResult<T> implements JsonReaderReadObject<T>, ycxExternalSyntheticLambda1 {
        ycxExternalSyntheticLambda1 onExtraCallback;
        final ycxExternalSyntheticLambda0<? super T> onNavigationEvent;
        long onWarmupCompleted;

        onExtraCallbackWithResult(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, long j) {
            this.onNavigationEvent = ycxexternalsyntheticlambda0;
            this.onWarmupCompleted = j;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.validate(this.onExtraCallback, ycxexternalsyntheticlambda1)) {
                long j = this.onWarmupCompleted;
                this.onExtraCallback = ycxexternalsyntheticlambda1;
                this.onNavigationEvent.onExtraCallback(this);
                ycxexternalsyntheticlambda1.request(j);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            long j = this.onWarmupCompleted;
            if (j != 0) {
                this.onWarmupCompleted = j - 1;
            } else {
                this.onNavigationEvent.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            this.onNavigationEvent.onWarmupCompleted(th);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            this.onNavigationEvent.onExtraCallbackWithResult();
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            this.onExtraCallback.request(j);
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            this.onExtraCallback.cancel();
        }
    }
}
