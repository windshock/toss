package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReturnsOwnership {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("organizationsToDisconnect")
    private final List<String> organizationsToDisconnect;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 7;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof ReturnsOwnership)) {
            return false;
        }
        if (Intrinsics.areEqual(this.organizationsToDisconnect, ((ReturnsOwnership) obj).organizationsToDisconnect)) {
            return true;
        }
        int i3 = onExtraCallbackWithResult + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.organizationsToDisconnect.hashCode();
        int i4 = onExtraCallback + 35;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossOneDisconnectRequest(organizationsToDisconnect=" + this.organizationsToDisconnect + ")";
        int i2 = onExtraCallbackWithResult + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public ReturnsOwnership(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.organizationsToDisconnect = list;
    }
}
