package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RoundedNinePatchDrawable {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    @SerializedName(verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_URL)
    private final String url;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof RoundedNinePatchDrawable)) {
            return false;
        }
        if (Intrinsics.areEqual(this.url, ((RoundedNinePatchDrawable) obj).url)) {
            return true;
        }
        int i4 = onExtraCallback + 1;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.url.hashCode();
        int i4 = onExtraCallback + 65;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardSalesStatement(url=" + this.url + ")";
        int i2 = onWarmupCompleted + 73;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
