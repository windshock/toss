package im.toss.appsintoss.data.remote.model;

import im.toss.appsintoss.data.remote.model.AppsInTossCashReceiptRequest$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppsInTossCashReceiptRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String orderId;

    static {
        int i = onNavigationEvent + 9;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 51;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof AppsInTossCashReceiptRequest) {
            return Intrinsics.areEqual(this.orderId, ((AppsInTossCashReceiptRequest) obj).orderId);
        }
        int i4 = i2 + 93;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.orderId.hashCode();
        int i4 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppsInTossCashReceiptRequest(orderId=" + this.orderId + ")";
        int i2 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 74 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppsInTossCashReceiptRequest> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AppsInTossCashReceiptRequest$.serializer serializerVar = AppsInTossCashReceiptRequest$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 11;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ AppsInTossCashReceiptRequest(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, AppsInTossCashReceiptRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.orderId = str;
    }

    public AppsInTossCashReceiptRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderId = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(AppsInTossCashReceiptRequest appsInTossCashReceiptRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, appsInTossCashReceiptRequest.orderId);
        int i4 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
