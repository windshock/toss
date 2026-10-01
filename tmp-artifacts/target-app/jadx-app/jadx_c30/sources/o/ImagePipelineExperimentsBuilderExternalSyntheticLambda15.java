package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda15 implements Parcelable {
    public static final Parcelable.Creator<ImagePipelineExperimentsBuilderExternalSyntheticLambda15> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;

    @SerializedName("contents")
    private final String contents;

    @SerializedName("displayName")
    private final String displayName;

    public static final class onWarmupCompleted implements Parcelable.Creator<ImagePipelineExperimentsBuilderExternalSyntheticLambda15> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda15 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                onWarmupCompleted(parcel);
                obj.hashCode();
                throw null;
            }
            ImagePipelineExperimentsBuilderExternalSyntheticLambda15 imagePipelineExperimentsBuilderExternalSyntheticLambda15OnWarmupCompleted = onWarmupCompleted(parcel);
            int i3 = IAuthTabCallback + 95;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return imagePipelineExperimentsBuilderExternalSyntheticLambda15OnWarmupCompleted;
            }
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda15[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 123;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            ImagePipelineExperimentsBuilderExternalSyntheticLambda15[] imagePipelineExperimentsBuilderExternalSyntheticLambda15ArrOnExtraCallback = onExtraCallback(i);
            int i5 = IAuthTabCallback + 115;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return imagePipelineExperimentsBuilderExternalSyntheticLambda15ArrOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ImagePipelineExperimentsBuilderExternalSyntheticLambda15[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 69;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            ImagePipelineExperimentsBuilderExternalSyntheticLambda15[] imagePipelineExperimentsBuilderExternalSyntheticLambda15Arr = new ImagePipelineExperimentsBuilderExternalSyntheticLambda15[i];
            int i6 = i3 + 7;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 72 / 0;
            }
            return imagePipelineExperimentsBuilderExternalSyntheticLambda15Arr;
        }

        public final ImagePipelineExperimentsBuilderExternalSyntheticLambda15 onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            ImagePipelineExperimentsBuilderExternalSyntheticLambda15 imagePipelineExperimentsBuilderExternalSyntheticLambda15 = new ImagePipelineExperimentsBuilderExternalSyntheticLambda15(parcel.readString(), parcel.readString());
            int i2 = IAuthTabCallback + 45;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return imagePipelineExperimentsBuilderExternalSyntheticLambda15;
        }
    }

    static {
        int i = IAuthTabCallback + 79;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = (i2 % 2 == 0 ? 0 : 1) ^ 1;
        int i5 = i3 + 53;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 57;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagePipelineExperimentsBuilderExternalSyntheticLambda15)) {
            int i5 = i2 + 51;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        ImagePipelineExperimentsBuilderExternalSyntheticLambda15 imagePipelineExperimentsBuilderExternalSyntheticLambda15 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda15) obj;
        if (!Intrinsics.areEqual(this.displayName, imagePipelineExperimentsBuilderExternalSyntheticLambda15.displayName)) {
            int i7 = onExtraCallbackWithResult;
            int i8 = i7 + 109;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 23;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.contents, imagePipelineExperimentsBuilderExternalSyntheticLambda15.contents)) {
            int i12 = onExtraCallback + 3;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        int i14 = onExtraCallback + 19;
        onExtraCallbackWithResult = i14 % 128;
        if (i14 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.displayName.hashCode() - 22) / this.contents.hashCode() : (this.displayName.hashCode() * 31) + this.contents.hashCode();
        int i3 = onExtraCallback + 47;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonProductDetailInfo(displayName=" + this.displayName + ", contents=" + this.contents + ")";
        int i2 = onExtraCallbackWithResult + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 3;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeString(this.displayName);
        parcel.writeString(this.contents);
        int i5 = onExtraCallbackWithResult + 105;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
    }

    public ImagePipelineExperimentsBuilderExternalSyntheticLambda15(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        this.displayName = str;
        this.contents = str2;
    }
}
