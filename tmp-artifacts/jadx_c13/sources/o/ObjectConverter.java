package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ObjectConverter extends wasLastName {
    final JsonReaderErrorInfo IAuthTabCallback;
    final deserializeLongCollection<? super Throwable> onExtraCallbackWithResult;

    public ObjectConverter(JsonReaderErrorInfo jsonReaderErrorInfo, deserializeLongCollection<? super Throwable> deserializelongcollection) {
        this.IAuthTabCallback = jsonReaderErrorInfo;
        this.onExtraCallbackWithResult = deserializelongcollection;
    }

    @Override // o.wasLastName
    public void IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        this.IAuthTabCallback.onExtraCallbackWithResult(new onExtraCallbackWithResult(jsonReaderDoublePrecision));
    }

    final class onExtraCallbackWithResult implements JsonReaderDoublePrecision {
        private final JsonReaderDoublePrecision onExtraCallback;

        onExtraCallbackWithResult(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
            this.onExtraCallback = jsonReaderDoublePrecision;
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallback() {
            this.onExtraCallback.onExtraCallback();
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallbackWithResult(Throwable th) {
            try {
                if (ObjectConverter.this.onExtraCallbackWithResult.test(th)) {
                    this.onExtraCallback.onExtraCallback();
                } else {
                    this.onExtraCallback.onExtraCallbackWithResult(th);
                }
            } catch (Throwable th2) {
                NumberConverter.onWarmupCompleted(th2);
                this.onExtraCallback.onExtraCallbackWithResult(new deserializeDecimal(th, th2));
            }
        }

        @Override // o.JsonReaderDoublePrecision
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            this.onExtraCallback.IAuthTabCallback(deserializeurinullablecollection);
        }
    }
}
