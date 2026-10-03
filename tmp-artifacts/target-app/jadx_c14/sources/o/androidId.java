package o;

import kotlin.jvm.internal.Intrinsics;
import o.toRealPath;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class androidId extends toRealPath {
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidId)) {
            return false;
        }
        androidId androidid = (androidId) obj;
        return Intrinsics.areEqual(this.onNavigationEvent, androidid.onNavigationEvent) && Intrinsics.areEqual(this.onExtraCallbackWithResult, androidid.onExtraCallbackWithResult);
    }

    public int hashCode() {
        return (this.onNavigationEvent.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        return "TransactionYearViewModel(year=" + this.onNavigationEvent + ", date=" + this.onExtraCallbackWithResult + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public androidId(@NotNull String str, @NotNull String str2) {
        super(toRealPath.onNavigationEvent.TRANSACTION_V2_YEAR);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onNavigationEvent = str;
        this.onExtraCallbackWithResult = str2;
    }

    public final String onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public long onWarmupCompleted() {
        return hashCode();
    }
}
