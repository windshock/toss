package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda28 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("additionalInfo")
    private final ImagePipelineExperimentsBuilderExternalSyntheticLambda3 additionalInfo;

    @SerializedName("authInfo")
    private final ImagePipelineExperimentsBuilderExternalSyntheticLambda26 userAuthData;

    @SerializedName("data")
    private final ImagePipelineExperimentsBuilderExternalSyntheticLambda27 userData;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof ImagePipelineExperimentsBuilderExternalSyntheticLambda28))) {
            ImagePipelineExperimentsBuilderExternalSyntheticLambda28 imagePipelineExperimentsBuilderExternalSyntheticLambda28 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda28) obj;
            if (!Intrinsics.areEqual(this.userData, imagePipelineExperimentsBuilderExternalSyntheticLambda28.userData) || !Intrinsics.areEqual(this.userAuthData, imagePipelineExperimentsBuilderExternalSyntheticLambda28.userAuthData)) {
                return false;
            }
            if (Intrinsics.areEqual(this.additionalInfo, imagePipelineExperimentsBuilderExternalSyntheticLambda28.additionalInfo)) {
                int i4 = onNavigationEvent + 89;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return true;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i5 = IAuthTabCallback + 87;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 51 / 0;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.userData.hashCode() * 31) + this.userAuthData.hashCode()) * 31) + this.additionalInfo.hashCode();
        int i4 = onNavigationEvent + 17;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanPreScreenRequest(userData=" + this.userData + ", userAuthData=" + this.userAuthData + ", additionalInfo=" + this.additionalInfo + ")";
        int i2 = onNavigationEvent + 97;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ImagePipelineExperimentsBuilderExternalSyntheticLambda28(@NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda27 imagePipelineExperimentsBuilderExternalSyntheticLambda27, @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda26 imagePipelineExperimentsBuilderExternalSyntheticLambda26, @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda3 imagePipelineExperimentsBuilderExternalSyntheticLambda3) {
        Intrinsics.checkNotNullParameter(imagePipelineExperimentsBuilderExternalSyntheticLambda27, "");
        Intrinsics.checkNotNullParameter(imagePipelineExperimentsBuilderExternalSyntheticLambda26, "");
        Intrinsics.checkNotNullParameter(imagePipelineExperimentsBuilderExternalSyntheticLambda3, "");
        this.userData = imagePipelineExperimentsBuilderExternalSyntheticLambda27;
        this.userAuthData = imagePipelineExperimentsBuilderExternalSyntheticLambda26;
        this.additionalInfo = imagePipelineExperimentsBuilderExternalSyntheticLambda3;
    }

    public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda28(ImagePipelineExperimentsBuilderExternalSyntheticLambda27 imagePipelineExperimentsBuilderExternalSyntheticLambda27, ImagePipelineExperimentsBuilderExternalSyntheticLambda26 imagePipelineExperimentsBuilderExternalSyntheticLambda26, ImagePipelineExperimentsBuilderExternalSyntheticLambda3 imagePipelineExperimentsBuilderExternalSyntheticLambda3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            imagePipelineExperimentsBuilderExternalSyntheticLambda3 = new ImagePipelineExperimentsBuilderExternalSyntheticLambda3(null, 1, null);
            int i2 = onNavigationEvent + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this(imagePipelineExperimentsBuilderExternalSyntheticLambda27, imagePipelineExperimentsBuilderExternalSyntheticLambda26, imagePipelineExperimentsBuilderExternalSyntheticLambda3);
    }
}
