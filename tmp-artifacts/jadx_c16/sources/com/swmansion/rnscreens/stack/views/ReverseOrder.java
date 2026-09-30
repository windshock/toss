package com.swmansion.rnscreens.stack.views;

import com.swmansion.rnscreens.ScreenStack;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ReverseOrder extends ChildrenDrawingOrderStrategyBase {
    public ReverseOrder() {
        super(false, 1, null);
    }

    public void apply(@NotNull List<ScreenStack.DrawingOp> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (isEnabled()) {
            CollectionsKt.reverse(list);
        }
    }
}
