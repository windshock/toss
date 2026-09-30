package im.toss.features.benefit.dto;

import im.toss.features.benefit.dto.PointBackRewardRequest$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PointBackRewardRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String rewardType;
    private final String transactionId;

    static {
        int i = onWarmupCompleted + 49;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 7;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 33;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 92 / 0;
            }
            return true;
        }
        if (!(obj instanceof PointBackRewardRequest)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.transactionId, ((PointBackRewardRequest) obj).transactionId)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.rewardType, r6.rewardType))) {
            return true;
        }
        int i7 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i7 % 128;
        return i7 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            this.transactionId.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode2 = this.transactionId.hashCode();
        String str = this.rewardType;
        if (str == null) {
            int i3 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PointBackRewardRequest(transactionId=" + this.transactionId + ", rewardType=" + this.rewardType + ")";
        int i2 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ PointBackRewardRequest(int i, String str, String str2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, PointBackRewardRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.transactionId = str;
        this.rewardType = str2;
    }

    public PointBackRewardRequest(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transactionId = str;
        this.rewardType = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(PointBackRewardRequest pointBackRewardRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, pointBackRewardRequest.transactionId);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, pointBackRewardRequest.rewardType);
        int i4 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
