package ru.nsk.kstatemachine.persistence;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RestoredEventResult {
    private final List<RestorationWarningException> onExtraCallback;
    private final Object onNavigationEvent;
    private final Record onWarmupCompleted;

    public RestoredEventResult(@NotNull Record record, @NotNull Object obj, @NotNull List<RestorationWarningException> list) {
        Intrinsics.checkNotNullParameter(record, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        this.onWarmupCompleted = record;
        this.onNavigationEvent = obj;
        this.onExtraCallback = list;
    }

    public final Object onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public final List<RestorationWarningException> IAuthTabCallback() {
        return this.onExtraCallback;
    }
}
