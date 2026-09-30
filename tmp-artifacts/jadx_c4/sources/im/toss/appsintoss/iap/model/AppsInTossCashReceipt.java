package im.toss.appsintoss.iap.model;

import im.toss.appsintoss.iap.model.AppsInTossCashReceipt$;
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
public final class AppsInTossCashReceipt {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final int amount;
    private final String approvalNumber;
    private final String businessName;
    private final String businessRegistrationNumber;
    private final String displayAmount;
    private final String issuedAt;
    private final String itemName;
    private final String paidAt;

    static {
        int i = onExtraCallback + 95;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsInTossCashReceipt)) {
            int i2 = onNavigationEvent + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        AppsInTossCashReceipt appsInTossCashReceipt = (AppsInTossCashReceipt) obj;
        if (!Intrinsics.areEqual(this.itemName, appsInTossCashReceipt.itemName) || this.amount != appsInTossCashReceipt.amount || !Intrinsics.areEqual(this.displayAmount, appsInTossCashReceipt.displayAmount)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.paidAt, appsInTossCashReceipt.paidAt)) {
            int i4 = onNavigationEvent + 13;
            onWarmupCompleted = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.issuedAt, appsInTossCashReceipt.issuedAt)) {
            int i5 = onNavigationEvent + 7;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.approvalNumber, appsInTossCashReceipt.approvalNumber)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.businessName, appsInTossCashReceipt.businessName)) {
            int i7 = onWarmupCompleted + 29;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.businessRegistrationNumber, appsInTossCashReceipt.businessRegistrationNumber)) {
            return true;
        }
        int i9 = onWarmupCompleted + 33;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.itemName.hashCode();
        int iHashCode4 = Integer.hashCode(this.amount);
        String str = this.displayAmount;
        int iHashCode5 = 0;
        if (str == null) {
            int i2 = onWarmupCompleted + 97;
            onNavigationEvent = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.paidAt;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.issuedAt;
        if (str3 == null) {
            int i3 = onNavigationEvent + 99;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.approvalNumber;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.businessName;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.businessRegistrationNumber;
        if (str6 != null) {
            int i5 = onNavigationEvent + 121;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            iHashCode5 = str6.hashCode();
        }
        int i7 = (((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode5;
        int i8 = onWarmupCompleted + 15;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            return i7;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppsInTossCashReceipt(itemName=" + this.itemName + ", amount=" + this.amount + ", displayAmount=" + this.displayAmount + ", paidAt=" + this.paidAt + ", issuedAt=" + this.issuedAt + ", approvalNumber=" + this.approvalNumber + ", businessName=" + this.businessName + ", businessRegistrationNumber=" + this.businessRegistrationNumber + ")";
        int i2 = onNavigationEvent + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppsInTossCashReceipt> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AppsInTossCashReceipt$.serializer serializerVar = AppsInTossCashReceipt$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 17;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ AppsInTossCashReceipt(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i3 = 255;
        if (255 != (i & 255)) {
            int i4 = onNavigationEvent + 83;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                descriptor = AppsInTossCashReceipt$.serializer.INSTANCE.getDescriptor();
                i3 = 11902;
            } else {
                descriptor = AppsInTossCashReceipt$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i3, descriptor);
            int i5 = 2 % 2;
        }
        this.itemName = str;
        this.amount = i2;
        this.displayAmount = str2;
        this.paidAt = str3;
        this.issuedAt = str4;
        this.approvalNumber = str5;
        this.businessName = str6;
        this.businessRegistrationNumber = str7;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(AppsInTossCashReceipt appsInTossCashReceipt, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, appsInTossCashReceipt.itemName);
        vylVar.onExtraCallback(serialDescriptor, 1, appsInTossCashReceipt.amount);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, appsInTossCashReceipt.displayAmount);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, appsInTossCashReceipt.paidAt);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, appsInTossCashReceipt.issuedAt);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, appsInTossCashReceipt.approvalNumber);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, appsInTossCashReceipt.businessName);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, appsInTossCashReceipt.businessRegistrationNumber);
        int i4 = onNavigationEvent + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 67;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.itemName;
        int i5 = i2 + 55;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onExtraCallbackWithResult() {
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 55;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 != 0) {
            i = this.amount;
            int i5 = 49 / 0;
        } else {
            i = this.amount;
        }
        int i6 = i4 + 23;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.displayAmount;
        int i5 = i3 + 83;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 91;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.paidAt;
        int i5 = i2 + 119;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.issuedAt;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 29;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.approvalNumber;
            int i4 = 86 / 0;
        } else {
            str = this.approvalNumber;
        }
        int i5 = i2 + 99;
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
        int i2 = onWarmupCompleted + 27;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.businessName;
        int i5 = i3 + 35;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 55 / 0;
        }
        return str;
    }

    public final String onExtraCallback() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 17;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.businessRegistrationNumber;
            int i4 = 59 / 0;
        } else {
            str = this.businessRegistrationNumber;
        }
        int i5 = i2 + 37;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
