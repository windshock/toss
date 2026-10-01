package o;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class markFragmentsCreated {
    private final ReentrantLock onWarmupCompleted = new ReentrantLock();
    private final Map<SoftReference<setSharedElementReturnTransition>, Boolean> IAuthTabCallback = new ConcurrentHashMap();
    private final ReferenceQueue<setSharedElementReturnTransition> onExtraCallback = new ReferenceQueue<>();

    static final class onWarmupCompleted {
        static final markFragmentsCreated IAuthTabCallback = new markFragmentsCreated();
    }

    markFragmentsCreated() {
    }

    public static markFragmentsCreated IAuthTabCallback() {
        return onWarmupCompleted.IAuthTabCallback;
    }

    public SoftReference<setSharedElementReturnTransition> onExtraCallback(setSharedElementReturnTransition setsharedelementreturntransition) {
        SoftReference<setSharedElementReturnTransition> softReference = new SoftReference<>(setsharedelementreturntransition, this.onExtraCallback);
        this.IAuthTabCallback.put(softReference, Boolean.TRUE);
        onExtraCallbackWithResult();
        return softReference;
    }

    private void onExtraCallbackWithResult() {
        while (true) {
            SoftReference softReference = (SoftReference) this.onExtraCallback.poll();
            if (softReference == null) {
                return;
            } else {
                this.IAuthTabCallback.remove(softReference);
            }
        }
    }
}
