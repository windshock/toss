package im.toss.features.credit.data.response.membership;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.oty1;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditPlusRefundResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String paymentMethodDescription;
    private final String paymentMethodTitle;
    private final Long refundedAmount;

    static {
        int i = onExtraCallbackWithResult + 57;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 36 / 0;
        }
    }

    public CreditPlusRefundResponse() {
        this((Long) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof CreditPlusRefundResponse)) {
            int i4 = onWarmupCompleted + 87;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 24 / 0;
            }
            return false;
        }
        CreditPlusRefundResponse creditPlusRefundResponse = (CreditPlusRefundResponse) obj;
        if (!Intrinsics.areEqual(this.refundedAmount, creditPlusRefundResponse.refundedAmount) || !Intrinsics.areEqual(this.paymentMethodTitle, creditPlusRefundResponse.paymentMethodTitle)) {
            return false;
        }
        if (Intrinsics.areEqual(this.paymentMethodDescription, creditPlusRefundResponse.paymentMethodDescription)) {
            return true;
        }
        int i6 = onWarmupCompleted + 51;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        Long l = this.refundedAmount;
        int iHashCode2 = 0;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        String str = this.paymentMethodTitle;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = onWarmupCompleted + 85;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        String str2 = this.paymentMethodDescription;
        if (str2 != null) {
            int i4 = onWarmupCompleted + 117;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                str2.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode2 = str2.hashCode();
            int i5 = onWarmupCompleted + 99;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 % 3;
            }
        }
        return (((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditPlusRefundResponse(refundedAmount=" + this.refundedAmount + ", paymentMethodTitle=" + this.paymentMethodTitle + ", paymentMethodDescription=" + this.paymentMethodDescription + ")";
        int i2 = onWarmupCompleted + 99;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ CreditPlusRefundResponse(int i, Long l, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.refundedAmount = null;
        } else {
            this.refundedAmount = l;
            int i2 = onWarmupCompleted + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 2) == 0) {
            int i5 = onWarmupCompleted + 97;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            this.paymentMethodTitle = null;
        } else {
            this.paymentMethodTitle = str;
            int i7 = onWarmupCompleted + 99;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
        }
        if ((i & 4) == 0) {
            this.paymentMethodDescription = null;
        } else {
            this.paymentMethodDescription = str2;
        }
    }

    public CreditPlusRefundResponse(@Nullable Long l, @Nullable String str, @Nullable String str2) {
        this.refundedAmount = l;
        this.paymentMethodTitle = str;
        this.paymentMethodDescription = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(CreditPlusRefundResponse creditPlusRefundResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || creditPlusRefundResponse.refundedAmount != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, creditPlusRefundResponse.refundedAmount);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || creditPlusRefundResponse.paymentMethodTitle != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, creditPlusRefundResponse.paymentMethodTitle);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i2 = onWarmupCompleted + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (creditPlusRefundResponse.paymentMethodDescription == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, creditPlusRefundResponse.paymentMethodDescription);
        int i4 = onWarmupCompleted + 93;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreditPlusRefundResponse(Long l, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            l = null;
        }
        if ((i & 2) != 0) {
            int i4 = IAuthTabCallback + 13;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str = null;
        }
        if ((i & 4) != 0) {
            int i7 = 2 % 2;
            str2 = null;
        }
        this(l, str, str2);
    }

    public final Long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Long l = this.refundedAmount;
        int i5 = i3 + 99;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return l;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 93;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.paymentMethodTitle;
        int i5 = i2 + 89;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            str = this.paymentMethodDescription;
            int i4 = 50 / 0;
        } else {
            str = this.paymentMethodDescription;
        }
        int i5 = i3 + 29;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
