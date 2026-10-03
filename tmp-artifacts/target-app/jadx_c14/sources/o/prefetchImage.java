package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class prefetchImage {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("groupedHenemBoxes")
    private final List<swapLeftAndRightInRTL> fangirlSavingBoxes;

    @SerializedName("henemBoxes")
    private final List<swapLeftAndRightInRTL> henemBoxes;

    @SerializedName("totalAmount")
    private final long totalAmount;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof prefetchImage)) {
            return false;
        }
        prefetchImage prefetchimage = (prefetchImage) obj;
        if (!Intrinsics.areEqual(this.fangirlSavingBoxes, prefetchimage.fangirlSavingBoxes)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.henemBoxes, prefetchimage.henemBoxes)) {
            int i4 = onWarmupCompleted + 45;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.totalAmount == prefetchimage.totalAmount) {
            return true;
        }
        int i6 = onExtraCallback + 73;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.fangirlSavingBoxes.hashCode();
        return i3 != 0 ? (((iHashCode >>> 69) + this.henemBoxes.hashCode()) / 71) >> Long.hashCode(this.totalAmount) : (((iHashCode * 31) + this.henemBoxes.hashCode()) * 31) + Long.hashCode(this.totalAmount);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HenemBoxListResponse(fangirlSavingBoxes=" + this.fangirlSavingBoxes + ", henemBoxes=" + this.henemBoxes + ", totalAmount=" + this.totalAmount + ")";
        int i2 = onWarmupCompleted + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final List<swapLeftAndRightInRTL> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        List<swapLeftAndRightInRTL> list = this.fangirlSavingBoxes;
        int i5 = i3 + 77;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final List<swapLeftAndRightInRTL> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 17;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        List<swapLeftAndRightInRTL> list = this.henemBoxes;
        int i5 = i2 + 113;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final long onExtraCallbackWithResult() {
        long j;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 105;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            j = this.totalAmount;
            int i4 = 47 / 0;
        } else {
            j = this.totalAmount;
        }
        int i5 = i2 + 79;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
