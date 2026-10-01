package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access15800 {
    private static final int onWarmupCompleted(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    private static final long onNavigationEvent(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }

    private static final int onExtraCallback(int i, int i2, int i3) {
        return onWarmupCompleted(onWarmupCompleted(i, i3) - onWarmupCompleted(i2, i3), i3);
    }

    private static final long IAuthTabCallback(long j, long j2, long j3) {
        return onNavigationEvent(onNavigationEvent(j, j3) - onNavigationEvent(j2, j3), j3);
    }

    public static final int onExtraCallbackWithResult(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                return i2 - onExtraCallback(i2, i, i3);
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                return i2 + onExtraCallback(i, i2, -i3);
            }
        }
        return i2;
    }

    public static final long onExtraCallback(long j, long j2, long j3) {
        if (j3 > 0) {
            if (j < j2) {
                return j2 - IAuthTabCallback(j2, j, j3);
            }
        } else {
            if (j3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (j > j2) {
                return j2 + IAuthTabCallback(j, j2, -j3);
            }
        }
        return j2;
    }
}
