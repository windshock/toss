package com.swmansion.rnscreens.bottomsheet;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BottomSheetBehaviorExtKt {
    public static /* synthetic */ BottomSheetBehavior updateMetrics$default(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        return updateMetrics(bottomSheetBehavior, num, num2);
    }

    public static final <T extends View> BottomSheetBehavior<T> updateMetrics(@NotNull BottomSheetBehavior<T> bottomSheetBehavior, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        if (num != null) {
            bottomSheetBehavior.setMaxHeight(num.intValue());
        }
        if (num2 != null) {
            bottomSheetBehavior.setExpandedOffset(num2.intValue());
        }
        return bottomSheetBehavior;
    }

    public static /* synthetic */ BottomSheetBehavior useSingleDetent$default(BottomSheetBehavior bottomSheetBehavior, Integer num, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return useSingleDetent(bottomSheetBehavior, num, z);
    }

    public static final <T extends View> BottomSheetBehavior<T> useSingleDetent(@NotNull BottomSheetBehavior<T> bottomSheetBehavior, @Nullable Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        bottomSheetBehavior.setSkipCollapsed(true);
        bottomSheetBehavior.setFitToContents(true);
        if (z) {
            bottomSheetBehavior.setState(3);
        }
        if (num != null) {
            bottomSheetBehavior.setMaxHeight(num.intValue());
        }
        return bottomSheetBehavior;
    }

    public static /* synthetic */ BottomSheetBehavior useTwoDetents$default(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        return useTwoDetents(bottomSheetBehavior, num, num2, num3);
    }

    public static final <T extends View> BottomSheetBehavior<T> useTwoDetents(@NotNull BottomSheetBehavior<T> bottomSheetBehavior, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        bottomSheetBehavior.setSkipCollapsed(false);
        bottomSheetBehavior.setFitToContents(true);
        if (num != null) {
            bottomSheetBehavior.setState(num.intValue());
        }
        if (num2 != null) {
            bottomSheetBehavior.setPeekHeight(num2.intValue());
        }
        if (num3 != null) {
            bottomSheetBehavior.setMaxHeight(num3.intValue());
        }
        return bottomSheetBehavior;
    }

    public static /* synthetic */ BottomSheetBehavior useThreeDetents$default(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Integer num3, Float f, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        if ((i & 8) != 0) {
            f = null;
        }
        if ((i & 16) != 0) {
            num4 = null;
        }
        return useThreeDetents(bottomSheetBehavior, num, num2, num3, f, num4);
    }

    public static final <T extends View> BottomSheetBehavior<T> useThreeDetents(@NotNull BottomSheetBehavior<T> bottomSheetBehavior, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Float f, @Nullable Integer num4) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        bottomSheetBehavior.setSkipCollapsed(false);
        bottomSheetBehavior.setFitToContents(false);
        if (num != null) {
            bottomSheetBehavior.setState(num.intValue());
        }
        if (num2 != null) {
            bottomSheetBehavior.setPeekHeight(num2.intValue());
        }
        if (f != null) {
            bottomSheetBehavior.setHalfExpandedRatio(f.floatValue());
        }
        if (num4 != null) {
            bottomSheetBehavior.setExpandedOffset(num4.intValue());
        }
        if (num3 != null) {
            bottomSheetBehavior.setMaxHeight(num3.intValue());
        }
        return bottomSheetBehavior;
    }

    public static final <T extends View> int fitToContentsSheetHeight(@NotNull BottomSheetBehavior<T> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        return bottomSheetBehavior.getMaxHeight();
    }
}
