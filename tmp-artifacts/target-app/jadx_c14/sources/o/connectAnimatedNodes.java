package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class connectAnimatedNodes {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("address")
    private final String address;

    @SerializedName("addressDetail")
    private final String addressDetail;

    @SerializedName("zipCode")
    private final String zipCode;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof connectAnimatedNodes)) {
            return false;
        }
        connectAnimatedNodes connectanimatednodes = (connectAnimatedNodes) obj;
        if (!Intrinsics.areEqual(this.address, connectanimatednodes.address)) {
            int i4 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (Intrinsics.areEqual(this.addressDetail, connectanimatednodes.addressDetail)) {
            return Intrinsics.areEqual(this.zipCode, connectanimatednodes.zipCode);
        }
        int i5 = IAuthTabCallback;
        int i6 = i5 + 63;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 13;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.address.hashCode() * 31) + this.addressDetail.hashCode()) * 31) + this.zipCode.hashCode();
        int i4 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CvsDeliveryAddress(address=" + this.address + ", addressDetail=" + this.addressDetail + ", zipCode=" + this.zipCode + ")";
        int i2 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public connectAnimatedNodes(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.address = str;
        this.addressDetail = str2;
        this.zipCode = str3;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 17;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.address;
        int i5 = i2 + 117;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 41;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.addressDetail;
        int i5 = i2 + 67;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            str = this.zipCode;
            int i4 = 9 / 0;
        } else {
            str = this.zipCode;
        }
        int i5 = i3 + 41;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
