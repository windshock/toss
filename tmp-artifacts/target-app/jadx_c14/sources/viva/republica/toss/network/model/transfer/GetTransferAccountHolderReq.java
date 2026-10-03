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
import viva.republica.toss.network.model.transfer.GetTransferAccountHolderReq$;
import viva.republica.toss.network.model.transfer.TransferAccountDto$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GetTransferAccountHolderReq {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final long amount;
    private final TransferAccountDto depositAccount;
    private final String reserveKey;
    private final String sessionKey;
    private final TransferProvider transferProvider;
    private final TransferAccountDto withdrawAccount;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.GetTransferAccountHolderReq$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                GetTransferAccountHolderReq.onExtraCallbackWithResult();
                throw null;
            }
            KSerializer kSerializerOnExtraCallbackWithResult = GetTransferAccountHolderReq.onExtraCallbackWithResult();
            int i3 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return kSerializerOnExtraCallbackWithResult;
            }
            obj.hashCode();
            throw null;
        }
    }), null, null, null, null};

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<TransferProvider> kSerializerSerializer = TransferProvider.Companion.serializer();
        int i4 = onNavigationEvent + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerSerializer;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsInterface = asInterface();
        int i4 = onNavigationEvent + 17;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerAsInterface;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTransferAccountHolderReq)) {
            int i5 = i3 + 113;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
        GetTransferAccountHolderReq getTransferAccountHolderReq = (GetTransferAccountHolderReq) obj;
        if (!Intrinsics.areEqual(this.sessionKey, getTransferAccountHolderReq.sessionKey)) {
            int i6 = onNavigationEvent + 115;
            IAuthTabCallback = i6 % 128;
            return i6 % 2 == 0;
        }
        if (this.transferProvider != getTransferAccountHolderReq.transferProvider) {
            int i7 = IAuthTabCallback + 119;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.depositAccount, getTransferAccountHolderReq.depositAccount)) {
            int i9 = onNavigationEvent + 85;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.withdrawAccount, getTransferAccountHolderReq.withdrawAccount)) {
            return false;
        }
        if (this.amount == getTransferAccountHolderReq.amount) {
            return Intrinsics.areEqual(this.reserveKey, getTransferAccountHolderReq.reserveKey);
        }
        int i11 = onNavigationEvent + 61;
        IAuthTabCallback = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 41;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sessionKey;
        if (str == null) {
            int i5 = i2 + 5;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode3 = this.transferProvider.hashCode();
        int iHashCode4 = this.depositAccount.hashCode();
        TransferAccountDto transferAccountDto = this.withdrawAccount;
        if (transferAccountDto == null) {
            int i7 = IAuthTabCallback + 121;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = transferAccountDto.hashCode();
        }
        int iHashCode5 = Long.hashCode(this.amount);
        String str2 = this.reserveKey;
        int iHashCode6 = (((((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
        int i9 = IAuthTabCallback + 49;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 61 / 0;
        }
        return iHashCode6;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetTransferAccountHolderReq(sessionKey=" + this.sessionKey + ", transferProvider=" + this.transferProvider + ", depositAccount=" + this.depositAccount + ", withdrawAccount=" + this.withdrawAccount + ", amount=" + this.amount + ", reserveKey=" + this.reserveKey + ")";
        int i2 = onNavigationEvent + 109;
        IAuthTabCallback = i2 % 128;
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

        public final KSerializer<GetTransferAccountHolderReq> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            GetTransferAccountHolderReq$.serializer serializerVar = GetTransferAccountHolderReq$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 70 / 0;
        }
    }

    public /* synthetic */ GetTransferAccountHolderReq(int i, String str, TransferProvider transferProvider, TransferAccountDto transferAccountDto, TransferAccountDto transferAccountDto2, long j, String str2, okycx okycxVar) {
        if (63 != (i & 63)) {
            int i2 = IAuthTabCallback + 67;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 63, GetTransferAccountHolderReq$.serializer.INSTANCE.getDescriptor());
            int i4 = onNavigationEvent + 103;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.sessionKey = str;
        this.transferProvider = transferProvider;
        this.depositAccount = transferAccountDto;
        this.withdrawAccount = transferAccountDto2;
        this.amount = j;
        this.reserveKey = str2;
    }

    public GetTransferAccountHolderReq(@Nullable String str, @NotNull TransferProvider transferProvider, @NotNull TransferAccountDto transferAccountDto, @Nullable TransferAccountDto transferAccountDto2, long j, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(transferProvider, "");
        Intrinsics.checkNotNullParameter(transferAccountDto, "");
        this.sessionKey = str;
        this.transferProvider = transferProvider;
        this.depositAccount = transferAccountDto;
        this.withdrawAccount = transferAccountDto2;
        this.amount = j;
        this.reserveKey = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(GetTransferAccountHolderReq getTransferAccountHolderReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, getTransferAccountHolderReq.sessionKey);
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), getTransferAccountHolderReq.transferProvider);
        TransferAccountDto$.serializer serializerVar = TransferAccountDto$.serializer.INSTANCE;
        vylVar.onNavigationEvent(serialDescriptor, 2, serializerVar, getTransferAccountHolderReq.depositAccount);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, serializerVar, getTransferAccountHolderReq.withdrawAccount);
        vylVar.onExtraCallback(serialDescriptor, 4, getTransferAccountHolderReq.amount);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, getTransferAccountHolderReq.reserveKey);
        int i4 = onNavigationEvent + 47;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i3 + 63;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return lazyArr;
        }
        throw null;
    }

    public final TransferProvider IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 97;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        TransferProvider transferProvider = this.transferProvider;
        int i5 = i2 + 47;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return transferProvider;
    }

    public final TransferAccountDto onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        TransferAccountDto transferAccountDto = this.depositAccount;
        int i5 = i3 + 57;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return transferAccountDto;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        long j = this.amount;
        int i5 = i3 + 99;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
