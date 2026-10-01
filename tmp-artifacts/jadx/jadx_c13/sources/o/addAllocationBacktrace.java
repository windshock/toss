package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class addAllocationBacktrace<T> extends writeRaw<T> {
    final deserializeFloat<? super deserializeUriNullableCollection> onExtraCallback;
    final deserializeIp<T> onNavigationEvent;

    public addAllocationBacktrace(deserializeIp<T> deserializeip, deserializeFloat<? super deserializeUriNullableCollection> deserializefloat) {
        this.onNavigationEvent = deserializeip;
        this.onExtraCallback = deserializefloat;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        this.onNavigationEvent.IAuthTabCallback(new onExtraCallback(deserializeipnullablecollection, this.onExtraCallback));
    }

    static final class onExtraCallback<T> implements deserializeIpNullableCollection<T> {
        final deserializeIpNullableCollection<? super T> IAuthTabCallback;
        final deserializeFloat<? super deserializeUriNullableCollection> onExtraCallbackWithResult;
        boolean onWarmupCompleted;

        onExtraCallback(deserializeIpNullableCollection<? super T> deserializeipnullablecollection, deserializeFloat<? super deserializeUriNullableCollection> deserializefloat) {
            this.IAuthTabCallback = deserializeipnullablecollection;
            this.onExtraCallbackWithResult = deserializefloat;
        }

        @Override // o.deserializeIpNullableCollection
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            try {
                this.onExtraCallbackWithResult.accept(deserializeurinullablecollection);
                this.IAuthTabCallback.IAuthTabCallback(deserializeurinullablecollection);
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.onWarmupCompleted = true;
                deserializeurinullablecollection.dispose();
                deserializeShort.error(th, this.IAuthTabCallback);
            }
        }

        @Override // o.deserializeIpNullableCollection
        public void onNavigationEvent(T t) {
            if (this.onWarmupCompleted) {
                return;
            }
            this.IAuthTabCallback.onNavigationEvent(t);
        }

        @Override // o.deserializeIpNullableCollection
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.onWarmupCompleted) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            } else {
                this.IAuthTabCallback.onExtraCallbackWithResult(th);
            }
        }
    }
}
