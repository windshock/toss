package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosHeapObjectOrBuilder extends getAddress implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public TombstoneProtosHeapObjectOrBuilder(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.runner = Thread.currentThread();
        try {
            this.runnable.run();
            this.runner = null;
        } catch (Throwable th) {
            this.runner = null;
            lazySet(getAddress.IAuthTabCallback);
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }
    }
}
