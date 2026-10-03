package viva.republica.toss.network.model.teens;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.teens.TeensCardTransportationUnderMaintenanceResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TeensCardTransportationUnderMaintenanceResponse {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final boolean isOpen;

    static {
        int i = onExtraCallbackWithResult + 83;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 71;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeensCardTransportationUnderMaintenanceResponse)) {
            int i4 = i2 + 33;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.isOpen == ((TeensCardTransportationUnderMaintenanceResponse) obj).isOpen) {
            return true;
        }
        int i6 = i2 + 91;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = Boolean.hashCode(this.isOpen);
            int i3 = 55 / 0;
        } else {
            iHashCode = Boolean.hashCode(this.isOpen);
        }
        int i4 = IAuthTabCallback + 53;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensCardTransportationUnderMaintenanceResponse(isOpen=" + this.isOpen + ")";
        int i2 = onWarmupCompleted + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TeensCardTransportationUnderMaintenanceResponse> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            TeensCardTransportationUnderMaintenanceResponse$.serializer serializerVar = TeensCardTransportationUnderMaintenanceResponse$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 31;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ TeensCardTransportationUnderMaintenanceResponse(int i, boolean z, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = IAuthTabCallback + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, TeensCardTransportationUnderMaintenanceResponse$.serializer.INSTANCE.getDescriptor());
            int i4 = 2 % 2;
        }
        this.isOpen = z;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(TeensCardTransportationUnderMaintenanceResponse teensCardTransportationUnderMaintenanceResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, teensCardTransportationUnderMaintenanceResponse.isOpen);
        int i4 = IAuthTabCallback + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 51;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.isOpen;
        int i4 = i2 + 29;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }
}
