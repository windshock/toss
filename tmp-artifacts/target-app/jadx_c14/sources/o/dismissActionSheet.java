package o;

import com.google.gson.annotations.SerializedName;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class dismissActionSheet {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("maxInputAmount")
    private final int maxInputAmount;

    @SerializedName("nextFee")
    private final int nextFee;

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 91;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.maxInputAmount;
        int i6 = i2 + 63;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = this.nextFee;
        int i6 = i3 + 45;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 17 / 0;
        }
        return i5;
    }
}
