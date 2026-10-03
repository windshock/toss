package viva.republica.toss.network.model.transfer;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.TransferLocation$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferLocation {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final double lat;
    private final double lng;

    static {
        int i = onNavigationEvent + 119;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 21;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof TransferLocation)) {
            int i4 = onExtraCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        TransferLocation transferLocation = (TransferLocation) obj;
        if (Double.compare(this.lat, transferLocation.lat) == 0) {
            return Double.compare(this.lng, transferLocation.lng) == 0;
        }
        int i6 = onExtraCallback + 35;
        int i7 = i6 % 128;
        onExtraCallbackWithResult = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 49;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Double.hashCode(this.lat) * 31) + Double.hashCode(this.lng);
        int i4 = onExtraCallback + 125;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferLocation(lat=" + this.lat + ", lng=" + this.lng + ")";
        int i2 = onExtraCallbackWithResult + 91;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 83 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferLocation> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            TransferLocation$.serializer serializerVar = TransferLocation$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 23;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public TransferLocation(double d, double d2) {
        this.lat = d;
        this.lng = d2;
    }

    public /* synthetic */ TransferLocation(int i, double d, double d2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onExtraCallbackWithResult + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, TransferLocation$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 37;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 4;
            } else {
                int i6 = 2 % 2;
            }
        }
        this.lat = d;
        this.lng = d2;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(TransferLocation transferLocation, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        double d = transferLocation.lat;
        if (i3 != 0) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, d);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, transferLocation.lng);
        } else {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, d);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, transferLocation.lng);
        }
        int i4 = onExtraCallback + 89;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
