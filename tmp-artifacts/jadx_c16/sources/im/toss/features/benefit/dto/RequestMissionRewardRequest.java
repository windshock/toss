package im.toss.features.benefit.dto;

import im.toss.features.benefit.dto.RequestMissionRewardRequest$;
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
public final class RequestMissionRewardRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String code;

    static {
        Object obj = null;
        int i = IAuthTabCallback + 77;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof RequestMissionRewardRequest)) {
            return false;
        }
        if (Intrinsics.areEqual(this.code, ((RequestMissionRewardRequest) obj).code)) {
            return true;
        }
        int i3 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.code.hashCode();
        int i4 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RequestMissionRewardRequest(code=" + this.code + ")";
        int i2 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ RequestMissionRewardRequest(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, RequestMissionRewardRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.code = str;
    }

    public RequestMissionRewardRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.code = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(RequestMissionRewardRequest requestMissionRewardRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, requestMissionRewardRequest.code);
        int i4 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
    }
}
