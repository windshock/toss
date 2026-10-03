package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createNativeAdBaseApi implements Parcelable {
    public static final Parcelable.Creator<createNativeAdBaseApi> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String cta;
    private final String subTitle;
    private final String title;

    public static final class onExtraCallback implements Parcelable.Creator<createNativeAdBaseApi> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final createNativeAdBaseApi IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            createNativeAdBaseApi createnativeadbaseapi = new createNativeAdBaseApi(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = onExtraCallback + 107;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return createnativeadbaseapi;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeAdBaseApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            createNativeAdBaseApi createnativeadbaseapiIAuthTabCallback = IAuthTabCallback(parcel);
            if (i3 == 0) {
                int i4 = 31 / 0;
            }
            return createnativeadbaseapiIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeAdBaseApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 33;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                onExtraCallbackWithResult(i);
                throw null;
            }
            createNativeAdBaseApi[] createnativeadbaseapiArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i4 = onWarmupCompleted + 81;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return createnativeadbaseapiArrOnExtraCallbackWithResult;
        }

        public final createNativeAdBaseApi[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 103;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            createNativeAdBaseApi[] createnativeadbaseapiArr = new createNativeAdBaseApi[i];
            int i6 = i4 + 123;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return createnativeadbaseapiArr;
        }
    }

    static {
        int i = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 44 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 85;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 71;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 87;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 43;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof createNativeAdBaseApi)) {
            return false;
        }
        createNativeAdBaseApi createnativeadbaseapi = (createNativeAdBaseApi) obj;
        if (!Intrinsics.areEqual(this.title, createnativeadbaseapi.title)) {
            int i7 = onExtraCallback + 9;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.subTitle, createnativeadbaseapi.subTitle)) {
            return false;
        }
        if (Intrinsics.areEqual(this.cta, createnativeadbaseapi.cta)) {
            return true;
        }
        int i9 = onExtraCallback + 13;
        IAuthTabCallback = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.title.hashCode();
        return i3 != 0 ? (((iHashCode >>> 117) / this.subTitle.hashCode()) >>> 51) - this.cta.hashCode() : (((iHashCode * 31) + this.subTitle.hashCode()) * 31) + this.cta.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Dialog(title=" + this.title + ", subTitle=" + this.subTitle + ", cta=" + this.cta + ")";
        int i2 = onExtraCallback + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 27;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 == 0) {
            parcel.writeString(this.title);
            parcel.writeString(this.subTitle);
            parcel.writeString(this.cta);
            throw null;
        }
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        parcel.writeString(this.cta);
        int i5 = onExtraCallback + 105;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public createNativeAdBaseApi(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.title = str;
        this.subTitle = str2;
        this.cta = str3;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.title;
        int i4 = i3 + 111;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.subTitle;
        int i5 = i3 + 11;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.cta;
        int i5 = i3 + 59;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
