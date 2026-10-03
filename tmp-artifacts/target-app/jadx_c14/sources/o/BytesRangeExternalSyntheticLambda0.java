package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BytesRangeExternalSyntheticLambda0 implements Parcelable {
    public static final Parcelable.Creator<BytesRangeExternalSyntheticLambda0> CREATOR = new IAuthTabCallback();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    @SerializedName("description")
    private final String description;

    @SerializedName("title")
    private final String title;

    @SerializedName("type")
    private final String type;

    public static final class IAuthTabCallback implements Parcelable.Creator<BytesRangeExternalSyntheticLambda0> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final BytesRangeExternalSyntheticLambda0[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 47;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            BytesRangeExternalSyntheticLambda0[] bytesRangeExternalSyntheticLambda0Arr = new BytesRangeExternalSyntheticLambda0[i];
            int i6 = i3 + 121;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 71 / 0;
            }
            return bytesRangeExternalSyntheticLambda0Arr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BytesRangeExternalSyntheticLambda0 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onNavigationEvent(parcel);
            }
            onNavigationEvent(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BytesRangeExternalSyntheticLambda0[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            BytesRangeExternalSyntheticLambda0[] bytesRangeExternalSyntheticLambda0ArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return bytesRangeExternalSyntheticLambda0ArrIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final BytesRangeExternalSyntheticLambda0 onNavigationEvent(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            BytesRangeExternalSyntheticLambda0 bytesRangeExternalSyntheticLambda0 = new BytesRangeExternalSyntheticLambda0(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 39 / 0;
            }
            return bytesRangeExternalSyntheticLambda0;
        }
    }

    static {
        int i = onNavigationEvent + 99;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 49 / 0;
        }
    }

    public BytesRangeExternalSyntheticLambda0() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 51;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 21;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BytesRangeExternalSyntheticLambda0)) {
            return false;
        }
        BytesRangeExternalSyntheticLambda0 bytesRangeExternalSyntheticLambda0 = (BytesRangeExternalSyntheticLambda0) obj;
        if (Intrinsics.areEqual(this.type, bytesRangeExternalSyntheticLambda0.type)) {
            return Intrinsics.areEqual(this.title, bytesRangeExternalSyntheticLambda0.title) && !(Intrinsics.areEqual(this.description, bytesRangeExternalSyntheticLambda0.description) ^ true);
        }
        int i4 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i4 % 128;
        return i4 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.type.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode();
        int i4 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ApplyTransitionPopup(type=" + this.type + ", title=" + this.title + ", description=" + this.description + ")";
        int i2 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 64 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        int i5 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public BytesRangeExternalSyntheticLambda0(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.type = str;
        this.title = str2;
        this.description = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BytesRangeExternalSyntheticLambda0(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 64 / 0;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = 2 % 2;
            str2 = "";
        }
        if ((i & 4) != 0) {
            int i5 = onExtraCallbackWithResult + 107;
            int i6 = i5 % 128;
            onWarmupCompleted = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 101;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str3 = "";
        }
        this(str, str2, str3);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.title;
        }
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 35;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.description;
        int i5 = i2 + 27;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
