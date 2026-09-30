package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class UUIDConverter2<T> extends ObjectConverter2<T, T> {
    final deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> IAuthTabCallback;
    final int onNavigationEvent;
    final boolean onWarmupCompleted;

    public UUIDConverter2(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> deserializeintnullablecollection, boolean z, int i) {
        super(jsonReaderUnknownNumberParsing);
        this.IAuthTabCallback = deserializeintnullablecollection;
        this.onWarmupCompleted = z;
        this.onNavigationEvent = i;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new IAuthTabCallback(ycxexternalsyntheticlambda0, this.IAuthTabCallback, this.onWarmupCompleted, this.onNavigationEvent));
    }

    static final class IAuthTabCallback<T> extends addAllLogs<T> implements JsonReaderReadObject<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        volatile boolean cancelled;
        final boolean delayErrors;
        final ycxExternalSyntheticLambda0<? super T> downstream;
        final deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> mapper;
        final int maxConcurrency;
        ycxExternalSyntheticLambda1 upstream;
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

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
        }

        @Override // o.parseFloatGeneric
        public int requestFusion(int i) {
            return i & 2;
        }

        IAuthTabCallback(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, deserializeIntNullableCollection<? super T, ? extends JsonReaderErrorInfo> deserializeintnullablecollection, boolean z, int i) {
            this.downstream = ycxexternalsyntheticlambda0;
            this.mapper = deserializeintnullablecollection;
            this.delayErrors = z;
            this.maxConcurrency = i;
            lazySet(1);
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.validate(this.upstream, ycxexternalsyntheticlambda1)) {
                this.upstream = ycxexternalsyntheticlambda1;
                this.downstream.onExtraCallback(this);
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
                onNavigationEvent onnavigationevent = new onNavigationEvent();
                if (this.cancelled || !this.set.onNavigationEvent(onnavigationevent)) {
                    return;
                }
                jsonReaderErrorInfo.onExtraCallbackWithResult(onnavigationevent);
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
                        this.downstream.onWarmupCompleted(this.errors.onExtraCallback());
                        return;
                    } else {
                        if (this.maxConcurrency != Integer.MAX_VALUE) {
                            this.upstream.request(1L);
                            return;
                        }
                        return;
                    }
                }
                cancel();
                if (getAndSet(0) > 0) {
                    this.downstream.onWarmupCompleted(this.errors.onExtraCallback());
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
                    this.downstream.onWarmupCompleted(thOnExtraCallback);
                    return;
                } else {
                    this.downstream.onExtraCallbackWithResult();
                    return;
                }
            }
            if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1L);
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.set.dispose();
        }

        void onExtraCallbackWithResult(IAuthTabCallback<T>.onNavigationEvent onnavigationevent) {
            this.set.IAuthTabCallback(onnavigationevent);
            onExtraCallbackWithResult();
        }

        void IAuthTabCallback(IAuthTabCallback<T>.onNavigationEvent onnavigationevent, Throwable th) {
            this.set.IAuthTabCallback(onnavigationevent);
            onWarmupCompleted(th);
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
                IAuthTabCallback.this.onExtraCallbackWithResult(this);
            }

            @Override // o.JsonReaderDoublePrecision
            public void onExtraCallbackWithResult(Throwable th) {
                IAuthTabCallback.this.IAuthTabCallback(this, th);
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
