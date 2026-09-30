package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class XmlConverter<T> extends wasLastName implements parseLongGeneric<T> {
    final boolean onExtraCallback;
    final JsonReaderUnknownNumberParsing<T> onExtraCallbackWithResult;
    final int onNavigationEvent;
    final deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> onWarmupCompleted;

    public XmlConverter(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> deserializeintnullablecollection, boolean z, int i) {
        this.onExtraCallbackWithResult = jsonReaderUnknownNumberParsing;
        this.onWarmupCompleted = deserializeintnullablecollection;
        this.onExtraCallback = z;
        this.onNavigationEvent = i;
    }

    @Override // o.wasLastName
    public void IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onNavigationEvent(jsonReaderDoublePrecision, this.onWarmupCompleted, this.onExtraCallback, this.onNavigationEvent));
    }

    @Override // o.parseLongGeneric
    public JsonReaderUnknownNumberParsing<T> onExtraCallbackWithResult() {
        return RxJavaPlugins.onExtraCallbackWithResult(new UUIDConverter2(this.onExtraCallbackWithResult, this.onWarmupCompleted, this.onExtraCallback, this.onNavigationEvent));
    }

    static final class onNavigationEvent<T> extends AtomicInteger implements JsonReaderReadObject<T>, deserializeUriNullableCollection {
        private static final long serialVersionUID = 8443155186132538303L;
        final boolean delayErrors;
        volatile boolean disposed;
        final JsonReaderDoublePrecision downstream;
        final deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> mapper;
        final int maxConcurrency;
        ycxExternalSyntheticLambda1 upstream;
        final getLogsOrBuilder errors = new getLogsOrBuilder();
        final deserializeUriCollection set = new deserializeUriCollection();

        onNavigationEvent(JsonReaderDoublePrecision jsonReaderDoublePrecision, deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> deserializeintnullablecollection, boolean z, int i) {
            this.downstream = jsonReaderDoublePrecision;
            this.mapper = deserializeintnullablecollection;
            this.delayErrors = z;
            this.maxConcurrency = i;
            lazySet(1);
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.validate(this.upstream, ycxexternalsyntheticlambda1)) {
                this.upstream = ycxexternalsyntheticlambda1;
                this.downstream.IAuthTabCallback(this);
                int i = this.maxConcurrency;
                if (i == Integer.MAX_VALUE) {
                    ycxexternalsyntheticlambda1.request(LongCompanionObject.MAX_VALUE);
                } else {
                    ycxexternalsyntheticlambda1.request(i);
                }
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            try {
                JsonReaderErrorInfo jsonReaderErrorInfo = (JsonReaderErrorInfo) floatExponent.onExtraCallbackWithResult(this.mapper.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted();
                if (this.disposed || !this.set.onNavigationEvent(onwarmupcompleted)) {
                    return;
                }
                jsonReaderErrorInfo.onExtraCallbackWithResult(onwarmupcompleted);
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.upstream.cancel();
                onWarmupCompleted(th);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            if (this.errors.IAuthTabCallback(th)) {
                if (this.delayErrors) {
                    if (decrementAndGet() == 0) {
                        this.downstream.onExtraCallbackWithResult(this.errors.onExtraCallback());
                        return;
                    } else {
                        if (this.maxConcurrency != Integer.MAX_VALUE) {
                            this.upstream.request(1L);
                            return;
                        }
                        return;
                    }
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

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            if (decrementAndGet() == 0) {
                Throwable thOnExtraCallback = this.errors.onExtraCallback();
                if (thOnExtraCallback != null) {
                    this.downstream.onExtraCallbackWithResult(thOnExtraCallback);
                    return;
                } else {
                    this.downstream.onExtraCallback();
                    return;
                }
            }
            if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1L);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.disposed = true;
            this.upstream.cancel();
            this.set.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.set.isDisposed();
        }

        void onExtraCallback(onNavigationEvent<T>.onWarmupCompleted onwarmupcompleted) {
            this.set.IAuthTabCallback(onwarmupcompleted);
            onExtraCallbackWithResult();
        }

        void onNavigationEvent(onNavigationEvent<T>.onWarmupCompleted onwarmupcompleted, Throwable th) {
            this.set.IAuthTabCallback(onwarmupcompleted);
            onWarmupCompleted(th);
        }

        final class onWarmupCompleted extends AtomicReference<deserializeUriNullableCollection> implements JsonReaderDoublePrecision, deserializeUriNullableCollection {
            private static final long serialVersionUID = 8606673141535671828L;

            onWarmupCompleted() {
            }

            @Override // o.JsonReaderDoublePrecision
            public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
                deserializeNumber.setOnce(this, deserializeurinullablecollection);
            }

            @Override // o.JsonReaderDoublePrecision
            public void onExtraCallback() {
                onNavigationEvent.this.onExtraCallback(this);
            }

            @Override // o.JsonReaderDoublePrecision
            public void onExtraCallbackWithResult(Throwable th) {
                onNavigationEvent.this.onNavigationEvent(this, th);
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
