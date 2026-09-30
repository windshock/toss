package o;

import android.os.Looper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SafeLibLoaderExternalSyntheticLambda0 {
    private static Thread onExtraCallback;

    public static boolean onExtraCallbackWithResult() {
        if (onExtraCallback == null) {
            onExtraCallback = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == onExtraCallback;
    }

    public static void onNavigationEvent() {
        if (!onExtraCallbackWithResult()) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }
}
