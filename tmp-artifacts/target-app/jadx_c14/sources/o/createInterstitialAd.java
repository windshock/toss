package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createInterstitialAd implements createNativeAdRatingApi {
    public static final Parcelable.Creator<createInterstitialAd> CREATOR = new onExtraCallback();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final int height;
    private final String key;
    private final String type;
    private final String url;
    private final int width;

    public static final class onExtraCallback implements Parcelable.Creator<createInterstitialAd> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public final createInterstitialAd IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            createInterstitialAd createinterstitialad = new createInterstitialAd(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
            int i2 = IAuthTabCallback + 5;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 67 / 0;
            }
            return createinterstitialad;
        }

        public final createInterstitialAd[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 7;
            IAuthTabCallback = i3 % 128;
            createInterstitialAd[] createinterstitialadArr = new createInterstitialAd[i];
            if (i3 % 2 == 0) {
                int i4 = 46 / 0;
            }
            return createinterstitialadArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createInterstitialAd createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            createInterstitialAd createinterstitialadIAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = IAuthTabCallback + 7;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return createinterstitialadIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createInterstitialAd[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 85;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            createInterstitialAd[] createinterstitialadArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = IAuthTabCallback + 105;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return createinterstitialadArrIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 67;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 13;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 == 0) {
            parcel.writeString(this.type);
            parcel.writeString(this.key);
            parcel.writeString(this.url);
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
            int i5 = 58 / 0;
        } else {
            parcel.writeString(this.type);
            parcel.writeString(this.key);
            parcel.writeString(this.url);
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
        }
        int i6 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public createInterstitialAd(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.type = str;
        this.key = str2;
        this.url = str3;
        this.width = i;
        this.height = i2;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 39;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.url;
        int i5 = i2 + 51;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 83;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.width;
        int i6 = i2 + 43;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = this.height;
        int i6 = i3 + 3;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }
}
