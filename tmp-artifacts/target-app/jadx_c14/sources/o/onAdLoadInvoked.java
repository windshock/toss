package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class onAdLoadInvoked {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("cardCode")
    private final int cardCode;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 113;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onAdLoadInvoked)) {
            return false;
        }
        if (this.cardCode != ((onAdLoadInvoked) obj).cardCode) {
            int i5 = i4 + 45;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i2 + 15;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.cardCode);
        int i4 = onExtraCallback + 35;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardNotificationSubscriptionsByVendorReq(cardCode=" + this.cardCode + ")";
        int i2 = onNavigationEvent + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public onAdLoadInvoked(int i) {
        this.cardCode = i;
    }
}
