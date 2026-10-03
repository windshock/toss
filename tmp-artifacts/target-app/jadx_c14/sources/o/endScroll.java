package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class endScroll {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("transactions")
    private final List<NativeHeadlessJsTaskSupportSpec> transactions;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            return (obj instanceof endScroll) && Intrinsics.areEqual(this.transactions, ((endScroll) obj).transactions);
        }
        int i5 = i3 + 5;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            this.transactions.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.transactions.hashCode();
        int i3 = onNavigationEvent + 27;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 35 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FangirlSavingBoxTransactionResponse(transactions=" + this.transactions + ")";
        int i2 = onNavigationEvent + 87;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<NativeHeadlessJsTaskSupportSpec> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        List<NativeHeadlessJsTaskSupportSpec> list = this.transactions;
        int i5 = i3 + 45;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
        return list;
    }
}
