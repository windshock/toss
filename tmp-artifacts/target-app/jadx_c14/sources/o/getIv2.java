package o;

import o.toRealPath;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getIv2 extends toRealPath {
    private final int onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getIv2) && this.onWarmupCompleted == ((getIv2) obj).onWarmupCompleted;
    }

    public int hashCode() {
        return Integer.hashCode(this.onWarmupCompleted);
    }

    public String toString() {
        return "TransactionTitleViewModel(id=" + this.onWarmupCompleted + ")";
    }

    public getIv2(int i) {
        super(toRealPath.onNavigationEvent.TRANSACTION_TITLE);
        this.onWarmupCompleted = i;
    }

    public long onWarmupCompleted() {
        int i = this.onWarmupCompleted;
        return ("transaction-title-" + i).hashCode();
    }
}
