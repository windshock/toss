package com.swmansion.rnscreens.bottomsheet;

import android.view.View;
import com.swmansion.rnscreens.Screen;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SheetUtilsKt {
    public static final boolean isSheetFitToContents(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "");
        return screen.getStackPresentation() == Screen.StackPresentation.FORM_SHEET && screen.getSheetDetents().getCount$react_native_screens_release() == 1 && screen.getSheetDetents().shortest$react_native_screens_release() == -1.0d;
    }

    public static final boolean usesFormSheetPresentation(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "");
        return screen.getStackPresentation() == Screen.StackPresentation.FORM_SHEET;
    }

    public static final boolean requiresEnterTransitionPostponing(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "");
        return !screen.getSheetShouldOverflowTopInset() && usesFormSheetPresentation(screen);
    }

    public static final boolean isLaidOutOrHasCachedLayout(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return view.isLaidOut() || view.getHeight() > 0 || view.getWidth() > 0;
    }
}
