package o;

import com.google.gson.annotations.SerializedName;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setButtonBorderColor {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("bankCode")
    private final String bankCode;

    @SerializedName(verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_METHOD)
    private final String method;

    @SerializedName("signedBankCodes")
    private final Set<String> signedBankCodes;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof setButtonBorderColor)) {
            return false;
        }
        setButtonBorderColor setbuttonbordercolor = (setButtonBorderColor) obj;
        if (!Intrinsics.areEqual(this.bankCode, setbuttonbordercolor.bankCode)) {
            int i4 = onNavigationEvent + 7;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 33 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.method, setbuttonbordercolor.method)) {
            int i6 = onNavigationEvent + 25;
            onExtraCallback = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!(!Intrinsics.areEqual(this.signedBankCodes, setbuttonbordercolor.signedBankCodes))) {
            return true;
        }
        int i7 = onNavigationEvent + 13;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.bankCode.hashCode();
        String str = this.method;
        if (str == null) {
            int i2 = onExtraCallback + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode3 = (((iHashCode2 * 31) + iHashCode) * 31) + this.signedBankCodes.hashCode();
        int i4 = onExtraCallback + 101;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode3;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SignInOutBankReq(bankCode=" + this.bankCode + ", method=" + this.method + ", signedBankCodes=" + this.signedBankCodes + ")";
        int i2 = onNavigationEvent + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
