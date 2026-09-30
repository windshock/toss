package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda33 implements Parcelable {
    public static final Parcelable.Creator<ImagePipelineExperimentsBuilderExternalSyntheticLambda33> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    @SerializedName("style")
    private final String style;

    @SerializedName(TextBundle.TEXT_ENTRY)
    private final String text;

    @SerializedName("type")
    private final String type;

    public static final class onNavigationEvent implements Parcelable.Creator<ImagePipelineExperimentsBuilderExternalSyntheticLambda33> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda33 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                onNavigationEvent(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ImagePipelineExperimentsBuilderExternalSyntheticLambda33 imagePipelineExperimentsBuilderExternalSyntheticLambda33OnNavigationEvent = onNavigationEvent(parcel);
            int i3 = onWarmupCompleted + 91;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 51 / 0;
            }
            return imagePipelineExperimentsBuilderExternalSyntheticLambda33OnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda33[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 63;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            ImagePipelineExperimentsBuilderExternalSyntheticLambda33[] imagePipelineExperimentsBuilderExternalSyntheticLambda33ArrOnExtraCallback = onExtraCallback(i);
            int i5 = IAuthTabCallback + 125;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return imagePipelineExperimentsBuilderExternalSyntheticLambda33ArrOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ImagePipelineExperimentsBuilderExternalSyntheticLambda33[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 109;
            IAuthTabCallback = i3 % 128;
            ImagePipelineExperimentsBuilderExternalSyntheticLambda33[] imagePipelineExperimentsBuilderExternalSyntheticLambda33Arr = new ImagePipelineExperimentsBuilderExternalSyntheticLambda33[i];
            if (i3 % 2 == 0) {
                return imagePipelineExperimentsBuilderExternalSyntheticLambda33Arr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ImagePipelineExperimentsBuilderExternalSyntheticLambda33 onNavigationEvent(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            ImagePipelineExperimentsBuilderExternalSyntheticLambda33 imagePipelineExperimentsBuilderExternalSyntheticLambda33 = new ImagePipelineExperimentsBuilderExternalSyntheticLambda33(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = IAuthTabCallback + 1;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return imagePipelineExperimentsBuilderExternalSyntheticLambda33;
            }
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ImagePipelineExperimentsBuilderExternalSyntheticLambda33() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 37;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 5;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 45;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof ImagePipelineExperimentsBuilderExternalSyntheticLambda33)) {
            return false;
        }
        ImagePipelineExperimentsBuilderExternalSyntheticLambda33 imagePipelineExperimentsBuilderExternalSyntheticLambda33 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda33) obj;
        if (Intrinsics.areEqual(this.text, imagePipelineExperimentsBuilderExternalSyntheticLambda33.text)) {
            return Intrinsics.areEqual(this.style, imagePipelineExperimentsBuilderExternalSyntheticLambda33.style) && Intrinsics.areEqual(this.type, imagePipelineExperimentsBuilderExternalSyntheticLambda33.type);
        }
        int i6 = onNavigationEvent + 53;
        onExtraCallback = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.type.hashCode();
        int i4 = onExtraCallback + 69;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanProductButton(text=" + this.text + ", style=" + this.style + ", type=" + this.type + ")";
        int i2 = onExtraCallback + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 29;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeString(this.text);
        parcel.writeString(this.style);
        parcel.writeString(this.type);
        int i5 = onExtraCallback + 87;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public ImagePipelineExperimentsBuilderExternalSyntheticLambda33(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        this.text = str;
        this.style = str2;
        this.type = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda33(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 1;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 19;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str = BuildConfig.FLAVOR;
        }
        this(str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2, (i & 4) != 0 ? BuildConfig.FLAVOR : str3);
    }
}
