package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access25600<T> extends access25700<T> {
    @Override // o.ycxExternalSyntheticLambda0
    public void onWarmupCompleted(T t) {
        if (this.onWarmupCompleted == null) {
            this.onWarmupCompleted = t;
            this.IAuthTabCallback.cancel();
            countDown();
        }
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onWarmupCompleted(Throwable th) {
        if (this.onWarmupCompleted == null) {
            this.onExtraCallbackWithResult = th;
        } else {
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }
        countDown();
    }
}
