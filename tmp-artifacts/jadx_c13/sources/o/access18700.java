package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access18700<T, R> extends JsonReaderUnknownNumberParsing<R> {
    final deserializeIntNullableCollection<? super Object[], ? extends R> IAuthTabCallback;
    final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>[] onExtraCallback;
    final boolean onExtraCallbackWithResult;
    final int onNavigationEvent;
    final Iterable<? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>> onWarmupCompleted;

    public access18700(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>[] r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr, Iterable<? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>> iterable, deserializeIntNullableCollection<? super Object[], ? extends R> deserializeintnullablecollection, int i, boolean z) {
        this.onExtraCallback = r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr;
        this.onWarmupCompleted = iterable;
        this.IAuthTabCallback = deserializeintnullablecollection;
        this.onNavigationEvent = i;
        this.onExtraCallbackWithResult = z;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super R> ycxexternalsyntheticlambda0) {
        int length;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>[] r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr = this.onExtraCallback;
        if (r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr == null) {
            r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr = new r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk[8];
            length = 0;
            for (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk : this.onWarmupCompleted) {
                if (length == r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr.length) {
                    r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>[] r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr2 = new r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk[(length >> 2) + length];
                    System.arraycopy(r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr, 0, r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr2, 0, length);
                    r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr = r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr2;
                }
                r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr[length] = r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
                length++;
            }
        } else {
            length = r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr.length;
        }
        int i = length;
        if (i == 0) {
            access25900.complete(ycxexternalsyntheticlambda0);
            return;
        }
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(ycxexternalsyntheticlambda0, this.IAuthTabCallback, i, this.onNavigationEvent, this.onExtraCallbackWithResult);
        ycxexternalsyntheticlambda0.onExtraCallback(iAuthTabCallback);
        iAuthTabCallback.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr, i);
    }

    static final class IAuthTabCallback<T, R> extends AtomicInteger implements ycxExternalSyntheticLambda1 {
        private static final long serialVersionUID = -2434867452883857743L;
        volatile boolean cancelled;
        final Object[] current;
        final boolean delayErrors;
        final ycxExternalSyntheticLambda0<? super R> downstream;
        final getLogsOrBuilder errors;
        final AtomicLong requested;
        final onExtraCallbackWithResult<T, R>[] subscribers;
        final deserializeIntNullableCollection<? super Object[], ? extends R> zipper;

        IAuthTabCallback(ycxExternalSyntheticLambda0<? super R> ycxexternalsyntheticlambda0, deserializeIntNullableCollection<? super Object[], ? extends R> deserializeintnullablecollection, int i, int i2, boolean z) {
            this.downstream = ycxexternalsyntheticlambda0;
            this.zipper = deserializeintnullablecollection;
            this.delayErrors = z;
            onExtraCallbackWithResult<T, R>[] onextracallbackwithresultArr = new onExtraCallbackWithResult[i];
            for (int i3 = 0; i3 < i; i3++) {
                onextracallbackwithresultArr[i3] = new onExtraCallbackWithResult<>(this, i2);
            }
            this.current = new Object[i];
            this.subscribers = onextracallbackwithresultArr;
            this.requested = new AtomicLong();
            this.errors = new getLogsOrBuilder();
        }

        void onExtraCallbackWithResult(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>[] r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr, int i) {
            onExtraCallbackWithResult<T, R>[] onextracallbackwithresultArr = this.subscribers;
            for (int i2 = 0; i2 < i && !this.cancelled; i2++) {
                if (!this.delayErrors && this.errors.get() != null) {
                    return;
                }
                r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr[i2].subscribe(onextracallbackwithresultArr[i2]);
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            if (setLogs.validate(j)) {
                TombstoneProtosLogBufferBuilder.onWarmupCompleted(this.requested, j);
                IAuthTabCallback();
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            onNavigationEvent();
        }

        void IAuthTabCallback(onExtraCallbackWithResult<T, R> onextracallbackwithresult, Throwable th) {
            if (this.errors.IAuthTabCallback(th)) {
                onextracallbackwithresult.done = true;
                IAuthTabCallback();
            } else {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
        }

        void onNavigationEvent() {
            for (onExtraCallbackWithResult<T, R> onextracallbackwithresult : this.subscribers) {
                onextracallbackwithresult.cancel();
            }
        }

        void IAuthTabCallback() {
            boolean z;
            T tPoll;
            boolean z2;
            if (getAndIncrement() == 0) {
                ycxExternalSyntheticLambda0<? super R> ycxexternalsyntheticlambda0 = this.downstream;
                onExtraCallbackWithResult<T, R>[] onextracallbackwithresultArr = this.subscribers;
                int length = onextracallbackwithresultArr.length;
                Object[] objArr = this.current;
                int iAddAndGet = 1;
                do {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j != j2) {
                        if (this.cancelled) {
                            return;
                        }
                        if (!this.delayErrors && this.errors.get() != null) {
                            onNavigationEvent();
                            ycxexternalsyntheticlambda0.onWarmupCompleted(this.errors.onExtraCallback());
                            return;
                        }
                        boolean z3 = false;
                        for (int i = 0; i < length; i++) {
                            onExtraCallbackWithResult<T, R> onextracallbackwithresult = onextracallbackwithresultArr[i];
                            if (objArr[i] == null) {
                                try {
                                    z = onextracallbackwithresult.done;
                                    parsePositiveDecimal<T> parsepositivedecimal = onextracallbackwithresult.queue;
                                    tPoll = parsepositivedecimal != null ? parsepositivedecimal.poll() : null;
                                    z2 = tPoll == null;
                                } catch (Throwable th) {
                                    NumberConverter.onWarmupCompleted(th);
                                    this.errors.IAuthTabCallback(th);
                                    if (!this.delayErrors) {
                                        onNavigationEvent();
                                        ycxexternalsyntheticlambda0.onWarmupCompleted(this.errors.onExtraCallback());
                                        return;
                                    }
                                }
                                if (z && z2) {
                                    onNavigationEvent();
                                    if (this.errors.get() != null) {
                                        ycxexternalsyntheticlambda0.onWarmupCompleted(this.errors.onExtraCallback());
                                        return;
                                    } else {
                                        ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                                        return;
                                    }
                                }
                                if (z2) {
                                    z3 = true;
                                } else {
                                    objArr[i] = tPoll;
                                }
                            }
                        }
                        if (z3) {
                            break;
                        }
                        try {
                            ycxexternalsyntheticlambda0.onWarmupCompleted((ycxExternalSyntheticLambda0<? super R>) floatExponent.onExtraCallbackWithResult(this.zipper.apply(objArr.clone()), "The zipper returned a null value"));
                            j2++;
                            Arrays.fill(objArr, (Object) null);
                        } catch (Throwable th2) {
                            NumberConverter.onWarmupCompleted(th2);
                            onNavigationEvent();
                            this.errors.IAuthTabCallback(th2);
                            ycxexternalsyntheticlambda0.onWarmupCompleted(this.errors.onExtraCallback());
                            return;
                        }
                    }
                    if (j == j2) {
                        if (this.cancelled) {
                            return;
                        }
                        if (!this.delayErrors && this.errors.get() != null) {
                            onNavigationEvent();
                            ycxexternalsyntheticlambda0.onWarmupCompleted(this.errors.onExtraCallback());
                            return;
                        }
                        for (int i2 = 0; i2 < length; i2++) {
                            onExtraCallbackWithResult<T, R> onextracallbackwithresult2 = onextracallbackwithresultArr[i2];
                            if (objArr[i2] == null) {
                                try {
                                    boolean z4 = onextracallbackwithresult2.done;
                                    parsePositiveDecimal<T> parsepositivedecimal2 = onextracallbackwithresult2.queue;
                                    T tPoll2 = parsepositivedecimal2 != null ? parsepositivedecimal2.poll() : null;
                                    boolean z5 = tPoll2 == null;
                                    if (z4 && z5) {
                                        onNavigationEvent();
                                        if (this.errors.get() != null) {
                                            ycxexternalsyntheticlambda0.onWarmupCompleted(this.errors.onExtraCallback());
                                            return;
                                        } else {
                                            ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                                            return;
                                        }
                                    }
                                    if (!z5) {
                                        objArr[i2] = tPoll2;
                                    }
                                } catch (Throwable th3) {
                                    NumberConverter.onWarmupCompleted(th3);
                                    this.errors.IAuthTabCallback(th3);
                                    if (!this.delayErrors) {
                                        onNavigationEvent();
                                        ycxexternalsyntheticlambda0.onWarmupCompleted(this.errors.onExtraCallback());
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    if (j2 != 0) {
                        for (onExtraCallbackWithResult<T, R> onextracallbackwithresult3 : onextracallbackwithresultArr) {
                            onextracallbackwithresult3.request(j2);
                        }
                        if (j != LongCompanionObject.MAX_VALUE) {
                            this.requested.addAndGet(-j2);
                        }
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }
    }

    static final class onExtraCallbackWithResult<T, R> extends AtomicReference<ycxExternalSyntheticLambda1> implements JsonReaderReadObject<T>, ycxExternalSyntheticLambda1 {
        private static final long serialVersionUID = -4627193790118206028L;
        volatile boolean done;
        final int limit;
        final IAuthTabCallback<T, R> parent;
        final int prefetch;
        long produced;
        parsePositiveDecimal<T> queue;
        int sourceMode;

        onExtraCallbackWithResult(IAuthTabCallback<T, R> iAuthTabCallback, int i) {
            this.parent = iAuthTabCallback;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.setOnce(this, ycxexternalsyntheticlambda1)) {
                if (ycxexternalsyntheticlambda1 instanceof parsePositiveInt) {
                    parsePositiveInt parsepositiveint = (parsePositiveInt) ycxexternalsyntheticlambda1;
                    int iRequestFusion = parsepositiveint.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = parsepositiveint;
                        this.done = true;
                        this.parent.IAuthTabCallback();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = parsepositiveint;
                        ycxexternalsyntheticlambda1.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new getAllocationBacktraceCount(this.prefetch);
                ycxexternalsyntheticlambda1.request(this.prefetch);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            if (this.sourceMode != 2) {
                this.queue.offer(t);
            }
            this.parent.IAuthTabCallback();
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            this.parent.IAuthTabCallback(this, th);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            this.done = true;
            this.parent.IAuthTabCallback();
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            setLogs.cancel(this);
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            if (this.sourceMode != 1) {
                long j2 = this.produced + j;
                if (j2 >= this.limit) {
                    this.produced = 0L;
                    get().request(j2);
                } else {
                    this.produced = j2;
                }
            }
        }
    }
}
