package com.swmansion.rnscreens.stack.views;

import com.swmansion.rnscreens.ScreenStack;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ReverseFromIndex extends ChildrenDrawingOrderStrategyBase {
    private final int startIndex;

    public ReverseFromIndex(int i) {
        super(false, 1, null);
        this.startIndex = i;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public void apply(@NotNull List<ScreenStack.DrawingOp> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (isEnabled()) {
            int i = this.startIndex;
            for (int lastIndex = CollectionsKt.getLastIndex(list); i < lastIndex; lastIndex--) {
                Collections.swap(list, i, lastIndex);
                i++;
            }
        }
    }
}
