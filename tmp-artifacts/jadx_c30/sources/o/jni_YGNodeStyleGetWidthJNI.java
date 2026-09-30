package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class jni_YGNodeStyleGetWidthJNI {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long onNavigationEvent(int i, int i2) {
        long j = (i * 12) + i2;
        long j2 = j / 12;
        if (-2147483648L <= j2 && j2 <= 2147483647L) {
            return j;
        }
        throw new IllegalArgumentException(("The total number of years in " + i + " years and " + i2 + " months overflows an Int").toString());
    }

    private static final long onExtraCallback(int i, int i2, int i3, long j) {
        try {
            return jcycx.IAuthTabCallback((((i * 60) + i2) * 60) + (j / 1000000000) + i3, 1000000000L, j % 1000000000);
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("The total number of nanoseconds in " + i + " hours, " + i2 + " minutes, " + i3 + " seconds, and " + j + " nanoseconds overflows a Long");
        }
    }

    public static final jni_YGNodeStyleGetPaddingJNI onExtraCallback(long j, int i, long j2) {
        if (j2 != 0) {
            return new jni_YGNodeStyleGetPositionJNI(j, i, j2);
        }
        return new jni_YGNodeStyleGetMinHeightJNI(j, i);
    }

    public static final jni_YGNodeStyleGetPaddingJNI onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, long j) {
        return onExtraCallback(onNavigationEvent(i, i2), i3, onExtraCallback(i4, i5, i6, j));
    }
}
