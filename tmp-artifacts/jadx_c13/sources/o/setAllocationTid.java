package o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setAllocationTid extends writeRaw<Long> {
    final MapConverter IAuthTabCallback;
    final long onExtraCallback;
    final TimeUnit onWarmupCompleted;

    public setAllocationTid(long j, TimeUnit timeUnit, MapConverter mapConverter) {
        this.onExtraCallback = j;
        this.onWarmupCompleted = timeUnit;
        this.IAuthTabCallback = mapConverter;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super Long> deserializeipnullablecollection) {
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(deserializeipnullablecollection);
        deserializeipnullablecollection.IAuthTabCallback(iAuthTabCallback);
        iAuthTabCallback.onWarmupCompleted(this.IAuthTabCallback.onNavigationEvent(iAuthTabCallback, this.onExtraCallback, this.onWarmupCompleted));
    }

    static final class IAuthTabCallback extends AtomicReference<deserializeUriNullableCollection> implements deserializeUriNullableCollection, Runnable {
        private static final long serialVersionUID = 8465401857522493082L;
        final deserializeIpNullableCollection<? super Long> downstream;

        IAuthTabCallback(deserializeIpNullableCollection<? super Long> deserializeipnullablecollection) {
            this.downstream = deserializeipnullablecollection;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.downstream.onNavigationEvent(0L);
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeNumber.dispose(this);
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return deserializeNumber.isDisposed(get());
        }

        void onWarmupCompleted(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.replace(this, deserializeurinullablecollection);
        }
    }
}
