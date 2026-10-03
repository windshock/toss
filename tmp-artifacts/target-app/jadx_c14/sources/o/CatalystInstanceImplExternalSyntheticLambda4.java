package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CatalystInstanceImplExternalSyntheticLambda4 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("unifiedId")
    private final long unifiedId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof CatalystInstanceImplExternalSyntheticLambda4) {
                return this.unifiedId == ((CatalystInstanceImplExternalSyntheticLambda4) obj).unifiedId;
            }
            int i2 = onNavigationEvent + 85;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        int i3 = onNavigationEvent + 61;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 41;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.unifiedId);
        int i4 = IAuthTabCallback + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PrepareUnblockSelfieResponse(unifiedId=" + this.unifiedId + ")";
        int i2 = onNavigationEvent + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.unifiedId;
        int i5 = i2 + 43;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
