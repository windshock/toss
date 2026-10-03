package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeAdViewType {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    @SerializedName("accounts")
    private final List<NativeAdOptionsViewPosition> accounts;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeAdViewType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.accounts, ((NativeAdViewType) obj).accounts)) {
            int i4 = onExtraCallback + 65;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = onExtraCallback + 21;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.accounts.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.accounts.hashCode();
        int i3 = onWarmupCompleted + 63;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CheckAvailableCancelWithdrawAgreementReq(accounts=" + this.accounts + ")";
        int i2 = onExtraCallback + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public NativeAdViewType(@NotNull List<NativeAdOptionsViewPosition> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.accounts = list;
    }
}
