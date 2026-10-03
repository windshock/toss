package o;

import kotlin.jvm.internal.Intrinsics;
import o.toRealPath;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setTimeVisible extends toRealPath {
    private final String IAuthTabCallback;
    private final String onExtraCallback;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setTimeVisible)) {
            return false;
        }
        setTimeVisible settimevisible = (setTimeVisible) obj;
        return Intrinsics.areEqual(this.IAuthTabCallback, settimevisible.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallback, settimevisible.onExtraCallback);
    }

    public int hashCode() {
        return (this.IAuthTabCallback.hashCode() * 31) + this.onExtraCallback.hashCode();
    }

    public String toString() {
        return "TransactionDateViewModel(year=" + this.IAuthTabCallback + ", date=" + this.onExtraCallback + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setTimeVisible(@NotNull String str, @NotNull String str2) {
        super(toRealPath.onNavigationEvent.TRANSACTION_V2_DATE);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.IAuthTabCallback = str;
        this.onExtraCallback = str2;
    }

    public final String IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public long onWarmupCompleted() {
        return hashCode();
    }
}
