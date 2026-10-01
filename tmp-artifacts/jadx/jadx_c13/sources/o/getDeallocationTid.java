package o;

import java.util.concurrent.Callable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getDeallocationTid extends getAddress implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    public getDeallocationTid(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public Void call() throws Exception {
        this.runner = Thread.currentThread();
        try {
            this.runnable.run();
            return null;
        } finally {
            lazySet(getAddress.IAuthTabCallback);
            this.runner = null;
        }
    }
}
