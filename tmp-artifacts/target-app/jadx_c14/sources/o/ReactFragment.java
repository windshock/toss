package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactFragment {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    @SerializedName("expiredAt")
    private final String expiredAt;

    @SerializedName("uploadUrls")
    private final List<String> uploadUrls;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactFragment)) {
            int i2 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        ReactFragment reactFragment = (ReactFragment) obj;
        if (Intrinsics.areEqual(this.expiredAt, reactFragment.expiredAt)) {
            return Intrinsics.areEqual(this.uploadUrls, reactFragment.uploadUrls);
        }
        int i4 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 103;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.expiredAt;
        if (str == null) {
            int i5 = i2 + 3;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        List<String> list = this.uploadUrls;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensSchoolMealImageUrlResponse(expiredAt=" + this.expiredAt + ", uploadUrls=" + this.uploadUrls + ")";
        int i2 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final List<String> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.uploadUrls;
        }
        throw null;
    }
}
