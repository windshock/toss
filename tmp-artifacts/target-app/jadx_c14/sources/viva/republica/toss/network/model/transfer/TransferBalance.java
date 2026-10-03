package viva.republica.toss.network.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferBalance implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final long balance;
    private TransferBalanceStatus balanceStatus;
    private final boolean shouldRefresh;
    private final String sourceType;
    private long withdrawableAmount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TransferBalance> CREATOR = new onNavigationEvent();
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferBalance$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallback = TransferBalance.onExtraCallback();
            int i4 = onNavigationEvent + 7;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallback;
        }
    })};

    public static final class onNavigationEvent implements Parcelable.Creator<TransferBalance> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ TransferBalance createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            TransferBalance transferBalanceOnNavigationEvent = onNavigationEvent(parcel);
            int i4 = onWarmupCompleted + 103;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return transferBalanceOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ TransferBalance[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 71;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            TransferBalance[] transferBalanceArrOnExtraCallback = onExtraCallback(i);
            if (i4 != 0) {
                int i5 = 72 / 0;
            }
            return transferBalanceArrOnExtraCallback;
        }

        public final TransferBalance[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 77;
            onExtraCallback = i4 % 128;
            TransferBalance[] transferBalanceArr = new TransferBalance[i];
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = i3 + 73;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return transferBalanceArr;
        }

        public final TransferBalance onNavigationEvent(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 == 0) {
                parcel.readLong();
                parcel.readLong();
                parcel.readInt();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                int i4 = onWarmupCompleted + 15;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            }
            return new TransferBalance(j, j2, z, parcel.readString(), TransferBalanceStatus.CREATOR.createFromParcel(parcel));
        }
    }

    public TransferBalance() {
        this(0L, 0L, false, (String) null, (TransferBalanceStatus) null, 31, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<TransferBalanceStatus> kSerializerSerializer = TransferBalanceStatus.Companion.serializer();
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        return kSerializerSerializer;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsBinder = asBinder();
        int i4 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return kSerializerAsBinder;
    }

    public static /* synthetic */ TransferBalance onExtraCallbackWithResult(TransferBalance transferBalance, long j, long j2, boolean z, String str, TransferBalanceStatus transferBalanceStatus, int i, Object obj) {
        long j3;
        long j4;
        String str2;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 71;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            j3 = transferBalance.balance;
            int i6 = i3 + 95;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        } else {
            j3 = j;
        }
        if ((i & 2) != 0) {
            int i8 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            j4 = transferBalance.withdrawableAmount;
        } else {
            j4 = j2;
        }
        boolean z2 = (i & 4) != 0 ? transferBalance.shouldRefresh : z;
        if ((i & 8) != 0) {
            int i10 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            str2 = transferBalance.sourceType;
        } else {
            str2 = str;
        }
        return transferBalance.onWarmupCompleted(j3, j4, z2, str2, (i & 16) != 0 ? transferBalance.balanceStatus : transferBalanceStatus);
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i3);
        int i9 = (~(i7 | i6)) | i8;
        int i10 = ~i3;
        int i11 = ~(i10 | i5);
        int i12 = i8 | i11 | (~(i10 | i6));
        int i13 = (~((~i6) | i10)) | i8 | i11;
        int i14 = i5 + i3 + i4 + ((-369695973) * i2) + (1794320298 * i);
        int i15 = i14 * i14;
        int i16 = ((-1820121865) * i5) + 1478230016 + (776760710 * i3) + ((-1698084721) * i9) + ((-1731255050) * i12) + (865627525 * i13) + ((-88866816) * i4) + (217841664 * i2) + ((-410517504) * i) + ((-175177728) * i15);
        int i17 = ((i5 * 1872133577) - 2052485254) + (i3 * 1872135674) + (i9 * 2097) + (i12 * (-1398)) + (i13 * 699) + (i4 * 1872134975) + (i2 * (-1328892763)) + (i * (-1296121642)) + (i15 * (-1691287552));
        int i18 = i16 + (i17 * i17 * (-1729036288));
        return i18 != 1 ? i18 != 2 ? onExtraCallback(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 117;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public final TransferBalance onWarmupCompleted(long j, long j2, boolean z, @NotNull String str, @NotNull TransferBalanceStatus transferBalanceStatus) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transferBalanceStatus, "");
        TransferBalance transferBalance = new TransferBalance(j, j2, z, str, transferBalanceStatus);
        int i2 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 16 / 0;
        }
        return transferBalance;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferBalance(balance=" + this.balance + ", withdrawableAmount=" + this.withdrawableAmount + ", shouldRefresh=" + this.shouldRefresh + ", sourceType=" + this.sourceType + ", balanceStatus=" + this.balanceStatus + ")";
        int i2 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 == 0) {
            parcel.writeLong(this.balance);
            parcel.writeLong(this.withdrawableAmount);
            parcel.writeInt(this.shouldRefresh ? 1 : 0);
            parcel.writeString(this.sourceType);
            this.balanceStatus.writeToParcel(parcel, i);
            int i5 = 93 / 0;
        } else {
            parcel.writeLong(this.balance);
            parcel.writeLong(this.withdrawableAmount);
            parcel.writeInt(this.shouldRefresh ? 1 : 0);
            parcel.writeString(this.sourceType);
            this.balanceStatus.writeToParcel(parcel, i);
        }
        int i6 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferBalance> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                TransferBalance$$serializer transferBalance$$serializer = TransferBalance$$serializer.INSTANCE;
                throw null;
            }
            TransferBalance$$serializer transferBalance$$serializer2 = TransferBalance$$serializer.INSTANCE;
            int i3 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return transferBalance$$serializer2;
            }
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 123;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ TransferBalance(int i, long j, long j2, boolean z, String str, TransferBalanceStatus transferBalanceStatus, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.balance = -1L;
            int i2 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            this.balance = j;
        }
        if ((i & 2) == 0) {
            this.withdrawableAmount = -1L;
            int i5 = 2 % 2;
        } else {
            this.withdrawableAmount = j2;
        }
        if ((i & 4) == 0) {
            int i6 = onNavigationEvent + 9;
            onExtraCallbackWithResult = i6 % 128;
            this.shouldRefresh = i6 % 2 != 0;
        } else {
            this.shouldRefresh = z;
            int i7 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
        }
        if ((i & 8) == 0) {
            int i9 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            this.sourceType = "";
        } else {
            this.sourceType = str;
        }
        if ((i & 16) == 0) {
            this.balanceStatus = TransferBalanceStatus.INVALID;
        } else {
            this.balanceStatus = transferBalanceStatus;
        }
    }

    public TransferBalance(long j, long j2, boolean z, @NotNull String str, @NotNull TransferBalanceStatus transferBalanceStatus) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transferBalanceStatus, "");
        this.balance = j;
        this.withdrawableAmount = j2;
        this.shouldRefresh = z;
        this.sourceType = str;
        this.balanceStatus = transferBalanceStatus;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.transfer.TransferBalance r8, o.vyl r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.TransferBalance.$childSerializers
            r2 = 0
            boolean r3 = r9.onWarmupCompleted(r10, r2)
            r4 = -1
            if (r3 != 0) goto L24
            int r3 = viva.republica.toss.network.model.transfer.TransferBalance.onExtraCallbackWithResult
            int r3 = r3 + 103
            int r6 = r3 % 128
            viva.republica.toss.network.model.transfer.TransferBalance.onNavigationEvent = r6
            int r3 = r3 % r0
            if (r3 == 0) goto L20
            long r6 = r8.balance
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 == 0) goto L29
            goto L24
        L20:
            long r8 = r8.balance
            r8 = 0
            throw r8
        L24:
            long r6 = r8.balance
            r9.onExtraCallback(r10, r2, r6)
        L29:
            r3 = 1
            boolean r6 = r9.onWarmupCompleted(r10, r3)
            if (r6 != 0) goto L36
            long r6 = r8.withdrawableAmount
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 == 0) goto L3b
        L36:
            long r4 = r8.withdrawableAmount
            r9.onExtraCallback(r10, r3, r4)
        L3b:
            boolean r4 = r9.onWarmupCompleted(r10, r0)
            if (r4 != 0) goto L45
            boolean r4 = r8.shouldRefresh
            if (r4 == 0) goto L4a
        L45:
            boolean r4 = r8.shouldRefresh
            r9.onNavigationEvent(r10, r0, r4)
        L4a:
            r4 = 3
            boolean r5 = r9.onWarmupCompleted(r10, r4)
            if (r5 != 0) goto L5c
            java.lang.String r5 = r8.sourceType
            java.lang.String r6 = ""
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            r3 = r3 ^ r5
            if (r3 == 0) goto L61
        L5c:
            java.lang.String r3 = r8.sourceType
            r9.onExtraCallback(r10, r4, r3)
        L61:
            r3 = 4
            boolean r4 = r9.onWarmupCompleted(r10, r3)
            if (r4 != 0) goto L81
            int r4 = viva.republica.toss.network.model.transfer.TransferBalance.onExtraCallbackWithResult
            int r4 = r4 + 79
            int r5 = r4 % 128
            viva.republica.toss.network.model.transfer.TransferBalance.onNavigationEvent = r5
            int r4 = r4 % r0
            viva.republica.toss.network.model.transfer.TransferBalanceStatus r0 = r8.balanceStatus
            if (r4 != 0) goto L7d
            viva.republica.toss.network.model.transfer.TransferBalanceStatus r4 = viva.republica.toss.network.model.transfer.TransferBalanceStatus.INVALID
            r5 = 30
            int r5 = r5 / r2
            if (r0 == r4) goto L8e
            goto L81
        L7d:
            viva.republica.toss.network.model.transfer.TransferBalanceStatus r2 = viva.republica.toss.network.model.transfer.TransferBalanceStatus.INVALID
            if (r0 == r2) goto L8e
        L81:
            r0 = r1[r3]
            java.lang.Object r0 = r0.getValue()
            o.py r0 = (o.py) r0
            viva.republica.toss.network.model.transfer.TransferBalanceStatus r8 = r8.balanceStatus
            r9.onNavigationEvent(r10, r3, r0, r8)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferBalance.IAuthTabCallback(viva.republica.toss.network.model.transfer.TransferBalance, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 41;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
        return lazyArr;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        long j = this.balance;
        int i5 = i3 + 19;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TransferBalance transferBalance = (TransferBalance) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        long j = transferBalance.withdrawableAmount;
        int i5 = i3 + 53;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return Long.valueOf(j);
        }
        throw null;
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 1;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.shouldRefresh;
        int i5 = i2 + 99;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TransferBalance(long j, long j2, boolean z, String str, TransferBalanceStatus transferBalanceStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j3;
        long j4 = -1;
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            j3 = -1;
        } else {
            j3 = j;
        }
        if ((i & 2) != 0) {
            int i3 = 2 % 2;
        } else {
            j4 = j2;
        }
        boolean z2 = (i & 4) != 0 ? false : z;
        if ((i & 8) != 0) {
            int i4 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 78 / 0;
            }
            int i6 = 2 % 2;
            str = "";
        }
        this(j3, j4, z2, str, (i & 16) != 0 ? TransferBalanceStatus.INVALID : transferBalanceStatus);
    }

    public final void IAuthTabCallback(@NotNull TransferBalanceStatus transferBalanceStatus) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(transferBalanceStatus, "");
        this.balanceStatus = transferBalanceStatus;
        int i4 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TransferBalanceStatus onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 107;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        TransferBalanceStatus transferBalanceStatus = this.balanceStatus;
        int i5 = i2 + 71;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return transferBalanceStatus;
    }

    public final BalanceSourceType IAuthTabCallbackStub() {
        BalanceSourceType balanceSourceTypeOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            balanceSourceTypeOnExtraCallbackWithResult = BalanceSourceType.Companion.onExtraCallbackWithResult(this.sourceType);
            int i3 = 13 / 0;
        } else {
            balanceSourceTypeOnExtraCallbackWithResult = BalanceSourceType.Companion.onExtraCallbackWithResult(this.sourceType);
        }
        int i4 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return balanceSourceTypeOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TransferBalance transferBalance = (TransferBalance) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 25;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        long j = transferBalance.withdrawableAmount;
        if (i4 == 0 ? j < 0 : j < 0) {
            return Long.valueOf(transferBalance.balance);
        }
        int i5 = i2 + 123;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return Long.valueOf(j);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            int i2 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            cls = null;
        }
        if (Intrinsics.areEqual(TransferBalance.class, cls)) {
            Intrinsics.checkNotNull(obj, "");
            TransferBalance transferBalance = (TransferBalance) obj;
            return this.balance == transferBalance.balance && this.withdrawableAmount == transferBalance.withdrawableAmount && this.balanceStatus == transferBalance.balanceStatus;
        }
        int i4 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Long.hashCode(this.balance) * 31) + Long.hashCode(this.withdrawableAmount)) * 31) + this.balanceStatus.hashCode();
        int i4 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return iHashCode;
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Lazy[]) onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback3, 220112568, iIAuthTabCallback2, new Object[0], -220112566, iIAuthTabCallback);
    }

    public final long onNavigationEvent() {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return ((Long) onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback3, 1707573646, iIAuthTabCallback2, new Object[]{this}, -1707573645, iIAuthTabCallback)).longValue();
    }

    public final long IAuthTabCallbackDefault() {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return ((Long) onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback3, 1585013849, iIAuthTabCallback2, new Object[]{this}, -1585013849, iIAuthTabCallback)).longValue();
    }
}
