package viva.republica.toss.network.model.transfer;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.NativeAnimatedModuleExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.DepositAccountHolder$;
import viva.republica.toss.network.model.transfer.DuplicatedTransferConfirmationDto$;
import viva.republica.toss.network.model.transfer.TransferAccountDto$;
import viva.republica.toss.network.model.transfer.TransferAdditionalAuthDto$;
import viva.republica.toss.network.model.transfer.TransferMessageCardDto$;
import viva.republica.toss.network.model.transfer.TransferReceiverInfoDto$;
import viva.republica.toss.network.model.transfer.TransferSendRequest$;
import viva.republica.toss.network.model.transfer.TransferSignatureDto$;
import viva.republica.toss.network.model.transfer.TransferSummaryDto$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferSendRequest {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final long amount;
    private final TransferAdditionalAuthDto authentication;
    private final DepositAccountHolder depositAccountHolder;
    private final DepositTarget depositTarget;
    private final DuplicatedTransferConfirmationDto duplicatedTransferConfirmation;
    private final TransferMessageCardDto messageCard;
    private final TransferMetaDto meta;
    private final TransferReceiverInfoDto receiverInfo;
    private final TransferSignatureDto signatureDto;
    private final TransferSummaryDto summary;
    private final TransferProvider transferProvider;
    private final TransferAccountDto withdrawAccount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault();
        }
        IAuthTabCallbackDefault();
        throw null;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            DepositTarget.Companion.serializer();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<DepositTarget> kSerializerSerializer = DepositTarget.Companion.serializer();
        int i3 = onWarmupCompleted + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerSerializer;
    }

    private static final /* synthetic */ KSerializer asBinder() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<TransferProvider> kSerializerSerializer = TransferProvider.Companion.serializer();
        int i4 = onWarmupCompleted + 113;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerSerializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            asBinder();
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerAsBinder = asBinder();
        int i3 = onExtraCallback + 103;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerAsBinder;
        }
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferSendRequest)) {
            int i5 = i3 + 119;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        TransferSendRequest transferSendRequest = (TransferSendRequest) obj;
        if (!Intrinsics.areEqual(this.withdrawAccount, transferSendRequest.withdrawAccount)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.depositTarget, transferSendRequest.depositTarget)) {
            int i7 = onExtraCallback + 17;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.amount != transferSendRequest.amount) {
            int i9 = onWarmupCompleted + 39;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.transferProvider != transferSendRequest.transferProvider) {
            int i11 = onWarmupCompleted + 117;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.depositAccountHolder, transferSendRequest.depositAccountHolder)) {
            return false;
        }
        if (Intrinsics.areEqual(this.signatureDto, transferSendRequest.signatureDto)) {
            return Intrinsics.areEqual(this.summary, transferSendRequest.summary) && Intrinsics.areEqual(this.duplicatedTransferConfirmation, transferSendRequest.duplicatedTransferConfirmation) && Intrinsics.areEqual(this.authentication, transferSendRequest.authentication) && Intrinsics.areEqual(this.receiverInfo, transferSendRequest.receiverInfo) && Intrinsics.areEqual(this.messageCard, transferSendRequest.messageCard) && Intrinsics.areEqual(this.meta, transferSendRequest.meta);
        }
        int i13 = onWarmupCompleted + 11;
        int i14 = i13 % 128;
        onExtraCallback = i14;
        boolean z = i13 % 2 != 0;
        int i15 = i14 + 63;
        onWarmupCompleted = i15 % 128;
        int i16 = i15 % 2;
        return z;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.withdrawAccount.hashCode();
        int iHashCode4 = this.depositTarget.hashCode();
        int iHashCode5 = Long.hashCode(this.amount);
        TransferProvider transferProvider = this.transferProvider;
        int iHashCode6 = transferProvider == null ? 0 : transferProvider.hashCode();
        DepositAccountHolder depositAccountHolder = this.depositAccountHolder;
        int iHashCode7 = depositAccountHolder == null ? 0 : depositAccountHolder.hashCode();
        int iHashCode8 = this.signatureDto.hashCode();
        int iHashCode9 = this.summary.hashCode();
        int iHashCode10 = this.duplicatedTransferConfirmation.hashCode();
        TransferAdditionalAuthDto transferAdditionalAuthDto = this.authentication;
        if (transferAdditionalAuthDto == null) {
            iHashCode = 0;
        } else {
            iHashCode = transferAdditionalAuthDto.hashCode();
            int i2 = onExtraCallback + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }
        TransferReceiverInfoDto transferReceiverInfoDto = this.receiverInfo;
        if (transferReceiverInfoDto == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = transferReceiverInfoDto.hashCode();
            int i4 = onExtraCallback + 79;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        TransferMessageCardDto transferMessageCardDto = this.messageCard;
        int iHashCode11 = transferMessageCardDto == null ? 0 : transferMessageCardDto.hashCode();
        TransferMetaDto transferMetaDto = this.meta;
        return (((((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode11) * 31) + (transferMetaDto != null ? transferMetaDto.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferSendRequest(withdrawAccount=" + this.withdrawAccount + ", depositTarget=" + this.depositTarget + ", amount=" + this.amount + ", transferProvider=" + this.transferProvider + ", depositAccountHolder=" + this.depositAccountHolder + ", signatureDto=" + this.signatureDto + ", summary=" + this.summary + ", duplicatedTransferConfirmation=" + this.duplicatedTransferConfirmation + ", authentication=" + this.authentication + ", receiverInfo=" + this.receiverInfo + ", messageCard=" + this.messageCard + ", meta=" + this.meta + ")";
        int i2 = onExtraCallback + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferSendRequest> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                TransferSendRequest$.serializer serializerVar = TransferSendRequest$.serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            TransferSendRequest$.serializer serializerVar2 = TransferSendRequest$.serializer.INSTANCE;
            int i3 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return serializerVar2;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferSendRequest$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 117;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = TransferSendRequest.IAuthTabCallback();
                if (i3 == 0) {
                    int i4 = 81 / 0;
                }
                return kSerializerIAuthTabCallback;
            }
        }), null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferSendRequest$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 93;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return TransferSendRequest.onWarmupCompleted();
                }
                TransferSendRequest.onWarmupCompleted();
                throw null;
            }
        }), null, null, null, null, null, null, null, null};
        int i = onNavigationEvent + 7;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 18 / 0;
        }
    }

    public /* synthetic */ TransferSendRequest(int i, TransferAccountDto transferAccountDto, DepositTarget depositTarget, long j, TransferProvider transferProvider, DepositAccountHolder depositAccountHolder, TransferSignatureDto transferSignatureDto, TransferSummaryDto transferSummaryDto, DuplicatedTransferConfirmationDto duplicatedTransferConfirmationDto, TransferAdditionalAuthDto transferAdditionalAuthDto, TransferReceiverInfoDto transferReceiverInfoDto, TransferMessageCardDto transferMessageCardDto, TransferMetaDto transferMetaDto, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 4095;
        if (4095 != (i & 4095)) {
            int i3 = onExtraCallback + 27;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = TransferSendRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 4374;
            } else {
                descriptor = TransferSendRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onExtraCallback + 21;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 4;
            } else {
                int i6 = 2 % 2;
            }
        }
        this.withdrawAccount = transferAccountDto;
        this.depositTarget = depositTarget;
        this.amount = j;
        this.transferProvider = transferProvider;
        this.depositAccountHolder = depositAccountHolder;
        this.signatureDto = transferSignatureDto;
        this.summary = transferSummaryDto;
        this.duplicatedTransferConfirmation = duplicatedTransferConfirmationDto;
        this.authentication = transferAdditionalAuthDto;
        this.receiverInfo = transferReceiverInfoDto;
        this.messageCard = transferMessageCardDto;
        this.meta = transferMetaDto;
    }

    public TransferSendRequest(@NotNull TransferAccountDto transferAccountDto, @NotNull DepositTarget depositTarget, long j, @Nullable TransferProvider transferProvider, @Nullable DepositAccountHolder depositAccountHolder, @NotNull TransferSignatureDto transferSignatureDto, @NotNull TransferSummaryDto transferSummaryDto, @NotNull DuplicatedTransferConfirmationDto duplicatedTransferConfirmationDto, @Nullable TransferAdditionalAuthDto transferAdditionalAuthDto, @Nullable TransferReceiverInfoDto transferReceiverInfoDto, @Nullable TransferMessageCardDto transferMessageCardDto, @Nullable TransferMetaDto transferMetaDto) {
        Intrinsics.checkNotNullParameter(transferAccountDto, "");
        Intrinsics.checkNotNullParameter(depositTarget, "");
        Intrinsics.checkNotNullParameter(transferSignatureDto, "");
        Intrinsics.checkNotNullParameter(transferSummaryDto, "");
        Intrinsics.checkNotNullParameter(duplicatedTransferConfirmationDto, "");
        this.withdrawAccount = transferAccountDto;
        this.depositTarget = depositTarget;
        this.amount = j;
        this.transferProvider = transferProvider;
        this.depositAccountHolder = depositAccountHolder;
        this.signatureDto = transferSignatureDto;
        this.summary = transferSummaryDto;
        this.duplicatedTransferConfirmation = duplicatedTransferConfirmationDto;
        this.authentication = transferAdditionalAuthDto;
        this.receiverInfo = transferReceiverInfoDto;
        this.messageCard = transferMessageCardDto;
        this.meta = transferMetaDto;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(TransferSendRequest transferSendRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onNavigationEvent(serialDescriptor, 0, TransferAccountDto$.serializer.INSTANCE, transferSendRequest.withdrawAccount);
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), transferSendRequest.depositTarget);
        vylVar.onExtraCallback(serialDescriptor, 2, transferSendRequest.amount);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, (py) lazyArr[3].getValue(), transferSendRequest.transferProvider);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, DepositAccountHolder$.serializer.INSTANCE, transferSendRequest.depositAccountHolder);
        vylVar.onNavigationEvent(serialDescriptor, 5, TransferSignatureDto$.serializer.INSTANCE, transferSendRequest.signatureDto);
        vylVar.onNavigationEvent(serialDescriptor, 6, TransferSummaryDto$.serializer.INSTANCE, transferSendRequest.summary);
        vylVar.onNavigationEvent(serialDescriptor, 7, DuplicatedTransferConfirmationDto$.serializer.INSTANCE, transferSendRequest.duplicatedTransferConfirmation);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 8, TransferAdditionalAuthDto$.serializer.INSTANCE, transferSendRequest.authentication);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 9, TransferReceiverInfoDto$.serializer.INSTANCE, transferSendRequest.receiverInfo);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 10, TransferMessageCardDto$.serializer.INSTANCE, transferSendRequest.messageCard);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 11, NativeAnimatedModuleExternalSyntheticLambda1.INSTANCE, transferSendRequest.meta);
        int i4 = onWarmupCompleted + 63;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i3 + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return lazyArr;
    }

    public final DepositTarget onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        DepositTarget depositTarget = this.depositTarget;
        int i4 = i3 + 83;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return depositTarget;
    }

    public final TransferMetaDto onExtraCallback() {
        TransferMetaDto transferMetaDto;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 71;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            transferMetaDto = this.meta;
            int i4 = 38 / 0;
        } else {
            transferMetaDto = this.meta;
        }
        int i5 = i2 + 107;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return transferMetaDto;
    }
}
