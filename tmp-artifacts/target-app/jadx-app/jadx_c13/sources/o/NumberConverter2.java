package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NumberConverter2 extends wasLastName {
    final deserializeDecimalCollection onExtraCallback;
    final JsonReaderErrorInfo onExtraCallbackWithResult;

    public NumberConverter2(JsonReaderErrorInfo jsonReaderErrorInfo, deserializeDecimalCollection deserializedecimalcollection) {
        this.onExtraCallbackWithResult = jsonReaderErrorInfo;
        this.onExtraCallback = deserializedecimalcollection;
    }

    @Override // o.wasLastName
    public void IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(new IAuthTabCallback(jsonReaderDoublePrecision, this.onExtraCallback));
    }

    static final class IAuthTabCallback extends AtomicInteger implements JsonReaderDoublePrecision, deserializeUriNullableCollection {
        private static final long serialVersionUID = 4109457741734051389L;
        final JsonReaderDoublePrecision downstream;
        final deserializeDecimalCollection onFinally;
        deserializeUriNullableCollection upstream;

        IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision, deserializeDecimalCollection deserializedecimalcollection) {
            this.downstream = jsonReaderDoublePrecision;
            this.onFinally = deserializedecimalcollection;
        }

        @Override // o.JsonReaderDoublePrecision
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.upstream, deserializeurinullablecollection)) {
                this.upstream = deserializeurinullablecollection;
                this.downstream.IAuthTabCallback(this);
            }
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallbackWithResult(Throwable th) {
            this.downstream.onExtraCallbackWithResult(th);
            onExtraCallbackWithResult();
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallback() {
            this.downstream.onExtraCallback();
            onExtraCallbackWithResult();
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.upstream.dispose();
            onExtraCallbackWithResult();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        void onExtraCallbackWithResult() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    NumberConverter.onWarmupCompleted(th);
                    RxJavaPlugins.onExtraCallbackWithResult(th);
                }
            }
        }
    }
}
