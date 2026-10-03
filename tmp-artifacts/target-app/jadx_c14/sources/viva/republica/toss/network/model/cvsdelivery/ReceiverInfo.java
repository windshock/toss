package viva.republica.toss.network.model.cvsdelivery;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReceiverInfo {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    @SerializedName("name")
    private final String name;

    @SerializedName("primaryPhone")
    private final String primaryPhone;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceiverInfo)) {
            return false;
        }
        ReceiverInfo receiverInfo = (ReceiverInfo) obj;
        if (!Intrinsics.areEqual(this.name, receiverInfo.name)) {
            int i4 = onWarmupCompleted + 97;
            onExtraCallback = i4 % 128;
            return i4 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.primaryPhone, receiverInfo.primaryPhone)) {
            return true;
        }
        int i5 = onExtraCallback + 73;
        onWarmupCompleted = i5 % 128;
        return i5 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.name.hashCode();
        return i3 != 0 ? (iHashCode - 83) % this.primaryPhone.hashCode() : (iHashCode * 31) + this.primaryPhone.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ReceiverInfo(name=" + this.name + ", primaryPhone=" + this.primaryPhone + ")";
        int i2 = onExtraCallback + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public ReceiverInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.name = str;
        this.primaryPhone = str2;
    }
}
