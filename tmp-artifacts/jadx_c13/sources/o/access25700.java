package o;

import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class access25700<T> extends CountDownLatch implements JsonReaderReadObject<T> {
    ycxExternalSyntheticLambda1 IAuthTabCallback;
    Throwable onExtraCallbackWithResult;
    volatile boolean onNavigationEvent;
    T onWarmupCompleted;

    public access25700() {
        super(1);
    }

    @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
    public final void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        if (setLogs.validate(this.IAuthTabCallback, ycxexternalsyntheticlambda1)) {
            this.IAuthTabCallback = ycxexternalsyntheticlambda1;
            if (this.onNavigationEvent) {
                return;
            }
            ycxexternalsyntheticlambda1.request(LongCompanionObject.MAX_VALUE);
            if (this.onNavigationEvent) {
                this.IAuthTabCallback = setLogs.CANCELLED;
                ycxexternalsyntheticlambda1.cancel();
            }
        }
    }

    @Override // o.ycxExternalSyntheticLambda0
    public final void onExtraCallbackWithResult() {
        countDown();
    }

    public final T onWarmupCompleted() throws InterruptedException {
        if (getCount() != 0) {
            try {
                getLogsOrBuilderList.onNavigationEvent();
                await();
            } catch (InterruptedException e) {
                ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1 = this.IAuthTabCallback;
                this.IAuthTabCallback = setLogs.CANCELLED;
                if (ycxexternalsyntheticlambda1 != null) {
                    ycxexternalsyntheticlambda1.cancel();
                }
                throw access26100.onExtraCallback(e);
            }
        }
        Throwable th = this.onExtraCallbackWithResult;
        if (th != null) {
            throw access26100.onExtraCallback(th);
        }
        return this.onWarmupCompleted;
    }
}
