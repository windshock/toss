package o;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NumberConverter14 extends wasLastName {
    final JsonReaderErrorInfo[] onWarmupCompleted;

    public NumberConverter14(JsonReaderErrorInfo[] jsonReaderErrorInfoArr) {
        this.onWarmupCompleted = jsonReaderErrorInfoArr;
    }

    @Override // o.wasLastName
    public void IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(jsonReaderDoublePrecision, this.onWarmupCompleted);
        jsonReaderDoublePrecision.IAuthTabCallback(onextracallbackwithresult.sd);
        onextracallbackwithresult.IAuthTabCallback();
    }

    static final class onExtraCallbackWithResult extends AtomicInteger implements JsonReaderDoublePrecision {
        private static final long serialVersionUID = -7965400327305809232L;
        final JsonReaderDoublePrecision downstream;
        int index;
        final deserializeShortArray sd = new deserializeShortArray();
        final JsonReaderErrorInfo[] sources;

        onExtraCallbackWithResult(JsonReaderDoublePrecision jsonReaderDoublePrecision, JsonReaderErrorInfo[] jsonReaderErrorInfoArr) {
            this.downstream = jsonReaderDoublePrecision;
            this.sources = jsonReaderErrorInfoArr;
        }

        @Override // o.JsonReaderDoublePrecision
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            this.sd.IAuthTabCallback(deserializeurinullablecollection);
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallbackWithResult(Throwable th) {
            this.downstream.onExtraCallbackWithResult(th);
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallback() {
            IAuthTabCallback();
        }

        void IAuthTabCallback() {
            if (this.sd.isDisposed() || getAndIncrement() != 0) {
                return;
            }
            JsonReaderErrorInfo[] jsonReaderErrorInfoArr = this.sources;
            while (!this.sd.isDisposed()) {
                int i = this.index;
                this.index = i + 1;
                if (i == jsonReaderErrorInfoArr.length) {
                    this.downstream.onExtraCallback();
                    return;
                } else {
                    jsonReaderErrorInfoArr[i].onExtraCallbackWithResult(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }
}
