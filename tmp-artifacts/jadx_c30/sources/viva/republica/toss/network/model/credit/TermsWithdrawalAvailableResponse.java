package viva.republica.toss.network.model.credit;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TermsWithdrawalAvailableResponse {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final String description;
    private final String message;
    private final boolean withdrawalAvailable;

    static {
        int i = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public TermsWithdrawalAvailableResponse() {
        this(false, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 95;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TermsWithdrawalAvailableResponse)) {
            return false;
        }
        TermsWithdrawalAvailableResponse termsWithdrawalAvailableResponse = (TermsWithdrawalAvailableResponse) obj;
        if (this.withdrawalAvailable == termsWithdrawalAvailableResponse.withdrawalAvailable) {
            if (Intrinsics.areEqual(this.message, termsWithdrawalAvailableResponse.message)) {
                return Intrinsics.areEqual(this.description, termsWithdrawalAvailableResponse.description);
            }
            int i4 = onNavigationEvent + 21;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = i2 + 19;
        int i7 = i6 % 128;
        onExtraCallback = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 85;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Boolean.hashCode(this.withdrawalAvailable);
        String str = this.message;
        int iHashCode3 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = onNavigationEvent + 79;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        String str2 = this.description;
        if (str2 != null) {
            iHashCode3 = str2.hashCode();
            int i6 = onNavigationEvent + 101;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        return (((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TermsWithdrawalAvailableResponse(withdrawalAvailable=" + this.withdrawalAvailable + ", message=" + this.message + ", description=" + this.description + ")";
        int i2 = onNavigationEvent + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TermsWithdrawalAvailableResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            TermsWithdrawalAvailableResponse$$serializer termsWithdrawalAvailableResponse$$serializer = TermsWithdrawalAvailableResponse$$serializer.INSTANCE;
            int i4 = onWarmupCompleted + 45;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return termsWithdrawalAvailableResponse$$serializer;
        }
    }

    public /* synthetic */ TermsWithdrawalAvailableResponse(int i, boolean z, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i2 = onNavigationEvent + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = false;
        }
        this.withdrawalAvailable = z;
        if ((i & 2) == 0) {
            int i5 = onExtraCallback + 25;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            this.message = null;
            if (i6 != 0) {
                int i7 = 86 / 0;
            }
        } else {
            this.message = str;
        }
        if ((i & 4) != 0) {
            this.description = str2;
            return;
        }
        this.description = null;
        int i8 = onNavigationEvent + 85;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
    }

    public TermsWithdrawalAvailableResponse(boolean z, @Nullable String str, @Nullable String str2) {
        this.withdrawalAvailable = z;
        this.message = str;
        this.description = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(TermsWithdrawalAvailableResponse termsWithdrawalAvailableResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = onNavigationEvent + 37;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (termsWithdrawalAvailableResponse.withdrawalAvailable) {
                vylVar.onNavigationEvent(serialDescriptor, 0, termsWithdrawalAvailableResponse.withdrawalAvailable);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i6 = onNavigationEvent + 1;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 28 / 0;
                if (termsWithdrawalAvailableResponse.message != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, termsWithdrawalAvailableResponse.message);
                }
            } else if (termsWithdrawalAvailableResponse.message != null) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i8 = onExtraCallback + 51;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            if (termsWithdrawalAvailableResponse.description == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, termsWithdrawalAvailableResponse.description);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TermsWithdrawalAvailableResponse(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 121;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = false;
        }
        if ((i & 2) != 0) {
            int i5 = onNavigationEvent + 75;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            str = null;
        }
        if ((i & 4) != 0) {
            int i7 = onNavigationEvent + 15;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            int i8 = 2 % 2;
            str2 = null;
        }
        this(z, str, str2);
    }
}
