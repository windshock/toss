package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RetryManager {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String issueDate;
    private final String name;
    private final BaseRoundCornerProgressBar1 rrn;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RetryManager)) {
            int i2 = onNavigationEvent + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        RetryManager retryManager = (RetryManager) obj;
        if (!Intrinsics.areEqual(this.rrn, retryManager.rrn)) {
            int i4 = onWarmupCompleted + 87;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.name, retryManager.name)) {
            return false;
        }
        if (Intrinsics.areEqual(this.issueDate, retryManager.issueDate)) {
            return true;
        }
        int i6 = onNavigationEvent + 93;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.rrn.hashCode();
        return i3 == 0 ? (((iHashCode - 76) + this.name.hashCode()) * 68) << this.issueDate.hashCode() : (((iHashCode * 31) + this.name.hashCode()) * 31) + this.issueDate.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifyResidentCardRequest(rrn=" + this.rrn + ", name=" + this.name + ", issueDate=" + this.issueDate + ")";
        int i2 = onNavigationEvent + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public RetryManager(@NotNull BaseRoundCornerProgressBar1 baseRoundCornerProgressBar1, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(baseRoundCornerProgressBar1, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.rrn = baseRoundCornerProgressBar1;
        this.name = str;
        this.issueDate = str2;
    }
}
