package im.toss.features.kyc.network.model;

import im.toss.features.kyc.network.model.CddCertifyIgnoreDevRequest$;
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
public final class CddCertifyIgnoreDevRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final long unifiedId;

    static {
        int i = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 121;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof CddCertifyIgnoreDevRequest) {
            if (this.unifiedId == ((CddCertifyIgnoreDevRequest) obj).unifiedId) {
                return true;
            }
            int i4 = onNavigationEvent + 7;
            IAuthTabCallback = i4 % 128;
            return i4 % 2 != 0;
        }
        int i5 = onNavigationEvent;
        int i6 = i5 + 101;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 91;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Long.hashCode(this.unifiedId);
            throw null;
        }
        int iHashCode = Long.hashCode(this.unifiedId);
        int i3 = IAuthTabCallback + 35;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CddCertifyIgnoreDevRequest(unifiedId=" + this.unifiedId + ")";
        int i2 = IAuthTabCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ CddCertifyIgnoreDevRequest(int i, long j, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = IAuthTabCallback + 37;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, CddCertifyIgnoreDevRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onNavigationEvent + 51;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.unifiedId = j;
    }

    public CddCertifyIgnoreDevRequest(long j) {
        this.unifiedId = j;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(CddCertifyIgnoreDevRequest cddCertifyIgnoreDevRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, cddCertifyIgnoreDevRequest.unifiedId);
        int i4 = IAuthTabCallback + 113;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
