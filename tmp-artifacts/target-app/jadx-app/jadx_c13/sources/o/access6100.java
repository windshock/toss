package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access6100 {
    public static final double onExtraCallbackWithResult(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static final double onNavigationEvent(int i) {
        return (Integer.MAX_VALUE & i) + (((i >>> 31) << 30) * 2.0d);
    }

    public static final long onExtraCallback(long j, long j2) {
        if (j2 < 0) {
            return setTypeface.onExtraCallbackWithResult(j, j2) < 0 ? j : access13000.onExtraCallback(j - j2);
        }
        if (j >= 0) {
            return access13000.onExtraCallback(j % j2);
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if (setTypeface.onExtraCallbackWithResult(access13000.onExtraCallback(j3), access13000.onExtraCallback(j2)) < 0) {
            j2 = 0;
        }
        return access13000.onExtraCallback(j3 - j2);
    }

    public static final int onExtraCallback(int i, int i2) {
        return Intrinsics.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    public static final int onNavigationEvent(long j, long j2) {
        return Intrinsics.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    public static final long onExtraCallback(double d) {
        if (Double.isNaN(d) || d <= 0.0d) {
            return 0L;
        }
        if (d >= 1.8446744073709552E19d) {
            return -1L;
        }
        if (d < 9.223372036854776E18d) {
            return access13000.onExtraCallback((long) d);
        }
        return access13000.onExtraCallback(access13000.onExtraCallback((long) (d - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    public static final String onExtraCallbackWithResult(long j, int i) {
        if (j >= 0) {
            String string = Long.toString(j, CharsKt__CharJVMKt.checkRadix(i));
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(j3, CharsKt__CharJVMKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string2, "");
        sb.append(string2);
        String string3 = Long.toString(j4, CharsKt__CharJVMKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string3, "");
        sb.append(string3);
        return sb.toString();
    }
}
