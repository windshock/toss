package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda11 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("headerTitle")
    private final String headerTitle;

    @SerializedName("items")
    private final List<DiskCachesStoreFactoryExternalSyntheticLambda0> items;

    @SerializedName("oneButtonTitle")
    private final String oneButtonTitle;

    @SerializedName("twoButtonTitle")
    private final String twoButtonTitle;

    @SerializedName("type")
    private final DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda5 type;

    @SerializedName("unitTitle")
    private final String unitTitle;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 5;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 115;
            onExtraCallback = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!(obj instanceof ImagePipelineExperimentsBuilderExternalSyntheticLambda11)) {
            return false;
        }
        ImagePipelineExperimentsBuilderExternalSyntheticLambda11 imagePipelineExperimentsBuilderExternalSyntheticLambda11 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda11) obj;
        if (!Intrinsics.areEqual(this.headerTitle, imagePipelineExperimentsBuilderExternalSyntheticLambda11.headerTitle) || !Intrinsics.areEqual(this.unitTitle, imagePipelineExperimentsBuilderExternalSyntheticLambda11.unitTitle)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.oneButtonTitle, imagePipelineExperimentsBuilderExternalSyntheticLambda11.oneButtonTitle)) {
            int i6 = onWarmupCompleted + 79;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.twoButtonTitle, imagePipelineExperimentsBuilderExternalSyntheticLambda11.twoButtonTitle)) {
            return Intrinsics.areEqual(this.items, imagePipelineExperimentsBuilderExternalSyntheticLambda11.items) && this.type == imagePipelineExperimentsBuilderExternalSyntheticLambda11.type;
        }
        int i8 = onExtraCallback + 35;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.headerTitle.hashCode() * 31) + this.unitTitle.hashCode()) * 31) + this.oneButtonTitle.hashCode()) * 31) + this.twoButtonTitle.hashCode()) * 31) + this.items.hashCode()) * 31) + this.type.hashCode();
        int i4 = onWarmupCompleted + 105;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonGraphData(headerTitle=" + this.headerTitle + ", unitTitle=" + this.unitTitle + ", oneButtonTitle=" + this.oneButtonTitle + ", twoButtonTitle=" + this.twoButtonTitle + ", items=" + this.items + ", type=" + this.type + ")";
        int i2 = onWarmupCompleted + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
