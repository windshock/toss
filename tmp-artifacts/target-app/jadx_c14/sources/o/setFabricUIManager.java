package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setFabricUIManager {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("guestSessionId")
    private final long guestSessionId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setFabricUIManager)) {
            int i2 = onWarmupCompleted + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.guestSessionId == ((setFabricUIManager) obj).guestSessionId) {
            return true;
        }
        int i4 = onNavigationEvent + 81;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return Long.hashCode(this.guestSessionId);
        }
        int i3 = 24 / 0;
        return Long.hashCode(this.guestSessionId);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UssCardGuestRequest(guestSessionId=" + this.guestSessionId + ")";
        int i2 = onWarmupCompleted + 53;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public setFabricUIManager(long j) {
        this.guestSessionId = j;
    }
}
