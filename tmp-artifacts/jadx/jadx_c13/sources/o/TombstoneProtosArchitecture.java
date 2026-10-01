package o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.MapConverter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosArchitecture extends JsonReaderUnknownNumberParsing<Long> {
    final TimeUnit IAuthTabCallback;
    final long onExtraCallback;
    final long onNavigationEvent;
    final MapConverter onWarmupCompleted;

    public TombstoneProtosArchitecture(long j, long j2, TimeUnit timeUnit, MapConverter mapConverter) {
        this.onExtraCallback = j;
        this.onNavigationEvent = j2;
        this.IAuthTabCallback = timeUnit;
        this.onWarmupCompleted = mapConverter;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super Long> ycxexternalsyntheticlambda0) {
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(ycxexternalsyntheticlambda0);
        ycxexternalsyntheticlambda0.onExtraCallback(onwarmupcompleted);
        MapConverter mapConverter = this.onWarmupCompleted;
        if (mapConverter instanceof access25300) {
            MapConverter.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = mapConverter.onExtraCallbackWithResult();
            onwarmupcompleted.onWarmupCompleted(onnavigationeventOnExtraCallbackWithResult);
            onnavigationeventOnExtraCallbackWithResult.onExtraCallbackWithResult(onwarmupcompleted, this.onExtraCallback, this.onNavigationEvent, this.IAuthTabCallback);
            return;
        }
        onwarmupcompleted.onWarmupCompleted(mapConverter.onExtraCallbackWithResult(onwarmupcompleted, this.onExtraCallback, this.onNavigationEvent, this.IAuthTabCallback));
    }

    static final class onWarmupCompleted extends AtomicLong implements ycxExternalSyntheticLambda1, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        long count;
        final ycxExternalSyntheticLambda0<? super Long> downstream;
        final AtomicReference<deserializeUriNullableCollection> resource = new AtomicReference<>();

        onWarmupCompleted(ycxExternalSyntheticLambda0<? super Long> ycxexternalsyntheticlambda0) {
            this.downstream = ycxexternalsyntheticlambda0;
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            if (setLogs.validate(j)) {
                TombstoneProtosLogBufferBuilder.onWarmupCompleted(this, j);
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            deserializeNumber.dispose(this.resource);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.resource.get() != deserializeNumber.DISPOSED) {
                if (get() != 0) {
                    ycxExternalSyntheticLambda0<? super Long> ycxexternalsyntheticlambda0 = this.downstream;
                    long j = this.count;
                    this.count = j + 1;
                    ycxexternalsyntheticlambda0.onWarmupCompleted((ycxExternalSyntheticLambda0<? super Long>) Long.valueOf(j));
                    TombstoneProtosLogBufferBuilder.onExtraCallbackWithResult(this, 1L);
                    return;
                }
                this.downstream.onWarmupCompleted((Throwable) new NetConverter4("Can't deliver value " + this.count + " due to lack of requests"));
                deserializeNumber.dispose(this.resource);
            }
        }

        public void onWarmupCompleted(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.setOnce(this.resource, deserializeurinullablecollection);
        }
    }
}
