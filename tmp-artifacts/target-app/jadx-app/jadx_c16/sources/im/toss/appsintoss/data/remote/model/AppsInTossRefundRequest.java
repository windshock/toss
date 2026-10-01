package im.toss.appsintoss.data.remote.model;

import im.toss.appsintoss.data.remote.model.AppsInTossRefundRequest$;
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
public final class AppsInTossRefundRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final String orderId;
    private final String refundReason;

    static {
        int i = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 123;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 21;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof AppsInTossRefundRequest)) {
            int i8 = i4 + 69;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        AppsInTossRefundRequest appsInTossRefundRequest = (AppsInTossRefundRequest) obj;
        if (!Intrinsics.areEqual(this.orderId, appsInTossRefundRequest.orderId)) {
            int i10 = onNavigationEvent + 115;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.refundReason, appsInTossRefundRequest.refundReason)) {
            return false;
        }
        int i12 = onExtraCallback + 53;
        onNavigationEvent = i12 % 128;
        int i13 = i12 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.orderId.hashCode() * 31) + this.refundReason.hashCode();
        int i4 = onNavigationEvent + 81;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppsInTossRefundRequest(orderId=" + this.orderId + ", refundReason=" + this.refundReason + ")";
        int i2 = onNavigationEvent + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ AppsInTossRefundRequest(int i, String str, String str2, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 3;
        if (3 != (i & 3)) {
            int i3 = onNavigationEvent + 13;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = AppsInTossRefundRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 4;
            } else {
                descriptor = AppsInTossRefundRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onExtraCallback + 95;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.orderId = str;
        this.refundReason = str2;
    }

    public AppsInTossRefundRequest(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.orderId = str;
        this.refundReason = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(AppsInTossRefundRequest appsInTossRefundRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, appsInTossRefundRequest.orderId);
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, appsInTossRefundRequest.orderId);
        }
        vylVar.onExtraCallback(serialDescriptor, 1, appsInTossRefundRequest.refundReason);
        int i3 = onNavigationEvent + 47;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }
}
