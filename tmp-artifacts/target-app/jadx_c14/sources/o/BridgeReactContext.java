package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BridgeReactContext {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("status")
    private final PhotoBrowseView status;

    @SerializedName("verifyId")
    private final long verifyId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 21;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BridgeReactContext)) {
            int i5 = i2 + 65;
            int i6 = i5 % 128;
            onNavigationEvent = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 119;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        BridgeReactContext bridgeReactContext = (BridgeReactContext) obj;
        if (this.status != bridgeReactContext.status) {
            int i10 = i4 + 63;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.verifyId == bridgeReactContext.verifyId) {
            return true;
        }
        int i12 = i4 + 43;
        IAuthTabCallback = i12 % 128;
        if (i12 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.status.hashCode() * 31) + Long.hashCode(this.verifyId);
        int i4 = onNavigationEvent + 93;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BankDepositStatusResponse(status=" + this.status + ", verifyId=" + this.verifyId + ")";
        int i2 = IAuthTabCallback + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final PhotoBrowseView onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 111;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        PhotoBrowseView photoBrowseView = this.status;
        int i4 = i2 + 73;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return photoBrowseView;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        long j = this.verifyId;
        int i5 = i3 + 37;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
