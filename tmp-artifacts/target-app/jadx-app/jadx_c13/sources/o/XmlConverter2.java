package o;

import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class XmlConverter2<T> extends ObjectConverter2<T, T> {
    public XmlConverter2(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing) {
        super(jsonReaderUnknownNumberParsing);
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onExtraCallbackWithResult(ycxexternalsyntheticlambda0));
    }

    static final class onExtraCallbackWithResult<T> implements JsonReaderReadObject<T>, parsePositiveInt<T> {
        ycxExternalSyntheticLambda1 onNavigationEvent;
        final ycxExternalSyntheticLambda0<? super T> onWarmupCompleted;

        @Override // o.parsePositiveDecimal
        public void clear() {
        }

        @Override // o.parsePositiveDecimal
        public boolean isEmpty() {
            return true;
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
        }

        @Override // o.parsePositiveDecimal
        public T poll() {
            return null;
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
        }

        @Override // o.parseFloatGeneric
        public int requestFusion(int i) {
            return i & 2;
        }

        onExtraCallbackWithResult(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
            this.onWarmupCompleted = ycxexternalsyntheticlambda0;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.validate(this.onNavigationEvent, ycxexternalsyntheticlambda1)) {
                this.onNavigationEvent = ycxexternalsyntheticlambda1;
                this.onWarmupCompleted.onExtraCallback(this);
                ycxexternalsyntheticlambda1.request(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            this.onWarmupCompleted.onWarmupCompleted(th);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            this.onWarmupCompleted.onExtraCallbackWithResult();
        }

        @Override // o.parsePositiveDecimal
        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            this.onNavigationEvent.cancel();
        }
    }
}
