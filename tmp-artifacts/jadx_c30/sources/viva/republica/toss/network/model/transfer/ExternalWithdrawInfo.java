package viva.republica.toss.network.model.transfer;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.oty1;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ExternalWithdrawInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final BalanceInfo balance;

    static {
        int i = IAuthTabCallback + 125;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExternalWithdrawInfo() {
        BalanceInfo balanceInfo = null;
        this(balanceInfo, 1, (DefaultConstructorMarker) balanceInfo);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof ExternalWithdrawInfo) {
            return Intrinsics.areEqual(this.balance, ((ExternalWithdrawInfo) obj).balance);
        }
        int i4 = onNavigationEvent + 77;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        BalanceInfo balanceInfo = this.balance;
        if (balanceInfo == null) {
            int i5 = i3 + 29;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }
        int iHashCode = balanceInfo.hashCode();
        int i7 = onWarmupCompleted + 21;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ExternalWithdrawInfo(balance=" + this.balance + ")";
        int i2 = onNavigationEvent + 71;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
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

        public final KSerializer<ExternalWithdrawInfo> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ExternalWithdrawInfo$$serializer externalWithdrawInfo$$serializer = ExternalWithdrawInfo$$serializer.INSTANCE;
            int i4 = onWarmupCompleted + 91;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return externalWithdrawInfo$$serializer;
        }
    }

    @liq
    public static final class BalanceInfo {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final Long totalBalance;
        private final Long withdrawableBalance;

        static {
            int i = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public BalanceInfo() {
            Long l = null;
            this(l, l, 3, (DefaultConstructorMarker) l);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BalanceInfo)) {
                int i4 = i3 + 117;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return false;
                }
                obj2.hashCode();
                throw null;
            }
            BalanceInfo balanceInfo = (BalanceInfo) obj;
            if (!Intrinsics.areEqual(this.totalBalance, balanceInfo.totalBalance)) {
                int i5 = onNavigationEvent + 95;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.withdrawableBalance, balanceInfo.withdrawableBalance)) {
                return true;
            }
            int i7 = onExtraCallback + 35;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            Long l = this.totalBalance;
            int iHashCode2 = 0;
            if (l == null) {
                int i2 = onExtraCallback + 49;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = l.hashCode();
            }
            Long l2 = this.withdrawableBalance;
            if (l2 != null) {
                int i4 = onNavigationEvent + 113;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                iHashCode2 = l2.hashCode();
                int i6 = onNavigationEvent + 47;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            return (iHashCode * 31) + iHashCode2;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "BalanceInfo(totalBalance=" + this.totalBalance + ", withdrawableBalance=" + this.withdrawableBalance + ")";
            int i2 = onNavigationEvent + 35;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 7 / 0;
            }
            return str;
        }

        public static final class Companion {
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<BalanceInfo> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 5;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    ExternalWithdrawInfo$BalanceInfo$$serializer externalWithdrawInfo$BalanceInfo$$serializer = ExternalWithdrawInfo$BalanceInfo$$serializer.INSTANCE;
                    throw null;
                }
                ExternalWithdrawInfo$BalanceInfo$$serializer externalWithdrawInfo$BalanceInfo$$serializer2 = ExternalWithdrawInfo$BalanceInfo$$serializer.INSTANCE;
                int i3 = onWarmupCompleted + 5;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return externalWithdrawInfo$BalanceInfo$$serializer2;
            }
        }

        public /* synthetic */ BalanceInfo(int i, Long l, Long l2, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.totalBalance = null;
            } else {
                this.totalBalance = l;
                int i2 = onNavigationEvent + 71;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            }
            if ((i & 2) != 0) {
                this.withdrawableBalance = l2;
                return;
            }
            int i4 = onNavigationEvent + 77;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            this.withdrawableBalance = null;
        }

        public BalanceInfo(@Nullable Long l, @Nullable Long l2) {
            this.totalBalance = l;
            this.withdrawableBalance = l2;
        }

        @JvmStatic
        public static final /* synthetic */ void IAuthTabCallback(BalanceInfo balanceInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || balanceInfo.totalBalance != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, balanceInfo.totalBalance);
                int i4 = onExtraCallback + 83;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 % 5;
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i6 = onExtraCallback + 55;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                if (balanceInfo.withdrawableBalance == null) {
                    return;
                }
            }
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, balanceInfo.withdrawableBalance);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ BalanceInfo(Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            Object obj = null;
            if ((i & 1) != 0) {
                int i2 = onNavigationEvent;
                int i3 = i2 + 1;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i4 = i2 + 37;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
                l = null;
            }
            if ((i & 2) != 0) {
                int i6 = 2 % 2;
                l2 = null;
            }
            this(l, l2);
        }
    }

    public /* synthetic */ ExternalWithdrawInfo(int i, BalanceInfo balanceInfo, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.balance = null;
            int i2 = onWarmupCompleted + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.balance = balanceInfo;
        int i4 = onWarmupCompleted + 73;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public ExternalWithdrawInfo(@Nullable BalanceInfo balanceInfo) {
        this.balance = balanceInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(ExternalWithdrawInfo externalWithdrawInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, ExternalWithdrawInfo$BalanceInfo$$serializer.INSTANCE, externalWithdrawInfo.balance);
        } else {
            int i3 = onWarmupCompleted + 119;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (externalWithdrawInfo.balance != null) {
            }
        }
        int i5 = onWarmupCompleted + 65;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ExternalWithdrawInfo(BalanceInfo balanceInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 5;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 75;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            balanceInfo = null;
        }
        this(balanceInfo);
    }
}
