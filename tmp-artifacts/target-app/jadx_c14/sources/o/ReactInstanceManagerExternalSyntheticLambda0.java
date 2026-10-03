package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactInstanceManagerExternalSyntheticLambda0 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("virtualAccount")
    private final handleCxxError virtualAccount;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReactInstanceManagerExternalSyntheticLambda0) {
            if (Intrinsics.areEqual(this.virtualAccount, ((ReactInstanceManagerExternalSyntheticLambda0) obj).virtualAccount)) {
                return true;
            }
            int i2 = onNavigationEvent + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = onWarmupCompleted + 67;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 61;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        handleCxxError handlecxxerror = this.virtualAccount;
        if (handlecxxerror == null) {
            int i2 = onWarmupCompleted + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }
        int iHashCode = handlecxxerror.hashCode();
        int i4 = onWarmupCompleted + 67;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensTossMoneyVirtualAccountResponse(virtualAccount=" + this.virtualAccount + ")";
        int i2 = onWarmupCompleted + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final handleCxxError IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 15;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        handleCxxError handlecxxerror = this.virtualAccount;
        int i5 = i2 + 25;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return handlecxxerror;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
