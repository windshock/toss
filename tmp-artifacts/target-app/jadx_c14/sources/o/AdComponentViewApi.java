package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AdComponentViewApi {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    @SerializedName("bankCodes")
    private final List<Integer> bankCodes;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        IAuthTabCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdComponentViewApi)) {
            return false;
        }
        if (Intrinsics.areEqual(this.bankCodes, ((AdComponentViewApi) obj).bankCodes)) {
            return true;
        }
        int i3 = onWarmupCompleted;
        int i4 = i3 + 87;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 101;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            iHashCode = this.bankCodes.hashCode();
            int i3 = 44 / 0;
        } else {
            iHashCode = this.bankCodes.hashCode();
        }
        int i4 = onWarmupCompleted + 51;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountNotificationTermsReq(bankCodes=" + this.bankCodes + ")";
        int i2 = IAuthTabCallback + 75;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public AdComponentViewApi(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.bankCodes = list;
    }
}
