package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class InterstitialAdApi {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("before")
    private final boolean before;

    @SerializedName("cardCode")
    private final int cardCode;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 73;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterstitialAdApi)) {
            int i5 = i2 + 69;
            onExtraCallbackWithResult = i5 % 128;
            return i5 % 2 != 0;
        }
        InterstitialAdApi interstitialAdApi = (InterstitialAdApi) obj;
        if (this.cardCode != interstitialAdApi.cardCode) {
            int i6 = i4 + 27;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 37 / 0;
            }
            return false;
        }
        if (this.before == interstitialAdApi.before) {
            return true;
        }
        int i8 = i4 + 25;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Integer.hashCode(this.cardCode) * 31) + Boolean.hashCode(this.before);
        int i4 = onExtraCallbackWithResult + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardNotificationUnsubscribeInfoReq(cardCode=" + this.cardCode + ", before=" + this.before + ")";
        int i2 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public InterstitialAdApi(int i, boolean z) {
        this.cardCode = i;
        this.before = z;
    }
}
