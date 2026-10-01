package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access17800<T, R> extends ObjectConverter2<T, R> {
    final Callable<R> onExtraCallback;
    final deserializeFloatNullableCollection<R, ? super T, R> onNavigationEvent;

    public access17800(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, Callable<R> callable, deserializeFloatNullableCollection<R, ? super T, R> deserializefloatnullablecollection) {
        super(jsonReaderUnknownNumberParsing);
        this.onNavigationEvent = deserializefloatnullablecollection;
        this.onExtraCallback = callable;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super R> ycxexternalsyntheticlambda0) {
        try {
            this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new IAuthTabCallback(ycxexternalsyntheticlambda0, this.onNavigationEvent, floatExponent.onExtraCallbackWithResult(this.onExtraCallback.call(), "The seed supplied is null"), JsonReaderUnknownNumberParsing.IAuthTabCallback()));
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            access25900.error(th, ycxexternalsyntheticlambda0);
        }
    }

    static final class IAuthTabCallback<T, R> extends AtomicInteger implements JsonReaderReadObject<T>, ycxExternalSyntheticLambda1 {
        private static final long serialVersionUID = -1776795561228106469L;
        final deserializeFloatNullableCollection<R, ? super T, R> accumulator;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final ycxExternalSyntheticLambda0<? super R> downstream;
        Throwable error;
        final int limit;
        final int prefetch;
        final parseNegativeInt<R> queue;
        final AtomicLong requested;
        ycxExternalSyntheticLambda1 upstream;
        R value;

        IAuthTabCallback(ycxExternalSyntheticLambda0<? super R> ycxexternalsyntheticlambda0, deserializeFloatNullableCollection<R, ? super T, R> deserializefloatnullablecollection, R r, int i) {
            this.downstream = ycxexternalsyntheticlambda0;
            this.accumulator = deserializefloatnullablecollection;
            this.value = r;
            this.prefetch = i;
            this.limit = i - (i >> 2);
            getAllocationBacktraceCount getallocationbacktracecount = new getAllocationBacktraceCount(i);
            this.queue = getallocationbacktracecount;
            getallocationbacktracecount.offer(r);
            this.requested = new AtomicLong();
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.validate(this.upstream, ycxexternalsyntheticlambda1)) {
                this.upstream = ycxexternalsyntheticlambda1;
                this.downstream.onExtraCallback(this);
                ycxexternalsyntheticlambda1.request(this.prefetch - 1);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            if (this.done) {
                return;
            }
            try {
                R r = (R) floatExponent.onExtraCallbackWithResult(this.accumulator.apply(this.value, t), "The accumulator returned a null value");
                this.value = r;
                this.queue.offer(r);
                onExtraCallback();
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.upstream.cancel();
                onWarmupCompleted(th);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
                return;
            }
            this.error = th;
            this.done = true;
            onExtraCallback();
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            if (this.done) {
                return;
            }
            this.done = true;
            onExtraCallback();
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            if (setLogs.validate(j)) {
                TombstoneProtosLogBufferBuilder.onWarmupCompleted(this.requested, j);
                onExtraCallback();
            }
        }

        void onExtraCallback() {
            Throwable th;
            if (getAndIncrement() == 0) {
                ycxExternalSyntheticLambda0<? super R> ycxexternalsyntheticlambda0 = this.downstream;
                parseNegativeInt<R> parsenegativeint = this.queue;
                int i = this.limit;
                int i2 = this.consumed;
                int iAddAndGet = 1;
                do {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.cancelled) {
                            parsenegativeint.clear();
                            return;
                        }
                        boolean z = this.done;
                        if (z && (th = this.error) != null) {
                            parsenegativeint.clear();
                            ycxexternalsyntheticlambda0.onWarmupCompleted(th);
                            return;
                        }
                        R rPoll = parsenegativeint.poll();
                        boolean z2 = rPoll == null;
                        if (!z || !z2) {
                            if (z2) {
                                break;
                            }
                            ycxexternalsyntheticlambda0.onWarmupCompleted((ycxExternalSyntheticLambda0<? super R>) rPoll);
                            j2++;
                            i2++;
                            if (i2 == i) {
                                this.upstream.request(i);
                                i2 = 0;
                            }
                        } else {
                            ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                            return;
                        }
                    }
                    if (j2 == j && this.done) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            parsenegativeint.clear();
                            ycxexternalsyntheticlambda0.onWarmupCompleted(th2);
                            return;
                        } else if (parsenegativeint.isEmpty()) {
                            ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                            return;
                        }
                    }
                    if (j2 != 0) {
                        TombstoneProtosLogBufferBuilder.onExtraCallbackWithResult(this.requested, j2);
                    }
                    this.consumed = i2;
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }
    }
}
