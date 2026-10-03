package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createNativeAdImageApi implements createNativeAdRatingApi {
    public static final Parcelable.Creator<createNativeAdImageApi> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String key;
    private final String title;
    private final String type;

    public static final class onNavigationEvent implements Parcelable.Creator<createNativeAdImageApi> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeAdImageApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            createNativeAdImageApi createnativeadimageapiOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 76 / 0;
            }
            return createnativeadimageapiOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeAdImageApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 103;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            createNativeAdImageApi[] createnativeadimageapiArrOnNavigationEvent = onNavigationEvent(i);
            int i5 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 10 / 0;
            }
            return createnativeadimageapiArrOnNavigationEvent;
        }

        public final createNativeAdImageApi onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            createNativeAdImageApi createnativeadimageapi = new createNativeAdImageApi(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return createnativeadimageapi;
        }

        public final createNativeAdImageApi[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 51;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            createNativeAdImageApi[] createnativeadimageapiArr = new createNativeAdImageApi[i];
            int i6 = i3 + 75;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return createnativeadimageapiArr;
        }
    }

    static {
        int i = onWarmupCompleted + 41;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createNativeAdImageApi)) {
            return false;
        }
        createNativeAdImageApi createnativeadimageapi = (createNativeAdImageApi) obj;
        if (!Intrinsics.areEqual(this.key, createnativeadimageapi.key)) {
            int i3 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.type, createnativeadimageapi.type)) {
            return false;
        }
        if (Intrinsics.areEqual(this.title, createnativeadimageapi.title)) {
            return true;
        }
        int i5 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i5 % 128;
        return i5 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.key.hashCode() * 31) + this.type.hashCode()) * 31) + this.title.hashCode();
        int i4 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ListHeaderField(key=" + this.key + ", type=" + this.type + ", title=" + this.title + ")";
        int i2 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        String str = this.key;
        if (i4 != 0) {
            parcel.writeString(str);
            parcel.writeString(this.type);
            parcel.writeString(this.title);
        } else {
            parcel.writeString(str);
            parcel.writeString(this.type);
            parcel.writeString(this.title);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public createNativeAdImageApi(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.key = str;
        this.type = str2;
        this.title = str3;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 77;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
