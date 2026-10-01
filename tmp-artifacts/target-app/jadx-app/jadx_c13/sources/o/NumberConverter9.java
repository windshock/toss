package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NumberConverter9 extends wasLastName {
    final deserializeFloat<? super Throwable> IAuthTabCallback;
    final deserializeDecimalCollection asBinder;
    final deserializeDecimalCollection onExtraCallback;
    final deserializeDecimalCollection onExtraCallbackWithResult;
    final deserializeDecimalCollection onNavigationEvent;
    final JsonReaderErrorInfo onTransact;
    final deserializeFloat<? super deserializeUriNullableCollection> onWarmupCompleted;

    public NumberConverter9(JsonReaderErrorInfo jsonReaderErrorInfo, deserializeFloat<? super deserializeUriNullableCollection> deserializefloat, deserializeFloat<? super Throwable> deserializefloat2, deserializeDecimalCollection deserializedecimalcollection, deserializeDecimalCollection deserializedecimalcollection2, deserializeDecimalCollection deserializedecimalcollection3, deserializeDecimalCollection deserializedecimalcollection4) {
        this.onTransact = jsonReaderErrorInfo;
        this.onWarmupCompleted = deserializefloat;
        this.IAuthTabCallback = deserializefloat2;
        this.onExtraCallbackWithResult = deserializedecimalcollection;
        this.asBinder = deserializedecimalcollection2;
        this.onExtraCallback = deserializedecimalcollection3;
        this.onNavigationEvent = deserializedecimalcollection4;
    }

    @Override // o.wasLastName
    public void IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        this.onTransact.onExtraCallbackWithResult(new onExtraCallbackWithResult(jsonReaderDoublePrecision));
    }

    final class onExtraCallbackWithResult implements JsonReaderDoublePrecision, deserializeUriNullableCollection {
        deserializeUriNullableCollection onExtraCallback;
        final JsonReaderDoublePrecision onExtraCallbackWithResult;

        onExtraCallbackWithResult(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
            this.onExtraCallbackWithResult = jsonReaderDoublePrecision;
        }

        @Override // o.JsonReaderDoublePrecision
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            try {
                NumberConverter9.this.onWarmupCompleted.accept(deserializeurinullablecollection);
                if (deserializeNumber.validate(this.onExtraCallback, deserializeurinullablecollection)) {
                    this.onExtraCallback = deserializeurinullablecollection;
                    this.onExtraCallbackWithResult.IAuthTabCallback(this);
                }
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                deserializeurinullablecollection.dispose();
                this.onExtraCallback = deserializeNumber.DISPOSED;
                deserializeShort.error(th, this.onExtraCallbackWithResult);
            }
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.onExtraCallback == deserializeNumber.DISPOSED) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
                return;
            }
            try {
                NumberConverter9.this.IAuthTabCallback.accept(th);
                NumberConverter9.this.asBinder.run();
            } catch (Throwable th2) {
                NumberConverter.onWarmupCompleted(th2);
                th = new deserializeDecimal(th, th2);
            }
            this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
            onWarmupCompleted();
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallback() {
            if (this.onExtraCallback == deserializeNumber.DISPOSED) {
                return;
            }
            try {
                NumberConverter9.this.onExtraCallbackWithResult.run();
                NumberConverter9.this.asBinder.run();
                this.onExtraCallbackWithResult.onExtraCallback();
                onWarmupCompleted();
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
            }
        }

        void onWarmupCompleted() {
            try {
                NumberConverter9.this.onExtraCallback.run();
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            try {
                NumberConverter9.this.onNavigationEvent.run();
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
            this.onExtraCallback.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onExtraCallback.isDisposed();
        }
    }
}
