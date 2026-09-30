package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class toRequestCode {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    @SerializedName("legalRepresentativeId")
    private final Long legalRepresentativeId;

    @SerializedName("signIds")
    private final List<Long> signIds;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toRequestCode)) {
            int i2 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        toRequestCode torequestcode = (toRequestCode) obj;
        if (!(!Intrinsics.areEqual(this.signIds, torequestcode.signIds))) {
            return Intrinsics.areEqual(this.legalRepresentativeId, torequestcode.legalRepresentativeId);
        }
        int i4 = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.signIds.hashCode();
        Long l = this.legalRepresentativeId;
        if (l == null) {
            int i3 = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode2 = l.hashCode();
            int i5 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 3;
            }
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossOneUserCompleteListRequest(signIds=" + this.signIds + ", legalRepresentativeId=" + this.legalRepresentativeId + ")";
        int i2 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
