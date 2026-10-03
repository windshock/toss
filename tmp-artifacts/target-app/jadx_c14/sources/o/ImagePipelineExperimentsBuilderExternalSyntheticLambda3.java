package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda3 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    @SerializedName("automobileInfo")
    private final ImagePipelineExternalSyntheticLambda1 automobileInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    public ImagePipelineExperimentsBuilderExternalSyntheticLambda3() {
        ImagePipelineExternalSyntheticLambda1 imagePipelineExternalSyntheticLambda1 = null;
        this(imagePipelineExternalSyntheticLambda1, 1, imagePipelineExternalSyntheticLambda1);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 59;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 31 / 0;
            }
            return true;
        }
        if (!(obj instanceof ImagePipelineExperimentsBuilderExternalSyntheticLambda3)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.automobileInfo, ((ImagePipelineExperimentsBuilderExternalSyntheticLambda3) obj).automobileInfo))) {
            return true;
        }
        int i4 = IAuthTabCallback + 39;
        onExtraCallback = i4 % 128;
        return i4 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ImagePipelineExternalSyntheticLambda1 imagePipelineExternalSyntheticLambda1 = this.automobileInfo;
        if (imagePipelineExternalSyntheticLambda1 == null) {
            return 0;
        }
        int iHashCode = imagePipelineExternalSyntheticLambda1.hashCode();
        int i4 = onExtraCallback + 17;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanPreScreenAdditionalInfo(automobileInfo=" + this.automobileInfo + ")";
        int i2 = IAuthTabCallback + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public ImagePipelineExperimentsBuilderExternalSyntheticLambda3(@Nullable ImagePipelineExternalSyntheticLambda1 imagePipelineExternalSyntheticLambda1) {
        this.automobileInfo = imagePipelineExternalSyntheticLambda1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda3(ImagePipelineExternalSyntheticLambda1 imagePipelineExternalSyntheticLambda1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 9;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 99;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 3;
            } else {
                int i7 = 2 % 2;
            }
            imagePipelineExternalSyntheticLambda1 = null;
        }
        this(imagePipelineExternalSyntheticLambda1);
    }
}
