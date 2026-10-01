package o;

import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access9100<T> extends writeRaw<T> {
    final TimeUnit IAuthTabCallback;
    final MapConverter onExtraCallback;
    final long onExtraCallbackWithResult;
    final boolean onNavigationEvent;
    final deserializeIp<? extends T> onWarmupCompleted;

    public access9100(deserializeIp<? extends T> deserializeip, long j, TimeUnit timeUnit, MapConverter mapConverter, boolean z) {
        this.onWarmupCompleted = deserializeip;
        this.onExtraCallbackWithResult = j;
        this.IAuthTabCallback = timeUnit;
        this.onExtraCallback = mapConverter;
        this.onNavigationEvent = z;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        deserializeShortArray deserializeshortarray = new deserializeShortArray();
        deserializeipnullablecollection.IAuthTabCallback(deserializeshortarray);
        this.onWarmupCompleted.IAuthTabCallback(new onExtraCallbackWithResult(deserializeshortarray, deserializeipnullablecollection));
    }

    final class onExtraCallbackWithResult implements deserializeIpNullableCollection<T> {
        private final deserializeShortArray IAuthTabCallback;
        final deserializeIpNullableCollection<? super T> onExtraCallback;

        onExtraCallbackWithResult(deserializeShortArray deserializeshortarray, deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
            this.IAuthTabCallback = deserializeshortarray;
            this.onExtraCallback = deserializeipnullablecollection;
        }

        @Override // o.deserializeIpNullableCollection
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            this.IAuthTabCallback.IAuthTabCallback(deserializeurinullablecollection);
        }

        @Override // o.deserializeIpNullableCollection
        public void onNavigationEvent(T t) {
            deserializeShortArray deserializeshortarray = this.IAuthTabCallback;
            MapConverter mapConverter = access9100.this.onExtraCallback;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(t);
            access9100 access9100Var = access9100.this;
            deserializeshortarray.IAuthTabCallback(mapConverter.onNavigationEvent(onwarmupcompleted, access9100Var.onExtraCallbackWithResult, access9100Var.IAuthTabCallback));
        }

        @Override // o.deserializeIpNullableCollection
        public void onExtraCallbackWithResult(Throwable th) {
            deserializeShortArray deserializeshortarray = this.IAuthTabCallback;
            MapConverter mapConverter = access9100.this.onExtraCallback;
            RunnableC0023onExtraCallbackWithResult runnableC0023onExtraCallbackWithResult = new RunnableC0023onExtraCallbackWithResult(th);
            access9100 access9100Var = access9100.this;
            deserializeshortarray.IAuthTabCallback(mapConverter.onNavigationEvent(runnableC0023onExtraCallbackWithResult, access9100Var.onNavigationEvent ? access9100Var.onExtraCallbackWithResult : 0L, access9100Var.IAuthTabCallback));
        }

        final class onWarmupCompleted implements Runnable {
            private final T IAuthTabCallback;

            onWarmupCompleted(T t) {
                this.IAuthTabCallback = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                onExtraCallbackWithResult.this.onExtraCallback.onNavigationEvent(this.IAuthTabCallback);
            }
        }

        /* renamed from: o.access9100$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        final class RunnableC0023onExtraCallbackWithResult implements Runnable {
            private final Throwable onNavigationEvent;

            RunnableC0023onExtraCallbackWithResult(Throwable th) {
                this.onNavigationEvent = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                onExtraCallbackWithResult.this.onExtraCallback.onExtraCallbackWithResult(this.onNavigationEvent);
            }
        }
    }
}
