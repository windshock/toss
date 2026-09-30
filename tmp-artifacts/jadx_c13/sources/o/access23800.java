package o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.MapConverter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access23800 extends getByteBuffer<Long> {
    final TimeUnit onExtraCallback;
    final long onExtraCallbackWithResult;
    final long onNavigationEvent;
    final MapConverter onWarmupCompleted;

    public access23800(long j, long j2, TimeUnit timeUnit, MapConverter mapConverter) {
        this.onNavigationEvent = j;
        this.onExtraCallbackWithResult = j2;
        this.onExtraCallback = timeUnit;
        this.onWarmupCompleted = mapConverter;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super Long> writequoted) {
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(writequoted);
        writequoted.IAuthTabCallback(onwarmupcompleted);
        MapConverter mapConverter = this.onWarmupCompleted;
        if (mapConverter instanceof access25300) {
            MapConverter.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = mapConverter.onExtraCallbackWithResult();
            onwarmupcompleted.IAuthTabCallback(onnavigationeventOnExtraCallbackWithResult);
            onnavigationeventOnExtraCallbackWithResult.onExtraCallbackWithResult(onwarmupcompleted, this.onNavigationEvent, this.onExtraCallbackWithResult, this.onExtraCallback);
            return;
        }
        onwarmupcompleted.IAuthTabCallback(mapConverter.onExtraCallbackWithResult(onwarmupcompleted, this.onNavigationEvent, this.onExtraCallbackWithResult, this.onExtraCallback));
    }

    static final class onWarmupCompleted extends AtomicReference<deserializeUriNullableCollection> implements deserializeUriNullableCollection, Runnable {
        private static final long serialVersionUID = 346773832286157679L;
        long count;
        final writeQuoted<? super Long> downstream;

        onWarmupCompleted(writeQuoted<? super Long> writequoted) {
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
            if (get() != deserializeNumber.DISPOSED) {
                writeQuoted<? super Long> writequoted = this.downstream;
                long j = this.count;
                this.count = 1 + j;
                writequoted.onExtraCallback(Long.valueOf(j));
            }
        }

        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.setOnce(this, deserializeurinullablecollection);
        }
    }
}
