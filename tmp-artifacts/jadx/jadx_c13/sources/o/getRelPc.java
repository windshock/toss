package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getRelPc<T, R> extends getByteBuffer<R> {
    final deserializeIntNullableCollection<? super Object[], ? extends R> IAuthTabCallback;
    final Iterable<? extends serializeRaw<? extends T>> onExtraCallback;
    final serializeRaw<? extends T>[] onExtraCallbackWithResult;
    final int onNavigationEvent;
    final boolean onWarmupCompleted;

    public getRelPc(serializeRaw<? extends T>[] serializerawArr, Iterable<? extends serializeRaw<? extends T>> iterable, deserializeIntNullableCollection<? super Object[], ? extends R> deserializeintnullablecollection, int i, boolean z) {
        this.onExtraCallbackWithResult = serializerawArr;
        this.onExtraCallback = iterable;
        this.IAuthTabCallback = deserializeintnullablecollection;
        this.onNavigationEvent = i;
        this.onWarmupCompleted = z;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super R> writequoted) {
        int length;
        serializeRaw<? extends T>[] serializerawArr = this.onExtraCallbackWithResult;
        if (serializerawArr == null) {
            serializerawArr = new serializeRaw[8];
            length = 0;
            for (serializeRaw<? extends T> serializeraw : this.onExtraCallback) {
                if (length == serializerawArr.length) {
                    serializeRaw<? extends T>[] serializerawArr2 = new serializeRaw[(length >> 2) + length];
                    System.arraycopy(serializerawArr, 0, serializerawArr2, 0, length);
                    serializerawArr = serializerawArr2;
                }
                serializerawArr[length] = serializeraw;
                length++;
            }
        } else {
            length = serializerawArr.length;
        }
        int i = length;
        if (i == 0) {
            deserializeShort.complete(writequoted);
        } else {
            new onNavigationEvent(writequoted, this.IAuthTabCallback, i, this.onNavigationEvent, this.onWarmupCompleted).onExtraCallbackWithResult(serializerawArr);
        }
    }

    static final class onNavigationEvent<T, R> extends AtomicInteger implements deserializeUriNullableCollection {
        private static final long serialVersionUID = 8567835998786448817L;
        int active;
        volatile boolean cancelled;
        final deserializeIntNullableCollection<? super Object[], ? extends R> combiner;
        int complete;
        final boolean delayError;
        volatile boolean done;
        final writeQuoted<? super R> downstream;
        final getLogsOrBuilder errors = new getLogsOrBuilder();
        Object[] latest;
        final onExtraCallbackWithResult<T, R>[] observers;
        final getAllocationBacktraceOrBuilder<Object[]> queue;

        onNavigationEvent(writeQuoted<? super R> writequoted, deserializeIntNullableCollection<? super Object[], ? extends R> deserializeintnullablecollection, int i, int i2, boolean z) {
            this.downstream = writequoted;
            this.combiner = deserializeintnullablecollection;
            this.delayError = z;
            this.latest = new Object[i];
            onExtraCallbackWithResult<T, R>[] onextracallbackwithresultArr = new onExtraCallbackWithResult[i];
            for (int i3 = 0; i3 < i; i3++) {
                onextracallbackwithresultArr[i3] = new onExtraCallbackWithResult<>(this, i3);
            }
            this.observers = onextracallbackwithresultArr;
            this.queue = new getAllocationBacktraceOrBuilder<>(i2);
        }

        public void onExtraCallbackWithResult(serializeRaw<? extends T>[] serializerawArr) {
            onExtraCallbackWithResult<T, R>[] onextracallbackwithresultArr = this.observers;
            int length = onextracallbackwithresultArr.length;
            this.downstream.IAuthTabCallback(this);
            for (int i = 0; i < length && !this.done && !this.cancelled; i++) {
                serializerawArr[i].subscribe(onextracallbackwithresultArr[i]);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            onExtraCallbackWithResult();
            if (getAndIncrement() == 0) {
                onExtraCallbackWithResult((getAllocationBacktraceOrBuilder<?>) this.queue);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.cancelled;
        }

        void onExtraCallbackWithResult() {
            for (onExtraCallbackWithResult<T, R> onextracallbackwithresult : this.observers) {
                onextracallbackwithresult.onWarmupCompleted();
            }
        }

        void onExtraCallbackWithResult(getAllocationBacktraceOrBuilder<?> getallocationbacktraceorbuilder) {
            synchronized (this) {
                this.latest = null;
            }
            getallocationbacktraceorbuilder.clear();
        }

        void onWarmupCompleted() {
            if (getAndIncrement() == 0) {
                getAllocationBacktraceOrBuilder<Object[]> getallocationbacktraceorbuilder = this.queue;
                writeQuoted<? super R> writequoted = this.downstream;
                boolean z = this.delayError;
                int iAddAndGet = 1;
                while (!this.cancelled) {
                    if (!z && this.errors.get() != null) {
                        onExtraCallbackWithResult();
                        onExtraCallbackWithResult((getAllocationBacktraceOrBuilder<?>) getallocationbacktraceorbuilder);
                        writequoted.onExtraCallbackWithResult(this.errors.onExtraCallback());
                        return;
                    }
                    boolean z2 = this.done;
                    Object[] objArrPoll = getallocationbacktraceorbuilder.poll();
                    boolean z3 = objArrPoll == null;
                    if (z2 && z3) {
                        onExtraCallbackWithResult((getAllocationBacktraceOrBuilder<?>) getallocationbacktraceorbuilder);
                        Throwable thOnExtraCallback = this.errors.onExtraCallback();
                        if (thOnExtraCallback == null) {
                            writequoted.onExtraCallback();
                            return;
                        } else {
                            writequoted.onExtraCallbackWithResult(thOnExtraCallback);
                            return;
                        }
                    }
                    if (!z3) {
                        try {
                            writequoted.onExtraCallback((Object) floatExponent.onExtraCallbackWithResult(this.combiner.apply(objArrPoll), "The combiner returned a null value"));
                        } catch (Throwable th) {
                            NumberConverter.onWarmupCompleted(th);
                            this.errors.IAuthTabCallback(th);
                            onExtraCallbackWithResult();
                            onExtraCallbackWithResult((getAllocationBacktraceOrBuilder<?>) getallocationbacktraceorbuilder);
                            writequoted.onExtraCallbackWithResult(this.errors.onExtraCallback());
                            return;
                        }
                    } else {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
                onExtraCallbackWithResult((getAllocationBacktraceOrBuilder<?>) getallocationbacktraceorbuilder);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void onWarmupCompleted(int i, T t) {
            boolean z;
            synchronized (this) {
                Object[] objArr = this.latest;
                if (objArr == null) {
                    return;
                }
                Object obj = objArr[i];
                int i2 = this.active;
                if (obj == null) {
                    i2++;
                    this.active = i2;
                }
                objArr[i] = t;
                if (i2 == objArr.length) {
                    this.queue.offer(objArr.clone());
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    onWarmupCompleted();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0025 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:11:0x0013, B:16:0x001d, B:18:0x0025), top: B:30:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void onExtraCallback(int i, Throwable th) {
            if (this.errors.IAuthTabCallback(th)) {
                if (this.delayError) {
                    synchronized (this) {
                        Object[] objArr = this.latest;
                        if (objArr == null) {
                            return;
                        }
                        boolean z = objArr[i] == null;
                        if (!z) {
                            int i2 = this.complete + 1;
                            this.complete = i2;
                            if (i2 == objArr.length) {
                                this.done = true;
                            }
                            if (z) {
                                onExtraCallbackWithResult();
                            }
                        }
                    }
                }
                onWarmupCompleted();
                return;
            }
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void onNavigationEvent(int i) {
            synchronized (this) {
                Object[] objArr = this.latest;
                if (objArr == null) {
                    return;
                }
                boolean z = objArr[i] == null;
                if (!z) {
                    int i2 = this.complete + 1;
                    this.complete = i2;
                    if (i2 == objArr.length) {
                    }
                    if (z) {
                        onExtraCallbackWithResult();
                    }
                    onWarmupCompleted();
                }
                this.done = true;
                if (z) {
                }
                onWarmupCompleted();
            }
        }
    }

    static final class onExtraCallbackWithResult<T, R> extends AtomicReference<deserializeUriNullableCollection> implements writeQuoted<T> {
        private static final long serialVersionUID = -4823716997131257941L;
        final int index;
        final onNavigationEvent<T, R> parent;

        onExtraCallbackWithResult(onNavigationEvent<T, R> onnavigationevent, int i) {
            this.parent = onnavigationevent;
            this.index = i;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.setOnce(this, deserializeurinullablecollection);
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            this.parent.onWarmupCompleted(this.index, t);
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            this.parent.onExtraCallback(this.index, th);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            this.parent.onNavigationEvent(this.index);
        }

        public void onWarmupCompleted() {
            deserializeNumber.dispose(this);
        }
    }
}
