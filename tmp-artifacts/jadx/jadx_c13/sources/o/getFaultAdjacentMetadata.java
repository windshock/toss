package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class getFaultAdjacentMetadata extends getFaultAddress {
    public static <T extends Comparable<? super T>> T onExtraCallback(@NotNull T t, @NotNull T t2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(t2, "");
        return t.compareTo(t2) >= 0 ? t : t2;
    }

    public static <T extends Comparable<? super T>> T onExtraCallback(@NotNull T t, @NotNull T t2, @NotNull T t3) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(t2, "");
        Intrinsics.checkNotNullParameter(t3, "");
        return (T) onExtraCallback(t, onExtraCallback(t2, t3));
    }

    public static int onExtraCallbackWithResult(int i, @NotNull int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    public static float onExtraCallback(float f, @NotNull float... fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        for (float f2 : fArr) {
            f = Math.max(f, f2);
        }
        return f;
    }

    public static <T extends Comparable<? super T>> T asBinder(@NotNull T t, @NotNull T t2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(t2, "");
        return t.compareTo(t2) <= 0 ? t : t2;
    }

    public static int onExtraCallback(int i, @NotNull int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        for (int i2 : iArr) {
            i = Math.min(i, i2);
        }
        return i;
    }

    public static float onExtraCallbackWithResult(float f, @NotNull float... fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        for (float f2 : fArr) {
            f = Math.min(f, f2);
        }
        return f;
    }
}
