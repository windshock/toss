package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class isInRange<T> extends ObjectConverter2<T, T> {
    public isInRange(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing) {
        super(jsonReaderUnknownNumberParsing);
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new IAuthTabCallback(ycxexternalsyntheticlambda0));
    }

    static final class IAuthTabCallback<T> extends AtomicLong implements JsonReaderReadObject<T>, ycxExternalSyntheticLambda1 {
        private static final long serialVersionUID = -3176480756392482682L;
        boolean done;
        final ycxExternalSyntheticLambda0<? super T> downstream;
        ycxExternalSyntheticLambda1 upstream;

        IAuthTabCallback(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
            this.downstream = ycxexternalsyntheticlambda0;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.validate(this.upstream, ycxexternalsyntheticlambda1)) {
                this.upstream = ycxexternalsyntheticlambda1;
                this.downstream.onExtraCallback(this);
                ycxexternalsyntheticlambda1.request(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            if (this.done) {
                return;
            }
            if (get() != 0) {
                this.downstream.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
                TombstoneProtosLogBufferBuilder.onExtraCallbackWithResult(this, 1L);
            } else {
                this.upstream.cancel();
                onWarmupCompleted((Throwable) new NetConverter4("could not emit value due to lack of requests"));
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            } else {
                this.done = true;
                this.downstream.onWarmupCompleted(th);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onExtraCallbackWithResult();
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            if (setLogs.validate(j)) {
                TombstoneProtosLogBufferBuilder.onWarmupCompleted(this, j);
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            this.upstream.cancel();
        }
    }
}
