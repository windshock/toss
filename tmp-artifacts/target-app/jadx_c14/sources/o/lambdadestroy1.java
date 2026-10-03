package o;

import kotlin.Deprecated;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class lambdadestroy1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final long guestSessionId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 25;
            onNavigationEvent = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof lambdadestroy1)) {
            return false;
        }
        if (this.guestSessionId == ((lambdadestroy1) obj).guestSessionId) {
            return true;
        }
        int i3 = onNavigationEvent + 27;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.guestSessionId);
        int i4 = onNavigationEvent + 61;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuestUnderFourteenSessionIdRequest(guestSessionId=" + this.guestSessionId + ")";
        int i2 = onExtraCallback + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public lambdadestroy1(long j) {
        this.guestSessionId = j;
    }
}
