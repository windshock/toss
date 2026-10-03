package viva.republica.toss.network.model.visitor;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.visitor.VisitorOsGpsResultRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class VisitorOsGpsResultRequest {
    public static final Companion Companion;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final boolean isUserInKorea;
    private final double latitude;
    private final double longitude;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onExtraCallback + 15;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 65;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof VisitorOsGpsResultRequest)) {
            return false;
        }
        VisitorOsGpsResultRequest visitorOsGpsResultRequest = (VisitorOsGpsResultRequest) obj;
        if (Double.compare(this.latitude, visitorOsGpsResultRequest.latitude) != 0) {
            int i4 = onNavigationEvent + 117;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Double.compare(this.longitude, visitorOsGpsResultRequest.longitude) == 0) {
            return this.isUserInKorea == visitorOsGpsResultRequest.isUserInKorea;
        }
        int i6 = onWarmupCompleted + 9;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onWarmupCompleted = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((Double.hashCode(this.latitude) + 98) + Double.hashCode(this.longitude)) / 21) - Boolean.hashCode(this.isUserInKorea) : (((Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude)) * 31) + Boolean.hashCode(this.isUserInKorea);
        int i3 = onWarmupCompleted + 7;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VisitorOsGpsResultRequest(latitude=" + this.latitude + ", longitude=" + this.longitude + ", isUserInKorea=" + this.isUserInKorea + ")";
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 43 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<VisitorOsGpsResultRequest> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            VisitorOsGpsResultRequest$.serializer serializerVar = VisitorOsGpsResultRequest$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 35;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public VisitorOsGpsResultRequest(double d, double d2, boolean z) {
        this.latitude = d;
        this.longitude = d2;
        this.isUserInKorea = z;
    }

    public /* synthetic */ VisitorOsGpsResultRequest(int i, double d, double d2, boolean z, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i2 = onNavigationEvent + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 7, VisitorOsGpsResultRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 93;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 4;
            } else {
                int i6 = 2 % 2;
            }
        }
        this.latitude = d;
        this.longitude = d2;
        this.isUserInKorea = z;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(VisitorOsGpsResultRequest visitorOsGpsResultRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 1;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, visitorOsGpsResultRequest.latitude);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, visitorOsGpsResultRequest.longitude);
            i = 5;
        } else {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, visitorOsGpsResultRequest.latitude);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, visitorOsGpsResultRequest.longitude);
        }
        vylVar.onNavigationEvent(serialDescriptor, i, visitorOsGpsResultRequest.isUserInKorea);
    }
}
