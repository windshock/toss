package o;

import io.realm.internal.NativeObjectReference;
import io.realm.log.RealmLog;
import java.lang.ref.ReferenceQueue;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class access21800 implements Runnable {
    private final ReferenceQueue<access22100> IAuthTabCallback;

    access21800(ReferenceQueue<access22100> referenceQueue) {
        this.IAuthTabCallback = referenceQueue;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                ((NativeObjectReference) this.IAuthTabCallback.remove()).onWarmupCompleted();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                RealmLog.IAuthTabCallback("The FinalizerRunnable thread has been interrupted. Native resources cannot be freed anymore", new Object[0]);
                return;
            }
        }
    }
}
