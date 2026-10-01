package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getHumanReadable<T, U> extends setPc<T, U> {
    final deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends U>> IAuthTabCallback;
    final boolean onExtraCallback;
    final int onExtraCallbackWithResult;
    final int onNavigationEvent;

    public getHumanReadable(serializeRaw<T> serializeraw, deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends U>> deserializeintnullablecollection, boolean z, int i, int i2) {
        super(serializeraw);
        this.IAuthTabCallback = deserializeintnullablecollection;
        this.onExtraCallback = z;
        this.onExtraCallbackWithResult = i;
        this.onNavigationEvent = i2;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super U> writequoted) {
        if (getOwner.onExtraCallback(this.onWarmupCompleted, writequoted, this.IAuthTabCallback)) {
            return;
        }
        this.onWarmupCompleted.subscribe(new onExtraCallback(writequoted, this.IAuthTabCallback, this.onExtraCallback, this.onExtraCallbackWithResult, this.onNavigationEvent));
    }

    static final class onExtraCallback<T, U> extends AtomicInteger implements deserializeUriNullableCollection, writeQuoted<T> {
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final writeQuoted<? super U> downstream;
        final getLogsOrBuilder errors = new getLogsOrBuilder();
        long lastId;
        int lastIndex;
        final deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends U>> mapper;
        final int maxConcurrency;
        final AtomicReference<onNavigationEvent<?, ?>[]> observers;
        volatile parseNegativeInt<U> queue;
        Queue<serializeRaw<? extends U>> sources;
        long uniqueId;
        deserializeUriNullableCollection upstream;
        int wip;
        static final onNavigationEvent<?, ?>[] onExtraCallback = new onNavigationEvent[0];
        static final onNavigationEvent<?, ?>[] IAuthTabCallback = new onNavigationEvent[0];

        onExtraCallback(writeQuoted<? super U> writequoted, deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends U>> deserializeintnullablecollection, boolean z, int i, int i2) {
            this.downstream = writequoted;
            this.mapper = deserializeintnullablecollection;
            this.delayErrors = z;
            this.maxConcurrency = i;
            this.bufferSize = i2;
            if (i != Integer.MAX_VALUE) {
                this.sources = new ArrayDeque(i);
            }
            this.observers = new AtomicReference<>(onExtraCallback);
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.upstream, deserializeurinullablecollection)) {
                this.upstream = deserializeurinullablecollection;
                this.downstream.IAuthTabCallback(this);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            if (this.done) {
                return;
            }
            try {
                serializeRaw<? extends U> serializeraw = (serializeRaw) floatExponent.onExtraCallbackWithResult(this.mapper.apply(t), "The mapper returned a null ObservableSource");
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i = this.wip;
                        if (i == this.maxConcurrency) {
                            this.sources.offer(serializeraw);
                            return;
                        }
                        this.wip = i + 1;
                    }
                }
                onExtraCallbackWithResult(serializeraw);
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.upstream.dispose();
                onExtraCallbackWithResult(th);
            }
        }

        void onExtraCallbackWithResult(serializeRaw<? extends U> serializeraw) {
            boolean z;
            while (serializeraw instanceof Callable) {
                if (!onWarmupCompleted((Callable) serializeraw) || this.maxConcurrency == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    serializeraw = this.sources.poll();
                    if (serializeraw == null) {
                        z = true;
                        this.wip--;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    onWarmupCompleted();
                    return;
                }
            }
            long j = this.uniqueId;
            this.uniqueId = 1 + j;
            onNavigationEvent<T, U> onnavigationevent = new onNavigationEvent<>(this, j);
            if (onWarmupCompleted(onnavigationevent)) {
                serializeraw.subscribe(onnavigationevent);
            }
        }

        boolean onWarmupCompleted(onNavigationEvent<T, U> onnavigationevent) {
            onNavigationEvent<?, ?>[] onnavigationeventArr;
            onNavigationEvent[] onnavigationeventArr2;
            do {
                onnavigationeventArr = this.observers.get();
                if (onnavigationeventArr == IAuthTabCallback) {
                    onnavigationevent.onExtraCallbackWithResult();
                    return false;
                }
                int length = onnavigationeventArr.length;
                onnavigationeventArr2 = new onNavigationEvent[length + 1];
                System.arraycopy(onnavigationeventArr, 0, onnavigationeventArr2, 0, length);
                onnavigationeventArr2[length] = onnavigationevent;
            } while (!setSupportImageTintList.onNavigationEvent(this.observers, onnavigationeventArr, onnavigationeventArr2));
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        void onExtraCallbackWithResult(onNavigationEvent<T, U> onnavigationevent) {
            onNavigationEvent<?, ?>[] onnavigationeventArr;
            onNavigationEvent<?, ?>[] onnavigationeventArr2;
            do {
                onnavigationeventArr = this.observers.get();
                int length = onnavigationeventArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (onnavigationeventArr[i] == onnavigationevent) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    onnavigationeventArr2 = onExtraCallback;
                } else {
                    onNavigationEvent<?, ?>[] onnavigationeventArr3 = new onNavigationEvent[length - 1];
                    System.arraycopy(onnavigationeventArr, 0, onnavigationeventArr3, 0, i);
                    System.arraycopy(onnavigationeventArr, i + 1, onnavigationeventArr3, i, (length - i) - 1);
                    onnavigationeventArr2 = onnavigationeventArr3;
                }
            } while (!setSupportImageTintList.onNavigationEvent(this.observers, onnavigationeventArr, onnavigationeventArr2));
        }

        boolean onWarmupCompleted(Callable<? extends U> callable) {
            try {
                U uCall = callable.call();
                if (uCall == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.downstream.onExtraCallback(uCall);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    parseNegativeInt<U> getallocationbacktracecount = this.queue;
                    if (getallocationbacktracecount == null) {
                        if (this.maxConcurrency == Integer.MAX_VALUE) {
                            getallocationbacktracecount = new getAllocationBacktraceOrBuilder<>(this.bufferSize);
                        } else {
                            getallocationbacktracecount = new getAllocationBacktraceCount<>(this.maxConcurrency);
                        }
                        this.queue = getallocationbacktracecount;
                    }
                    if (!getallocationbacktracecount.offer(uCall)) {
                        onExtraCallbackWithResult(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    }
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                IAuthTabCallback();
                return true;
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.errors.IAuthTabCallback(th);
                onWarmupCompleted();
                return true;
            }
        }

        void onExtraCallbackWithResult(U u, onNavigationEvent<T, U> onnavigationevent) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.downstream.onExtraCallback(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                parsePositiveDecimal getallocationbacktraceorbuilder = onnavigationevent.queue;
                if (getallocationbacktraceorbuilder == null) {
                    getallocationbacktraceorbuilder = new getAllocationBacktraceOrBuilder(this.bufferSize);
                    onnavigationevent.queue = getallocationbacktraceorbuilder;
                }
                getallocationbacktraceorbuilder.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            IAuthTabCallback();
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            } else if (this.errors.IAuthTabCallback(th)) {
                this.done = true;
                onWarmupCompleted();
            } else {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            if (this.done) {
                return;
            }
            this.done = true;
            onWarmupCompleted();
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            Throwable thOnExtraCallback;
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            if (!onNavigationEvent() || (thOnExtraCallback = this.errors.onExtraCallback()) == null || thOnExtraCallback == access26100.IAuthTabCallback) {
                return;
            }
            RxJavaPlugins.onExtraCallbackWithResult(thOnExtraCallback);
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.cancelled;
        }

        void onWarmupCompleted() {
            if (getAndIncrement() == 0) {
                IAuthTabCallback();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0112 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:121:0x00f5 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00f4 A[PHI: r4
          0x00f4: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:71:0x00d4, B:82:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void IAuthTabCallback() {
            int size;
            U uPoll;
            boolean z;
            writeQuoted<? super U> writequoted = this.downstream;
            int iAddAndGet = 1;
            while (!onExtraCallbackWithResult()) {
                parseNegativeInt<U> parsenegativeint = this.queue;
                int i = 0;
                if (parsenegativeint != null) {
                    while (!onExtraCallbackWithResult()) {
                        U uPoll2 = parsenegativeint.poll();
                        if (uPoll2 != null) {
                            writequoted.onExtraCallback(uPoll2);
                            i++;
                        }
                    }
                    return;
                }
                if (i != 0) {
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        onNavigationEvent(i);
                    }
                } else {
                    boolean z2 = this.done;
                    parseNegativeInt<U> parsenegativeint2 = this.queue;
                    onNavigationEvent<?, ?>[] onnavigationeventArr = this.observers.get();
                    int length = onnavigationeventArr.length;
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        synchronized (this) {
                            size = this.sources.size();
                        }
                    } else {
                        size = 0;
                    }
                    if (z2 && ((parsenegativeint2 == null || parsenegativeint2.isEmpty()) && length == 0 && size == 0)) {
                        Throwable thOnExtraCallback = this.errors.onExtraCallback();
                        if (thOnExtraCallback != access26100.IAuthTabCallback) {
                            if (thOnExtraCallback == null) {
                                writequoted.onExtraCallback();
                                return;
                            } else {
                                writequoted.onExtraCallbackWithResult(thOnExtraCallback);
                                return;
                            }
                        }
                        return;
                    }
                    if (length != 0) {
                        long j = this.lastId;
                        int i2 = this.lastIndex;
                        if (length <= i2 || onnavigationeventArr[i2].id != j) {
                            if (length <= i2) {
                                i2 = 0;
                            }
                            for (int i3 = 0; i3 < length && onnavigationeventArr[i2].id != j; i3++) {
                                i2++;
                                if (i2 == length) {
                                    i2 = 0;
                                }
                            }
                            this.lastIndex = i2;
                            this.lastId = onnavigationeventArr[i2].id;
                        }
                        for (int i4 = 0; i4 < length; i4++) {
                            if (onExtraCallbackWithResult()) {
                                return;
                            }
                            onNavigationEvent<T, U> onnavigationevent = onnavigationeventArr[i2];
                            parsePositiveDecimal<U> parsepositivedecimal = onnavigationevent.queue;
                            if (parsepositivedecimal != null) {
                                do {
                                    try {
                                        uPoll = parsepositivedecimal.poll();
                                    } catch (Throwable th) {
                                        NumberConverter.onWarmupCompleted(th);
                                        onnavigationevent.onExtraCallbackWithResult();
                                        this.errors.IAuthTabCallback(th);
                                        if (onExtraCallbackWithResult()) {
                                            return;
                                        }
                                        onExtraCallbackWithResult(onnavigationevent);
                                        i++;
                                        i2++;
                                        if (i2 == length) {
                                        }
                                    }
                                    if (uPoll != null) {
                                        writequoted.onExtraCallback(uPoll);
                                    } else {
                                        z = onnavigationevent.done;
                                        parsePositiveDecimal<U> parsepositivedecimal2 = onnavigationevent.queue;
                                        if (z && (parsepositivedecimal2 == null || parsepositivedecimal2.isEmpty())) {
                                            onExtraCallbackWithResult(onnavigationevent);
                                            if (!onExtraCallbackWithResult()) {
                                                return;
                                            } else {
                                                i++;
                                            }
                                        }
                                        i2++;
                                        if (i2 != length) {
                                            i2 = 0;
                                        }
                                    }
                                } while (!onExtraCallbackWithResult());
                                return;
                            }
                            z = onnavigationevent.done;
                            parsePositiveDecimal<U> parsepositivedecimal22 = onnavigationevent.queue;
                            if (z) {
                                onExtraCallbackWithResult(onnavigationevent);
                                if (!onExtraCallbackWithResult()) {
                                }
                            }
                            i2++;
                            if (i2 != length) {
                            }
                        }
                        this.lastIndex = i2;
                        this.lastId = onnavigationeventArr[i2].id;
                    }
                    if (i != 0) {
                        if (this.maxConcurrency != Integer.MAX_VALUE) {
                            onNavigationEvent(i);
                        }
                    } else {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
            }
        }

        void onNavigationEvent(int i) {
            while (i != 0) {
                synchronized (this) {
                    serializeRaw<? extends U> serializerawPoll = this.sources.poll();
                    if (serializerawPoll == null) {
                        this.wip--;
                    } else {
                        onExtraCallbackWithResult(serializerawPoll);
                    }
                }
                i--;
            }
        }

        boolean onExtraCallbackWithResult() {
            if (this.cancelled) {
                return true;
            }
            Throwable th = this.errors.get();
            if (this.delayErrors || th == null) {
                return false;
            }
            onNavigationEvent();
            Throwable thOnExtraCallback = this.errors.onExtraCallback();
            if (thOnExtraCallback != access26100.IAuthTabCallback) {
                this.downstream.onExtraCallbackWithResult(thOnExtraCallback);
            }
            return true;
        }

        boolean onNavigationEvent() {
            onNavigationEvent<?, ?>[] andSet;
            this.upstream.dispose();
            onNavigationEvent<?, ?>[] onnavigationeventArr = this.observers.get();
            onNavigationEvent<?, ?>[] onnavigationeventArr2 = IAuthTabCallback;
            if (onnavigationeventArr == onnavigationeventArr2 || (andSet = this.observers.getAndSet(onnavigationeventArr2)) == onnavigationeventArr2) {
                return false;
            }
            for (onNavigationEvent<?, ?> onnavigationevent : andSet) {
                onnavigationevent.onExtraCallbackWithResult();
            }
            return true;
        }
    }

    static final class onNavigationEvent<T, U> extends AtomicReference<deserializeUriNullableCollection> implements writeQuoted<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        volatile boolean done;
        int fusionMode;
        final long id;
        final onExtraCallback<T, U> parent;
        volatile parsePositiveDecimal<U> queue;

        onNavigationEvent(onExtraCallback<T, U> onextracallback, long j) {
            this.id = j;
            this.parent = onextracallback;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.setOnce(this, deserializeurinullablecollection) && (deserializeurinullablecollection instanceof parseDoubleGeneric)) {
                parseDoubleGeneric parsedoublegeneric = (parseDoubleGeneric) deserializeurinullablecollection;
                int iRequestFusion = parsedoublegeneric.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = parsedoublegeneric;
                    this.done = true;
                    this.parent.onWarmupCompleted();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = parsedoublegeneric;
                }
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback(U u) {
            if (this.fusionMode == 0) {
                this.parent.onExtraCallbackWithResult(u, this);
            } else {
                this.parent.onWarmupCompleted();
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.parent.errors.IAuthTabCallback(th)) {
                onExtraCallback<T, U> onextracallback = this.parent;
                if (!onextracallback.delayErrors) {
                    onextracallback.onNavigationEvent();
                }
                this.done = true;
                this.parent.onWarmupCompleted();
                return;
            }
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            this.done = true;
            this.parent.onWarmupCompleted();
        }

        public void onExtraCallbackWithResult() {
            deserializeNumber.dispose(this);
        }
    }
}
