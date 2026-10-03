package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2;
import o.liq;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanAccountResponse implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String accountName;
    private final String accountType;
    private final long balanceAmount;
    private final int bankCode;
    private final String companyIconFillUrl;
    private final String companyIconUrl;
    private final String companyName;
    private final String expiredDate;
    private final float interestRate;
    private final boolean isOverdraftAccount;
    private final long limitAmount;
    private final String orgCode;
    private final int period;
    private final String repayCalculatorMethod;
    private final String repayMethod;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LoanAccountResponse> CREATOR = new onWarmupCompleted();

    public static final class onWarmupCompleted implements Parcelable.Creator<LoanAccountResponse> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanAccountResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            LoanAccountResponse loanAccountResponseOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = onWarmupCompleted + 67;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 85 / 0;
            }
            return loanAccountResponseOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanAccountResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 41;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            LoanAccountResponse[] loanAccountResponseArrOnExtraCallback = onExtraCallback(i);
            int i5 = onExtraCallback + 121;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return loanAccountResponseArrOnExtraCallback;
            }
            throw null;
        }

        public final LoanAccountResponse[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 9;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            LoanAccountResponse[] loanAccountResponseArr = new LoanAccountResponse[i];
            int i6 = i3 + 75;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return loanAccountResponseArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0074 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final viva.republica.toss.network.model.loan.LoanAccountResponse onExtraCallbackWithResult(android.os.Parcel r21) {
            /*
                r20 = this;
                r0 = 2
                int r1 = r0 % r0
                java.lang.String r1 = ""
                r2 = r21
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
                long r3 = r21.readLong()
                long r5 = r21.readLong()
                java.lang.String r7 = r21.readString()
                java.lang.String r8 = r21.readString()
                int r9 = r21.readInt()
                java.lang.String r10 = r21.readString()
                java.lang.String r11 = r21.readString()
                java.lang.String r12 = r21.readString()
                java.lang.String r13 = r21.readString()
                java.lang.String r14 = r21.readString()
                java.lang.String r15 = r21.readString()
                int r16 = r21.readInt()
                java.lang.String r17 = r21.readString()
                float r18 = r21.readFloat()
                int r1 = r21.readInt()
                if (r1 == 0) goto L58
                int r1 = viva.republica.toss.network.model.loan.LoanAccountResponse.onWarmupCompleted.onWarmupCompleted
                int r1 = r1 + 93
                int r2 = r1 % 128
                viva.republica.toss.network.model.loan.LoanAccountResponse.onWarmupCompleted.onExtraCallback = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L54
                goto L61
            L54:
                r1 = 1
                r19 = r1
                goto L63
            L58:
                int r1 = viva.republica.toss.network.model.loan.LoanAccountResponse.onWarmupCompleted.onWarmupCompleted
                int r1 = r1 + 87
                int r2 = r1 % 128
                viva.republica.toss.network.model.loan.LoanAccountResponse.onWarmupCompleted.onExtraCallback = r2
                int r1 = r1 % r0
            L61:
                r19 = 0
            L63:
                viva.republica.toss.network.model.loan.LoanAccountResponse r1 = new viva.republica.toss.network.model.loan.LoanAccountResponse
                r2 = r1
                r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                int r2 = viva.republica.toss.network.model.loan.LoanAccountResponse.onWarmupCompleted.onExtraCallback
                int r2 = r2 + 53
                int r3 = r2 % 128
                viva.republica.toss.network.model.loan.LoanAccountResponse.onWarmupCompleted.onWarmupCompleted = r3
                int r2 = r2 % r0
                if (r2 != 0) goto L75
                return r1
            L75:
                r0 = 0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanAccountResponse.onWarmupCompleted.onExtraCallbackWithResult(android.os.Parcel):viva.republica.toss.network.model.loan.LoanAccountResponse");
        }
    }

    static {
        int i = IAuthTabCallback + 121;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public LoanAccountResponse() {
        this(0L, 0L, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 0.0f, false, 32767, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~((~i5) | i7);
        int i9 = i6 | i8 | (~(i | i5));
        int i10 = (~(i5 | i6)) | (~(i7 | i5)) | (~(i7 | i6));
        int i11 = i6 + i + i3 + (1351532378 * i4) + (1237199896 * i2);
        int i12 = i11 * i11;
        int i13 = ((-211156802) * i6) + 1314914304 + ((-491389116) * i) + (2007367491 * i9) + (i10 * (-2007367491)) + ((-2007367491) * i8) + (1796210688 * i3) + ((-1818230784) * i4) + ((-914358272) * i2) + ((-2051670016) * i12);
        int i14 = ((i6 * 406040238) - 634933780) + (i * 406038884) + (i9 * (-677)) + (i10 * 677) + (i8 * 677) + (i3 * 406039561) + (i4 * 1283666474) + (i2 * 1712827608) + (i12 * (-77201408));
        int i15 = i13 + (i14 * i14 * 1831469056);
        if (i15 != 1) {
            return i15 != 2 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
        }
        LoanAccountResponse loanAccountResponse = (LoanAccountResponse) objArr[0];
        int i16 = 2 % 2;
        int i17 = onNavigationEvent;
        int i18 = i17 + 109;
        onWarmupCompleted = i18 % 128;
        int i19 = i18 % 2;
        String str = loanAccountResponse.accountName;
        int i20 = i17 + 55;
        onWarmupCompleted = i20 % 128;
        int i21 = i20 % 2;
        return str;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        LoanAccountResponse loanAccountResponse = (LoanAccountResponse) objArr[0];
        Parcel parcel = (Parcel) objArr[1];
        ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(loanAccountResponse.balanceAmount);
        parcel.writeLong(loanAccountResponse.limitAmount);
        parcel.writeString(loanAccountResponse.companyName);
        parcel.writeString(loanAccountResponse.accountName);
        parcel.writeInt(loanAccountResponse.bankCode);
        parcel.writeString(loanAccountResponse.orgCode);
        parcel.writeString(loanAccountResponse.companyIconFillUrl);
        parcel.writeString(loanAccountResponse.companyIconUrl);
        parcel.writeString(loanAccountResponse.repayMethod);
        parcel.writeString(loanAccountResponse.repayCalculatorMethod);
        parcel.writeString(loanAccountResponse.expiredDate);
        parcel.writeInt(loanAccountResponse.period);
        parcel.writeString(loanAccountResponse.accountType);
        parcel.writeFloat(loanAccountResponse.interestRate);
        parcel.writeInt(loanAccountResponse.isOverdraftAccount ? 1 : 0);
        int i4 = onNavigationEvent + 93;
        onWarmupCompleted = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 81;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 3;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanAccountResponse)) {
            int i4 = i2 + 45;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        LoanAccountResponse loanAccountResponse = (LoanAccountResponse) obj;
        if (this.balanceAmount != loanAccountResponse.balanceAmount) {
            int i6 = i2 + 59;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.limitAmount != loanAccountResponse.limitAmount || !Intrinsics.areEqual(this.companyName, loanAccountResponse.companyName) || !Intrinsics.areEqual(this.accountName, loanAccountResponse.accountName)) {
            return false;
        }
        if (this.bankCode != loanAccountResponse.bankCode) {
            int i8 = onWarmupCompleted + 107;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.orgCode, loanAccountResponse.orgCode) || !Intrinsics.areEqual(this.companyIconFillUrl, loanAccountResponse.companyIconFillUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.companyIconUrl, loanAccountResponse.companyIconUrl)) {
            int i10 = onWarmupCompleted + 113;
            onNavigationEvent = i10 % 128;
            return i10 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.repayMethod, loanAccountResponse.repayMethod) || !Intrinsics.areEqual(this.repayCalculatorMethod, loanAccountResponse.repayCalculatorMethod)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.expiredDate, loanAccountResponse.expiredDate)) {
            int i11 = onWarmupCompleted + 121;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (this.period != loanAccountResponse.period) {
            return false;
        }
        if (!Intrinsics.areEqual(this.accountType, loanAccountResponse.accountType)) {
            int i13 = onNavigationEvent + 61;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (Float.compare(this.interestRate, loanAccountResponse.interestRate) != 0) {
            return false;
        }
        if (this.isOverdraftAccount == loanAccountResponse.isOverdraftAccount) {
            return true;
        }
        int i15 = onNavigationEvent + 53;
        onWarmupCompleted = i15 % 128;
        return i15 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((((((((((Long.hashCode(this.balanceAmount) * 31) + Long.hashCode(this.limitAmount)) * 31) + this.companyName.hashCode()) * 31) + this.accountName.hashCode()) * 31) + Integer.hashCode(this.bankCode)) * 31) + this.orgCode.hashCode()) * 31) + this.companyIconFillUrl.hashCode()) * 31) + this.companyIconUrl.hashCode()) * 31) + this.repayMethod.hashCode()) * 31) + this.repayCalculatorMethod.hashCode()) * 31) + this.expiredDate.hashCode()) * 31) + Integer.hashCode(this.period)) * 31) + this.accountType.hashCode()) * 31) + Float.hashCode(this.interestRate)) * 31) + Boolean.hashCode(this.isOverdraftAccount);
        int i4 = onWarmupCompleted + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanAccountResponse(balanceAmount=" + this.balanceAmount + ", limitAmount=" + this.limitAmount + ", companyName=" + this.companyName + ", accountName=" + this.accountName + ", bankCode=" + this.bankCode + ", orgCode=" + this.orgCode + ", companyIconFillUrl=" + this.companyIconFillUrl + ", companyIconUrl=" + this.companyIconUrl + ", repayMethod=" + this.repayMethod + ", repayCalculatorMethod=" + this.repayCalculatorMethod + ", expiredDate=" + this.expiredDate + ", period=" + this.period + ", accountType=" + this.accountType + ", interestRate=" + this.interestRate + ", isOverdraftAccount=" + this.isOverdraftAccount + ")";
        int i2 = onWarmupCompleted + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanAccountResponse> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            LoanAccountResponse$$serializer loanAccountResponse$$serializer = LoanAccountResponse$$serializer.INSTANCE;
            if (i3 == 0) {
                return loanAccountResponse$$serializer;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ LoanAccountResponse(int r8, long r9, long r11, java.lang.String r13, java.lang.String r14, int r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, java.lang.String r23, float r24, boolean r25, o.okycx r26) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanAccountResponse.<init>(int, long, long, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, float, boolean, o.okycx):void");
    }

    public LoanAccountResponse(long j, long j2, @NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, int i2, @NotNull String str9, float f, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.balanceAmount = j;
        this.limitAmount = j2;
        this.companyName = str;
        this.accountName = str2;
        this.bankCode = i;
        this.orgCode = str3;
        this.companyIconFillUrl = str4;
        this.companyIconUrl = str5;
        this.repayMethod = str6;
        this.repayCalculatorMethod = str7;
        this.expiredDate = str8;
        this.period = i2;
        this.accountType = str9;
        this.interestRate = f;
        this.isOverdraftAccount = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onNavigationEvent(java.lang.Object[] r10) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanAccountResponse.onNavigationEvent(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanAccountResponse(long j, long j2, String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, float f, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        int i4;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        int i5;
        int i6;
        String str15;
        long j3 = 0;
        long j4 = (i3 & 1) != 0 ? 0L : j;
        if ((i3 & 2) != 0) {
            int i7 = onWarmupCompleted + 31;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        } else {
            j3 = j2;
        }
        String str16 = (i3 & 4) != 0 ? "" : str;
        String str17 = (i3 & 8) != 0 ? "" : str2;
        if ((i3 & 16) != 0) {
            int i10 = 2 % 2;
            i4 = 0;
        } else {
            i4 = i;
        }
        String str18 = (i3 & 32) != 0 ? "" : str3;
        String str19 = (i3 & 64) != 0 ? "" : str4;
        Object obj = null;
        if ((i3 & 128) != 0) {
            int i11 = onNavigationEvent + 77;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str10 = "";
        } else {
            str10 = str5;
        }
        if ((i3 & 256) != 0) {
            int i12 = onNavigationEvent + 123;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 3 / 0;
            }
            str11 = "";
        } else {
            str11 = str6;
        }
        if ((i3 & 512) != 0) {
            int i14 = onNavigationEvent + 81;
            onWarmupCompleted = i14 % 128;
            if (i14 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i15 = 2 % 2;
            str12 = "";
        } else {
            str12 = str7;
        }
        if ((i3 & 1024) != 0) {
            int i16 = 2 % 2;
            str13 = "";
        } else {
            str13 = str8;
        }
        if ((i3 & 2048) != 0) {
            int i17 = onWarmupCompleted + 7;
            str14 = "";
            onNavigationEvent = i17 % 128;
            int i18 = i17 % 2;
            i5 = 0;
        } else {
            str14 = "";
            i5 = i2;
        }
        if ((i3 & 4096) != 0) {
            int i19 = onNavigationEvent + 53;
            i6 = i5;
            onWarmupCompleted = i19 % 128;
            int i20 = i19 % 2;
            str15 = str14;
        } else {
            i6 = i5;
            str15 = str9;
        }
        this(j4, j3, str16, str17, i4, str18, str19, str10, str11, str12, str13, i6, str15, (i3 & 8192) != 0 ? 0.0f : f, (i3 & 16384) != 0 ? true : z);
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.balanceAmount;
        }
        throw null;
    }

    public final long onTransact() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.limitAmount;
        }
        int i3 = 92 / 0;
        return this.limitAmount;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 105;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.companyName;
        int i4 = i2 + 101;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = this.bankCode;
        int i6 = i3 + 125;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.orgCode;
        int i5 = i3 + 55;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 77;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.companyIconFillUrl;
            int i4 = 33 / 0;
        } else {
            str = this.companyIconFillUrl;
        }
        int i5 = i2 + 111;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.companyIconUrl;
        }
        throw null;
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.repayMethod;
        int i5 = i3 + 63;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.repayCalculatorMethod;
        int i4 = i3 + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.expiredDate;
        }
        throw null;
    }

    public final int IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 71;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.period;
        int i5 = i2 + 97;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final float IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = this.interestRate;
        int i4 = i3 + 123;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return f;
    }

    public final boolean access100() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 97;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.isOverdraftAccount;
        int i4 = i2 + 25;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return z;
    }

    public final DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2 diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2OnNavigationEvent = DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2.Companion.onNavigationEvent(this.accountType);
        int i4 = onWarmupCompleted + 83;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda2OnNavigationEvent;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(LoanAccountResponse loanAccountResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        onExtraCallbackWithResult(1157559017, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent, new Object[]{loanAccountResponse, vylVar, serialDescriptor}, -1157559015);
    }

    public final String onNavigationEvent() {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (String) onExtraCallbackWithResult(-1331248178, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent, new Object[]{this}, 1331248179);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Object[] objArr = {this, parcel, Integer.valueOf(i)};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        onExtraCallbackWithResult(183453040, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, objArr, -183453040);
    }
}
