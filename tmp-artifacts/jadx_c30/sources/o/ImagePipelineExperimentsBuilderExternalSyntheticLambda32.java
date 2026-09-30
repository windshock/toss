package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda32 implements Parcelable {
    public static final Parcelable.Creator<ImagePipelineExperimentsBuilderExternalSyntheticLambda32> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String loanProductId;
    private final String loanReqNo;

    public static final class IAuthTabCallback implements Parcelable.Creator<ImagePipelineExperimentsBuilderExternalSyntheticLambda32> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda32 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ImagePipelineExperimentsBuilderExternalSyntheticLambda32 imagePipelineExperimentsBuilderExternalSyntheticLambda32OnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = onNavigationEvent + 79;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return imagePipelineExperimentsBuilderExternalSyntheticLambda32OnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda32[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 115;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return onNavigationEvent(i);
            }
            onNavigationEvent(i);
            throw null;
        }

        public final ImagePipelineExperimentsBuilderExternalSyntheticLambda32 onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            ImagePipelineExperimentsBuilderExternalSyntheticLambda32 imagePipelineExperimentsBuilderExternalSyntheticLambda32 = new ImagePipelineExperimentsBuilderExternalSyntheticLambda32(parcel.readString(), parcel.readString());
            int i2 = onWarmupCompleted + 65;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return imagePipelineExperimentsBuilderExternalSyntheticLambda32;
        }

        public final ImagePipelineExperimentsBuilderExternalSyntheticLambda32[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 29;
            onWarmupCompleted = i4 % 128;
            ImagePipelineExperimentsBuilderExternalSyntheticLambda32[] imagePipelineExperimentsBuilderExternalSyntheticLambda32Arr = new ImagePipelineExperimentsBuilderExternalSyntheticLambda32[i];
            if (i4 % 2 != 0) {
                int i5 = 15 / 0;
            }
            int i6 = i3 + 55;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return imagePipelineExperimentsBuilderExternalSyntheticLambda32Arr;
        }
    }

    static {
        int i = IAuthTabCallback + 31;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ImagePipelineExperimentsBuilderExternalSyntheticLambda32() {
        String str = null;
        this(str, str, 3, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 47;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 85;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof ImagePipelineExperimentsBuilderExternalSyntheticLambda32)) {
            return false;
        }
        ImagePipelineExperimentsBuilderExternalSyntheticLambda32 imagePipelineExperimentsBuilderExternalSyntheticLambda32 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda32) obj;
        if (Intrinsics.areEqual(this.loanProductId, imagePipelineExperimentsBuilderExternalSyntheticLambda32.loanProductId)) {
            return Intrinsics.areEqual(this.loanReqNo, imagePipelineExperimentsBuilderExternalSyntheticLambda32.loanReqNo);
        }
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 15;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 19;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.loanProductId.hashCode();
        return i3 == 0 ? (iHashCode >>> 27) << this.loanReqNo.hashCode() : (iHashCode * 31) + this.loanReqNo.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanRefinancingPreScreeningProduct(loanProductId=" + this.loanProductId + ", loanReqNo=" + this.loanReqNo + ")";
        int i2 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i2 % 128;
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
        int i3 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        String str = this.loanProductId;
        if (i4 == 0) {
            parcel.writeString(str);
            parcel.writeString(this.loanReqNo);
        } else {
            parcel.writeString(str);
            parcel.writeString(this.loanReqNo);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public ImagePipelineExperimentsBuilderExternalSyntheticLambda32(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        this.loanProductId = str;
        this.loanReqNo = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda32(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            str = BuildConfig.FLAVOR;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallbackWithResult;
            int i5 = i4 + 41;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 119;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str2 = BuildConfig.FLAVOR;
        }
        this(str, str2);
    }
}
