package o;

import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class JSBundleLoaderCompanion {
    private final String onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final Calendar onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JSBundleLoaderCompanion)) {
            return false;
        }
        JSBundleLoaderCompanion jSBundleLoaderCompanion = (JSBundleLoaderCompanion) obj;
        return Intrinsics.areEqual(this.onWarmupCompleted, jSBundleLoaderCompanion.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallbackWithResult, jSBundleLoaderCompanion.onExtraCallbackWithResult) && this.onNavigationEvent == jSBundleLoaderCompanion.onNavigationEvent;
    }

    public int hashCode() {
        return (((this.onWarmupCompleted.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + Integer.hashCode(this.onNavigationEvent);
    }

    public String toString() {
        return "PreviousStepData(calendar=" + this.onWarmupCompleted + ", yyyyMMdd=" + this.onExtraCallbackWithResult + ", stepCount=" + this.onNavigationEvent + ")";
    }

    public JSBundleLoaderCompanion(@NotNull Calendar calendar, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(calendar, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = calendar;
        this.onExtraCallbackWithResult = str;
        this.onNavigationEvent = i;
    }

    public final String onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public final int onNavigationEvent() {
        return this.onNavigationEvent;
    }
}
