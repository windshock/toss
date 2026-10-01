package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class jniCallJSFunction {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("guestId")
    private final long guestId;

    @SerializedName("unifiedId")
    private final long unifiedId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 91;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof jniCallJSFunction)) {
            return false;
        }
        jniCallJSFunction jnicalljsfunction = (jniCallJSFunction) obj;
        if (this.guestId != jnicalljsfunction.guestId) {
            int i3 = onWarmupCompleted + 83;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.unifiedId != jnicalljsfunction.unifiedId) {
            int i5 = onWarmupCompleted + 13;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = onNavigationEvent + 85;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        long j;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            iHashCode = Long.hashCode(this.guestId) >> 14;
            j = this.unifiedId;
        } else {
            iHashCode = Long.hashCode(this.guestId) * 31;
            j = this.unifiedId;
        }
        return iHashCode + Long.hashCode(j);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuestPrepareUnblockRequest(guestId=" + this.guestId + ", unifiedId=" + this.unifiedId + ")";
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 13 / 0;
        }
        return str;
    }
}
