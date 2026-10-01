package o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access8600 extends getByteBuffer<Long> {
    final MapConverter IAuthTabCallback;
    final long onExtraCallback;
    final TimeUnit onNavigationEvent;

    public access8600(long j, TimeUnit timeUnit, MapConverter mapConverter) {
        this.onExtraCallback = j;
        this.onNavigationEvent = timeUnit;
        this.IAuthTabCallback = mapConverter;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super Long> writequoted) {
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(writequoted);
        writequoted.IAuthTabCallback(onextracallbackwithresult);
        onextracallbackwithresult.onNavigationEvent(this.IAuthTabCallback.onNavigationEvent(onextracallbackwithresult, this.onExtraCallback, this.onNavigationEvent));
    }

    static final class onExtraCallbackWithResult extends AtomicReference<deserializeUriNullableCollection> implements deserializeUriNullableCollection, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final writeQuoted<? super Long> downstream;

        onExtraCallbackWithResult(writeQuoted<? super Long> writequoted) {
            this.downstream = writequoted;
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeNumber.dispose(this);
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return get() == deserializeNumber.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (isDisposed()) {
                return;
            }
            this.downstream.onExtraCallback(0L);
            lazySet(deserializeShort.INSTANCE);
            this.downstream.onExtraCallback();
        }

        public void onNavigationEvent(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.trySet(this, deserializeurinullablecollection);
        }
    }
}
