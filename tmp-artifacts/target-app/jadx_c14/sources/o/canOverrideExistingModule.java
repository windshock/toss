package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class canOverrideExistingModule {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    @SerializedName("status")
    private final PhotoBrowseView status;

    @SerializedName("txId")
    private final String txId;

    @SerializedName("verifyId")
    private final long verifyId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 43;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof canOverrideExistingModule)) {
            return false;
        }
        canOverrideExistingModule canoverrideexistingmodule = (canOverrideExistingModule) obj;
        if (this.status != canoverrideexistingmodule.status) {
            return false;
        }
        if (this.verifyId != canoverrideexistingmodule.verifyId) {
            int i3 = IAuthTabCallback + 57;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.txId, canoverrideexistingmodule.txId)) {
            return true;
        }
        int i5 = IAuthTabCallback + 41;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.status.hashCode();
        return (i3 == 0 ? ((iHashCode >> 35) >>> Long.hashCode(this.verifyId)) >>> 109 : ((iHashCode * 31) + Long.hashCode(this.verifyId)) * 31) + this.txId.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ArsStatusResponse(status=" + this.status + ", verifyId=" + this.verifyId + ", txId=" + this.txId + ")";
        int i2 = IAuthTabCallback + 105;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final PhotoBrowseView onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 79;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        PhotoBrowseView photoBrowseView = this.status;
        int i5 = i2 + 17;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return photoBrowseView;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        long j = this.verifyId;
        int i5 = i3 + 3;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 119;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.txId;
        int i5 = i2 + 51;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
