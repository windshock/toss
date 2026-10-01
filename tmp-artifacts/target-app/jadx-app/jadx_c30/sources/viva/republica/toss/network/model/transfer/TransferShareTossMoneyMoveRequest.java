package viva.republica.toss.network.model.transfer;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.TransferSignatureDto$;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TransferShareTossMoneyMoveRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final long amount;
    private final TransferShareTossMoneyMoveAccountModel depositAccount;
    private final TransferSignatureDto signatureDto;
    private final TransferShareTossMoneyMoveAccountModel withdrawAccount;

    static {
        int i = onWarmupCompleted + 59;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 59 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof TransferShareTossMoneyMoveRequest)) {
                return false;
            }
            TransferShareTossMoneyMoveRequest transferShareTossMoneyMoveRequest = (TransferShareTossMoneyMoveRequest) obj;
            if (Intrinsics.areEqual(this.withdrawAccount, transferShareTossMoneyMoveRequest.withdrawAccount)) {
                return Intrinsics.areEqual(this.depositAccount, transferShareTossMoneyMoveRequest.depositAccount) && this.amount == transferShareTossMoneyMoveRequest.amount && Intrinsics.areEqual(this.signatureDto, transferShareTossMoneyMoveRequest.signatureDto);
            }
            int i2 = onExtraCallbackWithResult + 25;
            onExtraCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        int i3 = onExtraCallback + 27;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        boolean z = i3 % 2 == 0;
        int i5 = i4 + 9;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.withdrawAccount.hashCode() * 31) + this.depositAccount.hashCode()) * 31) + Long.hashCode(this.amount)) * 31) + this.signatureDto.hashCode();
        int i4 = onExtraCallback + 71;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferShareTossMoneyMoveRequest(withdrawAccount=" + this.withdrawAccount + ", depositAccount=" + this.depositAccount + ", amount=" + this.amount + ", signatureDto=" + this.signatureDto + ")";
        int i2 = onExtraCallbackWithResult + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferShareTossMoneyMoveRequest> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            TransferShareTossMoneyMoveRequest$$serializer transferShareTossMoneyMoveRequest$$serializer = TransferShareTossMoneyMoveRequest$$serializer.INSTANCE;
            int i4 = IAuthTabCallback + 123;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 51 / 0;
            }
            return transferShareTossMoneyMoveRequest$$serializer;
        }
    }

    public /* synthetic */ TransferShareTossMoneyMoveRequest(int i, TransferShareTossMoneyMoveAccountModel transferShareTossMoneyMoveAccountModel, TransferShareTossMoneyMoveAccountModel transferShareTossMoneyMoveAccountModel2, long j, TransferSignatureDto transferSignatureDto, okycx okycxVar) {
        if (15 != (i & 15)) {
            int i2 = onExtraCallbackWithResult + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 15, TransferShareTossMoneyMoveRequest$$serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 115;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 3;
            } else {
                int i6 = 2 % 2;
            }
        }
        this.withdrawAccount = transferShareTossMoneyMoveAccountModel;
        this.depositAccount = transferShareTossMoneyMoveAccountModel2;
        this.amount = j;
        this.signatureDto = transferSignatureDto;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(TransferShareTossMoneyMoveRequest transferShareTossMoneyMoveRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TransferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer transferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer = TransferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer.INSTANCE;
        vylVar.onNavigationEvent(serialDescriptor, 0, transferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer, transferShareTossMoneyMoveRequest.withdrawAccount);
        vylVar.onNavigationEvent(serialDescriptor, 1, transferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer, transferShareTossMoneyMoveRequest.depositAccount);
        vylVar.onExtraCallback(serialDescriptor, 2, transferShareTossMoneyMoveRequest.amount);
        vylVar.onNavigationEvent(serialDescriptor, 3, TransferSignatureDto$.serializer.INSTANCE, transferShareTossMoneyMoveRequest.signatureDto);
        int i4 = onExtraCallback + 11;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @liq
    public static final class TransferShareTossMoneyMoveAccountModel {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final String accountNo;
        private final int bankCode;

        static {
            int i = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 59;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (obj instanceof TransferShareTossMoneyMoveAccountModel) {
                TransferShareTossMoneyMoveAccountModel transferShareTossMoneyMoveAccountModel = (TransferShareTossMoneyMoveAccountModel) obj;
                if (this.bankCode != transferShareTossMoneyMoveAccountModel.bankCode || !Intrinsics.areEqual(this.accountNo, transferShareTossMoneyMoveAccountModel.accountNo)) {
                    return false;
                }
                int i5 = IAuthTabCallback + 37;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 86 / 0;
                }
                return true;
            }
            int i7 = i2 + 85;
            int i8 = i7 % 128;
            IAuthTabCallback = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 91;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Integer.hashCode(this.bankCode);
            return i3 != 0 ? (iHashCode << 30) - this.accountNo.hashCode() : (iHashCode * 31) + this.accountNo.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "TransferShareTossMoneyMoveAccountModel(bankCode=" + this.bankCode + ", accountNo=" + this.accountNo + ")";
            int i2 = onNavigationEvent + 81;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 95 / 0;
            }
            return str;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TransferShareTossMoneyMoveAccountModel> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 123;
                onExtraCallbackWithResult = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    TransferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer transferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer = TransferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer.INSTANCE;
                    throw null;
                }
                TransferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer transferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer2 = TransferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer.INSTANCE;
                int i3 = onExtraCallbackWithResult + 5;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    return transferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer2;
                }
                obj.hashCode();
                throw null;
            }
        }

        public /* synthetic */ TransferShareTossMoneyMoveAccountModel(int i, int i2, String str, okycx okycxVar) {
            if (3 != (i & 3)) {
                int i3 = onNavigationEvent + 41;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                htf31.onExtraCallbackWithResult(i, 3, TransferShareTossMoneyMoveRequest$TransferShareTossMoneyMoveAccountModel$$serializer.INSTANCE.getDescriptor());
                int i5 = onNavigationEvent + 45;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 5 / 5;
                } else {
                    int i7 = 2 % 2;
                }
            }
            this.bankCode = i2;
            this.accountNo = str;
        }

        @JvmStatic
        public static final /* synthetic */ void onNavigationEvent(TransferShareTossMoneyMoveAccountModel transferShareTossMoneyMoveAccountModel, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            vylVar.onExtraCallback(serialDescriptor, 0, transferShareTossMoneyMoveAccountModel.bankCode);
            vylVar.onExtraCallback(serialDescriptor, 1, transferShareTossMoneyMoveAccountModel.accountNo);
            int i4 = onNavigationEvent + 43;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
