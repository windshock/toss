package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RoundedCornersDrawableType {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName(verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_END_DATE)
    private final String endDate;

    @SerializedName("keyword")
    private final String keyword;

    @SerializedName("lastId")
    private final Long lastId;

    @SerializedName(verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_START_DATE)
    private final String startDate;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundedCornersDrawableType)) {
            return false;
        }
        RoundedCornersDrawableType roundedCornersDrawableType = (RoundedCornersDrawableType) obj;
        if (!Intrinsics.areEqual(this.startDate, roundedCornersDrawableType.startDate) || !Intrinsics.areEqual(this.endDate, roundedCornersDrawableType.endDate)) {
            return false;
        }
        Object obj2 = null;
        if (Intrinsics.areEqual(this.keyword, roundedCornersDrawableType.keyword)) {
            if (Intrinsics.areEqual(this.lastId, roundedCornersDrawableType.lastId)) {
                return true;
            }
            int i2 = onExtraCallback + 27;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
        int i3 = onExtraCallbackWithResult + 3;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        boolean z = i3 % 2 != 0;
        int i5 = i4 + 95;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            this.startDate.hashCode();
            this.endDate.hashCode();
            this.keyword.hashCode();
            throw null;
        }
        int iHashCode2 = this.startDate.hashCode();
        int iHashCode3 = this.endDate.hashCode();
        int iHashCode4 = this.keyword.hashCode();
        Long l = this.lastId;
        if (l == null) {
            int i3 = onExtraCallbackWithResult + 17;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardApprovedSalesStatementReq(startDate=" + this.startDate + ", endDate=" + this.endDate + ", keyword=" + this.keyword + ", lastId=" + this.lastId + ")";
        int i2 = onExtraCallbackWithResult + 97;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 12 / 0;
        }
        return str;
    }
}
