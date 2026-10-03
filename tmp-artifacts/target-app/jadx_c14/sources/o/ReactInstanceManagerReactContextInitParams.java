package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactInstanceManagerReactContextInitParams {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final List<ReactInstanceManager2ExternalSyntheticLambda0> transactions;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            return (obj instanceof ReactInstanceManagerReactContextInitParams) && Intrinsics.areEqual(this.transactions, ((ReactInstanceManagerReactContextInitParams) obj).transactions);
        }
        int i5 = i3 + 37;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.transactions.hashCode();
        int i4 = IAuthTabCallback + 71;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TmoneyChargingErrorSyncTransactions(transactions=" + this.transactions + ")";
        int i2 = IAuthTabCallback + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public ReactInstanceManagerReactContextInitParams(@NotNull List<ReactInstanceManager2ExternalSyntheticLambda0> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.transactions = list;
    }

    public final List<ReactInstanceManager2ExternalSyntheticLambda0> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        List<ReactInstanceManager2ExternalSyntheticLambda0> list = this.transactions;
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        return list;
    }
}
