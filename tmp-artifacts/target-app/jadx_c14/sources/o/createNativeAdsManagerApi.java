package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createNativeAdsManagerApi implements createNativeAdRatingApi {
    public static final Parcelable.Creator<createNativeAdsManagerApi> CREATOR = new onExtraCallback();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final long height;
    private final String key;
    private final String type;

    public static final class onExtraCallback implements Parcelable.Creator<createNativeAdsManagerApi> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeAdsManagerApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onWarmupCompleted(parcel);
                throw null;
            }
            createNativeAdsManagerApi createnativeadsmanagerapiOnWarmupCompleted = onWarmupCompleted(parcel);
            int i3 = onExtraCallback + 25;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return createnativeadsmanagerapiOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeAdsManagerApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 115;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            createNativeAdsManagerApi[] createnativeadsmanagerapiArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onExtraCallbackWithResult + 27;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return createnativeadsmanagerapiArrOnWarmupCompleted;
        }

        public final createNativeAdsManagerApi onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            createNativeAdsManagerApi createnativeadsmanagerapi = new createNativeAdsManagerApi(parcel.readString(), parcel.readString(), parcel.readLong());
            int i2 = onExtraCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return createnativeadsmanagerapi;
        }

        public final createNativeAdsManagerApi[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 53;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            createNativeAdsManagerApi[] createnativeadsmanagerapiArr = new createNativeAdsManagerApi[i];
            int i6 = i4 + 57;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return createnativeadsmanagerapiArr;
        }
    }

    static {
        int i = onNavigationEvent + 109;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 8 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 105;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 69;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 63;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 113;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof createNativeAdsManagerApi)) {
            return false;
        }
        createNativeAdsManagerApi createnativeadsmanagerapi = (createNativeAdsManagerApi) obj;
        if (!Intrinsics.areEqual(this.type, createnativeadsmanagerapi.type)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.key, createnativeadsmanagerapi.key)) {
            int i5 = onExtraCallback + 7;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 28 / 0;
            }
            return false;
        }
        if (this.height == createnativeadsmanagerapi.height) {
            return true;
        }
        int i7 = onWarmupCompleted + 23;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.type.hashCode();
        return i3 == 0 ? (((iHashCode - 72) / this.key.hashCode()) << 6) - Long.hashCode(this.height) : (((iHashCode * 31) + this.key.hashCode()) * 31) + Long.hashCode(this.height);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SpaceField(type=" + this.type + ", key=" + this.key + ", height=" + this.height + ")";
        int i2 = onExtraCallback + 33;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 11;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeString(this.type);
            parcel.writeString(this.key);
            parcel.writeLong(this.height);
            int i5 = 35 / 0;
        } else {
            parcel.writeString(this.type);
            parcel.writeString(this.key);
            parcel.writeLong(this.height);
        }
        int i6 = onWarmupCompleted + 77;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public createNativeAdsManagerApi(@NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.type = str;
        this.key = str2;
        this.height = j;
    }

    public final long onExtraCallback() {
        long j;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 111;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            j = this.height;
            int i4 = 5 / 0;
        } else {
            j = this.height;
        }
        int i5 = i2 + 37;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
