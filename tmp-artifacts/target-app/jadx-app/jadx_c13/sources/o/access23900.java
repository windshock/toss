package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access23900<T> extends wasLastName implements parseNegativeDecimal<T> {
    final serializeRaw<T> IAuthTabCallback;

    public access23900(serializeRaw<T> serializeraw) {
        this.IAuthTabCallback = serializeraw;
    }

    @Override // o.wasLastName
    public void IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        this.IAuthTabCallback.subscribe(new IAuthTabCallback(jsonReaderDoublePrecision));
    }

    @Override // o.parseNegativeDecimal
    public getByteBuffer<T> onWarmupCompleted() {
        return RxJavaPlugins.onExtraCallback(new access24200(this.IAuthTabCallback));
    }

    static final class IAuthTabCallback<T> implements writeQuoted<T>, deserializeUriNullableCollection {
        final JsonReaderDoublePrecision onNavigationEvent;
        deserializeUriNullableCollection onWarmupCompleted;

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
        }

        IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
            this.onNavigationEvent = jsonReaderDoublePrecision;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            this.onWarmupCompleted = deserializeurinullablecollection;
            this.onNavigationEvent.IAuthTabCallback(this);
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            this.onNavigationEvent.onExtraCallbackWithResult(th);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            this.onNavigationEvent.onExtraCallback();
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.onWarmupCompleted.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onWarmupCompleted.isDisposed();
        }
    }
}
