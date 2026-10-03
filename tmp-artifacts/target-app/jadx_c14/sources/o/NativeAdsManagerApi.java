package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeAdsManagerApi implements Parcelable {
    public static final Parcelable.Creator<NativeAdsManagerApi> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String encryptionKeyNo;
    private final createAdViewApi paddingScheme;
    private final String publicKey;

    public static final class onWarmupCompleted implements Parcelable.Creator<NativeAdsManagerApi> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeAdsManagerApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            NativeAdsManagerApi nativeAdsManagerApiOnExtraCallback = onExtraCallback(parcel);
            int i4 = onWarmupCompleted + 63;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return nativeAdsManagerApiOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeAdsManagerApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 13;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            NativeAdsManagerApi[] nativeAdsManagerApiArrOnWarmupCompleted = onWarmupCompleted(i);
            if (i4 == 0) {
                int i5 = 57 / 0;
            }
            return nativeAdsManagerApiArrOnWarmupCompleted;
        }

        public final NativeAdsManagerApi onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            NativeAdsManagerApi nativeAdsManagerApi = new NativeAdsManagerApi(parcel.readString(), createAdViewApi.valueOf(parcel.readString()), parcel.readString());
            int i2 = onExtraCallbackWithResult + 33;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 54 / 0;
            }
            return nativeAdsManagerApi;
        }

        public final NativeAdsManagerApi[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i3 % 128;
            NativeAdsManagerApi[] nativeAdsManagerApiArr = new NativeAdsManagerApi[i];
            if (i3 % 2 != 0) {
                return nativeAdsManagerApiArr;
            }
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 55;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        return 1 ^ (i2 % 2 != 0 ? 0 : 1);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 91;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof NativeAdsManagerApi)) {
            int i4 = onExtraCallback + 63;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        NativeAdsManagerApi nativeAdsManagerApi = (NativeAdsManagerApi) obj;
        if (!Intrinsics.areEqual(this.publicKey, nativeAdsManagerApi.publicKey)) {
            return false;
        }
        if (this.paddingScheme != nativeAdsManagerApi.paddingScheme) {
            int i6 = onWarmupCompleted + 119;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.encryptionKeyNo, nativeAdsManagerApi.encryptionKeyNo)) {
            int i8 = onExtraCallback + 101;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = onWarmupCompleted + 53;
        onExtraCallback = i10 % 128;
        if (i10 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.publicKey.hashCode();
        int iHashCode2 = this.paddingScheme.hashCode();
        String str = this.encryptionKeyNo;
        if (str == null) {
            int i3 = onExtraCallback + 63;
            onWarmupCompleted = i3 % 128;
            i = i3 % 2 == 0 ? 1 : 0;
        } else {
            int iHashCode3 = str.hashCode();
            int i4 = onWarmupCompleted + 109;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            i = iHashCode3;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardIssueRSAEncryptInfo(publicKey=" + this.publicKey + ", paddingScheme=" + this.paddingScheme + ", encryptionKeyNo=" + this.encryptionKeyNo + ")";
        int i2 = onExtraCallback + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.publicKey);
        parcel.writeString(this.paddingScheme.name());
        parcel.writeString(this.encryptionKeyNo);
        int i5 = onExtraCallback + 37;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public NativeAdsManagerApi(@NotNull String str, @NotNull createAdViewApi createadviewapi, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(createadviewapi, "");
        this.publicKey = str;
        this.paddingScheme = createadviewapi;
        this.encryptionKeyNo = str2;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.publicKey;
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        return str;
    }

    public final createAdViewApi IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        createAdViewApi createadviewapi = this.paddingScheme;
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
        return createadviewapi;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 77;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.encryptionKeyNo;
        int i5 = i2 + 23;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
