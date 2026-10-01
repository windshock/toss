package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda18 implements Parcelable {
    public static final Parcelable.Creator<ImagePipelineExperimentsBuilderExternalSyntheticLambda18> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("applyAlert")
    private final String applyAlert;

    @SerializedName("applyNotice")
    private final String applyNotice;

    @SerializedName("applyNoticeTitle")
    private final String applyNoticeTitle;

    @SerializedName("caution")
    private final String caution;

    public static final class IAuthTabCallback implements Parcelable.Creator<ImagePipelineExperimentsBuilderExternalSyntheticLambda18> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final ImagePipelineExperimentsBuilderExternalSyntheticLambda18[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 27;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            ImagePipelineExperimentsBuilderExternalSyntheticLambda18[] imagePipelineExperimentsBuilderExternalSyntheticLambda18Arr = new ImagePipelineExperimentsBuilderExternalSyntheticLambda18[i];
            int i6 = i3 + 85;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return imagePipelineExperimentsBuilderExternalSyntheticLambda18Arr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda18 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ImagePipelineExperimentsBuilderExternalSyntheticLambda18 imagePipelineExperimentsBuilderExternalSyntheticLambda18OnExtraCallback = onExtraCallback(parcel);
            int i4 = IAuthTabCallback + 45;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return imagePipelineExperimentsBuilderExternalSyntheticLambda18OnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda18[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 75;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            ImagePipelineExperimentsBuilderExternalSyntheticLambda18[] imagePipelineExperimentsBuilderExternalSyntheticLambda18ArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onNavigationEvent + 77;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return imagePipelineExperimentsBuilderExternalSyntheticLambda18ArrIAuthTabCallback;
            }
            throw null;
        }

        public final ImagePipelineExperimentsBuilderExternalSyntheticLambda18 onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            ImagePipelineExperimentsBuilderExternalSyntheticLambda18 imagePipelineExperimentsBuilderExternalSyntheticLambda18 = new ImagePipelineExperimentsBuilderExternalSyntheticLambda18(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = IAuthTabCallback + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return imagePipelineExperimentsBuilderExternalSyntheticLambda18;
        }
    }

    static {
        int i = onExtraCallback + 65;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public ImagePipelineExperimentsBuilderExternalSyntheticLambda18() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 37;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 51;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagePipelineExperimentsBuilderExternalSyntheticLambda18)) {
            int i5 = i3 + 49;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        ImagePipelineExperimentsBuilderExternalSyntheticLambda18 imagePipelineExperimentsBuilderExternalSyntheticLambda18 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda18) obj;
        if (!Intrinsics.areEqual(this.caution, imagePipelineExperimentsBuilderExternalSyntheticLambda18.caution)) {
            int i7 = onWarmupCompleted + 111;
            int i8 = i7 % 128;
            onExtraCallbackWithResult = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 11;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.applyNotice, imagePipelineExperimentsBuilderExternalSyntheticLambda18.applyNotice)) {
            int i11 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 73 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.applyAlert, imagePipelineExperimentsBuilderExternalSyntheticLambda18.applyAlert)) {
            int i13 = onExtraCallbackWithResult + 113;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.applyNoticeTitle, imagePipelineExperimentsBuilderExternalSyntheticLambda18.applyNoticeTitle)) {
            return true;
        }
        int i15 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i15 % 128;
        return i15 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.caution.hashCode();
        return i3 == 0 ? (((((iHashCode << 71) >>> this.applyNotice.hashCode()) / 50) * this.applyAlert.hashCode()) >>> 38) * this.applyNoticeTitle.hashCode() : (((((iHashCode * 31) + this.applyNotice.hashCode()) * 31) + this.applyAlert.hashCode()) * 31) + this.applyNoticeTitle.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonRequestApplyInformation(caution=" + this.caution + ", applyNotice=" + this.applyNotice + ", applyAlert=" + this.applyAlert + ", applyNoticeTitle=" + this.applyNoticeTitle + ")";
        int i2 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        if (i4 == 0) {
            parcel.writeString(this.caution);
            parcel.writeString(this.applyNotice);
            parcel.writeString(this.applyAlert);
            parcel.writeString(this.applyNoticeTitle);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        parcel.writeString(this.caution);
        parcel.writeString(this.applyNotice);
        parcel.writeString(this.applyAlert);
        parcel.writeString(this.applyNoticeTitle);
        int i5 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public ImagePipelineExperimentsBuilderExternalSyntheticLambda18(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str4, BuildConfig.FLAVOR);
        this.caution = str;
        this.applyNotice = str2;
        this.applyAlert = str3;
        this.applyNoticeTitle = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda18(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 7;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 34 / 0;
            }
            str = BuildConfig.FLAVOR;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            str2 = BuildConfig.FLAVOR;
        }
        if ((i & 4) != 0) {
            int i6 = onWarmupCompleted + 121;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            str3 = BuildConfig.FLAVOR;
        }
        if ((i & 8) != 0) {
            int i8 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str4 = BuildConfig.FLAVOR;
        }
        this(str, str2, str3, str4);
    }
}
