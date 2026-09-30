package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CustomAppBarLayout extends AppBarLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomAppBarLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void applyToolbarLayoutCorrection$react_native_screens_release(int i) {
        applyFrameCorrectionByTopInset(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void applyFrameCorrectionByTopInset(int i) {
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight() + i, 1073741824));
        layout(getLeft(), getTop(), getRight(), getBottom() + i);
    }
}
