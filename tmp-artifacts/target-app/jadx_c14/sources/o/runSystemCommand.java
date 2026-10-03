package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.toRealPath;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class runSystemCommand extends toRealPath {
    private final String onNavigationEvent;

    /* JADX WARN: Illegal instructions before constructor call */
    public runSystemCommand() {
        String str = null;
        this(str, 1, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof runSystemCommand) && Intrinsics.areEqual(this.onNavigationEvent, ((runSystemCommand) obj).onNavigationEvent);
    }

    public int hashCode() {
        return this.onNavigationEvent.hashCode();
    }

    public String toString() {
        return "LoadingViewModel(message=" + this.onNavigationEvent + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public runSystemCommand(@NotNull String str) {
        super(toRealPath.onNavigationEvent.LOADING);
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent = str;
    }

    public /* synthetic */ runSystemCommand(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public final String onExtraCallback() {
        return this.onNavigationEvent;
    }

    public long onWarmupCompleted() {
        return this.onNavigationEvent.hashCode();
    }

    public final boolean onNavigationEvent() {
        return this.onNavigationEvent.length() > 0;
    }
}
