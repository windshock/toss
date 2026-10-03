package viva.republica.toss.network.model.transfer.periodic;

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
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferWithdrawAccount$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PeriodicTransferWithdrawAccount {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String accountNo;
    private final int bankCode;

    static {
        int i = IAuthTabCallback + 31;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PeriodicTransferWithdrawAccount)) {
            int i2 = onWarmupCompleted + 79;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 51 / 0;
            }
            return false;
        }
        PeriodicTransferWithdrawAccount periodicTransferWithdrawAccount = (PeriodicTransferWithdrawAccount) obj;
        if (this.bankCode != periodicTransferWithdrawAccount.bankCode || !Intrinsics.areEqual(this.accountNo, periodicTransferWithdrawAccount.accountNo)) {
            return false;
        }
        int i4 = onNavigationEvent + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.bankCode);
        return i3 == 0 ? (iHashCode - 104) % this.accountNo.hashCode() : (iHashCode * 31) + this.accountNo.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PeriodicTransferWithdrawAccount(bankCode=" + this.bankCode + ", accountNo=" + this.accountNo + ")";
        int i2 = onNavigationEvent + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PeriodicTransferWithdrawAccount> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            PeriodicTransferWithdrawAccount$.serializer serializerVar = PeriodicTransferWithdrawAccount$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ PeriodicTransferWithdrawAccount(int i, int i2, String str, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i3 = onNavigationEvent + 81;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                htf31.onExtraCallbackWithResult(i, 2, PeriodicTransferWithdrawAccount$.serializer.INSTANCE.getDescriptor());
            } else {
                htf31.onExtraCallbackWithResult(i, 3, PeriodicTransferWithdrawAccount$.serializer.INSTANCE.getDescriptor());
            }
            int i4 = 2 % 2;
        }
        this.bankCode = i2;
        this.accountNo = str;
    }

    public PeriodicTransferWithdrawAccount(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bankCode = i;
        this.accountNo = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(PeriodicTransferWithdrawAccount periodicTransferWithdrawAccount, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, periodicTransferWithdrawAccount.bankCode);
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, periodicTransferWithdrawAccount.bankCode);
        }
        vylVar.onExtraCallback(serialDescriptor, 1, periodicTransferWithdrawAccount.accountNo);
        int i3 = onNavigationEvent + 33;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
