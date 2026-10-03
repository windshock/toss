package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.TransferAccountDto;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class willDispatchViewUpdateslambda4 {
    public static final int $stable = 0;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("amount")
    private final long amount;

    @SerializedName("depositAccount")
    private final TransferAccountDto depositAccount;

    @SerializedName("periodicTransferType")
    private final makeNativeObject periodicTransferType;

    @SerializedName("withdrawAccount")
    private final TransferAccountDto withdrawAccount;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof willDispatchViewUpdateslambda4)) {
            int i2 = onWarmupCompleted + 77;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 96 / 0;
            }
            return false;
        }
        willDispatchViewUpdateslambda4 willdispatchviewupdateslambda4 = (willDispatchViewUpdateslambda4) obj;
        if (this.periodicTransferType != willdispatchviewupdateslambda4.periodicTransferType) {
            int i4 = onWarmupCompleted + 17;
            onExtraCallback = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.depositAccount, willdispatchviewupdateslambda4.depositAccount)) {
            return false;
        }
        if (Intrinsics.areEqual(this.withdrawAccount, willdispatchviewupdateslambda4.withdrawAccount)) {
            return this.amount == willdispatchviewupdateslambda4.amount;
        }
        int i5 = onWarmupCompleted + 17;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.periodicTransferType.hashCode();
        int iHashCode3 = this.depositAccount.hashCode();
        TransferAccountDto transferAccountDto = this.withdrawAccount;
        if (transferAccountDto == null) {
            int i4 = onWarmupCompleted + 65;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = transferAccountDto.hashCode();
        }
        int iHashCode4 = (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + Long.hashCode(this.amount);
        int i6 = onWarmupCompleted + 1;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetPeriodicTransferAccountHolderReq(periodicTransferType=" + this.periodicTransferType + ", depositAccount=" + this.depositAccount + ", withdrawAccount=" + this.withdrawAccount + ", amount=" + this.amount + ")";
        int i2 = onExtraCallback + 57;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public willDispatchViewUpdateslambda4(@NotNull makeNativeObject makenativeobject, @NotNull TransferAccountDto transferAccountDto, @Nullable TransferAccountDto transferAccountDto2, long j) {
        Intrinsics.checkNotNullParameter(makenativeobject, "");
        Intrinsics.checkNotNullParameter(transferAccountDto, "");
        this.periodicTransferType = makenativeobject;
        this.depositAccount = transferAccountDto;
        this.withdrawAccount = transferAccountDto2;
        this.amount = j;
    }
}
