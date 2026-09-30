package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class NativeAdRatingApi {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final String companyName;
    private final String companyPhoneNumber;
    private final NativeAdLayoutApi home;
    private final NativeAdLayoutApi office;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeAdRatingApi)) {
            return false;
        }
        NativeAdRatingApi nativeAdRatingApi = (NativeAdRatingApi) obj;
        if (!Intrinsics.areEqual(this.companyName, nativeAdRatingApi.companyName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.companyPhoneNumber, nativeAdRatingApi.companyPhoneNumber)) {
            int i3 = onNavigationEvent + 55;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 76 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.home, nativeAdRatingApi.home)) {
            return false;
        }
        if (Intrinsics.areEqual(this.office, nativeAdRatingApi.office)) {
            return true;
        }
        int i5 = onNavigationEvent + 49;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.companyName;
        if (str == null) {
            int i2 = onExtraCallback + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.companyPhoneNumber;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        NativeAdLayoutApi nativeAdLayoutApi = this.home;
        if (nativeAdLayoutApi == null) {
            int i4 = onExtraCallback + 47;
            onNavigationEvent = i4 % 128;
            iHashCode2 = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = nativeAdLayoutApi.hashCode();
        }
        NativeAdLayoutApi nativeAdLayoutApi2 = this.office;
        return (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode2) * 31) + (nativeAdLayoutApi2 != null ? nativeAdLayoutApi2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardIssueAddressResp(companyName=" + this.companyName + ", companyPhoneNumber=" + this.companyPhoneNumber + ", home=" + this.home + ", office=" + this.office + ")";
        int i2 = onNavigationEvent + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
