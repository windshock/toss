package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o._string;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RootDrawable {
    private static int IAuthTabCallback = 1;
    private static final IdGeneratorExternalSyntheticLambda1 SERVER_TIME_FORMAT;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    @SerializedName("amount")
    private final long amount;

    @SerializedName("approveTs")
    private final String approveTs;

    @SerializedName(verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_ID)
    private final long id;

    @SerializedName("storeAddr")
    private final String storeAddr;

    @SerializedName("storeName")
    private final String storeName;

    @SerializedName("storeTelNo")
    private final String storeTelNo;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static final IdGeneratorExternalSyntheticLambda1 APPROVED_TIME_FORMAT = IdGeneratorExternalSyntheticLambda1.Companion.onExtraCallback("yyyy.MM.dd | HH:mm");

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 7;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof RootDrawable)) {
            return false;
        }
        RootDrawable rootDrawable = (RootDrawable) obj;
        if (this.amount != rootDrawable.amount) {
            int i4 = onExtraCallback + 125;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.approveTs, rootDrawable.approveTs))) {
            return this.id == rootDrawable.id && Intrinsics.areEqual(this.storeName, rootDrawable.storeName) && Intrinsics.areEqual(this.storeTelNo, rootDrawable.storeTelNo) && Intrinsics.areEqual(this.storeAddr, rootDrawable.storeAddr);
        }
        int i6 = onExtraCallback + 57;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Long.hashCode(this.amount);
        int iHashCode3 = this.approveTs.hashCode();
        int iHashCode4 = Long.hashCode(this.id);
        int iHashCode5 = this.storeName.hashCode();
        String str = this.storeTelNo;
        if (str == null) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 85;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 37;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.storeAddr;
        return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardApprovedSalesStatement(amount=" + this.amount + ", approveTs=" + this.approveTs + ", id=" + this.id + ", storeName=" + this.storeName + ", storeTelNo=" + this.storeTelNo + ", storeAddr=" + this.storeAddr + ")";
        int i2 = onExtraCallback + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 17 / 0;
        }
        return str;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    static {
        Object[] objArr = {CommonModule_closeView.onWarmupCompleted};
        SERVER_TIME_FORMAT = (IdGeneratorExternalSyntheticLambda1) CommonModule_closeView.onExtraCallbackWithResult(1967451170, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1967451168, _string.onNavigationEvent.IAuthTabCallback(), objArr, _string.onNavigationEvent.IAuthTabCallback());
        int i = IAuthTabCallback + 99;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 17 / 0;
        }
    }
}
