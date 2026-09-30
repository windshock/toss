package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getRecommendedTimeoutMillis {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("countryCode")
    private final String countryCode;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 7;
            onExtraCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof getRecommendedTimeoutMillis)) {
            return false;
        }
        if (Intrinsics.areEqual(this.countryCode, ((getRecommendedTimeoutMillis) obj).countryCode)) {
            return true;
        }
        int i3 = onExtraCallback + 3;
        onNavigationEvent = i3 % 128;
        return i3 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.countryCode.hashCode();
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CddDone(countryCode=" + this.countryCode + ")";
        int i2 = onExtraCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
