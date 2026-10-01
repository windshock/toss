package im.toss.features.benefit.dto;

import im.toss.features.benefit.dto.ActivationIntelligenceEventRequest$;
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
public final class ActivationIntelligenceEventRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String id;

    static {
        int i = onExtraCallbackWithResult + 105;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback;
            int i3 = i2 + 31;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 87;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 7 / 0;
            }
            return true;
        }
        if (!(obj instanceof ActivationIntelligenceEventRequest)) {
            return false;
        }
        if (Intrinsics.areEqual(this.id, ((ActivationIntelligenceEventRequest) obj).id)) {
            return true;
        }
        int i7 = onExtraCallback + 115;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 57 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.id.hashCode();
        int i4 = onWarmupCompleted + 73;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ActivationIntelligenceEventRequest(id=" + this.id + ")";
        int i2 = onWarmupCompleted + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ ActivationIntelligenceEventRequest(int i, String str, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 1;
        if (1 != (i & 1)) {
            int i3 = onWarmupCompleted + 77;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = ActivationIntelligenceEventRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 0;
            } else {
                descriptor = ActivationIntelligenceEventRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onWarmupCompleted + 103;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.id = str;
    }

    public ActivationIntelligenceEventRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(ActivationIntelligenceEventRequest activationIntelligenceEventRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, activationIntelligenceEventRequest.id);
        int i4 = onExtraCallback + 121;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
