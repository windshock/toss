package im.toss.features.account_terminator.core.model;

import im.toss.features.account_terminator.core.model.AccountTransferResultDto$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.oty1;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AccountTransferResultDto {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final Long accountBalance;
    private final Long paymentAmount;
    private final String prodName;
    private final String recipientResultCode;
    private final String terminationAccountBankCode;
    private final String terminationAccountNumber;
    private final String terminationDepositSequence;
    private final String terminationId;
    private final String terminationResultCode;

    static {
        int i = onExtraCallback + 37;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 119;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof AccountTransferResultDto)) {
            return false;
        }
        AccountTransferResultDto accountTransferResultDto = (AccountTransferResultDto) obj;
        if (!Intrinsics.areEqual(this.terminationResultCode, accountTransferResultDto.terminationResultCode) || !Intrinsics.areEqual(this.recipientResultCode, accountTransferResultDto.recipientResultCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.terminationId, accountTransferResultDto.terminationId)) {
            int i7 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.terminationAccountNumber, accountTransferResultDto.terminationAccountNumber) || !Intrinsics.areEqual(this.terminationDepositSequence, accountTransferResultDto.terminationDepositSequence)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.terminationAccountBankCode, accountTransferResultDto.terminationAccountBankCode)) {
            int i8 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.prodName, accountTransferResultDto.prodName)) {
            int i10 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.accountBalance, accountTransferResultDto.accountBalance)) {
            return Intrinsics.areEqual(this.paymentAmount, accountTransferResultDto.paymentAmount);
        }
        int i12 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i12 % 128;
        return i12 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iHashCode4 = this.terminationResultCode.hashCode();
        String str = this.recipientResultCode;
        if (str == null) {
            int i2 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.terminationId;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        int iHashCode6 = this.terminationAccountNumber.hashCode();
        String str3 = this.terminationDepositSequence;
        if (str3 == null) {
            int i4 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.terminationAccountBankCode;
        if (str4 == null) {
            int i6 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
            int i8 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
        }
        String str5 = this.prodName;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        Long l = this.accountBalance;
        int iHashCode8 = l == null ? 0 : l.hashCode();
        Long l2 = this.paymentAmount;
        return (((((((((((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountTransferResultDto(terminationResultCode=" + this.terminationResultCode + ", recipientResultCode=" + this.recipientResultCode + ", terminationId=" + this.terminationId + ", terminationAccountNumber=" + this.terminationAccountNumber + ", terminationDepositSequence=" + this.terminationDepositSequence + ", terminationAccountBankCode=" + this.terminationAccountBankCode + ", prodName=" + this.prodName + ", accountBalance=" + this.accountBalance + ", paymentAmount=" + this.paymentAmount + ")";
        int i2 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(AccountTransferResultDto accountTransferResultDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        Long l;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, accountTransferResultDto.terminationResultCode);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                if (accountTransferResultDto.recipientResultCode != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, accountTransferResultDto.recipientResultCode);
                }
            }
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, accountTransferResultDto.terminationResultCode);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i3 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (accountTransferResultDto.terminationId != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, accountTransferResultDto.terminationId);
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 3, accountTransferResultDto.terminationAccountNumber);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i5 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 78 / 0;
                if (accountTransferResultDto.terminationDepositSequence != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, accountTransferResultDto.terminationDepositSequence);
                }
            } else if (accountTransferResultDto.terminationDepositSequence != null) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
            int i7 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            if (accountTransferResultDto.terminationAccountBankCode != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, accountTransferResultDto.terminationAccountBankCode);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || accountTransferResultDto.prodName != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, accountTransferResultDto.prodName);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 7)) {
            int i9 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            Long l2 = accountTransferResultDto.accountBalance;
            if (l2 == null || l2.longValue() != 0) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 7, oty1.onExtraCallback, accountTransferResultDto.accountBalance);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 8) || (l = accountTransferResultDto.paymentAmount) == null || l.longValue() != 0) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 8, oty1.onExtraCallback, accountTransferResultDto.paymentAmount);
            int i11 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.terminationResultCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.recipientResultCode;
        }
        throw null;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 11;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.terminationId;
        int i5 = i2 + 27;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 107;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.terminationAccountNumber;
        int i4 = i2 + 13;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
        return str;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.terminationDepositSequence;
        int i5 = i3 + 77;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 49;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.terminationAccountBankCode;
        int i4 = i2 + 45;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ AccountTransferResultDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, Long l2, okycx okycxVar) {
        if (9 != (i & 9)) {
            int i2 = onNavigationEvent + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 9, AccountTransferResultDto$.serializer.INSTANCE.getDescriptor());
        }
        this.terminationResultCode = str;
        if ((i & 2) == 0) {
            this.recipientResultCode = null;
        } else {
            this.recipientResultCode = str2;
        }
        if ((i & 4) == 0) {
            this.terminationId = null;
        } else {
            this.terminationId = str3;
            int i4 = 2 % 2;
        }
        this.terminationAccountNumber = str4;
        if ((i & 16) == 0) {
            this.terminationDepositSequence = null;
        } else {
            this.terminationDepositSequence = str5;
            int i5 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        if ((i & 32) == 0) {
            int i8 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            this.terminationAccountBankCode = null;
        } else {
            this.terminationAccountBankCode = str6;
        }
        if ((i & 64) == 0) {
            int i10 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            this.prodName = null;
            if (i11 == 0) {
                throw null;
            }
        } else {
            this.prodName = str7;
            int i12 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 3 / 2;
            } else {
                int i14 = 2 % 2;
            }
        }
        if ((i & 128) == 0) {
            this.accountBalance = 0L;
        } else {
            this.accountBalance = l;
        }
        if ((i & 256) == 0) {
            this.paymentAmount = 0L;
        } else {
            this.paymentAmount = l2;
        }
    }

    public final Long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 59;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Long l = this.accountBalance;
        int i4 = i2 + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return l;
    }

    public final Long onExtraCallback() {
        Long l;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 25;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            l = this.paymentAmount;
            int i4 = 57 / 0;
        } else {
            l = this.paymentAmount;
        }
        int i5 = i2 + 83;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return l;
        }
        throw null;
    }
}
