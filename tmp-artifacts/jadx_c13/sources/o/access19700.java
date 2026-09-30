package o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access19700<T> extends ObjectConverter2<T, T> {
    public access19700(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing) {
        super(jsonReaderUnknownNumberParsing);
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onExtraCallback(ycxexternalsyntheticlambda0));
    }

    static final class onExtraCallback<T> extends AtomicInteger implements JsonReaderReadObject<T>, ycxExternalSyntheticLambda1 {
        private static final long serialVersionUID = 163080509307634843L;
        volatile boolean cancelled;
        volatile boolean done;
        final ycxExternalSyntheticLambda0<? super T> downstream;
        Throwable error;
        ycxExternalSyntheticLambda1 upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<T> current = new AtomicReference<>();

        onExtraCallback(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
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
            this.current.lazySet(t);
            onWarmupCompleted();
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            this.error = th;
            this.done = true;
            onWarmupCompleted();
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            this.done = true;
            onWarmupCompleted();
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            if (setLogs.validate(j)) {
                TombstoneProtosLogBufferBuilder.onWarmupCompleted(this.requested, j);
                onWarmupCompleted();
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.current.lazySet(null);
            }
        }

        void onWarmupCompleted() {
            if (getAndIncrement() == 0) {
                ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0 = this.downstream;
                AtomicLong atomicLong = this.requested;
                AtomicReference<T> atomicReference = this.current;
                int iAddAndGet = 1;
                do {
                    long j = 0;
                    while (true) {
                        if (j == atomicLong.get()) {
                            break;
                        }
                        boolean z = this.done;
                        T andSet = atomicReference.getAndSet(null);
                        boolean z2 = andSet == null;
                        if (!onNavigationEvent(z, z2, ycxexternalsyntheticlambda0, atomicReference)) {
                            if (z2) {
                                break;
                            }
                            ycxexternalsyntheticlambda0.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        if (onNavigationEvent(this.done, atomicReference.get() == null, ycxexternalsyntheticlambda0, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        TombstoneProtosLogBufferBuilder.onExtraCallbackWithResult(atomicLong, j);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }

        boolean onNavigationEvent(boolean z, boolean z2, ycxExternalSyntheticLambda0<?> ycxexternalsyntheticlambda0, AtomicReference<T> atomicReference) {
            if (this.cancelled) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                atomicReference.lazySet(null);
                ycxexternalsyntheticlambda0.onWarmupCompleted(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
            return true;
        }
    }
}
