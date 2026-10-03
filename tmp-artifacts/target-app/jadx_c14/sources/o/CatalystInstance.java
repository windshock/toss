package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.VerifyBaseInfo;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CatalystInstance extends VerifyBaseInfo {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    @SerializedName("params")
    private final isBridgeless params;

    @SerializedName("phone")
    private final String phone;

    @SerializedName("templateId")
    private final long templateId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 113;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 15;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof CatalystInstance)) {
            return false;
        }
        CatalystInstance catalystInstance = (CatalystInstance) obj;
        if (this.templateId != catalystInstance.templateId) {
            int i6 = IAuthTabCallback + 85;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.phone, catalystInstance.phone) || !Intrinsics.areEqual(this.params, catalystInstance.params)) {
            return false;
        }
        int i8 = onWarmupCompleted + 55;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Long.hashCode(this.templateId) * 31) + this.phone.hashCode()) * 31) + this.params.hashCode();
        int i4 = onWarmupCompleted + 81;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PrepareArsWithBankAccountRequest(templateId=" + this.templateId + ", phone=" + this.phone + ", params=" + this.params + ")";
        int i2 = IAuthTabCallback + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 93 / 0;
        }
        return str;
    }

    public CatalystInstance(long j, @NotNull String str, @NotNull isBridgeless isbridgeless) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(isbridgeless, "");
        this.templateId = j;
        this.phone = str;
        this.params = isbridgeless;
    }
}
