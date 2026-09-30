package o;

import io.realm.internal.NativeObjectReference;
import java.lang.ref.ReferenceQueue;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class access21700 {
    private static final Thread IAuthTabCallback;
    private static final ReferenceQueue<access22100> onExtraCallback;
    public static final access21700 onWarmupCompleted;

    static {
        ReferenceQueue<access22100> referenceQueue = new ReferenceQueue<>();
        onExtraCallback = referenceQueue;
        Thread thread = new Thread(new access21800(referenceQueue));
        IAuthTabCallback = thread;
        onWarmupCompleted = new access21700();
        thread.setName("RealmFinalizingDaemon");
        thread.start();
    }

    public void onWarmupCompleted(access22100 access22100Var) {
        new NativeObjectReference(this, access22100Var, onExtraCallback);
    }
}
