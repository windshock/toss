package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import o.AUTextView;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactInstanceManagerExternalSyntheticLambda6 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("address")
    private final String address;

    @SerializedName("cardDesign")
    private final getNativeModuleIteratorReactAndroid_release cardDesign;

    @SerializedName("cardId")
    private final long cardId;

    @SerializedName("cardNumber")
    private final String cardNumber;

    @SerializedName("detailAddress")
    private final String detailAddress;

    @SerializedName("expectedShippingDate")
    private final String expectedShippingDate;

    @SerializedName("expectedShippingMaxDate")
    private final String expectedShippingMaxDate;

    @SerializedName("isShippingAddressChangeProhibited")
    private final boolean isShippingAddressChangeProhibited;

    @SerializedName("shippingInfo")
    private getModule shippingInfo;

    @SerializedName("shippingStartDate")
    private final String shippingStartDate;

    @SerializedName("shippingType")
    private final DebugCorePackageExternalSyntheticLambda0 shippingType;

    @SerializedName("status")
    private final ReactPackageHelpergetNativeModuleIterator11 status;

    @SerializedName("transportationCardManufacturer")
    private ReactPackageHelpergetNativeModuleIteratorinlinedIterable1 transportationCardManufacturer;

    @SerializedName("transportationCardNumber")
    private String transportationCardNumber;

    @SerializedName("zipCode")
    private final String zipCode;

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i5);
        int i9 = ~i5;
        int i10 = i8 | (~(i9 | i4 | i3));
        int i11 = ~(i7 | i9);
        int i12 = (~i3) | i9;
        int i13 = i11 | (~i12);
        int i14 = ~(i12 | i4);
        int i15 = i4 + i5 + i2 + ((-1261570137) * i) + (2040842291 * i6);
        int i16 = i15 * i15;
        int i17 = ((i4 * (-750812765)) - 1471086592) + ((-750812765) * i5) + (1493335646 * i10) + ((-1308296004) * i13) + ((-1493335646) * i14) + (742522880 * i2) + ((-1928462336) * i) + (1629880320 * i6) + (2096168960 * i16);
        int i18 = ((i4 * 1408203179) - 1033136887) + (i5 * 1408203179) + (i10 * (-338)) + (i13 * (-676)) + (i14 * 338) + (i2 * 1408202841) + (i * (-1046847217)) + (i6 * (-121732677)) + (i16 * 1741225984);
        return i17 + ((i18 * i18) * 838795264) != 1 ? onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactInstanceManagerExternalSyntheticLambda6)) {
            return false;
        }
        ReactInstanceManagerExternalSyntheticLambda6 reactInstanceManagerExternalSyntheticLambda6 = (ReactInstanceManagerExternalSyntheticLambda6) obj;
        if (this.cardId != reactInstanceManagerExternalSyntheticLambda6.cardId) {
            int i2 = onExtraCallbackWithResult + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.cardDesign != reactInstanceManagerExternalSyntheticLambda6.cardDesign) {
            return false;
        }
        if (!Intrinsics.areEqual(this.cardNumber, reactInstanceManagerExternalSyntheticLambda6.cardNumber)) {
            int i4 = onExtraCallbackWithResult + 65;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.status != reactInstanceManagerExternalSyntheticLambda6.status || (!Intrinsics.areEqual(this.address, reactInstanceManagerExternalSyntheticLambda6.address)) || !Intrinsics.areEqual(this.detailAddress, reactInstanceManagerExternalSyntheticLambda6.detailAddress)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.zipCode, reactInstanceManagerExternalSyntheticLambda6.zipCode)) {
            int i6 = onExtraCallbackWithResult + 81;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.shippingStartDate, reactInstanceManagerExternalSyntheticLambda6.shippingStartDate)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.expectedShippingDate, reactInstanceManagerExternalSyntheticLambda6.expectedShippingDate)) {
            int i8 = onExtraCallback + 109;
            onExtraCallbackWithResult = i8 % 128;
            return i8 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.expectedShippingMaxDate, reactInstanceManagerExternalSyntheticLambda6.expectedShippingMaxDate)) {
            return false;
        }
        if (this.isShippingAddressChangeProhibited == reactInstanceManagerExternalSyntheticLambda6.isShippingAddressChangeProhibited) {
            return this.shippingType == reactInstanceManagerExternalSyntheticLambda6.shippingType && Intrinsics.areEqual(this.transportationCardNumber, reactInstanceManagerExternalSyntheticLambda6.transportationCardNumber) && this.transportationCardManufacturer == reactInstanceManagerExternalSyntheticLambda6.transportationCardManufacturer && Intrinsics.areEqual(this.shippingInfo, reactInstanceManagerExternalSyntheticLambda6.shippingInfo);
        }
        int i9 = onExtraCallback + 67;
        onExtraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int iHashCode;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 21;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        int iHashCode2 = Long.hashCode(this.cardId);
        int iHashCode3 = this.cardDesign.hashCode();
        int iHashCode4 = this.cardNumber.hashCode();
        int iHashCode5 = this.status.hashCode();
        int iHashCode6 = this.address.hashCode();
        int iHashCode7 = this.detailAddress.hashCode();
        int iHashCode8 = this.zipCode.hashCode();
        int iHashCode9 = this.shippingStartDate.hashCode();
        int iHashCode10 = this.expectedShippingDate.hashCode();
        int iHashCode11 = this.expectedShippingMaxDate.hashCode();
        int iHashCode12 = Boolean.hashCode(this.isShippingAddressChangeProhibited);
        int iHashCode13 = this.shippingType.hashCode();
        String str = this.transportationCardNumber;
        if (str == null) {
            int i6 = onExtraCallbackWithResult + 7;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        } else {
            int iHashCode14 = str.hashCode();
            int i8 = onExtraCallback + 39;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            i = iHashCode14;
        }
        ReactPackageHelpergetNativeModuleIteratorinlinedIterable1 reactPackageHelpergetNativeModuleIteratorinlinedIterable1 = this.transportationCardManufacturer;
        int iHashCode15 = reactPackageHelpergetNativeModuleIteratorinlinedIterable1 == null ? 0 : reactPackageHelpergetNativeModuleIteratorinlinedIterable1.hashCode();
        getModule getmodule = this.shippingInfo;
        if (getmodule != null) {
            int i10 = onExtraCallback + 125;
            i2 = iHashCode15;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            iHashCode = getmodule.hashCode();
        } else {
            i2 = iHashCode15;
            iHashCode = 0;
        }
        return (((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + i) * 31) + i2) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensUnregisterCard(cardId=" + this.cardId + ", cardDesign=" + this.cardDesign + ", cardNumber=" + this.cardNumber + ", status=" + this.status + ", address=" + this.address + ", detailAddress=" + this.detailAddress + ", zipCode=" + this.zipCode + ", shippingStartDate=" + this.shippingStartDate + ", expectedShippingDate=" + this.expectedShippingDate + ", expectedShippingMaxDate=" + this.expectedShippingMaxDate + ", isShippingAddressChangeProhibited=" + this.isShippingAddressChangeProhibited + ", shippingType=" + this.shippingType + ", transportationCardNumber=" + this.transportationCardNumber + ", transportationCardManufacturer=" + this.transportationCardManufacturer + ", shippingInfo=" + this.shippingInfo + ")";
        int i2 = onExtraCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ReactInstanceManagerExternalSyntheticLambda6 reactInstanceManagerExternalSyntheticLambda6 = (ReactInstanceManagerExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            long j = reactInstanceManagerExternalSyntheticLambda6.cardId;
            throw null;
        }
        long j2 = reactInstanceManagerExternalSyntheticLambda6.cardId;
        int i4 = i3 + 43;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return Long.valueOf(j2);
    }

    public final getNativeModuleIteratorReactAndroid_release onExtraCallback() {
        getNativeModuleIteratorReactAndroid_release getnativemoduleiteratorreactandroid_release;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 61;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            getnativemoduleiteratorreactandroid_release = this.cardDesign;
            int i4 = 64 / 0;
        } else {
            getnativemoduleiteratorreactandroid_release = this.cardDesign;
        }
        int i5 = i2 + 85;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return getnativemoduleiteratorreactandroid_release;
    }

    public final ReactPackageHelpergetNativeModuleIterator11 IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        ReactPackageHelpergetNativeModuleIterator11 reactPackageHelpergetNativeModuleIterator11 = this.status;
        int i5 = i3 + 123;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return reactPackageHelpergetNativeModuleIterator11;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.address;
        int i5 = i3 + 67;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.detailAddress;
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        return str;
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.zipCode;
        int i4 = i3 + 93;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ReactInstanceManagerExternalSyntheticLambda6 reactInstanceManagerExternalSyntheticLambda6 = (ReactInstanceManagerExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = reactInstanceManagerExternalSyntheticLambda6.expectedShippingDate;
        if (i3 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onTransact() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 43;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.expectedShippingMaxDate;
            int i4 = 34 / 0;
        } else {
            str = this.expectedShippingMaxDate;
        }
        int i5 = i2 + 61;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean access100() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.isShippingAddressChangeProhibited;
        }
        throw null;
    }

    public final DebugCorePackageExternalSyntheticLambda0 asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DebugCorePackageExternalSyntheticLambda0 debugCorePackageExternalSyntheticLambda0 = this.shippingType;
        int i4 = i3 + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return debugCorePackageExternalSyntheticLambda0;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.transportationCardNumber;
        }
        throw null;
    }

    public final ReactPackageHelpergetNativeModuleIteratorinlinedIterable1 asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 13;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        ReactPackageHelpergetNativeModuleIteratorinlinedIterable1 reactPackageHelpergetNativeModuleIteratorinlinedIterable1 = this.transportationCardManufacturer;
        int i5 = i2 + 81;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 8 / 0;
        }
        return reactPackageHelpergetNativeModuleIteratorinlinedIterable1;
    }

    public final getModule IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 9;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        getModule getmodule = this.shippingInfo;
        int i5 = i2 + 119;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
        return getmodule;
    }

    public final long IAuthTabCallback() {
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        return ((Long) onNavigationEvent(AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, -1418652146, 1418652147, new Object[]{this}, AUTextView.onExtraCallbackWithResult.onExtraCallback())).longValue();
    }

    public final String onExtraCallbackWithResult() {
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        return (String) onNavigationEvent(AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, -1642076035, 1642076035, new Object[]{this}, AUTextView.onExtraCallbackWithResult.onExtraCallback());
    }
}
