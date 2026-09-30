package o;

import io.reactivex.plugins.RxJavaPlugins;
import o.MapConverter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access24400<T> extends setPc<T, T> {
    final boolean IAuthTabCallback;
    final int onExtraCallback;
    final MapConverter onNavigationEvent;

    public access24400(serializeRaw<T> serializeraw, MapConverter mapConverter, boolean z, int i) {
        super(serializeraw);
        this.onNavigationEvent = mapConverter;
        this.IAuthTabCallback = z;
        this.onExtraCallback = i;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        MapConverter mapConverter = this.onNavigationEvent;
        if (mapConverter instanceof access25300) {
            this.onWarmupCompleted.subscribe(writequoted);
        } else {
            this.onWarmupCompleted.subscribe(new IAuthTabCallback(writequoted, mapConverter.onExtraCallbackWithResult(), this.IAuthTabCallback, this.onExtraCallback));
        }
    }

    static final class IAuthTabCallback<T> extends read2<T> implements writeQuoted<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        final int bufferSize;
        final boolean delayError;
        volatile boolean disposed;
        volatile boolean done;
        final writeQuoted<? super T> downstream;
        Throwable error;
        boolean outputFused;
        parsePositiveDecimal<T> queue;
        int sourceMode;
        deserializeUriNullableCollection upstream;
        final MapConverter.onNavigationEvent worker;

        IAuthTabCallback(writeQuoted<? super T> writequoted, MapConverter.onNavigationEvent onnavigationevent, boolean z, int i) {
            this.downstream = writequoted;
            this.worker = onnavigationevent;
            this.delayError = z;
            this.bufferSize = i;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.upstream, deserializeurinullablecollection)) {
                this.upstream = deserializeurinullablecollection;
                if (deserializeurinullablecollection instanceof parseDoubleGeneric) {
                    parseDoubleGeneric parsedoublegeneric = (parseDoubleGeneric) deserializeurinullablecollection;
                    int iRequestFusion = parsedoublegeneric.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = parsedoublegeneric;
                        this.done = true;
                        this.downstream.IAuthTabCallback(this);
                        onExtraCallbackWithResult();
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
            if (this.done) {
                return;
            }
            if (this.sourceMode != 2) {
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
            this.error = th;
            this.done = true;
            onExtraCallbackWithResult();
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            if (this.done) {
                return;
            }
            this.done = true;
            onExtraCallbackWithResult();
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            this.upstream.dispose();
            this.worker.dispose();
            if (this.outputFused || getAndIncrement() != 0) {
                return;
            }
            this.queue.clear();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.disposed;
        }

        void onExtraCallbackWithResult() {
            if (getAndIncrement() == 0) {
                this.worker.IAuthTabCallback(this);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            r3 = addAndGet(-r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        
            if (r3 != 0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void onWarmupCompleted() {
            parsePositiveDecimal<T> parsepositivedecimal = this.queue;
            writeQuoted<? super T> writequoted = this.downstream;
            int iAddAndGet = 1;
            while (!IAuthTabCallback(this.done, parsepositivedecimal.isEmpty(), writequoted)) {
                while (true) {
                    boolean z = this.done;
                    try {
                        T tPoll = parsepositivedecimal.poll();
                        boolean z2 = tPoll == null;
                        if (IAuthTabCallback(z, z2, writequoted)) {
                            return;
                        }
                        if (z2) {
                            break;
                        } else {
                            writequoted.onExtraCallback(tPoll);
                        }
                    } catch (Throwable th) {
                        NumberConverter.onWarmupCompleted(th);
                        this.disposed = true;
                        this.upstream.dispose();
                        parsepositivedecimal.clear();
                        writequoted.onExtraCallbackWithResult(th);
                        this.worker.dispose();
                        return;
                    }
                }
            }
        }

        void IAuthTabCallback() {
            int iAddAndGet = 1;
            while (!this.disposed) {
                boolean z = this.done;
                Throwable th = this.error;
                if (!this.delayError && z && th != null) {
                    this.disposed = true;
                    this.downstream.onExtraCallbackWithResult(this.error);
                    this.worker.dispose();
                    return;
                }
                this.downstream.onExtraCallback(null);
                if (z) {
                    this.disposed = true;
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        this.downstream.onExtraCallbackWithResult(th2);
                    } else {
                        this.downstream.onExtraCallback();
                    }
                    this.worker.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.outputFused) {
                IAuthTabCallback();
            } else {
                onWarmupCompleted();
            }
        }

        boolean IAuthTabCallback(boolean z, boolean z2, writeQuoted<? super T> writequoted) {
            if (this.disposed) {
                this.queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.error;
            if (this.delayError) {
                if (!z2) {
                    return false;
                }
                this.disposed = true;
                if (th != null) {
                    writequoted.onExtraCallbackWithResult(th);
                } else {
                    writequoted.onExtraCallback();
                }
                this.worker.dispose();
                return true;
            }
            if (th != null) {
                this.disposed = true;
                this.queue.clear();
                writequoted.onExtraCallbackWithResult(th);
                this.worker.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.disposed = true;
            writequoted.onExtraCallback();
            this.worker.dispose();
            return true;
        }

        @Override // o.parseFloatGeneric
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // o.parsePositiveDecimal
        public T poll() throws Exception {
            return this.queue.poll();
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
}
