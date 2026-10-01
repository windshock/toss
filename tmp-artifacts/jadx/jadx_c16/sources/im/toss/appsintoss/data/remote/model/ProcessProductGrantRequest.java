package im.toss.appsintoss.data.remote.model;

import im.toss.appsintoss.data.remote.model.ProcessProductGrantRequest$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ProcessProductGrantRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final boolean isProductGranted;
    private final String orderId;

    static {
        int i = onExtraCallbackWithResult + 101;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 56 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProcessProductGrantRequest) {
            ProcessProductGrantRequest processProductGrantRequest = (ProcessProductGrantRequest) obj;
            if (!Intrinsics.areEqual(this.orderId, processProductGrantRequest.orderId)) {
                return false;
            }
            if (this.isProductGranted == processProductGrantRequest.isProductGranted) {
                return true;
            }
            int i2 = onWarmupCompleted + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = onWarmupCompleted + 55;
        int i5 = i4 % 128;
        onExtraCallback = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 67;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallback = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.orderId.hashCode() * 75) >>> Boolean.hashCode(this.isProductGranted) : (this.orderId.hashCode() * 31) + Boolean.hashCode(this.isProductGranted);
        int i3 = onWarmupCompleted + 11;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ProcessProductGrantRequest(orderId=" + this.orderId + ", isProductGranted=" + this.isProductGranted + ")";
        int i2 = onExtraCallback + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 / 0;
        }
        return str;
    }

    public /* synthetic */ ProcessProductGrantRequest(int i, String str, boolean z, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 3;
        if (3 != (i & 3)) {
            int i3 = onExtraCallback + 7;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = ProcessProductGrantRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 5;
            } else {
                descriptor = ProcessProductGrantRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.orderId = str;
        this.isProductGranted = z;
    }

    public ProcessProductGrantRequest(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderId = str;
        this.isProductGranted = z;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(ProcessProductGrantRequest processProductGrantRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, processProductGrantRequest.orderId);
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, processProductGrantRequest.orderId);
        }
        vylVar.onNavigationEvent(serialDescriptor, 1, processProductGrantRequest.isProductGranted);
        int i3 = onWarmupCompleted + 105;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
