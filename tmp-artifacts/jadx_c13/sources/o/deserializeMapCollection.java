package o;

import java.util.concurrent.Callable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class deserializeMapCollection<T> extends writeRaw<T> {
    final T IAuthTabCallback;
    final Callable<? extends T> onExtraCallback;
    final JsonReaderErrorInfo onNavigationEvent;

    public deserializeMapCollection(JsonReaderErrorInfo jsonReaderErrorInfo, Callable<? extends T> callable, T t) {
        this.onNavigationEvent = jsonReaderErrorInfo;
        this.IAuthTabCallback = t;
        this.onExtraCallback = callable;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        this.onNavigationEvent.onExtraCallbackWithResult(new IAuthTabCallback(deserializeipnullablecollection));
    }

    final class IAuthTabCallback implements JsonReaderDoublePrecision {
        private final deserializeIpNullableCollection<? super T> IAuthTabCallback;

        IAuthTabCallback(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
            this.IAuthTabCallback = deserializeipnullablecollection;
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallback() {
            T tCall;
            deserializeMapCollection deserializemapcollection = deserializeMapCollection.this;
            Callable<? extends T> callable = deserializemapcollection.onExtraCallback;
            if (callable != null) {
                try {
                    tCall = callable.call();
                } catch (Throwable th) {
                    NumberConverter.onWarmupCompleted(th);
                    this.IAuthTabCallback.onExtraCallbackWithResult(th);
                    return;
                }
            } else {
                tCall = deserializemapcollection.IAuthTabCallback;
            }
            if (tCall == null) {
                this.IAuthTabCallback.onExtraCallbackWithResult(new NullPointerException("The value supplied is null"));
            } else {
                this.IAuthTabCallback.onNavigationEvent(tCall);
            }
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallbackWithResult(Throwable th) {
            this.IAuthTabCallback.onExtraCallbackWithResult(th);
        }

        @Override // o.JsonReaderDoublePrecision
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            this.IAuthTabCallback.IAuthTabCallback(deserializeurinullablecollection);
        }
    }
}
