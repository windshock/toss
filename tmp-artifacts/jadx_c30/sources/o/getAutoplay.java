package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getAutoplay implements Parcelable {
    public static final Parcelable.Creator<getAutoplay> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("account")
    private final String account;

    @SerializedName("bankCode")
    private final int bankCode;

    public static final class IAuthTabCallback implements Parcelable.Creator<getAutoplay> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final getAutoplay IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            getAutoplay getautoplay = new getAutoplay(parcel.readString(), parcel.readInt());
            int i2 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return getautoplay;
            }
            throw null;
        }

        public final getAutoplay[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 81;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            getAutoplay[] getautoplayArr = new getAutoplay[i];
            int i6 = i4 + 51;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return getautoplayArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getAutoplay createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getAutoplay getautoplayIAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return getautoplayIAuthTabCallback;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getAutoplay[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return IAuthTabCallback(i);
            }
            IAuthTabCallback(i);
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 101;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 10 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 53;
        IAuthTabCallback = i3 % 128;
        int i4 = (i3 % 2 == 0 ? 0 : 1) ^ 1;
        int i5 = i2 + 67;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 50 / 0;
        }
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 77;
            IAuthTabCallback = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!(obj instanceof getAutoplay)) {
            return false;
        }
        getAutoplay getautoplay = (getAutoplay) obj;
        if (!Intrinsics.areEqual(this.account, getautoplay.account)) {
            int i5 = onExtraCallbackWithResult + 19;
            IAuthTabCallback = i5 % 128;
            return i5 % 2 == 0;
        }
        if (this.bankCode == getautoplay.bankCode) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 3;
        int i7 = i6 % 128;
        IAuthTabCallback = i7;
        boolean z = !(i6 % 2 != 0);
        int i8 = i7 + 1;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 0 / 0;
        }
        return z;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.account.hashCode() * 31) + Integer.hashCode(this.bankCode);
        int i4 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "InquiryBankAccount(account=" + this.account + ", bankCode=" + this.bankCode + ")";
        int i2 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeString(this.account);
        parcel.writeInt(this.bankCode);
        int i5 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
    }

    public getAutoplay(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.account = str;
        this.bankCode = i;
    }
}
