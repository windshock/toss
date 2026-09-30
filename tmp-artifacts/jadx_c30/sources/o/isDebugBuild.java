package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class isDebugBuild implements RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 {
    public static final Parcelable.Creator<isDebugBuild> CREATOR = new onExtraCallback();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String cardAddressType;
    private final NativeAdLayoutApi home;
    private final NativeAdLayoutApi office;
    private final String officeDepartment;
    private final String officeName;
    private final String officePhone;
    private final NativeAdLayoutApi realEstate;
    private final Boolean rememberAddress;

    public static final class onExtraCallback implements Parcelable.Creator<isDebugBuild> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ isDebugBuild createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onNavigationEvent(parcel);
            }
            onNavigationEvent(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ isDebugBuild[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 17;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                onWarmupCompleted(i);
                throw null;
            }
            isDebugBuild[] isdebugbuildArrOnWarmupCompleted = onWarmupCompleted(i);
            int i4 = onWarmupCompleted + 43;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return isdebugbuildArrOnWarmupCompleted;
            }
            throw null;
        }

        public final isDebugBuild onNavigationEvent(Parcel parcel) {
            Object objCreateFromParcel;
            boolean z;
            Boolean boolValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            Parcelable.Creator creator = NativeAdLayoutApi.CREATOR;
            NativeAdLayoutApi nativeAdLayoutApi = (NativeAdLayoutApi) creator.createFromParcel(parcel);
            Object obj = null;
            if (parcel.readInt() == 0) {
                int i2 = onWarmupCompleted + 123;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                objCreateFromParcel = null;
            } else {
                objCreateFromParcel = creator.createFromParcel(parcel);
            }
            NativeAdLayoutApi nativeAdLayoutApi2 = (NativeAdLayoutApi) objCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            NativeAdLayoutApi nativeAdLayoutApi3 = (NativeAdLayoutApi) (parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = onWarmupCompleted + 27;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i5 = onWarmupCompleted + 77;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new isDebugBuild(nativeAdLayoutApi, nativeAdLayoutApi2, string, string2, nativeAdLayoutApi3, string3, string4, boolValueOf);
        }

        public final isDebugBuild[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 35;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            isDebugBuild[] isdebugbuildArr = new isDebugBuild[i];
            int i6 = i4 + 85;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return isdebugbuildArr;
        }
    }

    static {
        int i = onWarmupCompleted + 111;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 9;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 101;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 31;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 25;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 92 / 0;
            }
            return true;
        }
        if (!(obj instanceof isDebugBuild)) {
            int i8 = i2 + 59;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        isDebugBuild isdebugbuild = (isDebugBuild) obj;
        if ((!Intrinsics.areEqual(this.home, isdebugbuild.home)) || !Intrinsics.areEqual(this.office, isdebugbuild.office)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.officeName, isdebugbuild.officeName)) {
            int i10 = onExtraCallbackWithResult + 3;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.officePhone, isdebugbuild.officePhone) || !Intrinsics.areEqual(this.realEstate, isdebugbuild.realEstate)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.officeDepartment, isdebugbuild.officeDepartment)) {
            int i12 = onExtraCallback + 21;
            onExtraCallbackWithResult = i12 % 128;
            return i12 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.cardAddressType, isdebugbuild.cardAddressType)) {
            int i13 = onExtraCallbackWithResult + 109;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.rememberAddress, isdebugbuild.rememberAddress))) {
            return true;
        }
        int i15 = onExtraCallbackWithResult + 97;
        onExtraCallback = i15 % 128;
        int i16 = i15 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iHashCode4 = this.home.hashCode();
        NativeAdLayoutApi nativeAdLayoutApi = this.office;
        if (nativeAdLayoutApi == null) {
            iHashCode = 0;
        } else {
            iHashCode = nativeAdLayoutApi.hashCode();
            int i2 = onExtraCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }
        String str = this.officeName;
        if (str == null) {
            int i4 = onExtraCallbackWithResult + 35;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str.hashCode();
        }
        String str2 = this.officePhone;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        NativeAdLayoutApi nativeAdLayoutApi2 = this.realEstate;
        if (nativeAdLayoutApi2 == null) {
            int i6 = onExtraCallbackWithResult + 85;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = nativeAdLayoutApi2.hashCode();
        }
        String str3 = this.officeDepartment;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        int iHashCode7 = this.cardAddressType.hashCode();
        Boolean bool = this.rememberAddress;
        return (((((((((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode3) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AddressFormValue(home=" + this.home + ", office=" + this.office + ", officeName=" + this.officeName + ", officePhone=" + this.officePhone + ", realEstate=" + this.realEstate + ", officeDepartment=" + this.officeDepartment + ", cardAddressType=" + this.cardAddressType + ", rememberAddress=" + this.rememberAddress + ")";
        int i2 = onExtraCallbackWithResult + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        this.home.writeToParcel(parcel, i);
        NativeAdLayoutApi nativeAdLayoutApi = this.office;
        if (nativeAdLayoutApi == null) {
            int i4 = onExtraCallbackWithResult + 69;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            parcel.writeInt(0);
            i2 = onExtraCallback + 65;
        } else {
            parcel.writeInt(1);
            nativeAdLayoutApi.writeToParcel(parcel, i);
            i2 = onExtraCallback + 5;
        }
        onExtraCallbackWithResult = i2 % 128;
        int i6 = i2 % 2;
        parcel.writeString(this.officeName);
        parcel.writeString(this.officePhone);
        NativeAdLayoutApi nativeAdLayoutApi2 = this.realEstate;
        if (nativeAdLayoutApi2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nativeAdLayoutApi2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.officeDepartment);
        parcel.writeString(this.cardAddressType);
        Boolean bool = this.rememberAddress;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            int i7 = onExtraCallback + 67;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            parcel.writeInt(0);
        }
    }

    public isDebugBuild(@NotNull NativeAdLayoutApi nativeAdLayoutApi, @Nullable NativeAdLayoutApi nativeAdLayoutApi2, @Nullable String str, @Nullable String str2, @Nullable NativeAdLayoutApi nativeAdLayoutApi3, @Nullable String str3, @NotNull String str4, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(nativeAdLayoutApi, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str4, BuildConfig.FLAVOR);
        this.home = nativeAdLayoutApi;
        this.office = nativeAdLayoutApi2;
        this.officeName = str;
        this.officePhone = str2;
        this.realEstate = nativeAdLayoutApi3;
        this.officeDepartment = str3;
        this.cardAddressType = str4;
        this.rememberAddress = bool;
    }
}
