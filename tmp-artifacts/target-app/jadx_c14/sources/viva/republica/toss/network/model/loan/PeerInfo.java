package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.PeerInfo$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PeerInfo implements Parcelable {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("agePeerAverageLimit")
    private final Long agePeerAverageLimit;

    @SerializedName("agePeerAverageRate")
    private final Float agePeerAverageRate;

    @SerializedName("agePeerGroupName")
    private final String agePeerGroupName;

    @SerializedName("creditPeerAverageRate")
    private final Float creditPeerAverageRate;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PeerInfo> CREATOR = new onWarmupCompleted();

    public static final class onWarmupCompleted implements Parcelable.Creator<PeerInfo> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ PeerInfo createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onWarmupCompleted(parcel);
                throw null;
            }
            PeerInfo peerInfoOnWarmupCompleted = onWarmupCompleted(parcel);
            int i3 = onWarmupCompleted + 17;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return peerInfoOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ PeerInfo[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 91;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            PeerInfo[] peerInfoArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onExtraCallback + 35;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return peerInfoArrOnExtraCallbackWithResult;
        }

        public final PeerInfo[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 105;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            PeerInfo[] peerInfoArr = new PeerInfo[i];
            int i6 = i4 + 77;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return peerInfoArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final PeerInfo onWarmupCompleted(Parcel parcel) {
            Float fValueOf;
            Float fValueOf2;
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 117;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Long lValueOf = null;
            if (parcel.readInt() == 0) {
                int i5 = onWarmupCompleted + 63;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                int i7 = onWarmupCompleted + 13;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                fValueOf2 = null;
            } else {
                fValueOf2 = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() == 0) {
                i = onWarmupCompleted + 93;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                i = onWarmupCompleted + 89;
            }
            onExtraCallback = i % 128;
            int i9 = i % 2;
            return new PeerInfo(fValueOf, string, fValueOf2, lValueOf);
        }
    }

    static {
        int i = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public PeerInfo() {
        this((Float) null, (String) null, (Float) null, (Long) null, 15, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 81;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 5;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 71;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof PeerInfo)) {
            int i3 = onNavigationEvent + 59;
            IAuthTabCallback = i3 % 128;
            return i3 % 2 == 0;
        }
        PeerInfo peerInfo = (PeerInfo) obj;
        if (!Intrinsics.areEqual(this.creditPeerAverageRate, peerInfo.creditPeerAverageRate)) {
            int i4 = onNavigationEvent + 113;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.agePeerGroupName, peerInfo.agePeerGroupName)) {
            return Intrinsics.areEqual(this.agePeerAverageRate, peerInfo.agePeerAverageRate) && Intrinsics.areEqual(this.agePeerAverageLimit, peerInfo.agePeerAverageLimit);
        }
        int i6 = onNavigationEvent + 13;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        Float f = this.creditPeerAverageRate;
        int iHashCode2 = 0;
        if (f == null) {
            int i2 = IAuthTabCallback + 9;
            onNavigationEvent = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = f.hashCode();
        }
        int iHashCode3 = this.agePeerGroupName.hashCode();
        Float f2 = this.agePeerAverageRate;
        int iHashCode4 = f2 == null ? 0 : f2.hashCode();
        Long l = this.agePeerAverageLimit;
        if (l != null) {
            int i3 = onNavigationEvent + 89;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                l.hashCode();
                throw null;
            }
            iHashCode2 = l.hashCode();
        }
        int i4 = (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2;
        int i5 = onNavigationEvent + 57;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PeerInfo(creditPeerAverageRate=" + this.creditPeerAverageRate + ", agePeerGroupName=" + this.agePeerGroupName + ", agePeerAverageRate=" + this.agePeerAverageRate + ", agePeerAverageLimit=" + this.agePeerAverageLimit + ")";
        int i2 = IAuthTabCallback + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        Float f = this.creditPeerAverageRate;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
            int i3 = onNavigationEvent + 119;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        parcel.writeString(this.agePeerGroupName);
        Float f2 = this.agePeerAverageRate;
        if (f2 == null) {
            int i5 = onNavigationEvent + 65;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Long l = this.agePeerAverageLimit;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            int i7 = IAuthTabCallback + 17;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            parcel.writeInt(0);
        }
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PeerInfo> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            PeerInfo$.serializer serializerVar = PeerInfo$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 27;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ PeerInfo(int i, Float f, String str, Float f2, Long l, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.creditPeerAverageRate = null;
        } else {
            this.creditPeerAverageRate = f;
        }
        if ((i & 2) == 0) {
            this.agePeerGroupName = "";
        } else {
            this.agePeerGroupName = str;
        }
        int i2 = 2 % 2;
        if ((i & 4) == 0) {
            int i3 = IAuthTabCallback + 111;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            this.agePeerAverageRate = null;
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = 2 % 2;
        } else {
            this.agePeerAverageRate = f2;
        }
        if ((i & 8) != 0) {
            this.agePeerAverageLimit = l;
            return;
        }
        int i6 = onNavigationEvent + 35;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        this.agePeerAverageLimit = null;
        if (i7 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public PeerInfo(@Nullable Float f, @NotNull String str, @Nullable Float f2, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        this.creditPeerAverageRate = f;
        this.agePeerGroupName = str;
        this.agePeerAverageRate = f2;
        this.agePeerAverageLimit = l;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.loan.PeerInfo r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.PeerInfo.IAuthTabCallback
            int r1 = r1 + 25
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.PeerInfo.onNavigationEvent = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L17
            boolean r1 = r6.onWarmupCompleted(r7, r3)
            if (r1 != 0) goto L21
            goto L1d
        L17:
            boolean r1 = r6.onWarmupCompleted(r7, r2)
            if (r1 != 0) goto L21
        L1d:
            java.lang.Float r1 = r5.creditPeerAverageRate
            if (r1 == 0) goto L28
        L21:
            o.dj3 r1 = o.dj3.onWarmupCompleted
            java.lang.Float r4 = r5.creditPeerAverageRate
            r6.onExtraCallbackWithResult(r7, r2, r1, r4)
        L28:
            boolean r1 = r6.onWarmupCompleted(r7, r3)
            if (r1 != 0) goto L38
            java.lang.String r1 = r5.agePeerGroupName
            java.lang.String r2 = ""
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L3d
        L38:
            java.lang.String r1 = r5.agePeerGroupName
            r6.onExtraCallback(r7, r3, r1)
        L3d:
            boolean r1 = r6.onWarmupCompleted(r7, r0)
            r1 = r1 ^ r3
            if (r1 == r3) goto L45
            goto L54
        L45:
            int r1 = viva.republica.toss.network.model.loan.PeerInfo.onNavigationEvent
            int r1 = r1 + 77
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.PeerInfo.IAuthTabCallback = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L6e
            java.lang.Float r1 = r5.agePeerAverageRate
            if (r1 == 0) goto L5b
        L54:
            o.dj3 r1 = o.dj3.onWarmupCompleted
            java.lang.Float r2 = r5.agePeerAverageRate
            r6.onExtraCallbackWithResult(r7, r0, r1, r2)
        L5b:
            r0 = 3
            boolean r1 = r6.onWarmupCompleted(r7, r0)
            if (r1 != 0) goto L66
            java.lang.Long r1 = r5.agePeerAverageLimit
            if (r1 == 0) goto L6d
        L66:
            o.oty1 r1 = o.oty1.onExtraCallback
            java.lang.Long r5 = r5.agePeerAverageLimit
            r6.onExtraCallbackWithResult(r7, r0, r1, r5)
        L6d:
            return
        L6e:
            java.lang.Float r5 = r5.agePeerAverageRate
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.PeerInfo.onExtraCallback(viva.republica.toss.network.model.loan.PeerInfo, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PeerInfo(Float f, String str, Float f2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 81;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 51 / 0;
            }
            f = null;
        }
        str = (i & 2) != 0 ? "" : str;
        f2 = (i & 4) != 0 ? null : f2;
        if ((i & 8) != 0) {
            int i4 = IAuthTabCallback + 75;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            int i5 = 2 % 2;
            l = null;
        }
        this(f, str, f2, l);
    }
}
