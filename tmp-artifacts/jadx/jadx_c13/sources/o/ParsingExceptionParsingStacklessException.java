package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
import o.findValueByNumber;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ParsingExceptionParsingStacklessException<T, R> extends JsonReaderUnknownNumberParsing<R> {
    final boolean IAuthTabCallback;
    final deserializeIntNullableCollection<? super Object[], ? extends R> onExtraCallback;
    final int onExtraCallbackWithResult;
    final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>[] onNavigationEvent;
    final Iterable<? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>> onWarmupCompleted;

    public ParsingExceptionParsingStacklessException(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>[] r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr, deserializeIntNullableCollection<? super Object[], ? extends R> deserializeintnullablecollection, int i, boolean z) {
        this.onNavigationEvent = r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr;
        this.onWarmupCompleted = null;
        this.onExtraCallback = deserializeintnullablecollection;
        this.onExtraCallbackWithResult = i;
        this.IAuthTabCallback = z;
    }

    public ParsingExceptionParsingStacklessException(Iterable<? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>> iterable, deserializeIntNullableCollection<? super Object[], ? extends R> deserializeintnullablecollection, int i, boolean z) {
        this.onNavigationEvent = null;
        this.onWarmupCompleted = iterable;
        this.onExtraCallback = deserializeintnullablecollection;
        this.onExtraCallbackWithResult = i;
        this.IAuthTabCallback = z;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super R> ycxexternalsyntheticlambda0) {
        int length;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>[] r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr = this.onNavigationEvent;
        if (r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr == null) {
            r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr = new r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk[8];
            try {
                Iterator it = (Iterator) floatExponent.onExtraCallbackWithResult(this.onWarmupCompleted.iterator(), "The iterator returned is null");
                length = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) floatExponent.onExtraCallbackWithResult(it.next(), "The publisher returned by the iterator is null");
                            if (length == r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr.length) {
                                r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>[] r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr2 = new r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk[(length >> 2) + length];
                                System.arraycopy(r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr, 0, r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr2, 0, length);
                                r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr = r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr2;
                            }
                            r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr[length] = r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
                            length++;
                        } catch (Throwable th) {
                            NumberConverter.onWarmupCompleted(th);
                            access25900.error(th, ycxexternalsyntheticlambda0);
                            return;
                        }
                    } catch (Throwable th2) {
                        NumberConverter.onWarmupCompleted(th2);
                        access25900.error(th2, ycxexternalsyntheticlambda0);
                        return;
                    }
                }
            } catch (Throwable th3) {
                NumberConverter.onWarmupCompleted(th3);
                access25900.error(th3, ycxexternalsyntheticlambda0);
                return;
            }
        } else {
            length = r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr.length;
        }
        int i = length;
        if (i == 0) {
            access25900.complete(ycxexternalsyntheticlambda0);
        } else {
            if (i == 1) {
                r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr[0].subscribe(new findValueByNumber.onWarmupCompleted(ycxexternalsyntheticlambda0, new onExtraCallback()));
                return;
            }
            onNavigationEvent onnavigationevent = new onNavigationEvent(ycxexternalsyntheticlambda0, this.onExtraCallback, i, this.onExtraCallbackWithResult, this.IAuthTabCallback);
            ycxexternalsyntheticlambda0.onExtraCallback(onnavigationevent);
            onnavigationevent.IAuthTabCallback(r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr, i);
        }
    }

    static final class onNavigationEvent<T, R> extends addAllLogs<R> {
        private static final long serialVersionUID = -5082275438355852221L;
        volatile boolean cancelled;
        final deserializeIntNullableCollection<? super Object[], ? extends R> combiner;
        int completedSources;
        final boolean delayErrors;
        volatile boolean done;
        final ycxExternalSyntheticLambda0<? super R> downstream;
        final AtomicReference<Throwable> error;
        final Object[] latest;
        int nonEmptySources;
        boolean outputFused;
        final getAllocationBacktraceOrBuilder<Object> queue;
        final AtomicLong requested;
        final IAuthTabCallback<T>[] subscribers;

        onNavigationEvent(ycxExternalSyntheticLambda0<? super R> ycxexternalsyntheticlambda0, deserializeIntNullableCollection<? super Object[], ? extends R> deserializeintnullablecollection, int i, int i2, boolean z) {
            this.downstream = ycxexternalsyntheticlambda0;
            this.combiner = deserializeintnullablecollection;
            IAuthTabCallback<T>[] iAuthTabCallbackArr = new IAuthTabCallback[i];
            for (int i3 = 0; i3 < i; i3++) {
                iAuthTabCallbackArr[i3] = new IAuthTabCallback<>(this, i3, i2);
            }
            this.subscribers = iAuthTabCallbackArr;
            this.latest = new Object[i];
            this.queue = new getAllocationBacktraceOrBuilder<>(i2);
            this.requested = new AtomicLong();
            this.error = new AtomicReference<>();
            this.delayErrors = z;
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            if (setLogs.validate(j)) {
                TombstoneProtosLogBufferBuilder.onWarmupCompleted(this.requested, j);
                onExtraCallback();
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            this.cancelled = true;
            onExtraCallbackWithResult();
        }

        void IAuthTabCallback(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T>[] r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr, int i) {
            IAuthTabCallback<T>[] iAuthTabCallbackArr = this.subscribers;
            for (int i2 = 0; i2 < i && !this.done && !this.cancelled; i2++) {
                r8lambdaarg5h4l5ymqb18lwxbfykjvhdskArr[i2].subscribe(iAuthTabCallbackArr[i2]);
            }
        }

        void onWarmupCompleted(int i, T t) {
            boolean z;
            synchronized (this) {
                Object[] objArr = this.latest;
                int i2 = this.nonEmptySources;
                if (objArr[i] == null) {
                    i2++;
                    this.nonEmptySources = i2;
                }
                objArr[i] = t;
                if (objArr.length == i2) {
                    this.queue.IAuthTabCallback(this.subscribers[i], (IAuthTabCallback<T>) objArr.clone());
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                this.subscribers[i].IAuthTabCallback();
            } else {
                onExtraCallback();
            }
        }

        void onWarmupCompleted(int i) {
            int i2;
            synchronized (this) {
                Object[] objArr = this.latest;
                if (objArr[i] == null || (i2 = this.completedSources + 1) == objArr.length) {
                    this.done = true;
                    onExtraCallback();
                } else {
                    this.completedSources = i2;
                }
            }
        }

        void onWarmupCompleted(int i, Throwable th) {
            if (access26100.onWarmupCompleted(this.error, th)) {
                if (!this.delayErrors) {
                    onExtraCallbackWithResult();
                    this.done = true;
                    onExtraCallback();
                    return;
                }
                onWarmupCompleted(i);
                return;
            }
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }

        void onWarmupCompleted() {
            ycxExternalSyntheticLambda0<? super R> ycxexternalsyntheticlambda0 = this.downstream;
            getAllocationBacktraceOrBuilder<Object> getallocationbacktraceorbuilder = this.queue;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                Throwable th = this.error.get();
                if (th != null) {
                    getallocationbacktraceorbuilder.clear();
                    ycxexternalsyntheticlambda0.onWarmupCompleted(th);
                    return;
                }
                boolean z = this.done;
                boolean zIsEmpty = getallocationbacktraceorbuilder.isEmpty();
                if (!zIsEmpty) {
                    ycxexternalsyntheticlambda0.onWarmupCompleted((ycxExternalSyntheticLambda0<? super R>) null);
                }
                if (z && zIsEmpty) {
                    ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                    return;
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            getallocationbacktraceorbuilder.clear();
        }

        void onNavigationEvent() {
            ycxExternalSyntheticLambda0<? super R> ycxexternalsyntheticlambda0 = this.downstream;
            getAllocationBacktraceOrBuilder<?> getallocationbacktraceorbuilder = this.queue;
            int iAddAndGet = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.done;
                    Object objPoll = getallocationbacktraceorbuilder.poll();
                    boolean z2 = objPoll == null;
                    if (!IAuthTabCallback(z, z2, ycxexternalsyntheticlambda0, getallocationbacktraceorbuilder)) {
                        if (z2) {
                            break;
                        }
                        try {
                            ycxexternalsyntheticlambda0.onWarmupCompleted((ycxExternalSyntheticLambda0<? super R>) floatExponent.onExtraCallbackWithResult(this.combiner.apply((Object[]) getallocationbacktraceorbuilder.poll()), "The combiner returned a null value"));
                            ((IAuthTabCallback) objPoll).IAuthTabCallback();
                            j2++;
                        } catch (Throwable th) {
                            NumberConverter.onWarmupCompleted(th);
                            onExtraCallbackWithResult();
                            access26100.onWarmupCompleted(this.error, th);
                            ycxexternalsyntheticlambda0.onWarmupCompleted(access26100.IAuthTabCallback(this.error));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (j2 == j && IAuthTabCallback(this.done, getallocationbacktraceorbuilder.isEmpty(), ycxexternalsyntheticlambda0, getallocationbacktraceorbuilder)) {
                    return;
                }
                if (j2 != 0 && j != LongCompanionObject.MAX_VALUE) {
                    this.requested.addAndGet(-j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        void onExtraCallback() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.outputFused) {
                onWarmupCompleted();
            } else {
                onNavigationEvent();
            }
        }

        boolean IAuthTabCallback(boolean z, boolean z2, ycxExternalSyntheticLambda0<?> ycxexternalsyntheticlambda0, getAllocationBacktraceOrBuilder<?> getallocationbacktraceorbuilder) {
            if (this.cancelled) {
                onExtraCallbackWithResult();
                getallocationbacktraceorbuilder.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.delayErrors) {
                if (!z2) {
                    return false;
                }
                onExtraCallbackWithResult();
                Throwable thIAuthTabCallback = access26100.IAuthTabCallback(this.error);
                if (thIAuthTabCallback != null && thIAuthTabCallback != access26100.IAuthTabCallback) {
                    ycxexternalsyntheticlambda0.onWarmupCompleted(thIAuthTabCallback);
                } else {
                    ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                }
                return true;
            }
            Throwable thIAuthTabCallback2 = access26100.IAuthTabCallback(this.error);
            if (thIAuthTabCallback2 != null && thIAuthTabCallback2 != access26100.IAuthTabCallback) {
                onExtraCallbackWithResult();
                getallocationbacktraceorbuilder.clear();
                ycxexternalsyntheticlambda0.onWarmupCompleted(thIAuthTabCallback2);
                return true;
            }
            if (!z2) {
                return false;
            }
            onExtraCallbackWithResult();
            ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
            return true;
        }

        void onExtraCallbackWithResult() {
            for (IAuthTabCallback<T> iAuthTabCallback : this.subscribers) {
                iAuthTabCallback.onExtraCallback();
            }
        }

        @Override // o.parseFloatGeneric
        public int requestFusion(int i) {
            if ((i & 4) != 0) {
                return 0;
            }
            int i2 = i & 2;
            this.outputFused = i2 != 0;
            return i2;
        }

        @Override // o.parsePositiveDecimal
        public R poll() throws Exception {
            Object objPoll = this.queue.poll();
            if (objPoll == null) {
                return null;
            }
            R r = (R) floatExponent.onExtraCallbackWithResult(this.combiner.apply((Object[]) this.queue.poll()), "The combiner returned a null value");
            ((IAuthTabCallback) objPoll).IAuthTabCallback();
            return r;
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

    static final class IAuthTabCallback<T> extends AtomicReference<ycxExternalSyntheticLambda1> implements JsonReaderReadObject<T> {
        private static final long serialVersionUID = -8730235182291002949L;
        final int index;
        final int limit;
        final onNavigationEvent<T, ?> parent;
        final int prefetch;
        int produced;

        IAuthTabCallback(onNavigationEvent<T, ?> onnavigationevent, int i, int i2) {
            this.parent = onnavigationevent;
            this.index = i;
            this.prefetch = i2;
            this.limit = i2 - (i2 >> 2);
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            setLogs.setOnce(this, ycxexternalsyntheticlambda1, this.prefetch);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            this.parent.onWarmupCompleted(this.index, (int) t);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            this.parent.onWarmupCompleted(this.index, th);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            this.parent.onWarmupCompleted(this.index);
        }

        public void onExtraCallback() {
            setLogs.cancel(this);
        }

        public void IAuthTabCallback() {
            int i = this.produced + 1;
            if (i == this.limit) {
                this.produced = 0;
                get().request(i);
            } else {
                this.produced = i;
            }
        }
    }

    final class onExtraCallback implements deserializeIntNullableCollection<T, R> {
        onExtraCallback() {
        }

        @Override // o.deserializeIntNullableCollection
        public R apply(T t) throws Exception {
            return ParsingExceptionParsingStacklessException.this.onExtraCallback.apply(new Object[]{t});
        }
    }
}
