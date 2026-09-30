package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosArmMTEMetadata<T> extends ObjectConverter2<T, T> implements deserializeFloat<T> {
    final deserializeFloat<? super T> onExtraCallback;

    @Override // o.deserializeFloat
    public void accept(T t) {
    }

    public TombstoneProtosArmMTEMetadata(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing) {
        super(jsonReaderUnknownNumberParsing);
        this.onExtraCallback = this;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onWarmupCompleted(ycxexternalsyntheticlambda0, this.onExtraCallback));
    }

    static final class onWarmupCompleted<T> extends AtomicLong implements JsonReaderReadObject<T>, ycxExternalSyntheticLambda1 {
        private static final long serialVersionUID = -6246093802440953054L;
        boolean done;
        final ycxExternalSyntheticLambda0<? super T> downstream;
        final deserializeFloat<? super T> onDrop;
        ycxExternalSyntheticLambda1 upstream;

        onWarmupCompleted(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, deserializeFloat<? super T> deserializefloat) {
            this.downstream = ycxexternalsyntheticlambda0;
            this.onDrop = deserializefloat;
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
                return;
            }
            try {
                this.onDrop.accept(t);
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                cancel();
                onWarmupCompleted(th);
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
