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
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.DepositAccountHolder$;
import viva.republica.toss.network.model.transfer.DepositTarget;
import viva.republica.toss.network.model.transfer.NotifyTransferReadyMeta$;
import viva.republica.toss.network.model.transfer.NotifyTransferReadyRequest$;
import viva.republica.toss.network.model.transfer.TransferAccountDto$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NotifyTransferReadyRequest {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final long amount;
    private final DepositAccountHolder depositAccountHolder;
    private final DepositTarget depositTarget;
    private final NotifyTransferReadyMeta meta;
    private final TransferProvider transferProvider;
    private final TransferAccountDto withdrawAccount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnNavigationEvent = onNavigationEvent();
        int i4 = onExtraCallback + 119;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnNavigationEvent;
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        DepositTarget.Companion companion = DepositTarget.Companion;
        if (i3 != 0) {
            return companion.serializer();
        }
        companion.serializer();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        KSerializer<TransferProvider> kSerializerSerializer;
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerSerializer = TransferProvider.Companion.serializer();
            int i3 = 69 / 0;
        } else {
            kSerializerSerializer = TransferProvider.Companion.serializer();
        }
        int i4 = onExtraCallback + 13;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerSerializer;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult();
            throw null;
        }
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i3 = onExtraCallback + 113;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotifyTransferReadyRequest)) {
            return false;
        }
        NotifyTransferReadyRequest notifyTransferReadyRequest = (NotifyTransferReadyRequest) obj;
        if (this.transferProvider != notifyTransferReadyRequest.transferProvider) {
            return false;
        }
        if (!Intrinsics.areEqual(this.withdrawAccount, notifyTransferReadyRequest.withdrawAccount)) {
            int i2 = onExtraCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.depositTarget, notifyTransferReadyRequest.depositTarget)) {
            int i3 = onExtraCallbackWithResult + 5;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.amount != notifyTransferReadyRequest.amount || !Intrinsics.areEqual(this.depositAccountHolder, notifyTransferReadyRequest.depositAccountHolder)) {
            return false;
        }
        if (Intrinsics.areEqual(this.meta, notifyTransferReadyRequest.meta)) {
            return true;
        }
        int i5 = onExtraCallback + 95;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int iHashCode = this.transferProvider.hashCode();
        int iHashCode2 = this.withdrawAccount.hashCode();
        int iHashCode3 = this.depositTarget.hashCode();
        int iHashCode4 = Long.hashCode(this.amount);
        DepositAccountHolder depositAccountHolder = this.depositAccountHolder;
        int iHashCode5 = 0;
        int iHashCode6 = depositAccountHolder == null ? 0 : depositAccountHolder.hashCode();
        NotifyTransferReadyMeta notifyTransferReadyMeta = this.meta;
        if (notifyTransferReadyMeta != null) {
            int i2 = onExtraCallbackWithResult + 45;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                notifyTransferReadyMeta.hashCode();
                throw null;
            }
            iHashCode5 = notifyTransferReadyMeta.hashCode();
        }
        int i3 = (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode6) * 31) + iHashCode5;
        int i4 = onExtraCallbackWithResult + 5;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NotifyTransferReadyRequest(transferProvider=" + this.transferProvider + ", withdrawAccount=" + this.withdrawAccount + ", depositTarget=" + this.depositTarget + ", amount=" + this.amount + ", depositAccountHolder=" + this.depositAccountHolder + ", meta=" + this.meta + ")";
        int i2 = onExtraCallbackWithResult + 91;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 6 / 0;
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

        public final KSerializer<NotifyTransferReadyRequest> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                NotifyTransferReadyRequest$.serializer serializerVar = NotifyTransferReadyRequest$.serializer.INSTANCE;
                obj.hashCode();
                throw null;
            }
            NotifyTransferReadyRequest$.serializer serializerVar2 = NotifyTransferReadyRequest$.serializer.INSTANCE;
            int i3 = onNavigationEvent + 85;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return serializerVar2;
            }
            throw null;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.NotifyTransferReadyRequest$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 3;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = NotifyTransferReadyRequest.IAuthTabCallback();
                int i4 = onWarmupCompleted + 15;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 91 / 0;
                }
                return kSerializerIAuthTabCallback;
            }
        }), null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.NotifyTransferReadyRequest$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 47;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return NotifyTransferReadyRequest.onWarmupCompleted();
                }
                NotifyTransferReadyRequest.onWarmupCompleted();
                throw null;
            }
        }), null, null, null};
        int i = onWarmupCompleted + 99;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ NotifyTransferReadyRequest(int i, TransferProvider transferProvider, TransferAccountDto transferAccountDto, DepositTarget depositTarget, long j, DepositAccountHolder depositAccountHolder, NotifyTransferReadyMeta notifyTransferReadyMeta, okycx okycxVar) {
        if (63 != (i & 63)) {
            int i2 = onExtraCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 63, NotifyTransferReadyRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 113;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.transferProvider = transferProvider;
        this.withdrawAccount = transferAccountDto;
        this.depositTarget = depositTarget;
        this.amount = j;
        this.depositAccountHolder = depositAccountHolder;
        this.meta = notifyTransferReadyMeta;
    }

    public NotifyTransferReadyRequest(@NotNull TransferProvider transferProvider, @NotNull TransferAccountDto transferAccountDto, @NotNull DepositTarget depositTarget, long j, @Nullable DepositAccountHolder depositAccountHolder, @Nullable NotifyTransferReadyMeta notifyTransferReadyMeta) {
        Intrinsics.checkNotNullParameter(transferProvider, "");
        Intrinsics.checkNotNullParameter(transferAccountDto, "");
        Intrinsics.checkNotNullParameter(depositTarget, "");
        this.transferProvider = transferProvider;
        this.withdrawAccount = transferAccountDto;
        this.depositTarget = depositTarget;
        this.amount = j;
        this.depositAccountHolder = depositAccountHolder;
        this.meta = notifyTransferReadyMeta;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return $childSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(NotifyTransferReadyRequest notifyTransferReadyRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), notifyTransferReadyRequest.transferProvider);
        vylVar.onNavigationEvent(serialDescriptor, 1, TransferAccountDto$.serializer.INSTANCE, notifyTransferReadyRequest.withdrawAccount);
        vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), notifyTransferReadyRequest.depositTarget);
        vylVar.onExtraCallback(serialDescriptor, 3, notifyTransferReadyRequest.amount);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, DepositAccountHolder$.serializer.INSTANCE, notifyTransferReadyRequest.depositAccountHolder);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 5, NotifyTransferReadyMeta$.serializer.INSTANCE, notifyTransferReadyRequest.meta);
        int i4 = onExtraCallback + 105;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
