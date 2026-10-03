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
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.oty1;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.DepositTarget;
import viva.republica.toss.network.model.transfer.TransferAccountDto$;
import viva.republica.toss.network.model.transfer.TransferInputLimitRequest$;
import viva.republica.toss.send.v4.entity.TransferTextType;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferInputLimitRequest {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final Long customTransferLimit;
    private final DepositTarget depositTarget;
    private final TransferTextType overLimitMessageType;
    private final String sessionKey;
    private final TransferAccountDto withdrawAccount;

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallback = onExtraCallback();
        int i4 = onNavigationEvent + 77;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallback;
    }

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        DepositTarget.Companion companion = DepositTarget.Companion;
        if (i3 == 0) {
            return companion.serializer();
        }
        companion.serializer();
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        KSerializer kSerializerOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerOnNavigationEvent = onNavigationEvent();
            int i3 = 95 / 0;
        } else {
            kSerializerOnNavigationEvent = onNavigationEvent();
        }
        int i4 = onNavigationEvent + 59;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnNavigationEvent;
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerSerializer = TransferTextType.Companion.serializer();
        int i4 = onWarmupCompleted + 31;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerSerializer;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferInputLimitRequest)) {
            return false;
        }
        TransferInputLimitRequest transferInputLimitRequest = (TransferInputLimitRequest) obj;
        if (!Intrinsics.areEqual(this.withdrawAccount, transferInputLimitRequest.withdrawAccount) || !Intrinsics.areEqual(this.depositTarget, transferInputLimitRequest.depositTarget) || !Intrinsics.areEqual(this.customTransferLimit, transferInputLimitRequest.customTransferLimit) || this.overLimitMessageType != transferInputLimitRequest.overLimitMessageType) {
            return false;
        }
        if (Intrinsics.areEqual(this.sessionKey, transferInputLimitRequest.sessionKey)) {
            return true;
        }
        int i3 = onWarmupCompleted + 91;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        TransferAccountDto transferAccountDto = this.withdrawAccount;
        int iHashCode3 = 0;
        if (transferAccountDto == null) {
            int i2 = onWarmupCompleted + 5;
            onNavigationEvent = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = transferAccountDto.hashCode();
        }
        int iHashCode4 = this.depositTarget.hashCode();
        Long l = this.customTransferLimit;
        if (l == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = l.hashCode();
            int i3 = onWarmupCompleted + 117;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
        int iHashCode5 = this.overLimitMessageType.hashCode();
        String str = this.sessionKey;
        if (str != null) {
            int i5 = onWarmupCompleted + 79;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                str.hashCode();
                throw null;
            }
            iHashCode3 = str.hashCode();
        }
        int i6 = (((((((iHashCode * 31) + iHashCode4) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode3;
        int i7 = onNavigationEvent + 63;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferInputLimitRequest(withdrawAccount=" + this.withdrawAccount + ", depositTarget=" + this.depositTarget + ", customTransferLimit=" + this.customTransferLimit + ", overLimitMessageType=" + this.overLimitMessageType + ", sessionKey=" + this.sessionKey + ")";
        int i2 = onWarmupCompleted + 33;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferInputLimitRequest> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            TransferInputLimitRequest$.serializer serializerVar = TransferInputLimitRequest$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 63;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferInputLimitRequest$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 99;
                onWarmupCompleted = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    TransferInputLimitRequest.IAuthTabCallback();
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializerIAuthTabCallback = TransferInputLimitRequest.IAuthTabCallback();
                int i3 = onWarmupCompleted + 65;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return kSerializerIAuthTabCallback;
                }
                throw null;
            }
        }), null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferInputLimitRequest$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 125;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallbackWithResult = TransferInputLimitRequest.onExtraCallbackWithResult();
                int i4 = IAuthTabCallback + 89;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializerOnExtraCallbackWithResult;
                }
                throw null;
            }
        }), null};
        int i = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 30 / 0;
        }
    }

    public /* synthetic */ TransferInputLimitRequest(int i, TransferAccountDto transferAccountDto, DepositTarget depositTarget, Long l, TransferTextType transferTextType, String str, okycx okycxVar) {
        if (31 != (i & 31)) {
            int i2 = onWarmupCompleted + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 31, TransferInputLimitRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onNavigationEvent + 55;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.withdrawAccount = transferAccountDto;
        this.depositTarget = depositTarget;
        this.customTransferLimit = l;
        this.overLimitMessageType = transferTextType;
        this.sessionKey = str;
    }

    public TransferInputLimitRequest(@Nullable TransferAccountDto transferAccountDto, @NotNull DepositTarget depositTarget, @Nullable Long l, @NotNull TransferTextType transferTextType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(depositTarget, "");
        Intrinsics.checkNotNullParameter(transferTextType, "");
        this.withdrawAccount = transferAccountDto;
        this.depositTarget = depositTarget;
        this.customTransferLimit = l;
        this.overLimitMessageType = transferTextType;
        this.sessionKey = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(TransferInputLimitRequest transferInputLimitRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, TransferAccountDto$.serializer.INSTANCE, transferInputLimitRequest.withdrawAccount);
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), transferInputLimitRequest.depositTarget);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, oty1.onExtraCallback, transferInputLimitRequest.customTransferLimit);
        vylVar.onNavigationEvent(serialDescriptor, 3, (py) lazyArr[3].getValue(), transferInputLimitRequest.overLimitMessageType);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, transferInputLimitRequest.sessionKey);
        int i4 = onNavigationEvent + 83;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 91;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }
}
