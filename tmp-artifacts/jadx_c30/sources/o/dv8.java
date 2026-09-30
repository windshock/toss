package o;

import java.math.BigInteger;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class dv8 {
    private static final long[] onWarmupCompleted = new long[37];
    private static final int[] onExtraCallbackWithResult = new int[37];
    private static final int[] IAuthTabCallback = new int[37];

    private static int onWarmupCompleted(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static int onNavigationEvent(long j, long j2) {
        return onWarmupCompleted(j - Long.MIN_VALUE, j2 - Long.MIN_VALUE);
    }

    public static String onWarmupCompleted(long j) {
        if (j >= 0) {
            return Long.toString(j);
        }
        long j2 = (j >>> 1) / 5;
        return Long.toString(j2) + (j - (j2 * 10));
    }

    private static long onExtraCallbackWithResult(long j, long j2) {
        if (j2 < 0) {
            return onNavigationEvent(j, j2) < 0 ? 0L : 1L;
        }
        if (j >= 0) {
            return j / j2;
        }
        long j3 = ((j >>> 1) / j2) << 1;
        return j3 + (onNavigationEvent(j - (j3 * j2), j2) < 0 ? 0 : 1);
    }

    private static long onExtraCallback(long j, long j2) {
        if (j2 < 0) {
            return onNavigationEvent(j, j2) < 0 ? j : j - j2;
        }
        if (j >= 0) {
            return j % j2;
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if (onNavigationEvent(j3, j2) < 0) {
            j2 = 0;
        }
        return j3 - j2;
    }

    static {
        BigInteger bigInteger = new BigInteger("10000000000000000", 16);
        for (int i = 2; i <= 36; i++) {
            long j = i;
            onWarmupCompleted[i] = onExtraCallbackWithResult(-1L, j);
            onExtraCallbackWithResult[i] = (int) onExtraCallback(-1L, j);
            IAuthTabCallback[i] = bigInteger.toString(i).length() - 1;
        }
    }
}
