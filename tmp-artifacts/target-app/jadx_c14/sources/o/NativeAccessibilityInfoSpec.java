package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeAccessibilityInfoSpec implements Parcelable {
    public static final Parcelable.Creator<NativeAccessibilityInfoSpec> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;

    @SerializedName("companyAddress")
    private final String companyAddress;

    @SerializedName("companyName")
    private final String companyName;

    @SerializedName("companyTel")
    private final String companyTel;

    @SerializedName("companyZipCode")
    private final String companyZipCode;

    @SerializedName("corporateNumber")
    private final String corporateNumber;

    @SerializedName("isClosed")
    private final boolean isClosed;

    public static final class onExtraCallback implements Parcelable.Creator<NativeAccessibilityInfoSpec> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeAccessibilityInfoSpec createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                onWarmupCompleted(parcel);
                throw null;
            }
            NativeAccessibilityInfoSpec nativeAccessibilityInfoSpecOnWarmupCompleted = onWarmupCompleted(parcel);
            int i3 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return nativeAccessibilityInfoSpecOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeAccessibilityInfoSpec[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return onExtraCallback(i);
            }
            onExtraCallback(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final NativeAccessibilityInfoSpec[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 11;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            NativeAccessibilityInfoSpec[] nativeAccessibilityInfoSpecArr = new NativeAccessibilityInfoSpec[i];
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 47;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return nativeAccessibilityInfoSpecArr;
        }

        public final NativeAccessibilityInfoSpec onWarmupCompleted(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                int i4 = onExtraCallbackWithResult + 89;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            }
            return new NativeAccessibilityInfoSpec(string, string2, string3, string4, string5, z);
        }
    }

    static {
        int i = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public NativeAccessibilityInfoSpec() {
        this(null, null, null, null, null, false, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 21;
            onExtraCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof NativeAccessibilityInfoSpec)) {
            int i3 = onExtraCallback + 111;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        NativeAccessibilityInfoSpec nativeAccessibilityInfoSpec = (NativeAccessibilityInfoSpec) obj;
        if (!Intrinsics.areEqual(this.companyAddress, nativeAccessibilityInfoSpec.companyAddress)) {
            int i5 = onExtraCallback + 37;
            onNavigationEvent = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.companyName, nativeAccessibilityInfoSpec.companyName)) {
            int i6 = onNavigationEvent + 119;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.companyTel, nativeAccessibilityInfoSpec.companyTel)) {
            int i8 = onExtraCallback + 29;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.companyZipCode, nativeAccessibilityInfoSpec.companyZipCode)) {
            return false;
        }
        if (Intrinsics.areEqual(this.corporateNumber, nativeAccessibilityInfoSpec.corporateNumber)) {
            return this.isClosed == nativeAccessibilityInfoSpec.isClosed;
        }
        int i10 = onExtraCallback + 59;
        int i11 = i10 % 128;
        onNavigationEvent = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 13;
        onExtraCallback = i13 % 128;
        if (i13 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.companyAddress.hashCode() * 31) + this.companyName.hashCode()) * 31) + this.companyTel.hashCode()) * 31) + this.companyZipCode.hashCode()) * 31) + this.corporateNumber.hashCode()) * 31) + Boolean.hashCode(this.isClosed);
        int i4 = onNavigationEvent + 69;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CompanySearchResult(companyAddress=" + this.companyAddress + ", companyName=" + this.companyName + ", companyTel=" + this.companyTel + ", companyZipCode=" + this.companyZipCode + ", corporateNumber=" + this.corporateNumber + ", isClosed=" + this.isClosed + ")";
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 21;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.companyAddress);
        parcel.writeString(this.companyName);
        parcel.writeString(this.companyTel);
        parcel.writeString(this.companyZipCode);
        parcel.writeString(this.corporateNumber);
        parcel.writeInt(this.isClosed ? 1 : 0);
        int i5 = onExtraCallback + 9;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public NativeAccessibilityInfoSpec(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.companyAddress = str;
        this.companyName = str2;
        this.companyTel = str3;
        this.companyZipCode = str4;
        this.corporateNumber = str5;
        this.isClosed = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeAccessibilityInfoSpec(String str, String str2, String str3, String str4, String str5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7 = (i & 1) != 0 ? "" : str;
        String str8 = (i & 2) != 0 ? "" : str2;
        String str9 = (i & 4) != 0 ? "" : str3;
        if ((i & 8) != 0) {
            int i2 = onExtraCallback + 61;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 / 5;
            } else {
                int i4 = 2 % 2;
            }
            str6 = "";
        } else {
            str6 = str4;
        }
        String str10 = (i & 16) == 0 ? str5 : "";
        if ((i & 32) != 0) {
            int i5 = onNavigationEvent + 125;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        this(str7, str8, str9, str6, str10, z);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.companyAddress;
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.companyName;
        int i5 = i3 + 77;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 77;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.companyTel;
        int i5 = i2 + 115;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.companyZipCode;
        int i5 = i2 + 17;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.corporateNumber;
        int i5 = i3 + 19;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean IAuthTabCallbackStub() {
        boolean z;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 15;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.isClosed;
            int i4 = 6 / 0;
        } else {
            z = this.isClosed;
        }
        int i5 = i2 + 111;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
