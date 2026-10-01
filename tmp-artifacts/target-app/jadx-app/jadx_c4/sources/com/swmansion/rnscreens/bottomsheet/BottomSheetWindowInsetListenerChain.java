package com.swmansion.rnscreens.bottomsheet;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.RenderInTransitionOverlayNodeElement;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BottomSheetWindowInsetListenerChain implements RenderInTransitionOverlayNodeElement {
    private final List<RenderInTransitionOverlayNodeElement> listeners = new ArrayList();

    public final void addListener(@NotNull RenderInTransitionOverlayNodeElement renderInTransitionOverlayNodeElement) {
        Intrinsics.checkNotNullParameter(renderInTransitionOverlayNodeElement, "");
        this.listeners.add(renderInTransitionOverlayNodeElement);
    }

    public WindowInsetsCompat onApplyWindowInsets(@NotNull View view, @NotNull WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Iterator<RenderInTransitionOverlayNodeElement> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onApplyWindowInsets(view, windowInsetsCompat);
        }
        return windowInsetsCompat;
    }
}
