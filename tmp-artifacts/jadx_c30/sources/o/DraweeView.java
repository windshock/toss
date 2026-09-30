package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class DraweeView implements Parcelable {
    public static final onExtraCallback CREATOR = new onExtraCallback(null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String deliveryCompanyName;
    private final String deliveryCompanyTelNo;
    private final String deliveryStatus;
    private final String registrationNumber;
    private final String sendDate;
    private final String statusCode;

    static {
        int i = onExtraCallback + 75;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 89 / 0;
        }
    }

    public DraweeView() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof DraweeView)) {
            return false;
        }
        DraweeView draweeView = (DraweeView) obj;
        if (!Intrinsics.areEqual(this.statusCode, draweeView.statusCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.deliveryCompanyName, draweeView.deliveryCompanyName)) {
            int i4 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.deliveryStatus, draweeView.deliveryStatus)) {
            int i6 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.registrationNumber, draweeView.registrationNumber)) {
            return false;
        }
        if (Intrinsics.areEqual(this.sendDate, draweeView.sendDate)) {
            return Intrinsics.areEqual(this.deliveryCompanyTelNo, draweeView.deliveryCompanyTelNo);
        }
        int i8 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.statusCode.hashCode() * 31) + this.deliveryCompanyName.hashCode()) * 31) + this.deliveryStatus.hashCode()) * 31) + this.registrationNumber.hashCode()) * 31) + this.sendDate.hashCode()) * 31) + this.deliveryCompanyTelNo.hashCode();
        int i4 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CheckCardDeliveryStatus(statusCode=" + this.statusCode + ", deliveryCompanyName=" + this.deliveryCompanyName + ", deliveryStatus=" + this.deliveryStatus + ", registrationNumber=" + this.registrationNumber + ", sendDate=" + this.sendDate + ", deliveryCompanyTelNo=" + this.deliveryCompanyTelNo + ")";
        int i2 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public DraweeView(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str4, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str5, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str6, BuildConfig.FLAVOR);
        this.statusCode = str;
        this.deliveryCompanyName = str2;
        this.deliveryStatus = str3;
        this.registrationNumber = str4;
        this.sendDate = str5;
        this.deliveryCompanyTelNo = str6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DraweeView(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8;
        String str9;
        int i2 = i & 1;
        String str10 = BuildConfig.FLAVOR;
        if (i2 != 0) {
            int i3 = 2 % 2;
            str = BuildConfig.FLAVOR;
        }
        String str11 = (i & 2) != 0 ? BuildConfig.FLAVOR : str2;
        if ((i & 4) != 0) {
            int i4 = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            str7 = BuildConfig.FLAVOR;
        } else {
            str7 = str3;
        }
        if ((i & 8) != 0) {
            int i6 = 2 % 2;
            str8 = BuildConfig.FLAVOR;
        } else {
            str8 = str4;
        }
        if ((i & 16) != 0) {
            int i7 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i8 = 2 % 2;
            str9 = BuildConfig.FLAVOR;
        } else {
            str9 = str5;
        }
        if ((i & 32) != 0) {
            int i9 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
        } else {
            str10 = str6;
        }
        this(str, str11, str7, str8, str9, str10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DraweeView(@NotNull Parcel parcel) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        String string = parcel.readString();
        if (string == null) {
            int i = 2 % 2;
            str = BuildConfig.FLAVOR;
        } else {
            str = string;
        }
        String string2 = parcel.readString();
        String str6 = string2 == null ? BuildConfig.FLAVOR : string2;
        String string3 = parcel.readString();
        if (string3 == null) {
            int i2 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str2 = BuildConfig.FLAVOR;
        } else {
            str2 = string3;
        }
        String string4 = parcel.readString();
        if (string4 == null) {
            int i4 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            str3 = BuildConfig.FLAVOR;
        } else {
            str3 = string4;
        }
        String string5 = parcel.readString();
        if (string5 == null) {
            int i6 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            str4 = BuildConfig.FLAVOR;
        } else {
            str4 = string5;
        }
        String string6 = parcel.readString();
        if (string6 == null) {
            int i8 = 2 % 2;
            str5 = BuildConfig.FLAVOR;
        } else {
            str5 = string6;
        }
        this(str, str6, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeString(this.statusCode);
        parcel.writeString(this.deliveryCompanyName);
        parcel.writeString(this.deliveryStatus);
        parcel.writeString(this.registrationNumber);
        parcel.writeString(this.sendDate);
        parcel.writeString(this.deliveryCompanyTelNo);
        int i5 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final class onExtraCallback implements Parcelable.Creator<DraweeView> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DraweeView createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            DraweeView draweeViewOnExtraCallback = onExtraCallback(parcel);
            int i4 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return draweeViewOnExtraCallback;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DraweeView[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                onExtraCallbackWithResult(i);
                obj.hashCode();
                throw null;
            }
            DraweeView[] draweeViewArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i4 = onExtraCallbackWithResult + 125;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return draweeViewArrOnExtraCallbackWithResult;
            }
            throw null;
        }

        public DraweeView onExtraCallback(@NotNull Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            DraweeView draweeView = new DraweeView(parcel);
            int i2 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return draweeView;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public DraweeView[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 109;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            DraweeView[] draweeViewArr = new DraweeView[i];
            if (i3 % 2 == 0) {
                int i5 = 72 / 0;
            }
            int i6 = i4 + 119;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return draweeViewArr;
        }
    }
}
