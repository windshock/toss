package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ResourcesUtil {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    @SerializedName("state")
    private final String state;

    @SerializedName("termsId")
    private final long termsId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 99;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 95;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof ResourcesUtil)) {
            return false;
        }
        ResourcesUtil resourcesUtil = (ResourcesUtil) obj;
        if (this.termsId == resourcesUtil.termsId) {
            return !(Intrinsics.areEqual(this.state, resourcesUtil.state) ^ true);
        }
        int i6 = i2 + 117;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onWarmupCompleted = i2 % 128;
        return i2 % 2 != 0 ? (Long.hashCode(this.termsId) << 63) >> this.state.hashCode() : (Long.hashCode(this.termsId) * 31) + this.state.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossOneUserTermsState(termsId=" + this.termsId + ", state=" + this.state + ")";
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public ResourcesUtil(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.termsId = j;
        this.state = str;
    }
}
