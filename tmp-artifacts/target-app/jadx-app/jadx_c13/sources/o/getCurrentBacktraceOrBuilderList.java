package o;

import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public class getCurrentBacktraceOrBuilderList extends getCurrentBacktraceOrBuilder {
    public static int onNavigationEvent(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return IntCompanionObject.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    public static long onExtraCallback(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d);
    }

    public static float asBinder(float f) {
        double dCeil;
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return f;
        }
        if (f > 0.0f) {
            dCeil = Math.floor(f);
        } else {
            dCeil = Math.ceil(f);
        }
        return (float) dCeil;
    }

    public static int onNavigationEvent(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    public static long IAuthTabCallback(float f) {
        return onExtraCallback(f);
    }

    public static int onNavigationEvent(int i) {
        return Integer.signum(i);
    }

    public static int onWarmupCompleted(long j) {
        return Long.signum(j);
    }
}
