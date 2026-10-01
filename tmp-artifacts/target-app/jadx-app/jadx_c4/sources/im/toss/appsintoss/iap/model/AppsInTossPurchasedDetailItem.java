package im.toss.appsintoss.iap.model;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.appsintoss.iap.model.AppsInTossPurchasedDetailItem$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppsInTossPurchasedDetailItem {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String amount;
    private final String appName;
    private final String contactEmail;
    private final String deploymentId;
    private final String displayOrderId;
    private final String expiresAt;
    private final String miniAppTitle;
    private final String nextPaymentDate;
    private final String orderId;
    private final String productName;
    private final String purchasedTxDate;
    private final String refundRejectReason;
    private final String refundedTxDate;
    private final String sku;
    private final String status;
    private final String subscriptionFee;
    private final String subscriptionPeriodEnd;
    private final String subscriptionPeriodStart;
    private final String type;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onExtraCallbackWithResult + 49;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~((~i3) | i5);
        int i8 = ~((~i) | i5);
        int i9 = i7 | i8;
        int i10 = i8 | (~((~i5) | i3)) | i7;
        int i11 = i5 + i3 + i4 + ((-1814252664) * i2) + (2073254503 * i6);
        int i12 = i11 * i11;
        int i13 = ((-223937157) * i5) + 1943797760 + (1745420935 * i3) + (i9 * 1162804602) + (1162804602 * i7) + ((-1162804602) * i10) + ((-1386741760) * i4) + ((-1631584256) * i2) + ((-1368915968) * i6) + ((-1053032448) * i12);
        int i14 = (i5 * (-1919122223)) + 1408767311 + (i3 * (-1919121035)) + (i9 * (-594)) + (i7 * (-594)) + (i10 * 594) + (i4 * (-1919121629)) + (i2 * (-390511720)) + (i6 * 1804971285) + (i12 * 255066112);
        int i15 = i13 + (i14 * i14 * 379846656);
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? IAuthTabCallback(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsInTossPurchasedDetailItem)) {
            int i2 = IAuthTabCallback + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        AppsInTossPurchasedDetailItem appsInTossPurchasedDetailItem = (AppsInTossPurchasedDetailItem) obj;
        if ((!Intrinsics.areEqual(this.type, appsInTossPurchasedDetailItem.type)) || !Intrinsics.areEqual(this.displayOrderId, appsInTossPurchasedDetailItem.displayOrderId) || !Intrinsics.areEqual(this.orderId, appsInTossPurchasedDetailItem.orderId) || !Intrinsics.areEqual(this.miniAppTitle, appsInTossPurchasedDetailItem.miniAppTitle) || !Intrinsics.areEqual(this.status, appsInTossPurchasedDetailItem.status)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.productName, appsInTossPurchasedDetailItem.productName)) {
            int i4 = IAuthTabCallback + 125;
            onWarmupCompleted = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.amount, appsInTossPurchasedDetailItem.amount)) {
            int i5 = onWarmupCompleted + 7;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.purchasedTxDate, appsInTossPurchasedDetailItem.purchasedTxDate) || !Intrinsics.areEqual(this.refundedTxDate, appsInTossPurchasedDetailItem.refundedTxDate) || !Intrinsics.areEqual(this.refundRejectReason, appsInTossPurchasedDetailItem.refundRejectReason) || !Intrinsics.areEqual(this.contactEmail, appsInTossPurchasedDetailItem.contactEmail)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.subscriptionFee, appsInTossPurchasedDetailItem.subscriptionFee)) {
            int i7 = onWarmupCompleted + 79;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.subscriptionPeriodStart, appsInTossPurchasedDetailItem.subscriptionPeriodStart) || !Intrinsics.areEqual(this.subscriptionPeriodEnd, appsInTossPurchasedDetailItem.subscriptionPeriodEnd)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.nextPaymentDate, appsInTossPurchasedDetailItem.nextPaymentDate)) {
            int i9 = onWarmupCompleted + 113;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.appName, appsInTossPurchasedDetailItem.appName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.deploymentId, appsInTossPurchasedDetailItem.deploymentId)) {
            int i11 = IAuthTabCallback + 113;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.sku, appsInTossPurchasedDetailItem.sku)) {
            int i13 = IAuthTabCallback + 41;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.expiresAt, appsInTossPurchasedDetailItem.expiresAt)) {
            return false;
        }
        int i15 = IAuthTabCallback + 29;
        onWarmupCompleted = i15 % 128;
        if (i15 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i;
        int iHashCode3;
        int i2;
        int iHashCode4;
        int i3;
        int i4;
        int i5 = 2 % 2;
        String str = this.type;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.displayOrderId.hashCode();
        int iHashCode7 = this.orderId.hashCode();
        int iHashCode8 = this.miniAppTitle.hashCode();
        int iHashCode9 = this.status.hashCode();
        int iHashCode10 = this.productName.hashCode();
        int iHashCode11 = this.amount.hashCode();
        int iHashCode12 = this.purchasedTxDate.hashCode();
        String str2 = this.refundedTxDate;
        int iHashCode13 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.refundRejectReason;
        if (str3 == null) {
            int i6 = IAuthTabCallback + 79;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
        }
        int iHashCode14 = this.contactEmail.hashCode();
        String str4 = this.subscriptionFee;
        if (str4 == null) {
            int i8 = IAuthTabCallback + 21;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.subscriptionPeriodStart;
        int iHashCode15 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.subscriptionPeriodEnd;
        if (str6 == null) {
            int i10 = IAuthTabCallback + 37;
            i = iHashCode15;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            iHashCode3 = 0;
        } else {
            i = iHashCode15;
            iHashCode3 = str6.hashCode();
        }
        String str7 = this.nextPaymentDate;
        if (str7 == null) {
            int i12 = IAuthTabCallback + 109;
            i2 = iHashCode3;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            iHashCode4 = 0;
        } else {
            i2 = iHashCode3;
            iHashCode4 = str7.hashCode();
        }
        String str8 = this.appName;
        int iHashCode16 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.deploymentId;
        int iHashCode17 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.sku;
        if (str10 == null) {
            i3 = iHashCode16;
            i4 = 0;
        } else {
            int iHashCode18 = str10.hashCode();
            int i14 = onWarmupCompleted + 63;
            i3 = iHashCode16;
            IAuthTabCallback = i14 % 128;
            int i15 = i14 % 2;
            i4 = iHashCode18;
        }
        String str11 = this.expiresAt;
        return (((((((((((((((((((((((((((((((((((iHashCode5 * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode) * 31) + iHashCode14) * 31) + iHashCode2) * 31) + i) * 31) + i2) * 31) + iHashCode4) * 31) + i3) * 31) + iHashCode17) * 31) + i4) * 31) + (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppsInTossPurchasedDetailItem(type=" + this.type + ", displayOrderId=" + this.displayOrderId + ", orderId=" + this.orderId + ", miniAppTitle=" + this.miniAppTitle + ", status=" + this.status + ", productName=" + this.productName + ", amount=" + this.amount + ", purchasedTxDate=" + this.purchasedTxDate + ", refundedTxDate=" + this.refundedTxDate + ", refundRejectReason=" + this.refundRejectReason + ", contactEmail=" + this.contactEmail + ", subscriptionFee=" + this.subscriptionFee + ", subscriptionPeriodStart=" + this.subscriptionPeriodStart + ", subscriptionPeriodEnd=" + this.subscriptionPeriodEnd + ", nextPaymentDate=" + this.nextPaymentDate + ", appName=" + this.appName + ", deploymentId=" + this.deploymentId + ", sku=" + this.sku + ", expiresAt=" + this.expiresAt + ")";
        int i2 = onWarmupCompleted + 17;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppsInTossPurchasedDetailItem> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AppsInTossPurchasedDetailItem$.serializer serializerVar = AppsInTossPurchasedDetailItem$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 85;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ AppsInTossPurchasedDetailItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, okycx okycxVar) {
        if (1022 != (i & 1022)) {
            htf31.onExtraCallbackWithResult(i, 1022, AppsInTossPurchasedDetailItem$.serializer.INSTANCE.getDescriptor());
        }
        Object obj = null;
        if ((i & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        this.displayOrderId = str2;
        this.orderId = str3;
        this.miniAppTitle = str4;
        this.status = str5;
        this.productName = str6;
        this.amount = str7;
        this.purchasedTxDate = str8;
        this.refundedTxDate = str9;
        this.refundRejectReason = str10;
        if ((i & 1024) == 0) {
            this.contactEmail = "";
            int i2 = 2 % 2;
        } else {
            this.contactEmail = str11;
        }
        if ((i & 2048) == 0) {
            int i3 = IAuthTabCallback + 37;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            this.subscriptionFee = null;
            if (i4 != 0) {
                int i5 = 64 / 0;
            }
        } else {
            this.subscriptionFee = str12;
        }
        if ((i & 4096) == 0) {
            int i6 = onWarmupCompleted + 101;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            this.subscriptionPeriodStart = null;
            if (i7 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.subscriptionPeriodStart = str13;
            int i8 = onWarmupCompleted + 45;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        }
        if ((i & 8192) == 0) {
            int i11 = onWarmupCompleted + 69;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            this.subscriptionPeriodEnd = null;
            if (i12 == 0) {
                throw null;
            }
        } else {
            this.subscriptionPeriodEnd = str14;
        }
        if ((i & 16384) == 0) {
            this.nextPaymentDate = null;
        } else {
            this.nextPaymentDate = str15;
        }
        if ((32768 & i) == 0) {
            this.appName = null;
        } else {
            this.appName = str16;
            int i13 = 2 % 2;
        }
        if ((65536 & i) == 0) {
            this.deploymentId = null;
        } else {
            this.deploymentId = str17;
        }
        if ((131072 & i) == 0) {
            int i14 = IAuthTabCallback + 15;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
            this.sku = null;
        } else {
            this.sku = str18;
        }
        if ((i & 262144) != 0) {
            this.expiresAt = str19;
            return;
        }
        this.expiresAt = null;
        int i16 = IAuthTabCallback + 9;
        onWarmupCompleted = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AppsInTossPurchasedDetailItem appsInTossPurchasedDetailItem = (AppsInTossPurchasedDetailItem) objArr[0];
        vyl vylVar = (vyl) objArr[1];
        SerialDescriptor serialDescriptor = (SerialDescriptor) objArr[2];
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || appsInTossPurchasedDetailItem.type != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, appsInTossPurchasedDetailItem.type);
        }
        vylVar.onExtraCallback(serialDescriptor, 1, appsInTossPurchasedDetailItem.displayOrderId);
        vylVar.onExtraCallback(serialDescriptor, 2, appsInTossPurchasedDetailItem.orderId);
        vylVar.onExtraCallback(serialDescriptor, 3, appsInTossPurchasedDetailItem.miniAppTitle);
        vylVar.onExtraCallback(serialDescriptor, 4, appsInTossPurchasedDetailItem.status);
        vylVar.onExtraCallback(serialDescriptor, 5, appsInTossPurchasedDetailItem.productName);
        vylVar.onExtraCallback(serialDescriptor, 6, appsInTossPurchasedDetailItem.amount);
        vylVar.onExtraCallback(serialDescriptor, 7, appsInTossPurchasedDetailItem.purchasedTxDate);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 8, getwrigglelayout, appsInTossPurchasedDetailItem.refundedTxDate);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 9, getwrigglelayout, appsInTossPurchasedDetailItem.refundRejectReason);
        if (vylVar.onWarmupCompleted(serialDescriptor, 10) || !Intrinsics.areEqual(appsInTossPurchasedDetailItem.contactEmail, "")) {
            vylVar.onExtraCallback(serialDescriptor, 10, appsInTossPurchasedDetailItem.contactEmail);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 11) || appsInTossPurchasedDetailItem.subscriptionFee != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 11, getwrigglelayout, appsInTossPurchasedDetailItem.subscriptionFee);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 12)) {
            int i2 = IAuthTabCallback + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (appsInTossPurchasedDetailItem.subscriptionPeriodStart != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 12, getwrigglelayout, appsInTossPurchasedDetailItem.subscriptionPeriodStart);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 13) || appsInTossPurchasedDetailItem.subscriptionPeriodEnd != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 13, getwrigglelayout, appsInTossPurchasedDetailItem.subscriptionPeriodEnd);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 14)) {
            int i4 = IAuthTabCallback + 47;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 17 / 0;
                if (appsInTossPurchasedDetailItem.nextPaymentDate != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 14, getwrigglelayout, appsInTossPurchasedDetailItem.nextPaymentDate);
                }
            } else if (appsInTossPurchasedDetailItem.nextPaymentDate != null) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 15)) {
            int i6 = onWarmupCompleted + 25;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            if (appsInTossPurchasedDetailItem.appName != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 15, getwrigglelayout, appsInTossPurchasedDetailItem.appName);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 16)) {
            int i8 = IAuthTabCallback + 33;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                String str = appsInTossPurchasedDetailItem.deploymentId;
                throw null;
            }
            if (appsInTossPurchasedDetailItem.deploymentId != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 16, getwrigglelayout, appsInTossPurchasedDetailItem.deploymentId);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 17) || appsInTossPurchasedDetailItem.sku != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 17, getwrigglelayout, appsInTossPurchasedDetailItem.sku);
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 18)) || appsInTossPurchasedDetailItem.expiresAt != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 18, getwrigglelayout, appsInTossPurchasedDetailItem.expiresAt);
            int i9 = IAuthTabCallback + 85;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
        }
        return null;
    }

    public final String extraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 35;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 111;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.displayOrderId;
        int i5 = i3 + 71;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.orderId;
        int i5 = i3 + 33;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 97;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.miniAppTitle;
        int i5 = i2 + 77;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AppsInTossPurchasedDetailItem appsInTossPurchasedDetailItem = (AppsInTossPurchasedDetailItem) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = appsInTossPurchasedDetailItem.status;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 17;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 3;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productName;
        int i5 = i2 + 39;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 15;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.purchasedTxDate;
        int i5 = i3 + 93;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackStubProxy() {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 11;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.refundedTxDate;
            int i4 = 43 / 0;
        } else {
            str = this.refundedTxDate;
        }
        int i5 = i2 + 41;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 75;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.refundRejectReason;
        int i5 = i2 + 55;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.contactEmail;
        int i4 = i3 + 95;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AppsInTossPurchasedDetailItem appsInTossPurchasedDetailItem = (AppsInTossPurchasedDetailItem) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = appsInTossPurchasedDetailItem.subscriptionFee;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 119;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String writeTypedObject() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.subscriptionPeriodStart;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AppsInTossPurchasedDetailItem appsInTossPurchasedDetailItem = (AppsInTossPurchasedDetailItem) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = appsInTossPurchasedDetailItem.subscriptionPeriodEnd;
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        return str;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 91;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.nextPaymentDate;
        int i5 = i2 + 125;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.appName;
        int i5 = i3 + 125;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.deploymentId;
        int i5 = i3 + 35;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback_Parcel() {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 1;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.sku;
            int i4 = 73 / 0;
        } else {
            str = this.sku;
        }
        int i5 = i2 + 51;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return str;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.expiresAt;
        int i5 = i3 + 95;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(AppsInTossPurchasedDetailItem appsInTossPurchasedDetailItem, vyl vylVar, SerialDescriptor serialDescriptor) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        onExtraCallbackWithResult(iOnExtraCallback, C40Encoder.onExtraCallback(), 1101380678, iOnExtraCallback2, new Object[]{appsInTossPurchasedDetailItem, vylVar, serialDescriptor}, -1101380675, C40Encoder.onExtraCallback());
    }

    public final String access100() {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (String) onExtraCallbackWithResult(iOnExtraCallback, C40Encoder.onExtraCallback(), -1510801612, iOnExtraCallback2, new Object[]{this}, 1510801614, C40Encoder.onExtraCallback());
    }

    public final String readTypedObject() {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (String) onExtraCallbackWithResult(iOnExtraCallback, C40Encoder.onExtraCallback(), -1109341534, iOnExtraCallback2, new Object[]{this}, 1109341534, C40Encoder.onExtraCallback());
    }

    public final String ICustomTabsCallback() {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (String) onExtraCallbackWithResult(iOnExtraCallback, C40Encoder.onExtraCallback(), -2036189333, iOnExtraCallback2, new Object[]{this}, 2036189334, C40Encoder.onExtraCallback());
    }
}
