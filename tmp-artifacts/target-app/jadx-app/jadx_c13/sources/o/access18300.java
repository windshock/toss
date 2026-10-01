package o;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.MapConverter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access18300<T> extends ObjectConverter2<T, T> {
    final boolean IAuthTabCallback;
    final MapConverter onExtraCallback;

    public access18300(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, MapConverter mapConverter, boolean z) {
        super(jsonReaderUnknownNumberParsing);
        this.onExtraCallback = mapConverter;
        this.IAuthTabCallback = z;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        MapConverter.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult();
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(ycxexternalsyntheticlambda0, onnavigationeventOnExtraCallbackWithResult, this.onExtraCallbackWithResult, this.IAuthTabCallback);
        ycxexternalsyntheticlambda0.onExtraCallback(onextracallbackwithresult);
        onnavigationeventOnExtraCallbackWithResult.IAuthTabCallback(onextracallbackwithresult);
    }

    static final class onExtraCallbackWithResult<T> extends AtomicReference<Thread> implements JsonReaderReadObject<T>, ycxExternalSyntheticLambda1, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        final ycxExternalSyntheticLambda0<? super T> downstream;
        final boolean nonScheduledRequests;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> source;
        final MapConverter.onNavigationEvent worker;
        final AtomicReference<ycxExternalSyntheticLambda1> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        onExtraCallbackWithResult(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, MapConverter.onNavigationEvent onnavigationevent, r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, boolean z) {
            this.downstream = ycxexternalsyntheticlambda0;
            this.worker = onnavigationevent;
            this.source = r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
            this.nonScheduledRequests = !z;
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = this.source;
            this.source = null;
            r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk.subscribe(this);
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.setOnce(this.upstream, ycxexternalsyntheticlambda1)) {
                long andSet = this.requested.getAndSet(0L);
                if (andSet != 0) {
                    onNavigationEvent(andSet, ycxexternalsyntheticlambda1);
                }
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            this.downstream.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            this.downstream.onWarmupCompleted(th);
            this.worker.dispose();
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            this.downstream.onExtraCallbackWithResult();
            this.worker.dispose();
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            if (setLogs.validate(j)) {
                ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1 = this.upstream.get();
                if (ycxexternalsyntheticlambda1 != null) {
                    onNavigationEvent(j, ycxexternalsyntheticlambda1);
                    return;
                }
                TombstoneProtosLogBufferBuilder.onWarmupCompleted(this.requested, j);
                ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda12 = this.upstream.get();
                if (ycxexternalsyntheticlambda12 != null) {
                    long andSet = this.requested.getAndSet(0L);
                    if (andSet != 0) {
                        onNavigationEvent(andSet, ycxexternalsyntheticlambda12);
                    }
                }
            }
        }

        void onNavigationEvent(long j, ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (this.nonScheduledRequests || Thread.currentThread() == get()) {
                ycxexternalsyntheticlambda1.request(j);
            } else {
                this.worker.IAuthTabCallback(new onNavigationEvent(ycxexternalsyntheticlambda1, j));
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            setLogs.cancel(this.upstream);
            this.worker.dispose();
        }

        static final class onNavigationEvent implements Runnable {
            final long onExtraCallback;
            final ycxExternalSyntheticLambda1 onNavigationEvent;

            onNavigationEvent(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1, long j) {
                this.onNavigationEvent = ycxexternalsyntheticlambda1;
                this.onExtraCallback = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.onNavigationEvent.request(this.onExtraCallback);
            }
        }
    }
}
