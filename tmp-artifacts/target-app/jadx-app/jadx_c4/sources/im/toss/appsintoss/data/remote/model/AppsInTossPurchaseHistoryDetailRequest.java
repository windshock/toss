package im.toss.appsintoss.data.remote.model;

import im.toss.appsintoss.data.remote.model.AppsInTossPurchaseHistoryDetailRequest$;
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
public final class AppsInTossPurchaseHistoryDetailRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final String orderId;

    static {
        int i = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 65 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 31;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof AppsInTossPurchaseHistoryDetailRequest) || (!Intrinsics.areEqual(this.orderId, ((AppsInTossPurchaseHistoryDetailRequest) obj).orderId))) {
            return false;
        }
        int i7 = onExtraCallback + 9;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.orderId.hashCode();
        int i4 = onWarmupCompleted + 119;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppsInTossPurchaseHistoryDetailRequest(orderId=" + this.orderId + ")";
        int i2 = onExtraCallback + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppsInTossPurchaseHistoryDetailRequest> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AppsInTossPurchaseHistoryDetailRequest$.serializer serializerVar = AppsInTossPurchaseHistoryDetailRequest$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ AppsInTossPurchaseHistoryDetailRequest(int i, String str, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 1;
        if (1 != (i & 1)) {
            int i3 = onWarmupCompleted + 25;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = AppsInTossPurchaseHistoryDetailRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 0;
            } else {
                descriptor = AppsInTossPurchaseHistoryDetailRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onExtraCallback + 83;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.orderId = str;
    }

    public AppsInTossPurchaseHistoryDetailRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderId = str;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(AppsInTossPurchaseHistoryDetailRequest appsInTossPurchaseHistoryDetailRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        String str;
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 49;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            i = 1;
            str = appsInTossPurchaseHistoryDetailRequest.orderId;
        } else {
            str = appsInTossPurchaseHistoryDetailRequest.orderId;
            i = 0;
        }
        vylVar.onExtraCallback(serialDescriptor, i, str);
        int i4 = onExtraCallback + 111;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
