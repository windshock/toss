package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NumberConverter24<T> extends wasLastName {
    final deserializeIp<T> onExtraCallbackWithResult;

    public NumberConverter24(deserializeIp<T> deserializeip) {
        this.onExtraCallbackWithResult = deserializeip;
    }

    @Override // o.wasLastName
    public void IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        this.onExtraCallbackWithResult.IAuthTabCallback(new onNavigationEvent(jsonReaderDoublePrecision));
    }

    static final class onNavigationEvent<T> implements deserializeIpNullableCollection<T> {
        final JsonReaderDoublePrecision IAuthTabCallback;

        onNavigationEvent(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
            this.IAuthTabCallback = jsonReaderDoublePrecision;
        }

        @Override // o.deserializeIpNullableCollection
        public void onExtraCallbackWithResult(Throwable th) {
            this.IAuthTabCallback.onExtraCallbackWithResult(th);
        }

        @Override // o.deserializeIpNullableCollection
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            this.IAuthTabCallback.IAuthTabCallback(deserializeurinullablecollection);
        }

        @Override // o.deserializeIpNullableCollection
        public void onNavigationEvent(T t) {
            this.IAuthTabCallback.onExtraCallback();
        }
    }
}
