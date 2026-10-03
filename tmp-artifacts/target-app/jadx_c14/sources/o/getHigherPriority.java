package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getHigherPriority implements Parcelable {
    public static final Parcelable.Creator<getHigherPriority> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;

    @SerializedName("amount")
    private final long amount;

    @SerializedName("companyName")
    private final String companyName;

    @SerializedName("interestRate")
    private final float interestRate;

    @SerializedName("logoImageUrl")
    private final String logoImageUrl;

    public static final class onWarmupCompleted implements Parcelable.Creator<getHigherPriority> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getHigherPriority createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getHigherPriority gethigherpriorityOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return gethigherpriorityOnExtraCallbackWithResult;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getHigherPriority[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 19;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                onExtraCallbackWithResult(i);
                throw null;
            }
            getHigherPriority[] gethigherpriorityArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i4 = onNavigationEvent + 71;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return gethigherpriorityArrOnExtraCallbackWithResult;
        }

        public final getHigherPriority onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            getHigherPriority gethigherpriority = new getHigherPriority(parcel.readString(), parcel.readFloat(), parcel.readLong(), parcel.readString());
            int i2 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return gethigherpriority;
        }

        public final getHigherPriority[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i3 % 128;
            getHigherPriority[] gethigherpriorityArr = new getHigherPriority[i];
            if (i3 % 2 == 0) {
                return gethigherpriorityArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 77;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getHigherPriority() {
        this(null, 0.0f, 0L, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getHigherPriority)) {
            int i4 = i3 + 105;
            onExtraCallbackWithResult = i4 % 128;
            return i4 % 2 != 0;
        }
        getHigherPriority gethigherpriority = (getHigherPriority) obj;
        if (!Intrinsics.areEqual(this.companyName, gethigherpriority.companyName)) {
            int i5 = onExtraCallback + 85;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Float.compare(this.interestRate, gethigherpriority.interestRate) != 0 || this.amount != gethigherpriority.amount || !Intrinsics.areEqual(this.logoImageUrl, gethigherpriority.logoImageUrl)) {
            return false;
        }
        int i7 = onExtraCallback + 93;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 58 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.companyName.hashCode() * 31) + Float.hashCode(this.interestRate)) * 31) + Long.hashCode(this.amount)) * 31) + this.logoImageUrl.hashCode();
        int i4 = onExtraCallback + 43;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ExistingHighestInterestLoanInfo(companyName=" + this.companyName + ", interestRate=" + this.interestRate + ", amount=" + this.amount + ", logoImageUrl=" + this.logoImageUrl + ")";
        int i2 = onExtraCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.companyName);
        parcel.writeFloat(this.interestRate);
        parcel.writeLong(this.amount);
        parcel.writeString(this.logoImageUrl);
        int i5 = onExtraCallbackWithResult + 33;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public getHigherPriority(@NotNull String str, float f, long j, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.companyName = str;
        this.interestRate = f;
        this.amount = j;
        this.logoImageUrl = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getHigherPriority(String str, float f, long j, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str3 = "";
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 121;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 / 0;
            }
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallbackWithResult + 113;
            onExtraCallback = i5 % 128;
            f = i5 % 2 == 0 ? 2.0f : 0.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            int i6 = 2 % 2;
            j = 0;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            int i7 = onExtraCallback + 33;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        } else {
            str3 = str2;
        }
        this(str, f2, j2, str3);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.companyName;
        int i4 = i3 + 83;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return str;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        float f = this.interestRate;
        int i5 = i3 + 33;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final long IAuthTabCallback() {
        long j;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 87;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            j = this.amount;
            int i4 = 79 / 0;
        } else {
            j = this.amount;
        }
        int i5 = i2 + 5;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.logoImageUrl;
        int i5 = i3 + 79;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
