package viva.republica.toss.network.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$;
import viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$OverseasTransferTabModel$;
import viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$PhoneTransferTabModel$;
import viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$ShareTransferTabModel$;
import viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$TossBankOverseasTransferTabModel$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DepositTargetTabListResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DepositTargetTabListResponse> CREATOR = new onNavigationEvent();
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final OverseasTransferTabModel overseas;
    private final PhoneTransferTabModel phone;
    private final ShareTransferTabModel share;
    private final TossBankOverseasTransferTabModel tossBankOverseas;

    public static final class onNavigationEvent implements Parcelable.Creator<DepositTargetTabListResponse> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final DepositTargetTabListResponse IAuthTabCallback(Parcel parcel) {
            OverseasTransferTabModel overseasTransferTabModelCreateFromParcel;
            TossBankOverseasTransferTabModel tossBankOverseasTransferTabModelCreateFromParcel;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            PhoneTransferTabModel phoneTransferTabModelCreateFromParcel = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 == 0) {
                parcel.readInt();
                throw null;
            }
            if (parcel.readInt() == 0) {
                int i4 = onExtraCallback + 25;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                overseasTransferTabModelCreateFromParcel = null;
            } else {
                overseasTransferTabModelCreateFromParcel = OverseasTransferTabModel.CREATOR.createFromParcel(parcel);
            }
            OverseasTransferTabModel overseasTransferTabModel = overseasTransferTabModelCreateFromParcel;
            ShareTransferTabModel shareTransferTabModelCreateFromParcel = parcel.readInt() == 0 ? null : ShareTransferTabModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                int i6 = onExtraCallback + 69;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
                tossBankOverseasTransferTabModelCreateFromParcel = null;
            } else {
                tossBankOverseasTransferTabModelCreateFromParcel = TossBankOverseasTransferTabModel.CREATOR.createFromParcel(parcel);
            }
            TossBankOverseasTransferTabModel tossBankOverseasTransferTabModel = tossBankOverseasTransferTabModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                int i7 = onExtraCallback + 117;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
            } else {
                phoneTransferTabModelCreateFromParcel = PhoneTransferTabModel.CREATOR.createFromParcel(parcel);
            }
            return new DepositTargetTabListResponse(overseasTransferTabModel, shareTransferTabModelCreateFromParcel, tossBankOverseasTransferTabModel, phoneTransferTabModelCreateFromParcel);
        }

        public final DepositTargetTabListResponse[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 29;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            DepositTargetTabListResponse[] depositTargetTabListResponseArr = new DepositTargetTabListResponse[i];
            int i6 = i4 + 43;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return depositTargetTabListResponseArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DepositTargetTabListResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 97;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            DepositTargetTabListResponse depositTargetTabListResponseIAuthTabCallback = IAuthTabCallback(parcel);
            if (i3 == 0) {
                int i4 = 6 / 0;
            }
            int i5 = onWarmupCompleted + 45;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 18 / 0;
            }
            return depositTargetTabListResponseIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DepositTargetTabListResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 39;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                IAuthTabCallback(i);
                throw null;
            }
            DepositTargetTabListResponse[] depositTargetTabListResponseArrIAuthTabCallback = IAuthTabCallback(i);
            int i4 = onExtraCallback + 125;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return depositTargetTabListResponseArrIAuthTabCallback;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onExtraCallback + 61;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public DepositTargetTabListResponse() {
        this((OverseasTransferTabModel) null, (ShareTransferTabModel) null, (TossBankOverseasTransferTabModel) null, (PhoneTransferTabModel) null, 15, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 13;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositTargetTabListResponse)) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 95;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 47;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            throw null;
        }
        DepositTargetTabListResponse depositTargetTabListResponse = (DepositTargetTabListResponse) obj;
        if (!Intrinsics.areEqual(this.overseas, depositTargetTabListResponse.overseas)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.share, depositTargetTabListResponse.share)) {
            int i6 = onWarmupCompleted + 107;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.tossBankOverseas, depositTargetTabListResponse.tossBankOverseas)) {
            return false;
        }
        if (Intrinsics.areEqual(this.phone, depositTargetTabListResponse.phone)) {
            return true;
        }
        int i8 = IAuthTabCallback + 65;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        OverseasTransferTabModel overseasTransferTabModel;
        int iHashCode;
        int i;
        int iHashCode2;
        int iHashCode3;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 51;
        onWarmupCompleted = i4 % 128;
        int iHashCode4 = 1;
        if (i4 % 2 != 0) {
            overseasTransferTabModel = this.overseas;
            if (overseasTransferTabModel == null) {
                i = 1;
                int i5 = i3 + 71;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 1;
                iHashCode2 = overseasTransferTabModel.hashCode();
            }
        } else {
            overseasTransferTabModel = this.overseas;
            if (overseasTransferTabModel == null) {
                i = 0;
                int i52 = i3 + 71;
                onWarmupCompleted = i52 % 128;
                int i62 = i52 % 2;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 0;
                iHashCode2 = overseasTransferTabModel.hashCode();
            }
        }
        ShareTransferTabModel shareTransferTabModel = this.share;
        if (shareTransferTabModel == null) {
            int i7 = IAuthTabCallback + 27;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = shareTransferTabModel.hashCode();
        }
        TossBankOverseasTransferTabModel tossBankOverseasTransferTabModel = this.tossBankOverseas;
        if (tossBankOverseasTransferTabModel == null) {
            int i9 = IAuthTabCallback + 65;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 == 0) {
                iHashCode4 = 0;
            }
        } else {
            iHashCode4 = tossBankOverseasTransferTabModel.hashCode();
            int i10 = IAuthTabCallback + 29;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
        }
        PhoneTransferTabModel phoneTransferTabModel = this.phone;
        if (phoneTransferTabModel != null) {
            iHashCode = phoneTransferTabModel.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DepositTargetTabListResponse(overseas=" + this.overseas + ", share=" + this.share + ", tossBankOverseas=" + this.tossBankOverseas + ", phone=" + this.phone + ")";
        int i2 = IAuthTabCallback + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 49;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        OverseasTransferTabModel overseasTransferTabModel = this.overseas;
        if (overseasTransferTabModel == null) {
            parcel.writeInt(0);
            int i5 = IAuthTabCallback + 17;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        } else {
            parcel.writeInt(1);
            overseasTransferTabModel.writeToParcel(parcel, i);
        }
        ShareTransferTabModel shareTransferTabModel = this.share;
        if (shareTransferTabModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shareTransferTabModel.writeToParcel(parcel, i);
        }
        TossBankOverseasTransferTabModel tossBankOverseasTransferTabModel = this.tossBankOverseas;
        if (tossBankOverseasTransferTabModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tossBankOverseasTransferTabModel.writeToParcel(parcel, i);
            int i7 = onWarmupCompleted + 19;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        PhoneTransferTabModel phoneTransferTabModel = this.phone;
        if (phoneTransferTabModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            phoneTransferTabModel.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DepositTargetTabListResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            DepositTargetTabListResponse$.serializer serializerVar = DepositTargetTabListResponse$.serializer.INSTANCE;
            if (i3 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ DepositTargetTabListResponse(int i, OverseasTransferTabModel overseasTransferTabModel, ShareTransferTabModel shareTransferTabModel, TossBankOverseasTransferTabModel tossBankOverseasTransferTabModel, PhoneTransferTabModel phoneTransferTabModel, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.overseas = null;
        } else {
            this.overseas = overseasTransferTabModel;
        }
        if ((i & 2) == 0) {
            this.share = null;
        } else {
            this.share = shareTransferTabModel;
            int i2 = 2 % 2;
        }
        if ((i & 4) == 0) {
            this.tossBankOverseas = null;
            int i3 = 2 % 2;
        } else {
            this.tossBankOverseas = tossBankOverseasTransferTabModel;
        }
        if ((i & 8) != 0) {
            this.phone = phoneTransferTabModel;
            int i4 = IAuthTabCallback + 13;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        int i6 = onWarmupCompleted + 85;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        this.phone = null;
        if (i7 == 0) {
            int i8 = 48 / 0;
        }
    }

    public DepositTargetTabListResponse(@Nullable OverseasTransferTabModel overseasTransferTabModel, @Nullable ShareTransferTabModel shareTransferTabModel, @Nullable TossBankOverseasTransferTabModel tossBankOverseasTransferTabModel, @Nullable PhoneTransferTabModel phoneTransferTabModel) {
        this.overseas = overseasTransferTabModel;
        this.share = shareTransferTabModel;
        this.tossBankOverseas = tossBankOverseasTransferTabModel;
        this.phone = phoneTransferTabModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.DepositTargetTabListResponse r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            if (r2 != 0) goto Le
            viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$OverseasTransferTabModel r2 = r5.overseas
            if (r2 == 0) goto L15
        Le:
            viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$OverseasTransferTabModel$$serializer r2 = viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$OverseasTransferTabModel$.serializer.INSTANCE
            viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$OverseasTransferTabModel r3 = r5.overseas
            r6.onExtraCallbackWithResult(r7, r1, r2, r3)
        L15:
            r2 = 1
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L30
            int r3 = viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.onWarmupCompleted
            int r3 = r3 + 39
            int r4 = r3 % 128
            viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.IAuthTabCallback = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L2c
            viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$ShareTransferTabModel r3 = r5.share
            if (r3 == 0) goto L37
            goto L30
        L2c:
            viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$ShareTransferTabModel r5 = r5.share
            r5 = 0
            throw r5
        L30:
            viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$ShareTransferTabModel$$serializer r3 = viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$ShareTransferTabModel$.serializer.INSTANCE
            viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$ShareTransferTabModel r4 = r5.share
            r6.onExtraCallbackWithResult(r7, r2, r3, r4)
        L37:
            boolean r3 = r6.onWarmupCompleted(r7, r0)
            r2 = r2 ^ r3
            if (r2 == 0) goto L55
            int r2 = viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.onWarmupCompleted
            int r2 = r2 + 103
            int r3 = r2 % 128
            viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.IAuthTabCallback = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L51
            viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$TossBankOverseasTransferTabModel r2 = r5.tossBankOverseas
            r3 = 56
            int r3 = r3 / r1
            if (r2 == 0) goto L5c
            goto L55
        L51:
            viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$TossBankOverseasTransferTabModel r1 = r5.tossBankOverseas
            if (r1 == 0) goto L5c
        L55:
            viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$TossBankOverseasTransferTabModel$$serializer r1 = viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$TossBankOverseasTransferTabModel$.serializer.INSTANCE
            viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$TossBankOverseasTransferTabModel r2 = r5.tossBankOverseas
            r6.onExtraCallbackWithResult(r7, r0, r1, r2)
        L5c:
            r1 = 3
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            if (r2 != 0) goto L70
            int r2 = viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.onWarmupCompleted
            int r2 = r2 + 25
            int r3 = r2 % 128
            viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.IAuthTabCallback = r3
            int r2 = r2 % r0
            viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$PhoneTransferTabModel r0 = r5.phone
            if (r0 == 0) goto L77
        L70:
            viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$PhoneTransferTabModel$$serializer r0 = viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$PhoneTransferTabModel$.serializer.INSTANCE
            viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$PhoneTransferTabModel r5 = r5.phone
            r6.onExtraCallbackWithResult(r7, r1, r0, r5)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.DepositTargetTabListResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DepositTargetTabListResponse(OverseasTransferTabModel overseasTransferTabModel, ShareTransferTabModel shareTransferTabModel, TossBankOverseasTransferTabModel tossBankOverseasTransferTabModel, PhoneTransferTabModel phoneTransferTabModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        overseasTransferTabModel = (i & 1) != 0 ? null : overseasTransferTabModel;
        if ((i & 2) != 0) {
            int i2 = onWarmupCompleted + 99;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            shareTransferTabModel = null;
        }
        if ((i & 4) != 0) {
            int i4 = IAuthTabCallback + 125;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            tossBankOverseasTransferTabModel = null;
        }
        if ((i & 8) != 0) {
            int i7 = 2 % 2;
            phoneTransferTabModel = null;
        }
        this(overseasTransferTabModel, shareTransferTabModel, tossBankOverseasTransferTabModel, phoneTransferTabModel);
    }

    public final OverseasTransferTabModel onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        OverseasTransferTabModel overseasTransferTabModel = this.overseas;
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        return overseasTransferTabModel;
    }

    public final ShareTransferTabModel IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        ShareTransferTabModel shareTransferTabModel = this.share;
        int i5 = i3 + 77;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return shareTransferTabModel;
        }
        throw null;
    }

    public final TossBankOverseasTransferTabModel onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        TossBankOverseasTransferTabModel tossBankOverseasTransferTabModel = this.tossBankOverseas;
        int i5 = i3 + 83;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return tossBankOverseasTransferTabModel;
    }

    public final PhoneTransferTabModel onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 71;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        PhoneTransferTabModel phoneTransferTabModel = this.phone;
        int i4 = i2 + 35;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return phoneTransferTabModel;
        }
        obj.hashCode();
        throw null;
    }

    @liq
    public static final class OverseasTransferTabModel implements Parcelable {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final boolean canUseOverseasTransfer;
        private final String overseasTransferSendScheme;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<OverseasTransferTabModel> CREATOR = new onWarmupCompleted();

        public static final class onWarmupCompleted implements Parcelable.Creator<OverseasTransferTabModel> {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ OverseasTransferTabModel createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 45;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return onWarmupCompleted(parcel);
                }
                onWarmupCompleted(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ OverseasTransferTabModel[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 115;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return onNavigationEvent(i);
                }
                onNavigationEvent(i);
                throw null;
            }

            public final OverseasTransferTabModel[] onNavigationEvent(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 19;
                IAuthTabCallback = i3 % 128;
                OverseasTransferTabModel[] overseasTransferTabModelArr = new OverseasTransferTabModel[i];
                if (i3 % 2 == 0) {
                    return overseasTransferTabModelArr;
                }
                throw null;
            }

            public final OverseasTransferTabModel onWarmupCompleted(Parcel parcel) {
                boolean z;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 49;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                if (i3 == 0) {
                    parcel.readInt();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    int i4 = onWarmupCompleted + 121;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    z = false;
                }
                return new OverseasTransferTabModel(z, parcel.readString());
            }
        }

        static {
            int i = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public OverseasTransferTabModel() {
            String str = null;
            this(false, str, 3, (DefaultConstructorMarker) str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 115;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 79;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof OverseasTransferTabModel)) {
                return false;
            }
            OverseasTransferTabModel overseasTransferTabModel = (OverseasTransferTabModel) obj;
            if (this.canUseOverseasTransfer == overseasTransferTabModel.canUseOverseasTransfer) {
                return Intrinsics.areEqual(this.overseasTransferSendScheme, overseasTransferTabModel.overseasTransferSendScheme);
            }
            int i4 = IAuthTabCallback + 53;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = Boolean.hashCode(this.canUseOverseasTransfer);
            String str = this.overseasTransferSendScheme;
            if (str == null) {
                int i2 = onNavigationEvent;
                int i3 = i2 + 5;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 101;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            int i7 = (iHashCode2 * 31) + iHashCode;
            int i8 = IAuthTabCallback + 109;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                return i7;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OverseasTransferTabModel(canUseOverseasTransfer=" + this.canUseOverseasTransfer + ", overseasTransferSendScheme=" + this.overseasTransferSendScheme + ")";
            int i2 = IAuthTabCallback + 53;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 47;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.canUseOverseasTransfer ? 1 : 0);
            parcel.writeString(this.overseasTransferSendScheme);
            int i5 = onNavigationEvent + 7;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OverseasTransferTabModel> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 49;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                DepositTargetTabListResponse$OverseasTransferTabModel$.serializer serializerVar = DepositTargetTabListResponse$OverseasTransferTabModel$.serializer.INSTANCE;
                int i4 = onWarmupCompleted + 101;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return serializerVar;
            }
        }

        public /* synthetic */ OverseasTransferTabModel(int i, boolean z, String str, okycx okycxVar) {
            if ((i & 1) == 0) {
                int i2 = 2 % 2;
                z = false;
            }
            this.canUseOverseasTransfer = z;
            if ((i & 2) != 0) {
                this.overseasTransferSendScheme = str;
                int i3 = onNavigationEvent + 97;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int i4 = IAuthTabCallback + 59;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            this.overseasTransferSendScheme = null;
            if (i5 == 0) {
                throw null;
            }
        }

        public OverseasTransferTabModel(boolean z, @Nullable String str) {
            this.canUseOverseasTransfer = z;
            this.overseasTransferSendScheme = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.OverseasTransferTabModel r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.OverseasTransferTabModel.IAuthTabCallback
                int r1 = r1 + 81
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.OverseasTransferTabModel.onNavigationEvent = r2
                int r1 = r1 % r0
                r1 = 0
                boolean r2 = r7.onWarmupCompleted(r8, r1)
                r3 = 0
                r4 = 1
                if (r2 != 0) goto L2b
                int r2 = viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.OverseasTransferTabModel.IAuthTabCallback
                int r2 = r2 + 35
                int r5 = r2 % 128
                viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.OverseasTransferTabModel.onNavigationEvent = r5
                int r2 = r2 % r0
                if (r2 == 0) goto L25
                boolean r2 = r6.canUseOverseasTransfer
                if (r2 == r4) goto L2b
                goto L30
            L25:
                boolean r6 = r6.canUseOverseasTransfer
                r3.hashCode()
                throw r3
            L2b:
                boolean r2 = r6.canUseOverseasTransfer
                r7.onNavigationEvent(r8, r1, r2)
            L30:
                boolean r1 = r7.onWarmupCompleted(r8, r4)
                if (r1 != 0) goto L49
                int r1 = viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.OverseasTransferTabModel.IAuthTabCallback
                int r1 = r1 + 49
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.OverseasTransferTabModel.onNavigationEvent = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L46
                java.lang.String r0 = r6.overseasTransferSendScheme
                if (r0 == 0) goto L50
                goto L49
            L46:
                java.lang.String r6 = r6.overseasTransferSendScheme
                throw r3
            L49:
                o.getWriggleLayout r0 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r6 = r6.overseasTransferSendScheme
                r7.onExtraCallbackWithResult(r8, r4, r0, r6)
            L50:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.OverseasTransferTabModel.onExtraCallback(viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$OverseasTransferTabModel, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ OverseasTransferTabModel(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback;
                int i3 = i2 + 49;
                onNavigationEvent = i3 % 128;
                boolean z2 = i3 % 2 == 0;
                int i4 = i2 + 75;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                z = z2;
            }
            this(z, (i & 2) != 0 ? null : str);
        }

        public final boolean onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 65;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.canUseOverseasTransfer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 61;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.overseasTransferSendScheme;
            int i5 = i2 + 97;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 40 / 0;
            }
            return str;
        }
    }

    @liq
    public static final class ShareTransferTabModel implements Parcelable {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private final boolean canUseShareTransfer;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<ShareTransferTabModel> CREATOR = new onExtraCallback();

        public static final class onExtraCallback implements Parcelable.Creator<ShareTransferTabModel> {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ShareTransferTabModel createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 109;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return onWarmupCompleted(parcel);
                }
                onWarmupCompleted(parcel);
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ShareTransferTabModel[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 75;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                ShareTransferTabModel[] shareTransferTabModelArrOnExtraCallback = onExtraCallback(i);
                int i5 = onNavigationEvent + 113;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return shareTransferTabModelArrOnExtraCallback;
            }

            public final ShareTransferTabModel[] onExtraCallback(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 3;
                onNavigationEvent = i3 % 128;
                ShareTransferTabModel[] shareTransferTabModelArr = new ShareTransferTabModel[i];
                if (i3 % 2 != 0) {
                    return shareTransferTabModelArr;
                }
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.ShareTransferTabModel onWarmupCompleted(android.os.Parcel r5) {
                /*
                    r4 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.ShareTransferTabModel.onExtraCallback.IAuthTabCallback
                    int r1 = r1 + 13
                    int r2 = r1 % 128
                    viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.ShareTransferTabModel.onExtraCallback.onNavigationEvent = r2
                    int r1 = r1 % r0
                    r2 = 0
                    java.lang.String r3 = ""
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
                    int r5 = r5.readInt()
                    if (r1 != 0) goto L1e
                    r1 = 80
                    int r1 = r1 / r2
                    if (r5 == 0) goto L2a
                    goto L20
                L1e:
                    if (r5 == 0) goto L2a
                L20:
                    int r5 = viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.ShareTransferTabModel.onExtraCallback.onNavigationEvent
                    int r5 = r5 + 87
                    int r1 = r5 % 128
                    viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.ShareTransferTabModel.onExtraCallback.IAuthTabCallback = r1
                    int r5 = r5 % r0
                    r2 = 1
                L2a:
                    viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$ShareTransferTabModel r5 = new viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$ShareTransferTabModel
                    r5.<init>(r2)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.ShareTransferTabModel.onExtraCallback.onWarmupCompleted(android.os.Parcel):viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$ShareTransferTabModel");
            }
        }

        static {
            int i = onExtraCallback + 67;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public ShareTransferTabModel() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 45;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 123;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 87 / 0;
            }
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShareTransferTabModel)) {
                int i2 = onExtraCallbackWithResult + 83;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (this.canUseShareTransfer != ((ShareTransferTabModel) obj).canUseShareTransfer) {
                return false;
            }
            int i4 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            boolean z = this.canUseShareTransfer;
            if (i3 != 0) {
                return Boolean.hashCode(z);
            }
            Boolean.hashCode(z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ShareTransferTabModel(canUseShareTransfer=" + this.canUseShareTransfer + ")";
            int i2 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i4 == 0) {
                parcel.writeInt(this.canUseShareTransfer ? 1 : 0);
                int i5 = 30 / 0;
            } else {
                parcel.writeInt(this.canUseShareTransfer ? 1 : 0);
            }
            int i6 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ShareTransferTabModel> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 111;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    DepositTargetTabListResponse$ShareTransferTabModel$.serializer serializerVar = DepositTargetTabListResponse$ShareTransferTabModel$.serializer.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                DepositTargetTabListResponse$ShareTransferTabModel$.serializer serializerVar2 = DepositTargetTabListResponse$ShareTransferTabModel$.serializer.INSTANCE;
                int i3 = onExtraCallbackWithResult + 45;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return serializerVar2;
            }
        }

        public /* synthetic */ ShareTransferTabModel(int i, boolean z, okycx okycxVar) {
            if ((i & 1) != 0) {
                this.canUseShareTransfer = z;
                int i2 = IAuthTabCallback + 125;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            this.canUseShareTransfer = false;
            int i4 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public ShareTransferTabModel(boolean z) {
            this.canUseShareTransfer = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.ShareTransferTabModel r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
            /*
                r0 = 2
                int r1 = r0 % r0
                r1 = 0
                boolean r2 = r5.onWarmupCompleted(r6, r1)
                if (r2 != 0) goto L24
                int r2 = viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.ShareTransferTabModel.IAuthTabCallback
                int r2 = r2 + 37
                int r3 = r2 % 128
                viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.ShareTransferTabModel.onExtraCallbackWithResult = r3
                int r2 = r2 % r0
                if (r2 != 0) goto L1d
                boolean r2 = r4.canUseShareTransfer
                r3 = 37
                int r3 = r3 / r1
                if (r2 == 0) goto L29
                goto L24
            L1d:
                boolean r2 = r4.canUseShareTransfer
                r2 = r2 ^ 1
                if (r2 == 0) goto L24
                goto L29
            L24:
                boolean r4 = r4.canUseShareTransfer
                r5.onNavigationEvent(r6, r1, r4)
            L29:
                int r4 = viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.ShareTransferTabModel.IAuthTabCallback
                int r4 = r4 + 43
                int r5 = r4 % 128
                viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.ShareTransferTabModel.onExtraCallbackWithResult = r5
                int r4 = r4 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.ShareTransferTabModel.onWarmupCompleted(viva.republica.toss.network.model.transfer.DepositTargetTabListResponse$ShareTransferTabModel, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ShareTransferTabModel(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onExtraCallbackWithResult + 63;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 75;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                z = false;
            }
            this(z);
        }

        public final boolean onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 79;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.canUseShareTransfer;
            int i5 = i2 + 23;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }
    }

    @liq
    public static final class TossBankOverseasTransferTabModel implements Parcelable {
        public static final int $stable = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final boolean canUseTossBankOverseasTransfer;
        private final String tossBankOverseasTransferUrl;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<TossBankOverseasTransferTabModel> CREATOR = new onWarmupCompleted();

        public static final class onWarmupCompleted implements Parcelable.Creator<TossBankOverseasTransferTabModel> {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ TossBankOverseasTransferTabModel createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 37;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return onExtraCallback(parcel);
                }
                onExtraCallback(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ TossBankOverseasTransferTabModel[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 59;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return onNavigationEvent(i);
                }
                onNavigationEvent(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final TossBankOverseasTransferTabModel onExtraCallback(Parcel parcel) {
                boolean z;
                int i = 2 % 2;
                int i2 = onExtraCallback + 47;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    int i4 = IAuthTabCallback + 59;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    z = false;
                }
                return new TossBankOverseasTransferTabModel(z, parcel.readString());
            }

            public final TossBankOverseasTransferTabModel[] onNavigationEvent(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 55;
                int i4 = i3 % 128;
                onExtraCallback = i4;
                int i5 = i3 % 2;
                TossBankOverseasTransferTabModel[] tossBankOverseasTransferTabModelArr = new TossBankOverseasTransferTabModel[i];
                int i6 = i4 + 37;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return tossBankOverseasTransferTabModelArr;
            }
        }

        static {
            int i = onWarmupCompleted + 17;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                int i2 = 16 / 0;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TossBankOverseasTransferTabModel() {
            String str = null;
            this(false, str, 3, (DefaultConstructorMarker) str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 59;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 45;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 75;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof TossBankOverseasTransferTabModel)) {
                return false;
            }
            TossBankOverseasTransferTabModel tossBankOverseasTransferTabModel = (TossBankOverseasTransferTabModel) obj;
            if (this.canUseTossBankOverseasTransfer != tossBankOverseasTransferTabModel.canUseTossBankOverseasTransfer) {
                int i4 = onExtraCallbackWithResult + 65;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.tossBankOverseasTransferUrl, tossBankOverseasTransferTabModel.tossBankOverseasTransferUrl)) {
                return true;
            }
            int i6 = onExtraCallback + 19;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[PHI: r1 r3
          0x0031: PHI (r1v10 int) = (r1v5 int), (r1v12 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
          0x0031: PHI (r3v4 java.lang.String) = (r3v0 java.lang.String), (r3v5 java.lang.String) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1
          0x0027: PHI (r1v6 int) = (r1v5 int), (r1v12 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int hashCode() {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.TossBankOverseasTransferTabModel.onExtraCallback
                int r1 = r1 + 75
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.TossBankOverseasTransferTabModel.onExtraCallbackWithResult = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 == 0) goto L1d
                boolean r1 = r5.canUseTossBankOverseasTransfer
                int r1 = java.lang.Boolean.hashCode(r1)
                java.lang.String r3 = r5.tossBankOverseasTransferUrl
                r4 = 98
                int r4 = r4 / r2
                if (r3 != 0) goto L31
                goto L27
            L1d:
                boolean r1 = r5.canUseTossBankOverseasTransfer
                int r1 = java.lang.Boolean.hashCode(r1)
                java.lang.String r3 = r5.tossBankOverseasTransferUrl
                if (r3 != 0) goto L31
            L27:
                int r3 = viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.TossBankOverseasTransferTabModel.onExtraCallbackWithResult
                int r3 = r3 + 119
                int r4 = r3 % 128
                viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.TossBankOverseasTransferTabModel.onExtraCallback = r4
                int r3 = r3 % r0
                goto L35
            L31:
                int r2 = r3.hashCode()
            L35:
                int r1 = r1 * 31
                int r1 = r1 + r2
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.DepositTargetTabListResponse.TossBankOverseasTransferTabModel.hashCode():int");
        }

        public String toString() {
            int i = 2 % 2;
            String str = "TossBankOverseasTransferTabModel(canUseTossBankOverseasTransfer=" + this.canUseTossBankOverseasTransfer + ", tossBankOverseasTransferUrl=" + this.tossBankOverseasTransferUrl + ")";
            int i2 = onExtraCallback + 25;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 75;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.canUseTossBankOverseasTransfer ? 1 : 0);
            parcel.writeString(this.tossBankOverseasTransferUrl);
            int i5 = onExtraCallback + 63;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TossBankOverseasTransferTabModel> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 89;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                DepositTargetTabListResponse$TossBankOverseasTransferTabModel$.serializer serializerVar = DepositTargetTabListResponse$TossBankOverseasTransferTabModel$.serializer.INSTANCE;
                if (i3 == 0) {
                    return serializerVar;
                }
                throw null;
            }
        }

        public /* synthetic */ TossBankOverseasTransferTabModel(int i, boolean z, String str, okycx okycxVar) {
            this.canUseTossBankOverseasTransfer = (i & 1) == 0 ? false : z;
            if ((i & 2) != 0) {
                this.tossBankOverseasTransferUrl = str;
                return;
            }
            int i2 = onExtraCallback + 125;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            this.tossBankOverseasTransferUrl = null;
            if (i4 != 0) {
                int i5 = 6 / 0;
            }
            int i6 = i3 + 53;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 74 / 0;
            }
        }

        public TossBankOverseasTransferTabModel(boolean z, @Nullable String str) {
            this.canUseTossBankOverseasTransfer = z;
            this.tossBankOverseasTransferUrl = str;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallback(TossBankOverseasTransferTabModel tossBankOverseasTransferTabModel, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || tossBankOverseasTransferTabModel.canUseTossBankOverseasTransfer) {
                vylVar.onNavigationEvent(serialDescriptor, 0, tossBankOverseasTransferTabModel.canUseTossBankOverseasTransfer);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i2 = onExtraCallback + 19;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                if (tossBankOverseasTransferTabModel.tossBankOverseasTransferUrl == null) {
                    return;
                }
            }
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, tossBankOverseasTransferTabModel.tossBankOverseasTransferUrl);
            int i4 = onExtraCallback + 45;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ TossBankOverseasTransferTabModel(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = 2 % 2;
                z = false;
            }
            if ((i & 2) != 0) {
                int i3 = onExtraCallback + 81;
                int i4 = i3 % 128;
                onExtraCallbackWithResult = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 25;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
                str = null;
            }
            this(z, str);
        }

        public final boolean onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            boolean z = this.canUseTossBankOverseasTransfer;
            int i5 = i3 + 41;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 89 / 0;
            }
            return z;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.tossBankOverseasTransferUrl;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @liq
    public static final class PhoneTransferTabModel implements Parcelable {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final boolean canUsePhoneTransfer;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<PhoneTransferTabModel> CREATOR = new IAuthTabCallback();

        public static final class IAuthTabCallback implements Parcelable.Creator<PhoneTransferTabModel> {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ PhoneTransferTabModel createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 45;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                PhoneTransferTabModel phoneTransferTabModelOnNavigationEvent = onNavigationEvent(parcel);
                int i4 = onNavigationEvent + 15;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return phoneTransferTabModelOnNavigationEvent;
                }
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ PhoneTransferTabModel[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 109;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    onExtraCallback(i);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                PhoneTransferTabModel[] phoneTransferTabModelArrOnExtraCallback = onExtraCallback(i);
                int i4 = onNavigationEvent + 123;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 52 / 0;
                }
                return phoneTransferTabModelArrOnExtraCallback;
            }

            public final PhoneTransferTabModel[] onExtraCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult;
                int i4 = i3 + 81;
                onNavigationEvent = i4 % 128;
                PhoneTransferTabModel[] phoneTransferTabModelArr = new PhoneTransferTabModel[i];
                if (i4 % 2 != 0) {
                    int i5 = 86 / 0;
                }
                int i6 = i3 + 29;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    return phoneTransferTabModelArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final PhoneTransferTabModel onNavigationEvent(Parcel parcel) {
                boolean z;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 63;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                if (i3 == 0) {
                    parcel.readInt();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (parcel.readInt() != 0) {
                    int i4 = onNavigationEvent + 103;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    z = true;
                } else {
                    z = false;
                }
                return new PhoneTransferTabModel(z);
            }
        }

        static {
            int i = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public PhoneTransferTabModel() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 25;
                onWarmupCompleted = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!(obj instanceof PhoneTransferTabModel)) {
                int i3 = onWarmupCompleted + 97;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (this.canUsePhoneTransfer == ((PhoneTransferTabModel) obj).canUsePhoneTransfer) {
                return true;
            }
            int i5 = onWarmupCompleted + 7;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Boolean.hashCode(this.canUsePhoneTransfer);
            if (i3 == 0) {
                int i4 = 11 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "PhoneTransferTabModel(canUsePhoneTransfer=" + this.canUsePhoneTransfer + ")";
            int i2 = onNavigationEvent + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 49;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.canUsePhoneTransfer ? 1 : 0);
            int i5 = onWarmupCompleted + 87;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 47 / 0;
            }
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PhoneTransferTabModel> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 111;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                DepositTargetTabListResponse$PhoneTransferTabModel$.serializer serializerVar = DepositTargetTabListResponse$PhoneTransferTabModel$.serializer.INSTANCE;
                if (i3 != 0) {
                    return serializerVar;
                }
                throw null;
            }
        }

        public /* synthetic */ PhoneTransferTabModel(int i, boolean z, okycx okycxVar) {
            if ((i & 1) != 0) {
                this.canUsePhoneTransfer = z;
                int i2 = onWarmupCompleted + 89;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            this.canUsePhoneTransfer = false;
            int i4 = onNavigationEvent + 41;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 54 / 0;
            }
        }

        public PhoneTransferTabModel(boolean z) {
            this.canUsePhoneTransfer = z;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallbackWithResult(PhoneTransferTabModel phoneTransferTabModel, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i2 = onNavigationEvent + 49;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                if (!phoneTransferTabModel.canUsePhoneTransfer) {
                    return;
                }
            }
            vylVar.onNavigationEvent(serialDescriptor, 0, phoneTransferTabModel.canUsePhoneTransfer);
            int i4 = onWarmupCompleted + 75;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ PhoneTransferTabModel(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onWarmupCompleted + 71;
                onNavigationEvent = i2 % 128;
                z = i2 % 2 != 0;
                int i3 = 2 % 2;
            }
            this(z);
        }

        public final boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean z = this.canUsePhoneTransfer;
            int i4 = i3 + 29;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }
    }
}
