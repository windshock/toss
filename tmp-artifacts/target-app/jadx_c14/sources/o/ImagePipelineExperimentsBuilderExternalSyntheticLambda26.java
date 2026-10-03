package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda26 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("agreeTermsTime")
    private final String agreeTermsTime;

    @SerializedName("authSmsTime")
    private final String authSmsTime;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ImagePipelineExperimentsBuilderExternalSyntheticLambda26)) {
            int i4 = IAuthTabCallback + 3;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        ImagePipelineExperimentsBuilderExternalSyntheticLambda26 imagePipelineExperimentsBuilderExternalSyntheticLambda26 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda26) obj;
        if (Intrinsics.areEqual(this.authSmsTime, imagePipelineExperimentsBuilderExternalSyntheticLambda26.authSmsTime)) {
            return Intrinsics.areEqual(this.agreeTermsTime, imagePipelineExperimentsBuilderExternalSyntheticLambda26.agreeTermsTime);
        }
        int i6 = onWarmupCompleted + 43;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.authSmsTime.hashCode();
        return i3 != 0 ? (iHashCode >>> 113) << this.agreeTermsTime.hashCode() : (iHashCode * 31) + this.agreeTermsTime.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanPreScreenUserAuthData(authSmsTime=" + this.authSmsTime + ", agreeTermsTime=" + this.agreeTermsTime + ")";
        int i2 = onWarmupCompleted + 43;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public ImagePipelineExperimentsBuilderExternalSyntheticLambda26(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.authSmsTime = str;
        this.agreeTermsTime = str2;
    }
}
