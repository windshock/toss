package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PerformanceTracerTracingStateCallback extends reportTimeStamp {
    private final List<subscribeToTracingStateChanges> IAuthTabCallback;
    private final boolean onExtraCallback;
    private final String onNavigationEvent;
    private boolean onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerformanceTracerTracingStateCallback)) {
            return false;
        }
        PerformanceTracerTracingStateCallback performanceTracerTracingStateCallback = (PerformanceTracerTracingStateCallback) obj;
        return Intrinsics.areEqual(this.onNavigationEvent, performanceTracerTracingStateCallback.onNavigationEvent) && Intrinsics.areEqual(this.IAuthTabCallback, performanceTracerTracingStateCallback.IAuthTabCallback) && this.onWarmupCompleted == performanceTracerTracingStateCallback.onWarmupCompleted && this.onExtraCallback == performanceTracerTracingStateCallback.onExtraCallback;
    }

    public int hashCode() {
        return (((((this.onNavigationEvent.hashCode() * 31) + this.IAuthTabCallback.hashCode()) * 31) + Boolean.hashCode(this.onWarmupCompleted)) * 31) + Boolean.hashCode(this.onExtraCallback);
    }

    public String toString() {
        return "TermHeader(title=" + this.onNavigationEvent + ", linkedItems=" + this.IAuthTabCallback + ", agreed=" + this.onWarmupCompleted + ", optional=" + this.onExtraCallback + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceTracerTracingStateCallback(@NotNull String str, @NotNull List<subscribeToTracingStateChanges> list, boolean z, boolean z2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        this.onNavigationEvent = str;
        this.IAuthTabCallback = list;
        this.onWarmupCompleted = z;
        this.onExtraCallback = z2;
    }

    public final String onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public final List<subscribeToTracingStateChanges> onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public final void onWarmupCompleted(boolean z) {
        this.onWarmupCompleted = z;
    }

    public final boolean onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public final boolean onExtraCallback() {
        return this.onExtraCallback;
    }
}
