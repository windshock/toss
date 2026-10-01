package im.toss.features.credit.data.request;

import im.toss.features.credit.data.request.StatusDetailRequest$;
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
public final class StatusDetailRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final long id;
    private final String type;

    static {
        int i = onNavigationEvent + 69;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusDetailRequest)) {
            int i2 = onWarmupCompleted + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        StatusDetailRequest statusDetailRequest = (StatusDetailRequest) obj;
        if (Intrinsics.areEqual(this.type, statusDetailRequest.type)) {
            return this.id == statusDetailRequest.id;
        }
        int i4 = onWarmupCompleted + 109;
        int i5 = i4 % 128;
        IAuthTabCallback = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 15;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.type.hashCode() * 31) + Long.hashCode(this.id);
        int i4 = IAuthTabCallback + 23;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StatusDetailRequest(type=" + this.type + ", id=" + this.id + ")";
        int i2 = onWarmupCompleted + 67;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 53 / 0;
        }
        return str;
    }

    public /* synthetic */ StatusDetailRequest(int i, String str, long j, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 3;
        if (3 != (i & 3)) {
            int i3 = onWarmupCompleted + 5;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = StatusDetailRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 4;
            } else {
                descriptor = StatusDetailRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onWarmupCompleted + 17;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.type = str;
        this.id = j;
    }

    public StatusDetailRequest(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
        this.id = j;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(StatusDetailRequest statusDetailRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, statusDetailRequest.type);
        vylVar.onExtraCallback(serialDescriptor, 1, statusDetailRequest.id);
        int i4 = IAuthTabCallback + 87;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
    }
}
