package com.mikepenz.aboutlibraries.util;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.ensureLayoutState;
import o.findFirstVisibleChildClosestToEnd;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class Result {
    private final List<ensureLayoutState> onExtraCallbackWithResult;
    private final List<findFirstVisibleChildClosestToEnd> onWarmupCompleted;

    public Result(@NotNull List<ensureLayoutState> list, @NotNull List<findFirstVisibleChildClosestToEnd> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.onExtraCallbackWithResult = list;
        this.onWarmupCompleted = list2;
    }

    public final List<ensureLayoutState> onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    public final List<findFirstVisibleChildClosestToEnd> onNavigationEvent() {
        return this.onWarmupCompleted;
    }
}
