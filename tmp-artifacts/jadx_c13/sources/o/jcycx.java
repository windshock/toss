package o;

import okhttp3.internal.http2.Http2Connection;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jcycx {
    private static final int[] onNavigationEvent = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

    public static final long IAuthTabCallback(long j, long j2, long j3) {
        if (j > 0 && j3 < 0) {
            j--;
            j3 += j2;
        } else if (j < 0 && j3 > 0) {
            j++;
            j3 -= j2;
        }
        return jw12.onWarmupCompleted(jw12.onNavigationEvent(j, j2), j3);
    }

    public static final int[] onExtraCallbackWithResult() {
        return onNavigationEvent;
    }
}
