package viva.republica.toss.network.model.loan;

import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AppliedLoan {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String badgeText;
    private final String companyIconUrl;
    private final String companyName;
    private final LoanReviewButtonText cta;
    private String groupName;
    private final float interest;
    private final long loanAmount;
    private final String loanAppliedTs;
    private final String productId;
    private final String productName;
    private final LoanText rightText;
    private final String scheme;
    private final String status;
    private final String statusMessage;
    private boolean tracked;

    static {
        int i = onNavigationEvent + 53;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = ~i4;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i4 | i5);
        int i12 = i10 | i11;
        int i13 = (~(i7 | i5)) | (~(i7 | i9)) | (~(i9 | i5));
        int i14 = i5 + i2 + i3 + (669352129 * i) + (266941808 * i6);
        int i15 = i14 * i14;
        int i16 = (720661947 * i5) + 1572077568 + ((-1243901369) * i2) + (1165201990 * i12) + (i11 * (-1165201990)) + ((-1165201990) * i13) + (1885863936 * i3) + ((-1100480512) * i) + ((-1249902592) * i6) + ((-491520000) * i15);
        int i17 = (i5 * 1617402437) + 56426783 + (i2 * 1617401273) + (i12 * (-582)) + (i11 * 582) + (i13 * 582) + (i3 * 1617401855) + (i * 1244927807) + (i6 * (-404665712)) + (i15 * (-45350912));
        int i18 = i16 + (i17 * i17 * 1565261824);
        return i18 != 1 ? i18 != 2 ? onExtraCallback(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppliedLoan)) {
            return false;
        }
        AppliedLoan appliedLoan = (AppliedLoan) obj;
        if (!Intrinsics.areEqual(this.productId, appliedLoan.productId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.companyName, appliedLoan.companyName)) {
            int i4 = IAuthTabCallback + 117;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.productName, appliedLoan.productName) || !Intrinsics.areEqual(this.companyIconUrl, appliedLoan.companyIconUrl) || !Intrinsics.areEqual(this.status, appliedLoan.status)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.statusMessage, appliedLoan.statusMessage)) {
            int i6 = onExtraCallback + 65;
            IAuthTabCallback = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.scheme, appliedLoan.scheme)) {
            int i7 = onExtraCallback + 49;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.loanAmount != appliedLoan.loanAmount || Float.compare(this.interest, appliedLoan.interest) != 0) {
            return false;
        }
        if (!Intrinsics.areEqual(this.cta, appliedLoan.cta)) {
            int i9 = IAuthTabCallback + 49;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.rightText, appliedLoan.rightText)) {
            int i11 = onExtraCallback + 105;
            IAuthTabCallback = i11 % 128;
            return i11 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.loanAppliedTs, appliedLoan.loanAppliedTs)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.groupName, appliedLoan.groupName)) {
            int i12 = onExtraCallback + 27;
            IAuthTabCallback = i12 % 128;
            return i12 % 2 == 0;
        }
        if (this.tracked != appliedLoan.tracked) {
            return false;
        }
        if (Intrinsics.areEqual(this.badgeText, appliedLoan.badgeText)) {
            return true;
        }
        int i13 = IAuthTabCallback + 99;
        onExtraCallback = i13 % 128;
        return i13 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i;
        int i2 = 2 % 2;
        String str = this.productId;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = this.companyName.hashCode();
        int iHashCode6 = this.productName.hashCode();
        int iHashCode7 = this.companyIconUrl.hashCode();
        int iHashCode8 = this.status.hashCode();
        String str2 = this.statusMessage;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        int iHashCode10 = this.scheme.hashCode();
        int iHashCode11 = Long.hashCode(this.loanAmount);
        int iHashCode12 = Float.hashCode(this.interest);
        LoanReviewButtonText loanReviewButtonText = this.cta;
        if (loanReviewButtonText == null) {
            int i3 = onExtraCallback;
            int i4 = i3 + 49;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 73;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode = 0;
        } else {
            iHashCode = loanReviewButtonText.hashCode();
        }
        LoanText loanText = this.rightText;
        if (loanText == null) {
            int i8 = IAuthTabCallback + 39;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = loanText.hashCode();
        }
        String str3 = this.loanAppliedTs;
        if (str3 == null) {
            int i10 = IAuthTabCallback + 55;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        String str4 = this.groupName;
        int iHashCode13 = str4 == null ? 0 : str4.hashCode();
        int iHashCode14 = Boolean.hashCode(this.tracked);
        String str5 = this.badgeText;
        if (str5 != null) {
            int iHashCode15 = str5.hashCode();
            int i12 = onExtraCallback + 37;
            i = iHashCode15;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
        } else {
            i = 0;
        }
        return (((((((((((((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppliedLoan(productId=" + this.productId + ", companyName=" + this.companyName + ", productName=" + this.productName + ", companyIconUrl=" + this.companyIconUrl + ", status=" + this.status + ", statusMessage=" + this.statusMessage + ", scheme=" + this.scheme + ", loanAmount=" + this.loanAmount + ", interest=" + this.interest + ", cta=" + this.cta + ", rightText=" + this.rightText + ", loanAppliedTs=" + this.loanAppliedTs + ", groupName=" + this.groupName + ", tracked=" + this.tracked + ", badgeText=" + this.badgeText + ")";
        int i2 = onExtraCallback + 117;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 70 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppliedLoan> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AppliedLoan$$serializer appliedLoan$$serializer = AppliedLoan$$serializer.INSTANCE;
            int i4 = onExtraCallback + 83;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return appliedLoan$$serializer;
        }
    }

    public /* synthetic */ AppliedLoan(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, float f, LoanReviewButtonText loanReviewButtonText, LoanText loanText, String str8, String str9, boolean z, String str10, okycx okycxVar) {
        if (494 != (i & 494)) {
            htf31.onExtraCallbackWithResult(i, 494, AppliedLoan$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.productId = null;
        } else {
            this.productId = str;
        }
        this.companyName = str2;
        this.productName = str3;
        this.companyIconUrl = str4;
        this.status = (i & 16) == 0 ? "" : str5;
        this.statusMessage = str6;
        this.scheme = str7;
        this.loanAmount = j;
        this.interest = f;
        if ((i & 512) == 0) {
            this.cta = null;
        } else {
            this.cta = loanReviewButtonText;
        }
        if ((i & 1024) == 0) {
            this.rightText = null;
        } else {
            this.rightText = loanText;
            int i2 = 2 % 2;
        }
        if ((i & 2048) == 0) {
            int i3 = IAuthTabCallback + 81;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            this.loanAppliedTs = null;
            if (i4 != 0) {
                throw null;
            }
        } else {
            this.loanAppliedTs = str8;
        }
        if ((i & 4096) == 0) {
            this.groupName = null;
            int i5 = IAuthTabCallback + 37;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        } else {
            this.groupName = str9;
        }
        this.tracked = (i & 8192) == 0 ? false : z;
        int i7 = onExtraCallback + 49;
        int i8 = i7 % 128;
        IAuthTabCallback = i8;
        int i9 = i7 % 2;
        int i10 = 2 % 2;
        int i11 = i8 + 45;
        int i12 = i11 % 128;
        onExtraCallback = i12;
        int i13 = i11 % 2;
        if ((i & 16384) != 0) {
            this.badgeText = str10;
            int i14 = i12 + 75;
            IAuthTabCallback = i14 % 128;
            int i15 = i14 % 2;
            return;
        }
        int i16 = i8 + 85;
        onExtraCallback = i16 % 128;
        int i17 = i16 % 2;
        this.badgeText = null;
        if (i17 != 0) {
            int i18 = 92 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallback(java.lang.Object[] r7) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.AppliedLoan.onExtraCallback(java.lang.Object[]):java.lang.Object");
    }

    public final String IAuthTabCallback_Parcel() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 69;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.productId;
            int i4 = 71 / 0;
        } else {
            str = this.productId;
        }
        int i5 = i2 + 61;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 53;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.companyName;
        int i5 = i2 + 29;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.productName;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.companyIconUrl;
        int i4 = i3 + 37;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.scheme;
        }
        throw null;
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.loanAmount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.interest;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AppliedLoan appliedLoan = (AppliedLoan) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LoanReviewButtonText loanReviewButtonText = appliedLoan.cta;
        if (i3 == 0) {
            return loanReviewButtonText;
        }
        throw null;
    }

    public final LoanText access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LoanText loanText = this.rightText;
        int i4 = i3 + 11;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return loanText;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 5;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.loanAppliedTs;
        int i5 = i2 + 121;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.groupName;
        int i4 = i3 + 49;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.groupName = str;
        if (i3 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AppliedLoan appliedLoan = (AppliedLoan) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        appliedLoan.tracked = zBooleanValue;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 91;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final boolean access000() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 89;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.tracked;
        int i5 = i2 + 101;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @liq
    public static final class LoanReviewButtonText {
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final String scheme;
        private final String text;

        static {
            int i = onExtraCallback + 23;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public LoanReviewButtonText() {
            String str = null;
            this(str, str, 3, (DefaultConstructorMarker) str);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 37;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof LoanReviewButtonText)) {
                int i4 = onNavigationEvent + 13;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            LoanReviewButtonText loanReviewButtonText = (LoanReviewButtonText) obj;
            if (!Intrinsics.areEqual(this.text, loanReviewButtonText.text)) {
                int i6 = onWarmupCompleted + 71;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            if (Intrinsics.areEqual(this.scheme, loanReviewButtonText.scheme)) {
                return true;
            }
            int i7 = onNavigationEvent + 123;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.text.hashCode();
            String str = this.scheme;
            if (str == null) {
                int i4 = onNavigationEvent;
                int i5 = i4 + 53;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 63;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 4 / 3;
                }
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            return (iHashCode2 * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "LoanReviewButtonText(text=" + this.text + ", scheme=" + this.scheme + ")";
            int i2 = onNavigationEvent + 3;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<LoanReviewButtonText> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 99;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                AppliedLoan$LoanReviewButtonText$$serializer appliedLoan$LoanReviewButtonText$$serializer = AppliedLoan$LoanReviewButtonText$$serializer.INSTANCE;
                int i4 = onExtraCallbackWithResult + 11;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 14 / 0;
                }
                return appliedLoan$LoanReviewButtonText$$serializer;
            }
        }

        public /* synthetic */ LoanReviewButtonText(int i, String str, String str2, okycx okycxVar) {
            if ((i & 1) == 0) {
                int i2 = 2 % 2;
                str = "대출 신청 후기 쓰기";
            }
            this.text = str;
            if ((i & 2) != 0) {
                this.scheme = str2;
                return;
            }
            int i3 = onNavigationEvent + 121;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            Object obj = null;
            this.scheme = null;
            int i6 = i4 + 109;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public LoanReviewButtonText(@NotNull String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.text = str;
            this.scheme = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.loan.AppliedLoan.LoanReviewButtonText r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.loan.AppliedLoan.LoanReviewButtonText.onNavigationEvent
                int r1 = r1 + 95
                int r2 = r1 % 128
                viva.republica.toss.network.model.loan.AppliedLoan.LoanReviewButtonText.onWarmupCompleted = r2
                int r1 = r1 % r0
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L17
                boolean r1 = r6.onWarmupCompleted(r7, r3)
                if (r1 != 0) goto L30
                goto L1d
            L17:
                boolean r1 = r6.onWarmupCompleted(r7, r2)
                if (r1 != 0) goto L30
            L1d:
                int r1 = viva.republica.toss.network.model.loan.AppliedLoan.LoanReviewButtonText.onNavigationEvent
                int r1 = r1 + 33
                int r4 = r1 % 128
                viva.republica.toss.network.model.loan.AppliedLoan.LoanReviewButtonText.onWarmupCompleted = r4
                int r1 = r1 % r0
                java.lang.String r1 = r5.text
                java.lang.String r4 = "대출 신청 후기 쓰기"
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
                if (r1 != 0) goto L3e
            L30:
                java.lang.String r1 = r5.text
                r6.onExtraCallback(r7, r2, r1)
                int r1 = viva.republica.toss.network.model.loan.AppliedLoan.LoanReviewButtonText.onNavigationEvent
                int r1 = r1 + 95
                int r2 = r1 % 128
                viva.republica.toss.network.model.loan.AppliedLoan.LoanReviewButtonText.onWarmupCompleted = r2
                int r1 = r1 % r0
            L3e:
                boolean r0 = r6.onWarmupCompleted(r7, r3)
                r0 = r0 ^ r3
                if (r0 == 0) goto L49
                java.lang.String r0 = r5.scheme
                if (r0 == 0) goto L50
            L49:
                o.getWriggleLayout r0 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r5 = r5.scheme
                r6.onExtraCallbackWithResult(r7, r3, r0, r5)
            L50:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.AppliedLoan.LoanReviewButtonText.IAuthTabCallback(viva.republica.toss.network.model.loan.AppliedLoan$LoanReviewButtonText, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ LoanReviewButtonText(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onNavigationEvent;
                int i3 = i2 + 89;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                int i4 = i2 + 67;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                str = "대출 신청 후기 쓰기";
            }
            if ((i & 2) != 0) {
                int i7 = onWarmupCompleted + 83;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                str2 = null;
            }
            this(str, str2);
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            String str = this.text;
            if (i3 != 0) {
                int i4 = 46 / 0;
            }
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 89;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.scheme;
            int i5 = i2 + 95;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 79;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.badgeText;
        int i5 = i2 + 9;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @liq
    public static final class LoanText {
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private final String color;
        private final String text;

        static {
            int i = onExtraCallback + 19;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public LoanText() {
            String str = null;
            this(str, str, 3, (DefaultConstructorMarker) str);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoanText)) {
                return false;
            }
            LoanText loanText = (LoanText) obj;
            if (!Intrinsics.areEqual(this.text, loanText.text)) {
                return false;
            }
            if (Intrinsics.areEqual(this.color, loanText.color)) {
                return true;
            }
            int i3 = IAuthTabCallback + 67;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            IAuthTabCallback = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (this.text.hashCode() + 110) << this.color.hashCode() : (this.text.hashCode() * 31) + this.color.hashCode();
            int i3 = onNavigationEvent + 67;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "LoanText(text=" + this.text + ", color=" + this.color + ")";
            int i2 = onNavigationEvent + 53;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<LoanText> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 63;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AppliedLoan$LoanText$$serializer appliedLoan$LoanText$$serializer = AppliedLoan$LoanText$$serializer.INSTANCE;
                int i4 = IAuthTabCallback + 53;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return appliedLoan$LoanText$$serializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public /* synthetic */ LoanText(int i, String str, String str2, okycx okycxVar) {
            if ((i & 1) == 0) {
                int i2 = onNavigationEvent + 115;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
                str = "";
            }
            this.text = str;
            if ((i & 2) != 0) {
                this.color = str2;
                return;
            }
            int i4 = onNavigationEvent + 35;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            this.color = "adaptive-grey-600";
            if (i5 != 0) {
                throw null;
            }
        }

        public LoanText(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.text = str;
            this.color = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.loan.AppliedLoan.LoanText r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
            /*
                r0 = 2
                int r1 = r0 % r0
                r1 = 0
                boolean r2 = r5.onWarmupCompleted(r6, r1)
                if (r2 != 0) goto L27
                int r2 = viva.republica.toss.network.model.loan.AppliedLoan.LoanText.onNavigationEvent
                int r2 = r2 + 63
                int r3 = r2 % 128
                viva.republica.toss.network.model.loan.AppliedLoan.LoanText.IAuthTabCallback = r3
                int r2 = r2 % r0
                java.lang.String r3 = ""
                if (r2 != 0) goto L20
                java.lang.String r2 = r4.text
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                if (r2 != 0) goto L2c
                goto L27
            L20:
                java.lang.String r4 = r4.text
                kotlin.jvm.internal.Intrinsics.areEqual(r4, r3)
                r4 = 0
                throw r4
            L27:
                java.lang.String r2 = r4.text
                r5.onExtraCallback(r6, r1, r2)
            L2c:
                r1 = 1
                boolean r2 = r5.onWarmupCompleted(r6, r1)
                if (r2 != 0) goto L3e
                java.lang.String r2 = r4.color
                java.lang.String r3 = "adaptive-grey-600"
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                r2 = r2 ^ r1
                if (r2 == 0) goto L4c
            L3e:
                java.lang.String r4 = r4.color
                r5.onExtraCallback(r6, r1, r4)
                int r4 = viva.republica.toss.network.model.loan.AppliedLoan.LoanText.IAuthTabCallback
                int r4 = r4 + 63
                int r5 = r4 % 128
                viva.republica.toss.network.model.loan.AppliedLoan.LoanText.onNavigationEvent = r5
                int r4 = r4 % r0
            L4c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.AppliedLoan.LoanText.onWarmupCompleted(viva.republica.toss.network.model.loan.AppliedLoan$LoanText, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ LoanText(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onNavigationEvent + 75;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                str = "";
            }
            if ((i & 2) != 0) {
                int i4 = onNavigationEvent;
                int i5 = i4 + 109;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 63;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
                str2 = "adaptive-grey-600";
            }
            this(str, str2);
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = this.text;
            int i5 = i3 + 45;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = this.color;
            if (i3 != 0) {
                int i4 = 67 / 0;
            }
            return str;
        }
    }

    public final LoanProductStatus asBinder() {
        LoanProductStatus loanProductStatusValueOf;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallback = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                loanProductStatusValueOf = LoanProductStatus.valueOf(this.status);
                int i3 = 91 / 0;
            } else {
                loanProductStatusValueOf = LoanProductStatus.valueOf(this.status);
            }
            return loanProductStatusValueOf;
        } catch (Exception unused) {
            return LoanProductStatus.UNKNOWN;
        }
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        String str = new DecimalFormat("#.####", DecimalFormatSymbols.getInstance(Locale.ENGLISH)).format(Float.valueOf(this.interest)) + "%";
        int i2 = onExtraCallback + 91;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 72 / 0;
        }
        return str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(AppliedLoan appliedLoan, vyl vylVar, SerialDescriptor serialDescriptor) {
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1257416267, iOnExtraCallback2, iOnExtraCallback, -1257416267, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{appliedLoan, vylVar, serialDescriptor});
    }

    public final LoanReviewButtonText onWarmupCompleted() {
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        return (LoanReviewButtonText) onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 702383526, iOnExtraCallback2, iOnExtraCallback, -702383524, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this});
    }

    public final void onExtraCallbackWithResult(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 643418964, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback, -643418963, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), objArr);
    }
}
