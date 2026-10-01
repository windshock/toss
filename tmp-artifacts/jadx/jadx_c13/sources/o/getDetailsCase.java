package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getDetailsCase<T> extends wasLastName implements parseNegativeDecimal<T> {
    final deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> IAuthTabCallback;
    final serializeRaw<T> onExtraCallback;
    final boolean onWarmupCompleted;

    public getDetailsCase(serializeRaw<T> serializeraw, deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> deserializeintnullablecollection, boolean z) {
        this.onExtraCallback = serializeraw;
        this.IAuthTabCallback = deserializeintnullablecollection;
        this.onWarmupCompleted = z;
    }

    @Override // o.wasLastName
    public void IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        this.onExtraCallback.subscribe(new onNavigationEvent(jsonReaderDoublePrecision, this.IAuthTabCallback, this.onWarmupCompleted));
    }

    @Override // o.parseNegativeDecimal
    public getByteBuffer<T> onWarmupCompleted() {
        return RxJavaPlugins.onExtraCallback(new getHumanReadableBytes(this.onExtraCallback, this.IAuthTabCallback, this.onWarmupCompleted));
    }

    static final class onNavigationEvent<T> extends AtomicInteger implements deserializeUriNullableCollection, writeQuoted<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        final boolean delayErrors;
        volatile boolean disposed;
        final JsonReaderDoublePrecision downstream;
        final deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> mapper;
        deserializeUriNullableCollection upstream;
        final getLogsOrBuilder errors = new getLogsOrBuilder();
        final deserializeUriCollection set = new deserializeUriCollection();

        onNavigationEvent(JsonReaderDoublePrecision jsonReaderDoublePrecision, deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> deserializeintnullablecollection, boolean z) {
            this.downstream = jsonReaderDoublePrecision;
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
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
                if (this.disposed || !this.set.onNavigationEvent(onextracallbackwithresult)) {
                    return;
                }
                jsonReaderErrorInfo.onExtraCallbackWithResult(onextracallbackwithresult);
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

        void IAuthTabCallback(onNavigationEvent<T>.onExtraCallbackWithResult onextracallbackwithresult) {
            this.set.IAuthTabCallback(onextracallbackwithresult);
            onExtraCallback();
        }

        void onExtraCallbackWithResult(onNavigationEvent<T>.onExtraCallbackWithResult onextracallbackwithresult, Throwable th) {
            this.set.IAuthTabCallback(onextracallbackwithresult);
            onExtraCallbackWithResult(th);
        }

        final class onExtraCallbackWithResult extends AtomicReference<deserializeUriNullableCollection> implements JsonReaderDoublePrecision, deserializeUriNullableCollection {
            private static final long serialVersionUID = 8606673141535671828L;

            onExtraCallbackWithResult() {
            }

            @Override // o.JsonReaderDoublePrecision
            public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
                deserializeNumber.setOnce(this, deserializeurinullablecollection);
            }

            @Override // o.JsonReaderDoublePrecision
            public void onExtraCallback() {
                onNavigationEvent.this.IAuthTabCallback(this);
            }

            @Override // o.JsonReaderDoublePrecision
            public void onExtraCallbackWithResult(Throwable th) {
                onNavigationEvent.this.onExtraCallbackWithResult(this, th);
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
