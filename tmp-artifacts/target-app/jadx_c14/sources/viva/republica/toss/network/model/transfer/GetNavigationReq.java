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
import viva.republica.toss.network.model.transfer.GetNavigationReq$;
import viva.republica.toss.network.model.transfer.TransferAccountDto$;
import viva.republica.toss.send.v4.entity.TransferQueryParams;
import viva.republica.toss.send.v4.entity.TransferQueryParams$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GetNavigationReq {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable = 8;
    public static final Companion Companion;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final Long amount;
    private final DepositTarget depositTarget;
    private final boolean fixedWithdrawAccount;
    private final TransferQueryParams queryParams;
    private final String sessionKey;
    private final DestinationType targetDestinationType;
    private final TransferAccountDto withdrawAccount;

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        DepositTarget.Companion companion = DepositTarget.Companion;
        if (i3 == 0) {
            return companion.serializer();
        }
        companion.serializer();
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<DestinationType> kSerializerSerializer = DestinationType.Companion.serializer();
        int i4 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerSerializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof GetNavigationReq)) {
            return false;
        }
        GetNavigationReq getNavigationReq = (GetNavigationReq) obj;
        if (!Intrinsics.areEqual(this.sessionKey, getNavigationReq.sessionKey)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.withdrawAccount, getNavigationReq.withdrawAccount)) {
            int i4 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.depositTarget, getNavigationReq.depositTarget)) {
            int i6 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.amount, getNavigationReq.amount)) {
            if (this.targetDestinationType == getNavigationReq.targetDestinationType) {
                return Intrinsics.areEqual(this.queryParams, getNavigationReq.queryParams) && this.fixedWithdrawAccount == getNavigationReq.fixedWithdrawAccount;
            }
            int i8 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i8 % 128;
            return i8 % 2 != 0;
        }
        int i9 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 57;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sessionKey;
        if (str == null) {
            int i5 = i2 + 61;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        TransferAccountDto transferAccountDto = this.withdrawAccount;
        int iHashCode2 = transferAccountDto == null ? 0 : transferAccountDto.hashCode();
        int iHashCode3 = this.depositTarget.hashCode();
        Long l = this.amount;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l != null ? l.hashCode() : 0)) * 31) + this.targetDestinationType.hashCode()) * 31) + this.queryParams.hashCode()) * 31) + Boolean.hashCode(this.fixedWithdrawAccount);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetNavigationReq(sessionKey=" + this.sessionKey + ", withdrawAccount=" + this.withdrawAccount + ", depositTarget=" + this.depositTarget + ", amount=" + this.amount + ", targetDestinationType=" + this.targetDestinationType + ", queryParams=" + this.queryParams + ", fixedWithdrawAccount=" + this.fixedWithdrawAccount + ")";
        int i2 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetNavigationReq> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            GetNavigationReq$.serializer serializerVar = GetNavigationReq$.serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 89;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.GetNavigationReq$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                KSerializer kSerializerOnWarmupCompleted;
                int i = 2 % 2;
                int i2 = onExtraCallback + 61;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    kSerializerOnWarmupCompleted = GetNavigationReq.onWarmupCompleted();
                    int i3 = 36 / 0;
                } else {
                    kSerializerOnWarmupCompleted = GetNavigationReq.onWarmupCompleted();
                }
                int i4 = onNavigationEvent + 45;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnWarmupCompleted;
            }
        }), null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.GetNavigationReq$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 71;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    GetNavigationReq.onExtraCallback();
                    throw null;
                }
                KSerializer kSerializerOnExtraCallback = GetNavigationReq.onExtraCallback();
                int i3 = onExtraCallbackWithResult + 115;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 96 / 0;
                }
                return kSerializerOnExtraCallback;
            }
        }), null, null};
        int i = onWarmupCompleted + 7;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ GetNavigationReq(int i, String str, TransferAccountDto transferAccountDto, DepositTarget depositTarget, Long l, DestinationType destinationType, TransferQueryParams transferQueryParams, boolean z, okycx okycxVar) {
        if (127 != (i & 127)) {
            int i2 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 127, GetNavigationReq$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallbackWithResult + 59;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.sessionKey = str;
        this.withdrawAccount = transferAccountDto;
        this.depositTarget = depositTarget;
        this.amount = l;
        this.targetDestinationType = destinationType;
        this.queryParams = transferQueryParams;
        this.fixedWithdrawAccount = z;
    }

    public GetNavigationReq(@Nullable String str, @Nullable TransferAccountDto transferAccountDto, @NotNull DepositTarget depositTarget, @Nullable Long l, @NotNull DestinationType destinationType, @NotNull TransferQueryParams transferQueryParams, boolean z) {
        Intrinsics.checkNotNullParameter(depositTarget, "");
        Intrinsics.checkNotNullParameter(destinationType, "");
        Intrinsics.checkNotNullParameter(transferQueryParams, "");
        this.sessionKey = str;
        this.withdrawAccount = transferAccountDto;
        this.depositTarget = depositTarget;
        this.amount = l;
        this.targetDestinationType = destinationType;
        this.queryParams = transferQueryParams;
        this.fixedWithdrawAccount = z;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(GetNavigationReq getNavigationReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, getNavigationReq.sessionKey);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, TransferAccountDto$.serializer.INSTANCE, getNavigationReq.withdrawAccount);
        vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), getNavigationReq.depositTarget);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, oty1.onExtraCallback, getNavigationReq.amount);
        vylVar.onNavigationEvent(serialDescriptor, 4, (py) lazyArr[4].getValue(), getNavigationReq.targetDestinationType);
        vylVar.onNavigationEvent(serialDescriptor, 5, TransferQueryParams$.serializer.INSTANCE, getNavigationReq.queryParams);
        vylVar.onNavigationEvent(serialDescriptor, 6, getNavigationReq.fixedWithdrawAccount);
        int i4 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 9;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }
}
