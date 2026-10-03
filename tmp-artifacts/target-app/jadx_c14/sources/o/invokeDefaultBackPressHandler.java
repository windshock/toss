package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class invokeDefaultBackPressHandler {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("trxId")
    private final String trxId;

    @SerializedName("waitRequest")
    private final boolean waitRequest;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof invokeDefaultBackPressHandler)) {
            return false;
        }
        invokeDefaultBackPressHandler invokedefaultbackpresshandler = (invokeDefaultBackPressHandler) obj;
        if (Intrinsics.areEqual(this.trxId, invokedefaultbackpresshandler.trxId)) {
            return this.waitRequest == invokedefaultbackpresshandler.waitRequest;
        }
        int i3 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.trxId;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.waitRequest);
        int i4 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DocumentWalletJoinReq(trxId=" + this.trxId + ", waitRequest=" + this.waitRequest + ")";
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public invokeDefaultBackPressHandler(@Nullable String str, boolean z) {
        this.trxId = str;
        this.waitRequest = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ invokeDefaultBackPressHandler(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onExtraCallbackWithResult + 7;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            z = i2 % 2 == 0;
            int i4 = i3 + 65;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this(str, z);
    }
}
