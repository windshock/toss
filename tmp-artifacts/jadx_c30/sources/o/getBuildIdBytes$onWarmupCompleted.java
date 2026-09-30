package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class getBuildIdBytes$onWarmupCompleted<T> extends AtomicInteger implements writeQuoted<T>, deserializeUriNullableCollection {
    private static final long serialVersionUID = 3610901111000061034L;
    volatile boolean active;
    volatile boolean disposed;
    volatile boolean done;
    final JsonReaderDoublePrecision downstream;
    final getLogsCount errorMode;
    final getLogsOrBuilder errors = new getLogsOrBuilder();
    final IAuthTabCallback inner = new IAuthTabCallback(this);
    final deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> mapper;
    final int prefetch;
    parsePositiveDecimal<T> queue;
    deserializeUriNullableCollection upstream;

    getBuildIdBytes$onWarmupCompleted(JsonReaderDoublePrecision jsonReaderDoublePrecision, deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> deserializeintnullablecollection, getLogsCount getlogscount, int i) {
        this.downstream = jsonReaderDoublePrecision;
        this.mapper = deserializeintnullablecollection;
        this.errorMode = getlogscount;
        this.prefetch = i;
    }

    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        if (deserializeNumber.validate(this.upstream, deserializeurinullablecollection)) {
            this.upstream = deserializeurinullablecollection;
            if (deserializeurinullablecollection instanceof parseDoubleGeneric) {
                parseDoubleGeneric parsedoublegeneric = (parseDoubleGeneric) deserializeurinullablecollection;
                int iRequestFusion = parsedoublegeneric.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.queue = parsedoublegeneric;
                    this.done = true;
                    this.downstream.IAuthTabCallback(this);
                    onExtraCallbackWithResult();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.queue = parsedoublegeneric;
                    this.downstream.IAuthTabCallback(this);
                    return;
                }
            }
            this.queue = new getAllocationBacktraceOrBuilder(this.prefetch);
            this.downstream.IAuthTabCallback(this);
        }
    }

    public void onExtraCallback(T t) {
        if (t != null) {
            this.queue.offer(t);
        }
        onExtraCallbackWithResult();
    }

    public void onExtraCallbackWithResult(Throwable th) {
        if (this.errors.IAuthTabCallback(th)) {
            if (this.errorMode == getLogsCount.IMMEDIATE) {
                this.disposed = true;
                this.inner.onExtraCallbackWithResult();
                Throwable thOnExtraCallback = this.errors.onExtraCallback();
                if (thOnExtraCallback != access26100.IAuthTabCallback) {
                    this.downstream.onExtraCallbackWithResult(thOnExtraCallback);
                }
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                    return;
                }
                return;
            }
            this.done = true;
            onExtraCallbackWithResult();
            return;
        }
        RxJavaPlugins.onExtraCallbackWithResult(th);
    }

    public void onExtraCallback() {
        this.done = true;
        onExtraCallbackWithResult();
    }

    public void dispose() {
        this.disposed = true;
        this.upstream.dispose();
        this.inner.onExtraCallbackWithResult();
        if (getAndIncrement() == 0) {
            this.queue.clear();
        }
    }

    public boolean isDisposed() {
        return this.disposed;
    }

    void onNavigationEvent(Throwable th) {
        if (this.errors.IAuthTabCallback(th)) {
            if (this.errorMode == getLogsCount.IMMEDIATE) {
                this.disposed = true;
                this.upstream.dispose();
                Throwable thOnExtraCallback = this.errors.onExtraCallback();
                if (thOnExtraCallback != access26100.IAuthTabCallback) {
                    this.downstream.onExtraCallbackWithResult(thOnExtraCallback);
                }
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                    return;
                }
                return;
            }
            this.active = false;
            onExtraCallbackWithResult();
            return;
        }
        RxJavaPlugins.onExtraCallbackWithResult(th);
    }

    void onNavigationEvent() {
        this.active = false;
        onExtraCallbackWithResult();
    }

    void onExtraCallbackWithResult() {
        JsonReaderErrorInfo jsonReaderErrorInfo;
        boolean z;
        if (getAndIncrement() == 0) {
            getLogsOrBuilder getlogsorbuilder = this.errors;
            getLogsCount getlogscount = this.errorMode;
            while (!this.disposed) {
                if (!this.active) {
                    if (getlogscount == getLogsCount.BOUNDARY && getlogsorbuilder.get() != null) {
                        this.disposed = true;
                        this.queue.clear();
                        this.downstream.onExtraCallbackWithResult(getlogsorbuilder.onExtraCallback());
                        return;
                    }
                    boolean z2 = this.done;
                    try {
                        Object objPoll = this.queue.poll();
                        if (objPoll != null) {
                            jsonReaderErrorInfo = (JsonReaderErrorInfo) floatExponent.onExtraCallbackWithResult(this.mapper.apply(objPoll), "The mapper returned a null CompletableSource");
                            z = false;
                        } else {
                            jsonReaderErrorInfo = null;
                            z = true;
                        }
                        if (z2 && z) {
                            this.disposed = true;
                            Throwable thOnExtraCallback = getlogsorbuilder.onExtraCallback();
                            if (thOnExtraCallback != null) {
                                this.downstream.onExtraCallbackWithResult(thOnExtraCallback);
                                return;
                            } else {
                                this.downstream.onExtraCallback();
                                return;
                            }
                        }
                        if (!z) {
                            this.active = true;
                            jsonReaderErrorInfo.onExtraCallbackWithResult(this.inner);
                        }
                    } catch (Throwable th) {
                        NumberConverter.onWarmupCompleted(th);
                        this.disposed = true;
                        this.queue.clear();
                        this.upstream.dispose();
                        getlogsorbuilder.IAuthTabCallback(th);
                        this.downstream.onExtraCallbackWithResult(getlogsorbuilder.onExtraCallback());
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

    static final class IAuthTabCallback extends AtomicReference<deserializeUriNullableCollection> implements JsonReaderDoublePrecision {
        private static final long serialVersionUID = 5638352172918776687L;
        final getBuildIdBytes$onWarmupCompleted<?> parent;

        IAuthTabCallback(getBuildIdBytes$onWarmupCompleted<?> getbuildidbytes_onwarmupcompleted) {
            this.parent = getbuildidbytes_onwarmupcompleted;
        }

        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.replace(this, deserializeurinullablecollection);
        }

        public void onExtraCallbackWithResult(Throwable th) {
            this.parent.onNavigationEvent(th);
        }

        public void onExtraCallback() {
            this.parent.onNavigationEvent();
        }

        void onExtraCallbackWithResult() {
            deserializeNumber.dispose(this);
        }
    }
}
