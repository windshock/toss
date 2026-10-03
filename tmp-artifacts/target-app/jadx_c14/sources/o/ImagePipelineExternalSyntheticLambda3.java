package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExternalSyntheticLambda3 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("automobileNumber")
    private final String automobileNumber;

    /* JADX WARN: Illegal instructions before constructor call */
    public ImagePipelineExternalSyntheticLambda3() {
        String str = null;
        this(str, 1, str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagePipelineExternalSyntheticLambda3)) {
            return false;
        }
        if (Intrinsics.areEqual(this.automobileNumber, ((ImagePipelineExternalSyntheticLambda3) obj).automobileNumber)) {
            return true;
        }
        int i3 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.automobileNumber.hashCode();
        int i4 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanAutomobileScrapeRequest(automobileNumber=" + this.automobileNumber + ")";
        int i2 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public ImagePipelineExternalSyntheticLambda3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.automobileNumber = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImagePipelineExternalSyntheticLambda3(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 13;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str = "";
        }
        this(str);
    }
}
