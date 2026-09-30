package im.toss.features.credit.data.response.membership;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditPlusPaymentResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String buttonText;
    private final String description;
    private final String title;

    static {
        Object obj = null;
        int i = IAuthTabCallback + 21;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public CreditPlusPaymentResponse() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 1;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 49;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof CreditPlusPaymentResponse)) {
            return false;
        }
        CreditPlusPaymentResponse creditPlusPaymentResponse = (CreditPlusPaymentResponse) obj;
        if (!Intrinsics.areEqual(this.title, creditPlusPaymentResponse.title)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.description, creditPlusPaymentResponse.description)) {
            int i7 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.buttonText, creditPlusPaymentResponse.buttonText)) {
            return true;
        }
        int i9 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.buttonText.hashCode();
        int i4 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditPlusPaymentResponse(title=" + this.title + ", description=" + this.description + ", buttonText=" + this.buttonText + ")";
        int i2 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ CreditPlusPaymentResponse(int i, String str, String str2, String str3, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.title = "";
            int i2 = 2 % 2;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            int i3 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            this.description = "";
            if (i4 == 0) {
                int i5 = 74 / 0;
            }
            int i6 = 2 % 2;
        } else {
            this.description = str2;
        }
        if ((i & 4) != 0) {
            this.buttonText = str3;
            return;
        }
        int i7 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        this.buttonText = "";
        if (i8 == 0) {
            throw null;
        }
    }

    public CreditPlusPaymentResponse(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.title = str;
        this.description = str2;
        this.buttonText = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(CreditPlusPaymentResponse creditPlusPaymentResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!Intrinsics.areEqual(creditPlusPaymentResponse.title, "")) {
                vylVar.onExtraCallback(serialDescriptor, 0, creditPlusPaymentResponse.title);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = onNavigationEvent + 25;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.areEqual(creditPlusPaymentResponse.description, "");
                throw null;
            }
            if (!Intrinsics.areEqual(creditPlusPaymentResponse.description, "")) {
                vylVar.onExtraCallback(serialDescriptor, 1, creditPlusPaymentResponse.description);
                int i5 = onNavigationEvent + 29;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 3 / 2;
                }
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || (!Intrinsics.areEqual(creditPlusPaymentResponse.buttonText, ""))) {
            vylVar.onExtraCallback(serialDescriptor, 2, creditPlusPaymentResponse.buttonText);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreditPlusPaymentResponse(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i3 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            str2 = "";
        }
        if ((i & 4) != 0) {
            int i5 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = 2 % 2;
            str3 = "";
        }
        this(str, str2, str3);
    }

    public final String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            str = this.title;
            int i4 = 10 / 0;
        } else {
            str = this.title;
        }
        int i5 = i3 + 97;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.description;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.buttonText;
        int i5 = i3 + 19;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
