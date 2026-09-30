package o;

import android.R;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getMemoryError<T, R> extends setPc<T, R> {
    final boolean onExtraCallback;
    final deserializeIntNullableCollection<? super T, ? extends deserializeIp<? extends R>> onExtraCallbackWithResult;

    public getMemoryError(serializeRaw<T> serializeraw, deserializeIntNullableCollection<? super T, ? extends deserializeIp<? extends R>> deserializeintnullablecollection, boolean z) {
        super(serializeraw);
        this.onExtraCallbackWithResult = deserializeintnullablecollection;
        this.onExtraCallback = z;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super R> writequoted) {
        this.onWarmupCompleted.subscribe(new onWarmupCompleted(writequoted, this.onExtraCallbackWithResult, this.onExtraCallback));
    }

    static final class onWarmupCompleted<T, R> extends AtomicInteger implements writeQuoted<T>, deserializeUriNullableCollection {
        private static final long serialVersionUID = 8600231336733376951L;
        volatile boolean cancelled;
        final boolean delayErrors;
        final writeQuoted<? super R> downstream;
        final deserializeIntNullableCollection<? super T, ? extends deserializeIp<? extends R>> mapper;
        deserializeUriNullableCollection upstream;
        final deserializeUriCollection set = new deserializeUriCollection();
        final getLogsOrBuilder errors = new getLogsOrBuilder();
        final AtomicInteger active = new AtomicInteger(1);
        final AtomicReference<getAllocationBacktraceOrBuilder<R>> queue = new AtomicReference<>();

        onWarmupCompleted(writeQuoted<? super R> writequoted, deserializeIntNullableCollection<? super T, ? extends deserializeIp<? extends R>> deserializeintnullablecollection, boolean z) {
            this.downstream = writequoted;
            this.mapper = deserializeintnullablecollection;
            this.delayErrors = z;
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
            try {
                deserializeIp deserializeip = (deserializeIp) floatExponent.onExtraCallbackWithResult(this.mapper.apply(t), "The mapper returned a null SingleSource");
                this.active.getAndIncrement();
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
                if (this.cancelled || !this.set.onNavigationEvent(onextracallbackwithresult)) {
                    return;
                }
                deserializeip.IAuthTabCallback(onextracallbackwithresult);
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.upstream.dispose();
                onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            this.active.decrementAndGet();
            if (this.errors.IAuthTabCallback(th)) {
                if (!this.delayErrors) {
                    this.set.dispose();
                }
                onWarmupCompleted();
                return;
            }
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            this.active.decrementAndGet();
            onWarmupCompleted();
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.set.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.cancelled;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void onNavigationEvent(onWarmupCompleted<T, R>.onExtraCallbackWithResult onextracallbackwithresult, R r) {
            this.set.IAuthTabCallback(onextracallbackwithresult);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    this.downstream.onExtraCallback(r);
                    boolean z = this.active.decrementAndGet() == 0;
                    getAllocationBacktraceOrBuilder<R> getallocationbacktraceorbuilder = this.queue.get();
                    if (z && (getallocationbacktraceorbuilder == null || getallocationbacktraceorbuilder.isEmpty())) {
                        Throwable thOnExtraCallback = this.errors.onExtraCallback();
                        if (thOnExtraCallback != null) {
                            this.downstream.onExtraCallbackWithResult(thOnExtraCallback);
                            return;
                        } else {
                            this.downstream.onExtraCallback();
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    getAllocationBacktraceOrBuilder<R> getallocationbacktraceorbuilderOnExtraCallbackWithResult = onExtraCallbackWithResult();
                    synchronized (getallocationbacktraceorbuilderOnExtraCallbackWithResult) {
                        getallocationbacktraceorbuilderOnExtraCallbackWithResult.offer(r);
                    }
                    this.active.decrementAndGet();
                    if (getAndIncrement() != 0) {
                        return;
                    }
                }
            }
            IAuthTabCallback();
        }

        getAllocationBacktraceOrBuilder<R> onExtraCallbackWithResult() {
            getAllocationBacktraceOrBuilder<R> getallocationbacktraceorbuilder;
            do {
                getAllocationBacktraceOrBuilder<R> getallocationbacktraceorbuilder2 = this.queue.get();
                if (getallocationbacktraceorbuilder2 != null) {
                    return getallocationbacktraceorbuilder2;
                }
                getallocationbacktraceorbuilder = new getAllocationBacktraceOrBuilder<>(getByteBuffer.IAuthTabCallbackDefault());
            } while (!setSupportImageTintList.onNavigationEvent(this.queue, (Object) null, getallocationbacktraceorbuilder));
            return getallocationbacktraceorbuilder;
        }

        void onNavigationEvent(onWarmupCompleted<T, R>.onExtraCallbackWithResult onextracallbackwithresult, Throwable th) {
            this.set.IAuthTabCallback(onextracallbackwithresult);
            if (this.errors.IAuthTabCallback(th)) {
                if (!this.delayErrors) {
                    this.upstream.dispose();
                    this.set.dispose();
                }
                this.active.decrementAndGet();
                onWarmupCompleted();
                return;
            }
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }

        void onWarmupCompleted() {
            if (getAndIncrement() == 0) {
                IAuthTabCallback();
            }
        }

        void onNavigationEvent() {
            getAllocationBacktraceOrBuilder<R> getallocationbacktraceorbuilder = this.queue.get();
            if (getallocationbacktraceorbuilder != null) {
                getallocationbacktraceorbuilder.clear();
            }
        }

        void IAuthTabCallback() {
            writeQuoted<? super R> writequoted = this.downstream;
            AtomicInteger atomicInteger = this.active;
            AtomicReference<getAllocationBacktraceOrBuilder<R>> atomicReference = this.queue;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (!this.delayErrors && this.errors.get() != null) {
                    Throwable thOnExtraCallback = this.errors.onExtraCallback();
                    onNavigationEvent();
                    writequoted.onExtraCallbackWithResult(thOnExtraCallback);
                    return;
                }
                boolean z = atomicInteger.get() == 0;
                getAllocationBacktraceOrBuilder<R> getallocationbacktraceorbuilder = atomicReference.get();
                R.color colorVarPoll = getallocationbacktraceorbuilder != null ? getallocationbacktraceorbuilder.poll() : null;
                boolean z2 = colorVarPoll == null;
                if (z && z2) {
                    Throwable thOnExtraCallback2 = this.errors.onExtraCallback();
                    if (thOnExtraCallback2 != null) {
                        writequoted.onExtraCallbackWithResult(thOnExtraCallback2);
                        return;
                    } else {
                        writequoted.onExtraCallback();
                        return;
                    }
                }
                if (!z2) {
                    writequoted.onExtraCallback(colorVarPoll);
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            onNavigationEvent();
        }

        final class onExtraCallbackWithResult extends AtomicReference<deserializeUriNullableCollection> implements deserializeIpNullableCollection<R>, deserializeUriNullableCollection {
            private static final long serialVersionUID = -502562646270949838L;

            onExtraCallbackWithResult() {
            }

            @Override // o.deserializeIpNullableCollection
            public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
                deserializeNumber.setOnce(this, deserializeurinullablecollection);
            }

            @Override // o.deserializeIpNullableCollection
            public void onNavigationEvent(R r) {
                onWarmupCompleted.this.onNavigationEvent((onWarmupCompleted<T, onExtraCallbackWithResult>.onExtraCallbackWithResult) this, (onExtraCallbackWithResult) r);
            }

            @Override // o.deserializeIpNullableCollection
            public void onExtraCallbackWithResult(Throwable th) {
                onWarmupCompleted.this.onNavigationEvent(this, th);
            }

            @Override // o.deserializeUriNullableCollection
            public boolean isDisposed() {
                return deserializeNumber.isDisposed(get());
            }

            @Override // o.deserializeUriNullableCollection
            public void dispose() {
                deserializeNumber.dispose(this);
            }
        }
    }
}
