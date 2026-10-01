package im.toss.features.manualselfie.model.network;

import im.toss.features.manualselfie.model.network.ManualSelfieRegistryRequest$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ManualSelfieRegistryRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final long sessionId;
    private final long unifiedId;

    static {
        Object obj = null;
        int i = onWarmupCompleted + 81;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 95;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManualSelfieRegistryRequest)) {
            int i5 = i4 + 71;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        ManualSelfieRegistryRequest manualSelfieRegistryRequest = (ManualSelfieRegistryRequest) obj;
        if (this.sessionId == manualSelfieRegistryRequest.sessionId) {
            return this.unifiedId == manualSelfieRegistryRequest.unifiedId;
        }
        int i7 = i2 + 5;
        onNavigationEvent = i7 % 128;
        return i7 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Long.hashCode(this.sessionId) * 31) + Long.hashCode(this.unifiedId);
        int i4 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ManualSelfieRegistryRequest(sessionId=" + this.sessionId + ", unifiedId=" + this.unifiedId + ")";
        int i2 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ ManualSelfieRegistryRequest(int i, long j, long j2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                htf31.onExtraCallbackWithResult(i, 2, ManualSelfieRegistryRequest$.serializer.INSTANCE.getDescriptor());
            } else {
                htf31.onExtraCallbackWithResult(i, 3, ManualSelfieRegistryRequest$.serializer.INSTANCE.getDescriptor());
            }
            int i3 = 2 % 2;
        }
        this.sessionId = j;
        this.unifiedId = j2;
    }

    public ManualSelfieRegistryRequest(long j, long j2) {
        this.sessionId = j;
        this.unifiedId = j2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(ManualSelfieRegistryRequest manualSelfieRegistryRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, manualSelfieRegistryRequest.sessionId);
        vylVar.onExtraCallback(serialDescriptor, 1, manualSelfieRegistryRequest.unifiedId);
        int i4 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
