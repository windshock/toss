package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda10 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    @SerializedName("requireReference")
    private final ImagePipelineExperimentsBuilderExternalSyntheticLambda12 requireReference;

    public final ImagePipelineExperimentsBuilderExternalSyntheticLambda10 IAuthTabCallback(@NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(imagePipelineExperimentsBuilderExternalSyntheticLambda12, "");
        ImagePipelineExperimentsBuilderExternalSyntheticLambda10 imagePipelineExperimentsBuilderExternalSyntheticLambda10 = new ImagePipelineExperimentsBuilderExternalSyntheticLambda10(imagePipelineExperimentsBuilderExternalSyntheticLambda12);
        int i2 = onExtraCallback + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return imagePipelineExperimentsBuilderExternalSyntheticLambda10;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagePipelineExperimentsBuilderExternalSyntheticLambda10)) {
            int i2 = IAuthTabCallback + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.requireReference, ((ImagePipelineExperimentsBuilderExternalSyntheticLambda10) obj).requireReference)) {
            int i4 = IAuthTabCallback + 79;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = onExtraCallback + 119;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.requireReference.hashCode();
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.requireReference.hashCode();
        int i3 = IAuthTabCallback + 9;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonCleansing(requireReference=" + this.requireReference + ")";
        int i2 = IAuthTabCallback + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public ImagePipelineExperimentsBuilderExternalSyntheticLambda10(@NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12) {
        Intrinsics.checkNotNullParameter(imagePipelineExperimentsBuilderExternalSyntheticLambda12, "");
        this.requireReference = imagePipelineExperimentsBuilderExternalSyntheticLambda12;
    }

    public final ImagePipelineExperimentsBuilderExternalSyntheticLambda12 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 111;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12 = this.requireReference;
        int i5 = i2 + 47;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return imagePipelineExperimentsBuilderExternalSyntheticLambda12;
    }
}
