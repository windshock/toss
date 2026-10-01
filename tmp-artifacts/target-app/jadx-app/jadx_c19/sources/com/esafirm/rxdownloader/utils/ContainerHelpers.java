package com.esafirm.rxdownloader.utils;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class ContainerHelpers {
    static final int[] onExtraCallbackWithResult = new int[0];
    static final long[] onExtraCallback = new long[0];
    static final Object[] onWarmupCompleted = new Object[0];

    public static int onExtraCallbackWithResult(int i2) {
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                return i4;
            }
        }
        return i2;
    }

    ContainerHelpers() {
    }

    public static int onWarmupCompleted(int i2) {
        return onExtraCallbackWithResult(i2 << 3) / 8;
    }

    static int onNavigationEvent(long[] jArr, int i2, long j) {
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j2 = jArr[i5];
            if (j2 < j) {
                i4 = i5 + 1;
            } else {
                if (j2 <= j) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }
}
