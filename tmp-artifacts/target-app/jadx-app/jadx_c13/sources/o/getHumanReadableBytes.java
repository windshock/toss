package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getHumanReadableBytes<T> extends setPc<T, T> {
    final deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> IAuthTabCallback;
    final boolean onNavigationEvent;

    public getHumanReadableBytes(serializeRaw<T> serializeraw, deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> deserializeintnullablecollection, boolean z) {
        super(serializeraw);
        this.IAuthTabCallback = deserializeintnullablecollection;
        this.onNavigationEvent = z;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onWarmupCompleted.subscribe(new onWarmupCompleted(writequoted, this.IAuthTabCallback, this.onNavigationEvent));
    }

    static final class onWarmupCompleted<T> extends read2<T> implements writeQuoted<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        final boolean delayErrors;
        volatile boolean disposed;
        final writeQuoted<? super T> downstream;
        final deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> mapper;
        deserializeUriNullableCollection upstream;
        final getLogsOrBuilder errors = new getLogsOrBuilder();
        final deserializeUriCollection set = new deserializeUriCollection();

        @Override // o.parsePositiveDecimal
        public void clear() {
        }

        @Override // o.parsePositiveDecimal
        public boolean isEmpty() {
            return true;
        }

        @Override // o.parsePositiveDecimal
        public T poll() throws Exception {
            return null;
        }

        @Override // o.parseFloatGeneric
        public int requestFusion(int i) {
            return i & 2;
        }

        onWarmupCompleted(writeQuoted<? super T> writequoted, deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> deserializeintnullablecollection, boolean z) {
            this.downstream = writequoted;
            this.mapper = deserializeintnullablecollection;
            this.delayErrors = z;
            lazySet(1);
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
                JsonReaderErrorInfo jsonReaderErrorInfo = (JsonReaderErrorInfo) floatExponent.onExtraCallbackWithResult(this.mapper.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                onNavigationEvent onnavigationevent = new onNavigationEvent();
                if (this.disposed || !this.set.onNavigationEvent(onnavigationevent)) {
                    return;
                }
                jsonReaderErrorInfo.onExtraCallbackWithResult(onnavigationevent);
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.upstream.dispose();
                onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.errors.IAuthTabCallback(th)) {
                if (this.delayErrors) {
                    if (decrementAndGet() == 0) {
                        this.downstream.onExtraCallbackWithResult(this.errors.onExtraCallback());
                        return;
                    }
                    return;
                }
                dispose();
                if (getAndSet(0) > 0) {
                    this.downstream.onExtraCallbackWithResult(this.errors.onExtraCallback());
                    return;
                }
                return;
            }
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            if (decrementAndGet() == 0) {
                Throwable thOnExtraCallback = this.errors.onExtraCallback();
                if (thOnExtraCallback != null) {
                    this.downstream.onExtraCallbackWithResult(thOnExtraCallback);
                } else {
                    this.downstream.onExtraCallback();
                }
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.disposed = true;
            this.upstream.dispose();
            this.set.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        void onExtraCallbackWithResult(onWarmupCompleted<T>.onNavigationEvent onnavigationevent) {
            this.set.IAuthTabCallback(onnavigationevent);
            onExtraCallback();
        }

        void onWarmupCompleted(onWarmupCompleted<T>.onNavigationEvent onnavigationevent, Throwable th) {
            this.set.IAuthTabCallback(onnavigationevent);
            onExtraCallbackWithResult(th);
        }

        final class onNavigationEvent extends AtomicReference<deserializeUriNullableCollection> implements JsonReaderDoublePrecision, deserializeUriNullableCollection {
            private static final long serialVersionUID = 8606673141535671828L;

            onNavigationEvent() {
            }

            @Override // o.JsonReaderDoublePrecision
            public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
                deserializeNumber.setOnce(this, deserializeurinullablecollection);
            }

            @Override // o.JsonReaderDoublePrecision
            public void onExtraCallback() {
                onWarmupCompleted.this.onExtraCallbackWithResult(this);
            }

            @Override // o.JsonReaderDoublePrecision
            public void onExtraCallbackWithResult(Throwable th) {
                onWarmupCompleted.this.onWarmupCompleted(this, th);
            }

            @Override // o.deserializeUriNullableCollection
            public void dispose() {
                deserializeNumber.dispose(this);
            }

            @Override // o.deserializeUriNullableCollection
            public boolean isDisposed() {
                return deserializeNumber.isDisposed(get());
            }
        }
    }
}
