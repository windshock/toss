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
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.PreCheckForSendMeta$;
import viva.republica.toss.network.model.transfer.PreCheckForSendRequest$;
import viva.republica.toss.network.model.transfer.TransferAccountDto$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PreCheckForSendRequest {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final long amount;
    private final String depositAccountHolderName;
    private final DepositTarget depositTarget;
    private final PreCheckForSendMeta meta;
    private final String sessionKey;
    private final TransferProvider transferProvider;
    private final String userMemo;
    private final TransferAccountDto withdrawAccount;

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<DepositTarget> kSerializerSerializer = DepositTarget.Companion.serializer();
        int i4 = IAuthTabCallback + 111;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
        return kSerializerSerializer;
    }

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<TransferProvider> kSerializerSerializer = TransferProvider.Companion.serializer();
        int i4 = onNavigationEvent + 59;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerSerializer;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        KSerializer kSerializerOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerOnExtraCallback = onExtraCallback();
            int i3 = 3 / 0;
        } else {
            kSerializerOnExtraCallback = onExtraCallback();
        }
        int i4 = onNavigationEvent + 31;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallback;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        int i3 = onNavigationEvent + 7;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerIAuthTabCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof PreCheckForSendRequest)) {
            return false;
        }
        PreCheckForSendRequest preCheckForSendRequest = (PreCheckForSendRequest) obj;
        if (!Intrinsics.areEqual(this.sessionKey, preCheckForSendRequest.sessionKey)) {
            int i4 = onNavigationEvent + 93;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.transferProvider != preCheckForSendRequest.transferProvider) {
            return false;
        }
        if (this.amount != preCheckForSendRequest.amount) {
            int i6 = onNavigationEvent + 81;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.withdrawAccount, preCheckForSendRequest.withdrawAccount)) {
            int i7 = IAuthTabCallback + 69;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.depositTarget, preCheckForSendRequest.depositTarget) || !Intrinsics.areEqual(this.depositAccountHolderName, preCheckForSendRequest.depositAccountHolderName) || (!Intrinsics.areEqual(this.userMemo, preCheckForSendRequest.userMemo))) {
            return false;
        }
        if (Intrinsics.areEqual(this.meta, preCheckForSendRequest.meta)) {
            return true;
        }
        int i9 = IAuthTabCallback + 31;
        onNavigationEvent = i9 % 128;
        return i9 % 2 != 0;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 43;
        onNavigationEvent = i3 % 128;
        int iHashCode3 = 1;
        if (i3 % 2 == 0 ? (str = this.sessionKey) != null : (str = this.sessionKey) != null) {
            iHashCode = str.hashCode();
        } else {
            int i4 = i2 + 81;
            onNavigationEvent = i4 % 128;
            iHashCode = i4 % 2 != 0 ? 1 : 0;
        }
        TransferProvider transferProvider = this.transferProvider;
        int iHashCode4 = transferProvider == null ? 0 : transferProvider.hashCode();
        int iHashCode5 = Long.hashCode(this.amount);
        int iHashCode6 = this.withdrawAccount.hashCode();
        int iHashCode7 = this.depositTarget.hashCode();
        String str2 = this.depositAccountHolderName;
        if (str2 == null) {
            int i5 = onNavigationEvent + 95;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                iHashCode3 = 0;
            }
        } else {
            iHashCode3 = str2.hashCode();
        }
        String str3 = this.userMemo;
        if (str3 == null) {
            int i6 = onNavigationEvent + 67;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        PreCheckForSendMeta preCheckForSendMeta = this.meta;
        return (((((((((((((iHashCode * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode3) * 31) + iHashCode2) * 31) + (preCheckForSendMeta != null ? preCheckForSendMeta.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PreCheckForSendRequest(sessionKey=" + this.sessionKey + ", transferProvider=" + this.transferProvider + ", amount=" + this.amount + ", withdrawAccount=" + this.withdrawAccount + ", depositTarget=" + this.depositTarget + ", depositAccountHolderName=" + this.depositAccountHolderName + ", userMemo=" + this.userMemo + ", meta=" + this.meta + ")";
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PreCheckForSendRequest> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            PreCheckForSendRequest$.serializer serializerVar = PreCheckForSendRequest$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 79;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.PreCheckForSendRequest$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 25;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallbackWithResult = PreCheckForSendRequest.onExtraCallbackWithResult();
                int i4 = onExtraCallback + 61;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 9 / 0;
                }
                return kSerializerOnExtraCallbackWithResult;
            }
        }), null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.PreCheckForSendRequest$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 125;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnNavigationEvent = PreCheckForSendRequest.onNavigationEvent();
                int i4 = IAuthTabCallback + 37;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnNavigationEvent;
            }
        }), null, null, null};
        int i = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ PreCheckForSendRequest(int i, String str, TransferProvider transferProvider, long j, TransferAccountDto transferAccountDto, DepositTarget depositTarget, String str2, String str3, PreCheckForSendMeta preCheckForSendMeta, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 255;
        if (255 != (i & 255)) {
            int i3 = IAuthTabCallback + 63;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = PreCheckForSendRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 14963;
            } else {
                descriptor = PreCheckForSendRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = IAuthTabCallback + 57;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.sessionKey = str;
        this.transferProvider = transferProvider;
        this.amount = j;
        this.withdrawAccount = transferAccountDto;
        this.depositTarget = depositTarget;
        this.depositAccountHolderName = str2;
        this.userMemo = str3;
        this.meta = preCheckForSendMeta;
    }

    public PreCheckForSendRequest(@Nullable String str, @Nullable TransferProvider transferProvider, long j, @NotNull TransferAccountDto transferAccountDto, @NotNull DepositTarget depositTarget, @Nullable String str2, @Nullable String str3, @Nullable PreCheckForSendMeta preCheckForSendMeta) {
        Intrinsics.checkNotNullParameter(transferAccountDto, "");
        Intrinsics.checkNotNullParameter(depositTarget, "");
        this.sessionKey = str;
        this.transferProvider = transferProvider;
        this.amount = j;
        this.withdrawAccount = transferAccountDto;
        this.depositTarget = depositTarget;
        this.depositAccountHolderName = str2;
        this.userMemo = str3;
        this.meta = preCheckForSendMeta;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(PreCheckForSendRequest preCheckForSendRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, preCheckForSendRequest.sessionKey);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) lazyArr[1].getValue(), preCheckForSendRequest.transferProvider);
        vylVar.onExtraCallback(serialDescriptor, 2, preCheckForSendRequest.amount);
        vylVar.onNavigationEvent(serialDescriptor, 3, TransferAccountDto$.serializer.INSTANCE, preCheckForSendRequest.withdrawAccount);
        vylVar.onNavigationEvent(serialDescriptor, 4, (py) lazyArr[4].getValue(), preCheckForSendRequest.depositTarget);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, preCheckForSendRequest.depositAccountHolderName);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, preCheckForSendRequest.userMemo);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 7, PreCheckForSendMeta$.serializer.INSTANCE, preCheckForSendRequest.meta);
        int i4 = IAuthTabCallback + 119;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 107;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 125;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
