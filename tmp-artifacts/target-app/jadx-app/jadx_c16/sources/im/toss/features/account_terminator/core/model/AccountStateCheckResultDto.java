package im.toss.features.account_terminator.core.model;

import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import im.toss.features.account_terminator.core.model.AccountStateCheckResultDto$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AccountStateCheckResultDto {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final long accountBalance;
    private final long additionalTax;
    private final long incomeTax;
    private final long interest;
    private final long localTax;
    private final long otherTax;
    private final long paymentAmount;
    private final long penalty;
    private final String prodName;
    private final String resultCode;
    private final String resultMessage;
    private final String terminationAccountBankCode;
    private final String terminationAccountNumber;
    private final String terminationDepositSequence;
    private final String terminationId;
    private final long transferFee;

    static {
        int i = onNavigationEvent + 35;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 3 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = (~(i7 | i5)) | i2;
        int i9 = ~i5;
        int i10 = ~i2;
        int i11 = (~(i9 | i10)) | i3;
        int i12 = (~(i2 | i9 | i3)) | (~(i7 | i9 | i10)) | (~(i10 | i5 | i3));
        int i13 = i5 + i3 + i4 + ((-104759182) * i) + ((-453318476) * i6);
        int i14 = i13 * i13;
        int i15 = (i5 * 1504131295) + 1805123584 + (1504131295 * i3) + (179255518 * i8) + ((-358511036) * i11) + ((-179255518) * i12) + (1324875776 * i4) + (711983104 * i) + (1180696576 * i6) + (1022754816 * i14);
        int i16 = ((i5 * (-1431886989)) - 1507491630) + (i3 * (-1431886989)) + (i8 * (-122)) + (i11 * 244) + (i12 * 122) + (i4 * (-1431886867)) + (i * 722567050) + (i6 * (-1618605404)) + (i14 * 297664512);
        return i15 + ((i16 * i16) * (-277217280)) != 1 ? onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountStateCheckResultDto)) {
            return false;
        }
        AccountStateCheckResultDto accountStateCheckResultDto = (AccountStateCheckResultDto) obj;
        if (!Intrinsics.areEqual(this.resultCode, accountStateCheckResultDto.resultCode)) {
            int i2 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 == 0;
        }
        if ((!Intrinsics.areEqual(this.resultMessage, accountStateCheckResultDto.resultMessage)) || !Intrinsics.areEqual(this.terminationAccountNumber, accountStateCheckResultDto.terminationAccountNumber)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.terminationDepositSequence, accountStateCheckResultDto.terminationDepositSequence)) {
            int i3 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i3 % 128;
            return i3 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.terminationAccountBankCode, accountStateCheckResultDto.terminationAccountBankCode)) {
            int i4 = onExtraCallbackWithResult + 1;
            int i5 = i4 % 128;
            onWarmupCompleted = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 65;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.terminationId, accountStateCheckResultDto.terminationId) || !Intrinsics.areEqual(this.prodName, accountStateCheckResultDto.prodName) || this.accountBalance != accountStateCheckResultDto.accountBalance) {
            return false;
        }
        if (this.incomeTax != accountStateCheckResultDto.incomeTax) {
            int i9 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.localTax != accountStateCheckResultDto.localTax) {
            return false;
        }
        if (this.additionalTax == accountStateCheckResultDto.additionalTax) {
            return this.otherTax == accountStateCheckResultDto.otherTax && this.interest == accountStateCheckResultDto.interest && this.penalty == accountStateCheckResultDto.penalty && this.transferFee == accountStateCheckResultDto.transferFee && this.paymentAmount == accountStateCheckResultDto.paymentAmount;
        }
        int i11 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.resultCode.hashCode();
        String str = this.resultMessage;
        int iHashCode4 = 0;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.terminationAccountNumber.hashCode();
        String str2 = this.terminationDepositSequence;
        if (str2 == null) {
            int i2 = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.terminationAccountBankCode;
        if (str3 == null) {
            int i4 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.terminationId;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.prodName;
        if (str5 != null) {
            int i6 = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            iHashCode4 = str5.hashCode();
        }
        return (((((((((((((((((((((((((((((iHashCode3 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + iHashCode4) * 31) + Long.hashCode(this.accountBalance)) * 31) + Long.hashCode(this.incomeTax)) * 31) + Long.hashCode(this.localTax)) * 31) + Long.hashCode(this.additionalTax)) * 31) + Long.hashCode(this.otherTax)) * 31) + Long.hashCode(this.interest)) * 31) + Long.hashCode(this.penalty)) * 31) + Long.hashCode(this.transferFee)) * 31) + Long.hashCode(this.paymentAmount);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountStateCheckResultDto(resultCode=" + this.resultCode + ", resultMessage=" + this.resultMessage + ", terminationAccountNumber=" + this.terminationAccountNumber + ", terminationDepositSequence=" + this.terminationDepositSequence + ", terminationAccountBankCode=" + this.terminationAccountBankCode + ", terminationId=" + this.terminationId + ", prodName=" + this.prodName + ", accountBalance=" + this.accountBalance + ", incomeTax=" + this.incomeTax + ", localTax=" + this.localTax + ", additionalTax=" + this.additionalTax + ", otherTax=" + this.otherTax + ", interest=" + this.interest + ", penalty=" + this.penalty + ", transferFee=" + this.transferFee + ", paymentAmount=" + this.paymentAmount + ")";
        int i2 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AccountStateCheckResultDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, okycx okycxVar) {
        if (5 != (i & 5)) {
            int i2 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 5, AccountStateCheckResultDto$.serializer.INSTANCE.getDescriptor());
        }
        this.resultCode = str;
        Object obj = null;
        if ((i & 2) == 0) {
            this.resultMessage = null;
        } else {
            this.resultMessage = str2;
        }
        this.terminationAccountNumber = str3;
        if ((i & 8) == 0) {
            this.terminationDepositSequence = null;
        } else {
            this.terminationDepositSequence = str4;
        }
        if ((i & 16) == 0) {
            this.terminationAccountBankCode = null;
        } else {
            this.terminationAccountBankCode = str5;
        }
        if ((i & 32) == 0) {
            int i4 = onWarmupCompleted + 121;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            this.terminationId = null;
            if (i5 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.terminationId = str6;
        }
        if ((i & 64) == 0) {
            this.prodName = null;
        } else {
            this.prodName = str7;
        }
        if ((i & 128) == 0) {
            int i6 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            this.accountBalance = 0L;
        } else {
            this.accountBalance = j;
        }
        if ((i & 256) == 0) {
            int i8 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            this.incomeTax = 0L;
        } else {
            this.incomeTax = j2;
        }
        if ((i & 512) == 0) {
            this.localTax = 0L;
            int i10 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 % 2;
            }
        } else {
            this.localTax = j3;
            int i12 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 == 0) {
            }
        }
        if ((i & 1024) == 0) {
            this.additionalTax = 0L;
        } else {
            this.additionalTax = j4;
        }
        if ((i & 2048) == 0) {
            int i13 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            this.otherTax = 0L;
            int i15 = 2 % 2;
        } else {
            this.otherTax = j5;
        }
        if ((i & 4096) == 0) {
            this.interest = 0L;
        } else {
            this.interest = j6;
        }
        if ((i & 8192) == 0) {
            this.penalty = 0L;
        } else {
            this.penalty = j7;
        }
        if ((i & 16384) == 0) {
            this.transferFee = 0L;
        } else {
            this.transferFee = j8;
            int i16 = 2 % 2;
        }
        if ((i & 32768) != 0) {
            this.paymentAmount = j9;
            return;
        }
        int i17 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i17 % 128;
        int i18 = i17 % 2;
        this.paymentAmount = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(AccountStateCheckResultDto accountStateCheckResultDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, accountStateCheckResultDto.resultCode);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                if (accountStateCheckResultDto.resultMessage != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, accountStateCheckResultDto.resultMessage);
                }
            }
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, accountStateCheckResultDto.resultCode);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 2, accountStateCheckResultDto.terminationAccountNumber);
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || accountStateCheckResultDto.terminationDepositSequence != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, accountStateCheckResultDto.terminationDepositSequence);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || accountStateCheckResultDto.terminationAccountBankCode != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, accountStateCheckResultDto.terminationAccountBankCode);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || accountStateCheckResultDto.terminationId != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, accountStateCheckResultDto.terminationId);
            int i3 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 / 3;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || accountStateCheckResultDto.prodName != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, accountStateCheckResultDto.prodName);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 7) || accountStateCheckResultDto.accountBalance != 0) {
            vylVar.onExtraCallback(serialDescriptor, 7, accountStateCheckResultDto.accountBalance);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 8) || accountStateCheckResultDto.incomeTax != 0) {
            vylVar.onExtraCallback(serialDescriptor, 8, accountStateCheckResultDto.incomeTax);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 9) || accountStateCheckResultDto.localTax != 0) {
            vylVar.onExtraCallback(serialDescriptor, 9, accountStateCheckResultDto.localTax);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 10) || accountStateCheckResultDto.additionalTax != 0) {
            vylVar.onExtraCallback(serialDescriptor, 10, accountStateCheckResultDto.additionalTax);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 11)) {
            int i5 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (accountStateCheckResultDto.otherTax != 0) {
                vylVar.onExtraCallback(serialDescriptor, 11, accountStateCheckResultDto.otherTax);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 12) || accountStateCheckResultDto.interest != 0) {
            vylVar.onExtraCallback(serialDescriptor, 12, accountStateCheckResultDto.interest);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 13) || accountStateCheckResultDto.penalty != 0) {
            vylVar.onExtraCallback(serialDescriptor, 13, accountStateCheckResultDto.penalty);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 14) || accountStateCheckResultDto.transferFee != 0) {
            vylVar.onExtraCallback(serialDescriptor, 14, accountStateCheckResultDto.transferFee);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 15)) {
            int i7 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            if (accountStateCheckResultDto.paymentAmount == 0) {
                return;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 15, accountStateCheckResultDto.paymentAmount);
        int i9 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 5 % 4;
        }
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.resultCode;
        int i5 = i3 + 1;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.resultMessage;
        }
        throw null;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.terminationAccountNumber;
        int i5 = i2 + 49;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return str;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.terminationDepositSequence;
        }
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            str = this.terminationAccountBankCode;
            int i4 = 69 / 0;
        } else {
            str = this.terminationAccountBankCode;
        }
        int i5 = i3 + 115;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AccountStateCheckResultDto accountStateCheckResultDto = (AccountStateCheckResultDto) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = accountStateCheckResultDto.terminationId;
        if (i3 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.accountBalance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.interest;
        }
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 51;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.paymentAmount;
        int i4 = i2 + 1;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AccountStateCheckResultDto accountStateCheckResultDto = (AccountStateCheckResultDto) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        long j = accountStateCheckResultDto.incomeTax;
        long j2 = accountStateCheckResultDto.localTax;
        long j3 = i4 == 0 ? ((((j ^ j2) - accountStateCheckResultDto.additionalTax) & accountStateCheckResultDto.otherTax) | accountStateCheckResultDto.penalty) ^ accountStateCheckResultDto.transferFee : j + j2 + accountStateCheckResultDto.additionalTax + accountStateCheckResultDto.otherTax + accountStateCheckResultDto.penalty + accountStateCheckResultDto.transferFee;
        int i5 = i3 + 87;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return Long.valueOf(j3);
    }

    public final String asInterface() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return (String) onExtraCallbackWithResult(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, 730650275, iOnNavigationEvent2, -730650274, new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent());
    }

    public final long asBinder() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Long) onExtraCallbackWithResult(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, 1790313762, iOnNavigationEvent2, -1790313762, new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent())).longValue();
    }
}
