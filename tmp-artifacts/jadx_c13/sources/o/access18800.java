package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
import o.MapConverter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access18800<T> extends ObjectConverter2<T, T> {
    final MapConverter IAuthTabCallback;
    final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T> onExtraCallback;
    final long onNavigationEvent;
    final TimeUnit onWarmupCompleted;

    interface onWarmupCompleted {
        void onNavigationEvent(long j);
    }

    public access18800(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, long j, TimeUnit timeUnit, MapConverter mapConverter, r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk) {
        super(jsonReaderUnknownNumberParsing);
        this.onNavigationEvent = j;
        this.onWarmupCompleted = timeUnit;
        this.IAuthTabCallback = mapConverter;
        this.onExtraCallback = r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        if (this.onExtraCallback == null) {
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(ycxexternalsyntheticlambda0, this.onNavigationEvent, this.onWarmupCompleted, this.IAuthTabCallback.onExtraCallbackWithResult());
            ycxexternalsyntheticlambda0.onExtraCallback(iAuthTabCallback);
            iAuthTabCallback.onExtraCallback(0L);
            this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) iAuthTabCallback);
            return;
        }
        onNavigationEvent onnavigationevent = new onNavigationEvent(ycxexternalsyntheticlambda0, this.onNavigationEvent, this.onWarmupCompleted, this.IAuthTabCallback.onExtraCallbackWithResult(), this.onExtraCallback);
        ycxexternalsyntheticlambda0.onExtraCallback(onnavigationevent);
        onnavigationevent.onExtraCallback(0L);
        this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) onnavigationevent);
    }

    static final class IAuthTabCallback<T> extends AtomicLong implements JsonReaderReadObject<T>, ycxExternalSyntheticLambda1, onWarmupCompleted {
        private static final long serialVersionUID = 3764492702657003550L;
        final ycxExternalSyntheticLambda0<? super T> downstream;
        final long timeout;
        final TimeUnit unit;
        final MapConverter.onNavigationEvent worker;
        final deserializeShortArray task = new deserializeShortArray();
        final AtomicReference<ycxExternalSyntheticLambda1> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        IAuthTabCallback(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, long j, TimeUnit timeUnit, MapConverter.onNavigationEvent onnavigationevent) {
            this.downstream = ycxexternalsyntheticlambda0;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = onnavigationevent;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            setLogs.deferredSetOnce(this.upstream, this.requested, ycxexternalsyntheticlambda1);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            long j = get();
            if (j != LongCompanionObject.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    this.task.get().dispose();
                    this.downstream.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
                    onExtraCallback(j2);
                }
            }
        }

        void onExtraCallback(long j) {
            this.task.IAuthTabCallback(this.worker.onNavigationEvent(new onExtraCallback(j, this), this.timeout, this.unit));
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            if (getAndSet(LongCompanionObject.MAX_VALUE) != LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onWarmupCompleted(th);
                this.worker.dispose();
                return;
            }
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            if (getAndSet(LongCompanionObject.MAX_VALUE) != LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onExtraCallbackWithResult();
                this.worker.dispose();
            }
        }

        @Override // o.access18800.onWarmupCompleted
        public void onNavigationEvent(long j) {
            if (compareAndSet(j, LongCompanionObject.MAX_VALUE)) {
                setLogs.cancel(this.upstream);
                this.downstream.onWarmupCompleted((Throwable) new TimeoutException(access26100.onNavigationEvent(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            setLogs.deferredRequest(this.upstream, this.requested, j);
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            setLogs.cancel(this.upstream);
            this.worker.dispose();
        }
    }

    static final class onExtraCallback implements Runnable {
        final long IAuthTabCallback;
        final onWarmupCompleted onWarmupCompleted;

        onExtraCallback(long j, onWarmupCompleted onwarmupcompleted) {
            this.IAuthTabCallback = j;
            this.onWarmupCompleted = onwarmupcompleted;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.onWarmupCompleted.onNavigationEvent(this.IAuthTabCallback);
        }
    }

    static final class onNavigationEvent<T> extends setNameBytes implements JsonReaderReadObject<T>, onWarmupCompleted {
        private static final long serialVersionUID = 3764492702657003550L;
        long consumed;
        final ycxExternalSyntheticLambda0<? super T> downstream;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T> fallback;
        final AtomicLong index;
        final deserializeShortArray task;
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<ycxExternalSyntheticLambda1> upstream;
        final MapConverter.onNavigationEvent worker;

        onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, long j, TimeUnit timeUnit, MapConverter.onNavigationEvent onnavigationevent, r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk) {
            super(true);
            this.downstream = ycxexternalsyntheticlambda0;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = onnavigationevent;
            this.fallback = r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
            this.task = new deserializeShortArray();
            this.upstream = new AtomicReference<>();
            this.index = new AtomicLong();
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.setOnce(this.upstream, ycxexternalsyntheticlambda1)) {
                onWarmupCompleted(ycxexternalsyntheticlambda1);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            long j = this.index.get();
            if (j != LongCompanionObject.MAX_VALUE) {
                long j2 = j + 1;
                if (this.index.compareAndSet(j, j2)) {
                    this.task.get().dispose();
                    this.consumed++;
                    this.downstream.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
                    onExtraCallback(j2);
                }
            }
        }

        void onExtraCallback(long j) {
            this.task.IAuthTabCallback(this.worker.onNavigationEvent(new onExtraCallback(j, this), this.timeout, this.unit));
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            if (this.index.getAndSet(LongCompanionObject.MAX_VALUE) != LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onWarmupCompleted(th);
                this.worker.dispose();
                return;
            }
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            if (this.index.getAndSet(LongCompanionObject.MAX_VALUE) != LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onExtraCallbackWithResult();
                this.worker.dispose();
            }
        }

        @Override // o.access18800.onWarmupCompleted
        public void onNavigationEvent(long j) {
            if (this.index.compareAndSet(j, LongCompanionObject.MAX_VALUE)) {
                setLogs.cancel(this.upstream);
                long j2 = this.consumed;
                if (j2 != 0) {
                    onWarmupCompleted(j2);
                }
                r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = this.fallback;
                this.fallback = null;
                r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk.subscribe(new onExtraCallbackWithResult(this.downstream, this));
                this.worker.dispose();
            }
        }

        @Override // o.setNameBytes, o.ycxExternalSyntheticLambda1
        public void cancel() {
            super.cancel();
            this.worker.dispose();
        }
    }

    static final class onExtraCallbackWithResult<T> implements JsonReaderReadObject<T> {
        final ycxExternalSyntheticLambda0<? super T> IAuthTabCallback;
        final setNameBytes onExtraCallback;

        onExtraCallbackWithResult(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, setNameBytes setnamebytes) {
            this.IAuthTabCallback = ycxexternalsyntheticlambda0;
            this.onExtraCallback = setnamebytes;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            this.onExtraCallback.onWarmupCompleted(ycxexternalsyntheticlambda1);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            this.IAuthTabCallback.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            this.IAuthTabCallback.onWarmupCompleted(th);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            this.IAuthTabCallback.onExtraCallbackWithResult();
        }
    }
}
