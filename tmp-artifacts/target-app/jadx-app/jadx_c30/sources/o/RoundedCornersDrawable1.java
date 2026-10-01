package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RoundedCornersDrawable1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("approveIdList")
    private final List<Long> approveIdList;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 31;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (this != obj) {
            return (obj instanceof RoundedCornersDrawable1) && Intrinsics.areEqual(this.approveIdList, ((RoundedCornersDrawable1) obj).approveIdList);
        }
        int i5 = i2 + 93;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.approveIdList.hashCode();
        int i4 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardSalesStatementReq(approveIdList=" + this.approveIdList + ")";
        int i2 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 83 / 0;
        }
        return str;
    }
}
