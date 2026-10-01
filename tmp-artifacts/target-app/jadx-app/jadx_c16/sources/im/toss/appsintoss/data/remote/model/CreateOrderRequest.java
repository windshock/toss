package im.toss.appsintoss.data.remote.model;

import im.toss.appsintoss.data.remote.model.CreateOrderRequest$;
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
public final class CreateOrderRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    public static final String TYPE_ONE_TIME_PURCHASE = "ONE_TIME_PURCHASE";
    public static final String TYPE_SUBSCRIPTION = "SUBSCRIPTION";
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String countryCode;
    private final String offerId;
    private final String sku;
    private final String type;

    static {
        int i = IAuthTabCallback + 43;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateOrderRequest)) {
            return false;
        }
        CreateOrderRequest createOrderRequest = (CreateOrderRequest) obj;
        if (!Intrinsics.areEqual(this.type, createOrderRequest.type)) {
            int i3 = onWarmupCompleted + 31;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.sku, createOrderRequest.sku) || !Intrinsics.areEqual(this.countryCode, createOrderRequest.countryCode) || !Intrinsics.areEqual(this.offerId, createOrderRequest.offerId)) {
            return false;
        }
        int i5 = onExtraCallback + 19;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049 A[PHI: r1 r3 r4 r5
      0x0049: PHI (r1v14 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r4v4 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r5v4 java.lang.String) = (r5v0 java.lang.String), (r5v5 java.lang.String) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[PHI: r1 r3 r4
      0x003f: PHI (r1v6 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onWarmupCompleted = i2 % 128;
        int iHashCode4 = 0;
        if (i2 % 2 == 0) {
            iHashCode = this.type.hashCode();
            iHashCode2 = this.sku.hashCode();
            iHashCode3 = this.countryCode.hashCode();
            str = this.offerId;
            int i3 = 84 / 0;
            if (str == null) {
                int i4 = onWarmupCompleted + 79;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            } else {
                iHashCode4 = str.hashCode();
            }
        } else {
            iHashCode = this.type.hashCode();
            iHashCode2 = this.sku.hashCode();
            iHashCode3 = this.countryCode.hashCode();
            str = this.offerId;
            if (str == null) {
            }
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreateOrderRequest(type=" + this.type + ", sku=" + this.sku + ", countryCode=" + this.countryCode + ", offerId=" + this.offerId + ")";
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ CreateOrderRequest(int i, String str, String str2, String str3, String str4, okycx okycxVar) {
        if (7 != (i & 7)) {
            htf31.onExtraCallbackWithResult(i, 7, CreateOrderRequest$.serializer.INSTANCE.getDescriptor());
            int i2 = onWarmupCompleted + 89;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        this.type = str;
        this.sku = str2;
        this.countryCode = str3;
        if ((i & 8) != 0) {
            this.offerId = str4;
            return;
        }
        Object obj = null;
        this.offerId = null;
        int i4 = onExtraCallback + 83;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public CreateOrderRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.type = str;
        this.sku = str2;
        this.countryCode = str3;
        this.offerId = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(CreateOrderRequest createOrderRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            vylVar.onExtraCallback(serialDescriptor, 0, createOrderRequest.type);
            vylVar.onExtraCallback(serialDescriptor, 1, createOrderRequest.sku);
            vylVar.onExtraCallback(serialDescriptor, 2, createOrderRequest.countryCode);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
                if (createOrderRequest.offerId != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, createOrderRequest.offerId);
                }
            }
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, createOrderRequest.type);
            vylVar.onExtraCallback(serialDescriptor, 1, createOrderRequest.sku);
            vylVar.onExtraCallback(serialDescriptor, 2, createOrderRequest.countryCode);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            }
        }
        int i3 = onExtraCallback + 87;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 39 / 0;
        }
    }
}
