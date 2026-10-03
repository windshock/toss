package o;

import com.google.gson.annotations.SerializedName;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setAccessibilityContentSizeMultipliers {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("leftMonthlyAmount")
    private final int leftMonthlyAmount;

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 81;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.leftMonthlyAmount;
        int i6 = i2 + 125;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
