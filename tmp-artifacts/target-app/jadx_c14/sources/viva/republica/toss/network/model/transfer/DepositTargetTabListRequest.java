package viva.republica.toss.network.model.transfer;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf31;
import o.liq;
import o.okycx;
import o.r8lambdahyx9jcINTsok0QhKqPwRDX7N9k;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.DepositTargetTabListRequest$;
import viva.republica.toss.network.model.transfer.DepositTargetTabListRequest$OverseasTransferWithdrawalAccount$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DepositTargetTabListRequest {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final r8lambdahyx9jcINTsok0QhKqPwRDX7N9k context;
    private final String reserveKey;
    private final OverseasTransferWithdrawalAccount withdrawalAccount;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.DepositTargetTabListRequest$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallback = DepositTargetTabListRequest.IAuthTabCallback();
            int i4 = onExtraCallbackWithResult + 49;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerIAuthTabCallback;
        }
    }), null, null};

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnNavigationEvent = onNavigationEvent();
        int i4 = onWarmupCompleted + 35;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return kSerializerOnNavigationEvent;
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        KSerializer kSerializerOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.DepositTargetTabListType", r8lambdahyx9jcINTsok0QhKqPwRDX7N9k.values());
            int i3 = 53 / 0;
        } else {
            kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.DepositTargetTabListType", r8lambdahyx9jcINTsok0QhKqPwRDX7N9k.values());
        }
        int i4 = onNavigationEvent + 73;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return kSerializerOnExtraCallbackWithResult;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof DepositTargetTabListRequest)) {
            int i4 = onWarmupCompleted + 103;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        DepositTargetTabListRequest depositTargetTabListRequest = (DepositTargetTabListRequest) obj;
        if (this.context != depositTargetTabListRequest.context) {
            return false;
        }
        if (Intrinsics.areEqual(this.withdrawalAccount, depositTargetTabListRequest.withdrawalAccount)) {
            return Intrinsics.areEqual(this.reserveKey, depositTargetTabListRequest.reserveKey);
        }
        int i6 = onWarmupCompleted + 111;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.context.hashCode();
        OverseasTransferWithdrawalAccount overseasTransferWithdrawalAccount = this.withdrawalAccount;
        int iHashCode3 = 0;
        if (overseasTransferWithdrawalAccount == null) {
            int i2 = onWarmupCompleted + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = overseasTransferWithdrawalAccount.hashCode();
        }
        String str = this.reserveKey;
        if (str != null) {
            int i4 = onWarmupCompleted + 13;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode3 = str.hashCode();
        }
        int i6 = (((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3;
        int i7 = onWarmupCompleted + 17;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DepositTargetTabListRequest(context=" + this.context + ", withdrawalAccount=" + this.withdrawalAccount + ", reserveKey=" + this.reserveKey + ")";
        int i2 = onWarmupCompleted + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DepositTargetTabListRequest> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            DepositTargetTabListRequest$.serializer serializerVar = DepositTargetTabListRequest$.serializer.INSTANCE;
            if (i3 == 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ DepositTargetTabListRequest(int i, r8lambdahyx9jcINTsok0QhKqPwRDX7N9k r8lambdahyx9jcintsok0qhkqpwrdx7n9k, OverseasTransferWithdrawalAccount overseasTransferWithdrawalAccount, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            htf31.onExtraCallbackWithResult(i, 1, DepositTargetTabListRequest$.serializer.INSTANCE.getDescriptor());
            int i2 = onWarmupCompleted + 71;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        this.context = r8lambdahyx9jcintsok0qhkqpwrdx7n9k;
        if ((i & 2) == 0) {
            this.withdrawalAccount = null;
            int i4 = onNavigationEvent + 21;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } else {
            this.withdrawalAccount = overseasTransferWithdrawalAccount;
        }
        if ((i & 4) != 0) {
            this.reserveKey = str;
            return;
        }
        int i6 = onWarmupCompleted + 41;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        this.reserveKey = null;
    }

    public DepositTargetTabListRequest(@NotNull r8lambdahyx9jcINTsok0QhKqPwRDX7N9k r8lambdahyx9jcintsok0qhkqpwrdx7n9k, @Nullable OverseasTransferWithdrawalAccount overseasTransferWithdrawalAccount, @Nullable String str) {
        Intrinsics.checkNotNullParameter(r8lambdahyx9jcintsok0qhkqpwrdx7n9k, "");
        this.context = r8lambdahyx9jcintsok0qhkqpwrdx7n9k;
        this.withdrawalAccount = overseasTransferWithdrawalAccount;
        this.reserveKey = str;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return $childSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.DepositTargetTabListRequest r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.DepositTargetTabListRequest.onWarmupCompleted
            int r1 = r1 + 117
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.DepositTargetTabListRequest.onNavigationEvent = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L26
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.DepositTargetTabListRequest.$childSerializers
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            o.r8lambdahyx9jcINTsok0QhKqPwRDX7N9k r2 = r5.context
            r6.onNavigationEvent(r7, r3, r1, r2)
            boolean r1 = r6.onWarmupCompleted(r7, r3)
            if (r1 != 0) goto L47
            goto L3b
        L26:
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.DepositTargetTabListRequest.$childSerializers
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            o.r8lambdahyx9jcINTsok0QhKqPwRDX7N9k r4 = r5.context
            r6.onNavigationEvent(r7, r2, r1, r4)
            boolean r1 = r6.onWarmupCompleted(r7, r3)
            if (r1 != 0) goto L47
        L3b:
            int r1 = viva.republica.toss.network.model.transfer.DepositTargetTabListRequest.onWarmupCompleted
            int r1 = r1 + r3
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.DepositTargetTabListRequest.onNavigationEvent = r2
            int r1 = r1 % r0
            viva.republica.toss.network.model.transfer.DepositTargetTabListRequest$OverseasTransferWithdrawalAccount r1 = r5.withdrawalAccount
            if (r1 == 0) goto L4e
        L47:
            viva.republica.toss.network.model.transfer.DepositTargetTabListRequest$OverseasTransferWithdrawalAccount$$serializer r1 = viva.republica.toss.network.model.transfer.DepositTargetTabListRequest$OverseasTransferWithdrawalAccount$.serializer.INSTANCE
            viva.republica.toss.network.model.transfer.DepositTargetTabListRequest$OverseasTransferWithdrawalAccount r2 = r5.withdrawalAccount
            r6.onExtraCallbackWithResult(r7, r3, r1, r2)
        L4e:
            boolean r1 = r6.onWarmupCompleted(r7, r0)
            if (r1 == 0) goto L55
            goto L62
        L55:
            int r1 = viva.republica.toss.network.model.transfer.DepositTargetTabListRequest.onWarmupCompleted
            int r1 = r1 + 99
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.DepositTargetTabListRequest.onNavigationEvent = r2
            int r1 = r1 % r0
            java.lang.String r1 = r5.reserveKey
            if (r1 == 0) goto L69
        L62:
            o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r5 = r5.reserveKey
            r6.onExtraCallbackWithResult(r7, r0, r1, r5)
        L69:
            int r5 = viva.republica.toss.network.model.transfer.DepositTargetTabListRequest.onNavigationEvent
            int r5 = r5 + 21
            int r6 = r5 % 128
            viva.republica.toss.network.model.transfer.DepositTargetTabListRequest.onWarmupCompleted = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L75
            return
        L75:
            r5 = 0
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.DepositTargetTabListRequest.onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.DepositTargetTabListRequest, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DepositTargetTabListRequest(r8lambdahyx9jcINTsok0QhKqPwRDX7N9k r8lambdahyx9jcintsok0qhkqpwrdx7n9k, OverseasTransferWithdrawalAccount overseasTransferWithdrawalAccount, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 2) != 0) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 15;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 109;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            overseasTransferWithdrawalAccount = null;
        }
        if ((i & 4) != 0) {
            int i7 = onNavigationEvent;
            int i8 = i7 + 63;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i9 = i7 + 19;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            str = null;
        }
        this(r8lambdahyx9jcintsok0qhkqpwrdx7n9k, overseasTransferWithdrawalAccount, str);
    }

    @liq
    public static final class OverseasTransferWithdrawalAccount {
        public static final int $stable = 0;
        public static final Companion Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final String accountNo;
        private final int bankCode;

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = IAuthTabCallback + 121;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OverseasTransferWithdrawalAccount)) {
                return false;
            }
            if (this.bankCode != ((OverseasTransferWithdrawalAccount) obj).bankCode) {
                int i5 = i3 + 51;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.accountNo, r7.accountNo))) {
                return true;
            }
            int i7 = onExtraCallback + 67;
            onExtraCallbackWithResult = i7 % 128;
            return i7 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Integer.hashCode(this.bankCode);
            return i3 != 0 ? (iHashCode + 107) >> this.accountNo.hashCode() : (iHashCode * 31) + this.accountNo.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OverseasTransferWithdrawalAccount(bankCode=" + this.bankCode + ", accountNo=" + this.accountNo + ")";
            int i2 = onExtraCallbackWithResult + 1;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
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

            public final KSerializer<OverseasTransferWithdrawalAccount> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 83;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    DepositTargetTabListRequest$OverseasTransferWithdrawalAccount$.serializer serializerVar = DepositTargetTabListRequest$OverseasTransferWithdrawalAccount$.serializer.INSTANCE;
                    throw null;
                }
                DepositTargetTabListRequest$OverseasTransferWithdrawalAccount$.serializer serializerVar2 = DepositTargetTabListRequest$OverseasTransferWithdrawalAccount$.serializer.INSTANCE;
                int i3 = onWarmupCompleted + 81;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return serializerVar2;
            }
        }

        public /* synthetic */ OverseasTransferWithdrawalAccount(int i, int i2, String str, okycx okycxVar) {
            if (3 != (i & 3)) {
                int i3 = onExtraCallback + 63;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                htf31.onExtraCallbackWithResult(i, 3, DepositTargetTabListRequest$OverseasTransferWithdrawalAccount$.serializer.INSTANCE.getDescriptor());
                int i5 = onExtraCallbackWithResult + 71;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
            }
            this.bankCode = i2;
            this.accountNo = str;
        }

        public OverseasTransferWithdrawalAccount(int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.bankCode = i;
            this.accountNo = str;
        }

        @JvmStatic
        public static final /* synthetic */ void IAuthTabCallback(OverseasTransferWithdrawalAccount overseasTransferWithdrawalAccount, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            vylVar.onExtraCallback(serialDescriptor, 0, overseasTransferWithdrawalAccount.bankCode);
            vylVar.onExtraCallback(serialDescriptor, 1, overseasTransferWithdrawalAccount.accountNo);
            int i4 = onExtraCallbackWithResult + 9;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
