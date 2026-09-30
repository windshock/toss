package im.toss.appsintoss.data.remote.model;

import im.toss.appsintoss.data.remote.model.SubmitOrderRequest$;
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
public final class SubmitOrderRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String orderId;
    private final String rawReceipt;

    static {
        int i = onExtraCallbackWithResult + 37;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 95;
            int i6 = i5 % 128;
            onWarmupCompleted = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 39;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof SubmitOrderRequest)) {
            int i9 = i3 + 73;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        SubmitOrderRequest submitOrderRequest = (SubmitOrderRequest) obj;
        if (!Intrinsics.areEqual(this.orderId, submitOrderRequest.orderId)) {
            return false;
        }
        if (Intrinsics.areEqual(this.rawReceipt, submitOrderRequest.rawReceipt)) {
            return true;
        }
        int i11 = onWarmupCompleted + 97;
        onNavigationEvent = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.orderId.hashCode();
        return (i3 != 0 ? iHashCode >>> 110 : iHashCode * 31) + this.rawReceipt.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SubmitOrderRequest(orderId=" + this.orderId + ", rawReceipt=" + this.rawReceipt + ")";
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ SubmitOrderRequest(int i, String str, String str2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onNavigationEvent + 99;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                htf31.onExtraCallbackWithResult(i, 2, SubmitOrderRequest$.serializer.INSTANCE.getDescriptor());
            } else {
                htf31.onExtraCallbackWithResult(i, 3, SubmitOrderRequest$.serializer.INSTANCE.getDescriptor());
            }
            int i3 = 2 % 2;
        }
        this.orderId = str;
        this.rawReceipt = str2;
    }

    public SubmitOrderRequest(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.orderId = str;
        this.rawReceipt = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(SubmitOrderRequest submitOrderRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, submitOrderRequest.orderId);
            vylVar.onExtraCallback(serialDescriptor, 0, submitOrderRequest.rawReceipt);
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, submitOrderRequest.orderId);
            vylVar.onExtraCallback(serialDescriptor, 1, submitOrderRequest.rawReceipt);
        }
    }
}
