package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class moveToMarker {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("key")
    private final String key;

    @SerializedName("value")
    private final boolean value;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof moveToMarker)) {
            int i2 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        moveToMarker movetomarker = (moveToMarker) obj;
        if (!Intrinsics.areEqual(this.key, movetomarker.key) || this.value != movetomarker.value) {
            return false;
        }
        int i4 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            this.key.hashCode();
            iHashCode = 0 % Boolean.hashCode(this.value);
        } else {
            iHashCode = (this.key.hashCode() * 31) + Boolean.hashCode(this.value);
        }
        int i3 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 20 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MarketingNotificationsSettingsResponse(key=" + this.key + ", value=" + this.value + ")";
        int i2 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
