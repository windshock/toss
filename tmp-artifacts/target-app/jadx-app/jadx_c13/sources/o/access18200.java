package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access18200<T> extends ObjectConverter2<T, T> {
    final long IAuthTabCallback;

    public access18200(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, long j) {
        super(jsonReaderUnknownNumberParsing);
        this.IAuthTabCallback = j;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onNavigationEvent(ycxexternalsyntheticlambda0, this.IAuthTabCallback));
    }

    static final class onNavigationEvent<T> extends AtomicBoolean implements JsonReaderReadObject<T>, ycxExternalSyntheticLambda1 {
        private static final long serialVersionUID = -5636543848937116287L;
        boolean done;
        final ycxExternalSyntheticLambda0<? super T> downstream;
        final long limit;
        long remaining;
        ycxExternalSyntheticLambda1 upstream;

        onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, long j) {
            this.downstream = ycxexternalsyntheticlambda0;
            this.limit = j;
            this.remaining = j;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.validate(this.upstream, ycxexternalsyntheticlambda1)) {
                this.upstream = ycxexternalsyntheticlambda1;
                if (this.limit == 0) {
                    ycxexternalsyntheticlambda1.cancel();
                    this.done = true;
                    access25900.complete(this.downstream);
                    return;
                }
                this.downstream.onExtraCallback(this);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            if (this.done) {
                return;
            }
            long j = this.remaining;
            long j2 = j - 1;
            this.remaining = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.downstream.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
                if (z) {
                    this.upstream.cancel();
                    onExtraCallbackWithResult();
                }
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            if (!this.done) {
                this.done = true;
                this.upstream.cancel();
                this.downstream.onWarmupCompleted(th);
                return;
            }
            RxJavaPlugins.onExtraCallbackWithResult(th);
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
                if (!get() && compareAndSet(false, true) && j >= this.limit) {
                    this.upstream.request(LongCompanionObject.MAX_VALUE);
                } else {
                    this.upstream.request(j);
                }
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            this.upstream.cancel();
        }
    }
}
