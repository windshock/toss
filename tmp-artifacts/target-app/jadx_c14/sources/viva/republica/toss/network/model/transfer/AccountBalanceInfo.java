package viva.republica.toss.network.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.htf31;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AccountBalanceInfo implements Parcelable {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String accountNo;
    private TransferBalance balanceDto;
    private final int bankCode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AccountBalanceInfo> CREATOR = new onWarmupCompleted();

    public static final class onWarmupCompleted implements Parcelable.Creator<AccountBalanceInfo> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final AccountBalanceInfo IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            AccountBalanceInfo accountBalanceInfo = new AccountBalanceInfo(parcel.readInt(), parcel.readString(), TransferBalance.CREATOR.createFromParcel(parcel));
            int i2 = IAuthTabCallback + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return accountBalanceInfo;
        }

        public final AccountBalanceInfo[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 15;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            AccountBalanceInfo[] accountBalanceInfoArr = new AccountBalanceInfo[i];
            int i6 = i3 + 17;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return accountBalanceInfoArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AccountBalanceInfo createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AccountBalanceInfo accountBalanceInfoIAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = onNavigationEvent + 17;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return accountBalanceInfoIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AccountBalanceInfo[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 65;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            AccountBalanceInfo[] accountBalanceInfoArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onNavigationEvent + 63;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return accountBalanceInfoArrIAuthTabCallback;
        }
    }

    static {
        int i = onWarmupCompleted + 21;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 45;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof AccountBalanceInfo)) {
            return false;
        }
        AccountBalanceInfo accountBalanceInfo = (AccountBalanceInfo) obj;
        if (this.bankCode != accountBalanceInfo.bankCode) {
            return false;
        }
        if (Intrinsics.areEqual(this.accountNo, accountBalanceInfo.accountNo)) {
            return !(Intrinsics.areEqual(this.balanceDto, accountBalanceInfo.balanceDto) ^ true);
        }
        int i4 = IAuthTabCallback + 47;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 15;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Integer.hashCode(this.bankCode) * 31) + this.accountNo.hashCode()) * 31) + this.balanceDto.hashCode();
        int i4 = onNavigationEvent + 71;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountBalanceInfo(bankCode=" + this.bankCode + ", accountNo=" + this.accountNo + ", balanceDto=" + this.balanceDto + ")";
        int i2 = IAuthTabCallback + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 23;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.bankCode);
        parcel.writeString(this.accountNo);
        this.balanceDto.writeToParcel(parcel, i);
        int i5 = IAuthTabCallback + 39;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AccountBalanceInfo> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AccountBalanceInfo$$serializer accountBalanceInfo$$serializer = AccountBalanceInfo$$serializer.INSTANCE;
            int i4 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 0;
            }
            return accountBalanceInfo$$serializer;
        }
    }

    public /* synthetic */ AccountBalanceInfo(int i, int i2, String str, TransferBalance transferBalance, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i3 = onNavigationEvent + 23;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                htf31.onExtraCallbackWithResult(i, 2, AccountBalanceInfo$$serializer.INSTANCE.getDescriptor());
            } else {
                htf31.onExtraCallbackWithResult(i, 3, AccountBalanceInfo$$serializer.INSTANCE.getDescriptor());
            }
        }
        this.bankCode = i2;
        this.accountNo = str;
        if ((i & 4) != 0) {
            this.balanceDto = transferBalance;
            return;
        }
        this.balanceDto = new TransferBalance(0L, 0L, false, (String) null, (TransferBalanceStatus) null, 31, (DefaultConstructorMarker) null);
        int i4 = IAuthTabCallback + 25;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public AccountBalanceInfo(int i, @NotNull String str, @NotNull TransferBalance transferBalance) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transferBalance, "");
        this.bankCode = i;
        this.accountNo = str;
        this.balanceDto = transferBalance;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.transfer.AccountBalanceInfo r13, o.vyl r14, kotlinx.serialization.descriptors.SerialDescriptor r15) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.AccountBalanceInfo.IAuthTabCallback
            int r1 = r1 + 69
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.AccountBalanceInfo.onNavigationEvent = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L22
            int r1 = r13.bankCode
            r14.onExtraCallback(r15, r2, r1)
            java.lang.String r1 = r13.accountNo
            r14.onExtraCallback(r15, r3, r1)
            r1 = 4
            boolean r1 = r14.onWarmupCompleted(r15, r1)
            if (r1 != 0) goto L4a
            goto L32
        L22:
            int r1 = r13.bankCode
            r14.onExtraCallback(r15, r3, r1)
            java.lang.String r1 = r13.accountNo
            r14.onExtraCallback(r15, r2, r1)
            boolean r1 = r14.onWarmupCompleted(r15, r0)
            if (r1 != 0) goto L4a
        L32:
            viva.republica.toss.network.model.transfer.TransferBalance r1 = r13.balanceDto
            viva.republica.toss.network.model.transfer.TransferBalance r12 = new viva.republica.toss.network.model.transfer.TransferBalance
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 31
            r11 = 0
            r2 = r12
            r2.<init>(r3, r5, r7, r8, r9, r10, r11)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r12)
            if (r1 != 0) goto L51
        L4a:
            viva.republica.toss.network.model.transfer.TransferBalance$$serializer r1 = viva.republica.toss.network.model.transfer.TransferBalance$$serializer.INSTANCE
            viva.republica.toss.network.model.transfer.TransferBalance r13 = r13.balanceDto
            r14.onNavigationEvent(r15, r0, r1, r13)
        L51:
            int r13 = viva.republica.toss.network.model.transfer.AccountBalanceInfo.IAuthTabCallback
            int r13 = r13 + 23
            int r14 = r13 % 128
            viva.republica.toss.network.model.transfer.AccountBalanceInfo.onNavigationEvent = r14
            int r13 = r13 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.AccountBalanceInfo.onExtraCallback(viva.republica.toss.network.model.transfer.AccountBalanceInfo, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 51;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.bankCode;
        int i6 = i2 + 83;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 117;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountNo;
        int i5 = i2 + 21;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ AccountBalanceInfo(int i, String str, TransferBalance transferBalance, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            transferBalance = new TransferBalance(0L, 0L, false, (String) null, (TransferBalanceStatus) null, 31, (DefaultConstructorMarker) null);
            int i3 = onNavigationEvent + 121;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        this(i, str, transferBalance);
    }

    public final TransferBalance onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        TransferBalance transferBalance = this.balanceDto;
        int i5 = i3 + 117;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return transferBalance;
    }

    public final void onExtraCallbackWithResult(@NotNull TransferBalance transferBalance) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(transferBalance, "");
            this.balanceDto = transferBalance;
        } else {
            Intrinsics.checkNotNullParameter(transferBalance, "");
            this.balanceDto = transferBalance;
            int i3 = 78 / 0;
        }
    }
}
