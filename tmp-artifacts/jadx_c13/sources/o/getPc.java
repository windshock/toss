package o;

import android.R;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getPc<T, U> extends setPc<T, U> {
    final getLogsCount IAuthTabCallback;
    final int onExtraCallbackWithResult;
    final deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends U>> onNavigationEvent;

    public getPc(serializeRaw<T> serializeraw, deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends U>> deserializeintnullablecollection, int i, getLogsCount getlogscount) {
        super(serializeraw);
        this.onNavigationEvent = deserializeintnullablecollection;
        this.IAuthTabCallback = getlogscount;
        this.onExtraCallbackWithResult = Math.max(8, i);
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super U> writequoted) {
        if (getOwner.onExtraCallback(this.onWarmupCompleted, writequoted, this.onNavigationEvent)) {
            return;
        }
        if (this.IAuthTabCallback == getLogsCount.IMMEDIATE) {
            this.onWarmupCompleted.subscribe(new onExtraCallback(new access26900(writequoted), this.onNavigationEvent, this.onExtraCallbackWithResult));
        } else {
            this.onWarmupCompleted.subscribe(new onExtraCallbackWithResult(writequoted, this.onNavigationEvent, this.onExtraCallbackWithResult, this.IAuthTabCallback == getLogsCount.END));
        }
    }

    static final class onExtraCallback<T, U> extends AtomicInteger implements writeQuoted<T>, deserializeUriNullableCollection {
        private static final long serialVersionUID = 8828587559905699186L;
        volatile boolean active;
        final int bufferSize;
        volatile boolean disposed;
        volatile boolean done;
        final writeQuoted<? super U> downstream;
        int fusionMode;
        final onNavigationEvent<U> inner;
        final deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends U>> mapper;
        parsePositiveDecimal<T> queue;
        deserializeUriNullableCollection upstream;

        onExtraCallback(writeQuoted<? super U> writequoted, deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends U>> deserializeintnullablecollection, int i) {
            this.downstream = writequoted;
            this.mapper = deserializeintnullablecollection;
            this.bufferSize = i;
            this.inner = new onNavigationEvent<>(writequoted, this);
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.upstream, deserializeurinullablecollection)) {
                this.upstream = deserializeurinullablecollection;
                if (deserializeurinullablecollection instanceof parseDoubleGeneric) {
                    parseDoubleGeneric parsedoublegeneric = (parseDoubleGeneric) deserializeurinullablecollection;
                    int iRequestFusion = parsedoublegeneric.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.fusionMode = iRequestFusion;
                        this.queue = parsedoublegeneric;
                        this.done = true;
                        this.downstream.IAuthTabCallback(this);
                        onExtraCallbackWithResult();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.fusionMode = iRequestFusion;
                        this.queue = parsedoublegeneric;
                        this.downstream.IAuthTabCallback(this);
                        return;
                    }
                }
                this.queue = new getAllocationBacktraceOrBuilder(this.bufferSize);
                this.downstream.IAuthTabCallback(this);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            if (this.done) {
                return;
            }
            if (this.fusionMode == 0) {
                this.queue.offer(t);
            }
            onExtraCallbackWithResult();
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
                return;
            }
            this.done = true;
            dispose();
            this.downstream.onExtraCallbackWithResult(th);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            if (this.done) {
                return;
            }
            this.done = true;
            onExtraCallbackWithResult();
        }

        void onWarmupCompleted() {
            this.active = false;
            onExtraCallbackWithResult();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.disposed = true;
            this.inner.IAuthTabCallback();
            this.upstream.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        void onExtraCallbackWithResult() {
            if (getAndIncrement() == 0) {
                while (!this.disposed) {
                    if (!this.active) {
                        boolean z = this.done;
                        try {
                            T tPoll = this.queue.poll();
                            boolean z2 = tPoll == null;
                            if (z && z2) {
                                this.disposed = true;
                                this.downstream.onExtraCallback();
                                return;
                            } else if (!z2) {
                                try {
                                    serializeRaw serializeraw = (serializeRaw) floatExponent.onExtraCallbackWithResult(this.mapper.apply(tPoll), "The mapper returned a null ObservableSource");
                                    this.active = true;
                                    serializeraw.subscribe(this.inner);
                                } catch (Throwable th) {
                                    NumberConverter.onWarmupCompleted(th);
                                    dispose();
                                    this.queue.clear();
                                    this.downstream.onExtraCallbackWithResult(th);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            NumberConverter.onWarmupCompleted(th2);
                            dispose();
                            this.queue.clear();
                            this.downstream.onExtraCallbackWithResult(th2);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.queue.clear();
            }
        }

        static final class onNavigationEvent<U> extends AtomicReference<deserializeUriNullableCollection> implements writeQuoted<U> {
            private static final long serialVersionUID = -7449079488798789337L;
            final writeQuoted<? super U> downstream;
            final onExtraCallback<?, ?> parent;

            onNavigationEvent(writeQuoted<? super U> writequoted, onExtraCallback<?, ?> onextracallback) {
                this.downstream = writequoted;
                this.parent = onextracallback;
            }

            @Override // o.writeQuoted
            public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
                deserializeNumber.replace(this, deserializeurinullablecollection);
            }

            @Override // o.writeQuoted
            public void onExtraCallback(U u) {
                this.downstream.onExtraCallback(u);
            }

            @Override // o.writeQuoted
            public void onExtraCallbackWithResult(Throwable th) {
                this.parent.dispose();
                this.downstream.onExtraCallbackWithResult(th);
            }

            @Override // o.writeQuoted
            public void onExtraCallback() {
                this.parent.onWarmupCompleted();
            }

            void IAuthTabCallback() {
                deserializeNumber.dispose(this);
            }
        }
    }

    static final class onExtraCallbackWithResult<T, R> extends AtomicInteger implements writeQuoted<T>, deserializeUriNullableCollection {
        private static final long serialVersionUID = -6951100001833242599L;
        volatile boolean active;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final writeQuoted<? super R> downstream;
        final getLogsOrBuilder error = new getLogsOrBuilder();
        final deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends R>> mapper;
        final onWarmupCompleted<R> observer;
        parsePositiveDecimal<T> queue;
        int sourceMode;
        final boolean tillTheEnd;
        deserializeUriNullableCollection upstream;

        onExtraCallbackWithResult(writeQuoted<? super R> writequoted, deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends R>> deserializeintnullablecollection, int i, boolean z) {
            this.downstream = writequoted;
            this.mapper = deserializeintnullablecollection;
            this.bufferSize = i;
            this.tillTheEnd = z;
            this.observer = new onWarmupCompleted<>(writequoted, this);
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.upstream, deserializeurinullablecollection)) {
                this.upstream = deserializeurinullablecollection;
                if (deserializeurinullablecollection instanceof parseDoubleGeneric) {
                    parseDoubleGeneric parsedoublegeneric = (parseDoubleGeneric) deserializeurinullablecollection;
                    int iRequestFusion = parsedoublegeneric.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = parsedoublegeneric;
                        this.done = true;
                        this.downstream.IAuthTabCallback(this);
                        onNavigationEvent();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = parsedoublegeneric;
                        this.downstream.IAuthTabCallback(this);
                        return;
                    }
                }
                this.queue = new getAllocationBacktraceOrBuilder(this.bufferSize);
                this.downstream.IAuthTabCallback(this);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            if (this.sourceMode == 0) {
                this.queue.offer(t);
            }
            onNavigationEvent();
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.error.IAuthTabCallback(th)) {
                this.done = true;
                onNavigationEvent();
            } else {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            this.done = true;
            onNavigationEvent();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.observer.onNavigationEvent();
        }

        void onNavigationEvent() {
            if (getAndIncrement() != 0) {
                return;
            }
            writeQuoted<? super R> writequoted = this.downstream;
            parsePositiveDecimal<T> parsepositivedecimal = this.queue;
            getLogsOrBuilder getlogsorbuilder = this.error;
            while (true) {
                if (!this.active) {
                    if (this.cancelled) {
                        parsepositivedecimal.clear();
                        return;
                    }
                    if (!this.tillTheEnd && getlogsorbuilder.get() != null) {
                        parsepositivedecimal.clear();
                        this.cancelled = true;
                        writequoted.onExtraCallbackWithResult(getlogsorbuilder.onExtraCallback());
                        return;
                    }
                    boolean z = this.done;
                    try {
                        T tPoll = parsepositivedecimal.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            this.cancelled = true;
                            Throwable thOnExtraCallback = getlogsorbuilder.onExtraCallback();
                            if (thOnExtraCallback != null) {
                                writequoted.onExtraCallbackWithResult(thOnExtraCallback);
                                return;
                            } else {
                                writequoted.onExtraCallback();
                                return;
                            }
                        }
                        if (!z2) {
                            try {
                                serializeRaw serializeraw = (serializeRaw) floatExponent.onExtraCallbackWithResult(this.mapper.apply(tPoll), "The mapper returned a null ObservableSource");
                                if (serializeraw instanceof Callable) {
                                    try {
                                        R.bool boolVar = (Object) ((Callable) serializeraw).call();
                                        if (boolVar != null && !this.cancelled) {
                                            writequoted.onExtraCallback(boolVar);
                                        }
                                    } catch (Throwable th) {
                                        NumberConverter.onWarmupCompleted(th);
                                        getlogsorbuilder.IAuthTabCallback(th);
                                    }
                                } else {
                                    this.active = true;
                                    serializeraw.subscribe(this.observer);
                                }
                            } catch (Throwable th2) {
                                NumberConverter.onWarmupCompleted(th2);
                                this.cancelled = true;
                                this.upstream.dispose();
                                parsepositivedecimal.clear();
                                getlogsorbuilder.IAuthTabCallback(th2);
                                writequoted.onExtraCallbackWithResult(getlogsorbuilder.onExtraCallback());
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        NumberConverter.onWarmupCompleted(th3);
                        this.cancelled = true;
                        this.upstream.dispose();
                        getlogsorbuilder.IAuthTabCallback(th3);
                        writequoted.onExtraCallbackWithResult(getlogsorbuilder.onExtraCallback());
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        static final class onWarmupCompleted<R> extends AtomicReference<deserializeUriNullableCollection> implements writeQuoted<R> {
            private static final long serialVersionUID = 2620149119579502636L;
            final writeQuoted<? super R> downstream;
            final onExtraCallbackWithResult<?, R> parent;

            onWarmupCompleted(writeQuoted<? super R> writequoted, onExtraCallbackWithResult<?, R> onextracallbackwithresult) {
                this.downstream = writequoted;
                this.parent = onextracallbackwithresult;
            }

            @Override // o.writeQuoted
            public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
                deserializeNumber.replace(this, deserializeurinullablecollection);
            }

            @Override // o.writeQuoted
            public void onExtraCallback(R r) {
                this.downstream.onExtraCallback(r);
            }

            @Override // o.writeQuoted
            public void onExtraCallbackWithResult(Throwable th) {
                onExtraCallbackWithResult<?, R> onextracallbackwithresult = this.parent;
                if (onextracallbackwithresult.error.IAuthTabCallback(th)) {
                    if (!onextracallbackwithresult.tillTheEnd) {
                        onextracallbackwithresult.upstream.dispose();
                    }
                    onextracallbackwithresult.active = false;
                    onextracallbackwithresult.onNavigationEvent();
                    return;
                }
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }

            @Override // o.writeQuoted
            public void onExtraCallback() {
                onExtraCallbackWithResult<?, R> onextracallbackwithresult = this.parent;
                onextracallbackwithresult.active = false;
                onextracallbackwithresult.onNavigationEvent();
            }

            void onNavigationEvent() {
                deserializeNumber.dispose(this);
            }
        }
    }
}
