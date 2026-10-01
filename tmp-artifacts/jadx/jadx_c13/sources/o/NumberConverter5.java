package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NumberConverter5 extends wasLastName {
    final JsonReaderErrorInfo[] onNavigationEvent;

    public NumberConverter5(JsonReaderErrorInfo[] jsonReaderErrorInfoArr) {
        this.onNavigationEvent = jsonReaderErrorInfoArr;
    }

    @Override // o.wasLastName
    public void IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        deserializeUriCollection deserializeuricollection = new deserializeUriCollection();
        AtomicInteger atomicInteger = new AtomicInteger(this.onNavigationEvent.length + 1);
        getLogsOrBuilder getlogsorbuilder = new getLogsOrBuilder();
        jsonReaderDoublePrecision.IAuthTabCallback(deserializeuricollection);
        for (JsonReaderErrorInfo jsonReaderErrorInfo : this.onNavigationEvent) {
            if (deserializeuricollection.isDisposed()) {
                return;
            }
            if (jsonReaderErrorInfo == null) {
                getlogsorbuilder.IAuthTabCallback(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            } else {
                jsonReaderErrorInfo.onExtraCallbackWithResult(new onNavigationEvent(jsonReaderDoublePrecision, deserializeuricollection, getlogsorbuilder, atomicInteger));
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            Throwable thOnExtraCallback = getlogsorbuilder.onExtraCallback();
            if (thOnExtraCallback == null) {
                jsonReaderDoublePrecision.onExtraCallback();
            } else {
                jsonReaderDoublePrecision.onExtraCallbackWithResult(thOnExtraCallback);
            }
        }
    }

    static final class onNavigationEvent implements JsonReaderDoublePrecision {
        final AtomicInteger IAuthTabCallback;
        final deserializeUriCollection onExtraCallbackWithResult;
        final getLogsOrBuilder onNavigationEvent;
        final JsonReaderDoublePrecision onWarmupCompleted;

        onNavigationEvent(JsonReaderDoublePrecision jsonReaderDoublePrecision, deserializeUriCollection deserializeuricollection, getLogsOrBuilder getlogsorbuilder, AtomicInteger atomicInteger) {
            this.onWarmupCompleted = jsonReaderDoublePrecision;
            this.onExtraCallbackWithResult = deserializeuricollection;
            this.onNavigationEvent = getlogsorbuilder;
            this.IAuthTabCallback = atomicInteger;
        }

        @Override // o.JsonReaderDoublePrecision
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            this.onExtraCallbackWithResult.onNavigationEvent(deserializeurinullablecollection);
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.onNavigationEvent.IAuthTabCallback(th)) {
                onWarmupCompleted();
            } else {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallback() {
            onWarmupCompleted();
        }

        void onWarmupCompleted() {
            if (this.IAuthTabCallback.decrementAndGet() == 0) {
                Throwable thOnExtraCallback = this.onNavigationEvent.onExtraCallback();
                if (thOnExtraCallback == null) {
                    this.onWarmupCompleted.onExtraCallback();
                } else {
                    this.onWarmupCompleted.onExtraCallbackWithResult(thOnExtraCallback);
                }
            }
        }
    }
}
