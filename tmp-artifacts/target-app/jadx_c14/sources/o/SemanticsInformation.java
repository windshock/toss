package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SemanticsInformation {
    private final String onNavigationEvent;
    private final RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 onWarmupCompleted;

    public SemanticsInformation(@NotNull String str, @NotNull RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1, "");
        this.onNavigationEvent = str;
        this.onWarmupCompleted = rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
    }

    public final RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    public final String onNavigationEvent() {
        return this.onNavigationEvent;
    }
}
