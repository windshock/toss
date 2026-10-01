package ru.nsk.kstatemachine.persistence;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RestorationResult {
    private final List<RestoredEventResult> onExtraCallback;
    private final List<RestorationWarningException> onExtraCallbackWithResult;

    public RestorationResult(@NotNull List<RestoredEventResult> list, @NotNull List<RestorationWarningException> list2) {
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list2, BuildConfig.FLAVOR);
        this.onExtraCallback = list;
        this.onExtraCallbackWithResult = list2;
    }

    public final List<RestoredEventResult> onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public final List<RestorationWarningException> onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }
}
