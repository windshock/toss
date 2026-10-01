package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setEnterTransition {
    private int onWarmupCompleted;
    public final int onNavigationEvent = 24;
    private final byte[] IAuthTabCallback = new byte[24];

    private setEnterTransition() {
    }

    public static String onWarmupCompleted(double d) {
        return new setEnterTransition().IAuthTabCallback(d);
    }

    private String IAuthTabCallback(double d) {
        int iOnExtraCallback = onExtraCallback(d);
        if (iOnExtraCallback == 0) {
            return onExtraCallback();
        }
        if (iOnExtraCallback == 1) {
            return "0.0";
        }
        if (iOnExtraCallback == 2) {
            return "-0.0";
        }
        if (iOnExtraCallback == 3) {
            return "Infinity";
        }
        if (iOnExtraCallback == 4) {
            return "-Infinity";
        }
        return "NaN";
    }

    private int onExtraCallback(double d) {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
        long j = 4503599627370495L & jDoubleToRawLongBits;
        int i2 = ((int) (jDoubleToRawLongBits >>> 52)) & 2047;
        if (i2 >= 2047) {
            if (j != 0) {
                return 5;
            }
            return jDoubleToRawLongBits > 0 ? 3 : 4;
        }
        this.onWarmupCompleted = -1;
        if (jDoubleToRawLongBits < 0) {
            onWarmupCompleted(45);
        }
        if (i2 == 0) {
            if (j == 0) {
                return jDoubleToRawLongBits == 0 ? 1 : 2;
            }
            if (j < 3) {
                return onWarmupCompleted(-1074, j * 10, -1);
            }
            return onWarmupCompleted(-1074, j, 0);
        }
        int i3 = 1075 - i2;
        long j2 = j | 4503599627370496L;
        if ((i3 < 53) & (i3 > 0)) {
            long j3 = j2 >> i3;
            if ((j3 << i3) == j2) {
                return onExtraCallbackWithResult(j3, 0);
            }
        }
        return onWarmupCompleted(-i3, j2, 0);
    }

    private int onWarmupCompleted(int i2, long j, int i3) {
        long j2;
        int iOnExtraCallback;
        long j3;
        long j4;
        int i4 = ((int) j) & 1;
        long j5 = j << 2;
        if ((j != 4503599627370496L) | (i2 == -1074)) {
            j2 = j5 - 2;
            iOnExtraCallback = setAllowReturnTransitionOverlap.IAuthTabCallback(i2);
        } else {
            j2 = j5 - 1;
            iOnExtraCallback = setAllowReturnTransitionOverlap.onExtraCallback(i2);
        }
        int iOnWarmupCompleted = i2 + setAllowReturnTransitionOverlap.onWarmupCompleted(-iOnExtraCallback) + 2;
        long jOnExtraCallbackWithResult = setAllowReturnTransitionOverlap.onExtraCallbackWithResult(iOnExtraCallback);
        long jOnNavigationEvent = setAllowReturnTransitionOverlap.onNavigationEvent(iOnExtraCallback);
        long jOnWarmupCompleted = onWarmupCompleted(jOnExtraCallbackWithResult, jOnNavigationEvent, j5 << iOnWarmupCompleted);
        long jOnWarmupCompleted2 = onWarmupCompleted(jOnExtraCallbackWithResult, jOnNavigationEvent, j2 << iOnWarmupCompleted);
        long jOnWarmupCompleted3 = onWarmupCompleted(jOnExtraCallbackWithResult, jOnNavigationEvent, (j5 + 2) << iOnWarmupCompleted);
        long j6 = jOnWarmupCompleted >> 2;
        if (j6 >= 100) {
            long jOnWarmupCompleted4 = setAllowReturnTransitionOverlap.onWarmupCompleted(j6, 1844674407370955168L) * 10;
            long j7 = 10 + jOnWarmupCompleted4;
            j3 = j6;
            long j8 = i4;
            boolean z = jOnWarmupCompleted2 + j8 <= (jOnWarmupCompleted4 << 2);
            if (z != ((j7 << 2) + j8 <= jOnWarmupCompleted3)) {
                if (!z) {
                    jOnWarmupCompleted4 = j7;
                }
                return onExtraCallbackWithResult(jOnWarmupCompleted4, iOnExtraCallback);
            }
            j4 = 1;
        } else {
            j3 = j6;
            j4 = 1;
        }
        long j9 = j3 + j4;
        long j10 = i4;
        boolean z2 = jOnWarmupCompleted2 + j10 <= (j3 << 2);
        if (z2 != ((j9 << 2) + j10 <= jOnWarmupCompleted3)) {
            return onExtraCallbackWithResult(!z2 ? j9 : j3, iOnExtraCallback + i3);
        }
        long j11 = jOnWarmupCompleted - ((j3 + j9) << 1);
        return onExtraCallbackWithResult((j11 < 0 || (j11 == 0 && (j3 & 1) == 0)) ? j3 : j9, iOnExtraCallback + i3);
    }

    private static long onWarmupCompleted(long j, long j2, long j3) {
        long jOnWarmupCompleted = setAllowReturnTransitionOverlap.onWarmupCompleted(j2, j3);
        long jOnWarmupCompleted2 = setAllowReturnTransitionOverlap.onWarmupCompleted(j, j3);
        long j4 = ((j * j3) >>> 1) + jOnWarmupCompleted;
        return (((j4 & Long.MAX_VALUE) + Long.MAX_VALUE) >>> 63) | (jOnWarmupCompleted2 + (j4 >>> 63));
    }

    private int onExtraCallbackWithResult(long j, int i2) {
        int iIAuthTabCallback = setAllowReturnTransitionOverlap.IAuthTabCallback(64 - Long.numberOfLeadingZeros(j));
        if (j >= setAllowReturnTransitionOverlap.asBinder(iIAuthTabCallback)) {
            iIAuthTabCallback++;
        }
        long jAsBinder = j * setAllowReturnTransitionOverlap.asBinder(17 - iIAuthTabCallback);
        int i3 = i2 + iIAuthTabCallback;
        long jOnWarmupCompleted = setAllowReturnTransitionOverlap.onWarmupCompleted(jAsBinder, 193428131138340668L) >>> 20;
        int i4 = (int) (jAsBinder - (100000000 * jOnWarmupCompleted));
        int i5 = (int) ((1441151881 * jOnWarmupCompleted) >>> 57);
        int i6 = (int) (jOnWarmupCompleted - (100000000 * i5));
        if (i3 > 0 && i3 <= 7) {
            return onExtraCallbackWithResult(i5, i6, i4, i3);
        }
        if (-3 < i3 && i3 <= 0) {
            return onWarmupCompleted(i5, i6, i4, i3);
        }
        return IAuthTabCallback(i5, i6, i4, i3);
    }

    private int onExtraCallbackWithResult(int i2, int i3, int i4, int i5) {
        onExtraCallback(i2);
        int iOnTransact = onTransact(i3);
        int i6 = 1;
        while (i6 < i5) {
            int i7 = iOnTransact * 10;
            onExtraCallback(i7 >>> 28);
            iOnTransact = i7 & 268435455;
            i6++;
        }
        onWarmupCompleted(46);
        while (i6 <= 8) {
            int i8 = iOnTransact * 10;
            onExtraCallback(i8 >>> 28);
            iOnTransact = i8 & 268435455;
            i6++;
        }
        onExtraCallbackWithResult(i4);
        return 0;
    }

    private int onWarmupCompleted(int i2, int i3, int i4, int i5) {
        onExtraCallback(0);
        onWarmupCompleted(46);
        while (i5 < 0) {
            onExtraCallback(0);
            i5++;
        }
        onExtraCallback(i2);
        onNavigationEvent(i3);
        onExtraCallbackWithResult(i4);
        return 0;
    }

    private int IAuthTabCallback(int i2, int i3, int i4, int i5) {
        onExtraCallback(i2);
        onWarmupCompleted(46);
        onNavigationEvent(i3);
        onExtraCallbackWithResult(i4);
        IAuthTabCallback(i5 - 1);
        return 0;
    }

    private void onExtraCallbackWithResult(int i2) {
        if (i2 != 0) {
            onNavigationEvent(i2);
        }
        onWarmupCompleted();
    }

    private void onNavigationEvent(int i2) {
        int iOnTransact = onTransact(i2);
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = iOnTransact * 10;
            onExtraCallback(i4 >>> 28);
            iOnTransact = i4 & 268435455;
        }
    }

    private void onWarmupCompleted() {
        int i2;
        byte b;
        while (true) {
            byte[] bArr = this.IAuthTabCallback;
            i2 = this.onWarmupCompleted;
            b = bArr[i2];
            if (b != 48) {
                break;
            } else {
                this.onWarmupCompleted = i2 - 1;
            }
        }
        if (b == 46) {
            this.onWarmupCompleted = i2 + 1;
        }
    }

    private int onTransact(int i2) {
        return ((int) (setAllowReturnTransitionOverlap.onWarmupCompleted((i2 + 1) << 28, 193428131138340668L) >>> 20)) - 1;
    }

    private void IAuthTabCallback(int i2) {
        onWarmupCompleted(69);
        if (i2 < 0) {
            onWarmupCompleted(45);
            i2 = -i2;
        }
        if (i2 < 10) {
            onExtraCallback(i2);
            return;
        }
        if (i2 >= 100) {
            int i3 = (i2 * 1311) >>> 17;
            onExtraCallback(i3);
            i2 -= i3 * 100;
        }
        int i4 = (i2 * 103) >>> 10;
        onExtraCallback(i4);
        onExtraCallback(i2 - (i4 * 10));
    }

    private void onWarmupCompleted(int i2) {
        byte[] bArr = this.IAuthTabCallback;
        int i3 = this.onWarmupCompleted + 1;
        this.onWarmupCompleted = i3;
        bArr[i3] = (byte) i2;
    }

    private void onExtraCallback(int i2) {
        byte[] bArr = this.IAuthTabCallback;
        int i3 = this.onWarmupCompleted + 1;
        this.onWarmupCompleted = i3;
        bArr[i3] = (byte) (i2 + 48);
    }

    private String onExtraCallback() {
        return new String(this.IAuthTabCallback, 0, 0, this.onWarmupCompleted + 1);
    }
}
