package viva.republica.toss.network.model.visitor;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.visitor.VisitorTossMoneyVirtualAccountResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class VisitorTossMoneyVirtualAccountResponse {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final VisitorTossMoneyBalance tossMoney;
    private final VisitorTossMoneyAccount virtualAccount;
    private final String wlfStatus;

    static {
        int i = onNavigationEvent + 9;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 52 / 0;
        }
    }

    public VisitorTossMoneyVirtualAccountResponse() {
        this((VisitorTossMoneyAccount) null, (VisitorTossMoneyBalance) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 109;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 73;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 47 / 0;
            }
            return true;
        }
        if (!(obj instanceof VisitorTossMoneyVirtualAccountResponse)) {
            return false;
        }
        VisitorTossMoneyVirtualAccountResponse visitorTossMoneyVirtualAccountResponse = (VisitorTossMoneyVirtualAccountResponse) obj;
        if (!Intrinsics.areEqual(this.virtualAccount, visitorTossMoneyVirtualAccountResponse.virtualAccount) || !Intrinsics.areEqual(this.tossMoney, visitorTossMoneyVirtualAccountResponse.tossMoney)) {
            return false;
        }
        if (Intrinsics.areEqual(this.wlfStatus, visitorTossMoneyVirtualAccountResponse.wlfStatus)) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        VisitorTossMoneyAccount visitorTossMoneyAccount = this.virtualAccount;
        int iHashCode2 = 0;
        if (visitorTossMoneyAccount == null) {
            int i2 = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = visitorTossMoneyAccount.hashCode();
        }
        VisitorTossMoneyBalance visitorTossMoneyBalance = this.tossMoney;
        if (visitorTossMoneyBalance != null) {
            int i3 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = visitorTossMoneyBalance.hashCode();
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + this.wlfStatus.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VisitorTossMoneyVirtualAccountResponse(virtualAccount=" + this.virtualAccount + ", tossMoney=" + this.tossMoney + ", wlfStatus=" + this.wlfStatus + ")";
        int i2 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 63 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<VisitorTossMoneyVirtualAccountResponse> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                VisitorTossMoneyVirtualAccountResponse$.serializer serializerVar = VisitorTossMoneyVirtualAccountResponse$.serializer.INSTANCE;
                throw null;
            }
            VisitorTossMoneyVirtualAccountResponse$.serializer serializerVar2 = VisitorTossMoneyVirtualAccountResponse$.serializer.INSTANCE;
            int i3 = onWarmupCompleted + 53;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return serializerVar2;
            }
            throw null;
        }
    }

    public /* synthetic */ VisitorTossMoneyVirtualAccountResponse(int i, VisitorTossMoneyAccount visitorTossMoneyAccount, VisitorTossMoneyBalance visitorTossMoneyBalance, String str, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.virtualAccount = null;
            int i2 = 2 % 2;
        } else {
            this.virtualAccount = visitorTossMoneyAccount;
        }
        if ((i & 2) == 0) {
            this.tossMoney = null;
            int i3 = IAuthTabCallback + 5;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
        } else {
            this.tossMoney = visitorTossMoneyBalance;
        }
        if ((i & 4) != 0) {
            this.wlfStatus = str;
            return;
        }
        int i5 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        this.wlfStatus = "";
    }

    public VisitorTossMoneyVirtualAccountResponse(@Nullable VisitorTossMoneyAccount visitorTossMoneyAccount, @Nullable VisitorTossMoneyBalance visitorTossMoneyBalance, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.virtualAccount = visitorTossMoneyAccount;
        this.tossMoney = visitorTossMoneyBalance;
        this.wlfStatus = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.visitor.VisitorTossMoneyVirtualAccountResponse r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.visitor.VisitorTossMoneyVirtualAccountResponse.IAuthTabCallback
            int r1 = r1 + 31
            int r2 = r1 % 128
            viva.republica.toss.network.model.visitor.VisitorTossMoneyVirtualAccountResponse.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L17
            boolean r1 = r6.onWarmupCompleted(r7, r3)
            if (r1 != 0) goto L21
            goto L1d
        L17:
            boolean r1 = r6.onWarmupCompleted(r7, r2)
            if (r1 != 0) goto L21
        L1d:
            viva.republica.toss.network.model.visitor.VisitorTossMoneyAccount r1 = r5.virtualAccount
            if (r1 == 0) goto L35
        L21:
            viva.republica.toss.network.model.visitor.VisitorTossMoneyAccount$$serializer r1 = viva.republica.toss.network.model.visitor.VisitorTossMoneyAccount$.serializer.INSTANCE
            viva.republica.toss.network.model.visitor.VisitorTossMoneyAccount r4 = r5.virtualAccount
            r6.onExtraCallbackWithResult(r7, r2, r1, r4)
            int r1 = viva.republica.toss.network.model.visitor.VisitorTossMoneyVirtualAccountResponse.IAuthTabCallback
            int r1 = r1 + 119
            int r2 = r1 % 128
            viva.republica.toss.network.model.visitor.VisitorTossMoneyVirtualAccountResponse.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L35
            r1 = 3
            int r1 = r1 % r0
        L35:
            boolean r1 = r6.onWarmupCompleted(r7, r3)
            if (r1 != 0) goto L48
            int r1 = viva.republica.toss.network.model.visitor.VisitorTossMoneyVirtualAccountResponse.IAuthTabCallback
            int r1 = r1 + 43
            int r2 = r1 % 128
            viva.republica.toss.network.model.visitor.VisitorTossMoneyVirtualAccountResponse.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            viva.republica.toss.network.model.visitor.VisitorTossMoneyBalance r1 = r5.tossMoney
            if (r1 == 0) goto L4f
        L48:
            viva.republica.toss.network.model.visitor.VisitorTossMoneyBalance$$serializer r1 = viva.republica.toss.network.model.visitor.VisitorTossMoneyBalance$.serializer.INSTANCE
            viva.republica.toss.network.model.visitor.VisitorTossMoneyBalance r2 = r5.tossMoney
            r6.onExtraCallbackWithResult(r7, r3, r1, r2)
        L4f:
            boolean r1 = r6.onWarmupCompleted(r7, r0)
            if (r1 != 0) goto L5f
            java.lang.String r1 = r5.wlfStatus
            java.lang.String r2 = ""
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L64
        L5f:
            java.lang.String r5 = r5.wlfStatus
            r6.onExtraCallback(r7, r0, r5)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.visitor.VisitorTossMoneyVirtualAccountResponse.onExtraCallbackWithResult(viva.republica.toss.network.model.visitor.VisitorTossMoneyVirtualAccountResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ VisitorTossMoneyVirtualAccountResponse(VisitorTossMoneyAccount visitorTossMoneyAccount, VisitorTossMoneyBalance visitorTossMoneyBalance, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            visitorTossMoneyAccount = null;
        }
        if ((i & 2) != 0) {
            int i3 = IAuthTabCallback;
            int i4 = i3 + 25;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 93;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            visitorTossMoneyBalance = null;
        }
        this(visitorTossMoneyAccount, visitorTossMoneyBalance, (i & 4) != 0 ? "" : str);
    }

    public final VisitorTossMoneyAccount IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.virtualAccount;
        }
        throw null;
    }

    public final VisitorTossMoneyBalance onExtraCallback() {
        VisitorTossMoneyBalance visitorTossMoneyBalance;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            visitorTossMoneyBalance = this.tossMoney;
            int i4 = 73 / 0;
        } else {
            visitorTossMoneyBalance = this.tossMoney;
        }
        int i5 = i3 + 63;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return visitorTossMoneyBalance;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.wlfStatus;
        int i5 = i3 + 9;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
