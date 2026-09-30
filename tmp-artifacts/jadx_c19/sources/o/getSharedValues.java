package o;

import android.os.SystemClock;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getSharedValues {
    private static final double onExtraCallback = 1.0d / Math.pow(10.0d, 6.0d);

    public static long IAuthTabCallback() {
        return SystemClock.elapsedRealtimeNanos();
    }

    public static double onWarmupCompleted(long j) {
        return (IAuthTabCallback() - j) * onExtraCallback;
    }
}
