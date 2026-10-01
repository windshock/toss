package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getDefaultInstance<T> extends deserializeDoubleCollection<T> implements parseDelimitedFrom<T> {
    final JsonReaderUnknownNumberParsing<T> IAuthTabCallback;
    final AtomicReference<onNavigationEvent<T>> onExtraCallback;
    final int onExtraCallbackWithResult;
    final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> onNavigationEvent;

    public static <T> deserializeDoubleCollection<T> onNavigationEvent(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, int i) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onExtraCallbackWithResult((deserializeDoubleCollection) new getDefaultInstance(new onExtraCallback(atomicReference, i), jsonReaderUnknownNumberParsing, atomicReference, i));
    }

    private getDefaultInstance(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, AtomicReference<onNavigationEvent<T>> atomicReference, int i) {
        this.onNavigationEvent = r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
        this.IAuthTabCallback = jsonReaderUnknownNumberParsing;
        this.onExtraCallback = atomicReference;
        this.onExtraCallbackWithResult = i;
    }

    @Override // o.parseDelimitedFrom
    public int readTypedObject() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.parseDelimitedFrom
    public r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> ICustomTabsCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.onNavigationEvent.subscribe(ycxexternalsyntheticlambda0);
    }

    @Override // o.deserializeDoubleCollection
    public void onExtraCallbackWithResult(deserializeFloat<? super deserializeUriNullableCollection> deserializefloat) {
        onNavigationEvent<T> onnavigationevent;
        while (true) {
            onnavigationevent = this.onExtraCallback.get();
            if (onnavigationevent != null && !onnavigationevent.isDisposed()) {
                break;
            }
            onNavigationEvent<T> onnavigationevent2 = new onNavigationEvent<>(this.onExtraCallback, this.onExtraCallbackWithResult);
            if (setSupportImageTintList.onNavigationEvent(this.onExtraCallback, onnavigationevent, onnavigationevent2)) {
                onnavigationevent = onnavigationevent2;
                break;
            }
        }
        boolean z = false;
        if (!onnavigationevent.shouldConnect.get() && onnavigationevent.shouldConnect.compareAndSet(false, true)) {
            z = true;
        }
        try {
            deserializefloat.accept(onnavigationevent);
            if (z) {
                this.IAuthTabCallback.onExtraCallback((JsonReaderReadObject) onnavigationevent);
            }
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            throw access26100.onExtraCallback(th);
        }
    }

    static final class onNavigationEvent<T> extends AtomicInteger implements JsonReaderReadObject<T>, deserializeUriNullableCollection {
        static final onExtraCallbackWithResult[] IAuthTabCallback = new onExtraCallbackWithResult[0];
        static final onExtraCallbackWithResult[] onNavigationEvent = new onExtraCallbackWithResult[0];
        private static final long serialVersionUID = -202316842419149694L;
        final int bufferSize;
        final AtomicReference<onNavigationEvent<T>> current;
        volatile parsePositiveDecimal<T> queue;
        int sourceMode;
        volatile Object terminalEvent;
        final AtomicReference<ycxExternalSyntheticLambda1> upstream = new AtomicReference<>();
        final AtomicReference<onExtraCallbackWithResult<T>[]> subscribers = new AtomicReference<>(IAuthTabCallback);
        final AtomicBoolean shouldConnect = new AtomicBoolean();

        onNavigationEvent(AtomicReference<onNavigationEvent<T>> atomicReference, int i) {
            this.current = atomicReference;
            this.bufferSize = i;
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            onExtraCallbackWithResult<T>[] onextracallbackwithresultArr = this.subscribers.get();
            onExtraCallbackWithResult<T>[] onextracallbackwithresultArr2 = onNavigationEvent;
            if (onextracallbackwithresultArr == onextracallbackwithresultArr2 || this.subscribers.getAndSet(onextracallbackwithresultArr2) == onextracallbackwithresultArr2) {
                return;
            }
            setSupportImageTintList.onNavigationEvent(this.current, this, (Object) null);
            setLogs.cancel(this.upstream);
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.subscribers.get() == onNavigationEvent;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.setOnce(this.upstream, ycxexternalsyntheticlambda1)) {
                if (ycxexternalsyntheticlambda1 instanceof parsePositiveInt) {
                    parsePositiveInt parsepositiveint = (parsePositiveInt) ycxexternalsyntheticlambda1;
                    int iRequestFusion = parsepositiveint.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = parsepositiveint;
                        this.terminalEvent = access26200.complete();
                        onWarmupCompleted();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = parsepositiveint;
                        ycxexternalsyntheticlambda1.request(this.bufferSize);
                        return;
                    }
                }
                this.queue = new getAllocationBacktraceCount(this.bufferSize);
                ycxexternalsyntheticlambda1.request(this.bufferSize);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            if (this.sourceMode == 0 && !this.queue.offer(t)) {
                onWarmupCompleted((Throwable) new NetConverter4("Prefetch queue is full?!"));
            } else {
                onWarmupCompleted();
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            if (this.terminalEvent == null) {
                this.terminalEvent = access26200.error(th);
                onWarmupCompleted();
            } else {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            if (this.terminalEvent == null) {
                this.terminalEvent = access26200.complete();
                onWarmupCompleted();
            }
        }

        boolean onNavigationEvent(onExtraCallbackWithResult<T> onextracallbackwithresult) {
            onExtraCallbackWithResult<T>[] onextracallbackwithresultArr;
            onExtraCallbackWithResult[] onextracallbackwithresultArr2;
            do {
                onextracallbackwithresultArr = this.subscribers.get();
                if (onextracallbackwithresultArr == onNavigationEvent) {
                    return false;
                }
                int length = onextracallbackwithresultArr.length;
                onextracallbackwithresultArr2 = new onExtraCallbackWithResult[length + 1];
                System.arraycopy(onextracallbackwithresultArr, 0, onextracallbackwithresultArr2, 0, length);
                onextracallbackwithresultArr2[length] = onextracallbackwithresult;
            } while (!setSupportImageTintList.onNavigationEvent(this.subscribers, onextracallbackwithresultArr, onextracallbackwithresultArr2));
            return true;
        }

        void onExtraCallback(onExtraCallbackWithResult<T> onextracallbackwithresult) {
            onExtraCallbackWithResult<T>[] onextracallbackwithresultArr;
            onExtraCallbackWithResult[] onextracallbackwithresultArr2;
            do {
                onextracallbackwithresultArr = this.subscribers.get();
                int length = onextracallbackwithresultArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (onextracallbackwithresultArr[i].equals(onextracallbackwithresult)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    onextracallbackwithresultArr2 = IAuthTabCallback;
                } else {
                    onExtraCallbackWithResult[] onextracallbackwithresultArr3 = new onExtraCallbackWithResult[length - 1];
                    System.arraycopy(onextracallbackwithresultArr, 0, onextracallbackwithresultArr3, 0, i);
                    System.arraycopy(onextracallbackwithresultArr, i + 1, onextracallbackwithresultArr3, i, (length - i) - 1);
                    onextracallbackwithresultArr2 = onextracallbackwithresultArr3;
                }
            } while (!setSupportImageTintList.onNavigationEvent(this.subscribers, onextracallbackwithresultArr, onextracallbackwithresultArr2));
        }

        boolean onExtraCallbackWithResult(Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                if (!access26200.isComplete(obj)) {
                    Throwable error = access26200.getError(obj);
                    setSupportImageTintList.onNavigationEvent(this.current, this, (Object) null);
                    onExtraCallbackWithResult<T>[] andSet = this.subscribers.getAndSet(onNavigationEvent);
                    if (andSet.length != 0) {
                        int length = andSet.length;
                        while (i < length) {
                            andSet[i].child.onWarmupCompleted(error);
                            i++;
                        }
                    } else {
                        RxJavaPlugins.onExtraCallbackWithResult(error);
                    }
                    return true;
                }
                if (z) {
                    setSupportImageTintList.onNavigationEvent(this.current, this, (Object) null);
                    onExtraCallbackWithResult<T>[] andSet2 = this.subscribers.getAndSet(onNavigationEvent);
                    int length2 = andSet2.length;
                    while (i < length2) {
                        andSet2[i].child.onExtraCallbackWithResult();
                        i++;
                    }
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:67:0x011e, code lost:
        
            if (r11 == 0) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0123, code lost:
        
            if (r25.sourceMode == 1) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0125, code lost:
        
            r25.upstream.get().request(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0131, code lost:
        
            r4 = r0;
            r3 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void onWarmupCompleted() {
            T tPoll;
            long j;
            T tPoll2;
            parsePositiveDecimal<T> parsepositivedecimal;
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<onExtraCallbackWithResult<T>[]> atomicReference = this.subscribers;
            boolean z2 = true;
            onExtraCallbackWithResult<T>[] onextracallbackwithresultArr = atomicReference.get();
            int iAddAndGet = 1;
            while (true) {
                Object obj = this.terminalEvent;
                parsePositiveDecimal<T> parsepositivedecimal2 = this.queue;
                boolean z3 = (parsepositivedecimal2 == null || parsepositivedecimal2.isEmpty()) ? z2 : false;
                if (onExtraCallbackWithResult(obj, z3)) {
                    return;
                }
                if (!z3) {
                    int length = onextracallbackwithresultArr.length;
                    int i = 0;
                    long jMin = LongCompanionObject.MAX_VALUE;
                    for (onExtraCallbackWithResult<T> onextracallbackwithresult : onextracallbackwithresultArr) {
                        long j2 = onextracallbackwithresult.get();
                        if (j2 != Long.MIN_VALUE) {
                            jMin = Math.min(jMin, j2 - onextracallbackwithresult.emitted);
                        } else {
                            i++;
                        }
                    }
                    if (length == i) {
                        Object objError = this.terminalEvent;
                        try {
                            tPoll = parsepositivedecimal2.poll();
                        } catch (Throwable th) {
                            NumberConverter.onWarmupCompleted(th);
                            this.upstream.get().cancel();
                            objError = access26200.error(th);
                            this.terminalEvent = objError;
                            tPoll = null;
                        }
                        if (onExtraCallbackWithResult(objError, tPoll == null ? z2 : false)) {
                            return;
                        }
                        if (this.sourceMode != z2) {
                            this.upstream.get().request(1L);
                        }
                    } else {
                        int i2 = 0;
                        while (true) {
                            j = i2;
                            if (j >= jMin) {
                                break;
                            }
                            Object objError2 = this.terminalEvent;
                            try {
                                tPoll2 = parsepositivedecimal2.poll();
                            } catch (Throwable th2) {
                                NumberConverter.onWarmupCompleted(th2);
                                this.upstream.get().cancel();
                                objError2 = access26200.error(th2);
                                this.terminalEvent = objError2;
                                tPoll2 = null;
                            }
                            boolean z4 = tPoll2 != null ? false : z2;
                            if (onExtraCallbackWithResult(objError2, z4)) {
                                return;
                            }
                            if (z4) {
                                z3 = z4;
                                break;
                            }
                            Object value = access26200.getValue(tPoll2);
                            int length2 = onextracallbackwithresultArr.length;
                            int i3 = 0;
                            boolean z5 = false;
                            while (i3 < length2) {
                                onExtraCallbackWithResult<T> onextracallbackwithresult2 = onextracallbackwithresultArr[i3];
                                long j3 = onextracallbackwithresult2.get();
                                if (j3 != Long.MIN_VALUE) {
                                    if (j3 != LongCompanionObject.MAX_VALUE) {
                                        parsepositivedecimal = parsepositivedecimal2;
                                        z = z4;
                                        onextracallbackwithresult2.emitted++;
                                    } else {
                                        parsepositivedecimal = parsepositivedecimal2;
                                        z = z4;
                                    }
                                    onextracallbackwithresult2.child.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) value);
                                } else {
                                    parsepositivedecimal = parsepositivedecimal2;
                                    z = z4;
                                    z5 = true;
                                }
                                i3++;
                                parsepositivedecimal2 = parsepositivedecimal;
                                z4 = z;
                            }
                            parsePositiveDecimal<T> parsepositivedecimal3 = parsepositivedecimal2;
                            boolean z6 = z4;
                            i2++;
                            onExtraCallbackWithResult<T>[] onextracallbackwithresultArr2 = atomicReference.get();
                            if (z5 || onextracallbackwithresultArr2 != onextracallbackwithresultArr) {
                                break;
                            }
                            parsepositivedecimal2 = parsepositivedecimal3;
                            z3 = z6;
                            z2 = true;
                        }
                        if (i2 != 0) {
                            z2 = true;
                            if (this.sourceMode != 1) {
                                this.upstream.get().request(j);
                            }
                        } else {
                            z2 = true;
                        }
                        if (jMin == 0 || z3) {
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    onextracallbackwithresultArr = atomicReference.get();
                }
            }
        }
    }

    static final class onExtraCallbackWithResult<T> extends AtomicLong implements ycxExternalSyntheticLambda1 {
        private static final long serialVersionUID = -4453897557930727610L;
        final ycxExternalSyntheticLambda0<? super T> child;
        long emitted;
        volatile onNavigationEvent<T> parent;

        onExtraCallbackWithResult(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
            this.child = ycxexternalsyntheticlambda0;
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            if (setLogs.validate(j)) {
                TombstoneProtosLogBufferBuilder.onNavigationEvent(this, j);
                onNavigationEvent<T> onnavigationevent = this.parent;
                if (onnavigationevent != null) {
                    onnavigationevent.onWarmupCompleted();
                }
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            onNavigationEvent<T> onnavigationevent;
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (onnavigationevent = this.parent) == null) {
                return;
            }
            onnavigationevent.onExtraCallback((onExtraCallbackWithResult) this);
            onnavigationevent.onWarmupCompleted();
        }
    }

    static final class onExtraCallback<T> implements r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> {
        private final AtomicReference<onNavigationEvent<T>> IAuthTabCallback;
        private final int onExtraCallbackWithResult;

        onExtraCallback(AtomicReference<onNavigationEvent<T>> atomicReference, int i) {
            this.IAuthTabCallback = atomicReference;
            this.onExtraCallbackWithResult = i;
        }

        @Override // o.r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk
        public void subscribe(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
            onNavigationEvent<T> onnavigationevent;
            onExtraCallbackWithResult<T> onextracallbackwithresult = new onExtraCallbackWithResult<>(ycxexternalsyntheticlambda0);
            ycxexternalsyntheticlambda0.onExtraCallback(onextracallbackwithresult);
            while (true) {
                onnavigationevent = this.IAuthTabCallback.get();
                if (onnavigationevent == null || onnavigationevent.isDisposed()) {
                    onNavigationEvent<T> onnavigationevent2 = new onNavigationEvent<>(this.IAuthTabCallback, this.onExtraCallbackWithResult);
                    if (setSupportImageTintList.onNavigationEvent(this.IAuthTabCallback, onnavigationevent, onnavigationevent2)) {
                        onnavigationevent = onnavigationevent2;
                    } else {
                        continue;
                    }
                }
                if (onnavigationevent.onNavigationEvent(onextracallbackwithresult)) {
                    break;
                }
            }
            if (onextracallbackwithresult.get() == Long.MIN_VALUE) {
                onnavigationevent.onExtraCallback((onExtraCallbackWithResult) onextracallbackwithresult);
            } else {
                onextracallbackwithresult.parent = onnavigationevent;
            }
            onnavigationevent.onWarmupCompleted();
        }
    }
}
