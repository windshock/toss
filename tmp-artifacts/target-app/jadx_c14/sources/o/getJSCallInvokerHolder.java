package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getJSCallInvokerHolder {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("verificationCode")
    private final String verificationCode;

    @SerializedName("verifyId")
    private final long verifyId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getJSCallInvokerHolder)) {
            int i4 = onNavigationEvent + 15;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        getJSCallInvokerHolder getjscallinvokerholder = (getJSCallInvokerHolder) obj;
        if (this.verifyId == getjscallinvokerholder.verifyId) {
            return Intrinsics.areEqual(this.verificationCode, getjscallinvokerholder.verificationCode);
        }
        int i6 = onNavigationEvent + 27;
        onExtraCallback = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Long.hashCode(this.verifyId) * 31) + this.verificationCode.hashCode();
        int i4 = onExtraCallback + 111;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BankDepositVerifyRequest(verifyId=" + this.verifyId + ", verificationCode=" + this.verificationCode + ")";
        int i2 = onNavigationEvent + 13;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public getJSCallInvokerHolder(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.verifyId = j;
        this.verificationCode = str;
    }
}
