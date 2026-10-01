package com.tnkfactory.ad.style;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class StickyHeaderItemDecoration extends RecyclerView.ItemDecoration {
    public final SectionCallback a;

    public interface SectionCallback {
        void onScrolledOffset(int i2);
    }

    public StickyHeaderItemDecoration(@NotNull SectionCallback sectionCallback) {
        Intrinsics.checkNotNullParameter(sectionCallback, "");
        this.a = sectionCallback;
    }

    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        super.onDrawOver(canvas, recyclerView, state);
        View childAt = recyclerView.getChildAt(0);
        if (childAt == null) {
            return;
        }
        if (recyclerView.getChildAdapterPosition(childAt) != 0) {
            this.a.onScrolledOffset(9999);
        } else {
            this.a.onScrolledOffset(recyclerView.computeVerticalScrollOffset());
        }
    }
}
