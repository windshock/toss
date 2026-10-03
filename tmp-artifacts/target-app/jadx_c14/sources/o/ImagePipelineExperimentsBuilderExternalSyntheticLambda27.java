package o;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda27 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("businessData")
    private final JsonObject businessData;

    @SerializedName("funnelType")
    private final String funnelType;

    @SerializedName("manual")
    private final ImagePipelineExperimentsBuilderExternalSyntheticLambda12 manual;

    @SerializedName("scrapedData")
    private final JsonObject scrapedData;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ImagePipelineExperimentsBuilderExternalSyntheticLambda27)) {
            int i4 = onNavigationEvent + 101;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        ImagePipelineExperimentsBuilderExternalSyntheticLambda27 imagePipelineExperimentsBuilderExternalSyntheticLambda27 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda27) obj;
        if (!Intrinsics.areEqual(this.funnelType, imagePipelineExperimentsBuilderExternalSyntheticLambda27.funnelType) || !Intrinsics.areEqual(this.manual, imagePipelineExperimentsBuilderExternalSyntheticLambda27.manual)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.scrapedData, imagePipelineExperimentsBuilderExternalSyntheticLambda27.scrapedData)) {
            int i6 = onExtraCallback + 75;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.businessData, imagePipelineExperimentsBuilderExternalSyntheticLambda27.businessData)) {
            int i8 = onExtraCallback + 125;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
        int i10 = onExtraCallback + 13;
        onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.funnelType.hashCode();
        ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12 = this.manual;
        int iHashCode3 = 0;
        int iHashCode4 = imagePipelineExperimentsBuilderExternalSyntheticLambda12 == null ? 0 : imagePipelineExperimentsBuilderExternalSyntheticLambda12.hashCode();
        JsonObject jsonObject = this.scrapedData;
        if (jsonObject == null) {
            iHashCode = 0;
        } else {
            iHashCode = jsonObject.hashCode();
            int i4 = onNavigationEvent + 1;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        JsonObject jsonObject2 = this.businessData;
        if (jsonObject2 != null) {
            int i6 = onExtraCallback + 29;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = jsonObject2.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanPreScreenUserData(funnelType=" + this.funnelType + ", manual=" + this.manual + ", scrapedData=" + this.scrapedData + ", businessData=" + this.businessData + ")";
        int i2 = onExtraCallback + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public ImagePipelineExperimentsBuilderExternalSyntheticLambda27(@NotNull String str, @Nullable ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12, @Nullable JsonObject jsonObject, @Nullable JsonObject jsonObject2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.funnelType = str;
        this.manual = imagePipelineExperimentsBuilderExternalSyntheticLambda12;
        this.scrapedData = jsonObject;
        this.businessData = jsonObject2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda27(String str, ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12, JsonObject jsonObject, JsonObject jsonObject2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onNavigationEvent + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            imagePipelineExperimentsBuilderExternalSyntheticLambda12 = null;
        }
        if ((i & 4) != 0) {
            int i4 = onNavigationEvent + 75;
            int i5 = i4 % 128;
            onExtraCallback = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 23;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            jsonObject = null;
        }
        if ((i & 8) != 0) {
            int i10 = 2 % 2;
            jsonObject2 = null;
        }
        this(str, imagePipelineExperimentsBuilderExternalSyntheticLambda12, jsonObject, jsonObject2);
    }
}
