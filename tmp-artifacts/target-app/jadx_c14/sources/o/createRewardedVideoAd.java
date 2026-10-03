package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createRewardedVideoAd implements Parcelable {
    public static final Parcelable.Creator<createRewardedVideoAd> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String accountNumber;
    private final String bankCode;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<createRewardedVideoAd> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createRewardedVideoAd createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            createRewardedVideoAd createrewardedvideoadOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            if (i3 != 0) {
                int i4 = 98 / 0;
            }
            return createrewardedvideoadOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createRewardedVideoAd[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 15;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return onExtraCallback(i);
            }
            onExtraCallback(i);
            throw null;
        }

        public final createRewardedVideoAd[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 39;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            createRewardedVideoAd[] createrewardedvideoadArr = new createRewardedVideoAd[i];
            int i6 = i4 + 109;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return createrewardedvideoadArr;
        }

        public final createRewardedVideoAd onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            createRewardedVideoAd createrewardedvideoad = new createRewardedVideoAd(parcel.readString(), parcel.readString());
            int i2 = onNavigationEvent + 103;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return createrewardedvideoad;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 69;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        String str = this.bankCode;
        if (i4 != 0) {
            parcel.writeString(str);
            parcel.writeString(this.accountNumber);
        } else {
            parcel.writeString(str);
            parcel.writeString(this.accountNumber);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public createRewardedVideoAd(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.bankCode = str;
        this.accountNumber = str2;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 13;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bankCode;
        int i5 = i2 + 7;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 123;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.accountNumber;
            int i4 = 51 / 0;
        } else {
            str = this.accountNumber;
        }
        int i5 = i2 + 51;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
