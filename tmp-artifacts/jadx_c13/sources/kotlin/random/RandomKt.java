package kotlin.random;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.IntRange;
import o.access4500;
import o.getRegistersOrBuilder;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RandomKt {
    public static final int IAuthTabCallback(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }

    public static final Random onWarmupCompleted(long j) {
        return new getRegistersOrBuilder((int) j, (int) (j >> 32));
    }

    public static final int onNavigationEvent(@NotNull Random random, @NotNull IntRange intRange) {
        Intrinsics.checkNotNullParameter(random, "");
        Intrinsics.checkNotNullParameter(intRange, "");
        if (!intRange.isEmpty()) {
            return intRange.getLast() < Integer.MAX_VALUE ? random.onExtraCallback(intRange.getFirst(), intRange.getLast() + 1) : intRange.getFirst() > Integer.MIN_VALUE ? random.onExtraCallback(intRange.getFirst() - 1, intRange.getLast()) + 1 : random.onNavigationEvent();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + intRange);
    }

    public static final long onWarmupCompleted(@NotNull Random random, @NotNull access4500 access4500Var) {
        Intrinsics.checkNotNullParameter(random, "");
        Intrinsics.checkNotNullParameter(access4500Var, "");
        if (!access4500Var.isEmpty()) {
            return access4500Var.IAuthTabCallback() < LongCompanionObject.MAX_VALUE ? random.onExtraCallback(access4500Var.onNavigationEvent(), access4500Var.IAuthTabCallback() + 1) : access4500Var.onNavigationEvent() > Long.MIN_VALUE ? random.onExtraCallback(access4500Var.onNavigationEvent() - 1, access4500Var.IAuthTabCallback()) + 1 : random.IAuthTabCallbackDefault();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + access4500Var);
    }

    public static final int onNavigationEvent(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static final void onExtraCallbackWithResult(int i, int i2) {
        if (i2 <= i) {
            throw new IllegalArgumentException(onWarmupCompleted(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
    }

    public static final void onWarmupCompleted(long j, long j2) {
        if (j2 <= j) {
            throw new IllegalArgumentException(onWarmupCompleted(Long.valueOf(j), Long.valueOf(j2)).toString());
        }
    }

    public static final void onWarmupCompleted(double d, double d2) {
        if (d2 <= d) {
            throw new IllegalArgumentException(onWarmupCompleted(Double.valueOf(d), Double.valueOf(d2)).toString());
        }
    }

    public static final String onWarmupCompleted(@NotNull Object obj, @NotNull Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }
}
