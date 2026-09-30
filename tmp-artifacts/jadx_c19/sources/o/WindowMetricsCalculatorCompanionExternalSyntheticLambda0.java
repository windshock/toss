package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class WindowMetricsCalculatorCompanionExternalSyntheticLambda0 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public static final String onExtraCallbackWithResult(@Nullable Long l, @Nullable Integer num) {
        int i2 = 2 % 2;
        if (l == null) {
            return "";
        }
        int i3 = onWarmupCompleted + 3;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 2 / 0;
            if (num == null) {
                return "";
            }
        } else if (num == null) {
            return "";
        }
        Object objValueOf = l;
        if (num.intValue() > 0) {
            int i5 = onExtraCallback + 85;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            double dLongValue = l.longValue() / Math.pow(10.0d, num.intValue());
            if (dLongValue % 1.0d == 0.0d) {
                int i7 = onExtraCallback + 47;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    Integer.valueOf((int) dLongValue);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                objValueOf = Integer.valueOf((int) dLongValue);
            } else {
                objValueOf = Double.valueOf(dLongValue);
            }
        }
        return objValueOf.toString();
    }
}
