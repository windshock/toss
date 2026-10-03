package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createRewardedInterstitialAd implements Parcelable {
    public static final Parcelable.Creator<createRewardedInterstitialAd> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String accountNumber;
    private final String bankCode;
    private final String createDate;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<createRewardedInterstitialAd> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createRewardedInterstitialAd createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onNavigationEvent(parcel);
            }
            onNavigationEvent(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createRewardedInterstitialAd[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 11;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            createRewardedInterstitialAd[] createrewardedinterstitialadArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onExtraCallback + 15;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return createrewardedinterstitialadArrOnWarmupCompleted;
            }
            throw null;
        }

        public final createRewardedInterstitialAd onNavigationEvent(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            createRewardedInterstitialAd createrewardedinterstitialad = new createRewardedInterstitialAd(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = onExtraCallback + 63;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 / 0;
            }
            return createrewardedinterstitialad;
        }

        public final createRewardedInterstitialAd[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 119;
            onWarmupCompleted = i3 % 128;
            createRewardedInterstitialAd[] createrewardedinterstitialadArr = new createRewardedInterstitialAd[i];
            if (i3 % 2 != 0) {
                return createrewardedinterstitialadArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 67;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 41;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 49;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        String str = this.bankCode;
        if (i4 == 0) {
            parcel.writeString(str);
            parcel.writeString(this.accountNumber);
            parcel.writeString(this.createDate);
        } else {
            parcel.writeString(str);
            parcel.writeString(this.accountNumber);
            parcel.writeString(this.createDate);
            int i5 = 3 / 0;
        }
    }

    public createRewardedInterstitialAd(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.bankCode = str;
        this.accountNumber = str2;
        this.createDate = str3;
    }
}
