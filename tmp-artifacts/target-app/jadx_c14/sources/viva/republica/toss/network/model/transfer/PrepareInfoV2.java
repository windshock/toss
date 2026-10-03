package viva.republica.toss.network.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.ACPayResult;
import o.TombstoneProtosMemoryMappingBuilder;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.PrepareInfoV2$;
import viva.republica.toss.network.model.transfer.TransferProvider;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PrepareInfoV2 implements Parcelable {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final boolean canLeaveMessageCard;
    private final boolean canLeaveMessageCardWithoutEmoji;
    private final DepositTarget convertedDepositTarget;
    private final boolean depositMemoEditable;
    private final DepositUiInfo depositTargetUI;
    private final boolean skipFraudCheck;
    private final TransferProvider transferProvider;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PrepareInfoV2> CREATOR = new onExtraCallbackWithResult();

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<PrepareInfoV2> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ PrepareInfoV2 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            PrepareInfoV2 prepareInfoV2OnWarmupCompleted = onWarmupCompleted(parcel);
            int i4 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return prepareInfoV2OnWarmupCompleted;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ PrepareInfoV2[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            PrepareInfoV2[] prepareInfoV2ArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return prepareInfoV2ArrOnWarmupCompleted;
        }

        public final PrepareInfoV2 onWarmupCompleted(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            DepositUiInfo depositUiInfoCreateFromParcel = null;
            TransferProvider transferProviderValueOf = parcel.readInt() == 0 ? null : TransferProvider.valueOf(parcel.readString());
            DepositTarget depositTarget = (DepositTarget) parcel.readParcelable(PrepareInfoV2.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int i2 = onWarmupCompleted + 97;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    DepositUiInfo.CREATOR.createFromParcel(parcel);
                    depositUiInfoCreateFromParcel.hashCode();
                    throw null;
                }
                depositUiInfoCreateFromParcel = DepositUiInfo.CREATOR.createFromParcel(parcel);
            }
            DepositUiInfo depositUiInfo = depositUiInfoCreateFromParcel;
            boolean z4 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                int i3 = onExtraCallbackWithResult + 65;
                int i4 = i3 % 128;
                onWarmupCompleted = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 63;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            } else {
                z = true;
            }
            return new PrepareInfoV2(z2, z3, transferProviderValueOf, depositTarget, depositUiInfo, z4, z);
        }

        public final PrepareInfoV2[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i3 % 128;
            PrepareInfoV2[] prepareInfoV2Arr = new PrepareInfoV2[i];
            if (i3 % 2 == 0) {
                int i4 = 48 / 0;
            }
            return prepareInfoV2Arr;
        }
    }

    public PrepareInfoV2() {
        this(false, false, (TransferProvider) null, (DepositTarget) null, (DepositUiInfo) null, false, false, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i) | i6);
        int i8 = ~i3;
        int i9 = i7 | (~(i8 | i6));
        int i10 = ~i6;
        int i11 = ~(i10 | i8);
        int i12 = ~(i10 | i);
        int i13 = (~(i8 | i)) | i11 | i12;
        int i14 = (~(i3 | i10)) | i12;
        int i15 = i + i6 + i4 + (1039959776 * i5) + ((-2046201414) * i2);
        int i16 = i15 * i15;
        int i17 = ((357140864 * i) - 8388608) + ((-1785926397) * i6) + ((-2146011519) * i9) + (i13 * 2146011519) + (2146011519 * i14) + ((-1788870656) * i4) + ((-201326592) * i5) + ((-406847488) * i2) + (529399808 * i16);
        int i18 = ((i * 868240256) - 1765242424) + (i6 * 868238279) + (i9 * (-659)) + (i13 * 659) + (i14 * 659) + (i4 * 868239597) + (i5 * 817356128) + (i2 * 406493490) + (i16 * 645267456);
        int i19 = i17 + (i18 * i18 * 681705472);
        if (i19 != 1) {
            return i19 != 2 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
        }
        PrepareInfoV2 prepareInfoV2 = (PrepareInfoV2) objArr[0];
        int i20 = 2 % 2;
        int i21 = IAuthTabCallback + 41;
        int i22 = i21 % 128;
        onExtraCallbackWithResult = i22;
        int i23 = i21 % 2;
        DepositUiInfo depositUiInfo = prepareInfoV2.depositTargetUI;
        int i24 = i22 + 71;
        IAuthTabCallback = i24 % 128;
        int i25 = i24 % 2;
        return depositUiInfo;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<DepositTarget> kSerializerSerializer = DepositTarget.Companion.serializer();
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        return kSerializerSerializer;
    }

    private static final /* synthetic */ KSerializer access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TransferProvider.Companion companion = TransferProvider.Companion;
        if (i3 == 0) {
            return companion.serializer();
        }
        companion.serializer();
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            access100();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerAccess100 = access100();
        int i3 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerAccess100;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback_Parcel();
        }
        IAuthTabCallback_Parcel();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 35;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 35;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrepareInfoV2)) {
            return false;
        }
        PrepareInfoV2 prepareInfoV2 = (PrepareInfoV2) obj;
        if (this.skipFraudCheck != prepareInfoV2.skipFraudCheck) {
            int i2 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.depositMemoEditable != prepareInfoV2.depositMemoEditable || this.transferProvider != prepareInfoV2.transferProvider) {
            return false;
        }
        if (!Intrinsics.areEqual(this.convertedDepositTarget, prepareInfoV2.convertedDepositTarget)) {
            int i4 = IAuthTabCallback + 71;
            int i5 = i4 % 128;
            onExtraCallbackWithResult = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 21;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 95 / 0;
            }
            return false;
        }
        if (Intrinsics.areEqual(this.depositTargetUI, prepareInfoV2.depositTargetUI)) {
            if (this.canLeaveMessageCard != prepareInfoV2.canLeaveMessageCard || this.canLeaveMessageCardWithoutEmoji != prepareInfoV2.canLeaveMessageCardWithoutEmoji) {
                return false;
            }
            int i9 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            return true;
        }
        int i11 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i11 % 128;
        if (i11 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = Boolean.hashCode(this.skipFraudCheck);
        int iHashCode4 = Boolean.hashCode(this.depositMemoEditable);
        TransferProvider transferProvider = this.transferProvider;
        int iHashCode5 = 0;
        if (transferProvider == null) {
            int i2 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = transferProvider.hashCode();
        }
        DepositTarget depositTarget = this.convertedDepositTarget;
        if (depositTarget == null) {
            int i4 = IAuthTabCallback + 57;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = depositTarget.hashCode();
        }
        DepositUiInfo depositUiInfo = this.depositTargetUI;
        if (depositUiInfo != null) {
            int i6 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode5 = depositUiInfo.hashCode();
        }
        return (((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + Boolean.hashCode(this.canLeaveMessageCard)) * 31) + Boolean.hashCode(this.canLeaveMessageCardWithoutEmoji);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PrepareInfoV2(skipFraudCheck=" + this.skipFraudCheck + ", depositMemoEditable=" + this.depositMemoEditable + ", transferProvider=" + this.transferProvider + ", convertedDepositTarget=" + this.convertedDepositTarget + ", depositTargetUI=" + this.depositTargetUI + ", canLeaveMessageCard=" + this.canLeaveMessageCard + ", canLeaveMessageCardWithoutEmoji=" + this.canLeaveMessageCardWithoutEmoji + ")";
        int i2 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeInt(this.skipFraudCheck ? 1 : 0);
            parcel.writeInt(this.depositMemoEditable ? 1 : 0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        parcel.writeInt(this.skipFraudCheck ? 1 : 0);
        parcel.writeInt(this.depositMemoEditable ? 1 : 0);
        TransferProvider transferProvider = this.transferProvider;
        if (transferProvider == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(transferProvider.name());
        }
        parcel.writeParcelable(this.convertedDepositTarget, i);
        DepositUiInfo depositUiInfo = this.depositTargetUI;
        if (depositUiInfo == null) {
            int i5 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            depositUiInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.canLeaveMessageCard ? 1 : 0);
        parcel.writeInt(this.canLeaveMessageCardWithoutEmoji ? 1 : 0);
        int i7 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PrepareInfoV2> serializer() {
            PrepareInfoV2$.serializer serializerVar;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                serializerVar = PrepareInfoV2$.serializer.INSTANCE;
                int i3 = 12 / 0;
            } else {
                serializerVar = PrepareInfoV2$.serializer.INSTANCE;
            }
            int i4 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.PrepareInfoV2$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 121;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallbackWithResult = PrepareInfoV2.onExtraCallbackWithResult();
                int i4 = onExtraCallbackWithResult + 77;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallbackWithResult;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.PrepareInfoV2$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 47;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnNavigationEvent = PrepareInfoV2.onNavigationEvent();
                int i4 = onExtraCallbackWithResult + 73;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerOnNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), null, null, null};
        int i = onNavigationEvent + 69;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ PrepareInfoV2(int i, boolean z, boolean z2, TransferProvider transferProvider, DepositTarget depositTarget, DepositUiInfo depositUiInfo, boolean z3, boolean z4, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.skipFraudCheck = false;
            int i2 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        } else {
            this.skipFraudCheck = z;
        }
        int i4 = 2 % 2;
        if ((i & 2) == 0) {
            int i5 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                this.depositMemoEditable = true;
            } else {
                this.depositMemoEditable = false;
            }
        } else {
            this.depositMemoEditable = z2;
        }
        if ((i & 4) == 0) {
            this.transferProvider = null;
        } else {
            this.transferProvider = transferProvider;
        }
        if ((i & 8) == 0) {
            this.convertedDepositTarget = null;
        } else {
            this.convertedDepositTarget = depositTarget;
        }
        if ((i & 16) == 0) {
            this.depositTargetUI = null;
        } else {
            this.depositTargetUI = depositUiInfo;
        }
        if ((i & 32) == 0) {
            this.canLeaveMessageCard = false;
        } else {
            this.canLeaveMessageCard = z3;
        }
        int i6 = 2 % 2;
        if ((i & 64) != 0) {
            this.canLeaveMessageCardWithoutEmoji = z4;
            return;
        }
        int i7 = IAuthTabCallback + 115;
        int i8 = i7 % 128;
        onExtraCallbackWithResult = i8;
        int i9 = i7 % 2;
        this.canLeaveMessageCardWithoutEmoji = false;
        int i10 = i8 + 81;
        IAuthTabCallback = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public PrepareInfoV2(boolean z, boolean z2, @Nullable TransferProvider transferProvider, @Nullable DepositTarget depositTarget, @Nullable DepositUiInfo depositUiInfo, boolean z3, boolean z4) {
        this.skipFraudCheck = z;
        this.depositMemoEditable = z2;
        this.transferProvider = transferProvider;
        this.convertedDepositTarget = depositTarget;
        this.depositTargetUI = depositUiInfo;
        this.canLeaveMessageCard = z3;
        this.canLeaveMessageCardWithoutEmoji = z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallbackWithResult(java.lang.Object[] r8) {
        /*
            r0 = 0
            r1 = r8[r0]
            viva.republica.toss.network.model.transfer.PrepareInfoV2 r1 = (viva.republica.toss.network.model.transfer.PrepareInfoV2) r1
            r2 = 1
            r3 = r8[r2]
            o.vyl r3 = (o.vyl) r3
            r4 = 2
            r8 = r8[r4]
            kotlinx.serialization.descriptors.SerialDescriptor r8 = (kotlinx.serialization.descriptors.SerialDescriptor) r8
            int r5 = r4 % r4
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r5 = viva.republica.toss.network.model.transfer.PrepareInfoV2.$childSerializers
            boolean r6 = r3.onWarmupCompleted(r8, r0)
            if (r6 != 0) goto L26
            int r6 = viva.republica.toss.network.model.transfer.PrepareInfoV2.onExtraCallbackWithResult
            int r6 = r6 + 99
            int r7 = r6 % 128
            viva.republica.toss.network.model.transfer.PrepareInfoV2.IAuthTabCallback = r7
            int r6 = r6 % r4
            boolean r6 = r1.skipFraudCheck
            if (r6 == 0) goto L2b
        L26:
            boolean r6 = r1.skipFraudCheck
            r3.onNavigationEvent(r8, r0, r6)
        L2b:
            boolean r0 = r3.onWarmupCompleted(r8, r2)
            if (r0 == 0) goto L32
            goto L36
        L32:
            boolean r0 = r1.depositMemoEditable
            if (r0 == 0) goto L3b
        L36:
            boolean r0 = r1.depositMemoEditable
            r3.onNavigationEvent(r8, r2, r0)
        L3b:
            boolean r0 = r3.onWarmupCompleted(r8, r4)
            r0 = r0 ^ r2
            if (r0 == 0) goto L46
            viva.republica.toss.network.model.transfer.TransferProvider r0 = r1.transferProvider
            if (r0 == 0) goto L53
        L46:
            r0 = r5[r4]
            java.lang.Object r0 = r0.getValue()
            o.py r0 = (o.py) r0
            viva.republica.toss.network.model.transfer.TransferProvider r6 = r1.transferProvider
            r3.onExtraCallbackWithResult(r8, r4, r0, r6)
        L53:
            r0 = 3
            boolean r6 = r3.onWarmupCompleted(r8, r0)
            r6 = r6 ^ r2
            if (r6 == r2) goto L5c
            goto L69
        L5c:
            int r2 = viva.republica.toss.network.model.transfer.PrepareInfoV2.IAuthTabCallback
            int r2 = r2 + 85
            int r6 = r2 % 128
            viva.republica.toss.network.model.transfer.PrepareInfoV2.onExtraCallbackWithResult = r6
            int r2 = r2 % r4
            viva.republica.toss.network.model.transfer.DepositTarget r2 = r1.convertedDepositTarget
            if (r2 == 0) goto L76
        L69:
            r2 = r5[r0]
            java.lang.Object r2 = r2.getValue()
            o.py r2 = (o.py) r2
            viva.republica.toss.network.model.transfer.DepositTarget r5 = r1.convertedDepositTarget
            r3.onExtraCallbackWithResult(r8, r0, r2, r5)
        L76:
            r0 = 4
            boolean r2 = r3.onWarmupCompleted(r8, r0)
            if (r2 != 0) goto L81
            viva.republica.toss.network.model.transfer.DepositUiInfo r2 = r1.depositTargetUI
            if (r2 == 0) goto L88
        L81:
            viva.republica.toss.network.model.transfer.DepositUiInfo$$serializer r2 = viva.republica.toss.network.model.transfer.DepositUiInfo$$serializer.INSTANCE
            viva.republica.toss.network.model.transfer.DepositUiInfo r5 = r1.depositTargetUI
            r3.onExtraCallbackWithResult(r8, r0, r2, r5)
        L88:
            r0 = 5
            boolean r2 = r3.onWarmupCompleted(r8, r0)
            if (r2 != 0) goto L93
            boolean r2 = r1.canLeaveMessageCard
            if (r2 == 0) goto L98
        L93:
            boolean r2 = r1.canLeaveMessageCard
            r3.onNavigationEvent(r8, r0, r2)
        L98:
            r0 = 6
            boolean r2 = r3.onWarmupCompleted(r8, r0)
            if (r2 != 0) goto Lac
            int r2 = viva.republica.toss.network.model.transfer.PrepareInfoV2.IAuthTabCallback
            int r2 = r2 + 113
            int r5 = r2 % 128
            viva.republica.toss.network.model.transfer.PrepareInfoV2.onExtraCallbackWithResult = r5
            int r2 = r2 % r4
            boolean r2 = r1.canLeaveMessageCardWithoutEmoji
            if (r2 == 0) goto Lb1
        Lac:
            boolean r1 = r1.canLeaveMessageCardWithoutEmoji
            r3.onNavigationEvent(r8, r0, r1)
        Lb1:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.PrepareInfoV2.onExtraCallbackWithResult(java.lang.Object[]):java.lang.Object");
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 11;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i2 + 121;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PrepareInfoV2(boolean z, boolean z2, TransferProvider transferProvider, DepositTarget depositTarget, DepositUiInfo depositUiInfo, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z5;
        TransferProvider transferProvider2;
        DepositTarget depositTarget2;
        boolean z6;
        boolean z7 = false;
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = false;
        }
        if ((i & 2) != 0) {
            int i5 = IAuthTabCallback + 49;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z5 = false;
        } else {
            z5 = z2;
        }
        DepositUiInfo depositUiInfo2 = null;
        if ((i & 4) != 0) {
            int i8 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            transferProvider2 = null;
        } else {
            transferProvider2 = transferProvider;
        }
        if ((i & 8) != 0) {
            int i9 = 2 % 2;
            depositTarget2 = null;
        } else {
            depositTarget2 = depositTarget;
        }
        if ((i & 16) != 0) {
            int i10 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
        } else {
            depositUiInfo2 = depositUiInfo;
        }
        if ((i & 32) != 0) {
            int i12 = 2 % 2;
            z6 = false;
        } else {
            z6 = z3;
        }
        if ((i & 64) != 0) {
            int i13 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i13 % 128;
            if (i13 % 2 == 0) {
                z4 = true;
                z7 = z4;
            }
        } else {
            z7 = z4;
        }
        this(z, z5, transferProvider2, depositTarget2, depositUiInfo2, z6, z7);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PrepareInfoV2 prepareInfoV2 = (PrepareInfoV2) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 59;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        boolean z = prepareInfoV2.skipFraudCheck;
        int i5 = i2 + 17;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return Boolean.valueOf(z);
        }
        throw null;
    }

    public final boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        boolean z = this.depositMemoEditable;
        int i5 = i3 + 43;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final TransferProvider onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 123;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TransferProvider transferProvider = this.transferProvider;
        int i4 = i2 + 77;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return transferProvider;
    }

    public final DepositTarget asInterface() {
        DepositTarget depositTarget;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            depositTarget = this.convertedDepositTarget;
            int i4 = 25 / 0;
        } else {
            depositTarget = this.convertedDepositTarget;
        }
        int i5 = i3 + 23;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return depositTarget;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.canLeaveMessageCard;
        int i5 = i3 + 93;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 7;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.canLeaveMessageCardWithoutEmoji;
        int i5 = i2 + 85;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final DepositUiInfo IAuthTabCallbackDefault() {
        return (DepositUiInfo) IAuthTabCallback(2040408455, new Object[]{this}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -2040408454);
    }

    public final boolean asBinder() {
        return ((Boolean) IAuthTabCallback(357940434, new Object[]{this}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -357940432)).booleanValue();
    }
}
