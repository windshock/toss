package o;

import android.os.SystemClock;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setPageTransformer {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final setPageTransformer onExtraCallback = new setPageTransformer();
    private static final long IAuthTabCallback = SystemClock.elapsedRealtime();

    private setPageTransformer() {
    }

    static {
        int i = onNavigationEvent + 11;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        IAuthTabCallbackDefault = i2 % 128;
        long jElapsedRealtime = i2 % 2 == 0 ? SystemClock.elapsedRealtime() ^ IAuthTabCallback : SystemClock.elapsedRealtime() - IAuthTabCallback;
        int i3 = IAuthTabCallbackDefault + 99;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return jElapsedRealtime;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
