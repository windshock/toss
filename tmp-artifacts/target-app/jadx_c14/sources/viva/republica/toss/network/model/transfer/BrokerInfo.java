package viva.republica.toss.network.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.BrokerInfo$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BrokerInfo implements Parcelable {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String category;
    private final boolean force;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BrokerInfo> CREATOR = new IAuthTabCallback();

    public static final class IAuthTabCallback implements Parcelable.Creator<BrokerInfo> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BrokerInfo createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            BrokerInfo brokerInfoOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            if (i3 != 0) {
                int i4 = 59 / 0;
            }
            int i5 = onWarmupCompleted + 105;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return brokerInfoOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BrokerInfo[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 113;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            BrokerInfo[] brokerInfoArrOnExtraCallback = onExtraCallback(i);
            int i5 = IAuthTabCallback + 115;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return brokerInfoArrOnExtraCallback;
        }

        public final BrokerInfo[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 37;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            BrokerInfo[] brokerInfoArr = new BrokerInfo[i];
            int i6 = i3 + 75;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 0 / 0;
            }
            return brokerInfoArr;
        }

        public final BrokerInfo onExtraCallbackWithResult(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i2 = IAuthTabCallback + 109;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                z = true;
            } else {
                int i4 = IAuthTabCallback + 81;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            }
            return new BrokerInfo(string, z);
        }
    }

    static {
        int i = onWarmupCompleted + 95;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BrokerInfo() {
        String str = null;
        this(str, false, 3, (DefaultConstructorMarker) str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2 == 0 ? 1 : 0;
        int i5 = i3 + 13;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 25 / 0;
        }
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrokerInfo)) {
            int i2 = onExtraCallbackWithResult + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        BrokerInfo brokerInfo = (BrokerInfo) obj;
        if (Intrinsics.areEqual(this.category, brokerInfo.category)) {
            return this.force == brokerInfo.force;
        }
        int i4 = onExtraCallback + 23;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.category.hashCode() * 31) + Boolean.hashCode(this.force);
        int i4 = onExtraCallback + 63;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BrokerInfo(category=" + this.category + ", force=" + this.force + ")";
        int i2 = onExtraCallbackWithResult + 91;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 95;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.category);
        parcel.writeInt(this.force ? 1 : 0);
        int i5 = onExtraCallback + 35;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
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

        public final KSerializer<BrokerInfo> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            BrokerInfo$.serializer serializerVar = BrokerInfo$.serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 125;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 0 / 0;
            }
            return serializerVar;
        }
    }

    public /* synthetic */ BrokerInfo(int i, String str, boolean z, okycx okycxVar) {
        if ((i & 1) == 0) {
            str = "";
            int i2 = onExtraCallback + 75;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.category = str;
        if ((i & 2) != 0) {
            this.force = z;
            return;
        }
        int i5 = onExtraCallback + 87;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        this.force = false;
    }

    public BrokerInfo(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.category = str;
        this.force = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.transfer.BrokerInfo r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.BrokerInfo.onExtraCallbackWithResult
            int r1 = r1 + 9
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.BrokerInfo.onExtraCallback = r2
            int r1 = r1 % r0
            r1 = 0
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            if (r2 != 0) goto L34
            int r2 = viva.republica.toss.network.model.transfer.BrokerInfo.onExtraCallbackWithResult
            int r2 = r2 + 117
            int r3 = r2 % 128
            viva.republica.toss.network.model.transfer.BrokerInfo.onExtraCallback = r3
            int r2 = r2 % r0
            java.lang.String r0 = ""
            if (r2 != 0) goto L2c
            java.lang.String r2 = r4.category
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            r2 = 69
            int r2 = r2 / r1
            if (r0 != 0) goto L39
            goto L34
        L2c:
            java.lang.String r2 = r4.category
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 != 0) goto L39
        L34:
            java.lang.String r0 = r4.category
            r5.onExtraCallback(r6, r1, r0)
        L39:
            r0 = 1
            boolean r1 = r5.onWarmupCompleted(r6, r0)
            if (r1 != 0) goto L44
            boolean r1 = r4.force
            if (r1 == 0) goto L49
        L44:
            boolean r4 = r4.force
            r5.onNavigationEvent(r6, r0, r4)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.BrokerInfo.onNavigationEvent(viva.republica.toss.network.model.transfer.BrokerInfo, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BrokerInfo(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 65;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 41;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i7 = onExtraCallbackWithResult + 65;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            z = false;
        }
        this(str, z);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.category;
        int i5 = i3 + 67;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.force;
        int i5 = i3 + 121;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }
}
