package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class openURL {
    public static final int $stable = 8;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final long balance;
    private final String expiredDate;
    private final openSettings footer;
    private final Float interestRate;
    private final String interestRateString;

    @SerializedName("minQueryableDate")
    private final String minQueryableDateString;
    private final String openDate;
    private final String subtitle;
    private final Boolean supportInquiryTransactions;
    private final String title;
    private final Long withdrawableAmount;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 77;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 97;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof openURL)) {
            int i6 = onNavigationEvent + 103;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        openURL openurl = (openURL) obj;
        if (!Intrinsics.areEqual(this.title, openurl.title) || !Intrinsics.areEqual(this.subtitle, openurl.subtitle) || this.balance != openurl.balance || !Intrinsics.areEqual(this.minQueryableDateString, openurl.minQueryableDateString) || !Intrinsics.areEqual(this.footer, openurl.footer)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.withdrawableAmount, openurl.withdrawableAmount)) {
            int i8 = onWarmupCompleted + 27;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.openDate, openurl.openDate) || !Intrinsics.areEqual(this.expiredDate, openurl.expiredDate)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.interestRate, openurl.interestRate)) {
            int i10 = onNavigationEvent + 71;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.interestRateString, openurl.interestRateString)) {
            return Intrinsics.areEqual(this.supportInquiryTransactions, openurl.supportInquiryTransactions);
        }
        int i12 = onNavigationEvent + 97;
        onWarmupCompleted = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode5 = this.title.hashCode();
        int iHashCode6 = this.subtitle.hashCode();
        int iHashCode7 = Long.hashCode(this.balance);
        String str = this.minQueryableDateString;
        int iHashCode8 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = onNavigationEvent + 7;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        int iHashCode9 = this.footer.hashCode();
        Long l = this.withdrawableAmount;
        if (l == null) {
            int i6 = onNavigationEvent + 31;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = l.hashCode();
        }
        String str2 = this.openDate;
        if (str2 == null) {
            int i8 = onNavigationEvent + 103;
            onWarmupCompleted = i8 % 128;
            iHashCode3 = i8 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode3 = str2.hashCode();
        }
        String str3 = this.expiredDate;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        Float f = this.interestRate;
        if (f == null) {
            int i9 = onNavigationEvent + 61;
            int i10 = i9 % 128;
            onWarmupCompleted = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 49;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = f.hashCode();
        }
        String str4 = this.interestRateString;
        int iHashCode11 = str4 == null ? 0 : str4.hashCode();
        Boolean bool = this.supportInquiryTransactions;
        if (bool != null) {
            int i14 = onWarmupCompleted + 73;
            onNavigationEvent = i14 % 128;
            int i15 = i14 % 2;
            iHashCode8 = bool.hashCode();
        }
        return (((((((((((((((((((iHashCode5 * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode9) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode10) * 31) + iHashCode4) * 31) + iHashCode11) * 31) + iHashCode8;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountOverview(title=" + this.title + ", subtitle=" + this.subtitle + ", balance=" + this.balance + ", minQueryableDateString=" + this.minQueryableDateString + ", footer=" + this.footer + ", withdrawableAmount=" + this.withdrawableAmount + ", openDate=" + this.openDate + ", expiredDate=" + this.expiredDate + ", interestRate=" + this.interestRate + ", interestRateString=" + this.interestRateString + ", supportInquiryTransactions=" + this.supportInquiryTransactions + ")";
        int i2 = onNavigationEvent + 99;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 79 / 0;
        }
        return str;
    }
}
