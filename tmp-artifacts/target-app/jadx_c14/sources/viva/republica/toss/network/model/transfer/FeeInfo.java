package viva.republica.toss.network.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.FeeInfo$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class FeeInfo implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final long fee;
    private final boolean freeFeeTarget;
    private final String message;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<FeeInfo> CREATOR = new onExtraCallback();

    public static final class onExtraCallback implements Parcelable.Creator<FeeInfo> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final FeeInfo[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 55;
            onWarmupCompleted = i3 % 128;
            FeeInfo[] feeInfoArr = new FeeInfo[i];
            if (i3 % 2 == 0) {
                int i4 = 40 / 0;
            }
            return feeInfoArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ FeeInfo createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            FeeInfo feeInfoOnWarmupCompleted = onWarmupCompleted(parcel);
            int i4 = onExtraCallback + 105;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return feeInfoOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ FeeInfo[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 3;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                IAuthTabCallback(i);
                throw null;
            }
            FeeInfo[] feeInfoArrIAuthTabCallback = IAuthTabCallback(i);
            int i4 = onExtraCallback + 123;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return feeInfoArrIAuthTabCallback;
        }

        public final FeeInfo onWarmupCompleted(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i4 = onWarmupCompleted + 27;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            return new FeeInfo(j, string, z);
        }
    }

    static {
        int i = IAuthTabCallback + 69;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof FeeInfo)) {
            return false;
        }
        FeeInfo feeInfo = (FeeInfo) obj;
        if (this.fee == feeInfo.fee) {
            return Intrinsics.areEqual(this.message, feeInfo.message) && this.freeFeeTarget == feeInfo.freeFeeTarget;
        }
        int i4 = onExtraCallbackWithResult + 111;
        onExtraCallback = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Long.hashCode(this.fee) * 31) + this.message.hashCode()) * 31) + Boolean.hashCode(this.freeFeeTarget);
        int i4 = onExtraCallbackWithResult + 69;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FeeInfo(fee=" + this.fee + ", message=" + this.message + ", freeFeeTarget=" + this.freeFeeTarget + ")";
        int i2 = onExtraCallback + 85;
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
        int i3 = onExtraCallback + 105;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.fee);
        parcel.writeString(this.message);
        parcel.writeInt(this.freeFeeTarget ? 1 : 0);
        int i5 = onExtraCallback + 93;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FeeInfo> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            FeeInfo$.serializer serializerVar = FeeInfo$.serializer.INSTANCE;
            if (i3 != 0) {
                int i4 = 41 / 0;
            }
            return serializerVar;
        }
    }

    public /* synthetic */ FeeInfo(int i, long j, String str, boolean z, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i2 = onExtraCallbackWithResult + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 7, FeeInfo$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 13;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.fee = j;
        this.message = str;
        this.freeFeeTarget = z;
    }

    public FeeInfo(long j, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fee = j;
        this.message = str;
        this.freeFeeTarget = z;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(FeeInfo feeInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, feeInfo.fee);
        vylVar.onExtraCallback(serialDescriptor, 1, feeInfo.message);
        vylVar.onNavigationEvent(serialDescriptor, 2, feeInfo.freeFeeTarget);
        int i4 = onExtraCallbackWithResult + 43;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 15;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.fee;
        int i5 = i2 + 65;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
        return j;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.message;
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        return str;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        boolean z = this.freeFeeTarget;
        int i5 = i3 + 87;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
