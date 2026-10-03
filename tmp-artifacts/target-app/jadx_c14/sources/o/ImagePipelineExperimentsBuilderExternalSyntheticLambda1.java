package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda14;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda1 implements Parcelable {
    public static final Parcelable.Creator<ImagePipelineExperimentsBuilderExternalSyntheticLambda1> CREATOR = new onWarmupCompleted();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("landingEndpoint")
    private final String landingEndpoint;

    @SerializedName("landingType")
    private final String landingType;

    @SerializedName("transitionPopup")
    private final BytesRangeExternalSyntheticLambda0 transitionPopup;

    public static final class onWarmupCompleted implements Parcelable.Creator<ImagePipelineExperimentsBuilderExternalSyntheticLambda1> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda1 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ImagePipelineExperimentsBuilderExternalSyntheticLambda1 imagePipelineExperimentsBuilderExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(parcel);
            if (i3 != 0) {
                int i4 = 32 / 0;
            }
            return imagePipelineExperimentsBuilderExternalSyntheticLambda1OnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda1[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 57;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            ImagePipelineExperimentsBuilderExternalSyntheticLambda1[] imagePipelineExperimentsBuilderExternalSyntheticLambda1ArrOnExtraCallback = onExtraCallback(i);
            int i5 = onExtraCallback + 11;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return imagePipelineExperimentsBuilderExternalSyntheticLambda1ArrOnExtraCallback;
        }

        public final ImagePipelineExperimentsBuilderExternalSyntheticLambda1[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 53;
            onWarmupCompleted = i3 % 128;
            ImagePipelineExperimentsBuilderExternalSyntheticLambda1[] imagePipelineExperimentsBuilderExternalSyntheticLambda1Arr = new ImagePipelineExperimentsBuilderExternalSyntheticLambda1[i];
            if (i3 % 2 == 0) {
                int i4 = 14 / 0;
            }
            return imagePipelineExperimentsBuilderExternalSyntheticLambda1Arr;
        }

        public final ImagePipelineExperimentsBuilderExternalSyntheticLambda1 onWarmupCompleted(Parcel parcel) {
            BytesRangeExternalSyntheticLambda0 bytesRangeExternalSyntheticLambda0CreateFromParcel;
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = onExtraCallback + 123;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                bytesRangeExternalSyntheticLambda0CreateFromParcel = null;
            } else {
                bytesRangeExternalSyntheticLambda0CreateFromParcel = BytesRangeExternalSyntheticLambda0.CREATOR.createFromParcel(parcel);
            }
            return new ImagePipelineExperimentsBuilderExternalSyntheticLambda1(string, string2, bytesRangeExternalSyntheticLambda0CreateFromParcel);
        }
    }

    static {
        int i = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public ImagePipelineExperimentsBuilderExternalSyntheticLambda1() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 117;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2 != 0 ? 1 : 0;
        int i5 = i2 + 47;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagePipelineExperimentsBuilderExternalSyntheticLambda1)) {
            return false;
        }
        ImagePipelineExperimentsBuilderExternalSyntheticLambda1 imagePipelineExperimentsBuilderExternalSyntheticLambda1 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda1) obj;
        Object obj2 = null;
        if (!Intrinsics.areEqual(this.landingEndpoint, imagePipelineExperimentsBuilderExternalSyntheticLambda1.landingEndpoint)) {
            int i2 = onExtraCallback + 29;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (Intrinsics.areEqual(this.landingType, imagePipelineExperimentsBuilderExternalSyntheticLambda1.landingType)) {
            if (!(!Intrinsics.areEqual(this.transitionPopup, imagePipelineExperimentsBuilderExternalSyntheticLambda1.transitionPopup))) {
                return true;
            }
            int i3 = onNavigationEvent + 5;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = onExtraCallback + 71;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.landingEndpoint.hashCode();
        int iHashCode3 = this.landingType.hashCode();
        BytesRangeExternalSyntheticLambda0 bytesRangeExternalSyntheticLambda0 = this.transitionPopup;
        if (bytesRangeExternalSyntheticLambda0 == null) {
            int i2 = onNavigationEvent + 103;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 89;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 2;
            }
            iHashCode = 0;
        } else {
            iHashCode = bytesRangeExternalSyntheticLambda0.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonApplyResult(landingEndpoint=" + this.landingEndpoint + ", landingType=" + this.landingType + ", transitionPopup=" + this.transitionPopup + ")";
        int i2 = onNavigationEvent + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 9;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.landingEndpoint);
        parcel.writeString(this.landingType);
        BytesRangeExternalSyntheticLambda0 bytesRangeExternalSyntheticLambda0 = this.transitionPopup;
        if (bytesRangeExternalSyntheticLambda0 != null) {
            parcel.writeInt(1);
            bytesRangeExternalSyntheticLambda0.writeToParcel(parcel, i);
            return;
        }
        int i5 = onNavigationEvent + 9;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(0);
        }
    }

    public ImagePipelineExperimentsBuilderExternalSyntheticLambda1(@NotNull String str, @NotNull String str2, @Nullable BytesRangeExternalSyntheticLambda0 bytesRangeExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.landingEndpoint = str;
        this.landingType = str2;
        this.transitionPopup = bytesRangeExternalSyntheticLambda0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda1(String str, String str2, BytesRangeExternalSyntheticLambda0 bytesRangeExternalSyntheticLambda0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback;
            int i3 = i2 + 37;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 7;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i7 = onNavigationEvent + 105;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 55 / 0;
            }
            int i9 = 2 % 2;
            str2 = "";
        }
        this(str, str2, (i & 4) != 0 ? null : bytesRangeExternalSyntheticLambda0);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 125;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.landingEndpoint;
        int i5 = i2 + 15;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final BytesRangeExternalSyntheticLambda0 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 115;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BytesRangeExternalSyntheticLambda0 bytesRangeExternalSyntheticLambda0 = this.transitionPopup;
        int i4 = i2 + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return bytesRangeExternalSyntheticLambda0;
    }

    public final ImagePipelineExperimentsBuilderExternalSyntheticLambda14 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda14 imagePipelineExperimentsBuilderExternalSyntheticLambda14IAuthTabCallback = ImagePipelineExperimentsBuilderExternalSyntheticLambda14.onExtraCallback.IAuthTabCallback(ImagePipelineExperimentsBuilderExternalSyntheticLambda14.Companion, this.landingType, false, 2, null);
        int i4 = onExtraCallback + 89;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return imagePipelineExperimentsBuilderExternalSyntheticLambda14IAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }
}
