package o;

import com.google.gson.annotations.SerializedName;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class showShareActionSheetWithOptions {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    @SerializedName("currentTotalBalanceAmount")
    private final int currentTotalBalanceAmount;

    @SerializedName("maxBalancePossessionAmount")
    private final int maxBalancePossessionAmount;

    @SerializedName("policyPossessionAmount")
    private final int policyPossessionAmount;

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 55;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.currentTotalBalanceAmount;
        int i5 = i2 + 117;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 97;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.policyPossessionAmount;
        int i6 = i2 + 21;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = this.maxBalancePossessionAmount;
        int i6 = i3 + 107;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 82 / 0;
        }
        return i5;
    }
}
