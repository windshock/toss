package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class MatchGroup {
    private final String IAuthTabCallback;
    private final IntRange onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) obj;
        return Intrinsics.areEqual(this.IAuthTabCallback, matchGroup.IAuthTabCallback) && Intrinsics.areEqual(this.onNavigationEvent, matchGroup.onNavigationEvent);
    }

    public int hashCode() {
        return (this.IAuthTabCallback.hashCode() * 31) + this.onNavigationEvent.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.IAuthTabCallback + ", range=" + this.onNavigationEvent + ')';
    }

    public MatchGroup(@NotNull String str, @NotNull IntRange intRange) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(intRange, "");
        this.IAuthTabCallback = str;
        this.onNavigationEvent = intRange;
    }

    public final String onNavigationEvent() {
        return this.IAuthTabCallback;
    }
}
