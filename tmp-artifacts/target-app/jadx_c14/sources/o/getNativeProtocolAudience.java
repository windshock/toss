package o;

import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getNativeProtocolAudience {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    @SerializedName("cardDesign")
    private final getNativeModuleIteratorReactAndroid_release cardDesign;

    @SerializedName("cardId")
    private final long cardId;

    @SerializedName("cardNumber")
    private final String cardNumber;

    @SerializedName("cvc")
    private String cvc;

    @SerializedName("expirationYearMonth")
    private String expirationYearMonth;

    @SerializedName("passwordDailyFailureCount")
    private int passwordDailyFailureCount;

    @SerializedName("status")
    private ReactPackageHelpergetNativeModuleIterator11 status;

    @SerializedName("transportationCardManufacturer")
    private ReactPackageHelpergetNativeModuleIteratorinlinedIterable1 transportationCardManufacturer;

    @SerializedName("transportationCardNumber")
    private String transportationCardNumber;

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~(i7 | i4);
        int i9 = ~i4;
        int i10 = i8 | (~(i9 | i6));
        int i11 = (~(i4 | i6)) | (~((~i6) | i7 | i9));
        int i12 = i7 | i6 | i9;
        int i13 = i6 + i + i2 + (1362283521 * i3) + ((-853422242) * i5);
        int i14 = i13 * i13;
        int i15 = ((1713903284 * i6) - 1228931072) + ((-782767794) * i) + (i10 * 1248335539) + (1248335539 * i11) + ((-1248335539) * i12) + (i2 * 465567744) + (465567744 * i3) + (1887436800 * i5) + ((-1154482176) * i14);
        int i16 = ((i6 * 722868660) - 41817558) + (i * 722869710) + (i10 * (-525)) + (i11 * (-525)) + (i12 * 525) + (i2 * 722869185) + (i3 * 1172694977) + (i5 * (-747618338)) + (i14 * 791674880);
        if (i15 + (i16 * i16 * 751828992) != 1) {
            return onWarmupCompleted(objArr);
        }
        getNativeProtocolAudience getnativeprotocolaudience = (getNativeProtocolAudience) objArr[0];
        int i17 = 2 % 2;
        int i18 = IAuthTabCallback + 11;
        int i19 = i18 % 128;
        onExtraCallbackWithResult = i19;
        int i20 = i18 % 2;
        ReactPackageHelpergetNativeModuleIterator11 reactPackageHelpergetNativeModuleIterator11 = getnativeprotocolaudience.status;
        int i21 = i19 + 125;
        IAuthTabCallback = i21 % 128;
        int i22 = i21 % 2;
        return reactPackageHelpergetNativeModuleIterator11;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNativeProtocolAudience)) {
            return false;
        }
        getNativeProtocolAudience getnativeprotocolaudience = (getNativeProtocolAudience) obj;
        if (this.cardId != getnativeprotocolaudience.cardId) {
            int i2 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.cardNumber, getnativeprotocolaudience.cardNumber) || this.cardDesign != getnativeprotocolaudience.cardDesign) {
            return false;
        }
        if (this.status != getnativeprotocolaudience.status) {
            int i4 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.expirationYearMonth, getnativeprotocolaudience.expirationYearMonth)) {
            return false;
        }
        if (this.passwordDailyFailureCount != getnativeprotocolaudience.passwordDailyFailureCount) {
            int i6 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.cvc, getnativeprotocolaudience.cvc)) {
            int i8 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.transportationCardNumber, getnativeprotocolaudience.transportationCardNumber)) {
            return false;
        }
        if (this.transportationCardManufacturer == getnativeprotocolaudience.transportationCardManufacturer) {
            return true;
        }
        int i10 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i10 % 128;
        return i10 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode3 = Long.hashCode(this.cardId);
        int iHashCode4 = this.cardNumber.hashCode();
        int iHashCode5 = this.cardDesign.hashCode();
        int iHashCode6 = this.status.hashCode();
        int iHashCode7 = this.expirationYearMonth.hashCode();
        int iHashCode8 = Integer.hashCode(this.passwordDailyFailureCount);
        String str = this.cvc;
        int iHashCode9 = 0;
        if (str == null) {
            int i4 = onExtraCallbackWithResult + 45;
            IAuthTabCallback = i4 % 128;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.transportationCardNumber;
        if (str2 == null) {
            int i5 = onExtraCallbackWithResult + 43;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        ReactPackageHelpergetNativeModuleIteratorinlinedIterable1 reactPackageHelpergetNativeModuleIteratorinlinedIterable1 = this.transportationCardManufacturer;
        if (reactPackageHelpergetNativeModuleIteratorinlinedIterable1 != null) {
            int i7 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                int iHashCode10 = reactPackageHelpergetNativeModuleIteratorinlinedIterable1.hashCode();
                int i8 = 31 / 0;
                iHashCode9 = iHashCode10;
            } else {
                iHashCode9 = reactPackageHelpergetNativeModuleIteratorinlinedIterable1.hashCode();
            }
        }
        return (((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode9;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensCard(cardId=" + this.cardId + ", cardNumber=" + this.cardNumber + ", cardDesign=" + this.cardDesign + ", status=" + this.status + ", expirationYearMonth=" + this.expirationYearMonth + ", passwordDailyFailureCount=" + this.passwordDailyFailureCount + ", cvc=" + this.cvc + ", transportationCardNumber=" + this.transportationCardNumber + ", transportationCardManufacturer=" + this.transportationCardManufacturer + ")";
        int i2 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        long j = this.cardId;
        if (i4 == 0) {
            int i5 = 13 / 0;
        }
        int i6 = i3 + 71;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 23;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.cardNumber;
        int i4 = i2 + 33;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getNativeProtocolAudience getnativeprotocolaudience = (getNativeProtocolAudience) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getNativeModuleIteratorReactAndroid_release getnativemoduleiteratorreactandroid_release = getnativeprotocolaudience.cardDesign;
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        return getnativemoduleiteratorreactandroid_release;
    }

    public final void onExtraCallbackWithResult(@NotNull ReactPackageHelpergetNativeModuleIterator11 reactPackageHelpergetNativeModuleIterator11) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(reactPackageHelpergetNativeModuleIterator11, "");
        this.status = reactPackageHelpergetNativeModuleIterator11;
        int i4 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 63;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.expirationYearMonth;
        int i4 = i2 + 109;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final int IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 15;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.passwordDailyFailureCount;
        int i5 = i2 + 55;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.cvc;
        int i5 = i3 + 19;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.transportationCardNumber;
        int i5 = i3 + 63;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ReactPackageHelpergetNativeModuleIteratorinlinedIterable1 onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 83;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        ReactPackageHelpergetNativeModuleIteratorinlinedIterable1 reactPackageHelpergetNativeModuleIteratorinlinedIterable1 = this.transportationCardManufacturer;
        int i5 = i2 + 125;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return reactPackageHelpergetNativeModuleIteratorinlinedIterable1;
    }

    public final getNativeModuleIteratorReactAndroid_release IAuthTabCallback() {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        return (getNativeModuleIteratorReactAndroid_release) onExtraCallback(-733752186, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, RNSScreenManagerDelegate.onNavigationEvent(), 733752186, new Object[]{this});
    }

    public final ReactPackageHelpergetNativeModuleIterator11 asBinder() {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        return (ReactPackageHelpergetNativeModuleIterator11) onExtraCallback(-681842182, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, RNSScreenManagerDelegate.onNavigationEvent(), 681842183, new Object[]{this});
    }
}
