package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NumberConverterNumberInfo extends wasLastName {
    final JsonReaderErrorInfo IAuthTabCallback;
    final JsonReaderErrorInfo onExtraCallback;
    final TimeUnit onExtraCallbackWithResult;
    final MapConverter onNavigationEvent;
    final long onWarmupCompleted;

    public NumberConverterNumberInfo(JsonReaderErrorInfo jsonReaderErrorInfo, long j, TimeUnit timeUnit, MapConverter mapConverter, JsonReaderErrorInfo jsonReaderErrorInfo2) {
        this.onExtraCallback = jsonReaderErrorInfo;
        this.onWarmupCompleted = j;
        this.onExtraCallbackWithResult = timeUnit;
        this.onNavigationEvent = mapConverter;
        this.IAuthTabCallback = jsonReaderErrorInfo2;
    }

    @Override // o.wasLastName
    public void IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        deserializeUriCollection deserializeuricollection = new deserializeUriCollection();
        jsonReaderDoublePrecision.IAuthTabCallback(deserializeuricollection);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        deserializeuricollection.onNavigationEvent(this.onNavigationEvent.onNavigationEvent(new onNavigationEvent(atomicBoolean, deserializeuricollection, jsonReaderDoublePrecision), this.onWarmupCompleted, this.onExtraCallbackWithResult));
        this.onExtraCallback.onExtraCallbackWithResult(new onExtraCallback(deserializeuricollection, atomicBoolean, jsonReaderDoublePrecision));
    }

    static final class onExtraCallback implements JsonReaderDoublePrecision {
        private final AtomicBoolean onExtraCallback;
        private final deserializeUriCollection onExtraCallbackWithResult;
        private final JsonReaderDoublePrecision onNavigationEvent;

        onExtraCallback(deserializeUriCollection deserializeuricollection, AtomicBoolean atomicBoolean, JsonReaderDoublePrecision jsonReaderDoublePrecision) {
            this.onExtraCallbackWithResult = deserializeuricollection;
            this.onExtraCallback = atomicBoolean;
            this.onNavigationEvent = jsonReaderDoublePrecision;
        }

        @Override // o.JsonReaderDoublePrecision
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            this.onExtraCallbackWithResult.onNavigationEvent(deserializeurinullablecollection);
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.onExtraCallback.compareAndSet(false, true)) {
                this.onExtraCallbackWithResult.dispose();
                this.onNavigationEvent.onExtraCallbackWithResult(th);
            } else {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallback() {
            if (this.onExtraCallback.compareAndSet(false, true)) {
                this.onExtraCallbackWithResult.dispose();
                this.onNavigationEvent.onExtraCallback();
            }
        }
    }

    final class onNavigationEvent implements Runnable {
        final deserializeUriCollection IAuthTabCallback;
        private final AtomicBoolean onExtraCallback;
        final JsonReaderDoublePrecision onExtraCallbackWithResult;

        onNavigationEvent(AtomicBoolean atomicBoolean, deserializeUriCollection deserializeuricollection, JsonReaderDoublePrecision jsonReaderDoublePrecision) {
            this.onExtraCallback = atomicBoolean;
            this.IAuthTabCallback = deserializeuricollection;
            this.onExtraCallbackWithResult = jsonReaderDoublePrecision;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.onExtraCallback.compareAndSet(false, true)) {
                this.IAuthTabCallback.onExtraCallbackWithResult();
                JsonReaderErrorInfo jsonReaderErrorInfo = NumberConverterNumberInfo.this.IAuthTabCallback;
                if (jsonReaderErrorInfo == null) {
                    JsonReaderDoublePrecision jsonReaderDoublePrecision = this.onExtraCallbackWithResult;
                    NumberConverterNumberInfo numberConverterNumberInfo = NumberConverterNumberInfo.this;
                    jsonReaderDoublePrecision.onExtraCallbackWithResult(new TimeoutException(access26100.onNavigationEvent(numberConverterNumberInfo.onWarmupCompleted, numberConverterNumberInfo.onExtraCallbackWithResult)));
                    return;
                }
                jsonReaderErrorInfo.onExtraCallbackWithResult(new C0020onNavigationEvent());
            }
        }

        /* renamed from: o.NumberConverterNumberInfo$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        final class C0020onNavigationEvent implements JsonReaderDoublePrecision {
            C0020onNavigationEvent() {
            }

            @Override // o.JsonReaderDoublePrecision
            public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
                onNavigationEvent.this.IAuthTabCallback.onNavigationEvent(deserializeurinullablecollection);
            }

            @Override // o.JsonReaderDoublePrecision
            public void onExtraCallbackWithResult(Throwable th) {
                onNavigationEvent.this.IAuthTabCallback.dispose();
                onNavigationEvent.this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
            }

            @Override // o.JsonReaderDoublePrecision
            public void onExtraCallback() {
                onNavigationEvent.this.IAuthTabCallback.dispose();
                onNavigationEvent.this.onExtraCallbackWithResult.onExtraCallback();
            }
        }
    }
}
