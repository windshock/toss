package o;

import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RedBoxContentView {
    private final String IAuthTabCallback;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RedBoxContentView)) {
            return false;
        }
        RedBoxContentView redBoxContentView = (RedBoxContentView) obj;
        return Intrinsics.areEqual(this.onExtraCallbackWithResult, redBoxContentView.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onWarmupCompleted, redBoxContentView.onWarmupCompleted) && Intrinsics.areEqual(this.onNavigationEvent, redBoxContentView.onNavigationEvent) && Intrinsics.areEqual(this.onExtraCallback, redBoxContentView.onExtraCallback) && Intrinsics.areEqual(this.IAuthTabCallback, redBoxContentView.IAuthTabCallback);
    }

    public int hashCode() {
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        int iHashCode2 = this.onWarmupCompleted.hashCode();
        int iHashCode3 = this.onNavigationEvent.hashCode();
        String str = this.onExtraCallback;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.IAuthTabCallback.hashCode();
    }

    public String toString() {
        return "Contents(id=" + this.onExtraCallbackWithResult + ", title=" + this.onWarmupCompleted + ", description=" + this.onNavigationEvent + ", imageUrl=" + this.onExtraCallback + ", openLink=" + this.IAuthTabCallback + ")";
    }

    public RedBoxContentView(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str5, BuildConfig.FLAVOR);
        this.onExtraCallbackWithResult = str;
        this.onWarmupCompleted = str2;
        this.onNavigationEvent = str3;
        this.onExtraCallback = str4;
        this.IAuthTabCallback = str5;
    }

    public final String IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public final String onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public final String onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public final String onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public final String onExtraCallback() {
        return this.IAuthTabCallback;
    }
}
