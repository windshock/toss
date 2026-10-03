package viva.republica.toss.network.model.transfer.periodic;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferDepositTarget$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PeriodicTransferDepositTarget {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String accountNo;
    private final Integer bankCode;
    private final String phone;

    static {
        int i = onExtraCallbackWithResult + 59;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public PeriodicTransferDepositTarget() {
        this((Integer) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof PeriodicTransferDepositTarget)) {
            int i4 = onNavigationEvent + 119;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        PeriodicTransferDepositTarget periodicTransferDepositTarget = (PeriodicTransferDepositTarget) obj;
        if (!Intrinsics.areEqual(this.bankCode, periodicTransferDepositTarget.bankCode)) {
            int i6 = onNavigationEvent + 119;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.accountNo, periodicTransferDepositTarget.accountNo)) {
            int i8 = onNavigationEvent + 89;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.phone, periodicTransferDepositTarget.phone)) {
            return true;
        }
        int i10 = onNavigationEvent + 111;
        int i11 = i10 % 128;
        IAuthTabCallback = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 33;
        onNavigationEvent = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        Integer num = this.bankCode;
        if (num == null) {
            int i2 = onNavigationEvent + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        String str = this.accountNo;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.phone;
        int iHashCode3 = (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        int i4 = IAuthTabCallback + 7;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PeriodicTransferDepositTarget(bankCode=" + this.bankCode + ", accountNo=" + this.accountNo + ", phone=" + this.phone + ")";
        int i2 = onNavigationEvent + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 69 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PeriodicTransferDepositTarget> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            PeriodicTransferDepositTarget$.serializer serializerVar = PeriodicTransferDepositTarget$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 39;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ PeriodicTransferDepositTarget(int i, Integer num, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.bankCode = null;
        } else {
            this.bankCode = num;
        }
        int i2 = 2 % 2;
        if ((i & 2) == 0) {
            int i3 = IAuthTabCallback + 31;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            this.accountNo = null;
        } else {
            this.accountNo = str;
            int i5 = onNavigationEvent + 3;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
        }
        if ((i & 4) != 0) {
            this.phone = str2;
            return;
        }
        this.phone = null;
        int i7 = IAuthTabCallback + 63;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
    }

    public PeriodicTransferDepositTarget(@Nullable Integer num, @Nullable String str, @Nullable String str2) {
        this.bankCode = num;
        this.accountNo = str;
        this.phone = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.transfer.periodic.PeriodicTransferDepositTarget r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferDepositTarget.onNavigationEvent
            int r1 = r1 + 71
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferDepositTarget.IAuthTabCallback = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L16
            boolean r1 = r6.onWarmupCompleted(r7, r2)
            if (r1 != 0) goto L20
            goto L1c
        L16:
            boolean r1 = r6.onWarmupCompleted(r7, r2)
            if (r1 != 0) goto L20
        L1c:
            java.lang.Integer r1 = r5.bankCode
            if (r1 == 0) goto L27
        L20:
            o.getDynamicHeight r1 = o.getDynamicHeight.onWarmupCompleted
            java.lang.Integer r3 = r5.bankCode
            r6.onExtraCallbackWithResult(r7, r2, r1, r3)
        L27:
            r1 = 1
            boolean r3 = r6.onWarmupCompleted(r7, r1)
            if (r3 == 0) goto L2f
            goto L33
        L2f:
            java.lang.String r3 = r5.accountNo
            if (r3 == 0) goto L3a
        L33:
            o.getWriggleLayout r3 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r4 = r5.accountNo
            r6.onExtraCallbackWithResult(r7, r1, r3, r4)
        L3a:
            boolean r1 = r6.onWarmupCompleted(r7, r0)
            if (r1 != 0) goto L57
            int r1 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferDepositTarget.onNavigationEvent
            int r1 = r1 + 103
            int r3 = r1 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferDepositTarget.IAuthTabCallback = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L53
            java.lang.String r1 = r5.phone
            r3 = 88
            int r3 = r3 / r2
            if (r1 == 0) goto L5e
            goto L57
        L53:
            java.lang.String r1 = r5.phone
            if (r1 == 0) goto L5e
        L57:
            o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r5 = r5.phone
            r6.onExtraCallbackWithResult(r7, r0, r1, r5)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferDepositTarget.onNavigationEvent(viva.republica.toss.network.model.transfer.periodic.PeriodicTransferDepositTarget, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PeriodicTransferDepositTarget(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            num = null;
        }
        if ((i & 2) != 0) {
            int i5 = 2 % 2;
            str = null;
        }
        if ((i & 4) != 0) {
            int i6 = onNavigationEvent + 71;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 37 / 0;
            }
            int i8 = 2 % 2;
            str2 = null;
        }
        this(num, str, str2);
    }
}
