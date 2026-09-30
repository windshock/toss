package o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access18600 extends JsonReaderUnknownNumberParsing<Long> {
    final MapConverter IAuthTabCallback;
    final TimeUnit onExtraCallback;
    final long onWarmupCompleted;

    public access18600(long j, TimeUnit timeUnit, MapConverter mapConverter) {
        this.onWarmupCompleted = j;
        this.onExtraCallback = timeUnit;
        this.IAuthTabCallback = mapConverter;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super Long> ycxexternalsyntheticlambda0) {
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(ycxexternalsyntheticlambda0);
        ycxexternalsyntheticlambda0.onExtraCallback(iAuthTabCallback);
        iAuthTabCallback.onNavigationEvent(this.IAuthTabCallback.onNavigationEvent(iAuthTabCallback, this.onWarmupCompleted, this.onExtraCallback));
    }

    static final class IAuthTabCallback extends AtomicReference<deserializeUriNullableCollection> implements ycxExternalSyntheticLambda1, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final ycxExternalSyntheticLambda0<? super Long> downstream;
        volatile boolean requested;

        IAuthTabCallback(ycxExternalSyntheticLambda0<? super Long> ycxexternalsyntheticlambda0) {
            this.downstream = ycxexternalsyntheticlambda0;
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            if (setLogs.validate(j)) {
                this.requested = true;
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            deserializeNumber.dispose(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != deserializeNumber.DISPOSED) {
                if (this.requested) {
                    this.downstream.onWarmupCompleted((ycxExternalSyntheticLambda0<? super Long>) 0L);
                    lazySet(deserializeShort.INSTANCE);
                    this.downstream.onExtraCallbackWithResult();
                } else {
                    lazySet(deserializeShort.INSTANCE);
                    this.downstream.onWarmupCompleted((Throwable) new NetConverter4("Can't deliver value due to lack of requests"));
                }
            }
        }

        public void onNavigationEvent(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.trySet(this, deserializeurinullablecollection);
        }
    }
}
