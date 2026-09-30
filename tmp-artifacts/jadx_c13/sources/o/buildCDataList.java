package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class buildCDataList<T, U> extends ObjectConverter2<T, U> {
    final int IAuthTabCallback;
    final boolean onExtraCallback;
    final int onNavigationEvent;
    final deserializeIntNullableCollection<? super T, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends U>> onWarmupCompleted;

    public buildCDataList(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, deserializeIntNullableCollection<? super T, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends U>> deserializeintnullablecollection, boolean z, int i, int i2) {
        super(jsonReaderUnknownNumberParsing);
        this.onWarmupCompleted = deserializeintnullablecollection;
        this.onExtraCallback = z;
        this.onNavigationEvent = i;
        this.IAuthTabCallback = i2;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super U> ycxexternalsyntheticlambda0) {
        if (access17700.onExtraCallback(this.onExtraCallbackWithResult, ycxexternalsyntheticlambda0, this.onWarmupCompleted)) {
            return;
        }
        this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) IAuthTabCallback(ycxexternalsyntheticlambda0, this.onWarmupCompleted, this.onExtraCallback, this.onNavigationEvent, this.IAuthTabCallback));
    }

    public static <T, U> JsonReaderReadObject<T> IAuthTabCallback(ycxExternalSyntheticLambda0<? super U> ycxexternalsyntheticlambda0, deserializeIntNullableCollection<? super T, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends U>> deserializeintnullablecollection, boolean z, int i, int i2) {
        return new onNavigationEvent(ycxexternalsyntheticlambda0, deserializeintnullablecollection, z, i, i2);
    }

    static final class onNavigationEvent<T, U> extends AtomicInteger implements JsonReaderReadObject<T>, ycxExternalSyntheticLambda1 {
        static final onWarmupCompleted<?, ?>[] onExtraCallbackWithResult = new onWarmupCompleted[0];
        static final onWarmupCompleted<?, ?>[] onNavigationEvent = new onWarmupCompleted[0];
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final ycxExternalSyntheticLambda0<? super U> downstream;
        final getLogsOrBuilder errs = new getLogsOrBuilder();
        long lastId;
        int lastIndex;
        final deserializeIntNullableCollection<? super T, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends U>> mapper;
        final int maxConcurrency;
        volatile parseNegativeInt<U> queue;
        final AtomicLong requested;
        int scalarEmitted;
        final int scalarLimit;
        final AtomicReference<onWarmupCompleted<?, ?>[]> subscribers;
        long uniqueId;
        ycxExternalSyntheticLambda1 upstream;

        onNavigationEvent(ycxExternalSyntheticLambda0<? super U> ycxexternalsyntheticlambda0, deserializeIntNullableCollection<? super T, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends U>> deserializeintnullablecollection, boolean z, int i, int i2) {
            AtomicReference<onWarmupCompleted<?, ?>[]> atomicReference = new AtomicReference<>();
            this.subscribers = atomicReference;
            this.requested = new AtomicLong();
            this.downstream = ycxexternalsyntheticlambda0;
            this.mapper = deserializeintnullablecollection;
            this.delayErrors = z;
            this.maxConcurrency = i;
            this.bufferSize = i2;
            this.scalarLimit = Math.max(1, i >> 1);
            atomicReference.lazySet(onExtraCallbackWithResult);
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.validate(this.upstream, ycxexternalsyntheticlambda1)) {
                this.upstream = ycxexternalsyntheticlambda1;
                this.downstream.onExtraCallback(this);
                if (this.cancelled) {
                    return;
                }
                int i = this.maxConcurrency;
                if (i == Integer.MAX_VALUE) {
                    ycxexternalsyntheticlambda1.request(LongCompanionObject.MAX_VALUE);
                } else {
                    ycxexternalsyntheticlambda1.request(i);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            if (this.done) {
                return;
            }
            try {
                r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) floatExponent.onExtraCallbackWithResult(this.mapper.apply(t), "The mapper returned a null Publisher");
                if (r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk instanceof Callable) {
                    try {
                        Object objCall = ((Callable) r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk).call();
                        if (objCall != null) {
                            onExtraCallbackWithResult((onNavigationEvent<T, U>) objCall);
                            return;
                        }
                        if (this.maxConcurrency == Integer.MAX_VALUE || this.cancelled) {
                            return;
                        }
                        int i = this.scalarEmitted + 1;
                        this.scalarEmitted = i;
                        int i2 = this.scalarLimit;
                        if (i == i2) {
                            this.scalarEmitted = 0;
                            this.upstream.request(i2);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        NumberConverter.onWarmupCompleted(th);
                        this.errs.IAuthTabCallback(th);
                        onExtraCallback();
                        return;
                    }
                }
                long j = this.uniqueId;
                this.uniqueId = 1 + j;
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this, j);
                if (onExtraCallbackWithResult(onwarmupcompleted)) {
                    r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk.subscribe(onwarmupcompleted);
                }
            } catch (Throwable th2) {
                NumberConverter.onWarmupCompleted(th2);
                this.upstream.cancel();
                onWarmupCompleted(th2);
            }
        }

        boolean onExtraCallbackWithResult(onWarmupCompleted<T, U> onwarmupcompleted) {
            onWarmupCompleted<?, ?>[] onwarmupcompletedArr;
            onWarmupCompleted[] onwarmupcompletedArr2;
            do {
                onwarmupcompletedArr = this.subscribers.get();
                if (onwarmupcompletedArr == onNavigationEvent) {
                    onwarmupcompleted.dispose();
                    return false;
                }
                int length = onwarmupcompletedArr.length;
                onwarmupcompletedArr2 = new onWarmupCompleted[length + 1];
                System.arraycopy(onwarmupcompletedArr, 0, onwarmupcompletedArr2, 0, length);
                onwarmupcompletedArr2[length] = onwarmupcompleted;
            } while (!setSupportImageTintList.onNavigationEvent(this.subscribers, onwarmupcompletedArr, onwarmupcompletedArr2));
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        void onNavigationEvent(onWarmupCompleted<T, U> onwarmupcompleted) {
            onWarmupCompleted<?, ?>[] onwarmupcompletedArr;
            onWarmupCompleted<?, ?>[] onwarmupcompletedArr2;
            do {
                onwarmupcompletedArr = this.subscribers.get();
                int length = onwarmupcompletedArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (onwarmupcompletedArr[i] == onwarmupcompleted) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    onwarmupcompletedArr2 = onExtraCallbackWithResult;
                } else {
                    onWarmupCompleted<?, ?>[] onwarmupcompletedArr3 = new onWarmupCompleted[length - 1];
                    System.arraycopy(onwarmupcompletedArr, 0, onwarmupcompletedArr3, 0, i);
                    System.arraycopy(onwarmupcompletedArr, i + 1, onwarmupcompletedArr3, i, (length - i) - 1);
                    onwarmupcompletedArr2 = onwarmupcompletedArr3;
                }
            } while (!setSupportImageTintList.onNavigationEvent(this.subscribers, onwarmupcompletedArr, onwarmupcompletedArr2));
        }

        parsePositiveDecimal<U> asBinder() {
            parseNegativeInt<U> getallocationbacktracecount = this.queue;
            if (getallocationbacktracecount == null) {
                if (this.maxConcurrency == Integer.MAX_VALUE) {
                    getallocationbacktracecount = new getAllocationBacktraceOrBuilder<>(this.bufferSize);
                } else {
                    getallocationbacktracecount = new getAllocationBacktraceCount<>(this.maxConcurrency);
                }
                this.queue = getallocationbacktracecount;
            }
            return getallocationbacktracecount;
        }

        void onExtraCallbackWithResult(U u) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.requested.get();
                parsePositiveDecimal<U> parsepositivedecimalAsBinder = this.queue;
                if (j != 0 && (parsepositivedecimalAsBinder == null || parsepositivedecimalAsBinder.isEmpty())) {
                    this.downstream.onWarmupCompleted((ycxExternalSyntheticLambda0<? super U>) u);
                    if (j != LongCompanionObject.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                        int i = this.scalarEmitted + 1;
                        this.scalarEmitted = i;
                        int i2 = this.scalarLimit;
                        if (i == i2) {
                            this.scalarEmitted = 0;
                            this.upstream.request(i2);
                        }
                    }
                } else {
                    if (parsepositivedecimalAsBinder == null) {
                        parsepositivedecimalAsBinder = asBinder();
                    }
                    if (!parsepositivedecimalAsBinder.offer(u)) {
                        onWarmupCompleted((Throwable) new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!asBinder().offer(u)) {
                onWarmupCompleted((Throwable) new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            asInterface();
        }

        parsePositiveDecimal<U> onExtraCallback(onWarmupCompleted<T, U> onwarmupcompleted) {
            parsePositiveDecimal<U> parsepositivedecimal = onwarmupcompleted.queue;
            if (parsepositivedecimal != null) {
                return parsepositivedecimal;
            }
            getAllocationBacktraceCount getallocationbacktracecount = new getAllocationBacktraceCount(this.bufferSize);
            onwarmupcompleted.queue = getallocationbacktracecount;
            return getallocationbacktracecount;
        }

        void IAuthTabCallback(U u, onWarmupCompleted<T, U> onwarmupcompleted) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.requested.get();
                parsePositiveDecimal<U> parsepositivedecimalOnExtraCallback = onwarmupcompleted.queue;
                if (j != 0 && (parsepositivedecimalOnExtraCallback == null || parsepositivedecimalOnExtraCallback.isEmpty())) {
                    this.downstream.onWarmupCompleted((ycxExternalSyntheticLambda0<? super U>) u);
                    if (j != LongCompanionObject.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    onwarmupcompleted.onExtraCallback(1L);
                } else {
                    if (parsepositivedecimalOnExtraCallback == null) {
                        parsepositivedecimalOnExtraCallback = onExtraCallback(onwarmupcompleted);
                    }
                    if (!parsepositivedecimalOnExtraCallback.offer(u)) {
                        onWarmupCompleted((Throwable) new NetConverter4("Inner queue full?!"));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                parsePositiveDecimal getallocationbacktracecount = onwarmupcompleted.queue;
                if (getallocationbacktracecount == null) {
                    getallocationbacktracecount = new getAllocationBacktraceCount(this.bufferSize);
                    onwarmupcompleted.queue = getallocationbacktracecount;
                }
                if (!getallocationbacktracecount.offer(u)) {
                    onWarmupCompleted((Throwable) new NetConverter4("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            asInterface();
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
                return;
            }
            if (this.errs.IAuthTabCallback(th)) {
                this.done = true;
                if (!this.delayErrors) {
                    for (onWarmupCompleted<?, ?> onwarmupcompleted : this.subscribers.getAndSet(onNavigationEvent)) {
                        onwarmupcompleted.dispose();
                    }
                }
                onExtraCallback();
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
            onExtraCallback();
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
            parseNegativeInt<U> parsenegativeint;
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            onNavigationEvent();
            if (getAndIncrement() != 0 || (parsenegativeint = this.queue) == null) {
                return;
            }
            parsenegativeint.clear();
        }

        void onExtraCallback() {
            if (getAndIncrement() == 0) {
                asInterface();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:87:0x012e, code lost:
        
            if (r10 == r14) goto L92;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0130, code lost:
        
            if (r9 != false) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x0132, code lost:
        
            r5 = r24.requested.addAndGet(-r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x013a, code lost:
        
            r5 = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x013f, code lost:
        
            r7.onExtraCallback(r10);
            r10 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0145, code lost:
        
            r10 = r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0148, code lost:
        
            if (r5 == r10) goto L155;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x014a, code lost:
        
            if (r22 != null) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x014d, code lost:
        
            r10 = r13;
            r11 = r22;
            r14 = 0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void asInterface() {
            long j;
            int i;
            long j2;
            long j3;
            boolean z;
            int i2;
            Object obj;
            ycxExternalSyntheticLambda0<? super U> ycxexternalsyntheticlambda0 = this.downstream;
            int iAddAndGet = 1;
            while (!onWarmupCompleted()) {
                parseNegativeInt<U> parsenegativeint = this.queue;
                long jAddAndGet = this.requested.get();
                boolean z2 = jAddAndGet == LongCompanionObject.MAX_VALUE;
                long j4 = 0;
                if (parsenegativeint != null) {
                    j = 0;
                    do {
                        long j5 = 0;
                        obj = null;
                        while (true) {
                            if (jAddAndGet == 0) {
                                break;
                            }
                            U uPoll = parsenegativeint.poll();
                            if (onWarmupCompleted()) {
                                return;
                            }
                            if (uPoll == null) {
                                obj = uPoll;
                                break;
                            }
                            ycxexternalsyntheticlambda0.onWarmupCompleted((ycxExternalSyntheticLambda0<? super U>) uPoll);
                            j++;
                            j5++;
                            jAddAndGet--;
                            obj = uPoll;
                        }
                        if (j5 != 0) {
                            jAddAndGet = z2 ? LongCompanionObject.MAX_VALUE : this.requested.addAndGet(-j5);
                        }
                        if (jAddAndGet == 0) {
                            break;
                        }
                    } while (obj != null);
                } else {
                    j = 0;
                }
                boolean z3 = this.done;
                parseNegativeInt<U> parsenegativeint2 = this.queue;
                onWarmupCompleted<?, ?>[] onwarmupcompletedArr = this.subscribers.get();
                int length = onwarmupcompletedArr.length;
                if (z3 && ((parsenegativeint2 == null || parsenegativeint2.isEmpty()) && length == 0)) {
                    Throwable thOnExtraCallback = this.errs.onExtraCallback();
                    if (thOnExtraCallback != access26100.IAuthTabCallback) {
                        if (thOnExtraCallback == null) {
                            ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                            return;
                        } else {
                            ycxexternalsyntheticlambda0.onWarmupCompleted(thOnExtraCallback);
                            return;
                        }
                    }
                    return;
                }
                if (length != 0) {
                    i = iAddAndGet;
                    long j6 = this.lastId;
                    int i3 = this.lastIndex;
                    if (length <= i3 || onwarmupcompletedArr[i3].id != j6) {
                        if (length <= i3) {
                            i3 = 0;
                        }
                        for (int i4 = 0; i4 < length && onwarmupcompletedArr[i3].id != j6; i4++) {
                            i3++;
                            if (i3 == length) {
                                i3 = 0;
                            }
                        }
                        this.lastIndex = i3;
                        this.lastId = onwarmupcompletedArr[i3].id;
                    }
                    int i5 = i3;
                    boolean z4 = false;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            z = z4;
                            break;
                        }
                        if (onWarmupCompleted()) {
                            return;
                        }
                        onWarmupCompleted<T, U> onwarmupcompleted = onwarmupcompletedArr[i5];
                        Object obj2 = null;
                        while (!onWarmupCompleted()) {
                            parsePositiveDecimal<U> parsepositivedecimal = onwarmupcompleted.queue;
                            int i7 = length;
                            if (parsepositivedecimal != null) {
                                Object obj3 = obj2;
                                long j7 = j4;
                                while (true) {
                                    if (jAddAndGet == j4) {
                                        break;
                                    }
                                    try {
                                        U uPoll2 = parsepositivedecimal.poll();
                                        if (uPoll2 == null) {
                                            obj3 = uPoll2;
                                            j4 = 0;
                                            break;
                                        }
                                        ycxexternalsyntheticlambda0.onWarmupCompleted((ycxExternalSyntheticLambda0<? super U>) uPoll2);
                                        if (onWarmupCompleted()) {
                                            return;
                                        }
                                        jAddAndGet--;
                                        j7++;
                                        obj3 = uPoll2;
                                        j4 = 0;
                                    } catch (Throwable th) {
                                        NumberConverter.onWarmupCompleted(th);
                                        onwarmupcompleted.dispose();
                                        this.errs.IAuthTabCallback(th);
                                        if (!this.delayErrors) {
                                            this.upstream.cancel();
                                        }
                                        if (onWarmupCompleted()) {
                                            return;
                                        }
                                        onNavigationEvent(onwarmupcompleted);
                                        i6++;
                                        z4 = true;
                                        i2 = 1;
                                    }
                                }
                            }
                            boolean z5 = onwarmupcompleted.done;
                            parsePositiveDecimal<U> parsepositivedecimal2 = onwarmupcompleted.queue;
                            if (z5 && (parsepositivedecimal2 == null || parsepositivedecimal2.isEmpty())) {
                                onNavigationEvent(onwarmupcompleted);
                                if (onWarmupCompleted()) {
                                    return;
                                }
                                j++;
                                z4 = true;
                            }
                            if (jAddAndGet == 0) {
                                z = z4;
                                break;
                            }
                            i5++;
                            if (i5 == i7) {
                                i5 = 0;
                            }
                            i2 = 1;
                            i6 += i2;
                            length = i7;
                            j4 = 0;
                        }
                        return;
                    }
                    this.lastIndex = i5;
                    this.lastId = onwarmupcompletedArr[i5].id;
                    j3 = j;
                    j2 = 0;
                } else {
                    i = iAddAndGet;
                    j2 = 0;
                    j3 = j;
                    z = false;
                }
                if (j3 != j2 && !this.cancelled) {
                    this.upstream.request(j3);
                }
                int i8 = i;
                if (z) {
                    iAddAndGet = i8;
                } else {
                    iAddAndGet = addAndGet(-i8);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        boolean onWarmupCompleted() {
            if (this.cancelled) {
                IAuthTabCallback();
                return true;
            }
            if (this.delayErrors || this.errs.get() == null) {
                return false;
            }
            IAuthTabCallback();
            Throwable thOnExtraCallback = this.errs.onExtraCallback();
            if (thOnExtraCallback != access26100.IAuthTabCallback) {
                this.downstream.onWarmupCompleted(thOnExtraCallback);
            }
            return true;
        }

        void IAuthTabCallback() {
            parseNegativeInt<U> parsenegativeint = this.queue;
            if (parsenegativeint != null) {
                parsenegativeint.clear();
            }
        }

        void onNavigationEvent() {
            onWarmupCompleted<?, ?>[] andSet;
            onWarmupCompleted<?, ?>[] onwarmupcompletedArr = this.subscribers.get();
            onWarmupCompleted<?, ?>[] onwarmupcompletedArr2 = onNavigationEvent;
            if (onwarmupcompletedArr == onwarmupcompletedArr2 || (andSet = this.subscribers.getAndSet(onwarmupcompletedArr2)) == onwarmupcompletedArr2) {
                return;
            }
            for (onWarmupCompleted<?, ?> onwarmupcompleted : andSet) {
                onwarmupcompleted.dispose();
            }
            Throwable thOnExtraCallback = this.errs.onExtraCallback();
            if (thOnExtraCallback == null || thOnExtraCallback == access26100.IAuthTabCallback) {
                return;
            }
            RxJavaPlugins.onExtraCallbackWithResult(thOnExtraCallback);
        }

        void IAuthTabCallback(onWarmupCompleted<T, U> onwarmupcompleted, Throwable th) {
            if (this.errs.IAuthTabCallback(th)) {
                onwarmupcompleted.done = true;
                if (!this.delayErrors) {
                    this.upstream.cancel();
                    for (onWarmupCompleted<?, ?> onwarmupcompleted2 : this.subscribers.getAndSet(onNavigationEvent)) {
                        onwarmupcompleted2.dispose();
                    }
                }
                onExtraCallback();
                return;
            }
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }
    }

    static final class onWarmupCompleted<T, U> extends AtomicReference<ycxExternalSyntheticLambda1> implements JsonReaderReadObject<U>, deserializeUriNullableCollection {
        private static final long serialVersionUID = -4606175640614850599L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long id;
        final int limit;
        final onNavigationEvent<T, U> parent;
        long produced;
        volatile parsePositiveDecimal<U> queue;

        onWarmupCompleted(onNavigationEvent<T, U> onnavigationevent, long j) {
            this.id = j;
            this.parent = onnavigationevent;
            int i = onnavigationevent.bufferSize;
            this.bufferSize = i;
            this.limit = i >> 2;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.setOnce(this, ycxexternalsyntheticlambda1)) {
                if (ycxexternalsyntheticlambda1 instanceof parsePositiveInt) {
                    parsePositiveInt parsepositiveint = (parsePositiveInt) ycxexternalsyntheticlambda1;
                    int iRequestFusion = parsepositiveint.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.fusionMode = iRequestFusion;
                        this.queue = parsepositiveint;
                        this.done = true;
                        this.parent.onExtraCallback();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.fusionMode = iRequestFusion;
                        this.queue = parsepositiveint;
                    }
                }
                ycxexternalsyntheticlambda1.request(this.bufferSize);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(U u) {
            if (this.fusionMode != 2) {
                this.parent.IAuthTabCallback((onNavigationEvent<T, U>) u, (onWarmupCompleted<T, onNavigationEvent<T, U>>) this);
            } else {
                this.parent.onExtraCallback();
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            lazySet(setLogs.CANCELLED);
            this.parent.IAuthTabCallback(this, th);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            this.done = true;
            this.parent.onExtraCallback();
        }

        void onExtraCallback(long j) {
            if (this.fusionMode != 1) {
                long j2 = this.produced + j;
                if (j2 >= this.limit) {
                    this.produced = 0L;
                    get().request(j2);
                } else {
                    this.produced = j2;
                }
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            setLogs.cancel(this);
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return get() == setLogs.CANCELLED;
        }
    }
}
