package viva.republica.toss.network.model.visitor;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.visitor.VisitorTossMoneyBalance$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class VisitorTossMoneyBalance {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final long balance;
    private final String name;
    private final long totalBalanceLimit;

    static {
        int i = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public VisitorTossMoneyBalance() {
        this((String) null, 0L, 0L, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisitorTossMoneyBalance)) {
            return false;
        }
        VisitorTossMoneyBalance visitorTossMoneyBalance = (VisitorTossMoneyBalance) obj;
        if (!Intrinsics.areEqual(this.name, visitorTossMoneyBalance.name)) {
            int i3 = IAuthTabCallback + 87;
            onExtraCallback = i3 % 128;
            return i3 % 2 != 0;
        }
        if (this.balance != visitorTossMoneyBalance.balance) {
            return false;
        }
        if (this.totalBalanceLimit == visitorTossMoneyBalance.totalBalanceLimit) {
            return true;
        }
        int i4 = IAuthTabCallback + 47;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.name.hashCode();
        return i3 != 0 ? (((iHashCode >> 84) >> Long.hashCode(this.balance)) % 106) % Long.hashCode(this.totalBalanceLimit) : (((iHashCode * 31) + Long.hashCode(this.balance)) * 31) + Long.hashCode(this.totalBalanceLimit);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VisitorTossMoneyBalance(name=" + this.name + ", balance=" + this.balance + ", totalBalanceLimit=" + this.totalBalanceLimit + ")";
        int i2 = IAuthTabCallback + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<VisitorTossMoneyBalance> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            VisitorTossMoneyBalance$.serializer serializerVar = VisitorTossMoneyBalance$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 81;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ VisitorTossMoneyBalance(int i, String str, long j, long j2, okycx okycxVar) {
        if ((i & 1) == 0) {
            str = "";
            int i2 = 2 % 2;
        }
        this.name = str;
        if ((i & 2) == 0) {
            this.balance = 0L;
        } else {
            this.balance = j;
            int i3 = 2 % 2;
        }
        if ((i & 4) == 0) {
            int i4 = IAuthTabCallback + 63;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                this.totalBalanceLimit = 1L;
                return;
            } else {
                this.totalBalanceLimit = 0L;
                return;
            }
        }
        this.totalBalanceLimit = j2;
        int i5 = onExtraCallback + 5;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 61 / 0;
        }
    }

    public VisitorTossMoneyBalance(@NotNull String str, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.balance = j;
        this.totalBalanceLimit = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.visitor.VisitorTossMoneyBalance r8, o.vyl r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r9.onWarmupCompleted(r10, r1)
            if (r2 != 0) goto L1d
            int r2 = viva.republica.toss.network.model.visitor.VisitorTossMoneyBalance.IAuthTabCallback
            int r2 = r2 + 7
            int r3 = r2 % 128
            viva.republica.toss.network.model.visitor.VisitorTossMoneyBalance.onExtraCallback = r3
            int r2 = r2 % r0
            java.lang.String r2 = r8.name
            java.lang.String r3 = ""
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L22
        L1d:
            java.lang.String r2 = r8.name
            r9.onExtraCallback(r10, r1, r2)
        L22:
            r2 = 1
            boolean r3 = r9.onWarmupCompleted(r10, r2)
            r4 = 0
            if (r3 != 0) goto L31
            long r6 = r8.balance
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 == 0) goto L36
        L31:
            long r6 = r8.balance
            r9.onExtraCallback(r10, r2, r6)
        L36:
            boolean r2 = r9.onWarmupCompleted(r10, r0)
            if (r2 != 0) goto L42
            long r2 = r8.totalBalanceLimit
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L50
        L42:
            long r2 = r8.totalBalanceLimit
            r9.onExtraCallback(r10, r0, r2)
            int r8 = viva.republica.toss.network.model.visitor.VisitorTossMoneyBalance.onExtraCallback
            int r8 = r8 + 13
            int r9 = r8 % 128
            viva.republica.toss.network.model.visitor.VisitorTossMoneyBalance.IAuthTabCallback = r9
            int r8 = r8 % r0
        L50:
            int r8 = viva.republica.toss.network.model.visitor.VisitorTossMoneyBalance.IAuthTabCallback
            int r8 = r8 + 97
            int r9 = r8 % 128
            viva.republica.toss.network.model.visitor.VisitorTossMoneyBalance.onExtraCallback = r9
            int r8 = r8 % r0
            if (r8 == 0) goto L5e
            r8 = 31
            int r8 = r8 / r1
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.visitor.VisitorTossMoneyBalance.onWarmupCompleted(viva.republica.toss.network.model.visitor.VisitorTossMoneyBalance, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ VisitorTossMoneyBalance(String str, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j3;
        long j4;
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = 2 % 2;
            j3 = 0;
        } else {
            j3 = j;
        }
        if ((i & 4) != 0) {
            int i5 = onExtraCallback + 9;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            j4 = 0;
        } else {
            j4 = j2;
        }
        this(str, j3, j4);
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 101;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.balance;
        int i5 = i2 + 61;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        long j = this.totalBalanceLimit;
        int i4 = i3 + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }
}
