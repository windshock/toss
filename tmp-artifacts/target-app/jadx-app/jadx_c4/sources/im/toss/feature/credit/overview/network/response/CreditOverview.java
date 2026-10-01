package im.toss.feature.credit.overview.network.response;

import im.toss.feature.credit.overview.network.response.CreditOverview$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.dj3;
import o.getBgColor;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.setApTextSize;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditOverview {
    public static final Companion Companion;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final CardUsageStatus checkCardUsageStatus;
    private final CardUsageStatus creditCardUsageStatus;
    private final Difference diff;
    private final Integer grade;
    private final GuaranteeStatus guaranteeStatus;
    private final long id;
    private final LoanStatus loanStatus;
    private final OverdueStatus overdueStatus;
    private final String referenceDate;
    private final Integer score;
    private final SubstitutePaymentStatus substitutePaymentStatus;
    private final Boolean suggestRefresh;
    private final Float topPercent;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onNavigationEvent + 99;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public CreditOverview() {
        this(0L, (Integer) null, (Integer) null, (Float) null, (CardUsageStatus) null, (CardUsageStatus) null, (SubstitutePaymentStatus) null, (LoanStatus) null, (OverdueStatus) null, (GuaranteeStatus) null, (String) null, (Difference) null, (Boolean) null, 8191, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = i3 | i2 | i7;
        int i9 = ~i3;
        int i10 = (~i2) | i7;
        int i11 = (~i10) | i9;
        int i12 = (~(i2 | i7 | i9)) | (~(i10 | i3));
        int i13 = i4 + i3 + i + (2053704882 * i6) + ((-167119771) * i5);
        int i14 = i13 * i13;
        int i15 = (((-385660469) * i4) - 1543503872) + (1501345335 * i3) + (1203980746 * i8) + (i11 * (-1203980746)) + ((-1203980746) * i12) + ((-1589641216) * i) + (511705088 * i6) + ((-1639972864) * i5) + (1278279680 * i14);
        int i16 = ((i4 * (-1228230693)) - 288632672) + (i3 * (-1228230521)) + (i8 * (-86)) + (i11 * 86) + (i12 * 86) + (i * (-1228230607)) + (i6 * 927583762) + (i5 * (-1784727723)) + (i14 * 1163984896);
        int i17 = i15 + (i16 * i16 * 992935936);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ CreditOverview onWarmupCompleted(CreditOverview creditOverview, long j, Integer num, Integer num2, Float f, CardUsageStatus cardUsageStatus, CardUsageStatus cardUsageStatus2, SubstitutePaymentStatus substitutePaymentStatus, LoanStatus loanStatus, OverdueStatus overdueStatus, GuaranteeStatus guaranteeStatus, String str, Difference difference, Boolean bool, int i, Object obj) {
        Integer num3;
        Integer num4;
        Float f2;
        CardUsageStatus cardUsageStatus3;
        int i2 = 2 % 2;
        long j2 = (i & 1) != 0 ? creditOverview.id : j;
        if ((i & 2) != 0) {
            int i3 = onWarmupCompleted + 1;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            num3 = creditOverview.grade;
        } else {
            num3 = num;
        }
        if ((i & 4) != 0) {
            int i5 = onWarmupCompleted + 75;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            num4 = creditOverview.score;
        } else {
            num4 = num2;
        }
        if ((i & 8) != 0) {
            f2 = creditOverview.topPercent;
            int i7 = onExtraCallback + 37;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        } else {
            f2 = f;
        }
        if ((i & 16) != 0) {
            int i9 = onWarmupCompleted + 49;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            cardUsageStatus3 = creditOverview.creditCardUsageStatus;
        } else {
            cardUsageStatus3 = cardUsageStatus;
        }
        CreditOverview creditOverviewOnNavigationEvent = creditOverview.onNavigationEvent(j2, num3, num4, f2, cardUsageStatus3, (i & 32) != 0 ? creditOverview.checkCardUsageStatus : cardUsageStatus2, (i & 64) != 0 ? creditOverview.substitutePaymentStatus : substitutePaymentStatus, (i & 128) != 0 ? creditOverview.loanStatus : loanStatus, (i & 256) != 0 ? creditOverview.overdueStatus : overdueStatus, (i & 512) != 0 ? creditOverview.guaranteeStatus : guaranteeStatus, (i & 1024) != 0 ? creditOverview.referenceDate : str, (i & 2048) != 0 ? creditOverview.diff : difference, (i & 4096) != 0 ? creditOverview.suggestRefresh : bool);
        int i11 = onWarmupCompleted + 9;
        onExtraCallback = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 24 / 0;
        }
        return creditOverviewOnNavigationEvent;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditOverview)) {
            return false;
        }
        CreditOverview creditOverview = (CreditOverview) obj;
        if (this.id != creditOverview.id) {
            return false;
        }
        Object obj2 = null;
        if (!Intrinsics.areEqual(this.grade, creditOverview.grade)) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 7;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 17;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.score, creditOverview.score) || !Intrinsics.areEqual(this.topPercent, creditOverview.topPercent) || !Intrinsics.areEqual(this.creditCardUsageStatus, creditOverview.creditCardUsageStatus)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.checkCardUsageStatus, creditOverview.checkCardUsageStatus)) {
            int i6 = onExtraCallback + 65;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.substitutePaymentStatus, creditOverview.substitutePaymentStatus) || !Intrinsics.areEqual(this.loanStatus, creditOverview.loanStatus)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.overdueStatus, creditOverview.overdueStatus)) {
            int i8 = onWarmupCompleted + 111;
            onExtraCallback = i8 % 128;
            return i8 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.guaranteeStatus, creditOverview.guaranteeStatus)) {
            return false;
        }
        if (Intrinsics.areEqual(this.referenceDate, creditOverview.referenceDate)) {
            return Intrinsics.areEqual(this.diff, creditOverview.diff) && Intrinsics.areEqual(this.suggestRefresh, creditOverview.suggestRefresh);
        }
        int i9 = onWarmupCompleted + 29;
        onExtraCallback = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int iHashCode5 = Long.hashCode(this.id);
        Integer num = this.grade;
        if (num == null) {
            int i2 = onExtraCallback + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        Integer num2 = this.score;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        Float f = this.topPercent;
        int iHashCode7 = f == null ? 0 : f.hashCode();
        CardUsageStatus cardUsageStatus = this.creditCardUsageStatus;
        int iHashCode8 = cardUsageStatus == null ? 0 : cardUsageStatus.hashCode();
        CardUsageStatus cardUsageStatus2 = this.checkCardUsageStatus;
        int iHashCode9 = cardUsageStatus2 == null ? 0 : cardUsageStatus2.hashCode();
        SubstitutePaymentStatus substitutePaymentStatus = this.substitutePaymentStatus;
        if (substitutePaymentStatus == null) {
            int i4 = onExtraCallback + 51;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = substitutePaymentStatus.hashCode();
        }
        LoanStatus loanStatus = this.loanStatus;
        int iHashCode10 = loanStatus == null ? 0 : loanStatus.hashCode();
        OverdueStatus overdueStatus = this.overdueStatus;
        int iHashCode11 = 1;
        if (overdueStatus == null) {
            int i6 = onExtraCallback + 75;
            onWarmupCompleted = i6 % 128;
            iHashCode3 = i6 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode3 = overdueStatus.hashCode();
            int i7 = onExtraCallback + 79;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        GuaranteeStatus guaranteeStatus = this.guaranteeStatus;
        if (guaranteeStatus == null) {
            int i9 = onExtraCallback + 117;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 == 0) {
                iHashCode11 = 0;
            }
        } else {
            iHashCode11 = guaranteeStatus.hashCode();
        }
        String str = this.referenceDate;
        int iHashCode12 = str == null ? 0 : str.hashCode();
        Difference difference = this.diff;
        if (difference == null) {
            int i10 = onWarmupCompleted + 47;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = difference.hashCode();
        }
        Boolean bool = this.suggestRefresh;
        return (((((((((((((((((((((((iHashCode5 * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode2) * 31) + iHashCode10) * 31) + iHashCode3) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode4) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public final CreditOverview onNavigationEvent(long j, @Nullable Integer num, @Nullable Integer num2, @Nullable Float f, @Nullable CardUsageStatus cardUsageStatus, @Nullable CardUsageStatus cardUsageStatus2, @Nullable SubstitutePaymentStatus substitutePaymentStatus, @Nullable LoanStatus loanStatus, @Nullable OverdueStatus overdueStatus, @Nullable GuaranteeStatus guaranteeStatus, @Nullable String str, @Nullable Difference difference, @Nullable Boolean bool) {
        int i = 2 % 2;
        CreditOverview creditOverview = new CreditOverview(j, num, num2, f, cardUsageStatus, cardUsageStatus2, substitutePaymentStatus, loanStatus, overdueStatus, guaranteeStatus, str, difference, bool);
        int i2 = onWarmupCompleted + 73;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return creditOverview;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditOverview(id=" + this.id + ", grade=" + this.grade + ", score=" + this.score + ", topPercent=" + this.topPercent + ", creditCardUsageStatus=" + this.creditCardUsageStatus + ", checkCardUsageStatus=" + this.checkCardUsageStatus + ", substitutePaymentStatus=" + this.substitutePaymentStatus + ", loanStatus=" + this.loanStatus + ", overdueStatus=" + this.overdueStatus + ", guaranteeStatus=" + this.guaranteeStatus + ", referenceDate=" + this.referenceDate + ", diff=" + this.diff + ", suggestRefresh=" + this.suggestRefresh + ")";
        int i2 = onExtraCallback + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CreditOverview> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            CreditOverview$.serializer serializerVar = CreditOverview$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ CreditOverview(int i, long j, Integer num, Integer num2, Float f, CardUsageStatus cardUsageStatus, CardUsageStatus cardUsageStatus2, SubstitutePaymentStatus substitutePaymentStatus, LoanStatus loanStatus, OverdueStatus overdueStatus, GuaranteeStatus guaranteeStatus, String str, Difference difference, Boolean bool, okycx okycxVar) {
        this.id = (i & 1) == 0 ? 1L : j;
        if ((i & 2) == 0) {
            int i2 = onExtraCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.grade = null;
            if (i3 != 0) {
                throw null;
            }
        } else {
            this.grade = num;
        }
        if ((i & 4) == 0) {
            int i4 = onExtraCallback + 91;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            this.score = null;
        } else {
            this.score = num2;
        }
        if ((i & 8) == 0) {
            int i6 = onWarmupCompleted + 69;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            this.topPercent = null;
        } else {
            this.topPercent = f;
            int i8 = onWarmupCompleted + 17;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 / 4;
            } else {
                int i10 = 2 % 2;
            }
        }
        if ((i & 16) == 0) {
            this.creditCardUsageStatus = null;
        } else {
            this.creditCardUsageStatus = cardUsageStatus;
        }
        if ((i & 32) == 0) {
            int i11 = onExtraCallback + 77;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            this.checkCardUsageStatus = null;
        } else {
            this.checkCardUsageStatus = cardUsageStatus2;
            int i13 = 2 % 2;
        }
        if ((i & 64) == 0) {
            this.substitutePaymentStatus = null;
        } else {
            this.substitutePaymentStatus = substitutePaymentStatus;
            int i14 = 2 % 2;
        }
        if ((i & 128) == 0) {
            this.loanStatus = null;
        } else {
            this.loanStatus = loanStatus;
            int i15 = onExtraCallback + 121;
            onWarmupCompleted = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 2 % 2;
            }
        }
        if ((i & 256) == 0) {
            this.overdueStatus = null;
        } else {
            this.overdueStatus = overdueStatus;
        }
        if ((i & 512) == 0) {
            this.guaranteeStatus = null;
            int i17 = onExtraCallback + 121;
            onWarmupCompleted = i17 % 128;
            int i18 = i17 % 2;
            int i19 = 2 % 2;
        } else {
            this.guaranteeStatus = guaranteeStatus;
        }
        if ((i & 1024) == 0) {
            int i20 = onExtraCallback + 89;
            onWarmupCompleted = i20 % 128;
            int i21 = i20 % 2;
            this.referenceDate = null;
        } else {
            this.referenceDate = str;
        }
        if ((i & 2048) == 0) {
            int i22 = onWarmupCompleted + 79;
            onExtraCallback = i22 % 128;
            int i23 = i22 % 2;
            this.diff = null;
        } else {
            this.diff = difference;
        }
        if ((i & 4096) == 0) {
            this.suggestRefresh = null;
        } else {
            this.suggestRefresh = bool;
        }
    }

    public CreditOverview(long j, @Nullable Integer num, @Nullable Integer num2, @Nullable Float f, @Nullable CardUsageStatus cardUsageStatus, @Nullable CardUsageStatus cardUsageStatus2, @Nullable SubstitutePaymentStatus substitutePaymentStatus, @Nullable LoanStatus loanStatus, @Nullable OverdueStatus overdueStatus, @Nullable GuaranteeStatus guaranteeStatus, @Nullable String str, @Nullable Difference difference, @Nullable Boolean bool) {
        this.id = j;
        this.grade = num;
        this.score = num2;
        this.topPercent = f;
        this.creditCardUsageStatus = cardUsageStatus;
        this.checkCardUsageStatus = cardUsageStatus2;
        this.substitutePaymentStatus = substitutePaymentStatus;
        this.loanStatus = loanStatus;
        this.overdueStatus = overdueStatus;
        this.guaranteeStatus = guaranteeStatus;
        this.referenceDate = str;
        this.diff = difference;
        this.suggestRefresh = bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CreditOverview creditOverview = (CreditOverview) objArr[0];
        vyl vylVar = (vyl) objArr[1];
        SerialDescriptor serialDescriptor = (SerialDescriptor) objArr[2];
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onExtraCallback + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            long j = creditOverview.id;
            if (i3 == 0 ? j != 1 : j != 1) {
                vylVar.onExtraCallback(serialDescriptor, 0, creditOverview.id);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = onWarmupCompleted + 73;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (creditOverview.grade != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getDynamicHeight.onWarmupCompleted, creditOverview.grade);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i6 = onWarmupCompleted + 19;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                Integer num = creditOverview.score;
                throw null;
            }
            if (creditOverview.score != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getDynamicHeight.onWarmupCompleted, creditOverview.score);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || creditOverview.topPercent != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, dj3.onWarmupCompleted, creditOverview.topPercent);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || creditOverview.creditCardUsageStatus != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, CardUsageStatus$$serializer.INSTANCE, creditOverview.creditCardUsageStatus);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || creditOverview.checkCardUsageStatus != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, CardUsageStatus$$serializer.INSTANCE, creditOverview.checkCardUsageStatus);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
            int i7 = onExtraCallback + 65;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                SubstitutePaymentStatus substitutePaymentStatus = creditOverview.substitutePaymentStatus;
                throw null;
            }
            if (creditOverview.substitutePaymentStatus != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 6, SubstitutePaymentStatus$$serializer.INSTANCE, creditOverview.substitutePaymentStatus);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 7) || creditOverview.loanStatus != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 7, LoanStatus$$serializer.INSTANCE, creditOverview.loanStatus);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 8) || creditOverview.overdueStatus != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 8, OverdueStatus$$serializer.INSTANCE, creditOverview.overdueStatus);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 9)) {
            int i8 = onExtraCallback + 19;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            if (creditOverview.guaranteeStatus != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 9, GuaranteeStatus$$serializer.INSTANCE, creditOverview.guaranteeStatus);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 10) || creditOverview.referenceDate != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 10, getWriggleLayout.onNavigationEvent, creditOverview.referenceDate);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 11)) {
            int i10 = onWarmupCompleted + 85;
            onExtraCallback = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 7 / 0;
                if (creditOverview.diff != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 11, Difference$$serializer.INSTANCE, creditOverview.diff);
                }
            } else if (creditOverview.diff != null) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 12) || creditOverview.suggestRefresh != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 12, getBgColor.IAuthTabCallback, creditOverview.suggestRefresh);
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreditOverview(long j, Integer num, Integer num2, Float f, CardUsageStatus cardUsageStatus, CardUsageStatus cardUsageStatus2, SubstitutePaymentStatus substitutePaymentStatus, LoanStatus loanStatus, OverdueStatus overdueStatus, GuaranteeStatus guaranteeStatus, String str, Difference difference, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j2;
        Integer num3;
        Integer num4;
        Float f2;
        CardUsageStatus cardUsageStatus3;
        LoanStatus loanStatus2;
        GuaranteeStatus guaranteeStatus2;
        String str2;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            j2 = 1;
        } else {
            j2 = j;
        }
        if ((i & 2) != 0) {
            int i3 = onWarmupCompleted + 47;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i & 4) != 0) {
            int i5 = onWarmupCompleted + 41;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 % 5;
            } else {
                int i7 = 2 % 2;
            }
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i & 8) != 0) {
            int i8 = onWarmupCompleted + 39;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            f2 = null;
        } else {
            f2 = f;
        }
        if ((i & 16) != 0) {
            int i11 = onWarmupCompleted + 73;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            cardUsageStatus3 = null;
        } else {
            cardUsageStatus3 = cardUsageStatus;
        }
        CardUsageStatus cardUsageStatus4 = (i & 32) != 0 ? null : cardUsageStatus2;
        SubstitutePaymentStatus substitutePaymentStatus2 = (i & 64) != 0 ? null : substitutePaymentStatus;
        if ((i & 128) != 0) {
            int i13 = 2 % 2;
            loanStatus2 = null;
        } else {
            loanStatus2 = loanStatus;
        }
        OverdueStatus overdueStatus2 = (i & 256) != 0 ? null : overdueStatus;
        if ((i & 512) != 0) {
            int i14 = onExtraCallback + 67;
            onWarmupCompleted = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
            guaranteeStatus2 = null;
        } else {
            guaranteeStatus2 = guaranteeStatus;
        }
        if ((i & 1024) != 0) {
            int i15 = onExtraCallback + 53;
            onWarmupCompleted = i15 % 128;
            int i16 = i15 % 2;
            int i17 = 2 % 2;
            str2 = null;
        } else {
            str2 = str;
        }
        this(j2, num3, num4, f2, cardUsageStatus3, cardUsageStatus4, substitutePaymentStatus2, loanStatus2, overdueStatus2, guaranteeStatus2, str2, (i & 2048) != 0 ? null : difference, (i & 4096) == 0 ? bool : null);
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        long j = this.id;
        int i5 = i3 + 111;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return j;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreditOverview creditOverview = (CreditOverview) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 49;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Integer num = creditOverview.grade;
        int i5 = i2 + 113;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return num;
    }

    public final Integer IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.score;
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        return num;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CreditOverview creditOverview = (CreditOverview) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Float f = creditOverview.topPercent;
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        return f;
    }

    public final CardUsageStatus IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.creditCardUsageStatus;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CreditOverview creditOverview = (CreditOverview) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CardUsageStatus cardUsageStatus = creditOverview.checkCardUsageStatus;
        if (i3 == 0) {
            return cardUsageStatus;
        }
        throw null;
    }

    public final SubstitutePaymentStatus IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        SubstitutePaymentStatus substitutePaymentStatus = this.substitutePaymentStatus;
        int i4 = i3 + 57;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return substitutePaymentStatus;
        }
        obj.hashCode();
        throw null;
    }

    public final LoanStatus asBinder() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LoanStatus loanStatus = this.loanStatus;
        int i4 = i3 + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return loanStatus;
    }

    public final OverdueStatus asInterface() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        OverdueStatus overdueStatus = this.overdueStatus;
        int i5 = i3 + 63;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return overdueStatus;
    }

    public final GuaranteeStatus onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.guaranteeStatus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.referenceDate;
        int i5 = i3 + 45;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Difference onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.diff;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean access100() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 79;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.suggestRefresh;
        int i4 = i2 + 79;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    private final boolean extraCallbackWithResult() {
        List<Card> listOnWarmupCompleted;
        Object next;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CardUsageStatus cardUsageStatus = this.creditCardUsageStatus;
        if (cardUsageStatus != null && (listOnWarmupCompleted = cardUsageStatus.onWarmupCompleted()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listOnWarmupCompleted.iterator();
            while (!(!it.hasNext())) {
                int i4 = onWarmupCompleted + 27;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    next = it.next();
                    int i5 = 3 / 0;
                    if (!((Card) next).extraCallback()) {
                        arrayList.add(next);
                    }
                } else {
                    next = it.next();
                    if (!((Card) next).extraCallback()) {
                        arrayList.add(next);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                int i6 = onWarmupCompleted + 89;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
        }
        return false;
    }

    private final boolean ICustomTabsCallback() {
        List<Card> listOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        CardUsageStatus cardUsageStatus = this.checkCardUsageStatus;
        if (cardUsageStatus == null || (listOnWarmupCompleted = cardUsageStatus.onWarmupCompleted()) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listOnWarmupCompleted.iterator();
        while (!(!it.hasNext())) {
            int i3 = onExtraCallback + 75;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                ((Card) it.next()).extraCallback();
                obj.hashCode();
                throw null;
            }
            Object next = it.next();
            if (!((Card) next).extraCallback()) {
                arrayList.add(next);
            }
        }
        if (!(!arrayList.isEmpty())) {
            return false;
        }
        int i4 = onExtraCallback + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public final boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        if (extraCallbackWithResult()) {
            return true;
        }
        int i2 = onExtraCallback + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (ICustomTabsCallback()) {
            return true;
        }
        int i4 = onExtraCallback + 35;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 im.toss.feature.credit.overview.network.response.LoanStatus) = 
      (r1v4 im.toss.feature.credit.overview.network.response.LoanStatus)
      (r1v14 im.toss.feature.credit.overview.network.response.LoanStatus)
     binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTransact() {
        LoanStatus loanStatus;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            loanStatus = this.loanStatus;
            int i3 = 62 / 0;
            if (loanStatus != null) {
                List<Loan> listIAuthTabCallback = loanStatus.IAuthTabCallback();
                if (listIAuthTabCallback != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = listIAuthTabCallback.iterator();
                    while (it.hasNext()) {
                        int i4 = onWarmupCompleted + 13;
                        onExtraCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            ((Loan) it.next()).getInterfaceDescriptor();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        Object next = it.next();
                        if (!((Loan) next).getInterfaceDescriptor()) {
                            arrayList.add(next);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return true;
                    }
                }
            }
        } else {
            loanStatus = this.loanStatus;
            if (loanStatus != null) {
            }
        }
        int i5 = onExtraCallback + 27;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return false;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(CreditOverview creditOverview, vyl vylVar, SerialDescriptor serialDescriptor) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{creditOverview, vylVar, serialDescriptor}, 1735998913, -1735998912, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
    }

    public final CardUsageStatus onNavigationEvent() {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (CardUsageStatus) onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{this}, -1082674297, 1082674300, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
    }

    public final Integer onExtraCallback() {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Integer) onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{this}, -882941825, 882941827, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
    }

    public final Float access000() {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Float) onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{this}, 1408941167, -1408941167, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
    }
}
