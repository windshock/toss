package o;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getMemoryTags<T> extends ObjectConverter2<T, T> {
    final deserializeLongCollection<? super Throwable> onExtraCallback;
    final long onNavigationEvent;

    public getMemoryTags(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, long j, deserializeLongCollection<? super Throwable> deserializelongcollection) {
        super(jsonReaderUnknownNumberParsing);
        this.onExtraCallback = deserializelongcollection;
        this.onNavigationEvent = j;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        setNameBytes setnamebytes = new setNameBytes(false);
        ycxexternalsyntheticlambda0.onExtraCallback(setnamebytes);
        new onExtraCallbackWithResult(ycxexternalsyntheticlambda0, this.onNavigationEvent, this.onExtraCallback, setnamebytes, this.onExtraCallbackWithResult).onNavigationEvent();
    }

    static final class onExtraCallbackWithResult<T> extends AtomicInteger implements JsonReaderReadObject<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final ycxExternalSyntheticLambda0<? super T> downstream;
        final deserializeLongCollection<? super Throwable> predicate;
        long produced;
        long remaining;
        final setNameBytes sa;
        final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T> source;

        onExtraCallbackWithResult(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, long j, deserializeLongCollection<? super Throwable> deserializelongcollection, setNameBytes setnamebytes, r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk) {
            this.downstream = ycxexternalsyntheticlambda0;
            this.sa = setnamebytes;
            this.source = r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
            this.predicate = deserializelongcollection;
            this.remaining = j;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            this.sa.onWarmupCompleted(ycxexternalsyntheticlambda1);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            this.produced++;
            this.downstream.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            long j = this.remaining;
            if (j != LongCompanionObject.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j == 0) {
                this.downstream.onWarmupCompleted(th);
                return;
            }
            try {
                if (!this.predicate.test(th)) {
                    this.downstream.onWarmupCompleted(th);
                } else {
                    onNavigationEvent();
                }
            } catch (Throwable th2) {
                NumberConverter.onWarmupCompleted(th2);
                this.downstream.onWarmupCompleted((Throwable) new deserializeDecimal(th, th2));
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            this.downstream.onExtraCallbackWithResult();
        }

        void onNavigationEvent() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.sa.onWarmupCompleted()) {
                    long j = this.produced;
                    if (j != 0) {
                        this.produced = 0L;
                        this.sa.onWarmupCompleted(j);
                    }
                    this.source.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }
    }
}
