package o;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access19600<T> extends ObjectConverter2<T, T> {
    final boolean IAuthTabCallback;
    final deserializeDecimalCollection onExtraCallback;
    final int onNavigationEvent;
    final boolean onWarmupCompleted;

    public access19600(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, int i, boolean z, boolean z2, deserializeDecimalCollection deserializedecimalcollection) {
        super(jsonReaderUnknownNumberParsing);
        this.onNavigationEvent = i;
        this.onWarmupCompleted = z;
        this.IAuthTabCallback = z2;
        this.onExtraCallback = deserializedecimalcollection;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onExtraCallbackWithResult(ycxexternalsyntheticlambda0, this.onNavigationEvent, this.onWarmupCompleted, this.IAuthTabCallback, this.onExtraCallback));
    }

    static final class onExtraCallbackWithResult<T> extends addAllLogs<T> implements JsonReaderReadObject<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final ycxExternalSyntheticLambda0<? super T> downstream;
        Throwable error;
        final deserializeDecimalCollection onOverflow;
        boolean outputFused;
        final parseNegativeInt<T> queue;
        final AtomicLong requested = new AtomicLong();
        ycxExternalSyntheticLambda1 upstream;

        onExtraCallbackWithResult(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, int i, boolean z, boolean z2, deserializeDecimalCollection deserializedecimalcollection) {
            parseNegativeInt<T> getallocationbacktracecount;
            this.downstream = ycxexternalsyntheticlambda0;
            this.onOverflow = deserializedecimalcollection;
            this.delayError = z2;
            if (z) {
                getallocationbacktracecount = new getAllocationBacktraceOrBuilder<>(i);
            } else {
                getallocationbacktracecount = new getAllocationBacktraceCount<>(i);
            }
            this.queue = getallocationbacktracecount;
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
            if (!this.queue.offer(t)) {
                this.upstream.cancel();
                NetConverter4 netConverter4 = new NetConverter4("Buffer is full");
                try {
                    this.onOverflow.run();
                } catch (Throwable th) {
                    NumberConverter.onWarmupCompleted(th);
                    netConverter4.initCause(th);
                }
                onWarmupCompleted((Throwable) netConverter4);
                return;
            }
            if (this.outputFused) {
                this.downstream.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) null);
            } else {
                onExtraCallback();
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            this.error = th;
            this.done = true;
            if (this.outputFused) {
                this.downstream.onWarmupCompleted(th);
            } else {
                onExtraCallback();
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            this.done = true;
            if (this.outputFused) {
                this.downstream.onExtraCallbackWithResult();
            } else {
                onExtraCallback();
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            if (this.outputFused || !setLogs.validate(j)) {
                return;
            }
            TombstoneProtosLogBufferBuilder.onWarmupCompleted(this.requested, j);
            onExtraCallback();
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (this.outputFused || getAndIncrement() != 0) {
                return;
            }
            this.queue.clear();
        }

        void onExtraCallback() {
            if (getAndIncrement() == 0) {
                parseNegativeInt<T> parsenegativeint = this.queue;
                ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0 = this.downstream;
                int iAddAndGet = 1;
                while (!IAuthTabCallback(this.done, parsenegativeint.isEmpty(), ycxexternalsyntheticlambda0)) {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.done;
                        T tPoll = parsenegativeint.poll();
                        boolean z2 = tPoll == null;
                        if (!IAuthTabCallback(z, z2, ycxexternalsyntheticlambda0)) {
                            if (z2) {
                                break;
                            }
                            ycxexternalsyntheticlambda0.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) tPoll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 == j && IAuthTabCallback(this.done, parsenegativeint.isEmpty(), ycxexternalsyntheticlambda0)) {
                        return;
                    }
                    if (j2 != 0 && j != LongCompanionObject.MAX_VALUE) {
                        this.requested.addAndGet(-j2);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        boolean IAuthTabCallback(boolean z, boolean z2, ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.delayError) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.error;
                if (th != null) {
                    ycxexternalsyntheticlambda0.onWarmupCompleted(th);
                } else {
                    ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                }
                return true;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.queue.clear();
                ycxexternalsyntheticlambda0.onWarmupCompleted(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
            return true;
        }

        @Override // o.parseFloatGeneric
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // o.parsePositiveDecimal
        public T poll() throws Exception {
            return this.queue.poll();
        }

        @Override // o.parsePositiveDecimal
        public void clear() {
            this.queue.clear();
        }

        @Override // o.parsePositiveDecimal
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }
    }
}
