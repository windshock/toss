package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda17 implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda17[] $VALUES;
    public static final Parcelable.Creator<ImagePipelineExperimentsBuilderExternalSyntheticLambda17> CREATOR;
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final String text;

    @SerializedName("CREDIT")
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda17 CREDIT = new ImagePipelineExperimentsBuilderExternalSyntheticLambda17("CREDIT", 0, "신용대출");

    @SerializedName("REFINANCING")
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda17 REFINANCING = new ImagePipelineExperimentsBuilderExternalSyntheticLambda17("REFINANCING", 1, "대환대출");

    @SerializedName("BUSINESS_REFINANCING")
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda17 BUSINESS_REFINANCING = new ImagePipelineExperimentsBuilderExternalSyntheticLambda17("BUSINESS_REFINANCING", 2, "사업자대환대출");

    private static final /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda17[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 1;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda17[] imagePipelineExperimentsBuilderExternalSyntheticLambda17Arr = {CREDIT, REFINANCING, BUSINESS_REFINANCING};
        int i5 = i2 + 103;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return imagePipelineExperimentsBuilderExternalSyntheticLambda17Arr;
        }
        throw null;
    }

    public static EnumEntries<ImagePipelineExperimentsBuilderExternalSyntheticLambda17> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 93;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<ImagePipelineExperimentsBuilderExternalSyntheticLambda17> enumEntries = $ENTRIES;
        int i5 = i2 + 3;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static ImagePipelineExperimentsBuilderExternalSyntheticLambda17 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda17 imagePipelineExperimentsBuilderExternalSyntheticLambda17 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda17) Enum.valueOf(ImagePipelineExperimentsBuilderExternalSyntheticLambda17.class, str);
        if (i3 == 0) {
            return imagePipelineExperimentsBuilderExternalSyntheticLambda17;
        }
        throw null;
    }

    public static ImagePipelineExperimentsBuilderExternalSyntheticLambda17[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda17[] imagePipelineExperimentsBuilderExternalSyntheticLambda17Arr = (ImagePipelineExperimentsBuilderExternalSyntheticLambda17[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return imagePipelineExperimentsBuilderExternalSyntheticLambda17Arr;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 29;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 3;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
        int i5 = onExtraCallback + 7;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    private ImagePipelineExperimentsBuilderExternalSyntheticLambda17(String str, int i, String str2) {
        this.text = str2;
    }

    public final String getText() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 43;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.text;
        int i5 = i2 + 79;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        ImagePipelineExperimentsBuilderExternalSyntheticLambda17[] imagePipelineExperimentsBuilderExternalSyntheticLambda17Arr$values = $values();
        $VALUES = imagePipelineExperimentsBuilderExternalSyntheticLambda17Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(imagePipelineExperimentsBuilderExternalSyntheticLambda17Arr$values);
        Companion = new onNavigationEvent(null);
        CREATOR = new Parcelable.Creator<ImagePipelineExperimentsBuilderExternalSyntheticLambda17>() { // from class: o.ImagePipelineExperimentsBuilderExternalSyntheticLambda17.onExtraCallback
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda17 createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 39;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                ImagePipelineExperimentsBuilderExternalSyntheticLambda17 imagePipelineExperimentsBuilderExternalSyntheticLambda17OnExtraCallback = onExtraCallback(parcel);
                if (i3 != 0) {
                    int i4 = 76 / 0;
                }
                return imagePipelineExperimentsBuilderExternalSyntheticLambda17OnExtraCallback;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda17[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 91;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                ImagePipelineExperimentsBuilderExternalSyntheticLambda17[] imagePipelineExperimentsBuilderExternalSyntheticLambda17ArrOnNavigationEvent = onNavigationEvent(i);
                int i5 = onExtraCallback + 55;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 24 / 0;
                }
                return imagePipelineExperimentsBuilderExternalSyntheticLambda17ArrOnNavigationEvent;
            }

            public final ImagePipelineExperimentsBuilderExternalSyntheticLambda17 onExtraCallback(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 111;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                ImagePipelineExperimentsBuilderExternalSyntheticLambda17 imagePipelineExperimentsBuilderExternalSyntheticLambda17ValueOf = ImagePipelineExperimentsBuilderExternalSyntheticLambda17.valueOf(parcel.readString());
                int i4 = onExtraCallback + 37;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return imagePipelineExperimentsBuilderExternalSyntheticLambda17ValueOf;
                }
                throw null;
            }

            public final ImagePipelineExperimentsBuilderExternalSyntheticLambda17[] onNavigationEvent(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 83;
                int i4 = i3 % 128;
                onExtraCallback = i4;
                int i5 = i3 % 2;
                ImagePipelineExperimentsBuilderExternalSyntheticLambda17[] imagePipelineExperimentsBuilderExternalSyntheticLambda17Arr = new ImagePipelineExperimentsBuilderExternalSyntheticLambda17[i];
                int i6 = i4 + 93;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 89 / 0;
                }
                return imagePipelineExperimentsBuilderExternalSyntheticLambda17Arr;
            }
        };
        int i = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 51 / 0;
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
