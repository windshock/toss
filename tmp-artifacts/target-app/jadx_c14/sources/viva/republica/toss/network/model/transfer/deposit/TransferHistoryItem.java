package viva.republica.toss.network.model.transfer.deposit;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.IdGeneratorExternalSyntheticLambda1;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$$ExternalSyntheticLambda2;
import viva.republica.toss.network.model.transfer.deposit.TransferHistoryItem$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferHistoryItem {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final long amount;
    private final boolean isPrimaryAccountDeposit;
    private final long no;
    private final String receiveBankCode;
    private final String receiveBankName;
    private final long receiveCompleteTimestamp;
    private final String receiverAccount;
    private final String receiverName;
    private final String sendBankCode;
    private final String senderAccount;
    public static final Companion Companion = new Companion(null);
    private static final IdGeneratorExternalSyntheticLambda1 RECEIVE_TIME_FORMAT = IdGeneratorExternalSyntheticLambda1.Companion.onExtraCallback("yyyy.MM.dd | HH:mm");

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = i7 | i5;
        int i9 = ~i8;
        int i10 = ~i4;
        int i11 = i9 | (~(i10 | i5));
        int i12 = i8 | i10;
        int i13 = (~(i4 | i5)) | (~(i7 | (~i5)));
        int i14 = i5 + i + i2 + ((-1311665080) * i6) + (1761575915 * i3);
        int i15 = i14 * i14;
        int i16 = ((-2073022045) * i5) + 412680192 + (1917570655 * i) + (i11 * (-1995296350)) + (1995296350 * i12) + ((-1995296350) * i13) + ((-77725696) * i2) + (175112192 * i6) + ((-649461760) * i3) + (1783169024 * i15);
        int i17 = ((i5 * 1226044109) - 1701849991) + (i * 1226043089) + (i11 * 510) + (i12 * (-510)) + (i13 * 510) + (i2 * 1226043599) + (i6 * (-858626504)) + (i3 * 1069087493) + (i15 * 1627848704);
        return i16 + ((i17 * i17) * 739704832) != 1 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferHistoryItem)) {
            return false;
        }
        TransferHistoryItem transferHistoryItem = (TransferHistoryItem) obj;
        if (this.no != transferHistoryItem.no) {
            int i2 = onExtraCallback + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.amount != transferHistoryItem.amount || (!Intrinsics.areEqual(this.sendBankCode, transferHistoryItem.sendBankCode)) || !Intrinsics.areEqual(this.senderAccount, transferHistoryItem.senderAccount)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.receiveBankCode, transferHistoryItem.receiveBankCode)) {
            int i4 = onWarmupCompleted + 103;
            onExtraCallback = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.receiveBankName, transferHistoryItem.receiveBankName)) {
            int i5 = onExtraCallback + 125;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.receiverName, transferHistoryItem.receiverName)) {
            return false;
        }
        if (this.receiveCompleteTimestamp == transferHistoryItem.receiveCompleteTimestamp) {
            return Intrinsics.areEqual(this.receiverAccount, transferHistoryItem.receiverAccount) && this.isPrimaryAccountDeposit == transferHistoryItem.isPrimaryAccountDeposit;
        }
        int i6 = onWarmupCompleted + 63;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((Long.hashCode(this.no) * 31) + Long.hashCode(this.amount)) * 31) + this.sendBankCode.hashCode()) * 31) + this.senderAccount.hashCode()) * 31) + this.receiveBankCode.hashCode()) * 31) + this.receiveBankName.hashCode()) * 31) + this.receiverName.hashCode()) * 31) + Long.hashCode(this.receiveCompleteTimestamp)) * 31) + this.receiverAccount.hashCode()) * 31) + Boolean.hashCode(this.isPrimaryAccountDeposit);
        int i4 = onExtraCallback + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferHistoryItem(no=" + this.no + ", amount=" + this.amount + ", sendBankCode=" + this.sendBankCode + ", senderAccount=" + this.senderAccount + ", receiveBankCode=" + this.receiveBankCode + ", receiveBankName=" + this.receiveBankName + ", receiverName=" + this.receiverName + ", receiveCompleteTimestamp=" + this.receiveCompleteTimestamp + ", receiverAccount=" + this.receiverAccount + ", isPrimaryAccountDeposit=" + this.isPrimaryAccountDeposit + ")";
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
        return str;
    }

    public /* synthetic */ TransferHistoryItem(int i, long j, long j2, String str, String str2, String str3, String str4, String str5, long j3, String str6, boolean z, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 1023;
        if (1023 != (i & 1023)) {
            int i3 = onExtraCallback + 107;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = TransferHistoryItem$.serializer.INSTANCE.getDescriptor();
                i2 = 16455;
            } else {
                descriptor = TransferHistoryItem$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.no = j;
        this.amount = j2;
        this.sendBankCode = str;
        this.senderAccount = str2;
        this.receiveBankCode = str3;
        this.receiveBankName = str4;
        this.receiverName = str5;
        this.receiveCompleteTimestamp = j3;
        this.receiverAccount = str6;
        this.isPrimaryAccountDeposit = z;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(TransferHistoryItem transferHistoryItem, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, transferHistoryItem.no);
        vylVar.onExtraCallback(serialDescriptor, 1, transferHistoryItem.amount);
        vylVar.onExtraCallback(serialDescriptor, 2, transferHistoryItem.sendBankCode);
        vylVar.onExtraCallback(serialDescriptor, 3, transferHistoryItem.senderAccount);
        vylVar.onExtraCallback(serialDescriptor, 4, transferHistoryItem.receiveBankCode);
        vylVar.onExtraCallback(serialDescriptor, 5, transferHistoryItem.receiveBankName);
        vylVar.onExtraCallback(serialDescriptor, 6, transferHistoryItem.receiverName);
        vylVar.onExtraCallback(serialDescriptor, 7, transferHistoryItem.receiveCompleteTimestamp);
        vylVar.onExtraCallback(serialDescriptor, 8, transferHistoryItem.receiverAccount);
        vylVar.onNavigationEvent(serialDescriptor, 9, transferHistoryItem.isPrimaryAccountDeposit);
        int i4 = onExtraCallback + 33;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        long j = this.no;
        int i5 = i3 + 61;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        long j;
        TransferHistoryItem transferHistoryItem = (TransferHistoryItem) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 105;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            j = transferHistoryItem.amount;
            int i4 = 18 / 0;
        } else {
            j = transferHistoryItem.amount;
        }
        int i5 = i2 + 55;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return Long.valueOf(j);
        }
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.sendBankCode;
        int i5 = i3 + 83;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.senderAccount;
        int i5 = i3 + 125;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.receiveBankCode;
        }
        throw null;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.receiverName;
        int i4 = i3 + 103;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        long j = this.receiveCompleteTimestamp;
        int i5 = i3 + 23;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.receiverAccount;
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferHistoryItem> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            TransferHistoryItem$.serializer serializerVar = TransferHistoryItem$.serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 83;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 97 / 0;
        }
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = RECEIVE_TIME_FORMAT.format(Long.valueOf(this.receiveCompleteTimestamp));
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i4 = onWarmupCompleted + 65;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TransferHistoryItem transferHistoryItem = (TransferHistoryItem) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (!(!transferHistoryItem.isPrimaryAccountDeposit)) {
            return "토스";
        }
        String str = transferHistoryItem.receiveBankName + " " + transferHistoryItem.receiverAccount;
        int i4 = onExtraCallback + 55;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int iOnWarmupCompleted = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted3 = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        return ((Long) onWarmupCompleted(-365243220, iOnWarmupCompleted2, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, 365243221, iOnWarmupCompleted3)).longValue();
    }

    public final String onNavigationEvent() {
        int iOnWarmupCompleted = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted3 = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        return (String) onWarmupCompleted(-181736901, iOnWarmupCompleted2, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, 181736901, iOnWarmupCompleted3);
    }
}
