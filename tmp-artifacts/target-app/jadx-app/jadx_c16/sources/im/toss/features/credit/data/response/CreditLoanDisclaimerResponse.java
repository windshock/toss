package im.toss.features.credit.data.response;

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
public final class CreditLoanDisclaimerResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String disclaimer;

    static {
        int i = onWarmupCompleted + 111;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CreditLoanDisclaimerResponse() {
        String str = null;
        this(str, 1, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 1;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 69;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(!(obj instanceof CreditLoanDisclaimerResponse))) {
            return Intrinsics.areEqual(this.disclaimer, ((CreditLoanDisclaimerResponse) obj).disclaimer);
        }
        int i7 = IAuthTabCallback;
        int i8 = i7 + 63;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i7 + 105;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.disclaimer;
        if (i3 == 0) {
            return str.hashCode();
        }
        str.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditLoanDisclaimerResponse(disclaimer=" + this.disclaimer + ")";
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ CreditLoanDisclaimerResponse(int i, String str, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.disclaimer = "";
            int i2 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.disclaimer = str;
        int i4 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public CreditLoanDisclaimerResponse(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.disclaimer = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(CreditLoanDisclaimerResponse creditLoanDisclaimerResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (Intrinsics.areEqual(creditLoanDisclaimerResponse.disclaimer, "")) {
                return;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 0, creditLoanDisclaimerResponse.disclaimer);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreditLoanDisclaimerResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str = "";
        }
        this(str);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.disclaimer;
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return str;
    }
}
