package o;

import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setMemoryTags<T> extends deserializeDoubleCollection<T> implements ResettableConnectable {
    final AtomicReference<onNavigationEvent<T>> IAuthTabCallback = new AtomicReference<>();
    final int onNavigationEvent;
    final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> onWarmupCompleted;

    public setMemoryTags(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, int i) {
        this.onWarmupCompleted = r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
        this.onNavigationEvent = i;
    }

    @Override // o.deserializeDoubleCollection
    public void onExtraCallbackWithResult(deserializeFloat<? super deserializeUriNullableCollection> deserializefloat) {
        onNavigationEvent<T> onnavigationevent;
        while (true) {
            onnavigationevent = this.IAuthTabCallback.get();
            if (onnavigationevent != null && !onnavigationevent.isDisposed()) {
                break;
            }
            onNavigationEvent<T> onnavigationevent2 = new onNavigationEvent<>(this.IAuthTabCallback, this.onNavigationEvent);
            if (setSupportImageTintList.onNavigationEvent(this.IAuthTabCallback, onnavigationevent, onnavigationevent2)) {
                onnavigationevent = onnavigationevent2;
                break;
            }
        }
        boolean z = false;
        if (!onnavigationevent.connect.get() && onnavigationevent.connect.compareAndSet(false, true)) {
            z = true;
        }
        try {
            deserializefloat.accept(onnavigationevent);
            if (z) {
                this.onWarmupCompleted.subscribe(onnavigationevent);
            }
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            throw access26100.onExtraCallback(th);
        }
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        onNavigationEvent<T> onnavigationevent;
        while (true) {
            onnavigationevent = this.IAuthTabCallback.get();
            if (onnavigationevent != null) {
                break;
            }
            onNavigationEvent<T> onnavigationevent2 = new onNavigationEvent<>(this.IAuthTabCallback, this.onNavigationEvent);
            if (setSupportImageTintList.onNavigationEvent(this.IAuthTabCallback, onnavigationevent, onnavigationevent2)) {
                onnavigationevent = onnavigationevent2;
                break;
            }
        }
        onExtraCallback<T> onextracallback = new onExtraCallback<>(ycxexternalsyntheticlambda0, onnavigationevent);
        ycxexternalsyntheticlambda0.onExtraCallback(onextracallback);
        if (onnavigationevent.onExtraCallbackWithResult(onextracallback)) {
            if (onextracallback.onWarmupCompleted()) {
                onnavigationevent.onWarmupCompleted((onExtraCallback) onextracallback);
                return;
            } else {
                onnavigationevent.onNavigationEvent();
                return;
            }
        }
        Throwable th = onnavigationevent.error;
        if (th != null) {
            ycxexternalsyntheticlambda0.onWarmupCompleted(th);
        } else {
            ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
        }
    }

    @Override // io.reactivex.internal.disposables.ResettableConnectable
    public void onWarmupCompleted(deserializeUriNullableCollection deserializeurinullablecollection) {
        setSupportImageTintList.onNavigationEvent(this.IAuthTabCallback, (onNavigationEvent) deserializeurinullablecollection, (Object) null);
    }

    static final class onNavigationEvent<T> extends AtomicInteger implements JsonReaderReadObject<T>, deserializeUriNullableCollection {
        private static final long serialVersionUID = -1672047311619175801L;
        final int bufferSize;
        int consumed;
        final AtomicReference<onNavigationEvent<T>> current;
        volatile boolean done;
        Throwable error;
        volatile parsePositiveDecimal<T> queue;
        int sourceMode;
        static final onExtraCallback[] onNavigationEvent = new onExtraCallback[0];
        static final onExtraCallback[] onExtraCallback = new onExtraCallback[0];
        final AtomicReference<ycxExternalSyntheticLambda1> upstream = new AtomicReference<>();
        final AtomicBoolean connect = new AtomicBoolean();
        final AtomicReference<onExtraCallback<T>[]> subscribers = new AtomicReference<>(onNavigationEvent);

        onNavigationEvent(AtomicReference<onNavigationEvent<T>> atomicReference, int i) {
            this.current = atomicReference;
            this.bufferSize = i;
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.subscribers.getAndSet(onExtraCallback);
            setSupportImageTintList.onNavigationEvent(this.current, this, (Object) null);
            setLogs.cancel(this.upstream);
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.subscribers.get() == onExtraCallback;
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
                        this.done = true;
                        onNavigationEvent();
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
                onNavigationEvent();
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
            onNavigationEvent();
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            this.done = true;
            onNavigationEvent();
        }

        void onNavigationEvent() {
            long j;
            if (getAndIncrement() != 0) {
                return;
            }
            parsePositiveDecimal<T> parsepositivedecimal = this.queue;
            int i = this.consumed;
            int i2 = this.bufferSize;
            int i3 = i2 - (i2 >> 2);
            boolean z = this.sourceMode != 1;
            int iAddAndGet = 1;
            parsePositiveDecimal<T> parsepositivedecimal2 = parsepositivedecimal;
            int i4 = i;
            while (true) {
                if (parsepositivedecimal2 != null) {
                    onExtraCallback<T>[] onextracallbackArr = this.subscribers.get();
                    long jMin = LongCompanionObject.MAX_VALUE;
                    boolean z2 = false;
                    for (onExtraCallback<T> onextracallback : onextracallbackArr) {
                        long j2 = onextracallback.get();
                        if (j2 != Long.MIN_VALUE) {
                            jMin = Math.min(j2 - onextracallback.emitted, jMin);
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        jMin = 0;
                    }
                    while (jMin != j) {
                        boolean z3 = this.done;
                        try {
                            T tPoll = parsepositivedecimal2.poll();
                            boolean z4 = tPoll == null;
                            if (onExtraCallback(z3, z4)) {
                                return;
                            }
                            if (z4) {
                                break;
                            }
                            for (onExtraCallback<T> onextracallback2 : onextracallbackArr) {
                                if (!onextracallback2.onWarmupCompleted()) {
                                    onextracallback2.downstream.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) tPoll);
                                    onextracallback2.emitted++;
                                }
                            }
                            if (z && (i4 = i4 + 1) == i3) {
                                this.upstream.get().request(i3);
                                i4 = 0;
                            }
                            jMin--;
                            j = onextracallbackArr == this.subscribers.get() ? 0L : 0L;
                        } catch (Throwable th) {
                            NumberConverter.onWarmupCompleted(th);
                            this.upstream.get().cancel();
                            parsepositivedecimal2.clear();
                            this.done = true;
                            IAuthTabCallback(th);
                            return;
                        }
                    }
                    if (onExtraCallback(this.done, parsepositivedecimal2.isEmpty())) {
                        return;
                    }
                }
                this.consumed = i4;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (parsepositivedecimal2 == null) {
                    parsepositivedecimal2 = this.queue;
                }
            }
        }

        boolean onExtraCallback(boolean z, boolean z2) {
            if (!z || !z2) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                IAuthTabCallback(th);
                return true;
            }
            for (onExtraCallback<T> onextracallback : this.subscribers.getAndSet(onExtraCallback)) {
                if (!onextracallback.onWarmupCompleted()) {
                    onextracallback.downstream.onExtraCallbackWithResult();
                }
            }
            return true;
        }

        void IAuthTabCallback(Throwable th) {
            for (onExtraCallback<T> onextracallback : this.subscribers.getAndSet(onExtraCallback)) {
                if (!onextracallback.onWarmupCompleted()) {
                    onextracallback.downstream.onWarmupCompleted(th);
                }
            }
        }

        boolean onExtraCallbackWithResult(onExtraCallback<T> onextracallback) {
            onExtraCallback<T>[] onextracallbackArr;
            onExtraCallback[] onextracallbackArr2;
            do {
                onextracallbackArr = this.subscribers.get();
                if (onextracallbackArr == onExtraCallback) {
                    return false;
                }
                int length = onextracallbackArr.length;
                onextracallbackArr2 = new onExtraCallback[length + 1];
                System.arraycopy(onextracallbackArr, 0, onextracallbackArr2, 0, length);
                onextracallbackArr2[length] = onextracallback;
            } while (!setSupportImageTintList.onNavigationEvent(this.subscribers, onextracallbackArr, onextracallbackArr2));
            return true;
        }

        void onWarmupCompleted(onExtraCallback<T> onextracallback) {
            onExtraCallback<T>[] onextracallbackArr;
            onExtraCallback[] onextracallbackArr2;
            do {
                onextracallbackArr = this.subscribers.get();
                int length = onextracallbackArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (onextracallbackArr[i] == onextracallback) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    onextracallbackArr2 = onNavigationEvent;
                } else {
                    onExtraCallback[] onextracallbackArr3 = new onExtraCallback[length - 1];
                    System.arraycopy(onextracallbackArr, 0, onextracallbackArr3, 0, i);
                    System.arraycopy(onextracallbackArr, i + 1, onextracallbackArr3, i, (length - i) - 1);
                    onextracallbackArr2 = onextracallbackArr3;
                }
            } while (!setSupportImageTintList.onNavigationEvent(this.subscribers, onextracallbackArr, onextracallbackArr2));
        }
    }

    static final class onExtraCallback<T> extends AtomicLong implements ycxExternalSyntheticLambda1 {
        private static final long serialVersionUID = 2845000326761540265L;
        final ycxExternalSyntheticLambda0<? super T> downstream;
        long emitted;
        final onNavigationEvent<T> parent;

        onExtraCallback(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, onNavigationEvent<T> onnavigationevent) {
            this.downstream = ycxexternalsyntheticlambda0;
            this.parent = onnavigationevent;
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            TombstoneProtosLogBufferBuilder.onNavigationEvent(this, j);
            this.parent.onNavigationEvent();
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.onWarmupCompleted((onExtraCallback) this);
                this.parent.onNavigationEvent();
            }
        }

        public boolean onWarmupCompleted() {
            return get() == Long.MIN_VALUE;
        }
    }
}
