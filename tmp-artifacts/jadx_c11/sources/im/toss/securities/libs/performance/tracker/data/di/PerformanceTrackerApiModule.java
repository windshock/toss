package im.toss.securities.libs.performance.tracker.data.di;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.accessgetStatep;
import o.performOnAppAttribution;
import o.q3bg;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class PerformanceTrackerApiModule {
    private static int IAuthTabCallback = 0;
    public static final PerformanceTrackerApiModule onExtraCallback = new PerformanceTrackerApiModule();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = onNavigationEvent + 25;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private PerformanceTrackerApiModule() {
    }

    public final q3bg onNavigationEvent(@NotNull performOnAppAttribution performonappattribution, @NotNull accessgetStatep accessgetstatep) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(performonappattribution, "");
        Intrinsics.checkNotNullParameter(accessgetstatep, "");
        q3bg q3bgVar = (q3bg) performOnAppAttribution.onWarmupCompleted(performonappattribution, q3bg.class, accessgetstatep.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg(), (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        int i4 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return q3bgVar;
    }
}
