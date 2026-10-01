package viva.republica.toss.network.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import net.sf.scuba.smartcards.BuildConfig;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class OverseasTransferTargetResponse implements Parcelable {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final boolean canUseOverseasTransfer;
    private final String overseasTransferSendScheme;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OverseasTransferTargetResponse> CREATOR = new onExtraCallbackWithResult();

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<OverseasTransferTargetResponse> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ OverseasTransferTargetResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            OverseasTransferTargetResponse overseasTransferTargetResponseOnExtraCallback = onExtraCallback(parcel);
            int i4 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 75 / 0;
            }
            return overseasTransferTargetResponseOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ OverseasTransferTargetResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            OverseasTransferTargetResponse[] overseasTransferTargetResponseArrOnWarmupCompleted = onWarmupCompleted(i);
            if (i4 != 0) {
                int i5 = 16 / 0;
            }
            int i6 = onWarmupCompleted + 101;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return overseasTransferTargetResponseArrOnWarmupCompleted;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final OverseasTransferTargetResponse onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            boolean z = false;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            if (i3 != 0) {
                int i4 = 47 / 0;
                if (parcel.readInt() != 0) {
                    int i5 = onExtraCallbackWithResult + 47;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    z = true;
                }
            } else if (parcel.readInt() != 0) {
            }
            return new OverseasTransferTargetResponse(z, parcel.readString());
        }

        public final OverseasTransferTargetResponse[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 77;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            OverseasTransferTargetResponse[] overseasTransferTargetResponseArr = new OverseasTransferTargetResponse[i];
            int i6 = i3 + 95;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                return overseasTransferTargetResponseArr;
            }
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 25;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OverseasTransferTargetResponse() {
        String str = null;
        this(false, str, 3, (DefaultConstructorMarker) str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 115;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 5;
            onExtraCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof OverseasTransferTargetResponse)) {
            int i3 = onWarmupCompleted + 45;
            onExtraCallback = i3 % 128;
            return i3 % 2 == 0;
        }
        OverseasTransferTargetResponse overseasTransferTargetResponse = (OverseasTransferTargetResponse) obj;
        if (this.canUseOverseasTransfer != overseasTransferTargetResponse.canUseOverseasTransfer) {
            return false;
        }
        if (Intrinsics.areEqual(this.overseasTransferSendScheme, overseasTransferTargetResponse.overseasTransferSendScheme)) {
            return true;
        }
        int i4 = onWarmupCompleted + 3;
        onExtraCallback = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 109;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Boolean.hashCode(this.canUseOverseasTransfer);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = Boolean.hashCode(this.canUseOverseasTransfer);
        String str = this.overseasTransferSendScheme;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i4 = onWarmupCompleted + 51;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OverseasTransferTargetResponse(canUseOverseasTransfer=" + this.canUseOverseasTransfer + ", overseasTransferSendScheme=" + this.overseasTransferSendScheme + ")";
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 73;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeInt(this.canUseOverseasTransfer ? 1 : 0);
        parcel.writeString(this.overseasTransferSendScheme);
        int i5 = onExtraCallback + 29;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
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

        public final KSerializer<OverseasTransferTargetResponse> serializer() {
            OverseasTransferTargetResponse$$serializer overseasTransferTargetResponse$$serializer;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                overseasTransferTargetResponse$$serializer = OverseasTransferTargetResponse$$serializer.INSTANCE;
                int i3 = 74 / 0;
            } else {
                overseasTransferTargetResponse$$serializer = OverseasTransferTargetResponse$$serializer.INSTANCE;
            }
            int i4 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return overseasTransferTargetResponse$$serializer;
        }
    }

    public /* synthetic */ OverseasTransferTargetResponse(int i, boolean z, String str, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i2 = onWarmupCompleted + 51;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 / 5;
            } else {
                int i4 = 2 % 2;
            }
            z = false;
        }
        this.canUseOverseasTransfer = z;
        if ((i & 2) != 0) {
            this.overseasTransferSendScheme = str;
            return;
        }
        int i5 = onExtraCallback + 25;
        int i6 = i5 % 128;
        onWarmupCompleted = i6;
        int i7 = i5 % 2;
        this.overseasTransferSendScheme = null;
        if (i7 != 0) {
            int i8 = 11 / 0;
        }
        int i9 = i6 + 41;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
    }

    public OverseasTransferTargetResponse(boolean z, @Nullable String str) {
        this.canUseOverseasTransfer = z;
        this.overseasTransferSendScheme = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(OverseasTransferTargetResponse overseasTransferTargetResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onWarmupCompleted + 33;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 28 / 0;
                if (overseasTransferTargetResponse.canUseOverseasTransfer) {
                    vylVar.onNavigationEvent(serialDescriptor, 0, overseasTransferTargetResponse.canUseOverseasTransfer);
                    int i4 = onExtraCallback + 23;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else if (overseasTransferTargetResponse.canUseOverseasTransfer) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i6 = onExtraCallback + 15;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            String str = overseasTransferTargetResponse.overseasTransferSendScheme;
            if (i7 != 0) {
                int i8 = 51 / 0;
                if (str == null) {
                    return;
                }
            } else if (str == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, overseasTransferTargetResponse.overseasTransferSendScheme);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OverseasTransferTargetResponse(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = false;
        }
        if ((i & 2) != 0) {
            int i5 = onWarmupCompleted + 19;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            str = null;
        }
        this(z, str);
    }
}
