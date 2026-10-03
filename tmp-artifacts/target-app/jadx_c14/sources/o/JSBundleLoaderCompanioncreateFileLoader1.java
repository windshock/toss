package o;

import j$.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
final class JSBundleLoaderCompanioncreateFileLoader1 {
    private final long IAuthTabCallback;
    private final LocalDateTime onExtraCallbackWithResult;
    private final long onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JSBundleLoaderCompanioncreateFileLoader1)) {
            return false;
        }
        JSBundleLoaderCompanioncreateFileLoader1 jSBundleLoaderCompanioncreateFileLoader1 = (JSBundleLoaderCompanioncreateFileLoader1) obj;
        return this.onWarmupCompleted == jSBundleLoaderCompanioncreateFileLoader1.onWarmupCompleted && this.IAuthTabCallback == jSBundleLoaderCompanioncreateFileLoader1.IAuthTabCallback && Intrinsics.areEqual(this.onExtraCallbackWithResult, jSBundleLoaderCompanioncreateFileLoader1.onExtraCallbackWithResult);
    }

    public int hashCode() {
        return (((Long.hashCode(this.onWarmupCompleted) * 31) + Long.hashCode(this.IAuthTabCallback)) * 31) + this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        return "QueryTimeRange(startTimeSeconds=" + this.onWarmupCompleted + ", endTimeSeconds=" + this.IAuthTabCallback + ", loopEndTime=" + this.onExtraCallbackWithResult + ")";
    }

    public JSBundleLoaderCompanioncreateFileLoader1(long j, long j2, @NotNull LocalDateTime localDateTime) {
        Intrinsics.checkNotNullParameter(localDateTime, "");
        this.onWarmupCompleted = j;
        this.IAuthTabCallback = j2;
        this.onExtraCallbackWithResult = localDateTime;
    }

    public final long onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public final long onExtraCallback() {
        return this.IAuthTabCallback;
    }

    public final LocalDateTime onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }
}
