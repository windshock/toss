package viva.republica.toss.network.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.TransferInfoV2$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferInfoV2 implements Parcelable {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final BrokerInfo brokerInfo;
    private final DuplicatedTransferDisplayInfo duplicatedTransferDisplayInfo;
    private final FeeInfo feeInfo;
    private final PrepareInfoV2 prepareInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TransferInfoV2> CREATOR = new onWarmupCompleted();

    public static final class onWarmupCompleted implements Parcelable.Creator<TransferInfoV2> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final TransferInfoV2 IAuthTabCallback(Parcel parcel) {
            PrepareInfoV2 prepareInfoV2;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FeeInfo feeInfo = (FeeInfo) parcel.readParcelable(TransferInfoV2.class.getClassLoader());
            BrokerInfo brokerInfo = (BrokerInfo) parcel.readParcelable(TransferInfoV2.class.getClassLoader());
            if (parcel.readInt() == 0) {
                prepareInfoV2 = null;
            } else {
                PrepareInfoV2 prepareInfoV2CreateFromParcel = PrepareInfoV2.CREATOR.createFromParcel(parcel);
                int i4 = onWarmupCompleted + 59;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                prepareInfoV2 = prepareInfoV2CreateFromParcel;
            }
            return new TransferInfoV2(feeInfo, brokerInfo, prepareInfoV2, (DuplicatedTransferDisplayInfo) parcel.readParcelable(TransferInfoV2.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ TransferInfoV2 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            TransferInfoV2 transferInfoV2IAuthTabCallback = IAuthTabCallback(parcel);
            if (i3 == 0) {
                int i4 = 31 / 0;
            }
            return transferInfoV2IAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ TransferInfoV2[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 91;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            TransferInfoV2[] transferInfoV2ArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onExtraCallback + 71;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 32 / 0;
            }
            return transferInfoV2ArrOnWarmupCompleted;
        }

        public final TransferInfoV2[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 97;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            TransferInfoV2[] transferInfoV2Arr = new TransferInfoV2[i];
            if (i3 % 2 == 0) {
                int i5 = 42 / 0;
            }
            int i6 = i4 + 55;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return transferInfoV2Arr;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public TransferInfoV2() {
        this((FeeInfo) null, (BrokerInfo) null, (PrepareInfoV2) null, (DuplicatedTransferDisplayInfo) null, 15, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallback = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof TransferInfoV2)) {
                return false;
            }
            TransferInfoV2 transferInfoV2 = (TransferInfoV2) obj;
            return Intrinsics.areEqual(this.feeInfo, transferInfoV2.feeInfo) && Intrinsics.areEqual(this.brokerInfo, transferInfoV2.brokerInfo) && Intrinsics.areEqual(this.prepareInfo, transferInfoV2.prepareInfo) && Intrinsics.areEqual(this.duplicatedTransferDisplayInfo, transferInfoV2.duplicatedTransferDisplayInfo);
        }
        int i2 = onExtraCallback;
        int i3 = i2 + 33;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 3;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        FeeInfo feeInfo = this.feeInfo;
        int iHashCode4 = 0;
        if (feeInfo == null) {
            int i2 = onNavigationEvent + 69;
            onExtraCallback = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = feeInfo.hashCode();
        }
        BrokerInfo brokerInfo = this.brokerInfo;
        if (brokerInfo == null) {
            int i3 = onNavigationEvent + 51;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = brokerInfo.hashCode();
        }
        PrepareInfoV2 prepareInfoV2 = this.prepareInfo;
        if (prepareInfoV2 == null) {
            int i5 = onNavigationEvent + 103;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = prepareInfoV2.hashCode();
        }
        DuplicatedTransferDisplayInfo duplicatedTransferDisplayInfo = this.duplicatedTransferDisplayInfo;
        if (duplicatedTransferDisplayInfo != null) {
            int i7 = onExtraCallback + 109;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                duplicatedTransferDisplayInfo.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode4 = duplicatedTransferDisplayInfo.hashCode();
            int i8 = onExtraCallback + 17;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferInfoV2(feeInfo=" + this.feeInfo + ", brokerInfo=" + this.brokerInfo + ", prepareInfo=" + this.prepareInfo + ", duplicatedTransferDisplayInfo=" + this.duplicatedTransferDisplayInfo + ")";
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038 A[PHI: r1
      0x0038: PHI (r1v7 viva.republica.toss.network.model.transfer.PrepareInfoV2) = 
      (r1v6 viva.republica.toss.network.model.transfer.PrepareInfoV2)
      (r1v13 viva.republica.toss.network.model.transfer.PrepareInfoV2)
     binds: [B:8:0x0032, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel r5, int r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.TransferInfoV2.onExtraCallback
            int r1 = r1 + 87
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.TransferInfoV2.onNavigationEvent = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            if (r1 == 0) goto L26
            viva.republica.toss.network.model.transfer.FeeInfo r1 = r4.feeInfo
            r5.writeParcelable(r1, r6)
            viva.republica.toss.network.model.transfer.BrokerInfo r1 = r4.brokerInfo
            r5.writeParcelable(r1, r6)
            viva.republica.toss.network.model.transfer.PrepareInfoV2 r1 = r4.prepareInfo
            r3 = 67
            int r3 = r3 / r2
            if (r1 != 0) goto L38
            goto L34
        L26:
            viva.republica.toss.network.model.transfer.FeeInfo r1 = r4.feeInfo
            r5.writeParcelable(r1, r6)
            viva.republica.toss.network.model.transfer.BrokerInfo r1 = r4.brokerInfo
            r5.writeParcelable(r1, r6)
            viva.republica.toss.network.model.transfer.PrepareInfoV2 r1 = r4.prepareInfo
            if (r1 != 0) goto L38
        L34:
            r5.writeInt(r2)
            goto L48
        L38:
            r2 = 1
            r5.writeInt(r2)
            r1.writeToParcel(r5, r6)
            int r1 = viva.republica.toss.network.model.transfer.TransferInfoV2.onExtraCallback
            int r1 = r1 + 41
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.TransferInfoV2.onNavigationEvent = r2
            int r1 = r1 % r0
        L48:
            viva.republica.toss.network.model.transfer.DuplicatedTransferDisplayInfo r0 = r4.duplicatedTransferDisplayInfo
            r5.writeParcelable(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferInfoV2.writeToParcel(android.os.Parcel, int):void");
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferInfoV2> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            TransferInfoV2$.serializer serializerVar = TransferInfoV2$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 15;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ TransferInfoV2(int i, FeeInfo feeInfo, BrokerInfo brokerInfo, PrepareInfoV2 prepareInfoV2, DuplicatedTransferDisplayInfo duplicatedTransferDisplayInfo, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.feeInfo = null;
        } else {
            this.feeInfo = feeInfo;
            int i2 = 2 % 2;
        }
        if ((i & 2) == 0) {
            this.brokerInfo = null;
            int i3 = onExtraCallback + 71;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } else {
            this.brokerInfo = brokerInfo;
        }
        if ((i & 4) == 0) {
            int i6 = onNavigationEvent + 81;
            int i7 = i6 % 128;
            onExtraCallback = i7;
            int i8 = i6 % 2;
            this.prepareInfo = null;
            int i9 = i7 + 45;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 5 % 3;
            } else {
                int i11 = 2 % 2;
            }
        } else {
            this.prepareInfo = prepareInfoV2;
        }
        if ((i & 8) != 0) {
            this.duplicatedTransferDisplayInfo = duplicatedTransferDisplayInfo;
            int i12 = onExtraCallback + 51;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 73 / 0;
                return;
            }
            return;
        }
        int i14 = onExtraCallback + 7;
        int i15 = i14 % 128;
        onNavigationEvent = i15;
        int i16 = i14 % 2;
        this.duplicatedTransferDisplayInfo = null;
        int i17 = i15 + 87;
        onExtraCallback = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 85 / 0;
        }
    }

    public TransferInfoV2(@Nullable FeeInfo feeInfo, @Nullable BrokerInfo brokerInfo, @Nullable PrepareInfoV2 prepareInfoV2, @Nullable DuplicatedTransferDisplayInfo duplicatedTransferDisplayInfo) {
        this.feeInfo = feeInfo;
        this.brokerInfo = brokerInfo;
        this.prepareInfo = prepareInfoV2;
        this.duplicatedTransferDisplayInfo = duplicatedTransferDisplayInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.transfer.TransferInfoV2 r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            if (r2 != 0) goto Le
            viva.republica.toss.network.model.transfer.FeeInfo r2 = r4.feeInfo
            if (r2 == 0) goto L15
        Le:
            viva.republica.toss.network.model.transfer.FeeInfo$$serializer r2 = viva.republica.toss.network.model.transfer.FeeInfo$.serializer.INSTANCE
            viva.republica.toss.network.model.transfer.FeeInfo r3 = r4.feeInfo
            r5.onExtraCallbackWithResult(r6, r1, r2, r3)
        L15:
            r1 = 1
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            r2 = r2 ^ r1
            if (r2 == 0) goto L21
            viva.republica.toss.network.model.transfer.BrokerInfo r2 = r4.brokerInfo
            if (r2 == 0) goto L28
        L21:
            viva.republica.toss.network.model.transfer.BrokerInfo$$serializer r2 = viva.republica.toss.network.model.transfer.BrokerInfo$.serializer.INSTANCE
            viva.republica.toss.network.model.transfer.BrokerInfo r3 = r4.brokerInfo
            r5.onExtraCallbackWithResult(r6, r1, r2, r3)
        L28:
            boolean r1 = r5.onWarmupCompleted(r6, r0)
            if (r1 != 0) goto L32
            viva.republica.toss.network.model.transfer.PrepareInfoV2 r1 = r4.prepareInfo
            if (r1 == 0) goto L39
        L32:
            viva.republica.toss.network.model.transfer.PrepareInfoV2$$serializer r1 = viva.republica.toss.network.model.transfer.PrepareInfoV2$.serializer.INSTANCE
            viva.republica.toss.network.model.transfer.PrepareInfoV2 r2 = r4.prepareInfo
            r5.onExtraCallbackWithResult(r6, r0, r1, r2)
        L39:
            r1 = 3
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            if (r2 == 0) goto L41
            goto L4e
        L41:
            int r2 = viva.republica.toss.network.model.transfer.TransferInfoV2.onNavigationEvent
            int r2 = r2 + 55
            int r3 = r2 % 128
            viva.republica.toss.network.model.transfer.TransferInfoV2.onExtraCallback = r3
            int r2 = r2 % r0
            viva.republica.toss.network.model.transfer.DuplicatedTransferDisplayInfo r2 = r4.duplicatedTransferDisplayInfo
            if (r2 == 0) goto L5e
        L4e:
            viva.republica.toss.network.model.transfer.DuplicatedTransferDisplayInfo$$serializer r2 = viva.republica.toss.network.model.transfer.DuplicatedTransferDisplayInfo$.serializer.INSTANCE
            viva.republica.toss.network.model.transfer.DuplicatedTransferDisplayInfo r4 = r4.duplicatedTransferDisplayInfo
            r5.onExtraCallbackWithResult(r6, r1, r2, r4)
            int r4 = viva.republica.toss.network.model.transfer.TransferInfoV2.onExtraCallback
            int r4 = r4 + 49
            int r5 = r4 % 128
            viva.republica.toss.network.model.transfer.TransferInfoV2.onNavigationEvent = r5
            int r4 = r4 % r0
        L5e:
            int r4 = viva.republica.toss.network.model.transfer.TransferInfoV2.onNavigationEvent
            int r4 = r4 + 55
            int r5 = r4 % 128
            viva.republica.toss.network.model.transfer.TransferInfoV2.onExtraCallback = r5
            int r4 = r4 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferInfoV2.IAuthTabCallback(viva.republica.toss.network.model.transfer.TransferInfoV2, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TransferInfoV2(FeeInfo feeInfo, BrokerInfo brokerInfo, PrepareInfoV2 prepareInfoV2, DuplicatedTransferDisplayInfo duplicatedTransferDisplayInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 37;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            feeInfo = null;
        }
        if ((i & 2) != 0) {
            int i4 = onNavigationEvent + 41;
            int i5 = i4 % 128;
            onExtraCallback = i5;
            if (i4 % 2 == 0) {
                int i6 = 44 / 0;
            }
            int i7 = i5 + 115;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
            brokerInfo = null;
        }
        if ((i & 4) != 0) {
            int i9 = onExtraCallback + 21;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            prepareInfoV2 = null;
        }
        if ((i & 8) != 0) {
            int i12 = onNavigationEvent;
            int i13 = i12 + 89;
            onExtraCallback = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 97 / 0;
            }
            int i15 = i12 + 7;
            onExtraCallback = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 2 % 2;
            }
            duplicatedTransferDisplayInfo = null;
        }
        this(feeInfo, brokerInfo, prepareInfoV2, duplicatedTransferDisplayInfo);
    }

    public final FeeInfo onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 91;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        FeeInfo feeInfo = this.feeInfo;
        int i5 = i2 + 53;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return feeInfo;
    }

    public final BrokerInfo onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        BrokerInfo brokerInfo = this.brokerInfo;
        int i5 = i3 + 73;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return brokerInfo;
    }

    public final PrepareInfoV2 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.prepareInfo;
        }
        throw null;
    }

    public final DuplicatedTransferDisplayInfo onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        DuplicatedTransferDisplayInfo duplicatedTransferDisplayInfo = this.duplicatedTransferDisplayInfo;
        int i5 = i3 + 29;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
        return duplicatedTransferDisplayInfo;
    }
}
